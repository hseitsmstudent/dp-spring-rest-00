package org.dp;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//import javax.persistence.*;

/**
 * Created by student on 3/6/17.
 */
@Data
@Document
//@Entity
//@Table(name = "people")
public class Person {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id; //long id;

    private String firstName;
    private String lastName;
}
