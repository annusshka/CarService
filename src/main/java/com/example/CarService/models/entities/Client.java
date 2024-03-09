package com.example.CarService.models.entities;
import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

//@Getter
//@Setter
@Document(collection = "client")
@Data
@AllArgsConstructor
@Builder
public class Client {

    @Id
    private ObjectId id;

    @Field("name")
    private String name;

    @Field("fartherName")
    private String fartherName;

    @Field("surname")
    private String surname;

    @Field("phone")
    private String phone;

    @Field("email")
    private String email;

    /*
    public Client() {}

    public Client(String firstName, String surname) {
        this.name = firstName;
        this.surname = surname;
    }*/

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", surname=" + surname +
                ", name=" + name +
                ", fartherName=" + fartherName +
                ", phone=" + phone +
                ", email=" + email +
                "}";
    }
}
