package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

public class BitcoinDataModel {

    private String mCurrency;

    public static BitcoinDataModel fromJson(JSONObject jsonObject) {

        try {
            BitcoinDataModel bitcoindata = new BitcoinDataModel();
            bitcoindata.mCurrency = jsonObject.getString("ask");
            return bitcoindata;

        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getCurrency() {
        return mCurrency;
    }
}
