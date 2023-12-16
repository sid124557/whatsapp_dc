package X;

import android.graphics.Bitmap;

/* renamed from: X.6ed  reason: invalid class name and case insensitive filesystem */
public final class C132066ed extends C132086ef {
    public final int A00;
    public final Bitmap A01;
    public final String A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C132066ed) {
                C132066ed r5 = (C132066ed) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02) || this.A03 != r5.A03 || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x2.A01((C18300x5.A04(this.A01) + C18270x1.A00(this.A02)) * 31, this.A03) + this.A00;
    }

    public C132066ed(Bitmap bitmap, String str, int i, boolean z) {
        this.A01 = bitmap;
        this.A02 = str;
        this.A03 = z;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Data(bitmap=");
        A0o.append(this.A01);
        A0o.append(", emojis=");
        A0o.append(this.A02);
        A0o.append(", isSelected=");
        A0o.append(this.A03);
        A0o.append(", ringColor=");
        return C18260x0.A09(A0o, this.A00);
    }
}
