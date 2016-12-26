package com.music.server.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ArtistDetail {
	
	private String name;
	private String url;
	private List<Artist> similarArtist;
	private List<Tag> genreTags;
	private String listeners;
	private String playcount;
	private String bioSummary;
	private String bioContent;
	private String ontour;
	private String streamable;
	private List<ArtistImage> image;	
    private String largeImage;

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getListeners() {
		return listeners;
	}
	public void setListeners(String listeners) {
		this.listeners = listeners;
	}
	public String getPlaycount() {
		return playcount;
	}
	public void setPlaycount(String playcount) {
		this.playcount = playcount;
	}
	public String getBioSummary() {
		return bioSummary;
	}
	public void setBioSummary(String bioSummary) {
		this.bioSummary = bioSummary;
	}
	public String getBioContent() {
		return bioContent;
	}
	public void setBioContent(String bioContent) {
		this.bioContent = bioContent;
	}
	public String getOntour() {
		return ontour;
	}
	public void setOntour(String ontour) {
		this.ontour = ontour;
	}
	public String getStreamable() {
		return streamable;
	}
	public void setStreamable(String streamable) {
		this.streamable = streamable;
	}
	public List<ArtistImage> getImage() {
		return image;
	}
	public void setImage(List<ArtistImage> image) {
		this.image = image;
	}
	public String getLargeImage() {
		return largeImage;
	}
	public void setLargeImage(String largeImage) {
		this.largeImage = largeImage;
	}
	public List<Artist> getSimilarArtist() {
		return similarArtist;
	}
	public void setSimilarArtist(List<Artist> similarArtist) {
		this.similarArtist = similarArtist;
	}
	public List<Tag> getGenreTags() {
		return genreTags;
	}
	public void setGenreTags(List<Tag> genreTags) {
		this.genreTags = genreTags;
	}
	
	

}
