package com.freedom.fxspot.model;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class FXSpot {
    private String currency1;
    private String currency2;
    private BigDecimal fxRate;
    private LocalDateTime observedAt;
    private List<String> labels;

    public FXSpot(String currency1, String currency2, BigDecimal fxRate, LocalDateTime observedAt, List<String> labels) {
        this.currency1 = currency1;
        this.currency2 = currency2;
        this.fxRate = fxRate;
        this.observedAt = observedAt;
        this.labels = labels;
    }

    // Getters and setters
    public String getCurrency1() {
        return currency1;
    }

    public void setCurrency1(String currency1) {
        this.currency1 = currency1;
    }

    public String getCurrency2() {
        return currency2;
    }

    public void setCurrency2(String currency2) {
        this.currency2 = currency2;
    }

    public BigDecimal getFxRate() {
        return fxRate;
    }

    public void setFxRate(BigDecimal fxRate) {
        this.fxRate = fxRate;
    }

    public LocalDateTime getObservedAt() {
        return observedAt;
    }

    public void setObservedAt(LocalDateTime observedAt) {
        this.observedAt = observedAt;
    }

    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }
}
