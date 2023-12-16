package X;

import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.9ok  reason: invalid class name and case insensitive filesystem */
public class C204059ok implements C202539mB {
    public Object A00;
    public Object A01;
    public final int A02;

    public C204059ok(C52792m3 r1, BrazilPayBloksActivity brazilPayBloksActivity, int i) {
        this.A02 = i;
        this.A00 = brazilPayBloksActivity;
        this.A01 = r1;
    }

    public final void BQz(C133736hr r19, AnonymousClass34V r20, ArrayList arrayList, boolean z) {
        C194569Tl A002;
        C195209Wo r12;
        C133736hr r4 = r19;
        ArrayList arrayList2 = arrayList;
        boolean z2 = z;
        AnonymousClass34V r2 = r20;
        if (this.A02 != 0) {
            BrazilPayBloksActivity brazilPayBloksActivity = (BrazilPayBloksActivity) this.A00;
            C52792m3 r3 = (C52792m3) this.A01;
            if (r20 != null) {
                AnonymousClass9Bw.A0c(r3, (Map) null, r2.A00);
            } else {
                AnonymousClass9U4.A00(brazilPayBloksActivity.A0F).A03(new C196489av(r3, r4, brazilPayBloksActivity, arrayList2, z2), r4);
            }
        } else {
            AnonymousClass9Bw r10 = (AnonymousClass9Bw) this.A00;
            C52792m3 r8 = (C52792m3) this.A01;
            HashMap A0t = AnonymousClass001.A0t();
            if (r20 != null) {
                C1899693i.A0v(A0t, r2.A00);
                r8.A01("on_failure", A0t);
                return;
            }
            A0t.put("verified_state", C1899693i.A0Z(z2 ? 1 : 0));
            if (z) {
                A002 = AnonymousClass9U4.A00(r10.A0F);
                r12 = new C195209Wo(r8, r4, r10, A0t, 1);
            } else if (r19 == null || arrayList == null || arrayList2.isEmpty()) {
                AnonymousClass9Bw.A0c(r8, (Map) null, -233);
                return;
            } else {
                A002 = AnonymousClass9U4.A00(r10.A0F);
                r12 = new C195209Wo(A0t, arrayList2, r10, r8, 2);
            }
            A002.A03(r12, r4);
        }
    }
}
