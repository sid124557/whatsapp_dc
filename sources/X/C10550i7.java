package X;

/* renamed from: X.0i7  reason: invalid class name and case insensitive filesystem */
public class C10550i7 implements Cloneable {
    public static final Object A04 = AnonymousClass002.A0D();
    public int A00;
    public boolean A01;
    public long[] A02;
    public Object[] A03;

    public static Object A00(C10550i7 r1, long j) {
        return r1.A05(j, (Object) null);
    }

    public int A01() {
        if (this.A01) {
            A07();
        }
        return this.A00;
    }

    public long A02(int i) {
        if (this.A01) {
            A07();
        }
        return this.A02[i];
    }

    public Object A04(int i) {
        if (this.A01) {
            A07();
        }
        return this.A03[i];
    }

    public Object A05(long j, Object obj) {
        Object obj2;
        int A012 = AnonymousClass0VY.A01(this.A02, this.A00, j);
        if (A012 < 0 || (obj2 = this.A03[A012]) == A04) {
            return obj;
        }
        return obj2;
    }

    public void A06() {
        int i = this.A00;
        Object[] objArr = this.A03;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.A00 = 0;
        this.A01 = false;
    }

    public final void A07() {
        int i = this.A00;
        long[] jArr = this.A02;
        Object[] objArr = this.A03;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != A04) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.A01 = false;
        this.A00 = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r2 = r4.A03;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(long r5) {
        /*
            r4 = this;
            long[] r1 = r4.A02
            int r0 = r4.A00
            int r3 = X.AnonymousClass0VY.A01(r1, r0, r5)
            if (r3 < 0) goto L_0x0017
            java.lang.Object[] r2 = r4.A03
            r1 = r2[r3]
            java.lang.Object r0 = A04
            if (r1 == r0) goto L_0x0017
            r2[r3] = r0
            r0 = 1
            r4.A01 = r0
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10550i7.A08(long):void");
    }

    public void A09(long j, Object obj) {
        int i = this.A00;
        if (i == 0 || j > this.A02[i - 1]) {
            if (this.A01 && i >= this.A02.length) {
                A07();
            }
            int i2 = this.A00;
            long[] jArr = this.A02;
            long[] jArr2 = jArr;
            int length = jArr.length;
            if (i2 >= length) {
                int i3 = (i2 + 1) * 8;
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
                int i6 = i3 / 8;
                jArr2 = new long[i6];
                Object[] objArr = new Object[i6];
                System.arraycopy(jArr, 0, jArr2, 0, length);
                Object[] objArr2 = this.A03;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.A02 = jArr2;
                this.A03 = objArr;
            }
            jArr2[i2] = j;
            this.A03[i2] = obj;
            this.A00 = i2 + 1;
            return;
        }
        A0A(j, obj);
    }

    public void A0A(long j, Object obj) {
        long[] jArr = this.A02;
        int i = this.A00;
        int A012 = AnonymousClass0VY.A01(jArr, i, j);
        if (A012 >= 0) {
            this.A03[A012] = obj;
            return;
        }
        int i2 = ~A012;
        if (i2 < i) {
            Object[] objArr = this.A03;
            if (objArr[i2] == A04) {
                jArr[i2] = j;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.A01 && i >= jArr.length) {
            A07();
            i = this.A00;
            i2 = ~AnonymousClass0VY.A01(jArr, i, j);
        }
        int length = jArr.length;
        if (i >= length) {
            int i3 = (i + 1) * 8;
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
            int i6 = i3 / 8;
            long[] jArr2 = new long[i6];
            Object[] objArr2 = new Object[i6];
            System.arraycopy(jArr, 0, jArr2, 0, length);
            Object[] objArr3 = this.A03;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.A02 = jArr2;
            jArr = jArr2;
            this.A03 = objArr2;
        }
        int i7 = this.A00 - i2;
        if (i7 != 0) {
            int i8 = i2 + 1;
            System.arraycopy(jArr, i2, jArr, i8, i7);
            Object[] objArr4 = this.A03;
            System.arraycopy(objArr4, i2, objArr4, i8, this.A00 - i2);
        }
        this.A02[i2] = j;
        this.A03[i2] = obj;
        this.A00++;
    }

    public boolean A0B(long j) {
        if (this.A01) {
            A07();
        }
        return AnonymousClass001.A1U(AnonymousClass0VY.A01(this.A02, this.A00, j));
    }

    public C10550i7(int i) {
        Object[] objArr;
        this.A01 = false;
        if (i == 0) {
            this.A02 = AnonymousClass0VY.A01;
            objArr = AnonymousClass0VY.A02;
        } else {
            int i2 = i * 8;
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
            int i5 = i2 / 8;
            this.A02 = new long[i5];
            objArr = new Object[i5];
        }
        this.A03 = objArr;
    }

    /* renamed from: A03 */
    public C10550i7 clone() {
        try {
            C10550i7 r1 = (C10550i7) super.clone();
            r1.A02 = (long[]) this.A02.clone();
            r1.A03 = (Object[]) this.A03.clone();
            return r1;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public String toString() {
        if (A01() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.A00 * 28);
        sb.append('{');
        for (int i = 0; i < this.A00; i++) {
            if (i > 0) {
                AnonymousClass001.A1M(sb);
            }
            sb.append(A02(i));
            sb.append('=');
            Object A042 = A04(i);
            if (A042 != this) {
                sb.append(A042);
            } else {
                sb.append("(this Map)");
            }
        }
        return AnonymousClass000.A0d(sb);
    }

    public C10550i7() {
        this(10);
    }
}
