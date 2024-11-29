package StackOverlow.User;

public class User {
    private String email;
    private String name;
    private Integer karma;

    public User(String email, String name) {
        this.email = email;
        this.name = name;
        this.karma = 0;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public Integer getKarma() {
        return karma;
    }
}
