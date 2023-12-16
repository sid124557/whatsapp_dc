package X;

import android.app.Application;
import android.content.Context;

/* renamed from: X.2A1  reason: invalid class name */
public final class AnonymousClass2A1 {
    public static C107695bk A00(Context context) {
        return ((C64333Db) A01(context)).AcK.A00;
    }

    public static Object A01(Context context) {
        Application A00 = AnonymousClass2A0.A00(context.getApplicationContext());
        boolean z = A00 instanceof AnonymousClass4C0;
        Object[] A0L = AnonymousClass002.A0L();
        A0L[0] = A00.getClass();
        if (z) {
            return ((AnonymousClass4C0) A00).generatedComponent();
        }
        throw AnonymousClass001.A0c(String.format("Hilt BroadcastReceiver must be attached to an @HiltAndroidApp Application. Found: %s", A0L));
    }
}
