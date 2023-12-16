package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.7VC  reason: invalid class name */
public abstract class AnonymousClass7VC {
    public final C185598tw A00;

    public boolean A03(C161467pi r19, long j) {
        int i;
        int A002;
        C185598tw r4;
        long j2 = j;
        C161467pi r2 = r19;
        if (this instanceof C126576Om) {
            C126576Om r6 = (C126576Om) this;
            int A0C = r2.A0C();
            byte[] bArr = r2.A02;
            int i2 = r2.A01;
            int i3 = i2 + 1;
            int i4 = i3 + 1;
            int A0G = AnonymousClass6C8.A0G(bArr, i3, ((bArr[i2] & 255) << 24) >> 8);
            int i5 = i4 + 1;
            r2.A01 = i5;
            long A0A = j + C18290x4.A0A(AnonymousClass6CA.A0B(bArr, i4, A0G));
            if (A0C == 0) {
                if (r6.A02) {
                    return false;
                }
                C161467pi r3 = new C161467pi(new byte[(r2.A00 - i5)]);
                r2.A0V(r3.A02, 0, r2.A00 - i5);
                C156827hH A003 = C156827hH.A00(r3);
                r6.A01 = A003.A02;
                C157057he A004 = C157057he.A00();
                A004.A0R = "video/avc";
                A004.A0M = A003.A04;
                A004.A0G = A003.A03;
                A004.A07 = A003.A01;
                A004.A01 = A003.A00;
                A004.A0S = A003.A05;
                r6.A00.B3T(C166527yp.A00(A004));
                r6.A02 = true;
                return false;
            } else if (A0C != 1 || !r6.A02) {
                return false;
            } else {
                boolean A1U = AnonymousClass000.A1U(r6.A00, 1);
                if (!r6.A03 && !A1U) {
                    return false;
                }
                C161467pi r8 = r6.A04;
                byte[] bArr2 = r8.A02;
                bArr2[0] = 0;
                bArr2[1] = 0;
                bArr2[2] = 0;
                int i6 = 4 - r6.A01;
                int i7 = 0;
                while (C161467pi.A00(r2) > 0) {
                    r2.A0V(r8.A02, i6, r6.A01);
                    int A03 = C161467pi.A03(r8, 0);
                    C161467pi r1 = r6.A05;
                    r1.A0S(0);
                    C185598tw r0 = r6.A00;
                    r0.Bkc(r1, 4);
                    r0.Bkc(r2, A03);
                    i7 = i7 + 4 + A03;
                }
                r6.A00.Bkh((AnonymousClass7WZ) null, A1U ? 1 : 0, i7, 0, A0A);
                r6.A03 = true;
                return true;
            }
        } else if (this instanceof C126596Oo) {
            C126596Oo r7 = (C126596Oo) this;
            if (r2.A0C() == 2 && "onMetaData".equals(C126596Oo.A01(r2)) && r2.A0C() == 8) {
                HashMap A02 = C126596Oo.A02(r2);
                Object obj = A02.get("duration");
                if (obj instanceof Double) {
                    double A022 = AnonymousClass6C9.A02(obj);
                    if (A022 > 0.0d) {
                        r7.A00 = (long) (A022 * 1000000.0d);
                    }
                }
                Object obj2 = A02.get("keyframes");
                if (obj2 instanceof Map) {
                    Map map = (Map) obj2;
                    Object obj3 = map.get("filepositions");
                    Object obj4 = map.get("times");
                    if ((obj3 instanceof List) && (obj4 instanceof List)) {
                        List list = (List) obj3;
                        List list2 = (List) obj4;
                        int size = list2.size();
                        r7.A02 = new long[size];
                        r7.A01 = new long[size];
                        int i8 = 0;
                        while (true) {
                            if (i8 >= size) {
                                break;
                            }
                            Object obj5 = list.get(i8);
                            Object obj6 = list2.get(i8);
                            if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                r7.A02 = new long[0];
                                r7.A01 = new long[0];
                            } else {
                                r7.A02[i8] = (long) (AnonymousClass6C9.A02(obj6) * 1000000.0d);
                                r7.A01[i8] = C18310x6.A0B(obj5);
                                i8++;
                            }
                        }
                        r7.A02 = new long[0];
                        r7.A01 = new long[0];
                    }
                }
            }
            return false;
        } else {
            C126586On r32 = (C126586On) this;
            int i9 = r32.A00;
            if (i9 == 2) {
                A002 = C161467pi.A00(r2);
                r4 = r32.A00;
                r4.Bkc(r2, A002);
                i = 0;
            } else {
                int A0C2 = r2.A0C();
                i = 0;
                if (A0C2 == 0 && !r32.A01) {
                    int A005 = C161467pi.A00(r2);
                    byte[] bArr3 = new byte[A005];
                    r2.A0V(bArr3, 0, A005);
                    AnonymousClass7JX A006 = C159817mV.A00(new C160807oL(bArr3, A005), false);
                    C157057he A007 = C157057he.A00();
                    A007.A0R = "audio/mp4a-latm";
                    A007.A0M = A006.A02;
                    A007.A04 = A006.A00;
                    A007.A0D = A006.A01;
                    A007.A0S = Collections.singletonList(bArr3);
                    r32.A00.B3T(C166527yp.A00(A007));
                    r32.A01 = true;
                    return false;
                } else if (i9 == 10 && A0C2 != 1) {
                    return false;
                } else {
                    A002 = C161467pi.A00(r2);
                    r4 = r32.A00;
                    r4.Bkc(r2, A002);
                }
            }
            r4.Bkh((AnonymousClass7WZ) null, 1, A002, i, j2);
            return true;
        }
    }

    public AnonymousClass7VC(C185598tw r1) {
        this.A00 = r1;
    }
}
