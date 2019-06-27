package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import org.hibernate.annotations.NaturalId;

/**
 * @author <a href="mailto:davidm@yambay.com">David MacDonald</a>
 */
@Data
@Entity
class User {

    @Id
    @GeneratedValue
    private long id;

    @NaturalId
    private String userName;

    private String fullName;

}
