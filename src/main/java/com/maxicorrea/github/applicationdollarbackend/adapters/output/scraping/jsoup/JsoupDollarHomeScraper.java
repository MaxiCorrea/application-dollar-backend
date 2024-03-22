package com.maxicorrea.github.applicationdollarbackend.adapters.output.scraping.jsoup;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import com.maxicorrea.github.applicationdollarbackend.application.ports.output.RetriveHomeOutputPort;
import com.maxicorrea.github.applicationdollarbackend.common.Scrapper;
import com.maxicorrea.github.applicationdollarbackend.domain.Dollar;
import com.maxicorrea.github.applicationdollarbackend.domain.Price;

@Scrapper
public class JsoupDollarHomeScraper implements RetriveHomeOutputPort {

  @Override
  public List<Dollar> execute() {
    try {
      Document doc = Jsoup.connect("https://dolarhoy.com/").get();
      Element main = doc.getElementById("main_body ");
      Elements tiles = main.getElementsByClass("tile is-child");
      List<Dollar> dollars = new ArrayList<>();
      for(Element e : tiles) {
        if(!e.getElementsByClass("title").isEmpty()) {
          Elements title = e.getElementsByClass("title");
          Dollar dollar = new Dollar();
          dollar.setName(title.text());
          for(Element v : e.getElementsByClass("values")) {
            for(Element x : v.getElementsByClass("compra")) {
              String text = x.getElementsByClass("val").text();
              dollar.setValuePurchase(new Price(text));
            }
            for(Element x : v.getElementsByClass("venta")) {
              String text = x.getElementsByClass("val").text();
              dollar.setValueSale(new Price(text));
            }
          }
          dollars.add(dollar);
        }
      }
      return dollars;
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
 
}
