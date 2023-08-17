package com.example;

public record Produto(String produto, String setor) {
    @Override
    public String toString() {
        return setor + " " + produto;
    }
}

// O erro está na versão do Java, preciso mudar para a 16.