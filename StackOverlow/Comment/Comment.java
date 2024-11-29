package StackOverlow.Comment;

import StackOverlow.Answer.Answer;
import StackOverlow.Question.Question;
import StackOverlow.User.User;

import java.util.UUID;

public class Comment {
    private User author;
    private UUID parentId;
    private String description;
    private String parentType;
    private Integer votes;

    public Comment(User author, Answer answer, String description) {
        this.author = author;
        this.description = description;
        this.parentId = answer.getId();
        this.parentType = "ANS";
        answer.addComment(this);
    }

    public Comment(User author, Question question, String description) {
        this.author = author;
        this.description = description;
        this.parentId = question.getId();
        this.parentType = "QUE";
        question.addComment(this);
    }

    public void upVote() {
        this.votes++;
    }
}
