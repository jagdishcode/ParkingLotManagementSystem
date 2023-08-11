package com.pms.dto;

import com.pms.models.Gate;
import com.pms.models.Vehicle;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class GenerateTicketRequest {
    private Vehicle vehicle;
    private Gate gate;
}
