package com.company;

public class Poupanca extends Conta {
private int diaNiver;

    public int getDiaNiver() {
        return diaNiver;
    }

    public void setDiaNiver(int diaNiver) {
        this.diaNiver = diaNiver;
    }

    @Override
    public boolean sacar(double valor) {
        if(valor<=getSaldo()){
            setSaldo(getSaldo()-valor);
            return true;
        }
        return false;
    }
}
