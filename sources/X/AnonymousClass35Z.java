package X;

/* renamed from: X.35Z  reason: invalid class name */
public final class AnonymousClass35Z {
    public static final boolean A00(byte b) {
        if (b == 3 || b == 28 || b == 62 || b == 43 || b == 81) {
            return true;
        }
        return false;
    }

    public static final boolean A02(AnonymousClass1VX r6, AnonymousClass1nB r7) {
        String str;
        C18270x1.A14(r7, r6);
        AnonymousClass33C r4 = r7.A01;
        StringBuilder A0A = C18330xA.A0A("FMessageUtil/shouldStreamVideo/");
        A0A.append("mediaDataV2 is ");
        if (r4 == null) {
            str = "null";
        } else {
            str = "not null";
        }
        A0A.append(str);
        A0A.append(",isStreamableVideo=");
        A0A.append(A01(r6, r7));
        boolean z = C624134x.A08(r7, ",message.key.from_me=", A0A).A02;
        A0A.append(z);
        A0A.append(",isForwardedPartiallyDownloadedVideo=");
        A0A.append(A04(r7));
        if (r4 != null) {
            A0A.append(",mediaDataV2.transferred=");
            A0A.append(r4.A0R);
            A0A.append(",mediaDataV2 is not suspicious content=");
            A0A.append(AnonymousClass000.A1U(r4.A07, 0));
        }
        AnonymousClass0x2.A18(A0A);
        if (r4 == null || !A01(r6, r7)) {
            return false;
        }
        if ((!z || A04(r7)) && !r4.A0R && r4.A07 == 0) {
            return true;
        }
        return false;
    }

    public static final boolean A03(C31981pC r5) {
        C162457s7.A0J(r5, 0);
        AnonymousClass33C r1 = r5.A01;
        if (!A00(r5.A1I) || r1 == null || r5.A1J.A02 || r1.A0R || r1.A0C <= 0) {
            return false;
        }
        return true;
    }

    public static final boolean A04(AnonymousClass1nB r4) {
        C162457s7.A0J(r4, 0);
        AnonymousClass33C r3 = r4.A01;
        if (r3 != null && A00(r4.A1I) && r4.A1J.A02 && AnonymousClass000.A1U(r4.A0A & 1, 1) && !r3.A0R && r4.A07 != null) {
            return true;
        }
        return false;
    }

    public static final boolean A01(AnonymousClass1VX r3, C624134x r4) {
        C18260x0.A0O(r4, r3);
        if (!(r4 instanceof C31951p9) && !(r4 instanceof C31971pB)) {
            return false;
        }
        C30471mV r42 = (C30471mV) r4;
        C613030d A1v = r42.A1v();
        if (((A1v == null || !A1v.A04()) && !AnonymousClass2z0.A0C(r42)) || !(!C107535bT.A0C(r3.A0R(C58422vE.A02, 2917)))) {
            return false;
        }
        return true;
    }
}
