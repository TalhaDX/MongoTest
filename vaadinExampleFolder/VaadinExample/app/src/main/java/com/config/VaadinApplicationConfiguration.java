package com.config;

import com.ui.MainUi;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinServlet;

import javax.servlet.annotation.WebServlet;

/**
 * Created by Click Chain on 9/12/2016.
 */
@WebServlet(value = "/*")
@VaadinServletConfiguration(productionMode = false, ui = MainUi.class)
public class VaadinApplicationConfiguration extends VaadinServlet {
}