package HomeWork1;

public class Team {
    String name;
    Member[] members;
    public Team(Member member1, Member member2, Member member3, Member member4) {
        this.members= new Member[]{member1, member2, member3, member4};
    }

    public void showResults(){
        for (int i = 0; i< members.length;i++) {
            System.out.println(members[i].name + " " + members[i].passed);
        }
    }

    public void showPlayers(){
        for (int i = 0; i< members.length;i++)
            System.out.println(members[i].name);
    }
}
