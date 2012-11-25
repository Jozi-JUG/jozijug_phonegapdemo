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
package com.googlecode.mgwt.examples.showcase.client;

import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;
import com.googlecode.gwtphonegap.client.compass.CompassCallback;
import com.googlecode.gwtphonegap.client.compass.CompassWatcher;
import com.googlecode.gwtphonegap.client.geolocation.GeolocationCallback;
import com.googlecode.gwtphonegap.client.geolocation.GeolocationOptions;
import com.googlecode.gwtphonegap.client.geolocation.GeolocationWatcher;
import com.googlecode.mgwt.examples.showcase.client.activities.AboutView;
import com.googlecode.mgwt.examples.showcase.client.activities.ShowCaseListView;
import com.googlecode.mgwt.examples.showcase.client.activities.UIView;
import com.googlecode.mgwt.examples.showcase.client.activities.testphonegap.TestPhoneGapView;
import com.googlecode.mgwt.examples.showcase.client.activities.compass.VerifyCompassDoneView;
import com.googlecode.mgwt.examples.showcase.client.activities.carousel.CarouselView;
import com.googlecode.mgwt.examples.showcase.client.activities.elements.ElementsView;
import com.googlecode.mgwt.examples.showcase.client.activities.forms.FormsView;
import com.googlecode.mgwt.examples.showcase.client.activities.gps.VerifyGPSDoneView;

/**
 * @author Daniel Kurka
 *
 */
public interface ClientFactory {

    public ShowCaseListView getHomeView();

    public EventBus getEventBus();

    public PlaceController getPlaceController();

    /**
     * @return
     */
    public UIView getUIView();

    public AboutView getAboutView();

    public TestPhoneGapView getAnimationView();

    public VerifyCompassDoneView getVerifyCompassDoneView();

    public ElementsView getElementsView();

    public CarouselView getCarouselHorizontalView();

    public FormsView getFormsView();

    public CompassWatcher watchHeading(CompassCallback callBack);

    public void clearWatchHeading(CompassWatcher watcher);

    public VerifyGPSDoneView getVerifyGPSView();

    public GeolocationWatcher watchGPS(GeolocationCallback callBack);

    public void clearWatchGPS(GeolocationWatcher watcher);
}
