package com.zachary.springanno.cap6.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Title:
 * @Author:Zachary
 * @Desc: 自定义逻辑返回需要导入的组件
 * @Date:2019/1/22
 **/

public class CustomImportSelector implements ImportSelector {

    //    返回值，就是导入到容器中的组件全类名
//    AnnotationMatadata :当前标注@Import注解类的所有注解信息，不止能获取到import注解，还能获取其他注解
//   方法不要返回null
//    return null; 打开断点方法，如果返回空，F6跟进源码看看，数组。length包空指针异常，需要返回空字串数组
//    return new String[]{}是OK的
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{"com.zachary.springanno.cap6.entity.Fish"};
    }
}
