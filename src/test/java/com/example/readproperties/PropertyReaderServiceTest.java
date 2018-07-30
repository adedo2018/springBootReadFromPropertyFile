package com.example.readproperties;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import com.example.readproperties.service.PropertyReaderService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = PropertyReaderService.class)
public class PropertyReaderServiceTest {

  @Autowired
  private PropertyReaderService propertyReaderService;

  @Test
  public void whenServiceAgeRequested_ShouldReturn12(){
    assertEquals(12,propertyReaderService.getServerAgeFromPropertyFile());
    assertNotEquals(13,propertyReaderService.getServerAgeFromPropertyFile());
  }

  @Test
  public void whenServiceNameRequested_ShouldReturnFred(){
    assertEquals("fred",propertyReaderService.getServerNameFromPropertyFile());
  }
}
