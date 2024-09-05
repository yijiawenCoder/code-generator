package com.yijawenCoder.maker.model;

import lombok.Data;

/**
 * 动态模板配置
 */
@Data
public class DataModel {
    private String author="yjwenCoder";
    private String outputText = "sum=";
    private boolean loop  = true;

}
