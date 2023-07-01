package org.example.entity.custom_id;

import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserChannelId implements Serializable {

    Long userId;
    Long channelId;

}
