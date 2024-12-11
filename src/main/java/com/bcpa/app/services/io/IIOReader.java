package com.bcpa.app.services.io;

public interface IIOReader {
    public String read(String message);
    public void write(String message);
    public void clear();
}
