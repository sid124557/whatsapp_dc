package X;

import com.whatsapp.R;

/* renamed from: X.5qQ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C116525qQ implements C183328pr {
    public final /* synthetic */ C985551i A00;

    public final void BSK(String str, boolean z, String str2) {
        C985551i r4 = this.A00;
        AnonymousClass51x r3 = r4.A05.A00;
        if (r3.A06) {
            if (str == null) {
                r4.A01.A0H(R.string.f11nameremoved, 0);
            } else {
                r4.A01.A0P(str, 0);
            }
        }
        if (!z) {
            r4.A0F();
            r4.A0H();
            r4.A0C();
            AnonymousClass564 r1 = new AnonymousClass564(r4.A0G, r4.A0B);
            r4.A02 = r1;
            if (r3.A06) {
                r1.A0F();
            }
        }
    }

    public /* synthetic */ C116525qQ(C985551i r1) {
        this.A00 = r1;
    }
}
