package X;

import android.content.SharedPreferences;

/* renamed from: X.2qG  reason: invalid class name and case insensitive filesystem */
public final class C55382qG {
    public final AnonymousClass7KQ A00;
    public final C56612sH A01;
    public final AnonymousClass1VX A02;
    public final C183538qC A03;
    public final AnonymousClass66R A04 = C154517dI.A01(new C76923sZ(this));

    public final C372121j A00() {
        Integer valueOf;
        int i = AnonymousClass0x2.A0F(this.A00.A00).getInt("bonsai_genai_waitlist_state", -1);
        if (i == -1) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(i);
        }
        for (C372121j r2 : C372121j.values()) {
            int i2 = r2.value;
            if (valueOf != null && i2 == valueOf.intValue()) {
                return r2;
            }
        }
        return null;
    }

    public final C372121j A01() {
        return (C372121j) ((C54282oT) this.A04.getValue()).A00();
    }

    public final void A02() {
        AnonymousClass7KQ r4 = this.A00;
        C18260x0.A0L(r4.A00, "bonsai_genai_waitlist_state", C372121j.AI_AVAILABLE.value);
        long A0H = this.A01.A0H();
        SharedPreferences.Editor A042 = C18270x1.A04(r4.A02);
        C162457s7.A0D(A042);
        A042.putLong("bonsai_gen_ai_feature_allowed_timestamp_ms", A0H);
        A042.apply();
        A04();
    }

    public final void A03() {
        AnonymousClass7KQ r5 = this.A00;
        C18260x0.A0L(r5.A00, "bonsai_genai_waitlist_state", C372121j.IN_WAITLIST.value);
        long A0H = this.A01.A0H();
        AnonymousClass66R r2 = r5.A02;
        SharedPreferences.Editor A042 = C18270x1.A04(r2);
        C162457s7.A0D(A042);
        A042.putLong("bonsai_gen_ai_added_to_waitlist_timestamp_ms", A0H);
        A042.apply();
        C18270x1.A0n(C18310x6.A0F(r2), "bonsai_gen_ai_feature_allowed_timestamp_ms");
        A04();
    }

    public C55382qG(AnonymousClass7KQ r2, C56612sH r3, AnonymousClass1VX r4, C183538qC r5) {
        C18260x0.A0c(r3, r4, r2, r5);
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r2;
        this.A03 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0045, code lost:
        if (r4.value > r2.value) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04() {
        /*
            r5 = this;
            X.21j r2 = r5.A00()
            r0 = -1
            if (r2 == 0) goto L_0x003e
            int r1 = r2.ordinal()
            if (r1 == r0) goto L_0x003e
            r0 = 0
            if (r1 == r0) goto L_0x0093
            r0 = 1
            if (r1 == r0) goto L_0x003b
            r0 = 2
            if (r1 != r0) goto L_0x008e
            X.1VX r2 = r5.A02
            r1 = 4010(0xfaa, float:5.619E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x003b
            X.21j r4 = X.C372121j.AI_AVAILABLE
        L_0x0024:
            X.21j r2 = r5.A01()
            r3 = r2
            int r1 = r2.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x0047
            r0 = 1
            if (r1 == r0) goto L_0x0041
            r0 = 2
            if (r1 == r0) goto L_0x0041
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        L_0x003b:
            X.21j r4 = X.C372121j.IN_WAITLIST
            goto L_0x0024
        L_0x003e:
            X.21j r4 = X.C372121j.BEFORE_WAITLIST
            goto L_0x0024
        L_0x0041:
            int r1 = r4.value
            int r0 = r2.value
            if (r1 <= r0) goto L_0x0048
        L_0x0047:
            r3 = r4
        L_0x0048:
            if (r3 == r2) goto L_0x008d
            X.66R r2 = r5.A04
            java.lang.Object r1 = r2.getValue()
            X.2oT r1 = (X.C54282oT) r1
            r0 = 1
            r1.A01(r3, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "bonsaistatemanager/updatestate/state: "
            r1.append(r0)
            java.lang.Object r0 = r2.getValue()
            r1.append(r0)
            java.lang.String r0 = " -> "
            X.C18260x0.A1P(r1, r0, r3)
            X.8qC r0 = r5.A03
            java.util.Iterator r2 = X.AnonymousClass0x2.A0j(r0)
        L_0x0071:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x008d
            java.lang.Object r1 = r2.next()
            X.2Jn r1 = (X.C41252Jn) r1
            r0 = 0
            X.C162457s7.A0J(r3, r0)
            X.66R r0 = r1.A01
            java.lang.Object r0 = r0.getValue()
            X.0Wx r0 = (X.C06270Wx) r0
            r0.A0G(r3)
            goto L_0x0071
        L_0x008d:
            return
        L_0x008e:
            X.3f1 r0 = X.C73153f1.A00()
            throw r0
        L_0x0093:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Wrong genai state "
            java.lang.String r0 = X.AnonymousClass000.A0P(r2, r0, r1)
            java.lang.AssertionError r0 = X.AnonymousClass0x9.A0i(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55382qG.A04():void");
    }
}
