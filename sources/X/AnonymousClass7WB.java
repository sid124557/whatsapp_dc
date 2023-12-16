package X;

import android.text.TextUtils;

/* renamed from: X.7WB  reason: invalid class name */
public final class AnonymousClass7WB {
    public final String A00;
    public final boolean A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || obj.getClass() != AnonymousClass7WB.class) {
                return false;
            }
            AnonymousClass7WB r5 = (AnonymousClass7WB) obj;
            if (!(TextUtils.equals(this.A00, r5.A00) && this.A01 == r5.A01 && this.A02 == r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = (((this.A00.hashCode() + 31) * 31) + AnonymousClass6C9.A05(this.A01 ? 1 : 0)) * 31;
        if (!this.A02) {
            i = 1237;
        }
        return hashCode + i;
    }

    public AnonymousClass7WB(String str, boolean z, boolean z2) {
        this.A00 = str;
        this.A01 = z;
        this.A02 = z2;
    }
}
