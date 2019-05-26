package auth_factory;

import java.util.ArrayList;
import java.util.List;

import auth_factory.auth_types.FacebookAuth;
import auth_factory.auth_types.GoogleAuth;
import auth_factory.auth_types.IMSAuth;

/**
 * AuthModuleFactory
 */
public class AuthModuleFactory extends BaseAuthFactory{

    private List<Authentication> authTypes = new ArrayList<>();
    Authentication newAuth;
    @Override
    public Authentication createAuthenticationModule(String type) {

       

        switch(type.toLowerCase()) 
        {
           case "google":
            this.newAuth = new GoogleAuth();
            this.authTypes.add(newAuth);
            break;
           case "facebook":
            this.newAuth = new FacebookAuth();
            this.authTypes.add(newAuth);
            break;
           case "ims":
            this.newAuth = new IMSAuth();
            this.authTypes.add(newAuth);
            break;

        }
        return newAuth;
    }
}