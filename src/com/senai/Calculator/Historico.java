package com.senai.Calculator;

import java.util.ArrayList;
import java.util.List;

public class Historico {
    private List<String> calculos;

    public Historico() {
        this.calculos = new ArrayList<>();
    }

    public void adicionarCalculo(String calculo) {
        calculos.add(calculo);
    }

    public List<String> getCalculos() {
        return calculos;
    }
}