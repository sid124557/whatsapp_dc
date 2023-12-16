package X;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: X.6pt  reason: invalid class name and case insensitive filesystem */
public class C138176pt extends AnonymousClass5ZM {
    public final C620733j A00;
    public final WeakReference A01;
    public final WeakReference A02;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C85164Fe[] r5 = (C85164Fe[]) objArr;
        C626936e.A06(r5);
        C626936e.A0B(AnonymousClass001.A1T(r5.length));
        C85164Fe r2 = r5[0];
        C626936e.A06(r2);
        Context context = (Context) this.A01.get();
        if (context == null) {
            return null;
        }
        return r2.B13(context, this.A00, false);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C105425Uw r3 = (C105425Uw) obj;
        AnonymousClass6Hm r1 = (AnonymousClass6Hm) this.A02.get();
        if (r3 != null && r1 != null) {
            if (r3.A0Q()) {
                r3.A0J(r1.A05.A01);
            }
            C158927km r12 = r1.A05;
            r3.A0G(r12.A00);
            r12.A0I.BbR(r3);
        }
    }

    public C138176pt(Context context, C620733j r3, AnonymousClass6Hm r4) {
        this.A00 = r3;
        this.A01 = AnonymousClass0x9.A14(context);
        this.A02 = AnonymousClass0x9.A14(r4);
    }
}
