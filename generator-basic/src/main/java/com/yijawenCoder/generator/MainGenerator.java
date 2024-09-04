package com.yijawenCoder.generator;

import com.yijawenCoder.model.MainTemplateConfig;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;

public class MainGenerator {
    public static void main(String[] args) throws TemplateException, IOException {
        //1.静态
        String root = System.getProperty("user.dir");
        String inputPath = root+ File.separator+"codeGeneratorDemoProjects"+ File.separator+"acm-template";
        String outputPath = root;
        System.out.println(root);
        StaticGenerator.copyFilesByRecursive(inputPath, outputPath);
        //.动态
        String projectPath = System.getProperty("user.dir");
        String DinputPath = projectPath + File.separator+"generator-basic"+File.separator + "src/main/resources/templates/MainTemplate.java.ftl";
        String DoutputPath = projectPath + File.separator+"acm-template/src/com/yupi/acm"+ File.separator+ "MainTemplate.java";
        MainTemplateConfig mainTemplateConfig = new MainTemplateConfig();
        mainTemplateConfig.setAuthor("yijiawen");
        mainTemplateConfig.setLoop(false);
        mainTemplateConfig.setOutputText("求和结果：");
        DynamicGenerator.doGenerate(DinputPath, DoutputPath, mainTemplateConfig);
    }
}
