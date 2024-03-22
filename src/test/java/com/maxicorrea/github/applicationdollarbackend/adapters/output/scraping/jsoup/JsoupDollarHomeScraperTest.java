package com.maxicorrea.github.applicationdollarbackend.adapters.output.scraping.jsoup;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.List;
import org.junit.jupiter.api.Test;
import com.maxicorrea.github.applicationdollarbackend.domain.Dollar;

class JsoupDollarHomeScraperTest {

  @Test
  void shouldGetTheListOfDollars() {
    JsoupDollarHomeScraper dollarHomeScraper = new JsoupDollarHomeScraper();
    List<Dollar> dollars = dollarHomeScraper.execute();
    assertNotNull(dollars,"The list of dollars should not be null");
    assertFalse(dollars.isEmpty(),"The list of dollars should not be empty");
  }

}
