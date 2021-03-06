package io.github.talelin.core.annotation;

import io.github.talelin.core.enums.UserLevel;

import java.lang.annotation.*;

/**
 * 刷新令牌权限
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Required(level = UserLevel.REFRESH)
public @interface RefreshRequired {
}
