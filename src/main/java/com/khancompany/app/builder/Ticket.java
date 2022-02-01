package com.khancompany.app.builder;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Objects;

public class Ticket {
    
    private String ticketName;
    private ArrayList<Field> fields;
    private Date date;


    public Ticket() {
    }

    public Ticket(String ticketName, ArrayList<Field> fields, Date date) {
        this.ticketName = ticketName;
        this.fields = fields;
        this.date = date;
    }

    public String getTicketName() {
        return this.ticketName;
    }

    public void setTicketName(String ticketName) {
        this.ticketName = ticketName;
    }

    public ArrayList<Field> getFields() {
        return this.fields;
    }

    public void setFields(ArrayList<Field> fields) {
        this.fields = fields;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Ticket ticketName(String ticketName) {
        setTicketName(ticketName);
        return this;
    }

    public Ticket fields(ArrayList<Field> fields) {
        setFields(fields);
        return this;
    }

    public Ticket date(Date date) {
        setDate(date);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Ticket)) {
            return false;
        }
        Ticket ticket = (Ticket) o;
        return Objects.equals(ticketName, ticket.ticketName) && Objects.equals(fields, ticket.fields) && Objects.equals(date, ticket.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticketName, fields, date);
    }

    @Override
    public String toString() {
        return "{" +
            " ticketName='" + getTicketName() + "'" +
            ", fields='" + getFields() + "'" +
            ", date='" + getDate() + "'" +
            "}";
    }

}
