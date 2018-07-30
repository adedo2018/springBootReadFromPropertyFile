package com.example.readproperties.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PropertyReaderService {

  @Value("#{new Integer('${fred.age}')}")
  private int serverAge;

  @Value("${fred.name}")
  private String serverName;

  public int getServerAgeFromPropertyFile(){
    return serverAge;
  }

  public String getServerNameFromPropertyFile(){
    return serverName;
  }

}
