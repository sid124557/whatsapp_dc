package X;

import android.content.Context;
import android.content.res.Resources;
import java.io.File;

/* renamed from: X.2oU  reason: invalid class name and case insensitive filesystem */
public class C54292oU {
    public Context A00;

    public static Resources A00(C54292oU r0) {
        return r0.A00.getResources();
    }

    public static File A01(C64393Dh r0) {
        return r0.A01.A00.getFilesDir();
    }

    public static File A02(C54292oU r0) {
        return r0.A00.getCacheDir();
    }

    public static File A03(C54292oU r0) {
        return r0.A00.getFilesDir();
    }

    public static String A05(C54292oU r0, Object obj, Object[] objArr, int i, int i2) {
        objArr[i] = obj;
        return r0.A09(i2, objArr);
    }

    public C54292oU(Context context) {
        this.A00 = context;
    }

    public static String A04(C54292oU r0, int i) {
        String A08 = r0.A08(i);
        C162457s7.A0D(A08);
        return A08;
    }

    public Context A06() {
        return this.A00;
    }

    public Resources A07() {
        return A00(this);
    }

    public String A08(int i) {
        return A00(this).getString(i);
    }

    public String A09(int i, Object... objArr) {
        return A00(this).getString(i, objArr);
    }
}
