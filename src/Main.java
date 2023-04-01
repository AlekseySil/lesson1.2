public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("Отцы и дети", 1862);
        Author author1 = new Author("Иван Тургенев");
        System.out.println("Книга - " + book1.getTitle());
        System.out.println("Автор: " + author1.getAuthor());
        System.out.println( "Год выпуска: " + book1.getYear());
        book1.setYear(1861);
        System.out.println("Год написания: " + book1.getYear());

        Book book2 = new Book("Герой нашего времени", 1810);
        Author author2 = new Author("Михаил Лермонтов");
        System.out.println("Книга - " + book2.getTitle());
        System.out.println("Автор: " + author2.getAuthor());
        System.out.println( "Год выпуска: " + book2.getYear());
    }
}