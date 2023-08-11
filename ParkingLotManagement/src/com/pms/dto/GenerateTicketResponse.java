package com.pms.dto;

import com.pms.models.Ticket;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Data
public class GenerateTicketResponse {
    private Ticket ticket;
}
