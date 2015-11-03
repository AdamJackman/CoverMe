import java.util.ArrayList;
import java.util.Map;

import com.CoverMe.parsers.SourceJSON;

/**
 * An implementation of Section for JSON source files
 * @author Adam Jackman
 *
 */
public class JSONSection extends RabinKarpSection {

	SourceJSON parser;

	public JSONSection(String source, String target){
		this.source = source + ".JSON";
		this.target = target;
		parser = new SourceJSON(source);
	}
	
	/*
	 * Parse the JSON into the map
	 * @see Section#createSearchMap()
	 */
	@Override
	public void createSearchMap() {
		searchMap = parser.getJSONAsMap();		
	}

	@Override
	public void createSearchList() {
		searchList = new ArrayList<String>();
		for (Map.Entry<String, String> entry : searchMap.entrySet()) {
		    searchList.add(entry.getKey());
		}			
	}

}
