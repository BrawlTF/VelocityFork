package com.velocitypowered.api.event.connection;

import com.velocitypowered.api.event.annotation.AwaitingEvent;

@AwaitingEvent
public class StatusPingEvent {

    private final long randomId;

    public StatusPingEvent(long randomId) {
        this.randomId = randomId;
    }

    public long getRandomId() {
        return randomId;
    }

    @Override
    public String toString() {
        return "StatusPingEvent{" +
                "randomId=" + randomId +
                '}';
    }
}
