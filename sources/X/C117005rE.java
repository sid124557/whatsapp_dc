package X;

import java.util.ArrayList;

/* renamed from: X.5rE  reason: invalid class name and case insensitive filesystem */
public class C117005rE implements Cloneable {
    public final C64773Ex A00;
    public final AnonymousClass5ZU A01;
    public final C56612sH A02;
    public final AnonymousClass1VX A03;
    public final ArrayList A04 = AnonymousClass001.A0s();

    public int A00() {
        ArrayList arrayList = this.A04;
        if (arrayList.isEmpty()) {
            return 3;
        }
        AnonymousClass3ZF A0P = AnonymousClass4L0.A0P(arrayList, 0);
        if (A0P.A0I != null) {
            if (A0P.A00 == 5) {
                return 4;
            }
            return 5;
        } else if (A0P.A0E.A03) {
            return 0;
        } else {
            int i = A0P.A00;
            if (i == 5 || i == 6) {
                return 1;
            }
            return 2;
        }
    }

    public long A01() {
        ArrayList arrayList = this.A04;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return this.A02.A0I(((AnonymousClass3ZF) AnonymousClass0x9.A0t(arrayList)).A0B);
    }

    public AnonymousClass3ZH A02() {
        ArrayList arrayList = this.A04;
        if (!arrayList.isEmpty()) {
            return this.A00.A0A(((AnonymousClass3ZF) AnonymousClass0x9.A0t(arrayList)).A0E.A01);
        }
        return null;
    }

    public String A03() {
        ArrayList arrayList = this.A04;
        if (arrayList.isEmpty()) {
            return null;
        }
        AnonymousClass3ZF r1 = (AnonymousClass3ZF) AnonymousClass0x9.A0t(arrayList);
        boolean A0L = r1.A0L();
        StringBuilder A0o = AnonymousClass001.A0o();
        if (A0L) {
            A0o.append("G:");
            AnonymousClass39J r12 = r1.A0E;
            A0o.append(C627336j.A07(r12.A01));
            A0o.append(r12.A03);
            A0o.append(r12.A02);
            A0o.append(r12.A00);
        } else {
            A0o.append("O:");
            A0o.append(C627336j.A07(r1.A0E.A01));
            A0o.append(r1.A0B);
        }
        return A0o.toString();
    }

    public boolean A04() {
        ArrayList arrayList = this.A04;
        if (arrayList.isEmpty() || !AnonymousClass4L0.A0P(arrayList, 0).A0L()) {
            return false;
        }
        return true;
    }

    public boolean A05() {
        ArrayList arrayList = this.A04;
        if (arrayList.isEmpty() || !AnonymousClass4L0.A0P(arrayList, 0).A0L) {
            return false;
        }
        return true;
    }

    public boolean A06(AnonymousClass3ZF r7, boolean z) {
        Object obj;
        Object obj2;
        ArrayList arrayList = this.A04;
        if (arrayList.isEmpty()) {
            return true;
        }
        AnonymousClass3ZF A0P = AnonymousClass4L0.A0P(arrayList, AnonymousClass0x9.A03(arrayList, 1));
        if ((z || (!r7.A0L() && !A0P.A0L())) && C107175ap.A05(r7.A0B, A0P.A0B)) {
            if (z) {
                obj = r7.A05;
                obj2 = A0P.A05;
            } else {
                obj = r7.A0E.A01;
                obj2 = A0P.A0E.A01;
            }
            if (!AnonymousClass75J.A00(obj, obj2) || !AnonymousClass75J.A00(r7.A07, A0P.A07) || r7.A0Q() != A0P.A0Q() || r7.A0L != A0P.A0L || r7.A0O() != A0P.A0O() || ((r7.A0N() != A0P.A0N() && this.A03.A0X(1972)) || ((r7.A0P() != A0P.A0P() && this.A03.A0X(6307)) || !AnonymousClass75J.A00(r7.A0J, A0P.A0J)))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public String toString() {
        AnonymousClass3ZH A022;
        if (this.A04.isEmpty() || (A022 = A02()) == null) {
            return null;
        }
        return this.A01.A0H(A022);
    }

    public C117005rE(C64773Ex r2, AnonymousClass5ZU r3, C56612sH r4, AnonymousClass1VX r5) {
        this.A02 = r4;
        this.A03 = r5;
        this.A00 = r2;
        this.A01 = r3;
    }

    public Object clone() {
        return super.clone();
    }
}
