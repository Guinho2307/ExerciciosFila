/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.exrecicio2fila.Models;

import java.util.Calendar;

/**
 *
 * @author guilh
 */
public class Cliente {
    private int senha;
    private String nome;
    private int anoNascimento;

    public Cliente(String nome, int anoNascimento) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.senha = 0;
    }

    public boolean isPrioritario() {
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        int idade = anoAtual - anoNascimento;
        return idade >= 65;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Senha: " + senha;
    }
}
