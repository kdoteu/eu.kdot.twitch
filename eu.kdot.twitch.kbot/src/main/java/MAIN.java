import java.io.IOException;

import org.pircbotx.exception.IrcException;

import eu.kdot.twitch.kbot.model.Bot;
import eu.kdot.twitch.kbot.model.BotConfiguration;
import eu.kdot.twitch.kbot.model.BotManager;

/**
 * 
 */

/**
 * @author kdot
 *
 */
public class MAIN {

	/**
	 * @param args
	 * @throws IrcException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException, IrcException {
		BotConfiguration conf = new BotConfiguration();
		conf.setName("kboteu");
        conf.setServerHostname("irc.twitch.tv");
        conf.setServerPort(6667);
        conf.setServerPasswort(args[0]);
        conf.setAutoJoinChannel("#kleeneele");
        
        BotManager manger = new BotManager();
        
        manger.addBot(conf);
        
        for (Bot bot : manger.getBots()) {
			bot.getPircBot().startBot();
		}
	}

}
