package domain.model;

import java.time.LocalDate;

public class CoachStudent {
    private Long id;
    private Long coachId;
    private Long studentUserId;
    private LocalDate startDate;
    private String status; // active / paused / ended

    public CoachStudent(Long id, Long coachId, Long studentUserId, LocalDate startDate, String status) {
        this.id = id;
        this.coachId = coachId;
        this.studentUserId = studentUserId;
        this.startDate = startDate;
        this.status = status;
    }

    public Long getId() { return id; }
    public Long getCoachId() { return coachId; }
    public Long getStudentUserId() { return studentUserId; }
    public LocalDate getStartDate() { return startDate; }
    public String getStatus() { return status; }

    public void setId(Long id) { this.id = id; }
}
