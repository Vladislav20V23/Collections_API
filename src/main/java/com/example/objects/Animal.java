package com.example.objects;

import com.github.javafaker.Faker;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Animal {

    public String nickname;
    public Animal() {
    }

    public Animal(String nickname) {
        this.nickname = nickname;
    }

    public String getStringDeque(){
        Faker faker = new Faker();
        String nickname = faker.animal().name();
        return nickname;
    }





    }
