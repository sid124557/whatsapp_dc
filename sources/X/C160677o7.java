package X;

import com.google.protobuf.CodedOutputStream;
import java.util.Arrays;

/* renamed from: X.7o7  reason: invalid class name and case insensitive filesystem */
public final class C160677o7 {
    public static final C160677o7 A04 = new C160677o7(new int[0], new Object[0], 0, false);
    public int A00;
    public boolean A01;
    public int[] A02;
    public Object[] A03;
    public int count;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof C160677o7)) {
                C160677o7 r9 = (C160677o7) obj;
                int i = this.count;
                if (i == r9.count) {
                    int[] iArr = this.A02;
                    int[] iArr2 = r9.A02;
                    int i2 = 0;
                    while (true) {
                        if (i2 < i) {
                            if (iArr[i2] != iArr2[i2]) {
                                break;
                            }
                            i2++;
                        } else {
                            Object[] objArr = this.A03;
                            Object[] objArr2 = r9.A03;
                            int i3 = 0;
                            while (i3 < i) {
                                if (objArr[i3].equals(objArr2[i3])) {
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

    public int A00() {
        int i;
        int i2;
        int i3;
        int i4 = this.A00;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.count; i6++) {
            int i7 = this.A02[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 == 0) {
                long A0B = C18310x6.A0B(this.A03[i6]);
                i = AnonymousClass730.A04(i8);
                i2 = CodedOutputStream.A02(A0B);
                i3 = i + i2;
            } else if (i9 != 1) {
                if (i9 == 2) {
                    i = AnonymousClass730.A04(i8);
                    int A032 = ((C172548Lq) this.A03[i6]).A03();
                    i2 = AnonymousClass6C7.A00(A032) + A032;
                } else if (i9 == 3) {
                    i = AnonymousClass730.A04(i8) * 2;
                    i2 = ((C160677o7) this.A03[i6]).A00();
                } else if (i9 == 5) {
                    i3 = AnonymousClass730.A04(i8) + 4;
                } else {
                    throw new IllegalStateException(new C130796cY());
                }
                i3 = i + i2;
            } else {
                i3 = AnonymousClass730.A04(i8) + 8;
            }
            i5 += i3;
        }
        this.A00 = i5;
        return i5;
    }

    public final void A01(int i) {
        int[] iArr = this.A02;
        if (i > iArr.length) {
            int i2 = this.count;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.A02 = Arrays.copyOf(iArr, i);
            this.A03 = Arrays.copyOf(this.A03, i);
        }
    }

    public void A02(int i, Object obj) {
        if (this.A01) {
            A01(this.count + 1);
            int[] iArr = this.A02;
            int i2 = this.count;
            iArr[i2] = i;
            this.A03[i2] = obj;
            this.count = i2 + 1;
            return;
        }
        throw C18320x8.A0m();
    }

    public void A03(AnonymousClass7VF r7) {
        if (this.count != 0) {
            for (int i = 0; i < this.count; i++) {
                int i2 = this.A02[i];
                Object obj = this.A03[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    r7.A00.A0C(i3, C18310x6.A0B(obj));
                } else if (i4 == 1) {
                    r7.A00.A0B(i3, C18310x6.A0B(obj));
                } else if (i4 == 2) {
                    CodedOutputStream codedOutputStream = r7.A00;
                    AnonymousClass730.A06(codedOutputStream, i3);
                    codedOutputStream.A0G((C172548Lq) obj);
                } else if (i4 == 3) {
                    CodedOutputStream codedOutputStream2 = r7.A00;
                    int i5 = i3 << 3;
                    codedOutputStream2.A07(i5 | 3);
                    ((C160677o7) obj).A03(r7);
                    codedOutputStream2.A07(i5 | 4);
                } else if (i4 == 5) {
                    r7.A00.A08(i3, AnonymousClass001.A0K(obj));
                } else {
                    throw C18330xA.A09(new C130796cY());
                }
            }
        }
    }

    public int hashCode() {
        int i = this.count;
        int A042 = AnonymousClass6C8.A04(i);
        int[] iArr = this.A02;
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        int i4 = (A042 + i2) * 31;
        Object[] objArr = this.A03;
        int i5 = 17;
        for (int i6 = 0; i6 < i; i6++) {
            i5 = AnonymousClass002.A02(objArr[i6], i5 * 31);
        }
        return i4 + i5;
    }

    public C160677o7(int[] iArr, Object[] objArr, int i, boolean z) {
        this.A00 = -1;
        this.count = i;
        this.A02 = iArr;
        this.A03 = objArr;
        this.A01 = z;
    }

    public C160677o7() {
        this(new int[8], new Object[8], 0, true);
    }
}
