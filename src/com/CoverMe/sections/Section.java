package com.CoverMe.sections;
import java.util.ArrayList;

public interface Section {
	
	/**
	 * This function is used to create the paragraph for a section
	 * It will call all of the necessary methods.
	 * @return paragraph in a String
	 */
	public String getParagraph();
	
	/**
	 * This method will be used to convert the input file into a Map
	 * that will be used to output the text for any results.
	*/
	public void createSearchMap();
	
	/**
	 * This method is used to create the search list that will be used
	 * as input into the set searcher
	 */
	public void createSearchList();

	/**
	 * returns an ArrayList of all the Strings in the search list that are found on the source 
	 * @return arrayList of matches in the target
	 */
	public ArrayList<String> findMatches();
	
}
