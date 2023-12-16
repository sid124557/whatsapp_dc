package X;

import android.text.TextUtils;

/* renamed from: X.7VU  reason: invalid class name */
public final class AnonymousClass7VU {
    public final String A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || obj.getClass() != AnonymousClass7VU.class) {
                return false;
            }
            AnonymousClass7VU r5 = (AnonymousClass7VU) obj;
            if (!TextUtils.equals(this.A00, r5.A00) || this.A01 != r5.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((this.A00.hashCode() + 31) * 31) + AnonymousClass6C9.A05(this.A01 ? 1 : 0)) * 31) + 1237;
    }

    public AnonymousClass7VU(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }
}
