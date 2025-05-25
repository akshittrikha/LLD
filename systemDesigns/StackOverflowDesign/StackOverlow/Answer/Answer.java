package StackOverlow.Answer;

import StackOverlow.Comment.Comment;
import StackOverlow.Question.Question;
import StackOverlow.User.User;

import java.util.ArrayList;
import java.util.UUID;

public class Answer {
    private UUID id;
    private String description;
    private User author;
    private Question question;
    private final ArrayList<Comment> comments;
    private Boolean accepted;
    private Integer votes;

    public Answer(User author, Question question, String description) {
        this.id = UUID.randomUUID();
        this.author = author;
        this.question = question;
        this.description = description;
        this.comments = new ArrayList<Comment>();
        this.accepted = false;
    }

    public String getDescription() {
        return description;
    }

    public Question getQuestion() {
        return question;
    }

    public User getAuthor() {
        return author;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void addComment(Comment c) {
        this.comments.add(c);
    }

    public void upVote() {
        this.votes++;
    }

    public UUID getId() {
        return id;
    }

    public void accept() {
        this.accepted = true;
        this.question.accept(this);
    }
}
