package X;

import android.text.TextUtils;

/* renamed from: X.5Pm  reason: invalid class name and case insensitive filesystem */
public final class C104065Pm {
    public final CharSequence A00;
    public final CharSequence A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C104065Pm.class != obj.getClass()) {
                return false;
            }
            C104065Pm r5 = (C104065Pm) obj;
            if (!TextUtils.equals(this.A00, r5.A00) || !TextUtils.equals(this.A01, r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A04 = C18280x3.A04(this.A00) * 31;
        CharSequence charSequence = this.A01;
        if (charSequence != null) {
            i = charSequence.hashCode();
        }
        return A04 + i;
    }

    public C104065Pm(CharSequence charSequence, CharSequence charSequence2) {
        this.A00 = charSequence;
        this.A01 = charSequence2;
    }
}
