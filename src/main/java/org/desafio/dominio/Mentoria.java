package org.desafio.dominio;

import lombok.Data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Data
public class Mentoria extends Conteudo{

    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Mentoria{" +
                "titulo='" + getTitulo() + " " + '\'' +
                ", descricao='" + " " + getDescricao() + '\'' +
                ", data=" + " " + data.format(formatter) +
                '}';
    }


}
