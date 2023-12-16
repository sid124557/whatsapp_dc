package X;

/* renamed from: X.0i5  reason: invalid class name and case insensitive filesystem */
public class C10530i5 implements Cloneable {
    public static final Object A03 = AnonymousClass002.A0D();
    public int A00;
    public int[] A01;
    public Object[] A02;

    public Object A01(int i, Object obj) {
        Object obj2;
        int A002 = AnonymousClass0VY.A00(this.A01, this.A00, i);
        if (A002 < 0 || (obj2 = this.A02[A002]) == A03) {
            return obj;
        }
        return obj2;
    }

    public void A02(int i, Object obj) {
        int i2 = this.A00;
        if (i2 == 0 || i > this.A01[i2 - 1]) {
            int[] iArr = this.A01;
            int[] iArr2 = iArr;
            int length = iArr.length;
            if (i2 >= length) {
                int i3 = (i2 + 1) * 4;
                int i4 = 4;
                while (true) {
                    int i5 = (1 << i4) - 12;
                    if (i3 > i5) {
                        i4++;
                        if (i4 >= 32) {
                            break;
                        }
                    } else {
                        i3 = i5;
                        break;
                    }
                }
                int i6 = i3 / 4;
                iArr2 = new int[i6];
                Object[] objArr = new Object[i6];
                System.arraycopy(iArr, 0, iArr2, 0, length);
                Object[] objArr2 = this.A02;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.A01 = iArr2;
                this.A02 = objArr;
            }
            iArr2[i2] = i;
            this.A02[i2] = obj;
            this.A00 = i2 + 1;
            return;
        }
        A03(i, obj);
    }

    public void A03(int i, Object obj) {
        int[] iArr = this.A01;
        int i2 = this.A00;
        int A002 = AnonymousClass0VY.A00(iArr, i2, i);
        if (A002 >= 0) {
            this.A02[A002] = obj;
            return;
        }
        int i3 = ~A002;
        if (i3 < i2) {
            Object[] objArr = this.A02;
            if (objArr[i3] == A03) {
                iArr[i3] = i;
                objArr[i3] = obj;
                return;
            }
        }
        int length = iArr.length;
        if (i2 >= length) {
            int i4 = (i2 + 1) * 4;
            int i5 = 4;
            while (true) {
                int i6 = (1 << i5) - 12;
                if (i4 > i6) {
                    i5++;
                    if (i5 >= 32) {
                        break;
                    }
                } else {
                    i4 = i6;
                    break;
                }
            }
            int i7 = i4 / 4;
            int[] iArr2 = new int[i7];
            Object[] objArr2 = new Object[i7];
            System.arraycopy(iArr, 0, iArr2, 0, length);
            Object[] objArr3 = this.A02;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.A01 = iArr2;
            iArr = iArr2;
            this.A02 = objArr2;
        }
        int i8 = this.A00 - i3;
        if (i8 != 0) {
            int i9 = i3 + 1;
            System.arraycopy(iArr, i3, iArr, i9, i8);
            Object[] objArr4 = this.A02;
            System.arraycopy(objArr4, i3, objArr4, i9, this.A00 - i3);
        }
        this.A01[i3] = i;
        this.A02[i3] = obj;
        this.A00++;
    }

    public String toString() {
        int i = this.A00;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.A00; i2++) {
            if (i2 > 0) {
                AnonymousClass001.A1M(sb);
            }
            sb.append(this.A01[i2]);
            sb.append('=');
            Object obj = this.A02[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        return AnonymousClass000.A0d(sb);
    }

    public C10530i5() {
        int i = 40;
        int i2 = 4;
        while (true) {
            int i3 = (1 << i2) - 12;
            if (40 > i3) {
                i2++;
                if (i2 >= 32) {
                    break;
                }
            } else {
                i = i3;
                break;
            }
        }
        int i4 = i / 4;
        this.A01 = new int[i4];
        this.A02 = new Object[i4];
    }

    /* renamed from: A00 */
    public C10530i5 clone() {
        try {
            C10530i5 r1 = (C10530i5) super.clone();
            r1.A01 = (int[]) this.A01.clone();
            r1.A02 = (Object[]) this.A02.clone();
            return r1;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
