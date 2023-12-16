package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

/* renamed from: X.0SG  reason: invalid class name */
public class AnonymousClass0SG {
    public static final String A00 = C06240Wu.A01("PackageManagerHelper");

    public static void A00(Context context, Class cls, boolean z) {
        String str = "enabled";
        try {
            PackageManager packageManager = context.getPackageManager();
            String name = cls.getName();
            ComponentName componentName = new ComponentName(context, name);
            int i = 2;
            if (z) {
                i = 1;
            }
            packageManager.setComponentEnabledSetting(componentName, i, 1);
            C06240Wu A002 = C06240Wu.A00();
            String str2 = A00;
            StringBuilder A0l = AnonymousClass000.A0l(name);
            AnonymousClass001.A1L(A0l);
            String str3 = "disabled";
            if (z) {
                str3 = str;
            }
            C06240Wu.A03(A002, str3, str2, A0l);
        } catch (Exception e) {
            C06240Wu A003 = C06240Wu.A00();
            String str4 = A00;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(cls.getName());
            A0o.append("could not be ");
            if (!z) {
                str = "disabled";
            }
            String A0X = AnonymousClass000.A0X(str, A0o);
            if (A003.A00 <= 3) {
                Log.d(str4, A0X, e);
            }
        }
    }
}
