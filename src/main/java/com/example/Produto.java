package com.example;

public record Produto(String produto, String setor) {
    @Override
    public String toString() {
        return setor + " " + produto;
    }
}