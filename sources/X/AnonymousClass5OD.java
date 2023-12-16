package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5OD  reason: invalid class name */
public class AnonymousClass5OD {
    public int A00;
    public int A01 = -1;
    public final AnonymousClass107 A02;
    public final String A03;
    public final /* synthetic */ AnonymousClass4UX A04;

    public AnonymousClass5OD(AnonymousClass4UX r2, String str, List list, int i) {
        this.A04 = r2;
        this.A00 = i;
        this.A03 = str;
        this.A02 = AnonymousClass4L0.A0O(list);
    }

    public boolean A00(C117015rF r9) {
        AnonymousClass107 r2 = this.A02;
        int indexOf = C86644Kx.A0h(r2).indexOf(r9);
        if (!C86644Kx.A0h(r2).remove(r9)) {
            return false;
        }
        this.A01 = indexOf;
        r2.A0H(r2.A07());
        AnonymousClass4UX r7 = this.A04;
        if (C86614Ku.A06(r2) != 0) {
            return true;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass107 r5 = r7.A06;
        int i = 1;
        for (AnonymousClass5OD r22 : C86644Kx.A0h(r5)) {
            if (this.A03.equals(r22.A03)) {
                r7.A00 = i;
            } else {
                r22.A00 = i;
                A0s.add(r22);
                i++;
            }
        }
        r5.A0H(A0s);
        return true;
    }
}
