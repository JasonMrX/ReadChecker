package read.qual;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import org.checkerframework.framework.qual.ImplicitFor;
import org.checkerframework.framework.qual.SubtypeOf;
import org.checkerframework.framework.qual.LiteralKind;

@SubtypeOf({UnsafeRead.class})
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@ImplicitFor (
literals = { LiteralKind.INT, LiteralKind.LONG }
)
public @interface UnknownSafetyLiterals {

}
