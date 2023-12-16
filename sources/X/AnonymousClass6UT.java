package X;

import android.os.IBinder;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.reflect.Field;

/* renamed from: X.6UT  reason: invalid class name */
public final class AnonymousClass6UT extends AnonymousClass6WL {
    public final Object A00;

    public static Object A01(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper instanceof AnonymousClass6UT) {
            return ((AnonymousClass6UT) iObjectWrapper).A00;
        }
        IBinder asBinder = iObjectWrapper.asBinder();
        Field field = null;
        int i = 0;
        for (Field field2 : asBinder.getClass().getDeclaredFields()) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i == 1) {
            C162177rO.A02(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (NullPointerException e) {
                    throw new IllegalArgumentException("Binder object is null.", e);
                } catch (IllegalAccessException e2) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
                }
            } else {
                throw AnonymousClass001.A0c("IObjectWrapper declared field not private!");
            }
        } else {
            throw AnonymousClass000.A0G("Unexpected number of IObjectWrapper declared fields: ", AnonymousClass001.A0o(), r5);
        }
    }

    public AnonymousClass6UT(Object obj) {
        this.A00 = obj;
    }
}
