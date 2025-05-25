package StackOverlow;

import StackOverlow.Answer.Answer;
import StackOverlow.Comment.Comment;
import StackOverlow.Question.Question;
import StackOverlow.User.User;

import java.util.ArrayList;

public class StackOverflow {
    private static StackOverflow instance;

    private StackOverflow() {}

    public static synchronized StackOverflow getInstance() {
        if (instance == null)
            instance = new StackOverflow();

        return instance;
    }

    public User createUser(String name, String email) {
        return new User(name, email);
    }

    public Question askQuestion(User user, String title, String description, ArrayList<String> tags) {
        return new Question(user, title, description, tags);
    }

    public Answer answerQuestion(User user, Question q, String description) {
        return new Answer(user, q, description);
    }

    public Comment addComment(User user, Answer a, String description) {
        return new Comment(user, a, description);
    }

    public Comment addComment(User user, Question q, String description) {
        return new Comment(user, q, description);
    }

    public void voteQuestion(User user, Question q, Integer vote) {
        q.upVote();
    }

    public void voteAnswer(User user, Answer a, Integer vote) {
        a.upVote();
    }

    public void voteComment(User user, Comment c, Integer vote) {
        c.upVote();
    }

    public void acceptAnswer(Answer a) {
        a.accept();
    }
}
