package com.tingyu.tieba.ba.dto.data;

public enum ErrorCode{
    B_BA_baNameConflict("B_BA_baNameConflict", "吧名冲突");

    private final String errCode;
    private final String errDesc;

    private ErrorCode(String errCode, String errDesc) {
        this.errCode = errCode;
        this.errDesc = errDesc;
    }

    public String getErrCode() {
        return errCode;
    }

    public String getErrDesc() {
        return errDesc;
    }
}
