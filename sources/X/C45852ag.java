package X;

import android.app.Activity;
import android.content.Context;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2ag  reason: invalid class name and case insensitive filesystem */
public final class C45852ag {
    public final C69263Wi A00;
    public final C621033m A01;
    public final C52472lX A02;
    public final C104295Qk A03;

    public final void A00(Context context, List list, boolean z) {
        C162457s7.A0J(context, 1);
        if (C18310x6.A1X(list)) {
            C95814uZ r1 = C18320x8.A0R(list, 0).A1J.A00;
            if (C627336j.A0K(r1) && this.A02.A02(r1)) {
                if (z) {
                    this.A00.A0F(R.string.f11nameremoved, 1);
                    return;
                }
                return;
            }
        }
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object next : list) {
            C30471mV r3 = (C30471mV) next;
            if (C383527f.A00(r3)) {
                C104295Qk r0 = this.A03;
                C626936e.A06(r0);
                r0.A00(r3);
            } else {
                AnonymousClass33C A002 = C30471mV.A00(r3);
                if (!A002.A0R && !A002.A0c && r3.A22() && A002.A07 != 1) {
                    A0s.add(next);
                }
            }
        }
        C621033m r32 = this.A01;
        Activity A022 = C111095hX.A02(context);
        AnonymousClass0x9.A1L(A022);
        if (A0s.size() != 0) {
            C56512s6 r9 = r32.A0T;
            C61072zf r10 = r32.A0b;
            if (r9.A08(new AnonymousClass3FE(A022, r10))) {
                C28161fn r5 = new C28161fn(A022, r32.A02, r32.A0P, r9, r10, C627636p.A03(r32.A0j, (C624134x) A0s.get(0)), r32.A1A);
                Iterator it = A0s.iterator();
                while (it.hasNext()) {
                    r32.A1M.A06(r5, C18320x8.A0S(it), 0);
                }
            }
        }
    }

    public C45852ag(C69263Wi r1, C621033m r2, C52472lX r3, C104295Qk r4) {
        C18260x0.A0c(r1, r3, r4, r2);
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
    }
}
