package com.pattern.businessdelegate;

public class MobileClient {

    private BusinessDelegate businessDelegate;


    public MobileClient(BusinessDelegate businessDelegate) {
        this.businessDelegate = businessDelegate;
    }


    public void playbackMovie(String movie) {
        businessDelegate.playbackMovie(movie);
    }
}
