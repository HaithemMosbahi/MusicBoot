package com.music.client.components;

import com.music.client.components.service.ArtistService;
import com.music.client.components.viewmodel.Artist;

import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.interop.ng.core.EventEmitter;
import fr.lteconsulting.angular2gwt.client.interop.ng.core.OnInit;
import fr.lteconsulting.angular2gwt.ng.core.Component;
import fr.lteconsulting.angular2gwt.ng.core.Output;
import jsinterop.annotations.JsType;

@Component(
		selector = "top-artists",
		templateUrl = "top-artists.component.html",
		styles = "")
@JsType
public class TopArtistsComponent implements OnInit {

	public JsArray<Artist> artists = JsArray.empty();

	
	@Output
	public EventEmitter<Integer> choosen = new EventEmitter<>();

	

	private ArtistService artistService;

	public TopArtistsComponent( ArtistService heroService)
	{
		this.artistService = heroService;
	}

	@Override
	public void ngOnInit()
	{
		artistService.getTopArtists().then( recievedData -> this.artists = recievedData);
	    	
	}

	public void onChoosen( int itemIndex )
	{
		choosen.emit( itemIndex );
	}
	


}
