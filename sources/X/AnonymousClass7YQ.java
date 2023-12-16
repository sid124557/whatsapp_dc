package X;

import android.content.res.TypedArray;

/* renamed from: X.7YQ  reason: invalid class name */
public final class AnonymousClass7YQ {
    public final int A00;
    public final Integer A01;

    public static AnonymousClass7YQ A00(TypedArray typedArray, int i, int i2, int i3) {
        return new AnonymousClass7YQ(typedArray.getInt(i2, i3), Integer.valueOf(typedArray.getInt(i, 0)));
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7YQ) {
                AnonymousClass7YQ r5 = (AnonymousClass7YQ) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass000.A07(this.A01) * 31) + this.A00;
    }

    public AnonymousClass7YQ(int i, Integer num) {
        this.A01 = num;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("QuickActionIcon(icon=");
        A0o.append(this.A01);
        A0o.append(", tintColor=");
        return C18260x0.A09(A0o, this.A00);
    }
}
