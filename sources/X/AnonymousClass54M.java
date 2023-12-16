package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.54M  reason: invalid class name */
public class AnonymousClass54M extends AnonymousClass5ZM {
    public final String A00;
    public final ArrayList A01;
    public final List A02;
    public final boolean A03;
    public final /* synthetic */ C113245l7 A04;

    public AnonymousClass54M(C113245l7 r1, String str, ArrayList arrayList, List list, boolean z) {
        this.A04 = r1;
        this.A02 = list;
        this.A01 = arrayList;
        this.A03 = z;
        this.A00 = str;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C113245l7 r5 = this.A04;
        C66543Lv r4 = r5.A3g;
        List<AnonymousClass2z0> list = this.A02;
        ArrayList A0s = AnonymousClass001.A0s();
        for (AnonymousClass2z0 A05 : list) {
            C624134x A052 = r4.A2D.A05(A05);
            if (A052 != null) {
                A0s.add(A052);
            }
        }
        ArrayList A0J = AnonymousClass002.A0J(A0s);
        C621033m A08 = C113245l7.A08(r5);
        AnonymousClass5Ul r2 = r5.A1f;
        ArrayList A0J2 = AnonymousClass002.A0J(A0J);
        AnonymousClass6A6.A00(A0J2, 8);
        A08.A09(r2, (C108845de) null, this.A00, A0J2, this.A01, this.A03);
        return null;
    }
}
