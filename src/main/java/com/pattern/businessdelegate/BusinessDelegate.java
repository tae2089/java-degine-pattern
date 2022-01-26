package com.pattern.businessdelegate;

import lombok.Setter;

@Setter
public class BusinessDelegate {


    private BusinessLookup lookupService;

    public void playbackMovie(String movie) {
        VideoStreamingService videoStreamingService = lookupService.getBusinessService(movie);
        videoStreamingService.doProcessing();
    }
}
