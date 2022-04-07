package com.solid.dependencyinversion.solution;

import java.util.List;

public class FileDB {
    private String path;
    private String origin;
    private InfoByFile info;
    public FileDB(String path, String origin) {
        this.path = path;
        this.origin = origin;
        info = new InfoByFile();
    }

    public void save(){
        List<Post> posts = info.get(origin);
        System.out.println("Se escribe el archivo con la siguiente info");
        for(Post post: posts){
            System.out.println(post.toString());
        }
        System.out.println("Termina de escribir el archivo");
    }
}
