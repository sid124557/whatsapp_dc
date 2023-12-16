package X;

/* renamed from: X.8LR  reason: invalid class name */
public final class AnonymousClass8LR implements Cloneable {
    public static final AnonymousClass8LM A03 = new AnonymousClass8LM();
    public int A00;
    public int[] A01;
    public AnonymousClass8LM[] A02;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AnonymousClass8LR) {
                AnonymousClass8LR r9 = (AnonymousClass8LR) obj;
                int i = this.A00;
                if (i == r9.A00) {
                    int[] iArr = this.A01;
                    int[] iArr2 = r9.A01;
                    int i2 = 0;
                    while (true) {
                        if (i2 < i) {
                            if (iArr[i2] != iArr2[i2]) {
                                break;
                            }
                            i2++;
                        } else {
                            AnonymousClass8LM[] r4 = this.A02;
                            AnonymousClass8LM[] r3 = r9.A02;
                            int i3 = 0;
                            while (i3 < i) {
                                if (r4[i3].equals(r3[i3])) {
                                    i3++;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final /* synthetic */ Object clone() {
        int i = this.A00;
        AnonymousClass8LR r3 = new AnonymousClass8LR(i);
        System.arraycopy(this.A01, 0, r3.A01, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            AnonymousClass8LM r0 = this.A02[i2];
            if (r0 != null) {
                r3.A02[i2] = r0.clone();
            }
        }
        r3.A00 = i;
        return r3;
    }

    public final int hashCode() {
        int i = 17;
        for (int i2 = 0; i2 < this.A00; i2++) {
            i = AnonymousClass002.A02(this.A02[i2], ((i * 31) + this.A01[i2]) * 31);
        }
        return i;
    }

    public AnonymousClass8LR(int i) {
        int i2 = i << 2;
        int i3 = 4;
        while (true) {
            int i4 = (1 << i3) - 12;
            if (i2 > i4) {
                i3++;
                if (i3 >= 32) {
                    break;
                }
            } else {
                i2 = i4;
                break;
            }
        }
        int i5 = i2 / 4;
        this.A01 = new int[i5];
        this.A02 = new AnonymousClass8LM[i5];
        this.A00 = 0;
    }

    public AnonymousClass8LR() {
        this(10);
    }
}
