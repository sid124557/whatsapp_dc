package X;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.android.exoplayer2.util.Util;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.811  reason: invalid class name */
public class AnonymousClass811 implements C185218tH {
    public static final C166637z1 A0U = C166637z1.A00("application/x-emsg");
    public static final byte[] A0V = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public SparseArray A0C;
    public C184708sO A0D;
    public AnonymousClass7XA A0E;
    public C161457ph A0F;
    public boolean A0G;
    public boolean A0H;
    public C185228tI[] A0I;
    public C185228tI[] A0J;
    public final C157257i0 A0K = new C157257i0();
    public final C161457ph A0L = new C161457ph(16);
    public final C161457ph A0M = new C161457ph();
    public final C161457ph A0N = new C161457ph(5);
    public final C161457ph A0O = new C161457ph(AnonymousClass79B.A02);
    public final C161457ph A0P;
    public final ArrayDeque A0Q;
    public final ArrayDeque A0R;
    public final List A0S = Collections.unmodifiableList(Collections.emptyList());
    public final byte[] A0T;

    public boolean BpR(C153437bJ r2) {
        return C154607dS.A00(r2, true);
    }

    public static void A01(AnonymousClass7QI r5, C161457ph r6, int i) {
        int A022 = C161457ph.A02(r6, i + 8) & 16777215;
        if ((A022 & 1) == 0) {
            boolean A1S = AnonymousClass000.A1S(A022 & 2);
            int A052 = r6.A05();
            int i2 = r5.A00;
            if (A052 == i2) {
                Arrays.fill(r5.A0D, 0, A052, A1S);
                C161457ph r2 = r5.A0F;
                r2.A0F(r6.A00 - r6.A01);
                r5.A07 = true;
                r5.A08 = true;
                r6.A0J(r2.A02, 0, r2.A00);
                r2.A0H(0);
                r5.A08 = false;
                return;
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Length mismatch: ");
            A0o.append(A052);
            throw C140626uD.A00(AnonymousClass000.A0Y(", ", A0o, i2));
        }
        throw C140626uD.A00("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    public final void A02(long j) {
        String str;
        C166657z3 r3;
        Object obj;
        int i;
        int i2;
        int i3;
        int i4;
        String str2;
        byte[] bArr;
        long A0A2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Object obj2;
        Object obj3;
        C150247Pw A032;
        while (true) {
            ArrayDeque arrayDeque = this.A0Q;
            if (arrayDeque.isEmpty() || ((C125816Jp) arrayDeque.peek()).A00 != j) {
                this.A02 = 0;
                this.A00 = 0;
            } else {
                C125816Jp r12 = (C125816Jp) arrayDeque.pop();
                int i11 = r12.A00;
                if (i11 == 1836019574) {
                    boolean z = true;
                    int i12 = 0;
                    C166657z3 A002 = A00(r12.A02);
                    C125816Jp A003 = r12.A00(1836475768);
                    A003.getClass();
                    SparseArray A0I2 = AnonymousClass6CA.A0I();
                    List list = A003.A02;
                    int size = list.size();
                    long j2 = -9223372036854775807L;
                    for (int i13 = 0; i13 < size; i13++) {
                        C125806Jo r32 = (C125806Jo) list.get(i13);
                        int i14 = r32.A00;
                        if (i14 == 1953654136) {
                            C161457ph r0 = r32.A00;
                            Pair create = Pair.create(Integer.valueOf(C161457ph.A02(r0, 12)), new C149147Lf(r0.A05() - 1, r0.A05(), r0.A05(), r0.A03()));
                            A0I2.put(C18280x3.A03(create), create.second);
                        } else if (i14 == 1835362404) {
                            C161457ph r1 = r32.A00;
                            if (C161457ph.A00(r1) == 0) {
                                j2 = r1.A09();
                            } else {
                                j2 = r1.A0A();
                            }
                        }
                    }
                    SparseArray A0I3 = AnonymousClass6CA.A0I();
                    List list2 = r12.A01;
                    int size2 = list2.size();
                    for (int i15 = 0; i15 < size2; i15++) {
                        C125816Jp r13 = (C125816Jp) list2.get(i15);
                        if (r13.A00 == 1953653099 && (A032 = C161567px.A03(A002, r13, r12.A01(1836476516), j2, false)) != null) {
                            A0I3.put(A032.A00, A032);
                        }
                    }
                    int size3 = A0I3.size();
                    SparseArray sparseArray = this.A0C;
                    if (sparseArray.size() != 0) {
                        if (sparseArray.size() != size3) {
                            z = false;
                        }
                        C159197lM.A02(z);
                        while (i12 < size3) {
                            C150247Pw r4 = (C150247Pw) A0I3.valueAt(i12);
                            int i16 = r4.A00;
                            AnonymousClass7XA r2 = (AnonymousClass7XA) sparseArray.get(i16);
                            if (A0I2.size() == 1) {
                                obj3 = A0I2.valueAt(0);
                            } else {
                                obj3 = A0I2.get(i16);
                                obj3.getClass();
                            }
                            C149147Lf r02 = (C149147Lf) obj3;
                            r2.A05 = r4;
                            r02.getClass();
                            r2.A04 = r02;
                            r2.A06.B3S(r4.A07);
                            r2.A01();
                            i12++;
                        }
                    } else {
                        while (i12 < size3) {
                            C150247Pw r11 = (C150247Pw) A0I3.valueAt(i12);
                            AnonymousClass7XA r42 = new AnonymousClass7XA(this.A0D.Bqz(i12, r11.A03));
                            int i17 = r11.A00;
                            if (A0I2.size() == 1) {
                                obj2 = A0I2.valueAt(0);
                            } else {
                                obj2 = A0I2.get(i17);
                                obj2.getClass();
                            }
                            C149147Lf r03 = (C149147Lf) obj2;
                            r42.A05 = r11;
                            r03.getClass();
                            r42.A04 = r03;
                            r42.A06.B3S(r11.A07);
                            r42.A01();
                            sparseArray.put(i17, r42);
                            this.A08 = Math.max(this.A08, r11.A04);
                            i12++;
                        }
                        if (this.A0J == null) {
                            C185228tI[] r04 = new C185228tI[2];
                            this.A0J = r04;
                            C185228tI[] r6 = (C185228tI[]) Arrays.copyOf(r04, 0);
                            this.A0J = r6;
                            for (C185228tI B3S : r6) {
                                B3S.B3S(A0U);
                            }
                        }
                        if (this.A0I == null) {
                            List list3 = this.A0S;
                            C185228tI[] r05 = new C185228tI[list3.size()];
                            this.A0I = r05;
                            for (int i18 = 0; i18 < r05.length; i18++) {
                                C185228tI Bqz = this.A0D.Bqz(sparseArray.size() + 1 + i18, 3);
                                Bqz.B3S((C166637z1) list3.get(i18));
                                r05 = this.A0I;
                                r05[i18] = Bqz;
                            }
                        }
                        AnonymousClass812 r06 = (AnonymousClass812) this.A0D;
                        r06.A0H = true;
                        r06.A0Q.post(r06.A0Y);
                    }
                } else if (i11 == 1836019558) {
                    SparseArray sparseArray2 = this.A0C;
                    byte[] bArr2 = this.A0T;
                    List list4 = r12.A01;
                    int size4 = list4.size();
                    for (int i19 = 0; i19 < size4; i19++) {
                        C125816Jp r7 = (C125816Jp) list4.get(i19);
                        if (r7.A00 == 1953653094) {
                            C161457ph r33 = r7.A01(1952868452).A00;
                            int A022 = C161457ph.A02(r33, 8) & 16777215;
                            int A033 = r33.A03();
                            if (sparseArray2.size() == 1) {
                                obj = sparseArray2.valueAt(0);
                            } else {
                                obj = sparseArray2.get(A033);
                            }
                            AnonymousClass7XA r62 = (AnonymousClass7XA) obj;
                            if (r62 == null) {
                                continue;
                            } else {
                                if ((A022 & 1) != 0) {
                                    long A0A3 = r33.A0A();
                                    AnonymousClass7QI r43 = r62.A07;
                                    r43.A03 = A0A3;
                                    r43.A02 = A0A3;
                                }
                                C149147Lf r14 = r62.A04;
                                if ((A022 & 2) != 0) {
                                    i = r33.A05() - 1;
                                } else {
                                    i = r14.A02;
                                }
                                if ((A022 & 8) != 0) {
                                    i2 = r33.A05();
                                } else {
                                    i2 = r14.A00;
                                }
                                if ((A022 & 16) != 0) {
                                    i3 = r33.A05();
                                } else {
                                    i3 = r14.A03;
                                }
                                if ((A022 & 32) != 0) {
                                    i4 = r33.A05();
                                } else {
                                    i4 = r14.A01;
                                }
                                AnonymousClass7QI r34 = r62.A07;
                                r34.A05 = new C149147Lf(i, i2, i3, i4);
                                long j3 = r34.A04;
                                r62.A01();
                                if (r7.A01(1952867444) != null) {
                                    C161457ph r44 = r7.A01(1952867444).A00;
                                    if (C161457ph.A00(r44) == 1) {
                                        j3 = r44.A0A();
                                    } else {
                                        j3 = r44.A09();
                                    }
                                }
                                List list5 = r7.A02;
                                int size5 = list5.size();
                                int i20 = 0;
                                int i21 = 0;
                                int i22 = 0;
                                for (int i23 = 0; i23 < size5; i23++) {
                                    C125806Jo r9 = (C125806Jo) list5.get(i23);
                                    if (r9.A00 == 1953658222) {
                                        C161457ph r8 = r9.A00;
                                        r8.A0H(12);
                                        int A052 = r8.A05();
                                        if (A052 > 0) {
                                            i22 += A052;
                                            i21++;
                                        }
                                    }
                                }
                                r62.A02 = 0;
                                r62.A00 = 0;
                                r62.A01 = 0;
                                r34.A01 = i21;
                                r34.A00 = i22;
                                if (r34.A0A.length < i21) {
                                    r34.A0C = new long[i21];
                                    r34.A0A = new int[i21];
                                }
                                if (r34.A09.length < i22) {
                                    int i24 = (i22 * 125) / 100;
                                    r34.A09 = new int[i24];
                                    r34.A0B = new long[i24];
                                    r34.A0E = new boolean[i24];
                                    r34.A0D = new boolean[i24];
                                }
                                int i25 = 0;
                                for (int i26 = 0; i26 < size5; i26++) {
                                    C125806Jo r45 = (C125806Jo) list5.get(i26);
                                    if (r45.A00 == 1953658222) {
                                        int i27 = i20 + 1;
                                        C161457ph r07 = r45.A00;
                                        C161457ph r39 = r07;
                                        long j4 = j3;
                                        int A023 = C161457ph.A02(r07, 8) & 16777215;
                                        C150247Pw r142 = r62.A05;
                                        C149147Lf r38 = r34.A05;
                                        int[] iArr = r34.A0A;
                                        int A053 = r39.A05();
                                        iArr[i20] = A053;
                                        long[] jArr = r34.A0C;
                                        long[] jArr2 = jArr;
                                        long j5 = r34.A03;
                                        jArr[i20] = j5;
                                        if ((A023 & 1) != 0) {
                                            jArr2[i20] = j5 + ((long) r39.A03());
                                        }
                                        boolean A1S = AnonymousClass000.A1S(A023 & 4);
                                        int i28 = r38.A01;
                                        int i29 = i28;
                                        int i30 = i28;
                                        if (A1S) {
                                            i29 = r39.A05();
                                        }
                                        boolean A1S2 = AnonymousClass000.A1S(A023 & 256);
                                        boolean A1S3 = AnonymousClass000.A1S(A023 & 512);
                                        boolean A1S4 = AnonymousClass000.A1S(A023 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
                                        boolean A1S5 = AnonymousClass000.A1S(A023 & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
                                        long[] jArr3 = r142.A08;
                                        long j6 = 0;
                                        if (jArr3 != null && jArr3.length == 1 && jArr3[0] == 0) {
                                            j6 = r142.A09[0];
                                        }
                                        int[] iArr2 = r34.A09;
                                        long[] jArr4 = r34.A0B;
                                        boolean[] zArr = r34.A0E;
                                        int i31 = i25 + A053;
                                        long j7 = r142.A06;
                                        if (i20 > 0) {
                                            j4 = r34.A04;
                                        }
                                        while (true) {
                                            i6 = i31;
                                            if (i25 >= i6) {
                                                break;
                                            }
                                            if (A1S2) {
                                                i7 = r39.A05();
                                            } else {
                                                i7 = r38.A00;
                                            }
                                            if (A1S3) {
                                                i8 = r39.A05();
                                            } else {
                                                i8 = r38.A03;
                                            }
                                            if (i25 == 0 && A1S) {
                                                A1S = true;
                                                i9 = i29;
                                            } else if (A1S4) {
                                                i9 = r39.A03();
                                            } else {
                                                i9 = i30;
                                            }
                                            if (A1S5) {
                                                i10 = r39.A03();
                                                A1S5 = true;
                                            } else {
                                                A1S5 = false;
                                                i10 = 0;
                                            }
                                            jArr4[i25] = Util.A06((((long) i10) + j4) - j6, j7);
                                            zArr[i25] = AnonymousClass000.A1T((i9 >> 16) & 1);
                                            iArr2[i25] = i8;
                                            j4 += (long) i7;
                                            i25++;
                                        }
                                        r34.A04 = j4;
                                        i25 = i6;
                                        i20 = i27;
                                    }
                                }
                                AnonymousClass7NR r46 = r62.A05.A0A[r34.A05.A02];
                                C125806Jo A012 = r7.A01(1935763834);
                                if (A012 != null) {
                                    C161457ph r10 = A012.A00;
                                    int i32 = r46.A00;
                                    boolean z2 = true;
                                    if ((C161457ph.A02(r10, 8) & 16777215 & 1) == 1) {
                                        r10.A0I(8);
                                    }
                                    int A042 = r10.A04();
                                    int A054 = r10.A05();
                                    int i33 = r34.A00;
                                    if (A054 == i33) {
                                        if (A042 == 0) {
                                            boolean[] zArr2 = r34.A0D;
                                            i5 = 0;
                                            for (int i34 = 0; i34 < A054; i34++) {
                                                int A043 = r10.A04();
                                                i5 += A043;
                                                zArr2[i34] = C86624Kv.A1W(A043, i32);
                                            }
                                        } else {
                                            if (A042 <= i32) {
                                                z2 = false;
                                            }
                                            i5 = A042 * A054;
                                            Arrays.fill(r34.A0D, 0, A054, z2);
                                        }
                                        r34.A0F.A0F(i5);
                                        r34.A07 = true;
                                        r34.A08 = true;
                                    } else {
                                        StringBuilder A0o = AnonymousClass001.A0o();
                                        A0o.append("Length mismatch: ");
                                        A0o.append(A054);
                                        throw C140626uD.A00(AnonymousClass000.A0Y(", ", A0o, i33));
                                    }
                                }
                                C125806Jo A013 = r7.A01(1935763823);
                                if (A013 != null) {
                                    C161457ph r63 = A013.A00;
                                    int A024 = C161457ph.A02(r63, 8);
                                    if ((16777215 & A024 & 1) == 1) {
                                        r63.A0I(8);
                                    }
                                    int A055 = r63.A05();
                                    if (A055 == 1) {
                                        int i35 = (A024 >> 24) & 255;
                                        long j8 = r34.A02;
                                        if (i35 == 0) {
                                            A0A2 = r63.A09();
                                        } else {
                                            A0A2 = r63.A0A();
                                        }
                                        r34.A02 = j8 + A0A2;
                                    } else {
                                        throw C140626uD.A00(AnonymousClass000.A0Y("Unexpected saio entry count: ", AnonymousClass001.A0o(), A055));
                                    }
                                }
                                C125806Jo A014 = r7.A01(1936027235);
                                if (A014 != null) {
                                    A01(r34, A014.A00, 0);
                                }
                                C125806Jo A015 = r7.A01(1935828848);
                                C125806Jo A016 = r7.A01(1936158820);
                                if (!(A015 == null || A016 == null)) {
                                    C161457ph r92 = A015.A00;
                                    C161457ph r5 = A016.A00;
                                    if (r46 != null) {
                                        str2 = r46.A02;
                                    } else {
                                        str2 = null;
                                    }
                                    int A025 = C161457ph.A02(r92, 8);
                                    if (r92.A03() == 1936025959) {
                                        if (((A025 >> 24) & 255) == 1) {
                                            r92.A0I(4);
                                        }
                                        if (r92.A03() == 1) {
                                            int A026 = C161457ph.A02(r5, 8);
                                            if (r5.A03() == 1936025959) {
                                                int i36 = (A026 >> 24) & 255;
                                                if (i36 == 1) {
                                                    if (r5.A09() == 0) {
                                                        throw C140626uD.A00("Variable length description in sgpd found (unsupported)");
                                                    }
                                                } else if (i36 >= 2) {
                                                    r5.A0I(4);
                                                }
                                                if (r5.A09() == 1) {
                                                    int A017 = C161457ph.A01(r5, 1);
                                                    int i37 = (A017 & 240) >> 4;
                                                    int i38 = A017 & 15;
                                                    if (r5.A04() == 1) {
                                                        int A044 = r5.A04();
                                                        byte[] bArr3 = new byte[16];
                                                        r5.A0J(bArr3, 0, 16);
                                                        if (A044 == 0) {
                                                            int A045 = r5.A04();
                                                            bArr = new byte[A045];
                                                            r5.A0J(bArr, 0, A045);
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        r34.A07 = true;
                                                        r34.A06 = new AnonymousClass7NR(str2, bArr3, bArr, A044, i37, i38, true);
                                                    }
                                                } else {
                                                    throw C140626uD.A00("Entry count in sgpd != 1 (unsupported).");
                                                }
                                            }
                                        } else {
                                            throw C140626uD.A00("Entry count in sbgp != 1 (unsupported).");
                                        }
                                    }
                                }
                                int size6 = list5.size();
                                for (int i39 = 0; i39 < size6; i39++) {
                                    C125806Jo r47 = (C125806Jo) list5.get(i39);
                                    if (r47.A00 == 1970628964) {
                                        C161457ph r52 = r47.A00;
                                        r52.A0H(8);
                                        byte[] bArr4 = bArr2;
                                        r52.A0J(bArr4, 0, 16);
                                        if (Arrays.equals(bArr4, A0V)) {
                                            A01(r34, r52, 16);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    C166657z3 A004 = A00(r12.A02);
                    if (A004 != null) {
                        int size7 = sparseArray2.size();
                        for (int i40 = 0; i40 < size7; i40++) {
                            AnonymousClass7XA r48 = (AnonymousClass7XA) sparseArray2.valueAt(i40);
                            C150247Pw r35 = r48.A05;
                            AnonymousClass7NR r08 = r35.A0A[r48.A07.A05.A02];
                            if (r08 != null) {
                                str = r08.A02;
                            } else {
                                str = null;
                            }
                            C185228tI r53 = r48.A06;
                            C166637z1 r49 = r35.A07;
                            if (Util.A0D(A004.A02, str)) {
                                r3 = A004;
                            } else {
                                r3 = new C166657z3(str, A004.A03);
                            }
                            C157797it r15 = new C157797it(r49);
                            r15.A00(r3);
                            r53.B3S(new C166637z1(r15));
                        }
                    }
                    long j9 = this.A0A;
                    if (j9 != -9223372036854775807L) {
                        int size8 = sparseArray2.size();
                        for (int i41 = 0; i41 < size8; i41++) {
                            AnonymousClass7XA r112 = (AnonymousClass7XA) sparseArray2.valueAt(i41);
                            int i42 = r112.A01;
                            while (true) {
                                AnonymousClass7QI r122 = r112.A07;
                                if (i42 >= r122.A00 || r122.A0B[i42] >= j9) {
                                } else {
                                    if (r122.A0E[i42]) {
                                        r112.A03 = i42;
                                    }
                                    i42++;
                                }
                            }
                        }
                        this.A0A = -9223372036854775807L;
                    }
                } else if (!arrayDeque.isEmpty()) {
                    ((C125816Jp) arrayDeque.peek()).A01.add(r12);
                }
            }
        }
        this.A02 = 0;
        this.A00 = 0;
    }

    public void BFq(C184708sO r1) {
        this.A0D = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03f4, code lost:
        if (r6 == 1701671783) goto L_0x03f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0646, code lost:
        if (r14 != 3) goto L_0x0648;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x06d2, code lost:
        if (r10.A0D[r3] == false) goto L_0x06d4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:392:0x07dc A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int BiC(X.C153437bJ r30, X.AnonymousClass7A1 r31) {
        /*
            r29 = this;
        L_0x0000:
            r0 = r29
            int r2 = r0.A02
            r1 = r30
            if (r2 == 0) goto L_0x0284
            r13 = 1
            if (r2 == r13) goto L_0x0081
            r12 = 2
            if (r2 == r12) goto L_0x0056
            r9 = 0
            r11 = 4
            r5 = 1
            r4 = 0
            r8 = 3
            if (r2 != r8) goto L_0x04e1
            X.7XA r10 = r0.A0E
            if (r10 != 0) goto L_0x0462
            android.util.SparseArray r15 = r0.A0C
            int r14 = r15.size()
            r10 = 0
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r13 = 0
        L_0x0026:
            if (r13 >= r14) goto L_0x0044
            java.lang.Object r3 = r15.valueAt(r13)
            X.7XA r3 = (X.AnonymousClass7XA) r3
            int r6 = r3.A02
            X.7QI r7 = r3.A07
            int r2 = r7.A01
            if (r6 == r2) goto L_0x0041
            long[] r2 = r7.A0C
            r6 = r2[r6]
            int r2 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r2 >= 0) goto L_0x0041
            r10 = r3
            r16 = r6
        L_0x0041:
            int r13 = r13 + 1
            goto L_0x0026
        L_0x0044:
            if (r10 != 0) goto L_0x0447
            long r5 = r0.A09
            long r2 = r1.A02
            long r5 = r5 - r2
            int r2 = (int) r5
            if (r2 < 0) goto L_0x0440
            r1.A01(r2)
            r0.A02 = r4
            r0.A00 = r4
            goto L_0x0000
        L_0x0056:
            android.util.SparseArray r11 = r0.A0C
            int r10 = r11.size()
            r4 = 0
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9 = 0
        L_0x0063:
            if (r9 >= r10) goto L_0x0341
            java.lang.Object r2 = r11.valueAt(r9)
            X.7XA r2 = (X.AnonymousClass7XA) r2
            X.7QI r3 = r2.A07
            boolean r2 = r3.A08
            if (r2 == 0) goto L_0x007e
            long r7 = r3.A02
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x007e
            java.lang.Object r4 = r11.valueAt(r9)
            X.7XA r4 = (X.AnonymousClass7XA) r4
            r5 = r7
        L_0x007e:
            int r9 = r9 + 1
            goto L_0x0063
        L_0x0081:
            long r2 = r0.A07
            int r5 = (int) r2
            int r2 = r0.A00
            int r5 = r5 - r2
            X.7ph r2 = r0.A0F
            if (r2 == 0) goto L_0x027f
            byte[] r4 = r2.A02
            r3 = 8
            r2 = 0
            r1.A05(r4, r3, r5, r2)
            int r3 = r0.A01
            X.7ph r2 = r0.A0F
            X.6Jo r4 = new X.6Jo
            r4.<init>(r2, r3)
            java.util.ArrayDeque r3 = r0.A0Q
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L_0x00b6
            java.lang.Object r2 = r3.peek()
            X.6Jp r2 = (X.C125816Jp) r2
            java.util.List r2 = r2.A02
            r2.add(r4)
        L_0x00af:
            long r1 = r1.A02
            r0.A02(r1)
            goto L_0x0000
        L_0x00b6:
            int r3 = r4.A00
            r2 = 1936286840(0x73696478, float:1.8491255E31)
            if (r3 != r2) goto L_0x0155
            X.7ph r9 = r4.A00
            long r2 = r1.A02
            int r5 = X.C161457ph.A00(r9)
            r4 = 4
            r9.A0I(r4)
            long r24 = r9.A09()
            if (r5 != 0) goto L_0x0122
            long r20 = r9.A09()
            long r4 = r9.A09()
        L_0x00d7:
            long r2 = r2 + r4
            r22 = 1000000(0xf4240, double:4.940656E-318)
            long r18 = com.facebook.android.exoplayer2.util.Util.A07(r20, r22, r24)
            r4 = 2
            r9.A0I(r4)
            int r8 = r9.A06()
            int[] r7 = new int[r8]
            long[] r10 = new long[r8]
            long[] r6 = new long[r8]
            long[] r5 = new long[r8]
            r16 = r18
            r4 = 0
        L_0x00f2:
            if (r4 >= r8) goto L_0x012b
            int r12 = r9.A03()
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = r11 & r12
            if (r11 != 0) goto L_0x07b3
            long r14 = r9.A09()
            r11 = 2147483647(0x7fffffff, float:NaN)
            r12 = r12 & r11
            r7[r4] = r12
            r10[r4] = r2
            r5[r4] = r16
            long r20 = r20 + r14
            long r14 = com.facebook.android.exoplayer2.util.Util.A07(r20, r22, r24)
            long r11 = r14 - r16
            r6[r4] = r11
            r11 = 4
            r9.A0I(r11)
            r11 = r7[r4]
            long r11 = (long) r11
            long r2 = r2 + r11
            int r4 = r4 + 1
            r16 = r14
            goto L_0x00f2
        L_0x0122:
            long r20 = r9.A0A()
            long r4 = r9.A0A()
            goto L_0x00d7
        L_0x012b:
            java.lang.Long r3 = java.lang.Long.valueOf(r18)
            X.815 r2 = new X.815
            r2.<init>(r7, r10, r6, r5)
            android.util.Pair r5 = android.util.Pair.create(r3, r2)
            java.lang.Object r2 = r5.first
            long r2 = X.C18310x6.A0B(r2)
            r0.A0B = r2
            X.8sO r4 = r0.A0D
            java.lang.Object r2 = r5.second
            X.8sP r2 = (X.C184718sP) r2
            X.812 r4 = (X.AnonymousClass812) r4
            r4.A07 = r2
            android.os.Handler r3 = r4.A0Q
            java.lang.Runnable r2 = r4.A0Y
            r3.post(r2)
            r0.A0G = r13
            goto L_0x00af
        L_0x0155:
            r2 = 1701671783(0x656d7367, float:7.0083103E22)
            if (r3 != r2) goto L_0x00af
            X.8uF r2 = r1.A05
            android.net.Uri r10 = r2.BE6()
            if (r10 == 0) goto L_0x00af
            X.7ph r7 = r4.A00
            X.8tI[] r2 = r0.A0J
            if (r2 == 0) goto L_0x00af
            int r2 = r2.length
            if (r2 == 0) goto L_0x00af
            int r4 = X.C161457ph.A00(r7)
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L_0x01b9
            if (r4 == r13) goto L_0x0189
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "Skipping unsupported emsg version: "
            java.lang.String r3 = X.AnonymousClass000.A0Y(r2, r3, r4)
            java.lang.String r2 = "FragmentedMp4Extractor"
            android.util.Log.w(r2, r3)
            goto L_0x00af
        L_0x0189:
            long r4 = r7.A09()
            long r2 = r7.A0A()
            long r2 = com.facebook.android.exoplayer2.util.Util.A06(r2, r4)
            long r18 = r7.A09()
            r20 = 1000(0x3e8, double:4.94E-321)
            r22 = r4
            long r22 = com.facebook.android.exoplayer2.util.Util.A07(r18, r20, r22)
            long r24 = r7.A09()
            java.lang.String r19 = r7.A0B()
            r19.getClass()
            java.lang.String r20 = r7.A0B()
            r20.getClass()
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x01ea
        L_0x01b9:
            java.lang.String r19 = r7.A0B()
            r19.getClass()
            java.lang.String r20 = r7.A0B()
            r20.getClass()
            long r4 = r7.A09()
            long r2 = r7.A09()
            long r8 = com.facebook.android.exoplayer2.util.Util.A06(r2, r4)
            long r2 = r0.A0B
            int r6 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r6 == 0) goto L_0x0206
            long r2 = r2 + r8
        L_0x01da:
            long r21 = r7.A09()
            r23 = 1000(0x3e8, double:4.94E-321)
            r25 = r4
            long r22 = com.facebook.android.exoplayer2.util.Util.A07(r21, r23, r25)
            long r24 = r7.A09()
        L_0x01ea:
            int r5 = r7.A00
            int r4 = r7.A01
            int r5 = r5 - r4
            byte[] r4 = new byte[r5]
            r6 = 0
            r7.A0J(r4, r6, r5)
            X.81P r7 = new X.81P
            r21 = r4
            r18 = r7
            r18.<init>(r19, r20, r21, r22, r24)
            X.7i0 r4 = r0.A0K
            java.io.ByteArrayOutputStream r12 = r4.A00
            r12.reset()
            goto L_0x020c
        L_0x0206:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x01da
        L_0x020c:
            java.io.DataOutputStream r11 = r4.A01     // Catch:{ IOException -> 0x07ba }
            java.lang.String r4 = r7.A03     // Catch:{ IOException -> 0x07ba }
            r11.writeBytes(r4)     // Catch:{ IOException -> 0x07ba }
            r11.writeByte(r6)     // Catch:{ IOException -> 0x07ba }
            java.lang.String r4 = r7.A04     // Catch:{ IOException -> 0x07ba }
            if (r4 != 0) goto L_0x021c
            java.lang.String r4 = ""
        L_0x021c:
            r11.writeBytes(r4)     // Catch:{ IOException -> 0x07ba }
            r11.writeByte(r6)     // Catch:{ IOException -> 0x07ba }
            long r4 = r7.A01     // Catch:{ IOException -> 0x07ba }
            X.AnonymousClass6C9.A0w(r11, r4)     // Catch:{ IOException -> 0x07ba }
            long r4 = r7.A02     // Catch:{ IOException -> 0x07ba }
            X.AnonymousClass6C9.A0w(r11, r4)     // Catch:{ IOException -> 0x07ba }
            byte[] r4 = r7.A05     // Catch:{ IOException -> 0x07ba }
            r11.write(r4)     // Catch:{ IOException -> 0x07ba }
            r11.flush()     // Catch:{ IOException -> 0x07ba }
            byte[] r4 = r12.toByteArray()     // Catch:{ IOException -> 0x07ba }
            X.7ph r15 = new X.7ph
            r15.<init>((byte[]) r4)
            int r7 = r15.A00
            int r4 = r15.A01
            int r7 = r7 - r4
            X.8tI[] r14 = r0.A0J
            int r12 = r14.length
            r11 = 0
        L_0x0246:
            if (r11 >= r12) goto L_0x0258
            r5 = r14[r11]
            r15.A0H(r6)
            r4 = r5
            X.818 r4 = (X.AnonymousClass818) r4
            r4.A01 = r10
            r5.Bkb(r15, r7)
            int r11 = r11 + 1
            goto L_0x0246
        L_0x0258:
            int r4 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r4 != 0) goto L_0x026d
            java.util.ArrayDeque r3 = r0.A0R
            X.7F5 r2 = new X.7F5
            r2.<init>(r8, r7)
            r3.addLast(r2)
            int r2 = r0.A03
            int r2 = r2 + r7
            r0.A03 = r2
            goto L_0x00af
        L_0x026d:
            X.8tI[] r5 = r0.A0J
            int r4 = r5.length
        L_0x0270:
            if (r6 >= r4) goto L_0x00af
            r11 = r5[r6]
            r15 = 0
            r12 = 0
            r14 = r7
            r16 = r2
            r11.Bkg(r12, r13, r14, r15, r16)
            int r6 = r6 + 1
            goto L_0x0270
        L_0x027f:
            r1.A01(r5)
            goto L_0x00af
        L_0x0284:
            int r2 = r0.A00
            r10 = 8
            r9 = 0
            r11 = 1
            if (r2 != 0) goto L_0x02a9
            X.7ph r4 = r0.A0L
            byte[] r2 = r4.A02
            boolean r2 = r1.A05(r2, r9, r10, r11)
            if (r2 != 0) goto L_0x0298
            r0 = -1
            return r0
        L_0x0298:
            r0.A00 = r10
            r4.A0H(r9)
            long r2 = r4.A09()
            r0.A07 = r2
            int r2 = r4.A03()
            r0.A01 = r2
        L_0x02a9:
            long r2 = r0.A07
            r5 = 1
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 != 0) goto L_0x02f0
            X.7ph r3 = r0.A0L
            byte[] r2 = r3.A02
            r1.A05(r2, r10, r10, r9)
            int r2 = r0.A00
            int r2 = r2 + 8
            r0.A00 = r2
            long r4 = r3.A0A()
        L_0x02c2:
            r0.A07 = r4
        L_0x02c4:
            long r7 = r0.A07
            int r12 = r0.A00
            long r5 = (long) r12
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x07dc
            long r3 = r1.A02
            long r1 = r3 - r5
            int r6 = r0.A01
            r5 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r6 != r5) goto L_0x031a
            android.util.SparseArray r12 = r0.A0C
            int r11 = r12.size()
            r10 = 0
        L_0x02df:
            if (r10 >= r11) goto L_0x041e
            java.lang.Object r5 = r12.valueAt(r10)
            X.7XA r5 = (X.AnonymousClass7XA) r5
            X.7QI r5 = r5.A07
            r5.A02 = r1
            r5.A03 = r1
            int r10 = r10 + 1
            goto L_0x02df
        L_0x02f0:
            r5 = 0
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 != 0) goto L_0x02c4
            long r4 = r1.A04
            r6 = -1
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x030e
            java.util.ArrayDeque r3 = r0.A0Q
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L_0x030e
            java.lang.Object r2 = r3.peek()
            X.6Jp r2 = (X.C125816Jp) r2
            long r4 = r2.A00
        L_0x030e:
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x02c4
            long r2 = r1.A02
            long r4 = r4 - r2
            int r2 = r0.A00
            long r2 = (long) r2
            long r4 = r4 + r2
            goto L_0x02c2
        L_0x031a:
            r13 = 1835295092(0x6d646174, float:4.4175247E27)
            r5 = 0
            if (r6 != r13) goto L_0x0364
            r0.A0E = r5
            long r7 = r7 + r1
            r0.A09 = r7
            boolean r3 = r0.A0G
            if (r3 != 0) goto L_0x033f
            X.8sO r6 = r0.A0D
            long r4 = r0.A08
            X.814 r3 = new X.814
            r3.<init>(r4, r1)
            X.812 r6 = (X.AnonymousClass812) r6
            r6.A07 = r3
            android.os.Handler r2 = r6.A0Q
            java.lang.Runnable r1 = r6.A0Y
            r2.post(r1)
            r0.A0G = r11
        L_0x033f:
            r1 = 2
            goto L_0x0344
        L_0x0341:
            if (r4 != 0) goto L_0x0348
            r1 = 3
        L_0x0344:
            r0.A02 = r1
            goto L_0x0000
        L_0x0348:
            long r2 = r1.A02
            long r5 = r5 - r2
            int r0 = (int) r5
            if (r0 < 0) goto L_0x07c0
            r1.A01(r0)
            X.7QI r5 = r4.A07
            X.7ph r4 = r5.A0F
            byte[] r3 = r4.A02
            int r2 = r4.A00
            r0 = 0
            r1.A05(r3, r0, r2, r0)
            r4.A0H(r0)
            r5.A08 = r0
            goto L_0x0000
        L_0x0364:
            r1 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r6 == r1) goto L_0x041e
            r1 = 1953653099(0x7472616b, float:7.681346E31)
            if (r6 == r1) goto L_0x041e
            r1 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r6 == r1) goto L_0x041e
            r1 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r6 == r1) goto L_0x041e
            r1 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r6 == r1) goto L_0x041e
            r1 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r6 == r1) goto L_0x041e
            r1 = 1953653094(0x74726166, float:7.6813435E31)
            if (r6 == r1) goto L_0x041e
            r1 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r6 == r1) goto L_0x041e
            r1 = 1701082227(0x65647473, float:6.742798E22)
            if (r6 == r1) goto L_0x041e
            r1 = 1751411826(0x68646c72, float:4.3148E24)
            if (r6 == r1) goto L_0x03f6
            r1 = 1835296868(0x6d646864, float:4.418049E27)
            if (r6 == r1) goto L_0x03f6
            r1 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r6 == r1) goto L_0x03f6
            r1 = 1936286840(0x73696478, float:1.8491255E31)
            if (r6 == r1) goto L_0x03f6
            r1 = 1937011556(0x73747364, float:1.9367383E31)
            if (r6 == r1) goto L_0x03f6
            r1 = 1952867444(0x74666474, float:7.3014264E31)
            if (r6 == r1) goto L_0x03f6
            r1 = 1952868452(0x74666864, float:7.301914E31)
            if (r6 == r1) goto L_0x03f6
            r1 = 1953196132(0x746b6864, float:7.46037E31)
            if (r6 == r1) goto L_0x03f6
            r1 = 1953654136(0x74726578, float:7.6818474E31)
            if (r6 == r1) goto L_0x03f6
            r1 = 1953658222(0x7472756e, float:7.683823E31)
            if (r6 == r1) goto L_0x03f6
            r1 = 1886614376(0x70737368, float:3.013775E29)
            if (r6 == r1) goto L_0x03f6
            r1 = 1935763834(0x7361697a, float:1.785898E31)
            if (r6 == r1) goto L_0x03f6
            r1 = 1935763823(0x7361696f, float:1.7858967E31)
            if (r6 == r1) goto L_0x03f6
            r1 = 1936027235(0x73656e63, float:1.8177412E31)
            if (r6 == r1) goto L_0x03f6
            r1 = 1970628964(0x75756964, float:3.1109627E32)
            if (r6 == r1) goto L_0x03f6
            r1 = 1935828848(0x73626770, float:1.7937577E31)
            if (r6 == r1) goto L_0x03f6
            r1 = 1936158820(0x73677064, float:1.8336489E31)
            if (r6 == r1) goto L_0x03f6
            r1 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r6 == r1) goto L_0x03f6
            r1 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r6 == r1) goto L_0x03f6
            r2 = 1701671783(0x656d7367, float:7.0083103E22)
            r1 = 0
            if (r6 != r2) goto L_0x03f7
        L_0x03f6:
            r1 = 1
        L_0x03f7:
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r1 == 0) goto L_0x0417
            if (r12 != r10) goto L_0x07ce
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x07c7
            int r1 = (int) r7
            X.7ph r3 = new X.7ph
            r3.<init>((int) r1)
            r0.A0F = r3
            X.7ph r1 = r0.A0L
            byte[] r2 = r1.A02
            byte[] r1 = r3.A02
            java.lang.System.arraycopy(r2, r9, r1, r9, r10)
        L_0x0413:
            r0.A02 = r11
            goto L_0x0000
        L_0x0417:
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x07d5
            r0.A0F = r5
            goto L_0x0413
        L_0x041e:
            long r3 = r3 + r7
            r1 = 8
            long r3 = r3 - r1
            java.util.ArrayDeque r2 = r0.A0Q
            X.6Jp r1 = new X.6Jp
            r1.<init>(r6, r3)
            r2.push(r1)
            long r7 = r0.A07
            int r1 = r0.A00
            long r5 = (long) r1
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x043a
            r0.A02(r3)
            goto L_0x0000
        L_0x043a:
            r0.A02 = r9
            r0.A00 = r9
            goto L_0x0000
        L_0x0440:
            java.lang.String r0 = "Offset to end of mdat was negative."
            X.6uD r0 = X.C140626uD.A00(r0)
            throw r0
        L_0x0447:
            X.7QI r2 = r10.A07
            long[] r3 = r2.A0C
            int r2 = r10.A02
            r6 = r3[r2]
            long r2 = r1.A02
            long r6 = r6 - r2
            int r2 = (int) r6
            if (r2 >= 0) goto L_0x045d
            java.lang.String r3 = "FragmentedMp4Extractor"
            java.lang.String r2 = "Ignoring negative offset to sample data."
            android.util.Log.w(r3, r2)
            r2 = 0
        L_0x045d:
            r1.A01(r2)
            r0.A0E = r10
        L_0x0462:
            X.7QI r2 = r10.A07
            int[] r2 = r2.A09
            int r6 = r10.A01
            r3 = r2[r6]
            r0.A06 = r3
            int r2 = r10.A03
            if (r6 >= r2) goto L_0x04bf
            r1.A01(r3)
            X.7XA r2 = r0.A0E
            X.7NR r1 = r2.A00()
            if (r1 == 0) goto L_0x049b
            X.7QI r5 = r2.A07
            X.7ph r3 = r5.A0F
            int r1 = r1.A00
            if (r1 == 0) goto L_0x0486
            r3.A0I(r1)
        L_0x0486:
            int r2 = r2.A01
            boolean r1 = r5.A07
            if (r1 == 0) goto L_0x049b
            boolean[] r1 = r5.A0D
            boolean r1 = r1[r2]
            if (r1 == 0) goto L_0x049b
            int r1 = r3.A06()
            int r1 = r1 * 6
            r3.A0I(r1)
        L_0x049b:
            X.7XA r5 = r0.A0E
            int r1 = r5.A01
            int r1 = r1 + 1
            r5.A01 = r1
            int r1 = r5.A00
            int r3 = r1 + 1
            r5.A00 = r3
            X.7QI r1 = r5.A07
            int[] r1 = r1.A0A
            int r2 = r5.A02
            r1 = r1[r2]
            if (r3 != r1) goto L_0x04bb
            int r1 = r2 + 1
            r5.A02 = r1
            r5.A00 = r4
            r0.A0E = r9
        L_0x04bb:
            r0.A02 = r8
            goto L_0x07b1
        L_0x04bf:
            X.7Pw r2 = r10.A05
            int r2 = r2.A02
            if (r2 != r5) goto L_0x04cd
            r2 = 8
            int r3 = r3 - r2
            r0.A06 = r3
            r1.A01(r2)
        L_0x04cd:
            X.7XA r7 = r0.A0E
            X.7NR r2 = r7.A00()
            if (r2 != 0) goto L_0x06bd
            r2 = 0
        L_0x04d6:
            r0.A04 = r2
            int r3 = r0.A06
            int r3 = r3 + r2
            r0.A06 = r3
            r0.A02 = r11
            r0.A05 = r4
        L_0x04e1:
            X.7XA r3 = r0.A0E
            X.7QI r2 = r3.A07
            r28 = r2
            X.7Pw r2 = r3.A05
            r27 = r2
            X.8tI r9 = r3.A06
            int r2 = r3.A01
            r19 = r2
            r2 = r28
            long[] r2 = r2.A0B
            r25 = r2[r19]
            r2 = r27
            int r2 = r2.A01
            if (r2 == 0) goto L_0x071e
            X.7ph r10 = r0.A0N
            byte[] r8 = r10.A02
            r8[r4] = r4
            r8[r5] = r4
            r8[r12] = r4
            int r18 = r2 + 1
            int r17 = 4 - r2
        L_0x050b:
            int r2 = r0.A04
            int r6 = r0.A06
            if (r2 >= r6) goto L_0x072f
            int r3 = r0.A05
            if (r3 != 0) goto L_0x056c
            r3 = r17
            r2 = r18
            r1.A05(r8, r3, r2, r4)
            int r2 = X.C161457ph.A02(r10, r4)
            if (r2 < r5) goto L_0x0714
            int r2 = r2 + -1
            r0.A05 = r2
            X.7ph r2 = r0.A0O
            r2.A0H(r4)
            r9.Bkb(r2, r11)
            r9.Bkb(r10, r5)
            X.8tI[] r2 = r0.A0I
            int r2 = r2.length
            if (r2 <= 0) goto L_0x056a
            r2 = r27
            X.7z1 r2 = r2.A07
            java.lang.String r6 = r2.A0S
            byte r7 = r8[r11]
            java.lang.String r2 = "video/avc"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x054b
            r3 = r7 & 31
            r2 = 6
            if (r3 == r2) goto L_0x055a
        L_0x054b:
            java.lang.String r2 = "video/hevc"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x056a
            r3 = r7 & 126(0x7e, float:1.77E-43)
            int r3 = r3 >> r5
            r2 = 39
            if (r3 != r2) goto L_0x056a
        L_0x055a:
            r2 = 1
        L_0x055b:
            r0.A0H = r2
            int r2 = r0.A04
            int r2 = r2 + 5
            r0.A04 = r2
            int r2 = r0.A06
            int r2 = r2 + r17
            r0.A06 = r2
            goto L_0x050b
        L_0x056a:
            r2 = 0
            goto L_0x055b
        L_0x056c:
            boolean r2 = r0.A0H
            if (r2 == 0) goto L_0x06aa
            X.7ph r7 = r0.A0M
            r7.A0F(r3)
            byte[] r2 = r7.A02
            r11 = 0
            r1.A05(r2, r4, r3, r4)
            int r2 = r0.A05
            r9.Bkb(r7, r2)
            int r6 = r0.A05
            byte[] r12 = r7.A02
            int r4 = r7.A00
            java.lang.Object r16 = X.AnonymousClass79B.A01
            monitor-enter(r16)
            r15 = 0
            r5 = 0
            r13 = 0
        L_0x058c:
            if (r5 < r4) goto L_0x05aa
            int r4 = r4 - r13
            r5 = 0
            r3 = 0
        L_0x0591:
            if (r5 >= r13) goto L_0x05db
            int[] r2 = X.AnonymousClass79B.A00     // Catch:{ all -> 0x071b }
            r2 = r2[r5]     // Catch:{ all -> 0x071b }
            int r2 = r2 - r3
            java.lang.System.arraycopy(r12, r3, r12, r11, r2)     // Catch:{ all -> 0x071b }
            int r11 = r11 + r2
            int r14 = r11 + 1
            r12[r11] = r15     // Catch:{ all -> 0x071b }
            int r11 = r14 + 1
            r12[r14] = r15     // Catch:{ all -> 0x071b }
            int r2 = r2 + 3
            int r3 = r3 + r2
            int r5 = r5 + 1
            goto L_0x0591
        L_0x05aa:
            int r2 = r4 + -2
            if (r5 >= r2) goto L_0x05c3
            byte r2 = r12[r5]     // Catch:{ all -> 0x071b }
            if (r2 != 0) goto L_0x05c0
            int r2 = r5 + 1
            byte r2 = r12[r2]     // Catch:{ all -> 0x071b }
            if (r2 != 0) goto L_0x05c0
            int r2 = r5 + 2
            byte r3 = r12[r2]     // Catch:{ all -> 0x071b }
            r2 = 3
            if (r3 != r2) goto L_0x05c0
            goto L_0x05c4
        L_0x05c0:
            int r5 = r5 + 1
            goto L_0x05aa
        L_0x05c3:
            r5 = r4
        L_0x05c4:
            if (r5 >= r4) goto L_0x058c
            int[] r3 = X.AnonymousClass79B.A00     // Catch:{ all -> 0x071b }
            int r2 = r3.length     // Catch:{ all -> 0x071b }
            if (r2 > r13) goto L_0x05d3
            int r2 = r2 * 2
            int[] r3 = java.util.Arrays.copyOf(r3, r2)     // Catch:{ all -> 0x071b }
            X.AnonymousClass79B.A00 = r3     // Catch:{ all -> 0x071b }
        L_0x05d3:
            int r2 = r13 + 1
            r3[r13] = r5     // Catch:{ all -> 0x071b }
            int r5 = r5 + 3
            r13 = r2
            goto L_0x058c
        L_0x05db:
            int r2 = r4 - r11
            java.lang.System.arraycopy(r12, r3, r12, r11, r2)     // Catch:{ all -> 0x071b }
            monitor-exit(r16)     // Catch:{ all -> 0x071b }
            r2 = r27
            X.7z1 r2 = r2.A07
            java.lang.String r3 = r2.A0S
            java.lang.String r2 = "video/hevc"
            boolean r2 = r2.equals(r3)
            r7.A0H(r2)
            r7.A0G(r4)
            X.8tI[] r2 = r0.A0I
            r16 = r2
        L_0x05f7:
            int r11 = r7.A00
            int r2 = r7.A01
            int r2 = r11 - r2
            r13 = 1
            if (r2 <= r13) goto L_0x06ae
            r4 = 0
        L_0x0601:
            int r2 = r7.A01
            int r2 = r11 - r2
            if (r2 != 0) goto L_0x069f
            r4 = -1
        L_0x0608:
            r12 = 0
        L_0x0609:
            int r2 = r7.A01
            int r2 = r11 - r2
            if (r2 != 0) goto L_0x0694
            r12 = -1
        L_0x0610:
            int r3 = r7.A01
            int r5 = r3 + r12
            r2 = -1
            if (r12 == r2) goto L_0x0686
            int r11 = r11 - r3
            if (r12 > r11) goto L_0x0686
            r2 = 4
            if (r4 != r2) goto L_0x068f
            r2 = 8
            if (r12 < r2) goto L_0x068f
            int r15 = r7.A04()
            int r12 = r7.A06()
            r11 = 49
            if (r12 != r11) goto L_0x0684
            int r4 = r7.A03()
        L_0x0631:
            int r14 = r7.A04()
            r3 = 47
            if (r12 != r3) goto L_0x063c
            r7.A0I(r13)
        L_0x063c:
            r2 = 181(0xb5, float:2.54E-43)
            if (r15 != r2) goto L_0x0648
            if (r12 == r11) goto L_0x0644
            if (r12 != r3) goto L_0x0648
        L_0x0644:
            r2 = 3
            r3 = 1
            if (r14 == r2) goto L_0x0649
        L_0x0648:
            r3 = 0
        L_0x0649:
            if (r12 != r11) goto L_0x0652
            r2 = 1195456820(0x47413934, float:49465.203)
            if (r4 == r2) goto L_0x0651
            r13 = 0
        L_0x0651:
            r3 = r3 & r13
        L_0x0652:
            if (r3 == 0) goto L_0x068f
            int r11 = r7.A04()
            r2 = r11 & 64
            r4 = 0
            r3 = 1
            if (r2 == 0) goto L_0x068f
            r2 = r11 & 31
            r7.A0I(r3)
            int r12 = r2 * 3
            int r11 = r7.A01
            r2 = r16
            int r3 = r2.length
        L_0x066a:
            if (r4 >= r3) goto L_0x068f
            r2 = r16[r4]
            r7.A0H(r11)
            r2.Bkb(r7, r12)
            r22 = 1
            r24 = 0
            r21 = 0
            r20 = r2
            r23 = r12
            r20.Bkg(r21, r22, r23, r24, r25)
            int r4 = r4 + 1
            goto L_0x066a
        L_0x0684:
            r4 = 0
            goto L_0x0631
        L_0x0686:
            java.lang.String r3 = "CeaUtil"
            java.lang.String r2 = "Skipping remainder of malformed SEI NAL unit."
            android.util.Log.w(r3, r2)
            int r5 = r7.A00
        L_0x068f:
            r7.A0H(r5)
            goto L_0x05f7
        L_0x0694:
            int r3 = r7.A04()
            int r12 = r12 + r3
            r2 = 255(0xff, float:3.57E-43)
            if (r3 == r2) goto L_0x0609
            goto L_0x0610
        L_0x069f:
            int r3 = r7.A04()
            int r4 = r4 + r3
            r2 = 255(0xff, float:3.57E-43)
            if (r3 == r2) goto L_0x0601
            goto L_0x0608
        L_0x06aa:
            int r6 = r9.Bka(r1, r3, r4)
        L_0x06ae:
            int r2 = r0.A04
            int r2 = r2 + r6
            r0.A04 = r2
            int r2 = r0.A05
            int r2 = r2 - r6
            r0.A05 = r2
            r11 = 4
            r5 = 1
            r4 = 0
            goto L_0x050b
        L_0x06bd:
            int r8 = r2.A00
            if (r8 == 0) goto L_0x06f2
            X.7QI r2 = r7.A07
            X.7ph r13 = r2.A0F
        L_0x06c5:
            X.7QI r10 = r7.A07
            int r3 = r7.A01
            boolean r2 = r10.A07
            if (r2 == 0) goto L_0x06d4
            boolean[] r2 = r10.A0D
            boolean r2 = r2[r3]
            r9 = 1
            if (r2 != 0) goto L_0x06d5
        L_0x06d4:
            r9 = 0
        L_0x06d5:
            X.7ph r6 = r7.A09
            byte[] r3 = r6.A02
            r2 = 0
            if (r9 == 0) goto L_0x06de
            r2 = 128(0x80, float:1.794E-43)
        L_0x06de:
            X.AnonymousClass6C8.A0u(r2, r3, r8, r4)
            r6.A0H(r4)
            X.8tI r7 = r7.A06
            r7.Bkb(r6, r5)
            r7.Bkb(r13, r8)
            if (r9 != 0) goto L_0x06fe
            int r2 = r8 + 1
            goto L_0x04d6
        L_0x06f2:
            byte[] r2 = r2.A04
            X.7ph r13 = r7.A08
            int r8 = r2.length
            r13.A02 = r2
            r13.A00 = r8
            r13.A01 = r4
            goto L_0x06c5
        L_0x06fe:
            X.7ph r6 = r10.A0F
            int r3 = r6.A06()
            r2 = -2
            r6.A0I(r2)
            int r2 = r3 * 6
            int r3 = r2 + 2
            r7.Bkb(r6, r3)
            int r2 = r8 + 1
            int r2 = r2 + r3
            goto L_0x04d6
        L_0x0714:
            java.lang.String r0 = "Invalid NAL length"
            X.6uD r0 = X.C140626uD.A00(r0)
            throw r0
        L_0x071b:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ all -> 0x071b }
            throw r0
        L_0x071e:
            int r2 = r0.A04
            int r6 = r0.A06
            if (r2 >= r6) goto L_0x072f
            int r6 = r6 - r2
            int r3 = r9.Bka(r1, r6, r4)
            int r2 = r0.A04
            int r2 = r2 + r3
            r0.A04 = r2
            goto L_0x071e
        L_0x072f:
            r1 = r28
            boolean[] r1 = r1.A0E
            boolean r22 = r1[r19]
            X.7XA r3 = r0.A0E
            X.7NR r2 = r3.A00()
            if (r2 == 0) goto L_0x078b
            r1 = 1073741824(0x40000000, float:2.0)
            r22 = r22 | r1
            X.7WT r7 = r2.A01
        L_0x0743:
            X.7Pw r1 = r3.A05
            if (r1 == 0) goto L_0x0751
            X.7z1 r1 = r1.A07
            java.lang.String r2 = r1.A0S
            java.lang.String r1 = "application/x-mp4-vtt"
            if (r2 != r1) goto L_0x0751
            r22 = r22 | 1
        L_0x0751:
            r3 = 0
            r20 = r9
            r21 = r7
            r23 = r6
            r24 = r4
            r20.Bkg(r21, r22, r23, r24, r25)
        L_0x075d:
            java.util.ArrayDeque r2 = r0.A0R
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x078d
            java.lang.Object r2 = r2.removeFirst()
            X.7F5 r2 = (X.AnonymousClass7F5) r2
            int r1 = r0.A03
            int r9 = r2.A00
            int r1 = r1 - r9
            r0.A03 = r1
            long r1 = r2.A01
            long r1 = r1 + r25
            X.8tI[] r8 = r0.A0J
            int r7 = r8.length
            r6 = 0
        L_0x077a:
            if (r6 >= r7) goto L_0x075d
            r10 = r8[r6]
            int r4 = r0.A03
            r11 = 0
            r12 = r5
            r13 = r9
            r14 = r4
            r15 = r1
            r10.Bkg(r11, r12, r13, r14, r15)
            int r6 = r6 + 1
            goto L_0x077a
        L_0x078b:
            r7 = 0
            goto L_0x0743
        L_0x078d:
            X.7XA r5 = r0.A0E
            int r1 = r5.A01
            int r1 = r1 + 1
            r5.A01 = r1
            int r1 = r5.A00
            int r4 = r1 + 1
            r5.A00 = r4
            X.7QI r1 = r5.A07
            int[] r1 = r1.A0A
            int r2 = r5.A02
            r1 = r1[r2]
            if (r4 != r1) goto L_0x07ae
            int r1 = r2 + 1
            r5.A02 = r1
            r5.A00 = r3
            r1 = 0
            r0.A0E = r1
        L_0x07ae:
            r1 = 3
            r0.A02 = r1
        L_0x07b1:
            r0 = 0
            return r0
        L_0x07b3:
            java.lang.String r0 = "Unhandled indirect reference"
            X.6uD r0 = X.C140626uD.A00(r0)
            throw r0
        L_0x07ba:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C18330xA.A09(r0)
            throw r0
        L_0x07c0:
            java.lang.String r0 = "Offset to encryption data was negative."
            X.6uD r0 = X.C140626uD.A00(r0)
            throw r0
        L_0x07c7:
            java.lang.String r0 = "Leaf atom with length > 2147483647 (unsupported)."
            X.6uD r0 = X.C140626uD.A00(r0)
            throw r0
        L_0x07ce:
            java.lang.String r0 = "Leaf atom defines extended atom size (unsupported)."
            X.6uD r0 = X.C140626uD.A00(r0)
            throw r0
        L_0x07d5:
            java.lang.String r0 = "Skipping atom with length > 2147483647 (unsupported)."
            X.6uD r0 = X.C140626uD.A00(r0)
            throw r0
        L_0x07dc:
            java.lang.String r0 = "Atom size less than header length (unsupported)."
            X.6uD r0 = X.C140626uD.A00(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass811.BiC(X.7bJ, X.7A1):int");
    }

    public void Bkz(long j, long j2) {
        SparseArray sparseArray = this.A0C;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((AnonymousClass7XA) sparseArray.valueAt(i)).A01();
        }
        this.A0R.clear();
        this.A03 = 0;
        this.A0A = j2;
        this.A0Q.clear();
        this.A02 = 0;
        this.A00 = 0;
    }

    public AnonymousClass811() {
        byte[] bArr = new byte[16];
        this.A0T = bArr;
        this.A0P = new C161457ph(bArr);
        this.A0Q = AnonymousClass6CA.A0a();
        this.A0R = AnonymousClass6CA.A0a();
        this.A0C = AnonymousClass6CA.A0I();
        this.A08 = -9223372036854775807L;
        this.A0A = -9223372036854775807L;
        this.A0B = -9223372036854775807L;
        this.A02 = 0;
        this.A00 = 0;
    }

    public static C166657z3 A00(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            C125806Jo r2 = (C125806Jo) list.get(i);
            if (r2.A00 == 1886614376) {
                if (arrayList == null) {
                    arrayList = AnonymousClass001.A0s();
                }
                byte[] bArr = r2.A00.A02;
                C148537It A002 = AnonymousClass70z.A00(bArr);
                if (A002 == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new C166487yl((String) null, A002.A01, bArr));
                }
            }
        }
        if (arrayList != null) {
            return new C166657z3((String) null, (C166487yl[]) arrayList.toArray(new C166487yl[arrayList.size()]));
        }
        return null;
    }
}
