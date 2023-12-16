package X;

import java.util.Map;

/* renamed from: X.2iK  reason: invalid class name and case insensitive filesystem */
public class C50532iK {
    public final C69263Wi A00;
    public final C56972sr A01;
    public final C54042o5 A02;
    public final C55912r7 A03;
    public final C56962sq A04;
    public final C64213Cp A05;
    public final C56612sH A06;
    public final AnonymousClass33p A07;
    public final C54982pb A08;
    public final AnonymousClass33S A09;
    public final C55952rB A0A;
    public final C56452s0 A0B;
    public final Map A0C = AnonymousClass001.A0t();

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0077, code lost:
        if (A01(1, r2, r6) != false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0084, code lost:
        if (A01(2, r2, r6) != false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0091, code lost:
        if (A01(3, r2, r6) != false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x009e, code lost:
        if (A01(4, r2, r6) != false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ab, code lost:
        if (A01(5, r2, r6) != false) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00b8, code lost:
        if (A01(7, r2, r6) != false) goto L_0x00ba;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00fd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A00(X.AnonymousClass2TR r24, boolean r25, boolean r26, boolean r27) {
        /*
            r23 = this;
            r4 = r23
            monitor-enter(r4)
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0256 }
            java.lang.String r0 = "AccountSyncManager/fetchAllAccountInfo/fetch account info: "
            r3.append(r0)     // Catch:{ all -> 0x0256 }
            java.lang.String r0 = "AccountSyncRequest:"
            java.lang.StringBuilder r6 = X.C18330xA.A0A(r0)     // Catch:{ all -> 0x0256 }
            r13 = r24
            boolean r10 = r13.A06     // Catch:{ all -> 0x0256 }
            java.lang.String r2 = ""
            if (r10 == 0) goto L_0x0064
            java.lang.String r0 = "S"
        L_0x001c:
            r6.append(r0)     // Catch:{ all -> 0x0256 }
            boolean r12 = r13.A04     // Catch:{ all -> 0x0256 }
            if (r12 == 0) goto L_0x0062
            java.lang.String r0 = "Pi"
        L_0x0025:
            r6.append(r0)     // Catch:{ all -> 0x0256 }
            boolean r8 = r13.A05     // Catch:{ all -> 0x0256 }
            if (r8 == 0) goto L_0x0060
            java.lang.String r0 = "Pr"
        L_0x002e:
            r6.append(r0)     // Catch:{ all -> 0x0256 }
            boolean r11 = r13.A02     // Catch:{ all -> 0x0256 }
            if (r11 == 0) goto L_0x005e
            java.lang.String r0 = "D"
        L_0x0037:
            r6.append(r0)     // Catch:{ all -> 0x0256 }
            boolean r9 = r13.A01     // Catch:{ all -> 0x0256 }
            if (r9 == 0) goto L_0x005c
            java.lang.String r0 = "B"
        L_0x0040:
            r6.append(r0)     // Catch:{ all -> 0x0256 }
            boolean r1 = r13.A03     // Catch:{ all -> 0x0256 }
            if (r1 == 0) goto L_0x005a
            java.lang.String r0 = "N"
        L_0x0049:
            r6.append(r0)     // Catch:{ all -> 0x0256 }
            boolean r5 = r13.A07     // Catch:{ all -> 0x0256 }
            if (r5 == 0) goto L_0x0052
            java.lang.String r2 = "T"
        L_0x0052:
            java.lang.String r0 = X.AnonymousClass000.A0X(r2, r6)     // Catch:{ all -> 0x0256 }
            X.C18260x0.A1L(r3, r0)     // Catch:{ all -> 0x0256 }
            goto L_0x0066
        L_0x005a:
            r0 = r2
            goto L_0x0049
        L_0x005c:
            r0 = r2
            goto L_0x0040
        L_0x005e:
            r0 = r2
            goto L_0x0037
        L_0x0060:
            r0 = r2
            goto L_0x002e
        L_0x0062:
            r0 = r2
            goto L_0x0025
        L_0x0064:
            r0 = r2
            goto L_0x001c
        L_0x0066:
            X.2sH r0 = r4.A06     // Catch:{ all -> 0x0254 }
            long r2 = r0.A0H()     // Catch:{ all -> 0x0254 }
            r7 = 1
            r6 = r27
            if (r10 == 0) goto L_0x0079
            boolean r0 = r4.A01(r7, r2, r6)     // Catch:{ all -> 0x0254 }
            r22 = 1
            if (r0 == 0) goto L_0x007b
        L_0x0079:
            r22 = 0
        L_0x007b:
            r10 = 2
            if (r12 == 0) goto L_0x0086
            boolean r0 = r4.A01(r10, r2, r6)     // Catch:{ all -> 0x0254 }
            r21 = 1
            if (r0 == 0) goto L_0x0088
        L_0x0086:
            r21 = 0
        L_0x0088:
            r12 = 3
            if (r8 == 0) goto L_0x0093
            boolean r0 = r4.A01(r12, r2, r6)     // Catch:{ all -> 0x0254 }
            r20 = 1
            if (r0 == 0) goto L_0x0095
        L_0x0093:
            r20 = 0
        L_0x0095:
            r8 = 4
            if (r9 == 0) goto L_0x00a0
            boolean r0 = r4.A01(r8, r2, r6)     // Catch:{ all -> 0x0254 }
            r19 = 1
            if (r0 == 0) goto L_0x00a2
        L_0x00a0:
            r19 = 0
        L_0x00a2:
            r9 = 5
            if (r11 == 0) goto L_0x00ad
            boolean r0 = r4.A01(r9, r2, r6)     // Catch:{ all -> 0x0254 }
            r18 = 1
            if (r0 == 0) goto L_0x00af
        L_0x00ad:
            r18 = 0
        L_0x00af:
            r0 = 7
            if (r5 == 0) goto L_0x00ba
            boolean r0 = r4.A01(r0, r2, r6)     // Catch:{ all -> 0x0254 }
            r17 = 1
            if (r0 == 0) goto L_0x00bc
        L_0x00ba:
            r17 = 0
        L_0x00bc:
            if (r1 == 0) goto L_0x00dc
            r0 = 6
            java.util.Map r5 = r4.A0C     // Catch:{ all -> 0x0254 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0254 }
            boolean r0 = r5.containsKey(r1)     // Catch:{ all -> 0x0254 }
            if (r0 == 0) goto L_0x00df
            java.lang.Object r0 = r5.get(r1)     // Catch:{ all -> 0x0254 }
            long r0 = X.C18320x8.A05(r0)     // Catch:{ all -> 0x0254 }
            long r14 = r2 - r0
            r5 = 14400000(0xdbba00, double:7.1145453E-317)
            int r0 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x00df
        L_0x00dc:
            r16 = 0
            goto L_0x00e1
        L_0x00df:
            r16 = 1
        L_0x00e1:
            int r0 = r22 + r21
            int r0 = r0 + r20
            int r0 = r0 + r19
            int r0 = r0 + r18
            int r0 = r0 + r16
            int r0 = r0 + r17
            r1 = r25
            if (r0 != 0) goto L_0x00fd
            if (r25 == 0) goto L_0x0252
            X.33S r2 = r4.A09     // Catch:{ all -> 0x0254 }
            java.lang.String r1 = "account_sync"
            r0 = 0
            r2.A03(r1, r0)     // Catch:{ all -> 0x0254 }
            goto L_0x0252
        L_0x00fd:
            X.33p r11 = r4.A07     // Catch:{ all -> 0x0254 }
            r6 = 6
            r15 = 7
            X.2b6 r5 = new X.2b6     // Catch:{ all -> 0x0254 }
            r5.<init>(r11, r4, r0, r1)     // Catch:{ all -> 0x0254 }
            if (r26 == 0) goto L_0x01b1
            boolean r13 = r13.A00     // Catch:{ all -> 0x0254 }
            r14 = 0
            if (r22 == 0) goto L_0x012b
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r11)     // Catch:{ all -> 0x0254 }
            java.lang.String r1 = "account_sync_status_num_retries"
            int r0 = r0.getInt(r1, r14)     // Catch:{ all -> 0x0254 }
            if (r13 == 0) goto L_0x0123
            if (r0 <= r7) goto L_0x011e
            int r0 = r0 - r7
            if (r0 != 0) goto L_0x0124
        L_0x011e:
            android.content.SharedPreferences$Editor r0 = X.C18300x5.A09(r11, r1)     // Catch:{ all -> 0x0254 }
            goto L_0x0128
        L_0x0123:
            r0 = 3
        L_0x0124:
            android.content.SharedPreferences$Editor r0 = X.C18320x8.A08(r11, r1, r0)     // Catch:{ all -> 0x0254 }
        L_0x0128:
            r0.apply()     // Catch:{ all -> 0x0254 }
        L_0x012b:
            if (r21 == 0) goto L_0x014b
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r11)     // Catch:{ all -> 0x0254 }
            java.lang.String r1 = "account_sync_picture_num_retries"
            int r0 = r0.getInt(r1, r14)     // Catch:{ all -> 0x0254 }
            if (r13 == 0) goto L_0x0143
            if (r0 <= r7) goto L_0x013e
            int r0 = r0 - r7
            if (r0 != 0) goto L_0x0144
        L_0x013e:
            android.content.SharedPreferences$Editor r0 = X.C18300x5.A09(r11, r1)     // Catch:{ all -> 0x0254 }
            goto L_0x0148
        L_0x0143:
            r0 = 3
        L_0x0144:
            android.content.SharedPreferences$Editor r0 = X.C18320x8.A08(r11, r1, r0)     // Catch:{ all -> 0x0254 }
        L_0x0148:
            r0.apply()     // Catch:{ all -> 0x0254 }
        L_0x014b:
            if (r20 == 0) goto L_0x016b
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r11)     // Catch:{ all -> 0x0254 }
            java.lang.String r1 = "account_sync_privacy_num_retries"
            int r0 = r0.getInt(r1, r14)     // Catch:{ all -> 0x0254 }
            if (r13 == 0) goto L_0x0163
            if (r0 <= r7) goto L_0x015e
            int r0 = r0 - r7
            if (r0 != 0) goto L_0x0164
        L_0x015e:
            android.content.SharedPreferences$Editor r0 = X.C18300x5.A09(r11, r1)     // Catch:{ all -> 0x0254 }
            goto L_0x0168
        L_0x0163:
            r0 = 3
        L_0x0164:
            android.content.SharedPreferences$Editor r0 = X.C18320x8.A08(r11, r1, r0)     // Catch:{ all -> 0x0254 }
        L_0x0168:
            r0.apply()     // Catch:{ all -> 0x0254 }
        L_0x016b:
            if (r19 == 0) goto L_0x018b
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r11)     // Catch:{ all -> 0x0254 }
            java.lang.String r1 = "account_sync_blocklist_num_retries"
            int r0 = r0.getInt(r1, r14)     // Catch:{ all -> 0x0254 }
            if (r13 == 0) goto L_0x0183
            if (r0 <= r7) goto L_0x017e
            int r0 = r0 - r7
            if (r0 != 0) goto L_0x0184
        L_0x017e:
            android.content.SharedPreferences$Editor r0 = X.C18300x5.A09(r11, r1)     // Catch:{ all -> 0x0254 }
            goto L_0x0188
        L_0x0183:
            r0 = 3
        L_0x0184:
            android.content.SharedPreferences$Editor r0 = X.C18320x8.A08(r11, r1, r0)     // Catch:{ all -> 0x0254 }
        L_0x0188:
            r0.apply()     // Catch:{ all -> 0x0254 }
        L_0x018b:
            if (r17 == 0) goto L_0x01b1
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r11)     // Catch:{ all -> 0x0254 }
            java.lang.String r1 = "account_sync_text_status_num_retries"
            int r0 = r0.getInt(r1, r14)     // Catch:{ all -> 0x0254 }
            if (r13 == 0) goto L_0x01a5
            if (r0 <= r7) goto L_0x01a0
            int r0 = r0 + -1
            if (r0 == 0) goto L_0x01a0
            goto L_0x01aa
        L_0x01a0:
            android.content.SharedPreferences$Editor r0 = X.C18300x5.A09(r11, r1)     // Catch:{ all -> 0x0254 }
            goto L_0x01ae
        L_0x01a5:
            android.content.SharedPreferences$Editor r0 = X.C18320x8.A08(r11, r1, r12)     // Catch:{ all -> 0x0254 }
            goto L_0x01ae
        L_0x01aa:
            android.content.SharedPreferences$Editor r0 = X.C18320x8.A08(r11, r1, r0)     // Catch:{ all -> 0x0254 }
        L_0x01ae:
            r0.apply()     // Catch:{ all -> 0x0254 }
        L_0x01b1:
            if (r22 == 0) goto L_0x01c6
            java.util.Map r1 = r4.A0C     // Catch:{ all -> 0x0254 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0254 }
            X.AnonymousClass0x2.A1K(r0, r1, r2)     // Catch:{ all -> 0x0254 }
            X.2o5 r1 = r4.A02     // Catch:{ all -> 0x0254 }
            X.3Tt r0 = new X.3Tt     // Catch:{ all -> 0x0254 }
            r0.<init>(r5, r4)     // Catch:{ all -> 0x0254 }
            r1.A01(r0)     // Catch:{ all -> 0x0254 }
        L_0x01c6:
            if (r17 == 0) goto L_0x01d6
            java.util.Map r1 = r4.A0C     // Catch:{ all -> 0x0254 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x0254 }
            X.AnonymousClass0x2.A1K(r0, r1, r2)     // Catch:{ all -> 0x0254 }
            X.2pb r0 = r4.A08     // Catch:{ all -> 0x0254 }
            r0.A03(r5)     // Catch:{ all -> 0x0254 }
        L_0x01d6:
            if (r21 == 0) goto L_0x01ed
            java.util.Map r1 = r4.A0C     // Catch:{ all -> 0x0254 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0254 }
            X.AnonymousClass0x2.A1K(r0, r1, r2)     // Catch:{ all -> 0x0254 }
            X.2s0 r11 = r4.A0B     // Catch:{ all -> 0x0254 }
            X.2sr r0 = r4.A01     // Catch:{ all -> 0x0254 }
            com.whatsapp.jid.PhoneUserJid r1 = X.C56972sr.A04(r0)     // Catch:{ all -> 0x0254 }
            r0 = 0
            r11.A03(r1, r5, r0, r7)     // Catch:{ all -> 0x0254 }
        L_0x01ed:
            if (r20 == 0) goto L_0x01fd
            java.util.Map r1 = r4.A0C     // Catch:{ all -> 0x0254 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0254 }
            X.AnonymousClass0x2.A1K(r0, r1, r2)     // Catch:{ all -> 0x0254 }
            X.2r7 r0 = r4.A03     // Catch:{ all -> 0x0254 }
            r0.A02(r5)     // Catch:{ all -> 0x0254 }
        L_0x01fd:
            if (r19 == 0) goto L_0x020d
            java.util.Map r1 = r4.A0C     // Catch:{ all -> 0x0254 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0254 }
            X.AnonymousClass0x2.A1K(r0, r1, r2)     // Catch:{ all -> 0x0254 }
            X.2sq r0 = r4.A04     // Catch:{ all -> 0x0254 }
            r0.A0K(r5)     // Catch:{ all -> 0x0254 }
        L_0x020d:
            if (r18 == 0) goto L_0x022b
            java.util.Map r1 = r4.A0C     // Catch:{ all -> 0x0254 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0254 }
            X.AnonymousClass0x2.A1K(r0, r1, r2)     // Catch:{ all -> 0x0254 }
            X.3Cp r8 = r4.A05     // Catch:{ all -> 0x0254 }
            com.whatsapp.jid.UserJid[] r7 = new com.whatsapp.jid.UserJid[r7]     // Catch:{ all -> 0x0254 }
            X.2sr r0 = r4.A01     // Catch:{ all -> 0x0254 }
            com.whatsapp.jid.PhoneUserJid r1 = X.C56972sr.A04(r0)     // Catch:{ all -> 0x0254 }
            r0 = 0
            r7[r0] = r1     // Catch:{ all -> 0x0254 }
            r8.A01(r7, r10)     // Catch:{ all -> 0x0254 }
            r5.A00(r9)     // Catch:{ all -> 0x0254 }
        L_0x022b:
            if (r16 == 0) goto L_0x0252
            java.util.Map r1 = r4.A0C     // Catch:{ all -> 0x0254 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0254 }
            X.AnonymousClass0x2.A1K(r0, r1, r2)     // Catch:{ all -> 0x0254 }
            X.2rB r3 = r4.A0A     // Catch:{ all -> 0x0254 }
            X.1VX r2 = r3.A03     // Catch:{ all -> 0x0254 }
            r1 = 4779(0x12ab, float:6.697E-42)
            X.2vE r0 = X.C58422vE.A02     // Catch:{ all -> 0x0254 }
            boolean r0 = r2.A0Y(r0, r1)     // Catch:{ all -> 0x0254 }
            if (r0 == 0) goto L_0x024f
            X.4FS r1 = r3.A09     // Catch:{ all -> 0x0254 }
            r0 = 30
            X.3bp r0 = X.C71263bp.A00(r3, r0)     // Catch:{ all -> 0x0254 }
            r1.BkM(r0)     // Catch:{ all -> 0x0254 }
        L_0x024f:
            r5.A00(r6)     // Catch:{ all -> 0x0254 }
        L_0x0252:
            monitor-exit(r4)
            return
        L_0x0254:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0256 }
        L_0x0256:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50532iK.A00(X.2TR, boolean, boolean, boolean):void");
    }

    public final boolean A01(int i, long j, boolean z) {
        if (z) {
            Map map = this.A0C;
            Integer valueOf = Integer.valueOf(i);
            if (!map.containsKey(valueOf) || j - C18290x4.A0C(valueOf, map) > 60000) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C50532iK(C69263Wi r2, C56972sr r3, C54042o5 r4, C55912r7 r5, C56962sq r6, C64213Cp r7, C56612sH r8, AnonymousClass33p r9, C54982pb r10, AnonymousClass33S r11, C55952rB r12, C56452s0 r13) {
        this.A06 = r8;
        this.A00 = r2;
        this.A02 = r4;
        this.A01 = r3;
        this.A09 = r11;
        this.A08 = r10;
        this.A04 = r6;
        this.A05 = r7;
        this.A0B = r13;
        this.A07 = r9;
        this.A03 = r5;
        this.A0A = r12;
    }
}
