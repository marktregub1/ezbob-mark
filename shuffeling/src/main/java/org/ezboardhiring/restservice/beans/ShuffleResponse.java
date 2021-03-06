package org.ezboardhiring.restservice.beans;

import java.util.List;

public class ShuffleResponse {
    private List<Integer> numbers;

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "ShuffleResponse{" +
                "numbers=" + numbers +
                '}';
    }
}
