package com.solid.dependencyinversion.problem;

public class Post {
    private Integer useId;
    private Integer id;
    private String title;
    private Boolean completed;

    public Integer getUseId() {
        return useId;
    }

    public void setUseId(Integer useId) {
        this.useId = useId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public Post(Integer useId, Integer id, String title, Boolean completed) {
        this.useId = useId;
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Post{" +
                "useId=" + useId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", completed=" + completed +
                '}';
    }
}
