package com.gunter.client;

/**
 * Created by Gunter on 2016/5/28.
 */

public class IResponse<T> {
    private String MSG;
    private int CODE;
    private T RESULT;

    public IResponse() {
    }

    public IResponse(String MSG, int CODE, T RESULT) {
        this.MSG = MSG;
        this.CODE = CODE;
        this.RESULT = RESULT;
    }

    public String getMSG() {
        return MSG;
    }

    public void setMSG(String MSG) {
        this.MSG = MSG;
    }

    public int getCODE() {
        return CODE;
    }

    public void setCODE(int CODE) {
        this.CODE = CODE;
    }

    public T getRESULT() {
        return RESULT;
    }

    public void setRESULT(T RESULT) {
        this.RESULT = RESULT;
    }
}
