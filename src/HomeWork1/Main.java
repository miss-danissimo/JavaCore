package HomeWork1;

public class Main {
    public static void main(String[] args) {
        Course course = new Course(new Barrier[]{
                new Barrier("water", 5),  new Barrier("wall", 10)});
        Team team = new Team(new Member("Volodya", 20),new Member("Horse",5),
                new Member("Bird",8),new Member("Svetlana",11));
        course.doIt(team);
        team.showResults();
    }
}
