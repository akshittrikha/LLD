package StackOverlow.Question;

import StackOverlow.Answer.Answer;
import StackOverlow.Comment.Comment;
import StackOverlow.User.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class Question {
    private String title;
    private String description;
    private UUID id;
    private User author;
    private HashMap<String, ArrayList<Question>> tags;
    private final ArrayList<Comment> comments;
    private Integer votes;
    private Answer acceptedAnswer;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public UUID getId() {
        return id;
    }

    public User getAuthor() {
        return author;
    }

    public HashMap<String, ArrayList<Question>> getTags() {
        return tags;
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

    public void accept(Answer a) {
        this.acceptedAnswer = a;
    }

    public Question(User user, String title, String description, ArrayList<String> topics) {
        this.author = user;
        this.title = title;
        this.description = description;
        id = UUID.randomUUID();
        for (String topic:topics) {
            if (!tags.containsKey(topic)) {
                tags.put(topic, new ArrayList<Question>());
            }

            tags.get(topic).add(this);
        }
        this.comments = new ArrayList<Comment>();
    }
}
