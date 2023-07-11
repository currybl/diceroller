package com.chickfila.diceroller.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface DiceAPI {
    @GET()
    Call<Integer> getInteger();
}
