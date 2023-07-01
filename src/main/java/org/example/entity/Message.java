package org.example.entity;

import jakarta.persistence.*;
import lombok.*;
import org.example.base.BaseEntity;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Message extends BaseEntity<Long> {

    String content;
    String uuid;
    String mobileType;

    @ManyToOne
    Chatroom chatroom;

    @ManyToOne
    User user;

    @ManyToMany
    Set<User> seenUsers = new HashSet<>();

    @OneToOne
    Message messageReference;

    @OneToMany
    Set<Report<Long, Message>> reports = new HashSet<>();


}

