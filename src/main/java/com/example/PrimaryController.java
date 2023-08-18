package com.example;

import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {
    
    @FXML
    TextField txtProduto;
    @FXML
    TextField txtSetor;
    
    private ArrayList<Produto> produtos = new ArrayList<>();
    
    public void adicionar() {
        var produto = new Produto(txtProduto.getText(), txtSetor.getText());

    }
}
