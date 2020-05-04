package com.kmr;

/** Invoker */
public class ValkokankaanPainike {
    Command cmd;
    public ValkokankaanPainike(Command cmd){
        this.cmd = cmd;
    }
    public void paina() {
        cmd.execute();
    }
}