/**
 * 
 */
package eu.kdot.twitch.kbot.listener;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.pircbotx.PircBotX;
import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.events.MessageEvent;
import org.pircbotx.hooks.types.GenericMessageEvent;

/**
 * @author kdot
 *
 */
public class BotListener extends ListenerAdapter<PircBotX> {
	

	@Override
	public void onMessage(MessageEvent<PircBotX> event) throws Exception {
		Logger.getAnonymousLogger().log(Level.INFO,"onMessage "+ event.getMessage());
		super.onMessage(event);
	}
	
	@Override
	public void onGenericMessage(GenericMessageEvent<PircBotX> event)
			throws Exception {
		Logger.getAnonymousLogger().log(Level.INFO,"chat "+ event.getMessage());
        if (event.getMessage().startsWith("?helloworld"))
                event.respond("Hello world! "+ event.getUser().getNick());
	}
}