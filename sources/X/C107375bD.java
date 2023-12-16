package X;

import android.os.Bundle;

/* renamed from: X.5bD  reason: invalid class name and case insensitive filesystem */
public class C107375bD implements C15900s9 {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public C107375bD(C89644eZ r1, AnonymousClass5S5 r2, C106995aW r3, AnonymousClass662 r4, C95814uZ r5, int i) {
        this.A05 = i;
        if (i != 0) {
            this.A00 = r5;
            this.A01 = r3;
            this.A02 = r4;
            this.A03 = r2;
            this.A04 = r1;
            return;
        }
        this.A00 = r3;
        this.A01 = r1;
        this.A02 = r5;
        this.A03 = r4;
        this.A04 = r2;
    }

    public final void BTp(String str, Bundle bundle) {
        Bundle bundle2 = bundle;
        if (this.A05 != 0) {
            C106995aW r4 = (C106995aW) this.A01;
            AnonymousClass662 r5 = (AnonymousClass662) this.A02;
            AnonymousClass5S5 r3 = (AnonymousClass5S5) this.A03;
            C106995aW.A03(bundle2, (C89644eZ) this.A04, r3, r4, r5, (C95814uZ) this.A00);
            return;
        }
        C89644eZ r2 = (C89644eZ) this.A01;
        AnonymousClass662 r52 = (AnonymousClass662) this.A03;
        C106995aW.A02(bundle2, r2, (AnonymousClass5S5) this.A04, (C106995aW) this.A00, r52, (C95814uZ) this.A02);
    }
}
