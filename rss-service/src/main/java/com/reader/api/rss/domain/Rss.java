package com.reader.api.rss.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="rss")
@XmlAccessorType(XmlAccessType.FIELD)
public class Rss {
	
	private Channel channel;

	private String version;

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "ClassPojo [channel = " + channel + ", version = " + version + "]";
	}
}
