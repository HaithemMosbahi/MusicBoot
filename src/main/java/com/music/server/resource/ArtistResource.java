package com.music.server.resource;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.music.server.model.Artist;
import com.music.server.model.ArtistDetail;
import com.music.server.service.ArtistService;

@RestController
@RequestMapping( "/app/" )
public class ArtistResource {
	
	@Autowired
	private ArtistService artistService;
	
    private static final Logger log = LoggerFactory.getLogger(ArtistResource.class);

	
	@RequestMapping("/artists")
	public List<Artist> getTopArtists(){
		 return artistService.findTopArtist();
		
	}
	
	@RequestMapping("/artist/{name}")
	public ArtistDetail getArtistDetail(@PathVariable String name){
		return artistService.getArtistDetail(name);
		
	}

}
