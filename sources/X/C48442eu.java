package X;

/* renamed from: X.2eu  reason: invalid class name and case insensitive filesystem */
public final class C48442eu {
    public final AnonymousClass33p A00;
    public final AnonymousClass1VX A01;

    public final boolean A00() {
        if (!C18280x3.A1W(AnonymousClass0x2.A0F(this.A00), "companion_reg_with_link_code_enabled_for_wearos") || this.A01.A0Y(C58422vE.A02, 3698)) {
            AnonymousClass1VX r2 = this.A01;
            C58422vE r1 = C58422vE.A02;
            if (r2.A0Y(r1, 2734) || r2.A0Y(r1, 3693)) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if (r7.A01.A0Y(X.C58422vE.A02, 3698) != false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01() {
        /*
            r7 = this;
            X.33p r0 = r7.A00
            X.8qC r6 = r0.A01
            android.content.SharedPreferences r1 = X.C18300x5.A0B(r6)
            java.lang.String r0 = "companion_reg_with_link_code_enabled_for_wearos"
            r5 = 0
            boolean r0 = r1.getBoolean(r0, r5)
            if (r0 == 0) goto L_0x001e
            X.1VX r2 = r7.A01
            r1 = 3698(0xe72, float:5.182E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r1 = r2.A0Y(r0, r1)
            r0 = 1
            if (r1 == 0) goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            r4 = 1
            if (r0 != 0) goto L_0x0042
            X.1VX r3 = r7.A01
            r0 = 3693(0xe6d, float:5.175E-42)
            X.2vE r2 = X.C58422vE.A02
            boolean r0 = r3.A0Y(r2, r0)
            if (r0 != 0) goto L_0x0042
            android.content.SharedPreferences r1 = X.C18300x5.A0B(r6)
            java.lang.String r0 = "did_receive_companion_hello"
            boolean r0 = r1.getBoolean(r0, r5)
            if (r0 == 0) goto L_0x0043
            r0 = 2734(0xaae, float:3.831E-42)
            boolean r0 = r3.A0Y(r2, r0)
            if (r0 == 0) goto L_0x0043
        L_0x0042:
            return r4
        L_0x0043:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48442eu.A01():boolean");
    }

    public C48442eu(AnonymousClass33p r1, AnonymousClass1VX r2) {
        C18260x0.A0Q(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }
}
