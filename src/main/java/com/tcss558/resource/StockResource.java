/**
 * CONFIDENTIAL INFORMATION
 *
 * All Rights Reserved.  Unauthorized reproduction, transmission, or
 * distribution of this software is a violation of applicable laws.
 *
 * Date: Feb 15, 2017
 * Copyright 2017 innoirvinge@gmail.com
 */
package com.tcss558.resource;

import static com.google.common.collect.Lists.newArrayList;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tcss558.domain.Stock;
import io.swagger.annotations.ApiOperation;

import java.util.List;

/**
 * @author irving09 <innoirvinge@gmail.com>
 */
@RestController
@RequestMapping(value = "/v1/api/stocks", produces = APPLICATION_JSON_VALUE)
public class StockResource {

  @GetMapping(value = "/{id}")
  @ApiOperation(
      value = "Gets the stocks dough",
      notes = "Some random stuff dough",
      response = Stock.class,
      responseContainer = "List"
  )
  public ResponseEntity getStocks() {
    return ResponseEntity.ok().body(dummyStocks());
  }

  private List<Stock> dummyStocks() {
    return newArrayList(
        Stock.builder()
            .id(123)
            .name("Apple")
            .value(456L)
            .build(),
        Stock.builder()
            .id(456)
            .name("Facebook")
            .value(789L)
            .build()
    );
  }

}
