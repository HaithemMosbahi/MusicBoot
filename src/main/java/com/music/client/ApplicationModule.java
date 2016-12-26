package com.music.client;

import com.music.client.components.ApplicationComponent;
import com.music.client.components.ArtistCardComponent;
import com.music.client.components.ArtistDetailComponent;
import com.music.client.components.DashboardComponent;
import com.music.client.components.NavigationComponent;
import com.music.client.components.Routes;
import com.music.client.components.TopArtistsComponent;
import com.music.client.components.service.ArtistService;

import fr.lteconsulting.angular2gwt.client.interop.ng.http.HttpModule;
import fr.lteconsulting.angular2gwt.client.interop.ng.platformBrowser.BrowserModule;
import fr.lteconsulting.angular2gwt.ng.core.NgModule;
import jsinterop.annotations.JsType;

@NgModule(
		imports ={ BrowserModule.class,
				  HttpModule.class,
				  Routes.class },
		declarations = {
				ApplicationComponent.class,
				DashboardComponent.class,
				TopArtistsComponent.class,
				ArtistCardComponent.class,
				ArtistDetailComponent.class,
				NavigationComponent.class
		},
		providers={
				ArtistService.class
		},
		entryComponents = {
				TopArtistsComponent.class,
				ArtistDetailComponent.class,
				DashboardComponent.class
		},
		bootstrap = ApplicationComponent.class )
@JsType
public class ApplicationModule
{
}
