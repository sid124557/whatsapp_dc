package X;

import android.text.TextUtils;

/* renamed from: X.2k5  reason: invalid class name and case insensitive filesystem */
public class C51602k5 {
    public final long A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            C51602k5 r7 = (C51602k5) obj;
            if (this.A00 != r7.A00 || !TextUtils.equals(this.A01, r7.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i;
        int A02 = AnonymousClass0x2.A02(this.A00);
        String str = this.A01;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return A02 + i;
    }

    public C51602k5(long j, String str) {
        this.A00 = j;
        this.A01 = str;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(this.A00);
        A0o.append(":");
        return AnonymousClass000.A0X(C107575bX.A0B(this.A01, 4), A0o);
    }
}
