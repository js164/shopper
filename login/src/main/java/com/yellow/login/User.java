package com.yellow.login;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    public static final char SEX_MALE = 'm';
    public static final char SEX_FEMALE = 'f';
    public static final String USER_TYPE_ADMIN = "admin";
    public static final String USER_TYPE_USER = "user";

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    String userId;

    String firstName, lastName;
    int age;
    char sex;
    String address;
    String emailId;
    Long phoneNumber;
    String userType;
    String password;

}
