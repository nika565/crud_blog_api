package com.nathan.blog_api.controllers;

import com.nathan.blog_api.repositories.Posts;
import com.nathan.blog_api.services.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/posts")
public class PostsController {

    @Autowired
    private PostsService postsService;

    @GetMapping()
    public Map<String, List<Posts>> listarPosts() {
        Map<String, List<Posts>> resposta = new HashMap<>();
        resposta.put("posts", this.postsService.listarPosts());
        return resposta;
    }

    @PostMapping()
    public Map<String, String> cadastrar(@RequestBody Posts post){
        postsService.cadastrar(post);
        Map<String, String> resposta = new HashMap<>();
        resposta.put("status", "success");
        return resposta;
    }

    @PutMapping("/{id}")
    public Map<String, String> editarPost(@PathVariable("id") UUID id, @RequestBody Posts post) {
        postsService.alterarPosts(id, post);
        Map<String, String> resposta = new HashMap<>();
        resposta.put("status", "success");
        return resposta;
    }

    @DeleteMapping("/{id}")
    public Map<String, String> deletarPost(@PathVariable("id") UUID id){
        postsService.deletarPosts(id);
        Map<String, String> resposta = new HashMap<>();
        resposta.put("status", "success");
        return resposta;
    }
}
