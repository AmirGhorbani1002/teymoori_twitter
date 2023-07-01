package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tweeter_user")
public class User extends Person {

    boolean isActive;
    boolean isVerify;

    @OneToMany
    Set<Tweet> tweets = new HashSet<>();

    @OneToMany
    Set<UserChannel> userChannels = new HashSet<>();

    @OneToMany
    Set<Report<Long, User>> reports = new HashSet<>();

}
