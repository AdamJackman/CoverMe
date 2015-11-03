package com.CoverMe.main;

import com.CoverMe.sections.JSONSection;
import com.CoverMe.sections.Section;

public class CoverMe {
	
	public String inputSections;
	public String target;
	
	public StringBuilder sb;	
	
	public String standardSections = "introduction,languages,webtech,database,mobile,version,ending,signature";
	public String personalizedSections = "introduction,personalized,languages,webtech,database,mobile,version,ending,signature";
	public String paragraphEnding = "\n";
	public String seperator = ",";
	
	public CoverMe(String target){
		this.target = target;
		inputSections = standardSections;		
		sb = new StringBuilder();
	}
	
	public CoverMe(String target, String inputSections){
		this.target = target;
		this.inputSections = inputSections;
		sb = new StringBuilder();
	}
	
	/**
	 * Creates the 
	 * @return
	 */
	public String buildLetter(){
		String[] sections = inputSections.split(seperator);
		for(int i=0; i<sections.length; i++){
			//TODO: reflection? Factory?
			Section sect = new JSONSection(sections[i], target);
			String paragraph = sect.getParagraph();
			if(!paragraph.equals("")){
				sb.append(paragraph);
				sb.append(paragraphEnding);	
			}						
		}
		return sb.toString();
	}
					
}
