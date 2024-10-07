package com.freedom.fxspot.repository.impl;

import com.freedom.fxspot.model.FXSpot;
import com.freedom.fxspot.repository.FxSpotRepository;
import com.freedom.fxspot.repository.FxSpotStorageStrategy;

import java.util.List;

//策略模式
public class FxSpotRepositoryWithStrategy implements FxSpotRepository {

    private final FxSpotStorageStrategy storageStrategy;

    public FxSpotRepositoryWithStrategy(FxSpotStorageStrategy storageStrategy) {
        this.storageStrategy = storageStrategy;
    }

    @Override
    public void addFxSpot(FXSpot fxSpot) {
        storageStrategy.addFxSpot(fxSpot);
    }

    @Override
    public List<FXSpot> getFxSpotsByCurrencyPair(String currency1, String currency2) {
        return storageStrategy.getFxSpotsByCurrencyPair(currency1, currency2);
    }
}
