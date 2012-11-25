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

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.googlecode.mgwt.examples.showcase.client.activities.AboutActivity;
import com.googlecode.mgwt.examples.showcase.client.activities.AboutPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.ShowCaseListActivity;
import com.googlecode.mgwt.examples.showcase.client.activities.UIActivity;
import com.googlecode.mgwt.examples.showcase.client.activities.UIPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.testphonegap.TestPhoneGapActivity;
import com.googlecode.mgwt.examples.showcase.client.activities.testphonegap.TestPhoneGapPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.compass.CompassFunctionalityVerfiedActivity;
import com.googlecode.mgwt.examples.showcase.client.activities.compass.VerifyCompassPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.carousel.CarouselActivity;
import com.googlecode.mgwt.examples.showcase.client.activities.carousel.CarouselPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.elements.ElementsActivity;
import com.googlecode.mgwt.examples.showcase.client.activities.elements.ElementsPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.forms.FormsActivity;
import com.googlecode.mgwt.examples.showcase.client.activities.forms.FormsPlace;
import com.googlecode.mgwt.examples.showcase.client.activities.gps.GPSFunctionalityVerfiedActivity;
import com.googlecode.mgwt.examples.showcase.client.activities.gps.VerifyGPSPlace;
import com.googlecode.mgwt.examples.showcase.client.places.HomePlace;

/**
 * @author Daniel Kurka
 *
 */
public class PhoneActivityMapper implements ActivityMapper {

    private final ClientFactory clientFactory;

    public PhoneActivityMapper(ClientFactory clientFactory) {
        this.clientFactory = clientFactory;
    }

    @Override
    public Activity getActivity(Place place) {
        if (place instanceof HomePlace) {
            return new ShowCaseListActivity(clientFactory);
        }

        if (place instanceof UIPlace) {
            return new UIActivity(clientFactory);
        }

        if (place instanceof AboutPlace) {
            return new AboutActivity(clientFactory);
        }

        if (place instanceof TestPhoneGapPlace) {
            return new TestPhoneGapActivity(clientFactory);
        }



        if (place instanceof ElementsPlace) {
            return new ElementsActivity(clientFactory);
        }

        if (place instanceof FormsPlace) {
            return new FormsActivity(clientFactory);
        }







        if (place instanceof CarouselPlace) {
            return new CarouselActivity(clientFactory);
        }

        if (place instanceof VerifyGPSPlace) {
            return new GPSFunctionalityVerfiedActivity(clientFactory);
        }

        if (place instanceof VerifyCompassPlace) {
            return new CompassFunctionalityVerfiedActivity(clientFactory);
        }
        return new ShowCaseListActivity(clientFactory);
    }
}
