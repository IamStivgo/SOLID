package com.solid.dependencyinversion.solution;

import java.util.List;

public interface IInfo {
    List<Post> get(String path);
}
