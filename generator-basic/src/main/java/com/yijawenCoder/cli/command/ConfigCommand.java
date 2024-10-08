package com.yijawenCoder.cli.command;

import cn.hutool.core.util.ReflectUtil;
import com.yijawenCoder.model.MainTemplateConfig;
import picocli.CommandLine;

import java.lang.reflect.Field;
@CommandLine.Command(name = "config", description = "生成代码", mixinStandardHelpOptions = true)

public class ConfigCommand  implements Runnable{
    @Override
    public void run() {
        Field[] fields = ReflectUtil.getFields(MainTemplateConfig.class);
        for (Field field : fields) {
            System.out.println("字段名称："+field.getName());
            System.out.println("字段类型："+field.getType());
        }

    }
}
