package com.CoverMe.parsers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.json.JSONObject;

public class SourceJSON {

	private static final String BASE = "src/com/CoverMe/inputFiles/";
	private String inputFile;
	
	public SourceJSON(){
		inputFile = BASE + "sample.JSON";
	}
	
	public SourceJSON(String source){
		inputFile = BASE + source;
	}	
	
	/**
	 * Transform the file read into a string
	 * @return String of the file
	 */
	public String getJSONAsString(){
		try{
			File input = new File(inputFile);
	    	InputStream stream = new FileInputStream(input);  	    	    	
	    	BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
	    	//we can now read lines
	        StringBuilder jsonString = new StringBuilder();
	        String curr;
	        while ((curr = reader.readLine()) != null) {
	            jsonString.append(curr);
	        }
	        reader.close();
	        return jsonString.toString();	        
		} catch (Exception e){
			return null;
		}        
	}
	
	/**
	 * Will create the Map for the JSON from the source provided
	 * @return
	 */
	public Map<String, String> getJSONAsMap(){
		try{
			//Get the String of the Json
			String jsonString = getJSONAsString();
			//Convert the string to a JSONObject
			JSONObject json = new JSONObject(jsonString);
	        
			//Map the JSON Object into a HashMap
	        Iterator<?> keys = json.keys();
	        Map<String, String> flowControl = new HashMap<String, String>();        
	        while( keys.hasNext() ) {
	            String key = (String)keys.next();
	            String val = (String)json.get(key);
	            flowControl.put(key, val);
	        }
	        return flowControl;
	        
		} catch (Exception e){
			return null;
		}					
	}
	
}
