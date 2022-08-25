package com.dbs.controller;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;






import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/receiver")
public class RecevierController {

	@GetMapping("/{name}")
	public boolean isReceiverExists(@PathVariable String name) {
/*		String fileName="C:\\Users\\Administrator\\Desktop\\DBS-main\\DBS-main\\Payment-Project\\backend\\sdnlist.txt";
		
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
	           List<String> list=stream.filter(lines -> (lines.toUpperCase()).contains(name.toUpperCase()))
	           .collect(Collectors.toList());
	        	   
	          if(list.size()>0)
	        	  return true;

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		return false;*/
		int count=0;
		try {
		
		File f1=new File("C:\\Users\\Administrator\\Desktop\\DBS-main\\DBS-main\\Payment-Project\\backend\\sdnlist.txt"); //Creation of File Descriptor for input file
	      String[] words=null;  //Intialize the word Array
	      FileReader fr = new FileReader(f1);  //Creation of File Reader object
	      BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object
	      String s;     
	      String input="Java";   // Input word to be searched
	       //Intialize the word to zero
	      while((s=br.readLine())!=null)   //Reading Content from the file
	      {
	         words=s.split(" ");  //Split the word using space
	          for (String word : words) 
	          {
	                 if (word.equals(input))   //Search for the given word
	                 {
	                   count++;    //If Present increase the count by one
	                 }
	          }
	      }
	      }
		catch(Exception e){
			System.out.println("jbadjd"+e);
		}
	      if(count!=0)  //Check for count not equal to zero
	      {
	         return false;
	      }
	      else
	      {
	         return true;
	      }

	      
	       
		
	}
}
