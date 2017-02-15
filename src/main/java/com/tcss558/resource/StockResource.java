/**
 * AOL CONFIDENTIAL INFORMATION
 *
 * Date: Feb 14, 2017
 *
 * Copyright 2017 AOL, Inc.
 *
 * All Rights Reserved.  Unauthorized reproduction, transmission, or
 * distribution of this software is a violation of applicable laws.
 */
package com.tcss558.resource;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author iestrera <inno.estrera@teamaol.com>
 */
@RestController
@RequestMapping(value = "/v1/api/stocks", produces = APPLICATION_JSON_VALUE)
public class StockResource {

  @GetMapping(value = "/{id}")
  public ResponseEntity getStocks() {
    return ResponseEntity.ok().body("{\"Hello\": \"Stocks!\"}");
  }

}
