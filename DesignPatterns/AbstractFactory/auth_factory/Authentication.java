package auth_factory;

public interface Authentication {

    void doPost(String name, String password, String type);
    void doGet(String token);
}