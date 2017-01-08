package com.music.client.components;

import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsObject;
import fr.lteconsulting.angular2gwt.client.interop.ng.ProviderWrapper;
import fr.lteconsulting.angular2gwt.client.interop.ng.router.RouterConfig;
import fr.lteconsulting.angular2gwt.client.interop.ng.router.RouterModule;

public class Routes implements ProviderWrapper
{
	@Override
	public Object get()
	{
		return RouterModule.forRoot( JsArray.of(
				RouterConfig.route(
						"",
						"/dashboard",
						"full" ),
				RouterConfig.route(
						"artists",
						TopArtistsComponent_AngularComponent.getComponentPrototype() ),
				RouterConfig.route(
						"dashboard",
						DashboardComponent_AngularComponent.getComponentPrototype() ),
				RouterConfig.route( 
						"detail/:id", 
						ArtistDetailComponent_AngularComponent.getComponentPrototype() ),
				RouterConfig.route( 
						"about", 
						AboutComponent_AngularComponent.getComponentPrototype() )),
				
				new JsObject().set( "useHash", true ) );
	}
}
