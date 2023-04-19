package com.andrii.planes.controller;

import com.andrii.planes.model.Ticket;
import com.andrii.planes.service.TicketService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TicketController {
    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping("tickets")
    public ResponseEntity getAllTickets() {
        return ResponseEntity.ok(ticketService.getAllTickets());
    }

    @GetMapping("tickets/{id}")
    public ResponseEntity getTicketById(@PathVariable int id) {
        return ResponseEntity.ok(ticketService.getTicketById(id));
    }

    @PostMapping(value = "tickets/add", produces = "application/json", consumes = "application/json" )
    public ResponseEntity createTicket(@RequestBody Ticket ticket) {
        return ResponseEntity.ok(ticketService.createTicket(ticket));
    }
}
