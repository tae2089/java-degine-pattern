package com.pattern.businessdelegate;

public class App {
    public static void main(String[] args) {
        var businessDelegate = new BusinessDelegate();
        var businessLookup = new BusinessLookup();
        businessLookup.setNetflixService(new NetflixService());
        businessLookup.setYouTubeService(new YoutubeService());
        businessDelegate.setLookupService(businessLookup);

        // create the client and use the business delegate
        var client = new MobileClient(businessDelegate);
        client.playbackMovie("Die Hard 2");
        client.playbackMovie("Maradona: The Greatest Ever");
    }
}
