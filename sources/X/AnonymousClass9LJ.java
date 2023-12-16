package X;

import android.content.Context;

/* renamed from: X.9LJ  reason: invalid class name */
public class AnonymousClass9LJ {
    public static C203539nu A00(Context context, AnonymousClass9JW r4) {
        if (r4 == AnonymousClass9JW.CAMERA1) {
            if (AnonymousClass9ZR.A0i == null) {
                synchronized (AnonymousClass9ZR.class) {
                    if (AnonymousClass9ZR.A0i == null) {
                        AnonymousClass9ZR.A0i = new AnonymousClass9ZR(context.getApplicationContext());
                    }
                }
            }
            AnonymousClass9ZR r1 = AnonymousClass9ZR.A0i;
            r1.A0F = true;
            return r1;
        } else if (r4 == AnonymousClass9JW.CAMERA2) {
            if (AnonymousClass9ZS.A0u == null) {
                synchronized (AnonymousClass9ZS.class) {
                    if (AnonymousClass9ZS.A0u == null) {
                        AnonymousClass9ZS.A0u = new AnonymousClass9ZS(context);
                    }
                }
            }
            AnonymousClass9ZS r12 = AnonymousClass9ZS.A0u;
            r12.A0K = true;
            return r12;
        } else {
            throw AnonymousClass002.A0E(AnonymousClass000.A0P(r4, "Invalid Camera API: ", AnonymousClass001.A0o()));
        }
    }
}
