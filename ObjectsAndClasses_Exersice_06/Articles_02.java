package ObjectsAndClasses_Exersice_06;

import java.util.Scanner;

public class Articles_02 {
    public static class Article {
        //полета -> характеристики
        private String title; //заглавие
        private String content; //съдържание
        private String author; //автор

        //конструктор -> създава нови обекти
        //alt + insert -> Constructor
        public Article(String title, String content, String author) {
            //нов обект
            this.title = title;
            this.content = content;
            this.author = author;
        }

        //методи -> поведение
        public void edit(String newContent) {
            this.content = newContent;
        }

        public void changeAuthor(String newAuthor) {
            this.author = newAuthor;
        }

        public void rename(String newTitle) {
            this.title = newTitle;
        }

        //вграден метод toString -> превърне обекта в текст -> "{packageName}.{className}@{address}"
        @Override // пренаписва default method
        public String toString() {
            //{title} - {съдържание}: {автора}
            //return this.title + " - " + this.content + ": " + this.author;
            return String.format("%s - %s: %s", this.title, this.content, this.author);
            //вграден метод toString -> превърне обекта в текст -> "{title} - {съдържание}: {автора}"
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String articleData = scanner.nextLine();
        //"Holy Ghost, content, John Sandford"
        String[] articleParts = articleData.split(", ");
        // ["Holy Ghost", "content", "John Sandford"]
        String title = articleParts[0];
        String content = articleParts[1];
        String author = articleParts[2];

        Article article = new Article(title, content, author);

        int n = Integer.parseInt(scanner.nextLine()); //брой на командите
        for (int commandCount = 1; commandCount <= n; commandCount++) {
            String command = scanner.nextLine();
            //"Edit: {ново съдържание}"
            //"Rename: {ново заглавие}"
            //"ChangeAuthor"
            if (command.contains("Edit")) {
                //променя съдържанието на моята статия с даденото
                //command = "Edit: test is good".split(": ") -> ["Edit", "test is good"]
                String newContent = command.split(": ")[1]; //ново съдържание
                article.edit(newContent);
            } else if (command.contains("Rename")) {
                //променя заглавието на моята статия с даденото
                //command = "Rename: TestTitle".split(": ") -> ["Rename", "TestTitle"]
                String newTitle = command.split(": ")[1]; //ново заглавие
                article.rename(newTitle);
            } else if (command.contains("ChangeAuthor")) {
                //променя автора на моята статия с дадения
                //command = "ChangeAuthor: Test Testov".split(": ") -> ["ChangeAuthor", "Test Testov"]
                String newAuthor = command.split(": ")[1]; //новия автор
                article.changeAuthor(newAuthor);
            }
        }

        //{title} - {съдържание}: {автора}
        System.out.println(article.toString());
    }
}
