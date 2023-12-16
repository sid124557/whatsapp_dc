package X;

import android.graphics.Rect;

/* renamed from: X.7az  reason: invalid class name and case insensitive filesystem */
public final class C153287az {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C153287az) {
                C153287az r5 = (C153287az) obj;
                if (!(this.A04 == r5.A04 && this.A05 == r5.A05 && this.A01 == r5.A01 && this.A00 == r5.A00 && this.A02 == r5.A02 && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Rect A00(boolean z) {
        int i;
        int i2;
        int i3;
        if (z) {
            i = this.A01;
            if (i == 0) {
                i = this.A02;
            }
            i2 = this.A05;
            i3 = this.A04;
        } else {
            int i4 = this.A04;
            if (i4 == 0) {
                i4 = this.A02;
            }
            i2 = this.A05;
            i3 = this.A01;
        }
        if (i3 == 0) {
            i3 = this.A03;
        }
        return new Rect(i, i2, i3, this.A00);
    }

    public int hashCode() {
        return (((((((((this.A04 * 31) + this.A05) * 31) + this.A01) * 31) + this.A00) * 31) + this.A02) * 31) + this.A03;
    }

    public C153287az(int i, int i2, int i3, int i4, int i5, int i6) {
        this.A04 = i;
        this.A05 = i2;
        this.A01 = i3;
        this.A00 = i4;
        this.A02 = i5;
        this.A03 = i6;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Insets(start=");
        A0o.append(this.A04);
        A0o.append(", top=");
        A0o.append(this.A05);
        A0o.append(", end=");
        A0o.append(this.A01);
        A0o.append(", bottom=");
        A0o.append(this.A00);
        A0o.append(", left=");
        A0o.append(this.A02);
        A0o.append(", right=");
        return C18260x0.A09(A0o, this.A03);
    }
}
