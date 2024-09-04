package com.yijawenCoder.maker.generator;

import com.yijawenCoder.maker.meta.Meta;
import com.yijawenCoder.maker.meta.MetaManager;

public class MainGenerator {
    public static void main(String[] args) {
        Meta instance = MetaManager.getInstance();
        System.out.println(instance);
    }
}
