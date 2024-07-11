package org.desafio.dominio;

import lombok.Data;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
@Data
public class Dev {

    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudoConcluidos = new LinkedHashSet<>();

    public void increverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudoConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        }else{
            System.err.println("você não esta matriculado em nenhum conteudo!!");
        }
    }
    public double calcularTotalXp(){
         return this.conteudoConcluidos
                 .stream()
                 .mapToDouble(Conteudo::calcularXp)
                 .sum();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudoConcluidos, dev.conteudoConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudoConcluidos);
    }
}
