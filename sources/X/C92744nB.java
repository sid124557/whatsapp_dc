package X;

import android.content.Context;

/* renamed from: X.4nB  reason: invalid class name and case insensitive filesystem */
public final class C92744nB extends C93124nw {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92744nB(Context context, AnonymousClass677 r3, C104285Qj r4, C30341mI r5) {
        super(context, r3, r4, r5);
        C162457s7.A0J(context, 1);
    }

    public void A26() {
        super.A26();
        AnonymousClass5ZU r0 = this.A0v;
        AnonymousClass3ZH r3 = this.A09;
        String A0H = r0.A0H(r3);
        if (this.A0v.A0e(r3, -1)) {
            if (r3.A0L() != null) {
                A0H = r3.A0L();
            } else {
                String str = r3.A0b;
                if (!(str == null || str.length() == 0)) {
                    A0H = AnonymousClass5ZU.A03(this.A0v, r3);
                }
            }
        }
        this.A06.setText(A0H);
    }
}
