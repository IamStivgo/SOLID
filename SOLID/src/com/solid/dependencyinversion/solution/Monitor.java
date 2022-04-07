package com.solid.dependencyinversion.solution;

import java.util.List;

public class Monitor {
    private String origin;
    private InfoByFile info;
    public Monitor(String origin) {
        this.origin = origin;
        info = new InfoByFile();
    }
    public void show(){
        List<Post> posts = info.get(origin);
        for(Post post: posts){
            System.out.println(post.toString());
        }
    }
}
