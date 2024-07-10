package org.desafio.dominio;

import lombok.Data;

@Data
public class Curso extends Conteudo{

    int cargoraria;


    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargoraria=" + cargoraria + "hrs" +
                '}';
    }

    @Override
    public double calcularXp() {
        return 0;
    }
}
