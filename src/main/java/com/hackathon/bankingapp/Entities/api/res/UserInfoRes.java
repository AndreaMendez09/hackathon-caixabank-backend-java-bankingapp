package com.hackathon.bankingapp.Entities.api.res;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Getter
@Setter
@Component
@NoArgsConstructor
public class UserInfoRes {
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private String accountNumber;
    private String hashedPassword;
}
