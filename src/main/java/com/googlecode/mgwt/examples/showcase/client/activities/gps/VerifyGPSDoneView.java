/*
 * Copyright 2010 Daniel Kurka
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.googlecode.mgwt.examples.showcase.client.activities.gps;

import com.googlecode.mgwt.examples.showcase.client.activities.compass.*;
import com.google.gwt.user.client.ui.IsWidget;
import com.googlecode.gwtphonegap.client.compass.CompassCallback;
import com.googlecode.gwtphonegap.client.geolocation.GeolocationCallback;
import com.googlecode.mgwt.dom.client.event.tap.HasTapHandlers;

/**
 * @author Daniel Kurka
 * 
 */
public interface VerifyGPSDoneView extends IsWidget , GeolocationCallback{
	public HasTapHandlers getBackButton();

}
