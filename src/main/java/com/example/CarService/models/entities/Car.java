package com.example.CarService.models.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Document(collection = "car")
@Data
@AllArgsConstructor
@Builder
public class Car {

    @Id
    private String number;
    @Field("model")
    private String model;
    @Field("year")
    @DateTimeFormat(pattern = "YYYY-mm-dd")
    private Date date;

    @Field("client_id")
    private ObjectId client;

    @Override
    public String toString() {
        return "Client{" +
                "number=" + number +
                ", model=" + model +
                ", date=" + date +
                ", client_id=" + client +
                "}";
    }
}
