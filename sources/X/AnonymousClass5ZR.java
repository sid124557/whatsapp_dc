package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5ZR  reason: invalid class name */
public class AnonymousClass5ZR {
    public final C54292oU A00;
    public final AnonymousClass33p A01;
    public final AnonymousClass3LP A02;

    public static boolean A01(Context context, String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null || packageManager.checkPermission(str, "com.whatsapp.w4b") != 0) {
            return false;
        }
        return true;
    }

    public int A02(String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return 0;
        }
        int A05 = AnonymousClass0Y8.A05(this.A00.A00, str);
        if (A05 == 0) {
            C18260x0.A0K(this.A01, str);
        }
        return A05;
    }

    public int A03(String[] strArr) {
        if (Build.VERSION.SDK_INT >= 23) {
            for (String A022 : strArr) {
                int A023 = A02(A022);
                if (A023 != 0) {
                    return A023;
                }
            }
        }
        return 0;
    }

    public boolean A05() {
        if (A02("android.permission.ACCESS_COARSE_LOCATION") == 0 || A02("android.permission.ACCESS_FINE_LOCATION") == 0) {
            return true;
        }
        return false;
    }

    public boolean A06() {
        return AnonymousClass000.A1T(A02("android.permission.NEARBY_WIFI_DEVICES"));
    }

    public boolean A08() {
        C183538qC r2 = this.A01.A01;
        if (!"scoped".equals(C18280x3.A0Z(C18300x5.A0B(r2), "external_storage_type"))) {
            return false;
        }
        int A022 = C18280x3.A02(C18300x5.A0B(r2), "reg_skip_storage_perm");
        if (A022 == 1 || A022 == 2) {
            return true;
        }
        return false;
    }

    public boolean A09() {
        return AnonymousClass000.A1T(A02("android.permission.READ_CALL_LOG"));
    }

    public boolean A0A() {
        if (A02("android.permission.ANSWER_PHONE_CALLS") != 0 || !A0F()) {
            return false;
        }
        return true;
    }

    public boolean A0D() {
        Log.i("Inquiring mic permission.");
        if (Build.VERSION.SDK_INT < 23 && this.A00.A00.checkCallingOrSelfPermission("android.permission.RECORD_AUDIO") == 0) {
            return true;
        }
        if (!C107385bE.A02() || A02("android.permission.RECORD_AUDIO") != 0) {
            return false;
        }
        return true;
    }

    public boolean A0I(String str) {
        if (!"mounted".equals(str)) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 33 || A02("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        return false;
    }

    public AnonymousClass5ZR(C54292oU r1, AnonymousClass33p r2, AnonymousClass3LP r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public static List A00() {
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add("android.permission.READ_PHONE_STATE");
        if (C107385bE.A08()) {
            A0s.add("android.permission.READ_PHONE_NUMBERS");
        }
        return A0s;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0036, code lost:
        if (A03(r3) == 0) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C997357z A04() {
        /*
            r4 = this;
            java.lang.String[] r3 = X.C107035aa.A02()
            boolean r0 = X.C107385bE.A0B()
            if (r0 == 0) goto L_0x0032
            r0 = 0
            r0 = r3[r0]
            int r0 = r4.A02(r0)
            boolean r2 = X.AnonymousClass000.A1T(r0)
            r0 = 1
            r0 = r3[r0]
            int r0 = r4.A02(r0)
            boolean r1 = X.AnonymousClass000.A1T(r0)
            r0 = 2
            r0 = r3[r0]
            int r0 = r4.A02(r0)
            boolean r0 = X.AnonymousClass000.A1T(r0)
            if (r2 == 0) goto L_0x0039
            if (r1 == 0) goto L_0x0039
        L_0x002f:
            X.57z r0 = X.C997357z.GRANTED
            return r0
        L_0x0032:
            int r0 = r4.A03(r3)
            if (r0 != 0) goto L_0x003e
            goto L_0x002f
        L_0x0039:
            if (r0 == 0) goto L_0x003e
            X.57z r0 = X.C997357z.PARTIAL
            return r0
        L_0x003e:
            X.57z r0 = X.C997357z.DENIED
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5ZR.A04():X.57z");
    }

    public boolean A07() {
        return AnonymousClass000.A1T(A03(C107035aa.A04()));
    }

    public boolean A0B() {
        String str;
        if (!C107385bE.A06()) {
            str = "android.permission.CALL_PHONE";
        } else if (A02("android.permission.ANSWER_PHONE_CALLS") != 0) {
            return false;
        } else {
            str = "android.permission.READ_CALL_LOG";
        }
        if (A02(str) != 0 || !A0F()) {
            return false;
        }
        return true;
    }

    public boolean A0C() {
        if (C107385bE.A08() || A03(C107035aa.A02()) == 0) {
            return true;
        }
        return false;
    }

    public boolean A0E() {
        return AnonymousClass000.A1T(A03(C107035aa.A04()));
    }

    public boolean A0F() {
        Iterator it = A00().iterator();
        boolean z = true;
        while (it.hasNext()) {
            z &= AnonymousClass000.A1T(A02(AnonymousClass001.A0m(it)));
        }
        return z;
    }

    public boolean A0G() {
        if (!C107385bE.A09() || A02("android.permission.READ_PHONE_STATE") != -1) {
            return false;
        }
        return true;
    }

    public boolean A0H() {
        if (A08() || A0E()) {
            return false;
        }
        return true;
    }
}
