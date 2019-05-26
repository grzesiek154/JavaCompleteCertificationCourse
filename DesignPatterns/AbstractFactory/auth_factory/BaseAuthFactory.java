package auth_factory;


/**
 * BaseAuthFactory
 */
public abstract class BaseAuthFactory {

    public abstract Authentication createAuthenticationModule(String type);

}