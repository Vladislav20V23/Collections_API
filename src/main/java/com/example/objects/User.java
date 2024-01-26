package com.example.objects;

import com.github.javafaker.Faker;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Data
@Builder
public class User {

    private String nameUser;
    private String mail;
    private String phoneNumber;
    private List<User> applications;

    public User(String nameUser, String mail, String phoneNumber) {
        this.nameUser = nameUser;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
    }

    public User(String nameUser, String mail, String phoneNumber, List<User> applications) {
        this.nameUser = nameUser;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
        this.applications = applications;
    }

    public User() {}

    public List<User> CreateUserList(int n){
        Faker faker = new Faker();

        applications = IntStream.rangeClosed(1,n)
                .mapToObj(i -> builder().nameUser(faker.name().fullName()).mail(faker.company().profession())
                        .phoneNumber(faker.phoneNumber().phoneNumber()).build()).collect(Collectors.toList());


        return applications;

    }

    @Override
    public String toString() {
        return "User{" +
                "nameUser='" + nameUser + '\'' +
                ", mail='" + mail + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }


}
