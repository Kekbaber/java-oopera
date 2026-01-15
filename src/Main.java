public class Main {

    public static void main(String[] args) {
        Actor actor1 = new Actor("Иван", "Иванов", Gender.MALE, 183);
        Actor actor2 = new Actor("Пётр", "Петров", Gender.MALE, 172);
        Actor actor3 = new Actor("Анна", "Ивановна", Gender.FEMALE, 167);

        Director director1 = new Director("Антон", "Антонович", Gender.MALE, 22);
        Director director2 = new Director("Генадий", "Геннадьевич", Gender.MALE,27);

        Person musicAuthor = new Person("Ольга","Попова", Gender.FEMALE);
        Person choreographer = new Person("Юрий","Григорович", Gender.MALE);

        Show show = new Show("Обычный спектакль", 95, director1);
        Opera opera = new Opera("Опера", 240, director2, musicAuthor, "Либретто оперы", 20);
        Ballet ballet = new Ballet("Балет", 210, director2, musicAuthor, "Либретто балета", choreographer);

        System.out.println("Распределим актёров по спектаклям.");
        show.addNewActor(actor1);
        show.addNewActor(actor2);
        show.addNewActor(actor3);
        opera.addNewActor(actor2);
        ballet.addNewActor(actor1);
        ballet.addNewActor(actor2);

        show.printListOfActors();
        opera.printListOfActors();
        ballet.printListOfActors();

        System.out.println("Заменим в балете актера " + actor1 + " на " + actor3);
        ballet.replaceActor(actor3, actor1.getSurname());
        ballet.printListOfActors();

        System.out.println("Пробуем заменить в опере несуществующего актера.");
        opera.replaceActor(actor1, actor3.getSurname());

        System.out.println("Для оперного и балетного спектакля выведем на экран текст либретто:");
        opera.printLibrettoText();
        ballet.printLibrettoText();

        System.out.println("Остальные возможности:");
        opera.printDirector();
        opera.replaceActor(actor3, actor2.getSurname());
        opera.printListOfActors();
    }
}
