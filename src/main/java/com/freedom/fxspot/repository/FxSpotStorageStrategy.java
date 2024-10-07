package com.freedom.fxspot.repository;

import com.freedom.fxspot.model.FXSpot;

import java.util.List;

public interface FxSpotStorageStrategy {

    void addFxSpot(FXSpot fxSpot);
    List<FXSpot> getFxSpotsByCurrencyPair(String currency1, String currency2);
}
