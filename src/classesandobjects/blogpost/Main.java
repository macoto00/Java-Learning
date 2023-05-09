package blogpost;

public class Main {
    public static void main(String[] args) {

        BlogPost blogpost1 = new BlogPost();
        blogpost1.authorName = "John Doe";
        blogpost1.title = "Lorem Ipsum";
        blogpost1.text = "Lorem ipsum dolor sit amet.";
        blogpost1.publicationDate = "2000.05.04.";

        BlogPost blogpost2 = new BlogPost();
        blogpost2.authorName = "Tim Urban";
        blogpost2.title = "Wait but why";
        blogpost2.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
        blogpost2.publicationDate = "2010.10.10.";

        BlogPost blogpost3 = new BlogPost();
        blogpost3.authorName = "William Turton";
        blogpost3.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
        blogpost3.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";
        blogpost3.publicationDate = "2017.03.28.";


    }
}
