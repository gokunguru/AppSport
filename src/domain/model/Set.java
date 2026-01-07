package domain.model;

public class Set {
    private Long id;
    private Long sessionId;
    private Long exerciseId;
    private int setNumber;
    private int reps;
    private double weightKg;

    public Set(Long id, Long sessionId, Long exerciseId, int setNumber, int reps, double weightKg) {
        this.id = id;
        this.sessionId = sessionId;
        this.exerciseId = exerciseId;
        this.setNumber = setNumber;
        this.reps = reps;
        this.weightKg = weightKg;
    }

    public Long getId() { return id; }
    public Long getSessionId() { return sessionId; }
    public Long getExerciseId() { return exerciseId; }
    public int getSetNumber() { return setNumber; }
    public int getReps() { return reps; }
    public double getWeightKg() { return weightKg; }

    public void setId(Long id) { this.id = id; }
}
