public class Main {

    public static void main(String[] args) {
        Author colleenMccullough = new Author("Колин", "Маккалоу");
        Author douglasAdams = new Author("Дуглас", "Адамс");
        Book theThornBirds = new Book("Поющие в терновнике", colleenMccullough, 1977);
        Book theHitchhikerToTheGalaxy = new Book("Автостопом по Галактике", douglasAdams, 1979);
        System.out.println("Название книги: " + theThornBirds.getTitle()
                + " Автор: " + theThornBirds.getAuthor().getFullName()
                + " Год публикации: " + theThornBirds.getPublicationYear());
        System.out.println("Название книги: " + theHitchhikerToTheGalaxy.getTitle()
                + " Автор: " + theHitchhikerToTheGalaxy.getAuthor().getFullName()
                + " Год публикации: " + theHitchhikerToTheGalaxy.getPublicationYear());
    }
}
