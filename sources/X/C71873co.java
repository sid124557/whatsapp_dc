package X;

import java.util.Comparator;

/* renamed from: X.3co  reason: invalid class name and case insensitive filesystem */
public class C71873co implements Comparator {
    public final C64773Ex A00;
    public final AnonymousClass5ZU A01;

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C64773Ex r1 = this.A00;
        AnonymousClass3ZH A0A = r1.A0A(((AnonymousClass3ZE) obj).A02);
        AnonymousClass3ZH A0A2 = r1.A0A(((AnonymousClass3ZE) obj2).A02);
        C51602k5 r4 = A0A.A0F;
        boolean z = false;
        boolean A1W = AnonymousClass000.A1W(r4);
        if (A0A2.A0F != null) {
            z = true;
        }
        if (A1W == z) {
            AnonymousClass5ZU r0 = this.A01;
            String A0H = r0.A0H(A0A);
            String A0H2 = r0.A0H(A0A2);
            if (A0H == null) {
                return -1;
            }
            if (A0H2 != null) {
                return A0H.compareTo(A0H2);
            }
            return 1;
        } else if (r4 != null) {
            return -1;
        } else {
            return 1;
        }
    }

    public C71873co(C64773Ex r1, AnonymousClass5ZU r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
