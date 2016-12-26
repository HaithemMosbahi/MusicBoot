package com.music.client.components;

import fr.lteconsulting.angular2gwt.ng.core.Component;
import jsinterop.annotations.JsType;

@Component(
		selector = "dashboard",
		template = "<h1 class='noGrow'>{{title}}</h1>"
			    + "  <top-artists>"
				+ " </top-artists>",
		styleUrls = "ApplicationComponent.css" )
@JsType
public class DashboardComponent
{
	public String title = "Top 50 Arists";

	
}
