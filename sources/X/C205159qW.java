package X;

import com.whatsapp.R;

/* renamed from: X.9qW  reason: invalid class name and case insensitive filesystem */
public class C205159qW implements C202489m6 {
    public Object A00;
    public final int A01;

    public C205159qW(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BZj(AnonymousClass34V r6) {
        int i;
        if (this.A01 != 0) {
            C1902094n r4 = (C1902094n) this.A00;
            if (r6 != null) {
                C69263Wi r3 = r4.A0B;
                r3.A0D();
                int i2 = r6.A00;
                int i3 = R.string.f11nameremoved;
                if (i2 == 443) {
                    i3 = R.string.f11nameremoved;
                }
                r3.A0H(i3, 0);
                r4.A09.A0G(new AnonymousClass9QE(1));
                return;
            }
            r4.A0M.BkM(new C199679gy(r4));
            return;
        }
        C191739Gg r32 = (C191739Gg) this.A00;
        if (r6 == null || (i = r6.A00) != 11495) {
            C202489m6 r0 = r32.A02;
            if (r0 != null) {
                r0.BZj(r6);
                return;
            }
            return;
        }
        C18260x0.A0y("PAY: reject collect; error code: ", AnonymousClass001.A0o(), i);
        C196659bX r2 = r32.A03;
        r2.A0D.BkM(new C198819fX(r32));
        r2.A00.A0D();
        C621433s.A01(r32.A00, 100);
    }
}
