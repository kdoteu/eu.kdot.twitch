/**
 * 
 */
package eu.kdot.twitch.kbot.model;

import org.pircbotx.Configuration;
import org.pircbotx.PircBotX;

import eu.kdot.twitch.kbot.listener.BotListener;

/**
 * @author kdot
 *
 */
public class Bot {
	
	private final BotConfiguration botConfiguration;
	private PircBotX pircBot;
	
	public Bot(BotConfiguration botConfiguration) {
		this.botConfiguration = botConfiguration;
	}

	/**
	 * @return the pircBot
	 */
	public PircBotX getPircBot() {
		if(pircBot == null){
			generateBot();
		}
		return pircBot;
	}

	private void generateBot() {
		Configuration<PircBotX> configuration = new Configuration.Builder()
        .setName(getBotConfiguration().getName()) //Set the nick of the bot. CHANGE IN YOUR CODE
        .setServerHostname(getBotConfiguration().getServerHostname()) //Join the freenode network
        .setServerPort(getBotConfiguration().getServerPort())
        .setServerPassword(getBotConfiguration().getServerPasswort())
        .addAutoJoinChannel(getBotConfiguration().getAutoJoinChannel()) //Join the official #pircbotx channel
        .addListener(new BotListener()) //Add our listener that will be called on Events
        .buildConfiguration();
		
		pircBot = new PircBotX(configuration);
	}

	/**
	 * @return the botConfiguration
	 */
	public BotConfiguration getBotConfiguration() {
		return botConfiguration;
	}
	
	

}
