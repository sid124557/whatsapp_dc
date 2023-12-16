package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.4V2  reason: invalid class name */
public final class AnonymousClass4V2 extends C05550Ty {
    public C108985dt A00;
    public final C06270Wx A01;
    public final C06270Wx A02;
    public final C06270Wx A03;
    public final C06270Wx A04;
    public final AnonymousClass08M A05;
    public final AnonymousClass08M A06;
    public final AnonymousClass08M A07;
    public final C48372en A08;
    public final AnonymousClass5Y9 A09;
    public final C150397Qo A0A;
    public final C104975Tb A0B;
    public final AnonymousClass33p A0C;
    public final UserJid A0D;
    public final AnonymousClass4UC A0E;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
        if (r4.length() == 0) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0D(X.C108985dt r6) {
        /*
            r5 = this;
            r0 = 0
            X.C162457s7.A0J(r6, r0)
            r5.A00 = r6
            X.5Tb r2 = r5.A0B
            r1 = 1
            java.lang.String r0 = "postcode"
            boolean r0 = r2.A03(r6, r0, r1)
            if (r0 == 0) goto L_0x0052
            X.33p r1 = r5.A0C
            com.whatsapp.jid.UserJid r0 = r5.A0D
            java.lang.String r0 = r0.getRawString()
            java.lang.String r4 = r1.A0c(r0)
            if (r4 == 0) goto L_0x0026
            int r1 = r4.length()
            r0 = 0
            if (r1 != 0) goto L_0x0027
        L_0x0026:
            r0 = 1
        L_0x0027:
            r3 = 0
            if (r0 == 0) goto L_0x0034
            X.7y4 r0 = r6.A02
            if (r0 == 0) goto L_0x0032
            java.lang.String r4 = r0.A00
            if (r4 != 0) goto L_0x0034
        L_0x0032:
            java.lang.String r4 = ""
        L_0x0034:
            X.08M r1 = r5.A07
            X.7Qo r0 = r5.A0A
            X.7y4 r2 = r6.A02
            if (r2 == 0) goto L_0x003e
            java.lang.String r3 = r2.A02
        L_0x003e:
            java.lang.String r0 = r0.A00(r4, r3)
            r1.A0H(r0)
            X.08M r1 = r5.A05
            if (r2 == 0) goto L_0x004d
            java.lang.String r0 = r2.A02
            if (r0 != 0) goto L_0x004f
        L_0x004d:
            java.lang.String r0 = "pincode"
        L_0x004f:
            r1.A0H(r0)
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4V2.A0D(X.5dt):void");
    }

    public final void A0E(String str) {
        if (!this.A0B.A03(this.A00, "postcode", true)) {
            this.A0E.A0H("error");
            return;
        }
        AnonymousClass5Y9 r5 = this.A09;
        UserJid userJid = this.A0D;
        r5.A06.A00(new C111925iu(r5, new C148097Gx(this, str), userJid), userJid, str).A06(this.A00);
    }

    public AnonymousClass4V2(C48372en r2, AnonymousClass5Y9 r3, C150397Qo r4, C104975Tb r5, AnonymousClass33p r6, UserJid userJid) {
        C18260x0.A0Q(r6, r3);
        C162457s7.A0J(r2, 4);
        this.A0C = r6;
        this.A09 = r3;
        this.A0B = r5;
        this.A08 = r2;
        this.A0A = r4;
        this.A0D = userJid;
        AnonymousClass08M A012 = AnonymousClass08M.A01();
        this.A07 = A012;
        this.A04 = A012;
        AnonymousClass08M A013 = AnonymousClass08M.A01();
        this.A06 = A013;
        this.A03 = A013;
        AnonymousClass08M A014 = AnonymousClass08M.A01();
        this.A05 = A014;
        this.A01 = A014;
        AnonymousClass4UC A0b = AnonymousClass0x9.A0b();
        this.A0E = A0b;
        this.A02 = A0b;
    }
}
