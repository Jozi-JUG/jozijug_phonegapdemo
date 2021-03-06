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
package org.openrap.jozijug.mgwtphonegap.client.activities.elements;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

import org.openrap.jozijug.mgwtphonegap.client.ClientFactory;
import org.openrap.jozijug.mgwtphonegap.client.DetailActivity;

/**
 * @author Daniel Kurka
 *
 */
public class ElementsActivity extends DetailActivity {

    private final ClientFactory clientFactory;

    public ElementsActivity(ClientFactory clientFactory) {
        super(clientFactory.getElementsView(), "nav");
        this.clientFactory = clientFactory;

    }

    @Override
    public void start(AcceptsOneWidget panel, EventBus eventBus) {
        super.start(panel, eventBus);
        ElementsView view = clientFactory.getElementsView();
        view.getMainButtonText().setText("Nav");
        view.getBackbuttonText().setText("UI");
        view.getHeader().setText("Elements");

        panel.setWidget(view);
    }
}
