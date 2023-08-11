import com.pms.controllers.TicketController;
import com.pms.dto.GenerateTicketRequest;
import com.pms.dto.GenerateTicketResponse;
import com.pms.models.*;
import com.pms.services.EntryGateService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = Vehicle.builder()
                .regNumber("KA123")
                .vehicleType(VehicleType.CAR)
                .build();

        ParkingAttendant parkingAttendantEntry = ParkingAttendant.builder()
                .name("Miya")
                .email("miya@raj.com")
                .build();

        ParkingAttendant parkingAttendantExit = ParkingAttendant.builder()
                .name("siddu")
                .email("siddu@raj.com")
                .build();

        Gate entryGate = Gate.builder()
                .gateNumber(1)
                .gateType(GateType.ENTRY)
                .parkingAttendant(parkingAttendantEntry)
                .build();
        Gate exitGate = Gate.builder()
                .gateNumber(2)
                .gateType(GateType.EXIT)
                .parkingAttendant(parkingAttendantExit)
                .build();

        List<Gate> entryGateList = new ArrayList<>();
        entryGateList.add(entryGate);

        ParkingLot parkingLot = ParkingLot.builder()
                .entryGate(entryGateList)
                .address("123 galli new rasta")
                .name("Park O floor")
                .build();

        EntryGateService entryGateService = new EntryGateService();
        TicketController controller = new TicketController(entryGateService);
        try{
            GenerateTicketResponse response = controller.generateTicket(GenerateTicketRequest.builder()
                    .vehicle(vehicle)
                    .gate(entryGate)
                    .build());
            System.out.println(response.getTicket());

        }catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }


    }
}