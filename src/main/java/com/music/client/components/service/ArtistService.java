package com.music.client.components.service;

import com.google.gwt.core.client.GWT;
import com.music.client.components.viewmodel.Artist;

import fr.lteconsulting.angular2gwt.client.JSON;
import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsObject;
import fr.lteconsulting.angular2gwt.client.interop.ng.http.Headers;
import fr.lteconsulting.angular2gwt.client.interop.ng.http.Http;
import fr.lteconsulting.angular2gwt.client.interop.promise.Promise;
import fr.lteconsulting.angular2gwt.ng.core.Injectable;
import jsinterop.annotations.JsType;

@Injectable
@JsType
public class ArtistService
{
	private Http http;

	private static final String topArtistsUrl = "app/artists"; // URL to web api
	private static final String artistInfoUrl = "app/artist"; // URL to web api

	private static final Headers headers = new Headers();

	static
	{
		headers.append( "Content-Type", "application/json" );
	}

	public ArtistService( Http http )
	{
		this.http = http;
	}

	public Promise<JsArray<Artist>> getTopArtists()
	{
		return http.get( topArtistsUrl )
				.toPromise()
				.<JsArray<Artist>> then( response -> response.json() )
				.onCatch( this::handleError );
	}

	public Promise<Artist> getArtistInfo(String name )
	{
		return http.get(artistInfoUrl+"/"+name)
				.toPromise()
				.<Artist> then( response -> response.json() )
				.onCatch( this::handleError );
	}

	private Promise<?> handleError( Object error )
	{
		GWT.log( "An error occurred" + error ); // for demo purposes only
		return Promise.reject( error );
	}
}
