package com.freedom.fxspot.repository.impl;

import com.freedom.fxspot.model.FXSpot;
import com.freedom.fxspot.repository.FxSpotStorageStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InMemoryStorageStrategy implements FxSpotStorageStrategy {
    private final List<FXSpot> fxSpots = new ArrayList<>();

    @Override
    public void addFxSpot(FXSpot fxSpot) {
        fxSpots.add(fxSpot);
    }

    @Override
    public List<FXSpot> getFxSpotsByCurrencyPair(String currency1, String currency2) {
        return fxSpots.stream()
                .filter(fxSpot -> fxSpot.getCurrency1().equals(currency1) && fxSpot.getCurrency2().equals(currency2))
                .collect(Collectors.toList());
    }
}
