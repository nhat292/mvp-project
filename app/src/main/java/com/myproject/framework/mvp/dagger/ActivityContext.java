
package com.myproject.framework.mvp.dagger;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by Nhat on 12/13/17.
 */


@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface ActivityContext {
}
