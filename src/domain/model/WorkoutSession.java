package domain.model;

import java.time.LocalDateTime;

public class WorkoutSession {
    private Long id;
    private Long userId;
    private LocalDateTime startedAt;
    private int durationMinutes;
    private int intensity; // 1..10
    private int caloriesBurned;
    private String notes;

    public WorkoutSession(Long id, Long userId, LocalDateTime startedAt, int durationMinutes, int intensity, int caloriesBurned, String notes) {
        this.id = id;
        this.userId = userId;
        this.startedAt = startedAt;
        this.durationMinutes = durationMinutes;
        this.intensity = intensity;
        this.caloriesBurned = caloriesBurned;
        this.notes = notes;
    }

    public Long getId() { return id; }
    public Long getUserId() { return userId; }
    public LocalDateTime getStartedAt() { return startedAt; }
    public int getDurationMinutes() { return durationMinutes; }
    public int getIntensity() { return intensity; }
    public int getCaloriesBurned() { return caloriesBurned; }
    public String getNotes() { return notes; }

    public void setId(Long id) { this.id = id; }
}
