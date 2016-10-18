package com.ui;


import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.*;

import java.io.Console;

/**
 * Created by Click Chain on 9/12/2016.
 */
public class MainUi extends UI {
    @Override
    protected void init(VaadinRequest request) {

        VerticalLayout layout = new VerticalLayout();
        Button btn = new Button("Name");

        btn.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent event) {
                Notification.show("Sharm kar");
            }
        });

        layout.addComponent(new Label("Bitch"));
        layout.addComponent(btn);
//        createButton();

        setContent(layout);
    }

    public void createButton(){


    }
}
