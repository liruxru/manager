package com.bonc.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ManagerResult {

    private int code;
    private String msg;
    private Map<String,Object> data;

    public static ManagerResult ok() {
        ManagerResult result = new ManagerResult(200,"success",null);
        return result;
    }
}
