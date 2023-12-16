package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.87J  reason: invalid class name */
public final class AnonymousClass87J implements C178108gz {
    public final List A00;

    public final List A00(AnonymousClass7M6 r13) {
        ArrayList arrayList;
        boolean z;
        String str;
        int i;
        List list;
        C161467pi r9 = new C161467pi(r13.A03);
        List list2 = this.A00;
        while (C161467pi.A00(r9) > 0) {
            int A0C = r9.A0C();
            int A0C2 = r9.A01 + r9.A0C();
            if (A0C == 134) {
                ArrayList A0s = AnonymousClass001.A0s();
                int A0C3 = r9.A0C() & 31;
                for (int i2 = 0; i2 < A0C3; i2++) {
                    String A0O = r9.A0O(3);
                    int A0C4 = r9.A0C();
                    boolean z2 = true;
                    if ((A0C4 & 128) != 0) {
                        z = true;
                        i = A0C4 & 63;
                        str = "application/cea-708";
                    } else {
                        z = false;
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte A0C5 = (byte) r9.A0C();
                    r9.A0T(1);
                    if (z) {
                        if ((A0C5 & 64) == 0) {
                            z2 = false;
                        }
                        byte[] bArr = new byte[1];
                        if (z2) {
                            bArr[0] = 1;
                        } else {
                            bArr[0] = 0;
                        }
                        list = Collections.singletonList(bArr);
                    } else {
                        list = null;
                    }
                    C157057he A002 = C157057he.A00();
                    A002.A0R = str;
                    A002.A0Q = A0O;
                    A002.A02 = i;
                    A002.A0S = list;
                    A0s.add(C166527yp.A00(A002));
                }
                arrayList = A0s;
            } else {
                arrayList = list2;
            }
            r9.A0S(A0C2);
            list2 = arrayList;
        }
        return list2;
    }

    public AnonymousClass87J(int i) {
        this.A00 = C129586aY.of();
    }

    public AnonymousClass87J() {
        this(0);
    }
}
