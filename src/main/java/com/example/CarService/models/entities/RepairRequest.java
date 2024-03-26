package com.example.CarService.models.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document(collection = "repair_request")
@Data
@AllArgsConstructor
@Builder
public class RepairRequest {

    @Id
    private ObjectId id;

    @Field("car")
    private String car;

    @Field("problem")
    private String problem;

    @Indexed(expireAfter = "10d")
    @Field("date")
    private Date date;

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", car=" + car +
                ", problem=" + problem +
                "}";
    }
}
