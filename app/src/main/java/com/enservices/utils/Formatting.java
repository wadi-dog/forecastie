package com.enservices.utils;

import android.content.Context;

import com.enservices.utils.formatters.WeatherFormatter;

public class Formatting {

    private Context context;

    public Formatting(Context context) {
        this.context = context;
    }

    public String getWeatherIcon(int actualId, boolean isDay) {
        return WeatherFormatter.getWeatherIconAsText(actualId, isDay, context);
    }
}
