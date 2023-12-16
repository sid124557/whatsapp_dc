package com.google.android.play.core.integrity;

import X.C1441470f;
import X.C149657Ni;
import android.content.Context;

public class IntegrityManagerFactory {
    public static IntegrityManager create(Context context) {
        C149657Ni r0;
        synchronized (C1441470f.class) {
            r0 = C1441470f.A00;
            if (r0 == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                r0 = new C149657Ni(context);
                C1441470f.A00 = r0;
            }
        }
        return (IntegrityManager) r0.A04.Avs();
    }
}
