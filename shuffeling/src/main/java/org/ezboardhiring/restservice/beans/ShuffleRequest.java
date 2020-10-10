package org.ezboardhiring.restservice.beans;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class ShuffleRequest {
    @Max(value = 1000)
    @Min(value = 1)
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
