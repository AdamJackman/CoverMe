/**
 * An implementation of Section for JSON source files
 * @author Adam Jackman
 *
 */
public class JSONSection extends RabinKarpSection {


	public JSONSection(String source, String target){
		this.source = source + ".JSON";
		this.target = target;
	}
	
	/*
	 * Parse the JSON into the map
	 * @see Section#createSearchMap()
	 */
	@Override
	public void createSearchMap() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createSearchList() {
		// TODO Auto-generated method stub
		
	}

}
