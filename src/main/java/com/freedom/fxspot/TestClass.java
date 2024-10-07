package com.freedom.fxspot;

import com.freedom.fxspot.model.FXSpot;
import com.freedom.fxspot.repository.FxSpotRepository;
import com.freedom.fxspot.repository.FxSpotStorageStrategy;
import com.freedom.fxspot.repository.impl.DataBaseRepositoryStrategy;
import com.freedom.fxspot.repository.impl.FxSpotRepositoryWithStrategy;
import com.freedom.fxspot.repository.impl.InMemoryStorageStrategy;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class TestClass {

    public static void main(String[] args){
        FxSpotStorageStrategy storageStrategy = new InMemoryStorageStrategy();

        //如果存在数据库
        //FxSpotStorageStrategy storageStrategy  = new DataBaseRepositoryStrategy();

        FxSpotRepository repository = new FxSpotRepositoryWithStrategy(storageStrategy);

        FXSpot fxSpot = new FXSpot(
                "USD",
                "CNY",
                new BigDecimal("70.32"),
                LocalDateTime.of(2024, 10, 1, 15, 18, 3),
                List.of("latest", "updated", "important")
        );

        repository.addFxSpot(fxSpot);

        List<FXSpot> retrievedFxSpots = repository.getFxSpotsByCurrencyPair("USD", "CNY");

        System.out.println("Retrieved FXSpot instances for USD/CNY:");
        for (FXSpot spot : retrievedFxSpots) {
            System.out.println("Currency1: " + spot.getCurrency1());
            System.out.println("Currency2: " + spot.getCurrency2());
            System.out.println("FxRate: " + spot.getFxRate());
            System.out.println("ObservedAt: " + spot.getObservedAt());
            System.out.println("Labels: " + spot.getLabels());
            System.out.println("-----");
        }

        List<FXSpot> nonExistentSpots = repository.getFxSpotsByCurrencyPair("EUR", "JPY");
        System.out.println("Retrieved FXSpot instances for EUR/JPY: " + nonExistentSpots.size());
    }




}
