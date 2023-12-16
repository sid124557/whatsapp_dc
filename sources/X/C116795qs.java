package X;

import android.view.View;

/* renamed from: X.5qs  reason: invalid class name and case insensitive filesystem */
public class C116795qs implements AnonymousClass66P {
    public final /* synthetic */ C88474Yw A00;
    public final /* synthetic */ AnonymousClass5YA A01;
    public final /* synthetic */ C104745Se A02;

    public C116795qs(C88474Yw r1, AnonymousClass5YA r2, C104745Se r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public void BbT(AnonymousClass5S1 r6) {
        AnonymousClass5YA r4;
        View view;
        boolean z;
        int i;
        AnonymousClass1VX r2 = this.A02.A01;
        C58422vE r1 = C58422vE.A01;
        if (r2.A0Y(r1, 6759)) {
            r4 = this.A01;
            view = this.A00.A03;
            z = r6.A00;
            i = 5;
        } else {
            boolean A0Y = r2.A0Y(r1, 6456);
            r4 = this.A01;
            C88474Yw r0 = this.A00;
            if (A0Y) {
                view = r0.A04;
                z = r6.A00;
                i = 4;
            } else {
                view = r0.A02;
                z = r6.A00;
                i = 0;
            }
        }
        r4.A04(view, i, z, true);
    }

    public void Bf2(AnonymousClass5S1 r6) {
        AnonymousClass1VX r2 = this.A02.A01;
        C58422vE r1 = C58422vE.A01;
        if (!r2.A0Y(r1, 6456) && !r2.A0Y(r1, 6759)) {
            this.A01.A05(this.A00.A05, 0, r6.A00, r6.A01);
        }
    }
}
