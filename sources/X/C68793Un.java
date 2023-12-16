package X;

import android.text.TextUtils;
import java.io.File;

/* renamed from: X.3Un  reason: invalid class name and case insensitive filesystem */
public class C68793Un implements C185938uU {
    public final /* synthetic */ AnonymousClass1I7 A00;

    public void BRZ(int i) {
        if (i == 1) {
            this.A00.A0h.A07();
        } else if (i == 2) {
            C56852sf r7 = this.A00.A0h;
            long j = r7.A0A;
            if (j != -1 && r7.A01() != -1) {
                r7.A0H = AnonymousClass0x7.A0E(j);
                r7.A03 = 2;
            }
        } else if (i == 3) {
            this.A00.A0h.A09();
        }
    }

    public C68793Un(AnonymousClass1I7 r1) {
        this.A00 = r1;
    }

    public void BNz(C56742sU r5, long j) {
        long j2;
        AnonymousClass1I7 r3 = this.A00;
        r3.A0o.A06(1);
        synchronized (r5) {
            j2 = r5.A06;
        }
        r3.A0C(j2);
        r3.A0d.A0B(j2);
        r3.A0h.A0A(j2, j);
        AnonymousClass5LM r0 = r3.A01;
        if (r0 != null) {
            r0.A0A = j2;
        }
    }

    public void BTP(C56742sU r1) {
    }

    public void BXg(File file, boolean z) {
        AnonymousClass1I7 r4 = this.A00;
        C56902sk A02 = r4.A0d.A02();
        synchronized (A02) {
            A02.A05 = Boolean.FALSE;
            A02.A06 = Boolean.valueOf(z);
            A02.A02 = new C625435m(23);
        }
        String str = r4.A0e.A0J;
        String str2 = "enc";
        if (str != null) {
            String A022 = C106695a0.A02(str);
            if (!TextUtils.isEmpty(A022)) {
                str2 = A022;
            }
        }
        r4.A0I(A02, file, str2, true);
        r4.A04 = A02.A03();
        r4.A0J.A05(new C51802kP(A02, z));
    }

    public void Ba6() {
        this.A00.A0B();
    }

    public void BRa(C56742sU r7) {
        if (r7.A00() == 4) {
            C56852sf r5 = this.A00.A0h;
            if (!r5.A0C()) {
                r5.A07();
            }
            if (r5.A02() == -1) {
                r5.A09();
            }
        }
    }
}
