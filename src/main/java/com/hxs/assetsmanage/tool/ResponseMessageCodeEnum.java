package com.hxs.assetsmanage.tool;
/**
 * 编写者：马
 * 编写时间：2019-5-18
 * 描述：对返回值的编号进行定义
 */
public enum ResponseMessageCodeEnum {
    SUCCESS("0"),
    ERROR("-1");

    private String code;

    private ResponseMessageCodeEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }
}
