package read.qual;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import org.checkerframework.framework.qual.SubtypeOf;

@SubtypeOf({UnsafeRead.class})
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
public @interface SafeRead {

}
