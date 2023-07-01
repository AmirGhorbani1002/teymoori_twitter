package org.example.entity;

import jakarta.persistence.*;
import lombok.*;
import org.example.base.BaseEntity;
import org.example.entity.custom_id.UserChannelId;
import org.example.entity.enums.RoleChannel;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserChannel extends BaseEntity<UserChannelId> {

    @ManyToOne
    @MapsId("userId")
    User user;

    @ManyToOne
    @MapsId("channelId")
    Channel channel;

    @Enumerated(EnumType.STRING)
    RoleChannel roleChannel;

}
