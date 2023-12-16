package X;

/* renamed from: X.2xL  reason: invalid class name and case insensitive filesystem */
public final class C59702xL {
    public final AnonymousClass7KQ A00;
    public final C40182Ev A01;
    public final C40222Ez A02;
    public final C55382qG A03;
    public final C56612sH A04;
    public final AnonymousClass1VX A05;
    public final AnonymousClass4FS A06;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r2 == X.C372121j.AI_AVAILABLE) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.AnonymousClass4CT r12) {
        /*
            r11 = this;
            X.2qG r0 = r11.A03
            X.21j r2 = r0.A01()
            X.21j r0 = X.C372121j.IN_WAITLIST
            if (r2 == r0) goto L_0x000f
            X.21j r1 = X.C372121j.AI_AVAILABLE
            r0 = 0
            if (r2 != r1) goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            X.C626936e.A0C(r0)
            X.2Ez r0 = r11.A02
            X.2Jo r3 = new X.2Jo
            r3.<init>(r12, r11)
            X.31C r4 = r0.A00
            java.lang.String r7 = r4.A03()
            r0 = 8
            X.1wj r2 = new X.1wj
            r2.<init>((java.lang.String) r7, (int) r0)
            r0 = 11
            X.1wj r1 = new X.1wj
            r1.<init>((X.C35351wj) r2, (int) r0)
            r0 = 6
            X.1xK r2 = new X.1xK
            r2.<init>((X.C35351wj) r1, (int) r0)
            r8 = 426(0x1aa, float:5.97E-43)
            X.36K r6 = X.C41032Ir.A05(r2)
            X.2Ey r1 = new X.2Ey
            r1.<init>(r3)
            r0 = 3
            X.1x5 r5 = new X.1x5
            r5.<init>(r2, r1, r0)
            r9 = 32000(0x7d00, double:1.581E-319)
            r4.A0D(r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59702xL.A01(X.4CT):void");
    }

    public C59702xL(AnonymousClass7KQ r1, C40182Ev r2, C40222Ez r3, C55382qG r4, C56612sH r5, AnonymousClass1VX r6, AnonymousClass4FS r7) {
        C18260x0.A0f(r5, r6, r7, r4, r1);
        this.A04 = r5;
        this.A05 = r6;
        this.A06 = r7;
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public static final /* synthetic */ void A00(C372121j r2, C59702xL r3) {
        int ordinal = r2.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                r3.A03.A03();
            } else if (ordinal == 2) {
                r3.A03.A02();
            }
            AnonymousClass7KQ r1 = r3.A00;
            C18260x0.A0M(r1.A00, "bonsai_last_waitlist_update_ms", r3.A04.A0H());
            return;
        }
        throw AnonymousClass001.A0e("bonsaiwaitlistsyncmanager/wrong genai state");
    }
}
