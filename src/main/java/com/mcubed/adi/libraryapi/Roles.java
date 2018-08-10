package com.mcubed.adi.libraryapi;

public enum Roles {
    SYSTEM_READ_ONLY(1),
    SYSTEM_READ_WRITE(2),
    USER_READ_ONLY(3),
    USER_READ_WRITE(4),
    NONE(0);

    private final int priority;

    Roles(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }
}
