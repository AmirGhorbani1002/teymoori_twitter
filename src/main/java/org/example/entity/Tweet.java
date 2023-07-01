package org.example.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.example.base.BaseEntity;
import org.example.entity.attachment.Attachment;
import org.example.entity.enums.Audience;
import org.example.entity.enums.TweetType;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Tweet extends BaseEntity<Long> {

    String content;
    String uuid;
    String mobileType;
    long countLike;

    @Enumerated(EnumType.STRING)
    Audience audience;

    @OneToOne
    Attachment attachment;

    @OneToOne
    Tweet tweetAfter;

    @OneToOne
    Tweet tweetBefore;

    @OneToOne
    Tweet reference;

    @Enumerated(EnumType.STRING)
    TweetType tweetType;

    @OneToMany
    Set<LikeTweet> likeTweets = new HashSet<>();

    @ManyToOne
    User user;

    @ManyToMany
    Set<User> likeUsers;

    @OneToMany
    Set<Report<Long, Tweet>> reports = new HashSet<>();

}
