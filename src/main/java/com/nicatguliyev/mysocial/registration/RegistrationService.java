package com.nicatguliyev.mysocial.registration;

import com.nicatguliyev.mysocial.appuser.AppUser;
import com.nicatguliyev.mysocial.appuser.AppUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {

    private final AppUserService appUserService;
    private final EmailValidator emailValidator;

    public  String register(RegistrationRequest request){
        boolean isValidEmail = emailValidator.test(request.getEmail());
        if(!isValidEmail){
            throw  new IllegalStateException("Email duzgun formatda deyil");
        }
        return appUserService.signUpUser(
                new AppUser(
                       

                )
        );
    }
}
