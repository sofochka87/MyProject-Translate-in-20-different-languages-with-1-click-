package test1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

public class Main {

	public static void main(String[] args){


         List<String> languages = new ArrayList<>(); 
		
		try (
		FileReader fr = new FileReader("Language.txt");
		BufferedReader br = new BufferedReader(fr); )
		{
		String line="";
		while ((line= br.readLine())!= null) {  //
			languages.add(line);  
			}
		}catch (IOException e) {  e.printStackTrace();  }
		
		Translate.translating(languages);
		
	}

}
