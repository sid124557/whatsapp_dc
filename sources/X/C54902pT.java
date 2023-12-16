package X;

/* renamed from: X.2pT  reason: invalid class name and case insensitive filesystem */
public class C54902pT {
    public final C66663Mh A00;
    public final C56612sH A01;
    public final AnonymousClass1VX A02;
    public final C620933l A03;
    public final C153087ae A04;
    public final C385127z A05;

    public boolean A00() {
        if (!A03(2) || !this.A02.A0Y(C58422vE.A02, 1159)) {
            return false;
        }
        return true;
    }

    public boolean A02() {
        if (A03(0) || A00()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03(int r9) {
        /*
            r8 = this;
            r5 = 1
            if (r9 == 0) goto L_0x0066
            if (r9 != r5) goto L_0x0032
            X.3Mh r1 = r8.A00
            X.1Ei r0 = X.C66663Mh.A0b
        L_0x0009:
            boolean r0 = r1.A08(r0)
            if (r0 == 0) goto L_0x0032
            X.33l r7 = r8.A03
            java.lang.String r6 = "payments_enabled_till"
            android.content.SharedPreferences r0 = r7.A03()
            long r3 = X.AnonymousClass0x2.A0A(r0, r6)
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0029
            android.content.SharedPreferences r0 = r7.A03()
            X.C18270x1.A0n(r0, r6)
        L_0x0029:
            X.7ae r0 = r8.A04
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x006b
            return r5
        L_0x0032:
            X.33l r2 = r8.A03
            android.content.SharedPreferences r1 = r2.A03()
            java.lang.String r0 = "pref_dog_food_country_code"
            java.lang.String r0 = X.C18280x3.A0Z(r1, r0)
            if (r0 == 0) goto L_0x0049
            java.lang.String r0 = "setMockedCountry() not supported in non-debug builds"
            java.lang.RuntimeException r0 = X.AnonymousClass002.A0E(r0)
            throw r0
        L_0x0049:
            X.2sH r0 = r8.A01
            long r3 = r0.A0H()
            if (r9 == 0) goto L_0x0062
            if (r9 == r5) goto L_0x0062
            java.lang.String r1 = "merchant_payments_enabled_till"
        L_0x0055:
            android.content.SharedPreferences r0 = r2.A03()
            long r1 = X.AnonymousClass0x2.A0A(r0, r1)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x006b
            goto L_0x0029
        L_0x0062:
            java.lang.String r1 = "payments_enabled_till"
            goto L_0x0055
        L_0x0066:
            X.3Mh r1 = r8.A00
            X.1Ei r0 = X.C66663Mh.A0c
            goto L_0x0009
        L_0x006b:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54902pT.A03(int):boolean");
    }

    public boolean A01() {
        return AnonymousClass000.A1S(this.A00.A08(C66663Mh.A0b) ? 1 : 0);
    }

    public C54902pT(C66663Mh r1, C56612sH r2, AnonymousClass1VX r3, C620933l r4, C153087ae r5, C385127z r6) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = r6;
    }
}
