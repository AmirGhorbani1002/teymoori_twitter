package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
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
public class Chatroom extends BaseEntity<Long> {

    @ManyToMany
    Set<User> users = new HashSet<>();

    @OneToMany
    Set<Message> messages = new HashSet<>();

}
