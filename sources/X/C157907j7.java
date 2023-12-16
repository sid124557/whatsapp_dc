package X;

import java.lang.reflect.Field;

/* renamed from: X.7j7  reason: invalid class name and case insensitive filesystem */
public final class C157907j7 {
    public final Field field;

    public void set(Object obj, int i) {
        try {
            this.field.set(obj, Integer.valueOf(i));
        } catch (IllegalAccessException e) {
            throw AnonymousClass0x9.A0i(e);
        }
    }

    public C157907j7(Field field2) {
        this.field = field2;
        field2.setAccessible(true);
    }

    public void set(Object obj, Object obj2) {
        try {
            this.field.set(obj, obj2);
        } catch (IllegalAccessException e) {
            throw AnonymousClass0x9.A0i(e);
        }
    }
}
