package com.example;

import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class PrimaryController {
    
    @FXML
    TextField txtProduto;
    @FXML
    TextField txtSetor;
    @FXML
    ListView<Produto> listProdutos;
    
    private ArrayList<Produto> produtos = new ArrayList<>();
    
    public void adicionarProduto() {
        var produto = new Produto(txtProduto.getText(), txtSetor.getText());
        produtos.add(produto);
        txtProduto.clear();
        txtSetor.clear();
        
        mostrarProduto();
    }
    
    public void mostrarProduto() {
        listProdutos.getItems().clear();
        
        produtos.sort((p1,p2) -> p1.setor().compareToIgnoreCase(p2.setor()));

        for (var produto : produtos) {
            listProdutos.getItems().add(produto);
        }

    }
}