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
    private String descricao;
    private String img;
    private String filtro;

    public Receita(String nome, String descricao, String igredientes, String modoPreparo, String filtro, String img) {
        this.id = id;
        this.nome = nome;
        this.igredientes = igredientes;
        this.modoPreparo = modoPreparo;
        this.descricao = descricao;
        this.img = img;
        this.filtro = filtro;
    }

    public Receita(){

    }
    
    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        result = prime * result + ((filtro == null) ? 0 : filtro.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((igredientes == null) ? 0 : igredientes.hashCode());
        result = prime * result + ((img == null) ? 0 : img.hashCode());
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
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
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
        if (img == null) {
            if (other.img != null)
                return false;
        } else if (!img.equals(other.img))
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

    @Override
    public String toString() {
        return "Receita [descricao=" + descricao + ", filtro=" + filtro + ", id=" + id + ", igredientes=" + igredientes
                + ", img=" + img + ", modoPreparo=" + modoPreparo + ", nome=" + nome + "]";
    }
    
}
