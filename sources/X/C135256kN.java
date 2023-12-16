package X;

import android.content.Context;

/* renamed from: X.6kN  reason: invalid class name and case insensitive filesystem */
public class C135256kN extends C135266kO {
    public final C64393Dh A00;
    public final C620733j A01;
    public final AnonymousClass5Y0 A02;
    public final AnonymousClass33O A03;

    public void A08(Context context, C182548ob r12, AnonymousClass65N r13, String str) {
        C182548ob r6 = r12;
        String str2 = str;
        if (str == null) {
            r12.BVW((C106985aV) null);
            return;
        }
        Context context2 = context;
        C135386ka r1 = new C135386ka(context2, this.A00, this.A01, this.A02, r6, r13, this.A03, str2);
        A02(r1.A03, r1);
    }

    public void A09(Context context, AnonymousClass65N r9, String str) {
        String str2 = str;
        if (str != null) {
            C135376kZ r1 = new C135376kZ(context, this.A00, this.A02, r9, str2);
            A02(r1.A03, r1);
        }
    }

    public C135256kN(C64393Dh r3, C620733j r4, AnonymousClass5Y0 r5, AnonymousClass33O r6, AnonymousClass4FS r7) {
        super(new AnonymousClass7Hk(r7, "ProcessDoodleQueue"));
        this.A00 = r3;
        this.A02 = r5;
        this.A01 = r4;
        this.A03 = r6;
    }
}
