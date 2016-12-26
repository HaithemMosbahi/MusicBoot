package com.music.client.components.viewmodel;

import jsinterop.annotations.JsType;

@JsType
public class ArtistImage {
   
	public String url;
	public String size;
    
    
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
    
    
}
