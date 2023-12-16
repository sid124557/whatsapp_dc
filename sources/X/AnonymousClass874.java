package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.874  reason: invalid class name */
public final class AnonymousClass874 implements C185608tx {
    public int A00;
    public int A01;
    public long A02;
    public boolean A03;
    public final List A04;
    public final C185598tw[] A05;

    public void B19(C187028wK r7, C151897Ws r8) {
        int i = 0;
        while (true) {
            C185598tw[] r4 = this.A05;
            if (i < r4.length) {
                AnonymousClass7G2 r3 = (AnonymousClass7G2) this.A04.get(i);
                r8.A02();
                r8.A03();
                C185598tw Br0 = r7.Br0(r8.A00, 3);
                C157057he A002 = C157057he.A00();
                r8.A03();
                A002.A0O = r8.A01;
                A002.A0R = "application/dvbsubs";
                A002.A0S = Collections.singletonList(r3.A01);
                A002.A0Q = r3.A00;
                C166527yp.A01(A002, Br0);
                r4[i] = Br0;
                i++;
            } else {
                return;
            }
        }
    }

    public void Bky() {
        this.A03 = false;
    }

    public void AzY(C161467pi r7) {
        boolean z = this.A03;
        if (z) {
            int i = this.A00;
            if (i == 2) {
                if (C161467pi.A00(r7) != 0) {
                    if (r7.A0C() != 32) {
                        this.A03 = false;
                        z = false;
                    }
                    i = 1;
                    this.A00 = 1;
                    if (!z) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (i == 1) {
                if (C161467pi.A00(r7) != 0) {
                    if (r7.A0C() != 0) {
                        this.A03 = false;
                        z = false;
                    }
                    this.A00 = 0;
                    if (!z) {
                        return;
                    }
                } else {
                    return;
                }
            }
            int i2 = r7.A01;
            int i3 = r7.A00 - i2;
            for (C185598tw Bkc : this.A05) {
                r7.A0S(i2);
                Bkc.Bkc(r7, i3);
            }
            this.A01 += i3;
        }
    }

    public void BgP() {
        if (this.A03) {
            for (C185598tw Bkh : this.A05) {
                Bkh.Bkh((AnonymousClass7WZ) null, 1, this.A01, 0, this.A02);
            }
            this.A03 = false;
        }
    }

    public void BgQ(long j, int i) {
        if ((i & 4) != 0) {
            this.A03 = true;
            this.A02 = j;
            this.A01 = 0;
            this.A00 = 2;
        }
    }

    public AnonymousClass874(List list) {
        this.A04 = list;
        this.A05 = new C185598tw[list.size()];
    }
}
