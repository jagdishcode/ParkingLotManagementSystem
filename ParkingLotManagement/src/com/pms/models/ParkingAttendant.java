package com.pms.models;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Data
public class ParkingAttendant {

    private String name;

    private String email;

}
