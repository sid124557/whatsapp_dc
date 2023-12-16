package X;

import java.util.HashSet;

/* renamed from: X.7Lq  reason: invalid class name and case insensitive filesystem */
public class C149257Lq {
    public int A00;
    public C180468l7 A01;
    public HashSet A02;
    public String[] A03;

    public C149257Lq(String[] strArr, int i) {
        C180468l7 r0;
        int length = strArr.length;
        if (length < 3) {
            throw AnonymousClass001.A0c("Annotation conditions should have at least 3 elements");
        } else if (i >= 0) {
            String str = strArr[1];
            if (str.equals("any")) {
                r0 = new AnonymousClass840();
            } else if (str.equals("all")) {
                r0 = new C1680683z();
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("'");
                A0o.append(str);
                throw AnonymousClass000.A0F("' is not a valid operation", A0o);
            }
            this.A01 = r0;
            int i2 = length - 2;
            String[] strArr2 = new String[i2];
            this.A03 = strArr2;
            for (int i3 = 0; i3 < i2; i3++) {
                strArr2[i3] = strArr[i3 + 2];
            }
            this.A02 = AnonymousClass002.A0K();
            this.A00 = i;
        } else {
            throw AnonymousClass000.A0G("Fallback sampling rate < 0: ", AnonymousClass001.A0o(), i);
        }
    }
}
