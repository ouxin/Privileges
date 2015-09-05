package com.luohj.privileges.core.tags;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 功能说明:
 *
 * @author Administrator
 * 
 * @Date 2015-9-5 下午06:04:04
 *
 *
 * 版本号  |   作者   |  修改时间   |   修改内容
 *
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Column {
	String value() default "fieldName";
	boolean id() default false;
}
