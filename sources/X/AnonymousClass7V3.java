package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.7V3  reason: invalid class name */
public final class AnonymousClass7V3 {
    public final AnonymousClass8TA A00(AnonymousClass8Lk... r26) {
        int A0C;
        AnonymousClass8Lk[] r8 = r26;
        int length = r8.length;
        int i = 0;
        if (length == 0) {
            int[] A1Z = C86664Kz.A1Z();
            // fill-array-data instruction
            A1Z[0] = 0;
            A1Z[1] = -1;
            return new AnonymousClass8TA(A1Z, new AnonymousClass8Lk[0]);
        }
        ArrayList A0J = AnonymousClass002.A0J(new C71803ch(r8, false));
        if (A0J.size() > 1) {
            Collections.sort(A0J);
        }
        ArrayList A0I = AnonymousClass002.A0I(length);
        int i2 = 0;
        do {
            C18270x1.A1K(A0I, -1);
            i2++;
        } while (i2 < length);
        Object[] array = A0I.toArray(new Integer[0]);
        if (array != null) {
            Integer[] numArr = (Integer[]) array;
            List A0p = AnonymousClass8UF.A0p(Arrays.copyOf(numArr, numArr.length));
            int i3 = 0;
            int i4 = 0;
            do {
                A0p.set(AnonymousClass8UF.A0l(r26[i3], A0J, A0J.size()), Integer.valueOf(i4));
                i3++;
                i4++;
            } while (i3 < length);
            if (((AnonymousClass8Lk) A0J.get(0)).A02() > 0) {
                int i5 = 0;
                while (i5 < A0J.size()) {
                    AnonymousClass8Lk r9 = (AnonymousClass8Lk) A0J.get(i5);
                    int i6 = i5 + 1;
                    int i7 = i6;
                    while (i7 < A0J.size()) {
                        AnonymousClass8Lk r2 = (AnonymousClass8Lk) A0J.get(i7);
                        C162457s7.A0I(r9, 0);
                        if (!r2.A04(r9, r9.A02())) {
                            continue;
                            break;
                        } else if (r2.A02() == r9.A02()) {
                            throw AnonymousClass000.A0E(r2, "duplicate option: ", AnonymousClass001.A0o());
                        } else if (AnonymousClass000.A09(A0p, i7) > AnonymousClass000.A09(A0p, i5)) {
                            A0J.remove(i7);
                            A0p.remove(i7);
                        } else {
                            i7++;
                        }
                    }
                    i5 = i6;
                }
                C172278Kj r7 = new C172278Kj();
                ArrayList arrayList = A0J;
                A01(arrayList, A0p, r7, 0, 0, A0J.size(), 0);
                int[] iArr = new int[((int) (r7.A00 / ((long) 4)))];
                while (true) {
                    long j = r7.A00;
                    if (j == 0) {
                        return new AnonymousClass8TA(iArr, (AnonymousClass8Lk[]) r8.clone());
                    }
                    int i8 = i + 1;
                    if (j >= 4) {
                        C158837kd r5 = r7.A01;
                        if (r5 == null) {
                            throw C162457s7.A05();
                        }
                        int i9 = r5.A01;
                        int i10 = r5.A00;
                        if (((long) (i10 - i9)) < 4) {
                            A0C = ((r7.readByte() & 255) << 24) | ((r7.readByte() & 255) << 16) | ((r7.readByte() & 255) << 8) | (r7.readByte() & 255);
                        } else {
                            byte[] bArr = r5.A06;
                            int i11 = i9 + 1;
                            int i12 = i11 + 1;
                            int A0G = AnonymousClass6C9.A0G(bArr, i11, (bArr[i9] & 255) << 24);
                            int i13 = i12 + 1;
                            int A0G2 = AnonymousClass6C8.A0G(bArr, i12, A0G);
                            int i14 = i13 + 1;
                            A0C = AnonymousClass6CA.A0C(bArr, i13, A0G2);
                            r7.A00 = j - 4;
                            if (i14 == i10) {
                                C158837kd.A00(r7, r5);
                            } else {
                                r5.A01 = i14;
                            }
                        }
                        iArr[i] = A0C;
                        i = i8;
                    } else {
                        throw AnonymousClass6CA.A0M();
                    }
                }
            } else {
                throw AnonymousClass001.A0c("the empty byte string is not a supported option");
            }
        } else {
            throw new C140806uY("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    public final void A01(List list, List list2, C172278Kj r25, int i, int i2, int i3, long j) {
        int i4;
        int i5 = i3;
        int i6 = i;
        int i7 = i2;
        if (AnonymousClass001.A1Y(i7, i5)) {
            int i8 = i7;
            while (true) {
                List list3 = list;
                if (i8 >= i5) {
                    AnonymousClass8Lk r9 = (AnonymousClass8Lk) list3.get(i7);
                    AnonymousClass8Lk r11 = (AnonymousClass8Lk) list3.get(i3 - 1);
                    List list4 = list2;
                    if (i6 == r9.A02()) {
                        i4 = AnonymousClass000.A09(list4, i7);
                        i7 = i2 + 1;
                        r9 = (AnonymousClass8Lk) list3.get(i7);
                    } else {
                        i4 = -1;
                    }
                    C172278Kj r4 = r25;
                    if (r9.A01(i6) != r11.A01(i6)) {
                        int i9 = 1;
                        for (int i10 = i7 + 1; i10 < i5; i10++) {
                            if (((AnonymousClass8Lk) list3.get(i10 - 1)).A01(i6) != ((AnonymousClass8Lk) list3.get(i10)).A01(i6)) {
                                i9++;
                            }
                        }
                        long j2 = (long) 4;
                        long j3 = j + (r4.A00 / j2) + ((long) 2) + ((long) (i9 * 2));
                        r4.A0A(i9);
                        r4.A0A(i4);
                        for (int i11 = i7; i11 < i5; i11++) {
                            byte A01 = ((AnonymousClass8Lk) list3.get(i11)).A01(i6);
                            if (i11 == i7 || A01 != ((AnonymousClass8Lk) list3.get(i11 - 1)).A01(i6)) {
                                r4.A0A(A01 & 255);
                            }
                        }
                        C172278Kj r92 = new C172278Kj();
                        while (i7 < i5) {
                            byte A012 = ((AnonymousClass8Lk) list3.get(i7)).A01(i6);
                            int i12 = i7 + 1;
                            int i13 = i12;
                            while (true) {
                                if (i13 < i5) {
                                    if (A012 != ((AnonymousClass8Lk) list3.get(i13)).A01(i6)) {
                                        break;
                                    }
                                    i13++;
                                } else {
                                    i13 = i5;
                                    break;
                                }
                            }
                            if (i12 == i13 && i + 1 == ((AnonymousClass8Lk) list3.get(i7)).A02()) {
                                r4.A0A(AnonymousClass000.A09(list4, i7));
                            } else {
                                r4.A0A(-((int) (j3 + (r92.A00 / j2))));
                                A01(list3, list4, r92, i + 1, i7, i13, j3);
                            }
                            i7 = i13;
                        }
                        do {
                        } while (r92.BiH(r4, (long) DefaultCrypto.BUFFER_SIZE) != -1);
                        return;
                    }
                    int min = Math.min(r9.A02(), r11.A02());
                    int i14 = i6;
                    int i15 = 0;
                    while (i14 < min && r9.A01(i14) == r11.A01(i14)) {
                        i15++;
                        i14++;
                    }
                    long j4 = (long) 4;
                    long j5 = j + (r4.A00 / j4) + ((long) 2) + ((long) i15) + 1;
                    r4.A0A(-i15);
                    r4.A0A(i4);
                    int i16 = i + i15;
                    while (i6 < i16) {
                        r4.A0A(r9.A01(i6) & 255);
                        i6++;
                    }
                    if (i7 + 1 != i5) {
                        C172278Kj r5 = new C172278Kj();
                        r4.A0A(-((int) ((r5.A00 / j4) + j5)));
                        A01(list3, list4, r5, i16, i7, i5, j5);
                        do {
                        } while (r5.BiH(r4, (long) DefaultCrypto.BUFFER_SIZE) != -1);
                        return;
                    } else if (i16 == ((AnonymousClass8Lk) list3.get(i7)).A02()) {
                        r4.A0A(AnonymousClass000.A09(list4, i7));
                        return;
                    } else {
                        throw AnonymousClass001.A0e("Check failed.");
                    }
                } else if (((AnonymousClass8Lk) list3.get(i8)).A02() >= i6) {
                    i8++;
                } else {
                    throw AnonymousClass001.A0c("Failed requirement.");
                }
            }
        } else {
            throw AnonymousClass001.A0c("Failed requirement.");
        }
    }
}
