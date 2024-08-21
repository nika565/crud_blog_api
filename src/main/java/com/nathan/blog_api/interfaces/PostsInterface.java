package com.nathan.blog_api.interfaces;

import com.nathan.blog_api.repositories.Posts;

import java.util.List;
import java.util.UUID;

public interface PostsInterface {

    void cadastrar(Posts post);

    List<Posts> listarPosts();

    void alterarPosts(UUID id, Posts post);

    void deletarPosts(UUID id);

}
