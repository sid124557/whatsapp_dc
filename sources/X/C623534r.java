package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.34r  reason: invalid class name and case insensitive filesystem */
public class C623534r {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public C624134x A08;
    public final C56612sH A09;
    public final UserJid A0A;

    public synchronized int A02() {
        return this.A00;
    }

    public synchronized int A03() {
        return this.A01;
    }

    public synchronized long A04() {
        return this.A04;
    }

    public synchronized long A05() {
        return this.A05;
    }

    public synchronized C623534r A06() {
        return new C623534r(this.A09, this);
    }

    public synchronized C623534r A07(C624134x r6) {
        this.A08 = r6;
        long j = r6.A1M;
        this.A04 = j;
        this.A05 = r6.A0K;
        this.A00++;
        int i = this.A01 + 1;
        this.A01 = i;
        if (i == 1) {
            this.A03 = j;
        } else {
            if (i <= 2) {
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A01(this, r6, "msgstore/status-new/ ", A0o);
            AnonymousClass0x2.A18(A0o);
        }
        this.A02 = j;
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A01(this, r6, "msgstore/status-new/ ", A0o2);
        AnonymousClass0x2.A18(A0o2);
        return A06();
    }

    public synchronized void A08(int i) {
        this.A00 = i;
    }

    public synchronized void A09(long j) {
        this.A02 = j;
    }

    public synchronized void A0A(long j) {
        this.A05 = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if ((r6.A09.A0H() - r6.A05) <= 86400000) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0B() {
        /*
            r6 = this;
            monitor-enter(r6)
            com.whatsapp.jid.UserJid r0 = r6.A0A     // Catch:{ all -> 0x001b }
            boolean r0 = r0 instanceof X.C135216kJ     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0018
            X.2sH r0 = r6.A09     // Catch:{ all -> 0x001b }
            long r4 = r0.A0H()     // Catch:{ all -> 0x001b }
            long r0 = r6.A05     // Catch:{ all -> 0x001b }
            long r4 = r4 - r0
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 1
            if (r1 > 0) goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            monitor-exit(r6)
            return r0
        L_0x001b:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C623534r.A0B():boolean");
    }

    public synchronized boolean A0C(C624134x r6) {
        return AnonymousClass001.A1W((r6.A1M > this.A06 ? 1 : (r6.A1M == this.A06 ? 0 : -1)));
    }

    public synchronized String toString() {
        StringBuilder A0o;
        A0o = AnonymousClass001.A0o();
        A0o.append("StatusInfo[jid=");
        A0o.append(this.A0A);
        A0o.append(", msgId=");
        A0o.append(this.A04);
        A0o.append(", lastRead=");
        A0o.append(this.A06);
        A0o.append(", lastSent=");
        A0o.append(this.A07);
        A0o.append(", firstUnread=");
        A0o.append(this.A03);
        A0o.append(", autoDownloadLimit=");
        A0o.append(this.A02);
        A0o.append(", ts=");
        A0o.append(this.A05);
        A0o.append(", unreadCount=");
        A0o.append(this.A01);
        A0o.append(", total=");
        A0o.append(this.A00);
        return AnonymousClass000.A0X(" ]", A0o);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C623534r(X.C56612sH r34, X.C623534r r35) {
        /*
            r33 = this;
            r15 = r35
            com.whatsapp.jid.UserJid r14 = r15.A0A
            long r10 = r15.A04
            long r8 = r15.A06
            long r6 = r15.A07
            long r4 = r15.A03
            long r2 = r15.A02
            long r0 = r15.A05
            int r13 = r15.A01
            int r12 = r15.A00
            r16 = r33
            r17 = r34
            r31 = r0
            r29 = r2
            r27 = r4
            r25 = r6
            r23 = r8
            r21 = r10
            r19 = r13
            r20 = r12
            r18 = r14
            r16.<init>(r17, r18, r19, r20, r21, r23, r25, r27, r29, r31)
            X.34x r1 = r15.A08
            r0 = r16
            r0.A08 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C623534r.<init>(X.2sH, X.34r):void");
    }

    public static String A00(C624134x r3) {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass2z0 A082 = C624134x.A08(r3, "[id=", A0o);
        AnonymousClass2z0.A0A(A082, A0o);
        A0o.append(", from_me=");
        A0o.append(A082.A02);
        A0o.append(", remote_resource=");
        return AnonymousClass000.A0S(r3.A0n(), A0o);
    }

    public static void A01(C623534r r1, C624134x r2, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(A00(r2));
        sb.append(" unseen:");
        sb.append(r1.A01);
        sb.append(" total:");
        sb.append(r1.A00);
    }

    public C623534r(C56612sH r3, UserJid userJid) {
        this.A09 = r3;
        this.A0A = userJid;
        this.A04 = 0;
        this.A06 = 0;
        this.A07 = 0;
        this.A03 = 0;
        this.A02 = 0;
        this.A05 = 0;
        this.A01 = 0;
        this.A00 = 0;
    }

    public C623534r(C56612sH r3, UserJid userJid, int i, int i2, long j, long j2, long j3, long j4, long j5, long j6) {
        this.A09 = r3;
        this.A0A = userJid;
        this.A04 = j;
        this.A06 = j2;
        this.A07 = j3;
        this.A03 = j4;
        this.A02 = Math.max(j5, j4);
        this.A05 = j6;
        this.A01 = i;
        this.A00 = i2;
    }
}
