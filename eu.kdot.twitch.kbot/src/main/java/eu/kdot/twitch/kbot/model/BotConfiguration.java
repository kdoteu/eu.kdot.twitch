package eu.kdot.twitch.kbot.model;

public class BotConfiguration {
	
	private String name;
	private String serverHostname;
	private Integer serverPort;
	private String serverPasswort;
	private String autoJoinChannel;
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the serverHostname
	 */
	public String getServerHostname() {
		return serverHostname;
	}
	/**
	 * @param serverHostname the serverHostname to set
	 */
	public void setServerHostname(String serverHostname) {
		this.serverHostname = serverHostname;
	}
	/**
	 * @return the serverPort
	 */
	public Integer getServerPort() {
		return serverPort;
	}
	/**
	 * @param serverPort the serverPort to set
	 */
	public void setServerPort(Integer serverPort) {
		this.serverPort = serverPort;
	}
	/**
	 * @return the serverPasswort
	 */
	public String getServerPasswort() {
		return serverPasswort;
	}
	/**
	 * @param serverPasswort the serverPasswort to set
	 */
	public void setServerPasswort(String serverPasswort) {
		this.serverPasswort = serverPasswort;
	}
	/**
	 * @return the autoJoinChannel
	 */
	public String getAutoJoinChannel() {
		return autoJoinChannel;
	}
	/**
	 * @param autoJoinChannel the autoJoinChannel to set
	 */
	public void setAutoJoinChannel(String autoJoinChannel) {
		this.autoJoinChannel = autoJoinChannel;
	}
	
	

}
