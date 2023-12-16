package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2xF  reason: invalid class name and case insensitive filesystem */
public class C59642xF {
    public final C56972sr A00;
    public final AnonymousClass33p A01;
    public final C29041iB A02;
    public final AnonymousClass33Z A03;
    public final C55172pv A04;
    public final AnonymousClass318 A05;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        if (r13 >= r11.A02) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C60212yB A00(X.C129526aS r10, X.C60212yB r11, int r12, long r13, boolean r15) {
        /*
            r4 = r13
            if (r15 != 0) goto L_0x000c
            if (r11 == 0) goto L_0x000c
            long r1 = r11.A02
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            r2 = 0
            if (r0 < 0) goto L_0x000d
        L_0x000c:
            r2 = 1
        L_0x000d:
            r1 = 3
            X.4KE r0 = new X.4KE
            r0.<init>(r1)
            boolean r0 = X.AnonymousClass367.A02(r0, r10)
            boolean r3 = X.AnonymousClass000.A1S(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ContactSyncDevicesUpdater/update/createNewDeviceInfo;clearExpectedTs="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ";actType="
            X.C18260x0.A0w(r0, r1, r3)
            if (r2 == 0) goto L_0x003b
            r6 = 0
            r8 = 0
            r10 = 0
        L_0x0034:
            X.2yB r1 = new X.2yB
            r2 = r12
            r1.<init>(r2, r3, r4, r6, r8, r10)
            return r1
        L_0x003b:
            X.C626936e.A06(r11)
            long r6 = r11.A02
            X.C626936e.A06(r11)
            long r8 = r11.A04
            X.C626936e.A06(r11)
            long r10 = r11.A03
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59642xF.A00(X.6aS, X.2yB, int, long, boolean):X.2yB");
    }

    public final boolean A01(UserJid userJid, long j, long j2) {
        C60212yB A07 = this.A05.A07(userJid);
        if (j > 0 && A07 != null) {
            long j3 = A07.A02;
            if (j < j3 && j2 == j3 && A07.A04 < AnonymousClass0x2.A0B(AnonymousClass0x2.A0F(this.A01), "adv_last_device_job_ts")) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("contactsyncDevicesupdater/update/usync fetch error, expectedTs=");
                A0o.append(j2);
                C18260x0.A11("; responseTs=", A0o, j);
                C55172pv r0 = this.A04;
                r0.A00.BhD(new AnonymousClass1VZ());
                return true;
            }
        }
        return false;
    }

    public C59642xF(C56972sr r1, AnonymousClass33p r2, C29041iB r3, AnonymousClass33Z r4, C55172pv r5, AnonymousClass318 r6) {
        this.A00 = r1;
        this.A05 = r6;
        this.A04 = r5;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
    }
}
