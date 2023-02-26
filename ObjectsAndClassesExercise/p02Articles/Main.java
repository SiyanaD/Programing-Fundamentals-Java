package ObjectsAndClassesExercise.p02Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String readArticle = scanner.nextLine();

        String title = readArticle.split(",\\s+")[0];
        String content = readArticle.split(",\\s+")[1];
        String author = readArticle.split(",\\s+")[2];

        Articles articles = new Articles(title,content,author);//чете статията

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=n; i++) {

            String commands = scanner.nextLine();

            if (commands.contains("Edit")){
                String newContent =commands.split(": ")[1];
                articles.edit(newContent);

            } else if (commands.contains("ChangeAuthor")) {
                String newAuthor = commands.split(": ")[1];
                articles.changeAuthor(newAuthor);

            } else if (commands.contains("Rename")) {
                String newTitle = commands.split(": ")[1];
                articles.rename(newTitle);

            }


        }
        System.out.println(articles.toString());


    }
}
