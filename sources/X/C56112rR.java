package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2rR  reason: invalid class name and case insensitive filesystem */
public class C56112rR {
    public final AnonymousClass08M A00 = AnonymousClass08M.A01();
    public final C56972sr A01;
    public final C64773Ex A02;
    public final C56422rx A03;
    public final C56612sH A04;
    public final AnonymousClass2YA A05;
    public final C56832sd A06;

    public int A01(UserJid userJid) {
        AnonymousClass3ZH A07;
        if (this.A01.A0a(userJid)) {
            return A00(this);
        }
        if (this.A03.A03(userJid) || (A07 = this.A02.A07(userJid)) == null) {
            return 0;
        }
        return A07.A01;
    }

    public long A02(UserJid userJid) {
        if (this.A01.A0a(userJid)) {
            return AnonymousClass0x2.A0B(this.A05.A00(), "disappearing_mode_timestamp");
        }
        AnonymousClass3ZH A07 = this.A02.A07(userJid);
        if (A07 == null) {
            return 0;
        }
        return A07.A09;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r1 <= r0) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.whatsapp.jid.UserJid A03(X.C95814uZ r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.whatsapp.jid.UserJid
            r3 = 0
            if (r0 == 0) goto L_0x004c
            X.2rx r0 = r4.A03
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            boolean r0 = r0.A03(r5)
            if (r0 != 0) goto L_0x004c
            boolean r0 = r4.A07()
            if (r0 == 0) goto L_0x0038
            X.3Ex r2 = r4.A02
            X.3ZH r0 = r2.A07(r5)
            if (r0 == 0) goto L_0x002e
            int r0 = r0.A01
            if (r0 == 0) goto L_0x002e
            int r1 = A00(r4)
            X.3ZH r0 = r2.A07(r5)
            if (r0 != 0) goto L_0x0035
            r0 = 0
        L_0x002c:
            if (r1 > r0) goto L_0x0038
        L_0x002e:
            X.2sr r0 = r4.A01
            com.whatsapp.jid.PhoneUserJid r5 = X.C56972sr.A04(r0)
            return r5
        L_0x0035:
            int r0 = r0.A01
            goto L_0x002c
        L_0x0038:
            X.2sr r0 = r4.A01
            boolean r0 = r0.A0a(r5)
            if (r0 == 0) goto L_0x0047
            boolean r0 = r4.A07()
        L_0x0044:
            if (r0 == 0) goto L_0x004c
            return r5
        L_0x0047:
            int r0 = r4.A01(r5)
            goto L_0x0044
        L_0x004c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56112rR.A03(X.4uZ):com.whatsapp.jid.UserJid");
    }

    public Integer A05() {
        Integer num = (Integer) this.A00.A07();
        if (num == null) {
            return Integer.valueOf(C18280x3.A02(this.A05.A00(), "disappearing_mode_duration_int"));
        }
        return num;
    }

    public void A06(int i, long j) {
        AnonymousClass2YA r2 = this.A05;
        C18270x1.A0h(r2.A00().edit(), "disappearing_mode_duration_int", i);
        C18270x1.A0i(r2.A00().edit(), "disappearing_mode_timestamp", j);
        C06270Wx.A04(this.A00, i);
    }

    public boolean A07() {
        return AnonymousClass000.A1S(C18280x3.A02(this.A05.A00(), "disappearing_mode_duration_int"));
    }

    public C56112rR(C56972sr r2, C64773Ex r3, C56422rx r4, C56612sH r5, AnonymousClass2YA r6, C56832sd r7) {
        this.A04 = r5;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A06 = r7;
        this.A05 = r6;
    }

    public static int A00(C56112rR r0) {
        return r0.A05().intValue();
    }

    public C31161nq A04(C95814uZ r11) {
        UserJid A032 = A03(r11);
        if (A032 == null) {
            return null;
        }
        boolean A0a = this.A01.A0a(A032);
        int A012 = C18280x3.A01(A0a ? 1 : 0);
        C56832sd r8 = this.A06;
        UserJid A042 = AnonymousClass32Y.A04(r11);
        long A0H = this.A04.A0H();
        int A013 = A01(A032);
        long A022 = A02(A032);
        Boolean valueOf = Boolean.valueOf(A0a);
        C31161nq r7 = new C31161nq(C56832sd.A00(A042, r8), A0H);
        r7.A00 = A013;
        C624134x.A0L(r7, A022);
        r7.A00 = A012;
        r7.A04 = 2;
        if (valueOf == null) {
            return r7;
        }
        r7.A0o = valueOf;
        return r7;
    }
}
