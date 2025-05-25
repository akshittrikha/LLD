import StackOverlow.Answer.Answer;
import StackOverlow.Comment.Comment;
import StackOverlow.Question.Question;
import StackOverlow.StackOverflow;
import StackOverlow.User.User;

import java.util.ArrayList;
import java.util.Arrays;

public class StackOverflowDemo {
    public static void main(String args[]) {
        StackOverflow system = StackOverflow.getInstance();

        User u1 = system.createUser("name", "email");
        User u2 = system.createUser("name", "email");

        Question q1 = system.askQuestion(u1, "title", "question-description", (ArrayList<String>) Arrays.asList("tag1", "tag2"));

        Answer a1 = system.answerQuestion(u2, q1, "answer-description");

        Comment c1 = system.addComment(u1, a1, "comment");

        Comment c2 = system.addComment(u2, q1, "comment");

        system.voteQuestion(u2, q1, 1);
        system.voteAnswer(u1, a1, 1);
        system.voteComment(u1, c1, 1);

        system.acceptAnswer(a1);
    }
}
