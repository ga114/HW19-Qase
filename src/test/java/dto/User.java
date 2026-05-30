package dto;

public record User(String login,
                   String password) {

    public static User testUser() {
        return new User(
                "gorev1995andrey@gmail.com",
                "gorev1995andrey");
    }
}
