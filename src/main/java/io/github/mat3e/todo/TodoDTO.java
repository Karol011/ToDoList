package io.github.mat3e.todo;

public class TodoDTO {

    private Integer id;
    private String text;
    private boolean done;

    public TodoDTO(Todo todo) {
        this.id = todo.getId();
        this.text = todo.getText();
        this.done = todo.isDone();
    }

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(final String text) {
        this.text = text;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(final boolean done) {
        this.done = done;
    }
}
