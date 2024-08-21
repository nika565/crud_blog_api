package com.nathan.blog_api.services;

import com.nathan.blog_api.interfaces.PostsInterface;
import com.nathan.blog_api.repositories.Posts;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PostsService implements PostsInterface {

    List<Posts> todosOsPosts = new ArrayList<>();

    // CRUD de posts
    @Override
    public void cadastrar(Posts post) {
        todosOsPosts.add(post);
    }

    @Override
    public List<Posts> listarPosts() {
        return todosOsPosts;
    }

    @Override
    public void alterarPosts(UUID id, Posts post) {

        System.out.println(post);

        // Verificando o id do post e atualizando
        for(Posts p : todosOsPosts) {
            if(p.getId().equals(id)){
                System.out.println("EXECUTEI");
                p.setNomeAutor(post.getNomeAutor());
                p.setTitulo(post.getTitulo());
                p.setTexto(post.getTexto());
            }
        }

    }

    @Override
    public void deletarPosts(UUID id) {

        List<Posts> postParaDeletar = new ArrayList<>();

        for(Posts p : todosOsPosts){
            if(p.getId().equals(id)){
                postParaDeletar.add(p);
            }
        }

        todosOsPosts.removeAll(postParaDeletar);

    }

}
