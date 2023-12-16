package X;

import java.io.Serializable;

/* renamed from: X.3Z8  reason: invalid class name */
public final class AnonymousClass3Z8 implements Serializable {
    public static final long serialVersionUID = 0;
    public final Class c;

    public AnonymousClass3Z8(Enum[] enumArr) {
        C162457s7.A0J(enumArr, 1);
        Class<?> componentType = enumArr.getClass().getComponentType();
        C162457s7.A0H(componentType);
        this.c = componentType;
    }

    private final Object readResolve() {
        Object[] enumConstants = this.c.getEnumConstants();
        C162457s7.A0D(enumConstants);
        Enum[] enumArr = (Enum[]) enumConstants;
        C162457s7.A0J(enumArr, 0);
        return C73653fr.A00(enumArr);
    }
}
