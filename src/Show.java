import java.util.ArrayList;
import java.util.List;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private List<Actor> listOfActors = new ArrayList<>();

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    public void printDirector() {
        System.out.println("Информация о режиссёре: " + director.getName() + " " + director.getSurname());
    }

    public void printListOfActors() {
        System.out.println("Список участвующих актёров спектакля \"" + title + "\": ");
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
    }

    public void addNewActor(Actor actor) {
        if (!listOfActors.contains(actor)) {
            listOfActors.add(actor);
        } else {
            System.out.println("Не удалось добавить актёра! Актёр уже есть в списке!");
        }
    }

    public void replaceActor(Actor newActor, String surname) {
        int surnameMatchCounter = 0;
        Actor actorToReplace = null;

        for (Actor actor : listOfActors) {
            if (actor.getSurname().equals(surname)) {
                actorToReplace = actor;
                surnameMatchCounter++;
            }
        }

        if (surnameMatchCounter > 1) {
            System.out.println("Не удалось заменить актёра с указанной фамилией! В спектакле участвуют несколько" +
                    " актёров с такой же фамилией.");
            return;
        }

        if (actorToReplace != null) {
            listOfActors.remove(actorToReplace);
            listOfActors.add(newActor);
        }
    }
}
