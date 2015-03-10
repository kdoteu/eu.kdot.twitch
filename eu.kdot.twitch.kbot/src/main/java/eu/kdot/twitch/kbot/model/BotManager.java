/**
 * 
 */
package eu.kdot.twitch.kbot.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kdot
 *
 */
public class BotManager {
	
	private List<Bot> bots;
	
	public BotManager() {
		bots = new ArrayList<Bot>();
	}
	
	public void addBot(BotConfiguration configuration){
		getBots().add(new Bot(configuration));
	}

	/**
	 * @return the bots
	 */
	public List<Bot> getBots() {
		return bots;
	}
	
	
}
