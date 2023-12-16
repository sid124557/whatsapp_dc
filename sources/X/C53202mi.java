package X;

import android.text.TextUtils;

/* renamed from: X.2mi  reason: invalid class name and case insensitive filesystem */
public class C53202mi {
    public String[] A00;
    public String[] A01;
    public final C64773Ex A02;
    public final C620733j A03;
    public final AnonymousClass1VX A04;

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x008c, code lost:
        return r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A02(com.whatsapp.jid.Jid r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r8 instanceof X.C95814uZ     // Catch:{ all -> 0x008d }
            r6 = 0
            if (r0 == 0) goto L_0x008b
            X.4uZ r8 = (X.C95814uZ) r8     // Catch:{ all -> 0x008d }
            boolean r0 = X.C627336j.A0K(r8)     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x0018
            X.3Ex r0 = r7.A02     // Catch:{ all -> 0x008d }
            X.3ZH r0 = r0.A0A(r8)     // Catch:{ all -> 0x008d }
            boolean r0 = r0.A0j     // Catch:{ all -> 0x008d }
            monitor-exit(r7)
            return r0
        L_0x0018:
            boolean r0 = r8 instanceof com.whatsapp.jid.UserJid     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x008b
            com.whatsapp.jid.UserJid r8 = (com.whatsapp.jid.UserJid) r8     // Catch:{ all -> 0x008d }
            java.lang.String[] r5 = r7.A01     // Catch:{ all -> 0x008d }
            if (r5 != 0) goto L_0x0036
            X.1VX r2 = r7.A04     // Catch:{ all -> 0x008d }
            r1 = 1031(0x407, float:1.445E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ all -> 0x008d }
            java.lang.String r1 = r2.A0R(r0, r1)     // Catch:{ all -> 0x008d }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x003b
            java.lang.String[] r5 = new java.lang.String[r6]     // Catch:{ all -> 0x008d }
        L_0x0034:
            r7.A01 = r5     // Catch:{ all -> 0x008d }
        L_0x0036:
            java.lang.String r4 = r8.user     // Catch:{ all -> 0x008d }
            int r3 = r5.length     // Catch:{ all -> 0x008d }
            r2 = 0
            goto L_0x0040
        L_0x003b:
            java.lang.String[] r5 = X.C18320x8.A1b(r1)     // Catch:{ all -> 0x008d }
            goto L_0x0034
        L_0x0040:
            if (r2 >= r3) goto L_0x0054
            r1 = r5[r2]     // Catch:{ all -> 0x008d }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x008d }
            if (r0 != 0) goto L_0x0051
            boolean r0 = r4.startsWith(r1)     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x0051
            goto L_0x008a
        L_0x0051:
            int r2 = r2 + 1
            goto L_0x0040
        L_0x0054:
            java.lang.String[] r5 = r7.A00     // Catch:{ all -> 0x008d }
            if (r5 != 0) goto L_0x006c
            X.1VX r2 = r7.A04     // Catch:{ all -> 0x008d }
            r1 = 4799(0x12bf, float:6.725E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ all -> 0x008d }
            java.lang.String r1 = r2.A0R(r0, r1)     // Catch:{ all -> 0x008d }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x0071
            java.lang.String[] r5 = new java.lang.String[r6]     // Catch:{ all -> 0x008d }
        L_0x006a:
            r7.A00 = r5     // Catch:{ all -> 0x008d }
        L_0x006c:
            java.lang.String r4 = r8.user     // Catch:{ all -> 0x008d }
            int r3 = r5.length     // Catch:{ all -> 0x008d }
            r2 = 0
            goto L_0x0076
        L_0x0071:
            java.lang.String[] r5 = X.C18320x8.A1b(r1)     // Catch:{ all -> 0x008d }
            goto L_0x006a
        L_0x0076:
            if (r2 >= r3) goto L_0x008b
            r1 = r5[r2]     // Catch:{ all -> 0x008d }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x008d }
            if (r0 != 0) goto L_0x0087
            boolean r0 = r4.startsWith(r1)     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x0087
            goto L_0x008a
        L_0x0087:
            int r2 = r2 + 1
            goto L_0x0076
        L_0x008a:
            r6 = 1
        L_0x008b:
            monitor-exit(r7)
            return r6
        L_0x008d:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53202mi.A02(com.whatsapp.jid.Jid):boolean");
    }

    public boolean A00() {
        AnonymousClass1VX r2 = this.A04;
        C58422vE r1 = C58422vE.A02;
        if (r2.A0Y(r1, 233)) {
            String A0R = r2.A0R(r1, 379);
            if (!TextUtils.isEmpty(A0R)) {
                String A07 = this.A03.A07();
                String[] A1b = C18320x8.A1b(A0R);
                int length = A1b.length;
                int i = 0;
                while (i < length) {
                    if (!A1b[i].equals(A07)) {
                        i++;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean A01(C95814uZ r4) {
        if (!this.A04.A0Y(C58422vE.A02, 3003) || !A00() || !A02(r4)) {
            return true;
        }
        return false;
    }

    public C53202mi(C64773Ex r1, C620733j r2, AnonymousClass1VX r3) {
        this.A04 = r3;
        this.A03 = r2;
        this.A02 = r1;
    }
}
