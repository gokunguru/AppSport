package domain.model;

public class Exercise {
    private Long id;
    private String name;
    private String muscleGroup;
    private String difficulty;
    private String equipment;
    private String instructions;

    public Exercise(Long id, String name, String muscleGroup, String difficulty, String equipment, String instructions) {
        this.id = id;
        this.name = name;
        this.muscleGroup = muscleGroup;
        this.difficulty = difficulty;
        this.equipment = equipment;
        this.instructions = instructions;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getMuscleGroup() { return muscleGroup; }
    public String getDifficulty() { return difficulty; }
    public String getEquipment() { return equipment; }
    public String getInstructions() { return instructions; }

    public void setId(Long id) { this.id = id; }
}
