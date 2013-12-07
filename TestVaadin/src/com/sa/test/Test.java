package com.sa.test;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;


import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;


//Deneme
@Title("Hello Window")
public class Test extends UI {
    @Override
    protected void init(VaadinRequest request) {
        // Create the content root layout for the UI
        VerticalLayout content = new VerticalLayout();
        setContent(content);

        // Display the greeting
        content.addComponent(new Label("Hello World!"));
    }
   
}



