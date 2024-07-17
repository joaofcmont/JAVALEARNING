import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment comment1 = new Comment("Have a nice trip");
        Comment comment2 = new Comment("Wow that's awesome");
        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),
                "Travelling to New Zealand",
                "I'm going to visit this wonderful contry",
                12);


        p1.addComment(comment1);
        p1.addComment(comment2);

        System.out.println(p1);
    }
}