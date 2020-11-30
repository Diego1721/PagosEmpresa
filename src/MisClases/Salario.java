/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisClases;

/**
 *
 * @author dabo7
 */
public class Salario extends Horas {

    private int ValorH, Resueldo;

    public int getResueldo() {
        calcular();
        return Resueldo;
    }

    public void setResueldo(int Resueldo) {
        this.Resueldo = Resueldo;
    }

    public int getValorH() {
        return ValorH;
    }

    public void setValorH(int ValorH) {
        this.ValorH = ValorH;
    }

    public Salario() {
    }

    int calcular() {
        if (Salario.super.getHoras() <= 40) {
            Resueldo = Salario.super.getHoras() * ValorH;
        } else {

            if (Salario.super.getHoras() <= 48) {
                Resueldo = (40 * ValorH) + (Salario.super.getHoras() - 40) * ((ValorH * 20 / 100) + ValorH);
            } else {
                Resueldo = (40 * ValorH) + (8) * ((ValorH * 20 / 100) + ValorH) + (Salario.super.getHoras() - 48) * ((ValorH * 40 / 100) + ValorH);
            }
        }
        return Resueldo;
    }

}
