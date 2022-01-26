package com.pattern.businessdelegate;

import lombok.Setter;

import java.util.Locale;

@Setter
public class BusinessLookup {
    private NetflixService netflixService;

    private YoutubeService youTubeService;

    /**
     * Gets service instance based on given movie search string.
     *
     * @param movie Search string for the movie.
     * @return Service instance.
     */
    public VideoStreamingService getBusinessService(String movie) {
        if (movie.toLowerCase(Locale.ROOT).contains("die hard")) {
            return netflixService;
        } else {
            return youTubeService;
        }
    }
}
