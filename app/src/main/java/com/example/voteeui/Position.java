package com.example.voteeui;

public class Position
{
    private byte id;
    private String name;

    private Event _event;
    private int eventId;

    public Position(byte id, String name, Event _event, int eventId)
    {
        this.id = id;
        this.name = name;
        this._event = _event;
        this.eventId = eventId;
    }

    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Event get_event() {
        return _event;
    }

    public void set_event(Event _event) {
        this._event = _event;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    @Override
    public String toString()
    {
        return "Position{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", eventId=" + eventId +
                '}';
    }
}
