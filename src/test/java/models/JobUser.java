package models;

import com.google.gson.annotations.Expose;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JobUser {

    @Expose //(serialize = true, deserialize = true)
    String name;
    @Expose
    String job;
    String id;
    String createdAt;
    @Expose
    String updatedAt;


}
