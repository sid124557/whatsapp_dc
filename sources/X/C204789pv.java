package X;

import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: X.9pv  reason: invalid class name and case insensitive filesystem */
public class C204789pv implements C202639mL {
    public Object A00;
    public Object A01;
    public final int A02;

    public C204789pv(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void BaT(AnonymousClass34V r6, String str) {
        if (this.A02 != 0) {
            C166587yw r3 = (C166587yw) this.A00;
            C197709dk r2 = (C197709dk) this.A01;
            AnonymousClass99I r1 = (AnonymousClass99I) r3.A08;
            if (str == null || str.length() == 0 || r1 == null) {
                throw AnonymousClass001.A0g("fun buildPrepData tokenId must not be null");
            }
            r1.A06 = str;
            r2.A02 = str;
            AnonymousClass9U4.A00(r2.A0A).A03((C202439m1) null, r3);
            return;
        }
        C194359So r4 = (C194359So) this.A00;
        C166587yw r32 = (C166587yw) this.A01;
        AnonymousClass99I r12 = (AnonymousClass99I) r32.A08;
        if (TextUtils.isEmpty(str) || r12 == null) {
            r4.A0A.BQz((C133736hr) null, C1899693i.A0M(), (ArrayList) null, false);
            return;
        }
        r12.A06 = str;
        AnonymousClass9U4.A00(r4.A09).A03(new AnonymousClass9WS(r32, 4, r4), r32);
    }
}
