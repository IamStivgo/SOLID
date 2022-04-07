package com.solid.dependencyinversion.problem;

import java.util.List;

public class FileDB {
    private String path;
    private String origin;

    public FileDB(String path, String origin) {
        this.path = path;
        this.origin = origin;
    }

    public void save(){
        InfoByFile info = new InfoByFile(this.origin);
        List<Post> posts = info.get();
        System.out.println("Se escribe el archivo con la siguiente info");
        for(Post post: posts){
            System.out.println(post.toString());
        }
        System.out.println("Termina de escribir el archivo");
    }
}
