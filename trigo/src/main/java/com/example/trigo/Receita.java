package com.example.trigo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Receita {
    private @Id @GeneratedValue Long id;
    private String nome;
    private String igredientes;
    private String modoPreparo;
    private String filtro;

    public Receita(){

    }
    
    public Receita(String nome, String igredientes, String modoPreparo, String filtro) {
        this.nome = nome;
        this.igredientes = igredientes;
        this.modoPreparo = modoPreparo;
        this.filtro = filtro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIgredientes() {
        return igredientes;
    }

    public void setIgredientes(String igredientes) {
        this.igredientes = igredientes;
    }

    public String getModoPreparo() {
        return modoPreparo;
    }

    public void setModoPreparo(String modoPreparo) {
        this.modoPreparo = modoPreparo;
    }

    public String getFiltro() {
        return filtro;
    }

    public void setFiltro(String filtro) {
        this.filtro = filtro;
    }

    @Override
    public String toString() {
        return "receita [filtro=" + filtro + ", id=" + id + ", igredientes=" + igredientes + ", modoPreparo="
                + modoPreparo + ", nome=" + nome + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((filtro == null) ? 0 : filtro.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((igredientes == null) ? 0 : igredientes.hashCode());
        result = prime * result + ((modoPreparo == null) ? 0 : modoPreparo.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Receita other = (Receita) obj;
        if (filtro == null) {
            if (other.filtro != null)
                return false;
        } else if (!filtro.equals(other.filtro))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (igredientes == null) {
            if (other.igredientes != null)
                return false;
        } else if (!igredientes.equals(other.igredientes))
            return false;
        if (modoPreparo == null) {
            if (other.modoPreparo != null)
                return false;
        } else if (!modoPreparo.equals(other.modoPreparo))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }
    
}
