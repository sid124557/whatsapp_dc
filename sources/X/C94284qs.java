package X;

/* renamed from: X.4qs  reason: invalid class name and case insensitive filesystem */
public class C94284qs extends C157857j0 {
    public int A00;
    public final int A01;
    public final CharSequence A02;

    public int A00() {
        int i = this.A00;
        if (i >= this.A01) {
            return 0;
        }
        int codePointAt = Character.codePointAt(this.A02, i);
        this.A00 += Character.charCount(codePointAt);
        return codePointAt;
    }

    public int[] A01() {
        int i = this.A01;
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = Character.codePointAt(this.A02, i2);
        }
        return iArr;
    }

    public int A02(int i, long j) {
        if (j != -1) {
            return A03(i, j);
        }
        return Character.charCount(Character.codePointAt(this.A02, i));
    }

    public int A03(int i, long j) {
        int codePointAt;
        int i2 = (int) (j & 15);
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int codePointAt2 = Character.codePointAt(this.A02, i + i4);
            i4 += Character.charCount(codePointAt2);
            if (codePointAt2 == 65039) {
                i3--;
            }
            i3++;
        }
        int i5 = i + i4;
        if (i5 >= this.A01 || (codePointAt = Character.codePointAt(this.A02, i5)) != 65039) {
            return i4;
        }
        return i4 + Character.charCount(codePointAt);
    }

    public C94284qs(CharSequence charSequence) {
        this.A02 = charSequence;
        this.A01 = charSequence.length();
    }
}
