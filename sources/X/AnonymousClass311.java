package X;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.311  reason: invalid class name */
public final class AnonymousClass311 {
    public static final long A08 = AnonymousClass0x7.A0B();
    public final C56612sH A00;
    public final C56982ss A01;
    public final C623334p A02;
    public final C61082zg A03;
    public final C56662sM A04;
    public final AnonymousClass5N2 A05;
    public final Map A06;
    public final Set A07;

    public synchronized Boolean A01(C27981fH r6) {
        Boolean bool;
        C162457s7.A0J(r6, 0);
        long A052 = this.A02.A05(r6);
        Map map = this.A06;
        Long valueOf = Long.valueOf(A052);
        if (map.containsKey(valueOf)) {
            C60672yw r0 = (C60672yw) map.get(valueOf);
            if (r0 != null) {
                bool = r0.A01;
            }
        } else if (A052 != -1) {
            bool = this.A03.A01(A052);
            A09(bool, A052);
        }
        bool = null;
        return bool;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        if (r4 != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A04(X.C27981fH r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            X.C162457s7.A0J(r6, r0)     // Catch:{ all -> 0x0041 }
            java.lang.Boolean r0 = r5.A01(r6)     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x003f
            X.2ss r0 = r5.A01     // Catch:{ all -> 0x0041 }
            r4 = 1
            X.31A r0 = r0.A0A(r6, r4)     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x001b
            X.21b r1 = r0.A0Z     // Catch:{ all -> 0x0041 }
        L_0x0016:
            X.21b r0 = X.C371321b.USERNAME     // Catch:{ all -> 0x0041 }
            if (r1 == r0) goto L_0x001e
            goto L_0x001d
        L_0x001b:
            r1 = 0
            goto L_0x0016
        L_0x001d:
            r4 = 0
        L_0x001e:
            X.2sM r0 = r5.A04     // Catch:{ all -> 0x0041 }
            com.whatsapp.jid.PhoneUserJid r0 = r0.A02(r6)     // Catch:{ all -> 0x0041 }
            boolean r3 = X.AnonymousClass000.A1X(r0)
            X.34p r0 = r5.A02     // Catch:{ all -> 0x0041 }
            long r1 = r0.A05(r6)     // Catch:{ all -> 0x0041 }
            if (r3 == 0) goto L_0x0033
            r0 = 1
            if (r4 == 0) goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            r5.A07(r6, r1, r0)     // Catch:{ all -> 0x0041 }
            if (r3 == 0) goto L_0x003f
            X.5N2 r1 = r5.A05     // Catch:{ all -> 0x0041 }
            r0 = 1
            r1.A00(r6, r0, r0, r0)     // Catch:{ all -> 0x0041 }
        L_0x003f:
            monitor-exit(r5)
            return
        L_0x0041:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass311.A04(X.1fH):void");
    }

    public synchronized void A05(C27981fH r4) {
        C162457s7.A0J(r4, 0);
        A07(r4, this.A02.A05(r4), true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        X.AnonymousClass2A8.A00(r7, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0051, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        X.AnonymousClass2A8.A00(r6, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0055, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A08(X.C27981fH r10, boolean r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            X.C162457s7.A0J(r10, r0)     // Catch:{ all -> 0x007c }
            X.34p r0 = r9.A02     // Catch:{ all -> 0x007c }
            long r1 = r0.A05(r10)     // Catch:{ all -> 0x007c }
            r3 = -1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x007a
            X.2zg r0 = r9.A03     // Catch:{ all -> 0x007c }
            X.3dV r0 = r0.A00     // Catch:{ all -> 0x0056 }
            X.4Fq r6 = r0.A04()     // Catch:{ all -> 0x0056 }
            X.C162457s7.A0H(r6)     // Catch:{ all -> 0x004f }
            X.3Yo r7 = r6.Axl()     // Catch:{ all -> 0x004f }
            android.content.ContentValues r8 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x0048 }
            java.lang.String r0 = "jid_row_id"
            X.C18270x1.A0c(r8, r0, r1)     // Catch:{ all -> 0x0048 }
            java.lang.String r0 = "pnh_duplicate_lid_thread"
            X.AnonymousClass0x2.A0o(r8, r0, r11)     // Catch:{ all -> 0x0048 }
            java.lang.String r5 = "LidChatStateStore/SET_LID_DUPLICATE_FLAG"
            r0 = r6
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0048 }
            X.2sg r4 = r0.A03     // Catch:{ all -> 0x0048 }
            java.lang.String r3 = "lid_chat_state"
            r0 = 5
            r4.A0C(r3, r5, r8, r0)     // Catch:{ all -> 0x0048 }
            r7.A00()     // Catch:{ all -> 0x0048 }
            r7.close()     // Catch:{ all -> 0x004f }
            r6.close()     // Catch:{ all -> 0x0056 }
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0056 }
            goto L_0x005b
        L_0x0048:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x004a }
        L_0x004a:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r7, r3)     // Catch:{ all -> 0x004f }
            throw r0     // Catch:{ all -> 0x004f }
        L_0x004f:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r6, r3)     // Catch:{ all -> 0x0056 }
            throw r0     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r0 = move-exception
            X.3Z0 r4 = X.AnonymousClass3Z0.A01(r0)     // Catch:{ all -> 0x007c }
        L_0x005b:
            java.lang.Throwable r3 = X.AnonymousClass3Z9.A00(r4)     // Catch:{ all -> 0x007c }
            if (r3 == 0) goto L_0x0067
            java.lang.String r0 = "{LidChatStateStore/}failed to set duplicate flag"
            com.whatsapp.util.Log.e(r0, r3)     // Catch:{ all -> 0x007c }
        L_0x0067:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x007c }
            boolean r0 = r4 instanceof X.AnonymousClass3Z0     // Catch:{ all -> 0x007c }
            if (r0 == 0) goto L_0x006e
            r4 = r3
        L_0x006e:
            boolean r0 = X.AnonymousClass001.A1Z(r4)     // Catch:{ all -> 0x007c }
            if (r0 == 0) goto L_0x007a
            r9.A03(r1, r11)     // Catch:{ all -> 0x007c }
            r9.A06(r10, r1)     // Catch:{ all -> 0x007c }
        L_0x007a:
            monitor-exit(r9)
            return
        L_0x007c:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass311.A08(X.1fH, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0A(X.C27981fH r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            X.C162457s7.A0J(r6, r0)     // Catch:{ all -> 0x0032 }
            X.34p r0 = r5.A02     // Catch:{ all -> 0x0032 }
            long r1 = r0.A05(r6)     // Catch:{ all -> 0x0032 }
            java.util.Map r0 = r5.A06     // Catch:{ all -> 0x0032 }
            java.lang.Object r0 = X.C18280x3.A0W(r0, r1)     // Catch:{ all -> 0x0032 }
            X.2yw r0 = (X.C60672yw) r0     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x001f
            boolean r3 = r0.A02     // Catch:{ all -> 0x0032 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x001f
            monitor-exit(r5)
            return r3
        L_0x001f:
            r3 = -1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0028
            r0 = 0
        L_0x0026:
            monitor-exit(r5)
            return r0
        L_0x0028:
            X.2zg r0 = r5.A03     // Catch:{ all -> 0x0032 }
            boolean r0 = r0.A02(r1)     // Catch:{ all -> 0x0032 }
            r5.A03(r1, r0)     // Catch:{ all -> 0x0032 }
            goto L_0x0026
        L_0x0032:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass311.A0A(X.1fH):boolean");
    }

    public final long A00(C27981fH r7) {
        long A052 = this.A02.A05(r7);
        Map map = this.A06;
        Long valueOf = Long.valueOf(A052);
        if (map.containsKey(valueOf)) {
            C60672yw r0 = (C60672yw) map.get(valueOf);
            if (r0 != null) {
                return r0.A00;
            }
            return 0;
        }
        long A002 = this.A03.A00(A052);
        A02(A052, A002);
        return A002;
    }

    public final void A02(long j, long j2) {
        Boolean A012;
        boolean A022;
        Map map = this.A06;
        Long valueOf = Long.valueOf(j);
        C60672yw r0 = (C60672yw) map.get(valueOf);
        if (r0 != null) {
            A012 = r0.A01;
            A022 = r0.A02;
        } else {
            C61082zg r02 = this.A03;
            A012 = r02.A01(j);
            A022 = r02.A02(j);
        }
        map.put(valueOf, new C60672yw(A012, j2, A022));
    }

    public final void A03(long j, boolean z) {
        Boolean A012;
        long A002;
        Map map = this.A06;
        Long valueOf = Long.valueOf(j);
        C60672yw r0 = (C60672yw) map.get(valueOf);
        if (r0 != null) {
            A012 = r0.A01;
            A002 = r0.A00;
        } else {
            C61082zg r02 = this.A03;
            A012 = r02.A01(j);
            A002 = r02.A00(j);
        }
        map.put(valueOf, new C60672yw(A012, A002, z));
    }

    public final void A06(C27981fH r5, long j) {
        C60672yw r3 = (C60672yw) C18280x3.A0W(this.A06, j);
        if (r3 != null) {
            Set<C837049l> set = this.A07;
            synchronized (set) {
                for (C837049l BY4 : set) {
                    BY4.BY4(r3, r5);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(X.C27981fH r8, long r9, boolean r11) {
        /*
            r7 = this;
            r1 = -1
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0071
            X.2zg r0 = r7.A03
            X.3dV r0 = r0.A00     // Catch:{ all -> 0x004a }
            X.4Fq r4 = r0.A04()     // Catch:{ all -> 0x004a }
            X.C162457s7.A0H(r4)     // Catch:{ all -> 0x0043 }
            X.3Yo r5 = r4.Axl()     // Catch:{ all -> 0x0043 }
            android.content.ContentValues r6 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x003c }
            java.lang.String r0 = "jid_row_id"
            X.C18270x1.A0c(r6, r0, r9)     // Catch:{ all -> 0x003c }
            java.lang.String r0 = "is_pn_shared"
            X.C621833x.A03(r6, r0, r11)     // Catch:{ all -> 0x003c }
            java.lang.String r3 = "LidChatStateStore/SET_PN_SHARED_FOR_JID"
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x003c }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x003c }
            java.lang.String r1 = "lid_chat_state"
            r0 = 5
            r2.A0C(r1, r3, r6, r0)     // Catch:{ all -> 0x003c }
            r5.A00()     // Catch:{ all -> 0x003c }
            r5.close()     // Catch:{ all -> 0x0043 }
            r4.close()     // Catch:{ all -> 0x004a }
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x004a }
            goto L_0x004f
        L_0x003c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)     // Catch:{ all -> 0x0043 }
            throw r0     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)     // Catch:{ all -> 0x004a }
            throw r0     // Catch:{ all -> 0x004a }
        L_0x004a:
            r0 = move-exception
            X.3Z0 r2 = X.AnonymousClass3Z0.A01(r0)
        L_0x004f:
            java.lang.Throwable r1 = X.AnonymousClass3Z9.A00(r2)
            if (r1 == 0) goto L_0x005a
            java.lang.String r0 = "LidChatStateStore/failed to set phone number shared state"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x005a:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r0 = r2 instanceof X.AnonymousClass3Z0
            if (r0 == 0) goto L_0x0061
            r2 = r1
        L_0x0061:
            boolean r0 = X.AnonymousClass001.A1Z(r2)
            if (r0 == 0) goto L_0x0071
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            r7.A09(r0, r9)
            r7.A06(r8, r9)
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass311.A07(X.1fH, long, boolean):void");
    }

    public final void A09(Boolean bool, long j) {
        long A002;
        boolean A022;
        Map map = this.A06;
        Long valueOf = Long.valueOf(j);
        C60672yw r0 = (C60672yw) map.get(valueOf);
        if (r0 != null) {
            A002 = r0.A00;
            A022 = r0.A02;
        } else {
            C61082zg r02 = this.A03;
            A002 = r02.A00(j);
            A022 = r02.A02(j);
        }
        map.put(valueOf, new C60672yw(bool, A002, A022));
    }

    public AnonymousClass311(C56612sH r3, C56982ss r4, C623334p r5, C61082zg r6, C56662sM r7, AnonymousClass5N2 r8) {
        C18260x0.A0c(r4, r3, r5, r7);
        C162457s7.A0J(r8, 6);
        LinkedHashSet A17 = AnonymousClass0x9.A17();
        LinkedHashMap A0r = C18320x8.A0r();
        this.A01 = r4;
        this.A00 = r3;
        this.A02 = r5;
        this.A04 = r7;
        this.A03 = r6;
        this.A05 = r8;
        this.A07 = A17;
        this.A06 = A0r;
    }
}
