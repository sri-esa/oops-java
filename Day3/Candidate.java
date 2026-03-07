package Day3;

public class Candidate {
    private String name;
    private int age;

    public Candidate(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean isEligible() {
        return age >= 18;
    }
    public static void main(String[] args) {
        Candidate candidate = new Candidate("Charlie", 20);
        System.out.println("Candidate: " + candidate.name + ", Age: " + candidate.age + ", Eligible: " + candidate.isEligible());
    }
} 