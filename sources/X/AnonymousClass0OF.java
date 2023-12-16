package X;

import java.util.Arrays;

/* renamed from: X.0OF  reason: invalid class name */
public class AnonymousClass0OF {
    public final int A00;
    public final CharSequence A01;

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj instanceof AnonymousClass0OF) {
            AnonymousClass0OF r5 = (AnonymousClass0OF) obj;
            if (this.A00 == r5.A00) {
                CharSequence charSequence = r5.A01;
                CharSequence charSequence2 = this.A01;
                if (charSequence2 != null) {
                    str = charSequence2.toString();
                } else {
                    str = null;
                }
                if (charSequence != null) {
                    str2 = charSequence.toString();
                } else {
                    str2 = null;
                }
                if (str == null) {
                    if (str2 != null) {
                        return false;
                    }
                    return true;
                } else if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public AnonymousClass0OF(int i, CharSequence charSequence) {
        this.A00 = i;
        this.A01 = charSequence;
    }

    public int hashCode() {
        String str;
        Object[] A0M = AnonymousClass002.A0M();
        AnonymousClass000.A1L(A0M, this.A00);
        CharSequence charSequence = this.A01;
        if (charSequence != null) {
            str = charSequence.toString();
        } else {
            str = null;
        }
        A0M[1] = str;
        return Arrays.hashCode(A0M);
    }
}
