package X;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Arrays;

/* renamed from: X.8Lk  reason: invalid class name */
public class AnonymousClass8Lk implements Comparable, Serializable {
    public static final AnonymousClass8Lk A02 = C1461078r.A00;
    public static final long serialVersionUID = 1;
    public transient int A00;
    public transient String A01;
    public final byte[] data;

    public AnonymousClass8Lk(byte[] bArr) {
        C162457s7.A0I(bArr, 1);
        this.data = bArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r6 = (X.AnonymousClass8Lk) r6;
        r2 = r6.A02();
        r1 = r5.data;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r4 = 0
            r3 = 1
            if (r6 == r5) goto L_0x0019
            boolean r0 = r6 instanceof X.AnonymousClass8Lk
            if (r0 == 0) goto L_0x001a
            X.8Lk r6 = (X.AnonymousClass8Lk) r6
            int r2 = r6.A02()
            byte[] r1 = r5.data
            int r0 = r1.length
            if (r2 != r0) goto L_0x001a
            boolean r0 = r6.A05(r1, r4, r4, r0)
            if (r0 == 0) goto L_0x001a
        L_0x0019:
            return r3
        L_0x001a:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8Lk.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (r1 < 65536) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00b5, code lost:
        if (r0 == 64) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00be, code lost:
        if (r7 != -1) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00c0, code lost:
        if (r10 > 64) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00c2, code lost:
        r2 = X.AnonymousClass001.A0o();
        r2.append("[hex=");
        r2.append(A03());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00d2, code lost:
        r2.append(']');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00d9, code lost:
        return r2.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00da, code lost:
        r6 = r12.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00dc, code lost:
        if (r6 != null) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00e0, code lost:
        if ((r12 instanceof X.C175998aD) == false) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00e2, code lost:
        r11 = ((X.C175998aD) r12).A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00e9, code lost:
        r6 = new java.lang.String(r11, X.AnonymousClass79X.A05);
        r12.A01 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00f2, code lost:
        r2 = r6.substring(0, r7);
        X.C162457s7.A09(r2);
        r1 = X.C175738Zn.A0U(X.C175738Zn.A0U(X.C175738Zn.A0U(r2, "\\", "\\\\", false), "\n", "\\n", false), "\r", "\\r", false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0115, code lost:
        if (r7 >= r6.length()) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0117, code lost:
        r2 = X.AnonymousClass000.A0l("[size=");
        r2.append(r12.data.length);
        r2.append(" text=");
        r2.append(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x012a, code lost:
        r2 = X.C18270x1.A0W(r10, "[size=");
        r2.append(" hex=");
        r1 = new byte[64];
        java.lang.System.arraycopy(r11, 0, r1, 0, 64);
        r2.append(new X.AnonymousClass8Lk(r1).A03());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0144, code lost:
        r2.append("…]");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0148, code lost:
        r2 = X.AnonymousClass001.A0o();
        r2.append("[text=");
        r2.append(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x016a, code lost:
        r7 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r17 = this;
            r13 = 0
            r12 = r17
            byte[] r11 = r12.data
            int r10 = r11.length
            if (r10 != 0) goto L_0x000b
            java.lang.String r0 = "[size=0]"
            return r0
        L_0x000b:
            r9 = 64
            r8 = 0
            r7 = 0
            r0 = 0
        L_0x0010:
            byte r1 = r11[r8]
            r15 = 127(0x7f, float:1.78E-43)
            r14 = 159(0x9f, float:2.23E-43)
            r6 = 31
            r5 = 13
            r4 = 65533(0xfffd, float:9.1831E-41)
            r3 = 10
            r2 = 65536(0x10000, float:9.18355E-41)
            if (r1 < 0) goto L_0x005a
            int r16 = r0 + 1
            if (r0 == r9) goto L_0x00b7
            if (r1 == r3) goto L_0x0036
            if (r1 == r5) goto L_0x0036
            if (r6 >= r1) goto L_0x016a
            if (r15 > r1) goto L_0x0036
            if (r14 >= r1) goto L_0x016a
            if (r1 == r4) goto L_0x016a
            r0 = 2
            if (r1 >= r2) goto L_0x0037
        L_0x0036:
            r0 = 1
        L_0x0037:
            int r7 = r7 + r0
            int r8 = r8 + 1
        L_0x003a:
            r0 = r16
            if (r8 >= r10) goto L_0x0084
            byte r1 = r11[r8]
            if (r1 < 0) goto L_0x0084
            int r8 = r8 + 1
            int r16 = r16 + 1
            if (r0 == r9) goto L_0x00b7
            if (r1 == r3) goto L_0x0057
            if (r1 == r5) goto L_0x0057
            if (r6 >= r1) goto L_0x016a
            if (r15 > r1) goto L_0x0057
            if (r14 >= r1) goto L_0x016a
            if (r1 == r4) goto L_0x016a
            r0 = 2
            if (r1 >= r2) goto L_0x0058
        L_0x0057:
            r0 = 1
        L_0x0058:
            int r7 = r7 + r0
            goto L_0x003a
        L_0x005a:
            int r3 = r1 >> 5
            r6 = -2
            r2 = 128(0x80, float:1.794E-43)
            if (r3 != r6) goto L_0x0087
            int r3 = r8 + 1
            if (r10 <= r3) goto L_0x00b5
            byte r5 = r11[r3]
            r3 = r5 & 192(0xc0, float:2.69E-43)
            if (r3 != r2) goto L_0x00b5
            r3 = r5 ^ 3968(0xf80, float:5.56E-42)
            int r1 = r1 << 6
            r3 = r3 ^ r1
            if (r3 < r2) goto L_0x00b5
            int r2 = r0 + 1
            if (r0 == r9) goto L_0x00b7
            if (r14 >= r3) goto L_0x016a
            if (r3 == r4) goto L_0x016a
            r1 = 65536(0x10000, float:9.18355E-41)
            r0 = 2
            if (r3 >= r1) goto L_0x0080
            r0 = 1
        L_0x0080:
            int r7 = r7 + r0
            int r8 = r8 + 2
        L_0x0083:
            r0 = r2
        L_0x0084:
            if (r8 >= r10) goto L_0x00b7
            goto L_0x0010
        L_0x0087:
            int r3 = r1 >> 4
            r5 = 55296(0xd800, float:7.7486E-41)
            r4 = 57343(0xdfff, float:8.0355E-41)
            if (r3 != r6) goto L_0x016d
            int r6 = r8 + 2
            if (r10 <= r6) goto L_0x00b5
            int r3 = r8 + 1
            byte r14 = r11[r3]
            r3 = r14 & 192(0xc0, float:2.69E-43)
            if (r3 != r2) goto L_0x00b5
            byte r3 = r11[r6]
            r6 = r3 & 192(0xc0, float:2.69E-43)
            if (r6 != r2) goto L_0x00b5
            r2 = -123008(0xfffffffffffe1f80, float:NaN)
            r3 = r3 ^ r2
            int r2 = r14 << 6
            r3 = r3 ^ r2
            int r1 = r1 << 12
            r3 = r3 ^ r1
            r1 = 2048(0x800, float:2.87E-42)
            if (r3 < r1) goto L_0x00b5
            if (r5 > r3) goto L_0x0156
            if (r4 < r3) goto L_0x0156
        L_0x00b5:
            if (r0 != r9) goto L_0x016a
        L_0x00b7:
            r0 = -1
            r4 = 93
            java.lang.String r3 = "…]"
            java.lang.String r5 = "[size="
            if (r7 != r0) goto L_0x00da
            if (r10 > r9) goto L_0x012a
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "[hex="
            r2.append(r0)
            java.lang.String r0 = r12.A03()
            r2.append(r0)
        L_0x00d2:
            r2.append(r4)
        L_0x00d5:
            java.lang.String r0 = r2.toString()
            return r0
        L_0x00da:
            java.lang.String r6 = r12.A01
            if (r6 != 0) goto L_0x00f2
            boolean r0 = r12 instanceof X.C175998aD
            if (r0 == 0) goto L_0x00e9
            r0 = r12
            X.8aD r0 = (X.C175998aD) r0
            byte[] r11 = r0.A06()
        L_0x00e9:
            java.nio.charset.Charset r0 = X.AnonymousClass79X.A05
            java.lang.String r6 = new java.lang.String
            r6.<init>(r11, r0)
            r12.A01 = r6
        L_0x00f2:
            java.lang.String r2 = r6.substring(r13, r7)
            X.C162457s7.A09(r2)
            java.lang.String r1 = "\\"
            java.lang.String r0 = "\\\\"
            java.lang.String r2 = X.C175738Zn.A0U(r2, r1, r0, r13)
            java.lang.String r1 = "\n"
            java.lang.String r0 = "\\n"
            java.lang.String r2 = X.C175738Zn.A0U(r2, r1, r0, r13)
            java.lang.String r1 = "\r"
            java.lang.String r0 = "\\r"
            java.lang.String r1 = X.C175738Zn.A0U(r2, r1, r0, r13)
            int r0 = r6.length()
            if (r7 >= r0) goto L_0x0148
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0l(r5)
            byte[] r0 = r12.data
            int r0 = r0.length
            r2.append(r0)
            java.lang.String r0 = " text="
            r2.append(r0)
            r2.append(r1)
            goto L_0x0144
        L_0x012a:
            java.lang.StringBuilder r2 = X.C18270x1.A0W(r10, r5)
            java.lang.String r0 = " hex="
            r2.append(r0)
            byte[] r1 = new byte[r9]
            java.lang.System.arraycopy(r11, r13, r1, r13, r9)
            X.8Lk r0 = new X.8Lk
            r0.<init>(r1)
            java.lang.String r0 = r0.A03()
            r2.append(r0)
        L_0x0144:
            r2.append(r3)
            goto L_0x00d5
        L_0x0148:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "[text="
            r2.append(r0)
            r2.append(r1)
            goto L_0x00d2
        L_0x0156:
            int r2 = r0 + 1
            if (r0 == r9) goto L_0x00b7
            r0 = 65533(0xfffd, float:9.1831E-41)
            if (r3 == r0) goto L_0x016a
            r1 = 65536(0x10000, float:9.18355E-41)
            r0 = 2
            if (r3 >= r1) goto L_0x0165
            r0 = 1
        L_0x0165:
            int r7 = r7 + r0
            int r8 = r8 + 3
            goto L_0x0083
        L_0x016a:
            r7 = -1
            goto L_0x00b7
        L_0x016d:
            int r3 = r1 >> 3
            if (r3 != r6) goto L_0x00b5
            int r15 = r8 + 3
            if (r10 <= r15) goto L_0x00b5
            int r3 = r8 + 1
            byte r6 = r11[r3]
            r3 = r6 & 192(0xc0, float:2.69E-43)
            if (r3 != r2) goto L_0x00b5
            int r3 = r8 + 2
            byte r14 = r11[r3]
            r3 = r14 & 192(0xc0, float:2.69E-43)
            if (r3 != r2) goto L_0x00b5
            byte r3 = r11[r15]
            r15 = r3 & 192(0xc0, float:2.69E-43)
            if (r15 != r2) goto L_0x00b5
            r2 = 3678080(0x381f80, float:5.154088E-39)
            r3 = r3 ^ r2
            int r2 = r14 << 6
            r3 = r3 ^ r2
            int r2 = r6 << 12
            r3 = r3 ^ r2
            int r1 = r1 << 18
            r3 = r3 ^ r1
            r1 = 1114111(0x10ffff, float:1.561202E-39)
            if (r3 > r1) goto L_0x00b5
            if (r5 > r3) goto L_0x00b5
            if (r4 >= r3) goto L_0x00b5
            r1 = 65536(0x10000, float:9.18355E-41)
            if (r3 < r1) goto L_0x00b5
            int r2 = r0 + 1
            if (r0 == r9) goto L_0x00b7
            int r7 = r7 + 2
            int r8 = r8 + 4
            goto L_0x0083
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8Lk.toString():java.lang.String");
    }

    public static final AnonymousClass8Lk A00(String str) {
        byte[] bytes = str.getBytes(AnonymousClass79X.A05);
        C162457s7.A09(bytes);
        AnonymousClass8Lk r0 = new AnonymousClass8Lk(bytes);
        r0.A01 = str;
        return r0;
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }

    public byte A01(int i) {
        byte[] bArr;
        int i2;
        if (this instanceof C175998aD) {
            C175998aD r0 = (C175998aD) this;
            int[] iArr = r0.A00;
            byte[][] bArr2 = r0.A01;
            int length = bArr2.length;
            C1453875h.A00((long) iArr[length - 1], (long) i, 1);
            int binarySearch = Arrays.binarySearch(iArr, 0, length, i + 1);
            if (binarySearch < 0) {
                binarySearch = ~binarySearch;
            }
            if (binarySearch == 0) {
                i2 = 0;
            } else {
                i2 = iArr[binarySearch - 1];
            }
            int i3 = iArr[length + binarySearch];
            bArr = bArr2[binarySearch];
            i = (i - i2) + i3;
        } else {
            bArr = this.data;
        }
        return bArr[i];
    }

    public int A02() {
        if (!(this instanceof C175998aD)) {
            return this.data.length;
        }
        C175998aD r0 = (C175998aD) this;
        return r0.A00[r0.A01.length - 1];
    }

    public String A03() {
        if (this instanceof C175998aD) {
            return new AnonymousClass8Lk(((C175998aD) this).A06()).A03();
        }
        char[] cArr = new char[(r7 * 2)];
        int i = 0;
        for (byte b : this.data) {
            int i2 = i + 1;
            char[] cArr2 = C1461078r.A01;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public boolean A04(AnonymousClass8Lk r11, int i) {
        int i2;
        if (!(this instanceof C175998aD)) {
            return r11.A05(this.data, 0, 0, i);
        }
        C175998aD r2 = (C175998aD) this;
        int i3 = 0;
        int i4 = 0;
        if (0 > r2.A02() - i) {
            return false;
        }
        int[] iArr = r2.A00;
        byte[][] bArr = r2.A01;
        int length = bArr.length;
        int binarySearch = Arrays.binarySearch(iArr, 0, length, 1);
        if (binarySearch < 0) {
            binarySearch = ~binarySearch;
        }
        while (i3 < i) {
            if (binarySearch == 0) {
                i2 = 0;
            } else {
                i2 = iArr[binarySearch - 1];
            }
            int i5 = iArr[length + binarySearch];
            int min = Math.min(i, (iArr[binarySearch] - i2) + i2) - i3;
            if (!r11.A05(bArr[binarySearch], i4, i5 + (i3 - i2), min)) {
                return false;
            }
            i4 += min;
            i3 += min;
            binarySearch++;
        }
        return true;
    }

    public boolean A05(byte[] bArr, int i, int i2, int i3) {
        int i4;
        if (this instanceof C175998aD) {
            C175998aD r1 = (C175998aD) this;
            C162457s7.A0I(bArr, 1);
            if (i >= 0 && i <= r1.A02() - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
                int i5 = i3 + i;
                int[] iArr = r1.A00;
                byte[][] bArr2 = r1.A01;
                int length = bArr2.length;
                int binarySearch = Arrays.binarySearch(iArr, 0, length, i + 1);
                if (binarySearch < 0) {
                    binarySearch = ~binarySearch;
                }
                while (i < i5) {
                    if (binarySearch == 0) {
                        i4 = 0;
                    } else {
                        i4 = iArr[binarySearch - 1];
                    }
                    int i6 = iArr[length + binarySearch];
                    int min = Math.min(i5, (iArr[binarySearch] - i4) + i4) - i;
                    int i7 = i6 + (i - i4);
                    byte[] bArr3 = bArr2[binarySearch];
                    C162457s7.A0I(bArr3, 0);
                    int i8 = 0;
                    while (i8 < min) {
                        if (bArr3[i8 + i7] == bArr[i8 + i2]) {
                            i8++;
                        }
                    }
                    i2 += min;
                    i += min;
                    binarySearch++;
                }
                return true;
            }
        } else {
            C162457s7.A0I(bArr, 1);
            if (i >= 0) {
                byte[] bArr4 = this.data;
                if (i <= bArr4.length - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
                    int i9 = 0;
                    while (i9 < i3) {
                        if (bArr4[i9 + i] == bArr[i9 + i2]) {
                            i9++;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        AnonymousClass8Lk r8 = (AnonymousClass8Lk) obj;
        C162457s7.A0I(r8, 0);
        int A022 = A02();
        int A023 = r8.A02();
        int min = Math.min(A022, A023);
        int i = 0;
        while (i < min) {
            byte A012 = A01(i) & 255;
            byte A013 = r8.A01(i) & 255;
            if (A012 == A013) {
                i++;
            } else if (A012 < A013) {
                return -1;
            } else {
                return 1;
            }
        }
        if (A022 == A023) {
            return 0;
        }
        if (A022 < A023) {
            return -1;
        }
        return 1;
    }

    public int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.data);
        this.A00 = hashCode;
        return hashCode;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        int readInt = objectInputStream.readInt();
        int i = 0;
        if (readInt >= 0) {
            byte[] bArr = new byte[readInt];
            while (i < readInt) {
                int read = objectInputStream.read(bArr, i, readInt - i);
                if (read != -1) {
                    i += read;
                } else {
                    throw AnonymousClass6CA.A0M();
                }
            }
            AnonymousClass8Lk r2 = new AnonymousClass8Lk(bArr);
            Field declaredField = AnonymousClass8Lk.class.getDeclaredField("data");
            C162457s7.A09(declaredField);
            declaredField.setAccessible(true);
            declaredField.set(this, r2.data);
            return;
        }
        throw AnonymousClass000.A0G("byteCount < 0: ", AnonymousClass001.A0o(), readInt);
    }
}
