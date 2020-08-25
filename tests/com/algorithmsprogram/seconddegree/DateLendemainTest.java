package com.algorithmsprogram.seconddegree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateLendemainTest {
   @Test
   public void getTomorrow(){
      DateLendemain dateLendemain= new DateLendemain();
      int day =1;
      int month=1;
      int year=2014;
      assertEquals("1 janvier 2014",dateLendemain.getTomorrow(day,month,year));

   }
   @Test
   public void getDateTests(){
      DateLendemain dateLendemain= new DateLendemain();
      int month=12;
      assertEquals("Decembre",dateLendemain.getDate(month));
   }
   @Test
   public void bisextileTest(){
      DateLendemain dateLendemain= new DateLendemain();
      int year=1900;
      assertEquals(true,dateLendemain.Bisextile(year));
   }
   @Test
   public void dateValideTests(){
      DateLendemain dateLendemain= new DateLendemain();
      int day =1;
      int month=1;
      int year=1500;
      assertEquals(true,dateLendemain.dateValid(day,month,year));
   }
}