package com.utils;

import java.awt.*;

/**
 * Created by Talha on 5/15/2016.
 */
public class ScreenUtils {

    public static int getScreenHeight() {
        return (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
    }

    public static int getScreenWeight() {

        return (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();

    }

}
