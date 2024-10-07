package com.freedom.fxspot.repository.impl;

import com.freedom.fxspot.model.FXSpot;
import com.freedom.fxspot.repository.FxSpotStorageStrategy;

import java.util.List;

//使用数据库来保存
public class DataBaseRepositoryStrategy implements FxSpotStorageStrategy {
    //省略实现
    @Override
    public void addFxSpot(FXSpot fxSpot) {

    }

    @Override
    public List<FXSpot> getFxSpotsByCurrencyPair(String currency1, String currency2) {
        return null;
    }
}
