package X;

import android.view.View;

/* renamed from: X.54Y  reason: invalid class name */
public class AnonymousClass54Y extends AnonymousClass5ZM {
    public final AnonymousClass7DL A00;
    public final AnonymousClass5O9 A01;

    public AnonymousClass54Y(C15910sA r2, AnonymousClass7DL r3, AnonymousClass5O9 r4) {
        super(r2, true);
        this.A01 = r4;
        this.A00 = r3;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C186308v5 A04 = AnonymousClass5ZM.A04(this.A01, (String) null, 7, false);
        if (!C18320x8.A1T(this)) {
            return A04;
        }
        A04.close();
        return null;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass5UD r2;
        C186308v5 r5 = (C186308v5) obj;
        AnonymousClass5ZS r3 = this.A00.A00;
        r3.A0i.A02 = r5;
        if (r3.A0R) {
            if (!(r5 == null || (r2 = r3.A0F) == null)) {
                AnonymousClass4X4 r1 = r2.A04;
                if (r1 != null) {
                    r1.A06.A02();
                    C186308v5 r0 = r1.A00;
                    if (r0 != null) {
                        r0.close();
                        r1.A00 = null;
                    }
                    r1.A00 = r5;
                    r1.A05();
                }
                View view = r2.A01;
                if (view != null) {
                    view.setVisibility(AnonymousClass001.A08(r2.A0C ? 1 : 0));
                }
            }
            C08310eF r12 = r3.A0Z;
            if (r12 instanceof C185038sx) {
                ((C185038sx) r12).BiW();
            }
        }
    }
}
