package domain.model;

public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String passwordHash;
    private String role; // USER / COACH / ADMIN

    public User(Long id, String firstName, String lastName, String email, String passwordHash, String role) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.passwordHash = passwordHash;
        this.role = role;
    }

    public Long getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getEmail() { return email; }
    public String getPasswordHash() { return passwordHash; }
    public String getRole() { return role; }

    public void setId(Long id) { this.id = id; }
    public void setRole(String role) { this.role = role; }
}
