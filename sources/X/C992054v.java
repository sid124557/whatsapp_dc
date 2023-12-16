package X;

import java.lang.ref.WeakReference;

/* renamed from: X.54v  reason: invalid class name and case insensitive filesystem */
public class C992054v extends AnonymousClass5ZM {
    public final C95814uZ A00;
    public final C55832qz A01;
    public final C105215Ua A02;
    public final C101955Gx A03;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C624134x r1;
        C102395Ir A002 = this.A02.A00(this.A00);
        if (A002 != null) {
            r1 = this.A01.A05(A002.A01);
        } else {
            r1 = null;
        }
        return new AnonymousClass5I8(r1, A002);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass5I8 r2 = (AnonymousClass5I8) obj;
        WeakReference weakReference = this.A03.A00;
        C626936e.A06(weakReference);
        C1227265m r0 = (C1227265m) weakReference.get();
        if (r0 != null) {
            r0.BaM(r2);
        }
    }

    public C992054v(C95814uZ r2, C55832qz r3, C1227265m r4, C105215Ua r5) {
        this.A01 = r3;
        this.A02 = r5;
        C626936e.A06(r4);
        this.A03 = new C101955Gx(r4);
        this.A00 = r2;
    }
}
