package com.music.client.components;

import com.music.client.components.service.ArtistService;
import com.music.client.components.viewmodel.Artist;

import fr.lteconsulting.angular2gwt.client.interop.ng.core.OnInit;
import fr.lteconsulting.angular2gwt.client.interop.ng.router.ActivatedRoute;
import fr.lteconsulting.angular2gwt.ng.core.Component;
import jsinterop.annotations.JsType;

@Component(selector = "artist", templateUrl = "artist.detail.component.html",styleUrls="artist.detail.component.css")
@JsType
public class ArtistDetailComponent implements OnInit {
	
	public Artist artist = new Artist();
	
	private ArtistService artistService;
	private ActivatedRoute route;

	public ArtistDetailComponent( ArtistService heroService,ActivatedRoute router)
	{
		this.artistService = heroService;
		this.route = router;

	}
	
	@Override
	public void ngOnInit()
	{
		route.params.forEach( params -> {
			String value = params.get( "id" );
			if( value != null )
			{
				artistService.getArtistInfo( value ).then( recievedData -> this.artist = recievedData );
			}
			else
			{
				artist = new Artist();
			}
		} );
	}

}
