package X;

import com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9Gj  reason: invalid class name and case insensitive filesystem */
public class C191769Gj extends AnonymousClass5ZM {
    public final AnonymousClass9U4 A00;
    public final C160757oG A01;
    public final AnonymousClass9NP A02;
    public final WeakReference A03;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        int i;
        AnonymousClass9U4 r6 = this.A00;
        List A0A = AnonymousClass9U4.A03(r6).A0A();
        AnonymousClass9NP r0 = this.A02;
        if (r0 != null) {
            IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity = r0.A00;
            ArrayList A0s = AnonymousClass001.A0s();
            Iterator it = A0A.iterator();
            while (it.hasNext()) {
                C166587yw A0C = C1899693i.A0C(it);
                if (!indiaUpiBankAccountDetailsActivity.A07.A06(A0C)) {
                    A0s.add(A0C);
                }
            }
            A0A = A0s;
        }
        C160757oG r2 = this.A01;
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A1H("#methods=", A0o, A0A);
        C1899593h.A1F(r2, A0o);
        if (A0A.size() > 1) {
            i = 201;
        } else {
            i = 200;
            if (AnonymousClass9U4.A01(r6).A0N(1).size() > 0) {
                i = 202;
            }
        }
        return Integer.valueOf(i);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Number number = (Number) obj;
        AnonymousClass9NW r0 = (AnonymousClass9NW) this.A03.get();
        if (r0 != null) {
            C621433s.A01(r0.A00, number.intValue());
        }
    }

    public C191769Gj(AnonymousClass9U4 r2, C160757oG r3, AnonymousClass9NP r4, AnonymousClass9NW r5) {
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = AnonymousClass0x9.A14(r5);
    }
}
