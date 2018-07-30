package com.example.readproperties.controller;

import com.example.readproperties.service.PropertyReaderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PropertyReader {

  @Autowired
  private PropertyReaderService propertyReaderService;

  @GetMapping("/age")
  public int getServerAge(){
    return propertyReaderService.getServerAgeFromPropertyFile();
  }

  @GetMapping("/name")
  public String getServerName(){
    return propertyReaderService.getServerNameFromPropertyFile();
  }



}
