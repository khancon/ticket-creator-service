package com.khancompany.app.builder;

import java.util.ArrayList;
import java.util.Objects;

public class TicketCreator {
    
    private String name;
    private ArrayList<String> tickets;
    private Integer num;


    public TicketCreator() {
    }

    public TicketCreator(String name, ArrayList<String> tickets, Integer num) {
        this.name = name;
        this.tickets = tickets;
        this.num = num;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getTickets() {
        return this.tickets;
    }

    public void setTickets(ArrayList<String> tickets) {
        this.tickets = tickets;
    }

    public Integer getNum() {
        return this.num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public TicketCreator name(String name) {
        setName(name);
        return this;
    }

    public TicketCreator tickets(ArrayList<String> tickets) {
        setTickets(tickets);
        return this;
    }

    public TicketCreator num(Integer num) {
        setNum(num);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof TicketCreator)) {
            return false;
        }
        TicketCreator ticketCreator = (TicketCreator) o;
        return Objects.equals(name, ticketCreator.name) && Objects.equals(tickets, ticketCreator.tickets) && Objects.equals(num, ticketCreator.num);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, tickets, num);
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", tickets='" + getTickets() + "'" +
            ", num='" + getNum() + "'" +
            "}";
    }
    
    
}
