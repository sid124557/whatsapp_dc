package X;

import android.content.Context;
import android.os.Looper;

/* renamed from: X.7Pu  reason: invalid class name and case insensitive filesystem */
public final class C150227Pu {
    public Looper A00;
    public C158037jK A01;
    public AnonymousClass80g A02;
    public C186588vc A03;
    public C157027hb A04 = new C157027hb();
    public C181318mZ A05;
    public C181318mZ A06;
    public C181318mZ A07;
    public C181318mZ A08;
    public boolean A09;
    public final Context A0A;

    public C150227Pu(Context context) {
        C1450573z r4 = new C1450573z(1);
        C1454675z r3 = new C1454675z(context, 2);
        C1450573z r2 = new C1450573z(0);
        C1454675z r1 = new C1454675z(context, 3);
        this.A0A = context;
        this.A07 = r4;
        this.A08 = r3;
        this.A06 = r2;
        this.A05 = r1;
        Looper myLooper = Looper.myLooper();
        this.A00 = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.A02 = AnonymousClass80g.A02;
        this.A01 = C158037jK.A03;
        this.A03 = C186588vc.A00;
    }
}
