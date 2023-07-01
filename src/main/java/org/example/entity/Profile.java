package org.example.entity;

import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.example.base.BaseEntity;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Profile extends BaseEntity<Long> {

    String username;
    String firstname;
    String lastname;
    LocalDate birth;
    String password;
    String phone;
    String email;
    String photoUrl;

}
