package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2uA  reason: invalid class name and case insensitive filesystem */
public class C57762uA {
    public static Set A00;

    public static Set A00() {
        Set set = A00;
        if (set != null) {
            return set;
        }
        HashSet A0K = AnonymousClass002.A0K();
        for (AnonymousClass8L9 r1 : C155697fL.A10) {
            A0K.add(r1.sha1Hash);
            A0K.add(r1.sha256Hash);
        }
        for (AnonymousClass8L9 r12 : C155697fL.A11) {
            A0K.add(r12.sha1Hash);
            A0K.add(r12.sha256Hash);
        }
        Set unmodifiableSet = Collections.unmodifiableSet(A0K);
        A00 = unmodifiableSet;
        return unmodifiableSet;
    }

    public static boolean A01(Context context) {
        String packageName = context.getPackageName();
        int i = 64;
        if (C107385bE.A06()) {
            i = 134217728;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, i);
            if (packageInfo == null || !AnonymousClass35C.A04(packageInfo)) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e((Throwable) e);
        }
    }
}
