package example.builder.ver2;

import java.util.LinkedList;
import java.util.List;

public class Participant {
    private String name;
    private List<String> actions;

    public Participant(String name) {
        this.name = name;
        actions = new LinkedList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getActions() {
        return actions;
    }

    public void addAction(String action) {
        this.actions.add(action);
    }

    @Override
    public String toString() {
        return "Participant{" +
                "name='" + name + '\'' +
                ", actions=" + actions +
                '}';
    }

    public void doAction()
    {
        System.out.println(name);
        System.out.println(actions.toString());
    }
}
