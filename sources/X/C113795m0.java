package X;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: X.5m0  reason: invalid class name and case insensitive filesystem */
public final class C113795m0 implements C836849j {
    public final Context A00;
    public final C57542to A01;

    public void BYP(C134256ih r2) {
        C162457s7.A0J(r2, 0);
        PackageManager packageManager = this.A00.getPackageManager();
        C162457s7.A0D(packageManager);
        Integer A002 = C57542to.A00(packageManager);
        if (A002 != null) {
            r2.A0q = C18280x3.A0U(A002);
        }
    }

    public C113795m0(Context context, C57542to r2) {
        this.A00 = context;
        this.A01 = r2;
    }
}
