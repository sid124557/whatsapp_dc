package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5jS  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C112265jS implements C181948nc {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass7H9 A01;
    public final /* synthetic */ AnonymousClass5WC A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ boolean A04;

    public final void BZM() {
        int i;
        int i2;
        AnonymousClass5WC r5 = this.A02;
        boolean z = this.A04;
        List list = this.A03;
        int i3 = this.A00;
        AnonymousClass7H9 r4 = this.A01;
        if (z) {
            i = list.size();
        } else {
            i = 14;
            if (i3 == 2) {
                i = 5;
            }
        }
        List list2 = r5.A04;
        int min = Math.min(i, C86654Ky.A06(list, 150 - list2.size()));
        list2.addAll(list.subList(0, min));
        r5.A01 = list.subList(min, Math.min(list.size(), 150));
        ArrayList A0J = AnonymousClass002.A0J(list2);
        C112305jW r3 = r4.A01;
        AnonymousClass5TI r1 = r4.A00;
        AnonymousClass5LW r2 = r3.A0B;
        List list3 = r1.A06;
        r2.A05 = new AnonymousClass5TI(r1.A00, r1.A01, r1.A03, r1.A05, r1.A04, r1.A02, r1.A07, list3, A0J, r1.A08);
        r2.A0H |= AnonymousClass000.A1U(A0J.size(), 150);
        r3.A0B(1);
        if (!r2.A05.A09.isEmpty() || !r2.A05.A06.isEmpty()) {
            int i4 = 1;
            if (r2.A00 > 0) {
                i4 = 7;
            }
            r2.A03 = i4;
            r3.A06();
            r3.A0A();
            r2.A00++;
            r3.A0D(r1);
            if (r3.A05 != 0 && 5 == A0J.size()) {
                i2 = 10;
            } else {
                return;
            }
        } else {
            i2 = 6;
        }
        r2.A03 = i2;
        r3.A06();
    }

    public /* synthetic */ C112265jS(AnonymousClass7H9 r1, AnonymousClass5WC r2, List list, int i, boolean z) {
        this.A02 = r2;
        this.A04 = z;
        this.A03 = list;
        this.A00 = i;
        this.A01 = r1;
    }
}
