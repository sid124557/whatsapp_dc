package X;

/* renamed from: X.5Zv  reason: invalid class name and case insensitive filesystem */
public class C106655Zv {
    public final int[] A00;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                int[] iArr = this.A00;
                int[] iArr2 = ((C106655Zv) obj).A00;
                if (iArr != iArr2) {
                    int length = iArr.length;
                    if (length == iArr2.length) {
                        int i = 0;
                        while (i < length) {
                            if (iArr[i] == iArr2[i]) {
                                i++;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 : this.A00) {
            i = (i * 31) + i2;
        }
        return i;
    }

    public String toString() {
        return A01(this.A00);
    }

    public C106655Zv(String str) {
        int codePointCount = str.codePointCount(0, str.length());
        this.A00 = new int[codePointCount];
        int i = 0;
        for (int i2 = 0; i2 < codePointCount; i2++) {
            this.A00[i2] = str.codePointAt(i);
            i += Character.charCount(this.A00[i2]);
        }
    }

    public static C106655Zv A00(String str) {
        int length = str.length();
        int[] iArr = new int[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int codePointAt = Character.codePointAt(str, i);
            i += Character.charCount(codePointAt);
            iArr[i2] = codePointAt;
            i2++;
        }
        int[] iArr2 = new int[i2];
        System.arraycopy(iArr, 0, iArr2, 0, i2);
        return new C106655Zv(iArr2);
    }

    public static String A01(int[] iArr) {
        StringBuilder A0o = AnonymousClass001.A0o();
        for (int appendCodePoint : iArr) {
            A0o.appendCodePoint(appendCodePoint);
        }
        return A0o.toString();
    }

    public C106655Zv(int[] iArr) {
        this.A00 = iArr;
    }
}
