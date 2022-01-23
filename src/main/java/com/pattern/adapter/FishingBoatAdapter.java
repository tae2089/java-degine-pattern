package com.pattern.adapter;

public class FishingBoatAdapter implements  RowingBoat{

    private FishingBoat fishingBoat;

    public FishingBoatAdapter() {
        fishingBoat = new FishingBoat();
    }

    @Override
    public void row() {
        fishingBoat.sail();
    }
}
