package com.binance.api.client.domain.market;

public enum DepthEventRate {
    RATE_100MS("@100ms"),
    RATE_1000MS("");

    private String rateMarker;

    DepthEventRate(String rateMarker) {
        this.rateMarker = rateMarker;
    }

    public String getRateMarker() {
        return rateMarker;
    }

    public void setRateMarker(String rateMarker) {
        this.rateMarker = rateMarker;
    }
}
