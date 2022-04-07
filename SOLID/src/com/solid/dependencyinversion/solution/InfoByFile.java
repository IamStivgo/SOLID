package com.solid.dependencyinversion.solution;

import java.util.ArrayList;
import java.util.List;

public class InfoByFile implements IInfo {
    @Override
    public List<Post> get(String path) {
        List<Post> posts = new ArrayList<>();
        Post post = new Post(1,1,"Titulo de prueba", true);
        posts.add(post);
        Post post1 = new Post(2,2,"Titulo de prueba 2", false);
        posts.add(post1);
        Post post2 = new Post(3,3,"Titulo de prueba 3", false);
        posts.add(post2);
        return posts;
    }
}
