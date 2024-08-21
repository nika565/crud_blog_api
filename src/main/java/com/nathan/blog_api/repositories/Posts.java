package com.nathan.blog_api.repositories;

import com.nathan.blog_api.interfaces.PostsInterface;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

public class Posts {

    private UUID id;
    private String titulo;

    @Override
    public String toString() {
        return "Posts{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", texto='" + texto + '\'' +
                ", nomeAutor='" + nomeAutor + '\'' +
                ", dataCriacao=" + dataCriacao +
                ", dataAtualizacao=" + dataAtualizacao +
                '}';
    }

    private String texto;
    private String nomeAutor;
    private Instant dataCriacao;
    private Instant dataAtualizacao;

    public Posts(String titulo, String texto, String nomeAutor) {
        this.id = UUID.randomUUID();
        this.titulo = titulo;
        this.texto = texto;
        this.nomeAutor = nomeAutor;
        this.dataCriacao = Instant.now();
        this.dataAtualizacao = Instant.now();
    }

    // getters
    public UUID getId() {
        return this.id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getTexto() {
        return this.texto;
    }

    public String getNomeAutor() {
        return this.nomeAutor;
    }

    // setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;

        // Atualizando o data de modificação
        this.dataAtualizacao = Instant.now();
    }

    public void setTexto(String texto) {
        this.texto = texto;
        this.dataAtualizacao = Instant.now();
    }

    public void setNomeAutor(String nome) {
        this.nomeAutor = nome;
        this.dataAtualizacao = Instant.now();
    }

}
