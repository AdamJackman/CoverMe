import java.util.ArrayList;
import java.util.Map;


abstract class RabinKarpSection implements Section {

	protected String source;
	protected String target;
	
	protected Map<String, String> searchMap; 
	protected ArrayList<String> searchList;
	
	@Override
	public String getParagraph() {
		createSearchMap();
		createSearchList();
		ArrayList<String> matches = findMatches();
		//Create the text from the match values of the searchMap
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<matches.size(); i++){
			String text = searchMap.get(matches.get(i));
			sb.append(text);
		}
		//return the paragraph
		return sb.toString();
	}

	/*
	 * Parse the input into the map
	 * @see Section#createSearchMap()
	 */
	public abstract void createSearchMap();
		
	/*
	 * Use the map to create an ArrayList of the keys
	 * @see Section#createSearchList()
	 */
	public abstract void createSearchList();

	/**
	 * This RabinKarpSection uses a Rabin Karp Search algorithm to find matches in the page.
	 * The Search algorithm is handled by the HTMLSearcher class
	 */
	@Override
	public ArrayList<String> findMatches() {
		HTMLSearcher searcher = new HTMLSearcher(target, searchList); 
		return searcher.search();
	}

}
