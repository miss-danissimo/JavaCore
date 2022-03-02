package HomeWork1;

public class Course {
    Barrier[]barriers;
    public Course(Barrier[]barriers) {
        this.barriers=barriers;
    }
    public void doIt(Team team){
        for (int i = 0; i< team.members.length; i++) {
            Member member = team.members[i];
            member.passed = true;


            for (int v = 0; v < barriers.length; v++) {
                Barrier barrier = barriers[v];
                if (barrier.level > member.skill)
                    member.passed = false;
            }
        }

    }
}
