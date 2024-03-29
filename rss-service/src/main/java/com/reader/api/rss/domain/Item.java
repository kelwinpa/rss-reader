package com.reader.api.rss.domain;

public class Item {
	private Enclosure enclosure;

	private String link;

	private String description;

	private String title;

	private String pubDate;

	public Enclosure getEnclosure() {
		return enclosure;
	}

	public void setEnclosure(Enclosure enclosure) {
		this.enclosure = enclosure;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPubDate() {
		return pubDate;
	}

	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}

	@Override
	public String toString() {
		return "ClassPojo [enclosure = " + enclosure + ", link = " + link + ", description = " + description
				+ ", title = " + title + ", pubDate = " + pubDate + "]";
	}
}
