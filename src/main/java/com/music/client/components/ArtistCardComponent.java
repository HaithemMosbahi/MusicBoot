package com.music.client.components;

import com.music.client.components.viewmodel.Artist;

import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.interop.ng.core.EventEmitter;
import fr.lteconsulting.angular2gwt.client.interop.ng.router.Router;
import fr.lteconsulting.angular2gwt.ng.core.Component;
import fr.lteconsulting.angular2gwt.ng.core.Input;
import fr.lteconsulting.angular2gwt.ng.core.Output;
import jsinterop.annotations.JsType;

@Component(selector = "artist-card", templateUrl = "artist-card.component.html", styles = "")
@JsType
public class ArtistCardComponent {
	
	@Input
	public Artist artist;

	@Output
	public EventEmitter<Void> choosen = new EventEmitter<>();
	
	private Router router;

	public ArtistCardComponent(Router router )
	{
		this.router = router;
	}

	public void choose() {
		choosen.emit(null);
	}

	
	public void gotoDetail()
	{
		router.navigate( JsArray.of( "/detail", String.valueOf( artist.name ) ) );
	}
}
