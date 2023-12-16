package X;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: X.86b  reason: invalid class name and case insensitive filesystem */
public class C1686086b implements C185328tT {
    public static final C166527yp A0U;
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
    public C187028wK A0C;
    public C153107ag A0D;
    public C161467pi A0E;
    public boolean A0F;
    public boolean A0G;
    public C185598tw[] A0H;
    public C185598tw[] A0I;
    public final SparseArray A0J;
    public final C157287i3 A0K;
    public final C161467pi A0L;
    public final C161467pi A0M;
    public final C161467pi A0N;
    public final C161467pi A0O;
    public final C161467pi A0P;
    public final ArrayDeque A0Q;
    public final ArrayDeque A0R;
    public final List A0S;
    public final byte[] A0T;

    public boolean BpS(C187648xa r2) {
        return C154817dn.A00(r2, true);
    }

    static {
        C157057he A002 = C157057he.A00();
        A002.A0R = "application/x-emsg";
        A0U = C166527yp.A00(A002);
    }

    public static void A01(AnonymousClass7QL r5, C161467pi r6, int i) {
        int A042 = C161467pi.A04(r6, i + 8) & 16777215;
        if ((A042 & 1) == 0) {
            boolean A1S = AnonymousClass000.A1S(A042 & 2);
            int A0E2 = r6.A0E();
            if (A0E2 == 0) {
                Arrays.fill(r5.A0F, 0, r5.A00, false);
                return;
            }
            int i2 = r5.A00;
            if (A0E2 == i2) {
                Arrays.fill(r5.A0F, 0, A0E2, A1S);
                int A002 = C161467pi.A00(r6);
                C161467pi r2 = r5.A0H;
                r2.A0Q(A002);
                r5.A07 = true;
                r5.A09 = true;
                r6.A0V(r2.A02, 0, r2.A00);
                r2.A0S(0);
                r5.A09 = false;
                return;
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Senc sample count ");
            A0o.append(A0E2);
            throw AnonymousClass6u7.A02(" is different from fragment sample count", A0o, i2);
        }
        throw AnonymousClass6u7.A01("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    public final void A02(long j) {
        String str;
        C166647z2 r2;
        Object obj;
        int i;
        int i2;
        int i3;
        int i4;
        String str2;
        long A0J2;
        int i5;
        long j2;
        int i6;
        int i7;
        int i8;
        int A032;
        long A0I2;
        Object obj2;
        Object obj3;
        while (true) {
            ArrayDeque arrayDeque = this.A0Q;
            if (arrayDeque.isEmpty() || ((C126616Oq) arrayDeque.peek()).A00 != j) {
                this.A02 = 0;
                this.A00 = 0;
            } else {
                C126616Oq r14 = (C126616Oq) arrayDeque.pop();
                int i9 = r14.A00;
                if (i9 == 1836019574) {
                    boolean z = true;
                    int i10 = 0;
                    C166647z2 A002 = A00(r14.A02);
                    C126616Oq A003 = r14.A00(1836475768);
                    A003.getClass();
                    SparseArray A0I3 = AnonymousClass6CA.A0I();
                    List list = A003.A02;
                    int size = list.size();
                    long j3 = -9223372036854775807L;
                    for (int i11 = 0; i11 < size; i11++) {
                        C126606Op r22 = (C126606Op) list.get(i11);
                        int i12 = r22.A00;
                        if (i12 == 1953654136) {
                            C161467pi r0 = r22.A00;
                            Pair create = Pair.create(Integer.valueOf(C161467pi.A04(r0, 12)), new AnonymousClass7M4(r0.A07() - 1, r0.A07(), r0.A07(), r0.A07()));
                            A0I3.put(C18280x3.A03(create), create.second);
                        } else if (i12 == 1835362404) {
                            C161467pi r1 = r22.A00;
                            if (C161467pi.A01(r1) == 0) {
                                j3 = r1.A0I();
                            } else {
                                j3 = r1.A0J();
                            }
                        }
                    }
                    List A033 = C161587q0.A03(A002, new C157347i9(), r14, new AnonymousClass924(this, 0), j3, false);
                    int size2 = A033.size();
                    SparseArray sparseArray = this.A0J;
                    if (sparseArray.size() != 0) {
                        if (sparseArray.size() != size2) {
                            z = false;
                        }
                        C161487pm.A04(z);
                        while (i10 < size2) {
                            AnonymousClass7UO r9 = (AnonymousClass7UO) A033.get(i10);
                            int i13 = r9.A03.A00;
                            C153107ag r23 = (C153107ag) sparseArray.get(i13);
                            if (A0I3.size() == 1) {
                                obj3 = A0I3.valueAt(0);
                            } else {
                                obj3 = A0I3.get(i13);
                                obj3.getClass();
                            }
                            r23.A05 = r9;
                            r23.A04 = (AnonymousClass7M4) obj3;
                            r23.A07.B3T(r9.A03.A07);
                            r23.A02();
                            i10++;
                        }
                    } else {
                        while (i10 < size2) {
                            AnonymousClass7UO r13 = (AnonymousClass7UO) A033.get(i10);
                            AnonymousClass7Q0 r12 = r13.A03;
                            C185598tw Br0 = this.A0C.Br0(i10, r12.A03);
                            int i14 = r12.A00;
                            if (A0I3.size() == 1) {
                                obj2 = A0I3.valueAt(0);
                            } else {
                                obj2 = A0I3.get(i14);
                                obj2.getClass();
                            }
                            sparseArray.put(i14, new C153107ag(Br0, (AnonymousClass7M4) obj2, r13));
                            this.A08 = Math.max(this.A08, r12.A04);
                            i10++;
                        }
                        this.A0C.B2W();
                    }
                } else if (i9 == 1836019558) {
                    SparseArray sparseArray2 = this.A0J;
                    byte[] bArr = this.A0T;
                    List list2 = r14.A01;
                    int size3 = list2.size();
                    for (int i15 = 0; i15 < size3; i15++) {
                        C126616Oq r8 = (C126616Oq) list2.get(i15);
                        if (r8.A00 == 1953653094) {
                            C126606Op A012 = r8.A01(1952868452);
                            A012.getClass();
                            C161467pi r3 = A012.A00;
                            int A042 = C161467pi.A04(r3, 8) & 16777215;
                            int A072 = r3.A07();
                            if (sparseArray2.size() == 1) {
                                obj = sparseArray2.valueAt(0);
                            } else {
                                obj = sparseArray2.get(A072);
                            }
                            C153107ag r7 = (C153107ag) obj;
                            if (r7 == null) {
                                continue;
                            } else {
                                if ((A042 & 1) != 0) {
                                    long A0J3 = r3.A0J();
                                    AnonymousClass7QL r24 = r7.A08;
                                    r24.A03 = A0J3;
                                    r24.A02 = A0J3;
                                }
                                AnonymousClass7M4 r15 = r7.A04;
                                if ((A042 & 2) != 0) {
                                    i = r3.A07() - 1;
                                } else {
                                    i = r15.A02;
                                }
                                if ((A042 & 8) != 0) {
                                    i2 = r3.A07();
                                } else {
                                    i2 = r15.A00;
                                }
                                if ((A042 & 16) != 0) {
                                    i3 = r3.A07();
                                } else {
                                    i3 = r15.A03;
                                }
                                if ((A042 & 32) != 0) {
                                    i4 = r3.A07();
                                } else {
                                    i4 = r15.A01;
                                }
                                AnonymousClass7QL r32 = r7.A08;
                                r32.A05 = new AnonymousClass7M4(i, i2, i3, i4);
                                long j4 = r32.A04;
                                boolean z2 = r32.A08;
                                r7.A02();
                                r7.A06 = true;
                                C126606Op A013 = r8.A01(1952867444);
                                if (A013 != null) {
                                    C161467pi r16 = A013.A00;
                                    if (C161467pi.A01(r16) == 1) {
                                        A0I2 = r16.A0J();
                                    } else {
                                        A0I2 = r16.A0I();
                                    }
                                    r32.A04 = A0I2;
                                    r32.A08 = true;
                                } else {
                                    r32.A04 = j4;
                                    r32.A08 = z2;
                                }
                                List list3 = r8.A02;
                                int size4 = list3.size();
                                int i16 = 0;
                                int i17 = 0;
                                for (int i18 = 0; i18 < size4; i18++) {
                                    C126606Op r11 = (C126606Op) list3.get(i18);
                                    if (r11.A00 == 1953658222 && (A032 = C161467pi.A03(r11.A00, 12)) > 0) {
                                        i17 += A032;
                                        i16++;
                                    }
                                }
                                r7.A02 = 0;
                                r7.A00 = 0;
                                r7.A01 = 0;
                                r32.A01 = i16;
                                r32.A00 = i17;
                                if (r32.A0C.length < i16) {
                                    r32.A0E = new long[i16];
                                    r32.A0C = new int[i16];
                                }
                                if (r32.A0B.length < i17) {
                                    int i19 = (i17 * 125) / 100;
                                    r32.A0B = new int[i19];
                                    r32.A0A = new int[i19];
                                    r32.A0D = new long[i19];
                                    r32.A0G = new boolean[i19];
                                    r32.A0F = new boolean[i19];
                                }
                                int i20 = 0;
                                int i21 = 0;
                                for (int i22 = 0; i22 < size4; i22++) {
                                    C126606Op r4 = (C126606Op) list3.get(i22);
                                    if (r4.A00 == 1953658222) {
                                        int i23 = i20 + 1;
                                        C161467pi r02 = r4.A00;
                                        C161467pi r46 = r02;
                                        int A043 = C161467pi.A04(r02, 8) & 16777215;
                                        AnonymousClass7UO r03 = r7.A05;
                                        AnonymousClass7UO r45 = r03;
                                        AnonymousClass7Q0 r42 = r03.A03;
                                        AnonymousClass7M4 r44 = r32.A05;
                                        int[] iArr = r32.A0C;
                                        int A0E2 = r46.A0E();
                                        iArr[i20] = A0E2;
                                        long[] jArr = r32.A0E;
                                        long j5 = r32.A03;
                                        jArr[i20] = j5;
                                        if ((A043 & 1) != 0) {
                                            jArr[i20] = j5 + ((long) r46.A07());
                                        }
                                        boolean A1S = AnonymousClass000.A1S(A043 & 4);
                                        int i24 = r44.A01;
                                        int i25 = i24;
                                        int i26 = i24;
                                        if (A1S) {
                                            i25 = r46.A07();
                                        }
                                        boolean A1S2 = AnonymousClass000.A1S(A043 & 256);
                                        boolean A1S3 = AnonymousClass000.A1S(A043 & 512);
                                        boolean A1S4 = AnonymousClass000.A1S(A043 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
                                        boolean A1S5 = AnonymousClass000.A1S(A043 & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
                                        long[] jArr2 = r42.A08;
                                        if (jArr2 != null && jArr2.length == 1 && jArr2[0] == 0) {
                                            j2 = C162387ry.A05(r42.A09[0], SearchActionVerificationClientService.MS_TO_NS, r42.A06);
                                        } else {
                                            j2 = 0;
                                        }
                                        int[] iArr2 = r32.A0B;
                                        int[] iArr3 = r32.A0A;
                                        long[] jArr3 = r32.A0D;
                                        boolean[] zArr = r32.A0G;
                                        int i27 = i21 + A0E2;
                                        long j6 = r42.A06;
                                        long j7 = r32.A04;
                                        while (true) {
                                            int i28 = i27;
                                            if (i21 >= i28) {
                                                r32.A04 = j7;
                                                i21 = i28;
                                                i20 = i23;
                                                break;
                                            }
                                            if (A1S2) {
                                                i6 = r46.A07();
                                            } else {
                                                i6 = r44.A00;
                                            }
                                            if (i6 >= 0) {
                                                if (A1S3) {
                                                    i7 = r46.A07();
                                                } else {
                                                    i7 = r44.A03;
                                                }
                                                if (i7 >= 0) {
                                                    if (A1S4) {
                                                        i8 = r46.A07();
                                                    } else if (i21 != 0 || !A1S) {
                                                        i8 = i26;
                                                    } else {
                                                        A1S = true;
                                                        i8 = i25;
                                                    }
                                                    if (A1S5) {
                                                        A1S5 = true;
                                                        iArr3[i21] = (int) (AnonymousClass6CA.A0G(r46.A07()) / j6);
                                                    } else {
                                                        A1S5 = false;
                                                        iArr3[i21] = 0;
                                                    }
                                                    long A052 = C162387ry.A05(j7, SearchActionVerificationClientService.MS_TO_NS, j6) - j2;
                                                    jArr3[i21] = A052;
                                                    if (!r32.A08) {
                                                        jArr3[i21] = A052 + r45.A02;
                                                    }
                                                    iArr2[i21] = i7;
                                                    zArr[i21] = AnonymousClass000.A1T((i8 >> 16) & 1);
                                                    j7 += (long) i6;
                                                    i21++;
                                                } else {
                                                    throw AnonymousClass6u7.A02("Unexpected negative value: ", AnonymousClass001.A0o(), i7);
                                                }
                                            } else {
                                                throw AnonymousClass6u7.A02("Unexpected negative value: ", AnonymousClass001.A0o(), i6);
                                            }
                                        }
                                    }
                                }
                                AnonymousClass7Q0 r43 = r7.A05.A03;
                                AnonymousClass7M4 r04 = r32.A05;
                                r04.getClass();
                                C149607Nc r6 = r43.A0A[r04.A02];
                                C126606Op A014 = r8.A01(1935763834);
                                if (A014 != null) {
                                    r6.getClass();
                                    C161467pi r122 = A014.A00;
                                    int i29 = r6.A00;
                                    boolean z3 = true;
                                    if ((C161467pi.A04(r122, 8) & 16777215 & 1) == 1) {
                                        r122.A0T(8);
                                    }
                                    int A0C2 = r122.A0C();
                                    int A0E3 = r122.A0E();
                                    int i30 = r32.A00;
                                    if (A0E3 <= i30) {
                                        if (A0C2 == 0) {
                                            boolean[] zArr2 = r32.A0F;
                                            i5 = 0;
                                            for (int i31 = 0; i31 < A0E3; i31++) {
                                                int A0C3 = r122.A0C();
                                                i5 += A0C3;
                                                zArr2[i31] = C86624Kv.A1W(A0C3, i29);
                                            }
                                        } else {
                                            if (A0C2 <= i29) {
                                                z3 = false;
                                            }
                                            i5 = A0C2 * A0E3;
                                            Arrays.fill(r32.A0F, 0, A0E3, z3);
                                        }
                                        Arrays.fill(r32.A0F, A0E3, r32.A00, false);
                                        if (i5 > 0) {
                                            r32.A0H.A0Q(i5);
                                            r32.A07 = true;
                                            r32.A09 = true;
                                        }
                                    } else {
                                        StringBuilder A0o = AnonymousClass001.A0o();
                                        A0o.append("Saiz sample count ");
                                        A0o.append(A0E3);
                                        throw AnonymousClass6u7.A02(" is greater than fragment sample count", A0o, i30);
                                    }
                                }
                                C126606Op A015 = r8.A01(1935763823);
                                if (A015 != null) {
                                    C161467pi r5 = A015.A00;
                                    int A044 = C161467pi.A04(r5, 8);
                                    if ((16777215 & A044 & 1) == 1) {
                                        r5.A0T(8);
                                    }
                                    int A0E4 = r5.A0E();
                                    if (A0E4 == 1) {
                                        int i32 = (A044 >> 24) & 255;
                                        long j8 = r32.A02;
                                        if (i32 == 0) {
                                            A0J2 = r5.A0I();
                                        } else {
                                            A0J2 = r5.A0J();
                                        }
                                        r32.A02 = j8 + A0J2;
                                    } else {
                                        throw AnonymousClass6u7.A02("Unexpected saio entry count: ", AnonymousClass001.A0o(), A0E4);
                                    }
                                }
                                C126606Op A016 = r8.A01(1936027235);
                                if (A016 != null) {
                                    A01(r32, A016.A00, 0);
                                }
                                if (r6 != null) {
                                    str2 = r6.A02;
                                } else {
                                    str2 = null;
                                }
                                byte[] bArr2 = null;
                                C161467pi r123 = null;
                                C161467pi r62 = null;
                                for (int i33 = 0; i33 < list3.size(); i33++) {
                                    C126606Op r05 = (C126606Op) list3.get(i33);
                                    C161467pi r10 = r05.A00;
                                    int i34 = r05.A00;
                                    if (i34 == 1935828848) {
                                        if (C161467pi.A04(r10, 12) == 1936025959) {
                                            r123 = r10;
                                        }
                                    } else if (i34 == 1936158820 && C161467pi.A04(r10, 12) == 1936025959) {
                                        r62 = r10;
                                    }
                                }
                                if (!(r123 == null || r62 == null)) {
                                    int A017 = C161467pi.A01(r123);
                                    r123.A0T(4);
                                    if (A017 == 1) {
                                        r123.A0T(4);
                                    }
                                    if (r123.A07() == 1) {
                                        int A018 = C161467pi.A01(r62);
                                        r62.A0T(4);
                                        if (A018 == 1) {
                                            if (r62.A0I() == 0) {
                                                throw AnonymousClass6u7.A01("Variable length description in sgpd found (unsupported)");
                                            }
                                        } else if (A018 >= 2) {
                                            r62.A0T(4);
                                        }
                                        if (r62.A0I() == 1) {
                                            int A022 = C161467pi.A02(r62, 1);
                                            int i35 = (A022 & 240) >> 4;
                                            int i36 = A022 & 15;
                                            if (r62.A0C() == 1) {
                                                int A0C4 = r62.A0C();
                                                byte[] bArr3 = new byte[16];
                                                r62.A0V(bArr3, 0, 16);
                                                if (A0C4 == 0) {
                                                    int A0C5 = r62.A0C();
                                                    bArr2 = new byte[A0C5];
                                                    r62.A0V(bArr2, 0, A0C5);
                                                }
                                                r32.A07 = true;
                                                r32.A06 = new C149607Nc(str2, bArr3, bArr2, A0C4, i35, i36, true);
                                            }
                                        } else {
                                            throw AnonymousClass6u7.A01("Entry count in sgpd != 1 (unsupported).");
                                        }
                                    } else {
                                        throw AnonymousClass6u7.A01("Entry count in sbgp != 1 (unsupported).");
                                    }
                                }
                                int size5 = list3.size();
                                for (int i37 = 0; i37 < size5; i37++) {
                                    C126606Op r25 = (C126606Op) list3.get(i37);
                                    if (r25.A00 == 1970628964) {
                                        C161467pi r47 = r25.A00;
                                        r47.A0S(8);
                                        byte[] bArr4 = bArr;
                                        r47.A0V(bArr4, 0, 16);
                                        if (Arrays.equals(bArr4, A0V)) {
                                            A01(r32, r47, 16);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    C166647z2 A004 = A00(r14.A02);
                    if (A004 != null) {
                        int size6 = sparseArray2.size();
                        for (int i38 = 0; i38 < size6; i38++) {
                            C153107ag r63 = (C153107ag) sparseArray2.valueAt(i38);
                            C149607Nc r06 = r63.A05.A03.A0A[r63.A08.A05.A02];
                            if (r06 != null) {
                                str = r06.A02;
                            } else {
                                str = null;
                            }
                            if (C162387ry.A0D(A004.A01, str)) {
                                r2 = A004;
                            } else {
                                r2 = new C166647z2(str, A004.A02, false);
                            }
                            C157057he r07 = new C157057he(r63.A05.A03.A07);
                            r07.A0I = r2;
                            r63.A07.B3T(C166527yp.A00(r07));
                        }
                    }
                    long j9 = this.A0A;
                    if (j9 != -9223372036854775807L) {
                        int size7 = sparseArray2.size();
                        for (int i39 = 0; i39 < size7; i39++) {
                            C153107ag r112 = (C153107ag) sparseArray2.valueAt(i39);
                            int i40 = r112.A01;
                            while (true) {
                                AnonymousClass7QL r124 = r112.A08;
                                if (i40 >= r124.A00 || r124.A0D[i40] + ((long) r124.A0A[i40]) >= j9) {
                                } else {
                                    if (r124.A0G[i40]) {
                                        r112.A03 = i40;
                                    }
                                    i40++;
                                }
                            }
                        }
                        this.A0A = -9223372036854775807L;
                    }
                } else if (!arrayDeque.isEmpty()) {
                    ((C126616Oq) arrayDeque.peek()).A01.add(r14);
                }
            }
        }
        this.A02 = 0;
        this.A00 = 0;
    }

    public void BFs(C187028wK r8) {
        this.A0C = r8;
        this.A02 = 0;
        this.A00 = 0;
        C185598tw[] r0 = new C185598tw[2];
        this.A0I = r0;
        int i = 0;
        int i2 = 100;
        C185598tw[] r3 = (C185598tw[]) Arrays.copyOf(r0, 0);
        this.A0I = r3;
        for (C185598tw B3T : r3) {
            B3T.B3T(A0U);
        }
        List list = this.A0S;
        C185598tw[] r02 = new C185598tw[list.size()];
        this.A0H = r02;
        while (i < r02.length) {
            C185598tw Br0 = this.A0C.Br0(i2, 3);
            Br0.B3T((C166527yp) list.get(i));
            r02 = this.A0H;
            r02[i] = Br0;
            i++;
            i2++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0427, code lost:
        if (r8 == 1701671783) goto L_0x0429;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x06da A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int BiD(X.C187648xa r32, X.AnonymousClass7BG r33) {
        /*
            r31 = this;
        L_0x0000:
            r0 = r31
            int r1 = r0.A02
            r9 = r32
            if (r1 == 0) goto L_0x02ad
            r12 = 1
            if (r1 == r12) goto L_0x00bf
            r10 = 2
            if (r1 == r10) goto L_0x0071
            X.7ag r5 = r0.A0D
            r7 = 0
            if (r5 != 0) goto L_0x04a7
            android.util.SparseArray r11 = r0.A0J
            int r8 = r11.size()
            r5 = 0
            r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = 0
        L_0x0020:
            if (r6 >= r8) goto L_0x005d
            java.lang.Object r4 = r11.valueAt(r6)
            X.7ag r4 = (X.C153107ag) r4
            boolean r1 = r4.A06
            if (r1 != 0) goto L_0x0034
            int r2 = r4.A01
            X.7UO r1 = r4.A05
            int r1 = r1.A01
            if (r2 == r1) goto L_0x0040
        L_0x0034:
            boolean r1 = r4.A06
            if (r1 == 0) goto L_0x0043
            int r2 = r4.A02
            X.7QL r1 = r4.A08
            int r1 = r1.A01
            if (r2 != r1) goto L_0x0043
        L_0x0040:
            int r6 = r6 + 1
            goto L_0x0020
        L_0x0043:
            boolean r1 = r4.A06
            if (r1 != 0) goto L_0x0056
            X.7UO r1 = r4.A05
            long[] r2 = r1.A06
            int r1 = r4.A01
        L_0x004d:
            r2 = r2[r1]
            int r1 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r1 >= 0) goto L_0x0040
            r5 = r4
            r13 = r2
            goto L_0x0040
        L_0x0056:
            X.7QL r1 = r4.A08
            long[] r2 = r1.A0E
            int r1 = r4.A02
            goto L_0x004d
        L_0x005d:
            if (r5 != 0) goto L_0x0486
            long r3 = r0.A09
            long r1 = r9.BBW()
            long r3 = r3 - r1
            int r1 = (int) r3
            if (r1 < 0) goto L_0x047f
            r9.BpP(r1)
            r0.A02 = r7
            r0.A00 = r7
            goto L_0x0000
        L_0x0071:
            android.util.SparseArray r10 = r0.A0J
            int r8 = r10.size()
            r2 = 0
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r7 = 0
        L_0x007e:
            if (r7 >= r8) goto L_0x009c
            java.lang.Object r1 = r10.valueAt(r7)
            X.7ag r1 = (X.C153107ag) r1
            X.7QL r5 = r1.A08
            boolean r1 = r5.A09
            if (r1 == 0) goto L_0x0099
            long r5 = r5.A02
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x0099
            java.lang.Object r2 = r10.valueAt(r7)
            X.7ag r2 = (X.C153107ag) r2
            r3 = r5
        L_0x0099:
            int r7 = r7 + 1
            goto L_0x007e
        L_0x009c:
            if (r2 != 0) goto L_0x00a1
            r1 = 3
            goto L_0x036e
        L_0x00a1:
            long r0 = r9.BBW()
            long r3 = r3 - r0
            int r0 = (int) r3
            if (r0 < 0) goto L_0x06b1
            r9.BpP(r0)
            X.7QL r4 = r2.A08
            X.7pi r3 = r4.A0H
            byte[] r2 = r3.A02
            int r1 = r3.A00
            r0 = 0
            r9.readFully(r2, r0, r1)
            r3.A0S(r0)
            r4.A09 = r0
            goto L_0x0000
        L_0x00bf:
            long r1 = r0.A07
            int r3 = (int) r1
            int r1 = r0.A00
            int r3 = r3 - r1
            X.7pi r4 = r0.A0E
            if (r4 == 0) goto L_0x02a8
            byte[] r2 = r4.A02
            r1 = 8
            r9.readFully(r2, r1, r3)
            int r1 = r0.A01
            X.6Op r3 = new X.6Op
            r3.<init>(r4, r1)
            long r19 = r9.BBW()
            java.util.ArrayDeque r2 = r0.A0Q
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x00f7
            java.lang.Object r1 = r2.peek()
            X.6Oq r1 = (X.C126616Oq) r1
            java.util.List r1 = r1.A02
            r1.add(r3)
        L_0x00ee:
            long r1 = r9.BBW()
            r0.A02(r1)
            goto L_0x0000
        L_0x00f7:
            int r2 = r3.A00
            r1 = 1936286840(0x73696478, float:1.8491255E31)
            if (r2 != r1) goto L_0x018d
            X.7pi r7 = r3.A00
            int r2 = X.C161467pi.A01(r7)
            r1 = 4
            r7.A0T(r1)
            long r25 = r7.A0I()
            if (r2 != 0) goto L_0x0162
            long r21 = r7.A0I()
            long r1 = r7.A0I()
        L_0x0116:
            long r19 = r19 + r1
            r23 = 1000000(0xf4240, double:4.940656E-318)
            long r17 = X.C162387ry.A05(r21, r23, r25)
            r1 = 2
            r7.A0T(r1)
            int r6 = r7.A0F()
            int[] r5 = new int[r6]
            long[] r4 = new long[r6]
            long[] r3 = new long[r6]
            long[] r2 = new long[r6]
            r15 = r17
            r1 = 0
        L_0x0132:
            if (r1 >= r6) goto L_0x016b
            int r13 = r7.A07()
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r8 & r13
            if (r8 != 0) goto L_0x06b8
            long r10 = r7.A0I()
            r8 = 2147483647(0x7fffffff, float:NaN)
            r13 = r13 & r8
            r5[r1] = r13
            r4[r1] = r19
            r2[r1] = r15
            long r21 = r21 + r10
            long r13 = X.C162387ry.A05(r21, r23, r25)
            long r10 = r13 - r15
            r3[r1] = r10
            r8 = 4
            r7.A0T(r8)
            r8 = r5[r1]
            long r10 = (long) r8
            long r19 = r19 + r10
            int r1 = r1 + 1
            r15 = r13
            goto L_0x0132
        L_0x0162:
            long r21 = r7.A0J()
            long r1 = r7.A0J()
            goto L_0x0116
        L_0x016b:
            java.lang.Long r6 = java.lang.Long.valueOf(r17)
            X.86p r1 = new X.86p
            r1.<init>(r5, r4, r3, r2)
            android.util.Pair r3 = android.util.Pair.create(r6, r1)
            java.lang.Object r1 = r3.first
            long r1 = X.C18310x6.A0B(r1)
            r0.A0B = r1
            X.8wK r2 = r0.A0C
            java.lang.Object r1 = r3.second
            X.8sg r1 = (X.C184868sg) r1
            r2.Bl0(r1)
            r0.A0F = r12
            goto L_0x00ee
        L_0x018d:
            r1 = 1701671783(0x656d7367, float:7.0083103E22)
            if (r2 != r1) goto L_0x00ee
            X.7pi r6 = r3.A00
            X.8tw[] r1 = r0.A0I
            int r1 = r1.length
            if (r1 == 0) goto L_0x00ee
            int r3 = X.C161467pi.A01(r6)
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 == 0) goto L_0x01b7
            if (r3 == r12) goto L_0x01f2
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "Skipping unsupported emsg version: "
            java.lang.String r2 = X.AnonymousClass000.A0Y(r1, r2, r3)
            java.lang.String r1 = "FragmentedMp4Extractor"
            android.util.Log.w(r1, r2)
            goto L_0x00ee
        L_0x01b7:
            java.lang.String r17 = r6.A0L()
            r17.getClass()
            java.lang.String r18 = r6.A0L()
            r18.getClass()
            long r23 = r6.A0I()
            long r19 = r6.A0I()
            r21 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = X.C162387ry.A05(r19, r21, r23)
            long r1 = r0.A0B
            int r3 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r3 == 0) goto L_0x01ec
            long r1 = r1 + r7
        L_0x01db:
            long r25 = r6.A0I()
            r27 = 1000(0x3e8, double:4.94E-321)
            r29 = r23
            long r20 = X.C162387ry.A05(r25, r27, r29)
            long r22 = r6.A0I()
            goto L_0x0222
        L_0x01ec:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x01db
        L_0x01f2:
            long r20 = r6.A0I()
            long r16 = r6.A0J()
            r18 = 1000000(0xf4240, double:4.940656E-318)
            long r1 = X.C162387ry.A05(r16, r18, r20)
            long r16 = r6.A0I()
            r18 = 1000(0x3e8, double:4.94E-321)
            long r20 = X.C162387ry.A05(r16, r18, r20)
            long r22 = r6.A0I()
            java.lang.String r17 = r6.A0L()
            r17.getClass()
            java.lang.String r18 = r6.A0L()
            r18.getClass()
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0222:
            int r4 = X.C161467pi.A00(r6)
            byte[] r3 = new byte[r4]
            r5 = 0
            r6.A0V(r3, r5, r4)
            X.87f r6 = new X.87f
            r16 = r6
            r19 = r3
            r16.<init>(r17, r18, r19, r20, r22)
            X.7i3 r3 = r0.A0K
            java.io.ByteArrayOutputStream r11 = r3.A00
            r11.reset()
            java.io.DataOutputStream r10 = r3.A01     // Catch:{ IOException -> 0x06bf }
            java.lang.String r3 = r6.A03     // Catch:{ IOException -> 0x06bf }
            r10.writeBytes(r3)     // Catch:{ IOException -> 0x06bf }
            r10.writeByte(r5)     // Catch:{ IOException -> 0x06bf }
            java.lang.String r3 = r6.A04     // Catch:{ IOException -> 0x06bf }
            if (r3 != 0) goto L_0x024c
            java.lang.String r3 = ""
        L_0x024c:
            r10.writeBytes(r3)     // Catch:{ IOException -> 0x06bf }
            r10.writeByte(r5)     // Catch:{ IOException -> 0x06bf }
            long r3 = r6.A01     // Catch:{ IOException -> 0x06bf }
            X.AnonymousClass6C9.A0w(r10, r3)     // Catch:{ IOException -> 0x06bf }
            long r3 = r6.A02     // Catch:{ IOException -> 0x06bf }
            X.AnonymousClass6C9.A0w(r10, r3)     // Catch:{ IOException -> 0x06bf }
            byte[] r3 = r6.A05     // Catch:{ IOException -> 0x06bf }
            r10.write(r3)     // Catch:{ IOException -> 0x06bf }
            r10.flush()     // Catch:{ IOException -> 0x06bf }
            byte[] r3 = r11.toByteArray()     // Catch:{ IOException -> 0x06bf }
            X.7pi r13 = new X.7pi
            r13.<init>((byte[]) r3)
            int r6 = X.C161467pi.A00(r13)
            X.8tw[] r11 = r0.A0I
            int r10 = r11.length
            r4 = 0
        L_0x0275:
            if (r4 >= r10) goto L_0x0282
            r3 = r11[r4]
            r13.A0S(r5)
            r3.Bkc(r13, r6)
            int r4 = r4 + 1
            goto L_0x0275
        L_0x0282:
            int r3 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r3 != 0) goto L_0x0297
            java.util.ArrayDeque r2 = r0.A0R
            X.7Fz r1 = new X.7Fz
            r1.<init>(r7, r6)
            r2.addLast(r1)
            int r1 = r0.A03
            int r1 = r1 + r6
            r0.A03 = r1
            goto L_0x00ee
        L_0x0297:
            X.8tw[] r4 = r0.A0I
            int r3 = r4.length
        L_0x029a:
            if (r5 >= r3) goto L_0x00ee
            r10 = r4[r5]
            r14 = 0
            r11 = 0
            r13 = r6
            r15 = r1
            r10.Bkh(r11, r12, r13, r14, r15)
            int r5 = r5 + 1
            goto L_0x029a
        L_0x02a8:
            r9.BpP(r3)
            goto L_0x00ee
        L_0x02ad:
            int r1 = r0.A00
            r7 = 8
            r6 = 0
            r5 = 1
            if (r1 != 0) goto L_0x02d2
            X.7pi r3 = r0.A0L
            byte[] r1 = r3.A02
            boolean r1 = r9.BiM(r1, r6, r7, r5)
            if (r1 != 0) goto L_0x02c1
            r0 = -1
            return r0
        L_0x02c1:
            r0.A00 = r7
            r3.A0S(r6)
            long r1 = r3.A0I()
            r0.A07 = r1
            int r1 = r3.A07()
            r0.A01 = r1
        L_0x02d2:
            long r1 = r0.A07
            r10 = 1
            int r3 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x0335
            X.7pi r2 = r0.A0L
            byte[] r1 = r2.A02
            r9.readFully(r1, r7, r7)
            int r1 = r0.A00
            int r1 = r1 + 8
            r0.A00 = r1
            long r3 = r2.A0J()
        L_0x02eb:
            r0.A07 = r3
        L_0x02ed:
            long r3 = r0.A07
            int r1 = r0.A00
            long r1 = (long) r1
            int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r8 < 0) goto L_0x06da
            long r3 = r9.BBW()
            long r3 = r3 - r1
            int r1 = r0.A01
            r12 = 1835295092(0x6d646174, float:4.4175247E27)
            r11 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r1 == r11) goto L_0x0307
            if (r1 != r12) goto L_0x0319
        L_0x0307:
            boolean r1 = r0.A0F
            if (r1 != 0) goto L_0x0319
            X.8wK r10 = r0.A0C
            long r1 = r0.A08
            X.86k r8 = new X.86k
            r8.<init>(r1, r3)
            r10.Bl0(r8)
            r0.A0F = r5
        L_0x0319:
            int r8 = r0.A01
            if (r8 != r11) goto L_0x0363
            android.util.SparseArray r6 = r0.A0J
            int r5 = r6.size()
            r2 = 0
        L_0x0324:
            if (r2 >= r5) goto L_0x0456
            java.lang.Object r1 = r6.valueAt(r2)
            X.7ag r1 = (X.C153107ag) r1
            X.7QL r1 = r1.A08
            r1.A02 = r3
            r1.A03 = r3
            int r2 = r2 + 1
            goto L_0x0324
        L_0x0335:
            r10 = 0
            int r3 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x02ed
            long r3 = r9.getLength()
            r10 = -1
            int r1 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r1 != 0) goto L_0x0355
            java.util.ArrayDeque r2 = r0.A0Q
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x0355
            java.lang.Object r1 = r2.peek()
            X.6Oq r1 = (X.C126616Oq) r1
            long r3 = r1.A00
        L_0x0355:
            int r1 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r1 == 0) goto L_0x02ed
            long r1 = r9.BBW()
            long r3 = r3 - r1
            int r1 = r0.A00
            long r1 = (long) r1
            long r3 = r3 + r1
            goto L_0x02eb
        L_0x0363:
            r10 = 0
            if (r8 != r12) goto L_0x0372
            r0.A0D = r10
            long r1 = r0.A07
            long r3 = r3 + r1
            r0.A09 = r3
            r1 = 2
        L_0x036e:
            r0.A02 = r1
            goto L_0x0000
        L_0x0372:
            r1 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r8 == r1) goto L_0x0456
            r1 = 1953653099(0x7472616b, float:7.681346E31)
            if (r8 == r1) goto L_0x0456
            r1 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r8 == r1) goto L_0x0456
            r1 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r8 == r1) goto L_0x0456
            r1 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r8 == r1) goto L_0x0456
            if (r8 == r11) goto L_0x0456
            r1 = 1953653094(0x74726166, float:7.6813435E31)
            if (r8 == r1) goto L_0x0456
            r1 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r8 == r1) goto L_0x0456
            r1 = 1701082227(0x65647473, float:6.742798E22)
            if (r8 == r1) goto L_0x0456
            r1 = 1751411826(0x68646c72, float:4.3148E24)
            if (r8 == r1) goto L_0x0429
            r1 = 1835296868(0x6d646864, float:4.418049E27)
            if (r8 == r1) goto L_0x0429
            r1 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r8 == r1) goto L_0x0429
            r1 = 1936286840(0x73696478, float:1.8491255E31)
            if (r8 == r1) goto L_0x0429
            r1 = 1937011556(0x73747364, float:1.9367383E31)
            if (r8 == r1) goto L_0x0429
            r1 = 1937011827(0x73747473, float:1.9367711E31)
            if (r8 == r1) goto L_0x0429
            r1 = 1668576371(0x63747473, float:4.5093966E21)
            if (r8 == r1) goto L_0x0429
            r1 = 1937011555(0x73747363, float:1.9367382E31)
            if (r8 == r1) goto L_0x0429
            r1 = 1937011578(0x7374737a, float:1.936741E31)
            if (r8 == r1) goto L_0x0429
            r1 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r8 == r1) goto L_0x0429
            r1 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r8 == r1) goto L_0x0429
            r1 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r8 == r1) goto L_0x0429
            r1 = 1937011571(0x73747373, float:1.9367401E31)
            if (r8 == r1) goto L_0x0429
            r1 = 1952867444(0x74666474, float:7.3014264E31)
            if (r8 == r1) goto L_0x0429
            r1 = 1952868452(0x74666864, float:7.301914E31)
            if (r8 == r1) goto L_0x0429
            r1 = 1953196132(0x746b6864, float:7.46037E31)
            if (r8 == r1) goto L_0x0429
            r1 = 1953654136(0x74726578, float:7.6818474E31)
            if (r8 == r1) goto L_0x0429
            r1 = 1953658222(0x7472756e, float:7.683823E31)
            if (r8 == r1) goto L_0x0429
            r1 = 1886614376(0x70737368, float:3.013775E29)
            if (r8 == r1) goto L_0x0429
            r1 = 1935763834(0x7361697a, float:1.785898E31)
            if (r8 == r1) goto L_0x0429
            r1 = 1935763823(0x7361696f, float:1.7858967E31)
            if (r8 == r1) goto L_0x0429
            r1 = 1936027235(0x73656e63, float:1.8177412E31)
            if (r8 == r1) goto L_0x0429
            r1 = 1970628964(0x75756964, float:3.1109627E32)
            if (r8 == r1) goto L_0x0429
            r1 = 1935828848(0x73626770, float:1.7937577E31)
            if (r8 == r1) goto L_0x0429
            r1 = 1936158820(0x73677064, float:1.8336489E31)
            if (r8 == r1) goto L_0x0429
            r1 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r8 == r1) goto L_0x0429
            r1 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r8 == r1) goto L_0x0429
            r2 = 1701671783(0x656d7367, float:7.0083103E22)
            r1 = 0
            if (r8 != r2) goto L_0x042a
        L_0x0429:
            r1 = 1
        L_0x042a:
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r1 == 0) goto L_0x044d
            int r1 = r0.A00
            if (r1 != r7) goto L_0x06cc
            long r2 = r0.A07
            int r1 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r1 > 0) goto L_0x06c5
            int r1 = (int) r2
            X.7pi r3 = X.C161467pi.A05(r1)
            X.7pi r1 = r0.A0L
            byte[] r2 = r1.A02
            byte[] r1 = r3.A02
            java.lang.System.arraycopy(r2, r6, r1, r6, r7)
            r0.A0E = r3
        L_0x0449:
            r0.A02 = r5
            goto L_0x0000
        L_0x044d:
            long r2 = r0.A07
            int r1 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r1 > 0) goto L_0x06d3
            r0.A0E = r10
            goto L_0x0449
        L_0x0456:
            long r4 = r9.BBW()
            long r1 = r0.A07
            long r4 = r4 + r1
            r1 = 8
            long r4 = r4 - r1
            java.util.ArrayDeque r2 = r0.A0Q
            X.6Oq r1 = new X.6Oq
            r1.<init>(r8, r4)
            r2.push(r1)
            long r6 = r0.A07
            int r1 = r0.A00
            long r2 = (long) r1
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x0478
            r0.A02(r4)
            goto L_0x0000
        L_0x0478:
            r1 = 0
            r0.A02 = r1
            r0.A00 = r1
            goto L_0x0000
        L_0x047f:
            java.lang.String r0 = "Offset to end of mdat was negative."
            X.6u7 r0 = X.AnonymousClass6u7.A01(r0)
            throw r0
        L_0x0486:
            boolean r1 = r5.A06
            if (r1 != 0) goto L_0x06a2
            X.7UO r1 = r5.A05
            long[] r2 = r1.A06
            int r1 = r5.A01
        L_0x0490:
            r1 = r2[r1]
            long r3 = r9.BBW()
            long r1 = r1 - r3
            int r3 = (int) r1
            if (r3 >= 0) goto L_0x04a2
            java.lang.String r2 = "FragmentedMp4Extractor"
            java.lang.String r1 = "Ignoring negative offset to sample data."
            android.util.Log.w(r2, r1)
            r3 = 0
        L_0x04a2:
            r9.BpP(r3)
            r0.A0D = r5
        L_0x04a7:
            int r1 = r0.A02
            r3 = 0
            r2 = 3
            r11 = 4
            r6 = 1
            if (r1 != r2) goto L_0x054c
            boolean r1 = r5.A06
            if (r1 != 0) goto L_0x04f6
            X.7UO r1 = r5.A05
            int[] r1 = r1.A05
        L_0x04b7:
            int r8 = r5.A01
            r4 = r1[r8]
            r0.A06 = r4
            int r1 = r5.A03
            if (r8 >= r1) goto L_0x04fb
            r9.BpP(r4)
            X.7Nc r1 = r5.A01()
            if (r1 == 0) goto L_0x04ea
            X.7QL r7 = r5.A08
            X.7pi r6 = r7.A0H
            int r1 = r1.A00
            if (r1 == 0) goto L_0x04d5
            r6.A0T(r1)
        L_0x04d5:
            int r4 = r5.A01
            boolean r1 = r7.A07
            if (r1 == 0) goto L_0x04ea
            boolean[] r1 = r7.A0F
            boolean r1 = r1[r4]
            if (r1 == 0) goto L_0x04ea
            int r1 = r6.A0F()
            int r1 = r1 * 6
            r6.A0T(r1)
        L_0x04ea:
            boolean r1 = r5.A03()
            if (r1 != 0) goto L_0x04f2
            r0.A0D = r3
        L_0x04f2:
            r0.A02 = r2
        L_0x04f4:
            r0 = 0
            return r0
        L_0x04f6:
            X.7QL r1 = r5.A08
            int[] r1 = r1.A0B
            goto L_0x04b7
        L_0x04fb:
            X.7UO r1 = r5.A05
            X.7Q0 r1 = r1.A03
            int r1 = r1.A02
            if (r1 != r12) goto L_0x050b
            r1 = 8
            int r4 = r4 - r1
            r0.A06 = r4
            r9.BpP(r1)
        L_0x050b:
            X.7UO r1 = r5.A05
            X.7Q0 r1 = r1.A03
            X.7yp r1 = r1.A07
            java.lang.String r2 = r1.A0T
            java.lang.String r1 = "audio/ac4"
            boolean r2 = r1.equals(r2)
            int r1 = r0.A06
            if (r2 == 0) goto L_0x061f
            r8 = 7
            int r1 = r5.A00(r1, r8)
            r0.A04 = r1
            int r4 = r0.A06
            X.7pi r3 = r0.A0P
            r3.A0Q(r8)
            byte[] r2 = r3.A02
            r1 = -84
            r2[r7] = r1
            r1 = 64
            r2[r12] = r1
            X.AnonymousClass6C9.A1F(r2, r4)
            X.8tw r1 = r5.A07
            r1.Bkc(r3, r8)
            int r1 = r0.A04
            int r2 = r1 + 7
        L_0x0541:
            r0.A04 = r2
            int r1 = r0.A06
            int r1 = r1 + r2
            r0.A06 = r1
            r0.A02 = r11
            r0.A05 = r7
        L_0x054c:
            X.7UO r2 = r5.A05
            X.7Q0 r12 = r2.A03
            X.8tw r8 = r5.A07
            boolean r1 = r5.A06
            if (r1 != 0) goto L_0x060f
            long[] r2 = r2.A07
            int r1 = r5.A01
            r1 = r2[r1]
        L_0x055c:
            int r3 = r12.A01
            if (r3 == 0) goto L_0x0625
            X.7pi r13 = r0.A0N
            byte[] r4 = r13.A02
            r4[r7] = r7
            r4[r6] = r7
            r4[r10] = r7
            int r17 = r3 + 1
            int r14 = 4 - r3
        L_0x056e:
            int r3 = r0.A04
            int r10 = r0.A06
            if (r3 >= r10) goto L_0x0636
            int r15 = r0.A05
            if (r15 != 0) goto L_0x05ca
            r3 = r17
            r9.readFully(r4, r14, r3)
            int r3 = X.C161467pi.A04(r13, r7)
            if (r3 < r6) goto L_0x06aa
            int r3 = r3 + -1
            r0.A05 = r3
            X.7pi r3 = r0.A0O
            r3.A0S(r7)
            r8.Bkc(r3, r11)
            r8.Bkc(r13, r6)
            X.8tw[] r3 = r0.A0H
            int r3 = r3.length
            if (r3 <= 0) goto L_0x05c8
            X.7yp r3 = r12.A07
            java.lang.String r10 = r3.A0T
            byte r16 = r4[r11]
            java.lang.String r3 = "video/avc"
            boolean r3 = r3.equals(r10)
            if (r3 == 0) goto L_0x05aa
            r15 = r16 & 31
            r3 = 6
            if (r15 == r3) goto L_0x05b9
        L_0x05aa:
            java.lang.String r3 = "video/hevc"
            boolean r3 = r3.equals(r10)
            if (r3 == 0) goto L_0x05c8
            r10 = r16 & 126(0x7e, float:1.77E-43)
            int r10 = r10 >> r6
            r3 = 39
            if (r10 != r3) goto L_0x05c8
        L_0x05b9:
            r3 = 1
        L_0x05ba:
            r0.A0G = r3
            int r3 = r0.A04
            int r3 = r3 + 5
            r0.A04 = r3
            int r3 = r0.A06
            int r3 = r3 + r14
            r0.A06 = r3
            goto L_0x056e
        L_0x05c8:
            r3 = 0
            goto L_0x05ba
        L_0x05ca:
            boolean r3 = r0.A0G
            if (r3 == 0) goto L_0x060a
            X.7pi r10 = r0.A0M
            r10.A0Q(r15)
            byte[] r3 = r10.A02
            r9.readFully(r3, r7, r15)
            int r3 = r0.A05
            r8.Bkc(r10, r3)
            int r6 = r0.A05
            byte[] r11 = r10.A02
            int r3 = r10.A00
            int r11 = X.C161627q8.A00(r11, r3)
            X.7yp r3 = r12.A07
            java.lang.String r15 = r3.A0T
            java.lang.String r3 = "video/hevc"
            boolean r3 = r3.equals(r15)
            r10.A0S(r3)
            r10.A0R(r11)
            X.8tw[] r3 = r0.A0H
            X.C153987cO.A00(r10, r3, r1)
        L_0x05fc:
            int r3 = r0.A04
            int r3 = r3 + r6
            r0.A04 = r3
            int r3 = r0.A05
            int r3 = r3 - r6
            r0.A05 = r3
            r11 = 4
            r6 = 1
            goto L_0x056e
        L_0x060a:
            int r6 = r8.Bkf(r9, r15, r7, r7)
            goto L_0x05fc
        L_0x060f:
            X.7QL r3 = r5.A08
            int r4 = r5.A01
            long[] r1 = r3.A0D
            r1 = r1[r4]
            int[] r3 = r3.A0A
            r3 = r3[r4]
            long r3 = (long) r3
            long r1 = r1 + r3
            goto L_0x055c
        L_0x061f:
            int r2 = r5.A00(r1, r7)
            goto L_0x0541
        L_0x0625:
            int r3 = r0.A04
            int r10 = r0.A06
            if (r3 >= r10) goto L_0x0636
            int r10 = r10 - r3
            int r4 = r8.Bkf(r9, r10, r7, r7)
            int r3 = r0.A04
            int r3 = r3 + r4
            r0.A04 = r3
            goto L_0x0625
        L_0x0636:
            boolean r3 = r5.A06
            if (r3 != 0) goto L_0x0688
            X.7UO r3 = r5.A05
            int[] r4 = r3.A04
            int r3 = r5.A01
            r7 = r4[r3]
        L_0x0642:
            X.7Nc r4 = r5.A01()
            if (r4 == 0) goto L_0x0686
            r3 = 1073741824(0x40000000, float:2.0)
            r7 = r7 | r3
            X.7WZ r3 = r4.A01
        L_0x064d:
            r15 = 0
            r16 = r1
            r11 = r8
            r12 = r3
            r13 = r7
            r14 = r10
            r11.Bkh(r12, r13, r14, r15, r16)
        L_0x0657:
            java.util.ArrayDeque r4 = r0.A0R
            boolean r3 = r4.isEmpty()
            if (r3 != 0) goto L_0x0694
            java.lang.Object r4 = r4.removeFirst()
            X.7Fz r4 = (X.C147857Fz) r4
            int r3 = r0.A03
            int r11 = r4.A00
            int r3 = r3 - r11
            r0.A03 = r3
            long r3 = r4.A01
            long r3 = r3 + r1
            X.8tw[] r10 = r0.A0I
            int r9 = r10.length
            r8 = 0
        L_0x0673:
            if (r8 >= r9) goto L_0x0657
            r12 = r10[r8]
            int r7 = r0.A03
            r13 = 0
            r14 = r6
            r15 = r11
            r16 = r7
            r17 = r3
            r12.Bkh(r13, r14, r15, r16, r17)
            int r8 = r8 + 1
            goto L_0x0673
        L_0x0686:
            r3 = 0
            goto L_0x064d
        L_0x0688:
            X.7QL r3 = r5.A08
            boolean[] r4 = r3.A0G
            int r3 = r5.A01
            boolean r3 = r4[r3]
            if (r3 == 0) goto L_0x0642
            r7 = 1
            goto L_0x0642
        L_0x0694:
            boolean r1 = r5.A03()
            if (r1 != 0) goto L_0x069d
            r1 = 0
            r0.A0D = r1
        L_0x069d:
            r1 = 3
            r0.A02 = r1
            goto L_0x04f4
        L_0x06a2:
            X.7QL r1 = r5.A08
            long[] r2 = r1.A0E
            int r1 = r5.A02
            goto L_0x0490
        L_0x06aa:
            java.lang.String r0 = "Invalid NAL length"
            X.6u7 r0 = X.AnonymousClass6u7.A01(r0)
            throw r0
        L_0x06b1:
            java.lang.String r0 = "Offset to encryption data was negative."
            X.6u7 r0 = X.AnonymousClass6u7.A01(r0)
            throw r0
        L_0x06b8:
            java.lang.String r0 = "Unhandled indirect reference"
            X.6u7 r0 = X.AnonymousClass6u7.A01(r0)
            throw r0
        L_0x06bf:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C18330xA.A09(r0)
            throw r0
        L_0x06c5:
            java.lang.String r0 = "Leaf atom with length > 2147483647 (unsupported)."
            X.6u7 r0 = X.AnonymousClass6u7.A01(r0)
            throw r0
        L_0x06cc:
            java.lang.String r0 = "Leaf atom defines extended atom size (unsupported)."
            X.6u7 r0 = X.AnonymousClass6u7.A01(r0)
            throw r0
        L_0x06d3:
            java.lang.String r0 = "Skipping atom with length > 2147483647 (unsupported)."
            X.6u7 r0 = X.AnonymousClass6u7.A01(r0)
            throw r0
        L_0x06da:
            java.lang.String r0 = "Atom size less than header length (unsupported)."
            X.6u7 r0 = X.AnonymousClass6u7.A01(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1686086b.BiD(X.8xa, X.7BG):int");
    }

    public void Bkz(long j, long j2) {
        SparseArray sparseArray = this.A0J;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((C153107ag) sparseArray.valueAt(i)).A02();
        }
        this.A0R.clear();
        this.A03 = 0;
        this.A0A = j2;
        this.A0Q.clear();
        this.A02 = 0;
        this.A00 = 0;
    }

    public C1686086b(C153267ax r5, int i) {
        this.A0S = Collections.unmodifiableList(Collections.emptyList());
        this.A0K = new C157287i3();
        this.A0L = C161467pi.A05(16);
        this.A0O = new C161467pi(C161627q8.A02);
        this.A0N = C161467pi.A05(5);
        this.A0M = new C161467pi();
        byte[] bArr = new byte[16];
        this.A0T = bArr;
        this.A0P = new C161467pi(bArr);
        this.A0Q = AnonymousClass6CA.A0a();
        this.A0R = AnonymousClass6CA.A0a();
        this.A0J = AnonymousClass6CA.A0I();
        this.A08 = -9223372036854775807L;
        this.A0A = -9223372036854775807L;
        this.A0B = -9223372036854775807L;
        this.A0C = C187028wK.A00;
        this.A0I = new C185598tw[0];
        this.A0H = new C185598tw[0];
    }

    public static C166647z2 A00(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            C126606Op r2 = (C126606Op) list.get(i);
            if (r2.A00 == 1886614376) {
                if (arrayList == null) {
                    arrayList = AnonymousClass001.A0s();
                }
                byte[] bArr = r2.A00.A02;
                C161467pi r11 = new C161467pi(bArr);
                if (r11.A00 >= 32 && C161467pi.A04(r11, 0) == C161467pi.A00(r11) + 4 && r11.A07() == 1886614376) {
                    int A072 = (r11.A07() >> 24) & 255;
                    if (A072 > 1) {
                        Log.w("PsshAtomUtil", AnonymousClass000.A0Y("Unsupported pssh version: ", AnonymousClass001.A0o(), A072));
                    } else {
                        UUID uuid = new UUID(r11.A0H(), r11.A0H());
                        if (A072 == 1) {
                            r11.A0T(r11.A0E() * 16);
                        }
                        int A0E2 = r11.A0E();
                        if (A0E2 == C161467pi.A00(r11)) {
                            byte[] bArr2 = new byte[A0E2];
                            r11.A0V(bArr2, 0, A0E2);
                            arrayList.add(new C166397yc("video/mp4", new AnonymousClass7G0(uuid, bArr2).A00, bArr));
                        }
                    }
                }
                Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
            }
        }
        if (arrayList != null) {
            return new C166647z2((String) null, (C166397yc[]) arrayList.toArray(new C166397yc[0]), false);
        }
        return null;
    }

    public C1686086b() {
        this((C153267ax) null, 0);
    }
}
