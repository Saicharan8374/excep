package com.ram.demo;

import java.util.Scanner;

/**
 * Hello world!
 *
 */

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
	private static final Logger LOGGER=LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        LOGGER.info( "Hello World!" );
        Scanner sc=new  Scanner(System.in);
    	LOGGER.info("Enter materialtype\n");
    	String materialtype=sc.nextLine();
    	int cost;
    	LOGGER.info("Enter totalareaofhouse\n");
    	int totalareaofhouse=sc.nextInt();
    	LOGGER.info("Enter full automated home or not\n");
    	String answer=sc.next();
    	if("standard".equals(materialtype)){
    	cost=1200*totalareaofhouse;
    	   LOGGER.info(cost);
    	}
    	else if("above standard".equals(materialtype)){
    	cost=1500*totalareaofhouse;
    	   LOGGER.info(cost);
    	}
    	else if("high standard".equals(materialtype)){
    	  if("yes".equals(answer)){
    	    cost=2500*totalareaofhouse;
    	   LOGGER.info(cost);
    	         }
    	   else{
    	   cost=1800*totalareaofhouse;
    	   LOGGER.info(cost);
    	       }
    	 }
    	else{
    	LOGGER.info("Enter correct type of material standards");
    	}
    	System.exit(0);
    	}
    

      


    }