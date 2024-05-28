package oop.class_object.clone;

public class Runner {
    public static void main(String[] args) throws CloneNotSupportedException {
        Agent agent = new Agent("Мистер Смитт");
        Agent[] agents = make1000clones(agent);
        for (Agent clone : agents) {
            System.out.println(clone);
        }

    }
    public static Agent[] make1000clones(Agent agent) throws CloneNotSupportedException {
        Agent[] agents = new Agent[1000];
        for (int i = 0; i < 1000; i++) {
            agents[i] = (Agent) agent.clone();
        }
        return agents;
    }

}
