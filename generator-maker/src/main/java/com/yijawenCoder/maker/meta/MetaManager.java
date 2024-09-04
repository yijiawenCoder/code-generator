package com.yijawenCoder.maker.meta;

import cn.hutool.core.io.resource.ResourceUtil;
import cn.hutool.json.JSONUtil;

import java.sql.SQLOutput;

public class MetaManager {
    //volatile确保多线程环境可见性，从而保证meta一旦被修改其他线程能能看见
    private static volatile Meta instance;
//双检锁单例模式
    public static Meta getInstance() {
        if (instance == null) {
            synchronized (MetaManager.class) {
                if (instance == null) {
                    instance = initMeta();
                }

            }

        }
        return instance;

    }

    private static Meta initMeta()

    {
        String metaJson = ResourceUtil.readUtf8Str("meta.json");
        Meta newMeta = JSONUtil.toBean(metaJson, Meta.class);
        return newMeta;
    }


}
