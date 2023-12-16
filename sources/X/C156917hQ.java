package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

/* renamed from: X.7hQ  reason: invalid class name and case insensitive filesystem */
public final class C156917hQ {
    public static final AnonymousClass6QU A07;
    public static final AnonymousClass72H A08;
    @Deprecated
    public static final C148727Jm A09;
    public C143026yD A00;
    public final int A01;
    public final Context A02;
    public final C178328hM A03;
    public final C178338hN A04;
    public final C178448hY A05;
    public final String A06;

    static {
        AnonymousClass72H r3 = new AnonymousClass72H();
        A08 = r3;
        AnonymousClass6QH r2 = new AnonymousClass6QH();
        A07 = r2;
        A09 = new C148727Jm(r2, r3, "ClearcutLogger.API");
    }

    public C156917hQ(Context context) {
        C127046Qk r7 = new C127046Qk(context);
        C1695689u r6 = C1695689u.A00;
        C1693288w r5 = new C1693288w(context);
        C143026yD r4 = C143026yD.DEFAULT;
        this.A00 = r4;
        this.A02 = context;
        this.A06 = context.getPackageName();
        int i = 0;
        try {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            Log.wtf("ClearcutLogger", "This can't happen.", e);
        }
        this.A01 = i;
        this.A04 = r7;
        this.A05 = r6;
        this.A00 = r4;
        this.A03 = r5;
    }
}
