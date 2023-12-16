package X;

import android.text.TextUtils;

/* renamed from: X.353  reason: invalid class name */
public final class AnonymousClass353 {
    public static void A03(C208319m r7, C42592Ot r8) {
        AnonymousClass22g r0;
        if (r8 != null) {
            String str = r8.A00;
            if (str != null) {
                C21801Df A0T = AnonymousClass0x7.A0T(r7);
                A0T.bitField0_ |= 32;
                A0T.contentText_ = str;
            }
            String str2 = r8.A01;
            if (str2 != null) {
                C21801Df A0T2 = AnonymousClass0x7.A0T(r7);
                A0T2.bitField0_ |= 64;
                A0T2.footerText_ = str2;
            }
            for (C46532bn r5 : r8.A02) {
                C130546c9 A0G = C21591Ck.DEFAULT_INSTANCE.A0G();
                String str3 = r5.A04;
                C21591Ck r1 = (C21591Ck) C18320x8.A0C(A0G);
                str3.getClass();
                r1.bitField0_ |= 1;
                r1.buttonId_ = str3;
                int i = r5.A01;
                if (i == 2) {
                    r0 = AnonymousClass22g.NATIVE_FLOW;
                } else if (i == 1) {
                    r0 = AnonymousClass22g.RESPONSE;
                } else {
                    r0 = AnonymousClass22g.UNKNOWN;
                }
                C21591Ck r12 = (C21591Ck) C18320x8.A0C(A0G);
                r12.type_ = r0.value;
                r12.bitField0_ |= 4;
                C130546c9 A0G2 = AnonymousClass1AI.DEFAULT_INSTANCE.A0G();
                String str4 = r5.A03;
                AnonymousClass1AI r13 = (AnonymousClass1AI) C18320x8.A0C(A0G2);
                str4.getClass();
                r13.bitField0_ |= 1;
                r13.displayText_ = str4;
                AnonymousClass1AI r02 = (AnonymousClass1AI) A0G2.A06();
                C21591Ck r14 = (C21591Ck) C18320x8.A0C(A0G);
                r02.getClass();
                r14.buttonText_ = r02;
                r14.bitField0_ |= 2;
                C130786cX A06 = A0G.A06();
                C21801Df A0T3 = AnonymousClass0x7.A0T(r7);
                A06.getClass();
                C188248ya r15 = A0T3.buttons_;
                if (!((AnonymousClass8T6) r15).A00) {
                    r15 = C130786cX.A07(r15);
                    A0T3.buttons_ = r15;
                }
                r15.add(A06);
            }
        }
    }

    public static String A00(C624134x r3) {
        String A01 = A01(r3);
        if (TextUtils.isEmpty(A01)) {
            return null;
        }
        StringBuilder A0A = C18330xA.A0A(A01);
        String str = C40802Hu.A01(r3).A01;
        if (!TextUtils.isEmpty(str)) {
            A0A.append("\n");
            A0A.append(str);
        }
        return A0A.toString();
    }

    public static String A01(C624134x r1) {
        C42592Ot A01;
        if (!C624134x.A0c(r1) || (A01 = C40802Hu.A01(r1)) == null) {
            return null;
        }
        String str = A01.A00;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        return null;
    }

    public static String A02(C42592Ot r4, String str) {
        StringBuilder A0o = AnonymousClass001.A0o();
        if (r4 != null) {
            if (!TextUtils.isEmpty(str)) {
                A0o.append(str);
            }
            String str2 = r4.A00;
            if (!TextUtils.isEmpty(str2)) {
                if (A0o.length() > 0) {
                    A0o.append("\n");
                }
                A0o.append(str2);
            }
            String str3 = r4.A01;
            if (!TextUtils.isEmpty(str3)) {
                if (A0o.length() > 0) {
                    A0o.append("\n");
                }
                A0o.append(str3);
            }
        }
        return A0o.toString();
    }

    public static boolean A04(C624134x r1) {
        if (!C624134x.A0c(r1) || C40802Hu.A01(r1) == null) {
            return false;
        }
        return true;
    }
}
