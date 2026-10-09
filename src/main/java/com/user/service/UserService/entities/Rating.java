package com.user.service.UserService.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Rating {
    private String ratingId;
    private String UserId;
    private String hotelId;
    private String rating;
    private String feedback;
}
