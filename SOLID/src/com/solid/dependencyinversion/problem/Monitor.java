package com.solid.dependencyinversion.problem;

import java.util.List;

public class Monitor {
    private String origin;

    public Monitor(String origin) {
        this.origin = origin;
    }
    public void show(){
        InfoByFile info = new InfoByFile(this.origin);
        List<Post> posts = info.get();
        for(Post post: posts){
            System.out.println(post.toString());
        }
    }
}
