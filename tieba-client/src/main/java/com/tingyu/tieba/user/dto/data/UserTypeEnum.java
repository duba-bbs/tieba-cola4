package com.tingyu.tieba.user.dto.data;

public enum UserTypeEnum {
    ADMIN_USER("01", "超级管理员"), NORMAL_USER("02", "普通用户");

    private final String typeCode;
    private final String typeName;

    private UserTypeEnum(String typeCode, String typeName) {
        this.typeCode = typeCode;
        this.typeName = typeName;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public String getTypeName() {
        return typeName;
    }
}
