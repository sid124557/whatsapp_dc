package X;

import android.database.Cursor;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3bj  reason: invalid class name and case insensitive filesystem */
public class C71203bj implements Runnable {
    public long A00 = 0;
    public final int A01;
    public final C55682qk A02;
    public final C56612sH A03;
    public final C56922sm A04;
    public final C66543Lv A05;
    public final AnonymousClass313 A06;
    public final C49482gb A07;
    public final C40422Ft A08;
    public final C50012hU A09;
    public final C40432Fu A0A;
    public final C55332qB A0B;
    public final C55292q7 A0C;
    public final C620333f A0D;
    public final C66443Ll A0E;
    public final AnonymousClass1VX A0F;
    public final C55832qz A0G;

    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0253, code lost:
        if (r9 == null) goto L_0x0255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x028a, code lost:
        if (r6 != null) goto L_0x028c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x025a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r18 = this;
            java.lang.String r0 = "EphemeralUpdateRunnable/run"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.33M r17 = X.AnonymousClass33M.A01(r0)
            r4 = r18
            X.2sH r5 = r4.A03
            long r2 = r5.A0H()
            r0 = 0
            int r8 = r4.A00(r0, r2)
            r0 = 2
            int r7 = r4.A00(r0, r2)
            r0 = 3
            int r6 = r4.A00(r0, r2)
            r0 = 4
            int r1 = r4.A00(r0, r2)
            r12 = 0
            r0 = 1
            if (r8 == r0) goto L_0x0243
            if (r6 == r0) goto L_0x0243
            if (r7 == r0) goto L_0x0243
            if (r1 == r0) goto L_0x0243
            if (r8 != 0) goto L_0x0255
            if (r6 != 0) goto L_0x0255
            if (r7 != 0) goto L_0x0255
            if (r1 != 0) goto L_0x0255
            long r6 = r4.A00
            int r0 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x004d
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = java.lang.System.nanoTime()
            long r0 = r0 - r6
            long r6 = r8.toDays(r0)
            int r0 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x015b
        L_0x004d:
            r9 = 100
            java.lang.String r0 = "EphemeralUpdateRunnable/deleteSharedSecrets"
            X.33M r16 = X.AnonymousClass33M.A01(r0)
        L_0x0055:
            java.util.HashSet r10 = X.AnonymousClass002.A0K()
            X.2Fu r8 = r4.A0A
            java.util.HashSet r7 = X.AnonymousClass002.A0K()
            r1 = 1
            X.3dV r0 = r8.A00     // Catch:{ Exception -> 0x00aa }
            X.4GK r15 = r0.get()     // Catch:{ Exception -> 0x00aa }
            r0 = r15
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x00a0 }
            X.2sg r14 = r0.A03     // Catch:{ all -> 0x00a0 }
            java.lang.String r11 = "SELECT message_row_id FROM message_broadcast_ephemeral ORDER BY message_row_id LIMIT ?"
            java.lang.String[] r6 = new java.lang.String[r1]     // Catch:{ all -> 0x00a0 }
            java.lang.String r1 = java.lang.Integer.toString(r9)     // Catch:{ all -> 0x00a0 }
            r0 = 0
            r6[r0] = r1     // Catch:{ all -> 0x00a0 }
            java.lang.String r0 = "GET_ALL_MESSAGE_ROW_ID"
            android.database.Cursor r6 = r14.A0E(r11, r0, r6)     // Catch:{ all -> 0x00a0 }
            java.lang.String r0 = "message_row_id"
            int r1 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0094 }
        L_0x0083:
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x0094 }
            if (r0 == 0) goto L_0x008d
            X.C18260x0.A0H(r6, r7, r1)     // Catch:{ all -> 0x0094 }
            goto L_0x0083
        L_0x008d:
            r6.close()     // Catch:{ all -> 0x00a0 }
            r15.close()     // Catch:{ Exception -> 0x00aa }
            goto L_0x00b8
        L_0x0094:
            r1 = move-exception
            if (r6 == 0) goto L_0x009f
            r6.close()     // Catch:{ all -> 0x009b }
            goto L_0x009f
        L_0x009b:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00a0 }
        L_0x009f:
            throw r1     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x00a5 }
            goto L_0x00a9
        L_0x00a5:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x00aa }
        L_0x00a9:
            throw r1     // Catch:{ Exception -> 0x00aa }
        L_0x00aa:
            r6 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unable to get message_row_id from message_broadcast_ephemeral batchSize="
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r9)
            com.whatsapp.util.Log.e(r0, r6)
        L_0x00b8:
            java.util.Iterator r15 = r7.iterator()
        L_0x00bc:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0108
            java.lang.Object r11 = r15.next()
            java.lang.Number r11 = (java.lang.Number) r11
            X.2qB r6 = r4.A0B
            long r0 = r11.longValue()
            X.1R3 r7 = r6.A01
            r6 = 0
            X.2Fv r0 = r7.A06(r6, r0)
            java.util.concurrent.ConcurrentHashMap r0 = r0.A00
            java.util.Iterator r14 = X.AnonymousClass001.A0u(r0)
        L_0x00db:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0104
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r14)
            com.whatsapp.jid.DeviceJid r6 = X.AnonymousClass0x9.A0Q(r0)
            java.lang.Object r1 = r0.getValue()
            X.2Vz r1 = (X.C44422Vz) r1
            X.2sr r0 = r7.A00
            boolean r0 = X.C56972sr.A09(r0, r6)
            if (r0 == 0) goto L_0x00db
            boolean r0 = X.AnonymousClass0x9.A1P(r6)
            if (r0 == 0) goto L_0x00db
            long r0 = r1.A00
            int r6 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r6 <= 0) goto L_0x00bc
            goto L_0x00db
        L_0x0104:
            X.C18320x8.A1I(r11, r10)
            goto L_0x00bc
        L_0x0108:
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x0152
            X.3dV r0 = r8.A00     // Catch:{ Exception -> 0x0149 }
            X.4Fq r11 = r0.A04()     // Catch:{ Exception -> 0x0149 }
            r0 = r11
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x013f }
            X.2sg r8 = r0.A03     // Catch:{ all -> 0x013f }
            java.lang.String r7 = "message_broadcast_ephemeral"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x013f }
            java.lang.String r0 = "message_row_id IN "
            r1.append(r0)     // Catch:{ all -> 0x013f }
            int r0 = r10.size()     // Catch:{ all -> 0x013f }
            java.lang.String r0 = X.C57212tH.A00(r0)     // Catch:{ all -> 0x013f }
            java.lang.String r6 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x013f }
            java.lang.String[] r1 = X.C18280x3.A1b(r10)     // Catch:{ all -> 0x013f }
            java.lang.String r0 = "deleteSharedSecretByMessageRowIds"
            int r0 = r8.A07(r7, r6, r0, r1)     // Catch:{ all -> 0x013f }
            r11.close()     // Catch:{ Exception -> 0x0149 }
            goto L_0x0150
        L_0x013f:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x0144 }
            goto L_0x0148
        L_0x0144:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x0149 }
        L_0x0148:
            throw r1     // Catch:{ Exception -> 0x0149 }
        L_0x0149:
            r1 = move-exception
            java.lang.String r0 = "Unable to delete shared secrets"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0152
        L_0x0150:
            if (r0 == r9) goto L_0x0055
        L_0x0152:
            r16.A07()
            long r0 = java.lang.System.nanoTime()
            r4.A00 = r0
        L_0x015b:
            X.313 r0 = r4.A06
            X.3dV r0 = r0.A04
            X.4GK r11 = r0.get()
            r0 = r11
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0239 }
            X.2sg r7 = r0.A03     // Catch:{ all -> 0x0239 }
            java.lang.String r6 = "SELECT expire_timestamp FROM message_ephemeral WHERE expire_timestamp >= ? AND keep_in_chat != 1 ORDER BY expire_timestamp LIMIT 1"
            java.lang.String[] r1 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x0239 }
            java.lang.String r10 = java.lang.Long.toString(r2)     // Catch:{ all -> 0x0239 }
            r0 = 0
            r1[r0] = r10     // Catch:{ all -> 0x0239 }
            java.lang.String r8 = "GET_EPHEMERAL_NEXT_EXPIRE_TIMESTAMP_SQL"
            android.database.Cursor r6 = r7.A0E(r6, r8, r1)     // Catch:{ all -> 0x0239 }
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x022d }
            if (r0 == 0) goto L_0x018f
            java.lang.String r0 = "expire_timestamp"
            long r0 = X.AnonymousClass0x2.A0C(r6, r0)     // Catch:{ all -> 0x022d }
            java.lang.Long r9 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x022d }
            r6.close()     // Catch:{ all -> 0x0239 }
            goto L_0x0197
        L_0x018f:
            r6.close()     // Catch:{ all -> 0x0239 }
            r11.close()
            r9 = 0
            goto L_0x019a
        L_0x0197:
            r11.close()
        L_0x019a:
            X.2q7 r7 = r4.A0C
            r0 = 1209600000(0x48190800, double:5.97621805E-315)
            long r2 = r2 - r0
            X.3dV r0 = r7.A01
            X.4GK r11 = r0.get()
            r0 = r11
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0239 }
            X.2sg r6 = r0.A03     // Catch:{ all -> 0x0239 }
            X.1VX r0 = r7.A02     // Catch:{ all -> 0x0239 }
            boolean r0 = X.C56952sp.A0H(r0)     // Catch:{ all -> 0x0239 }
            if (r0 == 0) goto L_0x01c1
            java.lang.String r1 = "SELECT message_view.timestamp AS timestamp FROM message_view_once_media view_once  JOIN available_message_view message_view  WHERE view_once.message_row_id=message_view._id AND message_view.timestamp > ?  AND view_once.state = 0 ORDER BY message_view.timestamp ASC  LIMIT 1"
        L_0x01b5:
            java.lang.String[] r0 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x0239 }
            X.C18260x0.A1Y(r0, r2)     // Catch:{ all -> 0x0239 }
            android.database.Cursor r6 = r6.A0E(r1, r8, r0)     // Catch:{ all -> 0x0239 }
            goto L_0x01c4
        L_0x01c1:
            java.lang.String r1 = "SELECT message_view.timestamp AS timestamp FROM message_view_once_media view_once  JOIN available_message_view message_view  ON view_once.message_row_id=message_view._id WHERE message_view.timestamp > ?  AND view_once.state = 0 ORDER BY message_view.timestamp ASC  LIMIT 1"
            goto L_0x01b5
        L_0x01c4:
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x022d }
            if (r0 == 0) goto L_0x01dc
            java.lang.String r0 = "timestamp"
            long r2 = X.AnonymousClass0x2.A0C(r6, r0)     // Catch:{ all -> 0x022d }
            r0 = 1209600000(0x48190800, double:5.97621805E-315)
            java.lang.Long r8 = X.AnonymousClass0x9.A0n(r2, r0)     // Catch:{ all -> 0x022d }
            r6.close()     // Catch:{ all -> 0x0239 }
            goto L_0x01e4
        L_0x01dc:
            r6.close()     // Catch:{ all -> 0x0239 }
            r11.close()
            r8 = 0
            goto L_0x01e7
        L_0x01e4:
            r11.close()
        L_0x01e7:
            X.3Ll r0 = r4.A0E
            X.3dV r0 = r0.A03
            X.4GK r7 = r0.get()
            r0 = r7
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0228 }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x0228 }
            java.lang.String r2 = "SELECT expiry_timestamp FROM message_add_on WHERE expiry_timestamp > ? ORDER BY expiry_timestamp LIMIT 1"
            java.lang.String[] r1 = X.C18270x1.A1b(r10)     // Catch:{ all -> 0x0228 }
            java.lang.String r0 = "GET_MESSAGE_ADD_ON_NEXT_EXPIRE_TIMESTAMP_SQL"
            android.database.Cursor r2 = r3.A0E(r2, r0, r1)     // Catch:{ all -> 0x0228 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x021c }
            if (r0 == 0) goto L_0x0214
            java.lang.String r0 = "expiry_timestamp"
            long r0 = X.AnonymousClass0x2.A0C(r2, r0)     // Catch:{ all -> 0x021c }
            java.lang.Long r6 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x021c }
            r2.close()     // Catch:{ all -> 0x0228 }
            goto L_0x0248
        L_0x0214:
            r2.close()     // Catch:{ all -> 0x0228 }
            r7.close()
            r6 = 0
            goto L_0x024b
        L_0x021c:
            r1 = move-exception
            if (r2 == 0) goto L_0x0227
            r2.close()     // Catch:{ all -> 0x0223 }
            goto L_0x0227
        L_0x0223:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0228 }
        L_0x0227:
            throw r1     // Catch:{ all -> 0x0228 }
        L_0x0228:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x023e }
            throw r1
        L_0x022d:
            r1 = move-exception
            if (r6 == 0) goto L_0x0238
            r6.close()     // Catch:{ all -> 0x0234 }
            goto L_0x0238
        L_0x0234:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0239 }
        L_0x0238:
            throw r1     // Catch:{ all -> 0x0239 }
        L_0x0239:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x023e }
            throw r1
        L_0x023e:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0243:
            java.lang.Long r5 = java.lang.Long.valueOf(r12)
            goto L_0x0256
        L_0x0248:
            r7.close()
        L_0x024b:
            if (r9 != 0) goto L_0x029e
            r9 = r8
            if (r8 != 0) goto L_0x0251
            r9 = 0
        L_0x0251:
            if (r6 != 0) goto L_0x0277
            if (r9 != 0) goto L_0x028c
        L_0x0255:
            r5 = 0
        L_0x0256:
            X.2Ft r2 = r4.A08
            if (r2 == 0) goto L_0x0273
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "EphemeralUpdateRunnable/timeToNextRun: "
            X.C18260x0.A1R(r1, r0, r5)
            X.2pj r3 = r2.A00
            if (r5 == 0) goto L_0x0273
            java.util.concurrent.ScheduledThreadPoolExecutor r2 = r3.A0A
            r1 = 35
            X.3Zw r0 = new X.3Zw
            r0.<init>(r3, r1, r5)
            r2.execute(r0)
        L_0x0273:
            r17.A07()
            return
        L_0x0277:
            if (r9 == 0) goto L_0x0289
            long r2 = r6.longValue()
            long r0 = r9.longValue()
            long r0 = java.lang.Math.min(r2, r0)
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
        L_0x0289:
            r9 = r6
            if (r6 == 0) goto L_0x0255
        L_0x028c:
            long r2 = r9.longValue()
            long r0 = r5.A0H()
            long r2 = r2 - r0
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x0243
            java.lang.Long r5 = java.lang.Long.valueOf(r2)
            goto L_0x0256
        L_0x029e:
            if (r8 == 0) goto L_0x0251
            long r2 = r9.longValue()
            long r0 = r8.longValue()
            long r0 = java.lang.Math.min(r2, r0)
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
            goto L_0x0251
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71203bj.run():void");
    }

    public C71203bj(C55682qk r3, C56612sH r4, C56922sm r5, C66543Lv r6, AnonymousClass313 r7, C49482gb r8, C40422Ft r9, C50012hU r10, C40432Fu r11, C55332qB r12, C55292q7 r13, C620333f r14, C66443Ll r15, AnonymousClass1VX r16, C55832qz r17, int i) {
        this.A03 = r4;
        this.A0F = r16;
        this.A04 = r5;
        this.A02 = r3;
        this.A09 = r10;
        this.A05 = r6;
        this.A0G = r17;
        this.A0E = r15;
        this.A0D = r14;
        this.A0B = r12;
        this.A0C = r13;
        this.A06 = r7;
        this.A07 = r8;
        this.A0A = r11;
        this.A08 = r9;
        this.A01 = i;
    }

    public int A00(int i, long j) {
        Throwable th;
        AnonymousClass4GK r11;
        Cursor cursor;
        Throwable th2;
        C85284Fq r16;
        Throwable th3;
        C85284Fq r162;
        Cursor A0E2;
        int i2;
        String str;
        String str2;
        String str3;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("EphemeralUpdateRunnable/processMessages type: ");
        int i3 = i;
        A0o.append(i3);
        long j2 = j;
        C18260x0.A12(" time: ", A0o, j2);
        int i4 = this.A01;
        if (i == 0) {
            AnonymousClass313 r2 = this.A06;
            C18260x0.A10("EphemeralMessageStore/getExpiredEphemeralMessages/expirationTime: ", AnonymousClass001.A0o(), j2);
            r11 = r2.A04.get();
            C56862sg r5 = ((AnonymousClass3H0) r11).A03;
            if (C56952sp.A0H(r2.A0A)) {
                str = C39352Bq.A01;
            } else {
                str = C39352Bq.A00;
            }
            String[] A1Z = AnonymousClass0x9.A1Z();
            C18260x0.A1Y(A1Z, j2);
            C18270x1.A1P(A1Z, i4);
            cursor = r5.A0E(str, "GET_EXPIRED_EPHEMERAL_MESSAGES_SQL", A1Z);
        } else if (i3 == 2) {
            C55292q7 r9 = this.A0C;
            Log.d("ViewOnceMessageStore/getExpiredViewOnceMessages");
            long j3 = j - 1209600000;
            r11 = r9.A01.get();
            C56862sg r6 = ((AnonymousClass3H0) r11).A03;
            if (C56952sp.A0H(r9.A02)) {
                str2 = AnonymousClass2CA.A01;
            } else {
                str2 = AnonymousClass2CA.A00;
            }
            String[] A1Z2 = AnonymousClass0x9.A1Z();
            C18260x0.A1X(A1Z2, j3);
            C18270x1.A1P(A1Z2, i4);
            cursor = r6.A0E(str2, "GET_EXPIRED_VIEW_ONCE_MESSAGES_SQL", A1Z2);
        } else if (i3 == 3) {
            C55292q7 r1 = this.A0C;
            Log.d("ViewOnceMessageStore/getViewOnceMessagesToDelete");
            r11 = r1.A01.get();
            C56862sg r52 = ((AnonymousClass3H0) r11).A03;
            if (C56952sp.A0H(r1.A02)) {
                str3 = AnonymousClass2CA.A05;
            } else {
                str3 = AnonymousClass2CA.A04;
            }
            String[] A1Y = AnonymousClass0x9.A1Y();
            C18270x1.A1O(A1Y, i4);
            cursor = r52.A0E(str3, "GET_EXPIRED_VIEW_ONCE_MESSAGES_SQL", A1Y);
        } else if (i3 == 4) {
            C66443Ll r22 = this.A0E;
            C18260x0.A10("MessageAddOnStore/getExpiredMessageAddonsParentKey/expirationTime: ", AnonymousClass001.A0o(), j2);
            r11 = r22.A03.get();
            try {
                C56862sg r53 = ((AnonymousClass3H0) r11).A03;
                String str4 = C625035h.A06;
                String[] A1Z3 = AnonymousClass0x9.A1Z();
                C18260x0.A1Y(A1Z3, j2);
                C18270x1.A1P(A1Z3, i4);
                cursor = r53.A0E(str4, "GET_EXPIRED_MESSAGE_ADDON_PARENT_KEY_SQL", A1Z3);
            } catch (Throwable th4) {
                th.addSuppressed(th4);
                throw th;
            }
        } else {
            throw AnonymousClass001.A0c("Invalid job type");
        }
        r11.close();
        ArrayList A0s = AnonymousClass001.A0s();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (cursor.moveToNext()) {
            C95814uZ A0B2 = this.A04.A0B(AnonymousClass0x2.A0C(cursor, "chat_row_id"));
            if (A0B2 == null) {
                i5++;
            } else {
                Map map = this.A07.A03;
                if (map.get(A0B2) == null && map.get((Object) null) == null) {
                    i6++;
                    C624134x A042 = this.A0G.A04(cursor, A0B2);
                    if (A042 != null) {
                        A0s.add(A042);
                    } else {
                        Log.e("EphemeralUpdateRunnable/failed to get message");
                    }
                } else {
                    i7 = 2;
                }
            }
        }
        if (i5 > 0) {
            this.A02.A0A("EphemeralUpdateRunnable/processMessages/null_jid", false, AnonymousClass000.A0Y("count: ", AnonymousClass001.A0o(), i5));
        }
        if (!A0s.isEmpty()) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("EphemeralUpdateRunnable/performJobAction: jobType:");
            A0o2.append(i3);
            C18260x0.A1B(" num:", A0o2, A0s);
            if (i == 0) {
                this.A05.A0l(A0s, 29);
            } else if (i3 != 1) {
                if (i3 == 2) {
                    C55292q7 r10 = this.A0C;
                    StringBuilder A0o3 = AnonymousClass001.A0o();
                    C18260x0.A19("ViewOnceMessageStore/expireMessages/", A0o3, A0s);
                    AnonymousClass33M A012 = AnonymousClass33M.A01(AnonymousClass000.A0X("/", A0o3));
                    C85284Fq A043 = r10.A01.A04();
                    r16 = A043;
                    C69833Yo Axl = A043.Axl();
                    try {
                        Iterator it = A0s.iterator();
                        int i8 = 0;
                        while (it.hasNext()) {
                            C624134x A0T = C18300x5.A0T(it);
                            i8++;
                            if (A0T instanceof AnonymousClass4DU) {
                                C624134x r112 = (C624134x) ((AnonymousClass4DU) A0T);
                                AnonymousClass4DU r3 = (AnonymousClass4DU) r112;
                                r3.Bno(2);
                                r10.A01(r112.A1L, r3.BEM());
                            } else {
                                r10.A01(A0T.A1L, 2);
                                C18260x0.A1R(AnonymousClass001.A0o(), "ViewOnceMessageStore/expireMessages/updating state of non view-once message: ", A0T);
                            }
                        }
                        Axl.A00();
                        A012.A08("success");
                        r16 = A043;
                        Axl.close();
                        r16 = A043;
                        A043.close();
                        A012.A07();
                        StringBuilder A0o4 = AnonymousClass001.A0o();
                        A0o4.append("ViewOnceMessageStore/expireMessages numExpired:");
                        A0o4.append(i8);
                        C18260x0.A1B(" numTotal:", A0o4, A0s);
                        this.A05.A0m(A0s);
                        Iterator it2 = A0s.iterator();
                        while (it2.hasNext()) {
                            this.A09.A00(C18300x5.A0T(it2), -1);
                        }
                    } catch (Throwable th5) {
                        th3 = th5;
                        r162 = A043;
                        Axl.close();
                        r162 = A043;
                        throw th3;
                    }
                } else if (i3 != 3) {
                    C620333f r102 = this.A0D;
                    if (!A0s.isEmpty()) {
                        ArrayList A0s2 = AnonymousClass001.A0s();
                        int i9 = 0;
                        while (i9 < A0s.size()) {
                            int i10 = i9 + 100;
                            A0s2.add(A0s.subList(i9, Math.min(i10, A0s.size())));
                            i9 = i10;
                        }
                        Iterator it3 = A0s2.iterator();
                        while (it3.hasNext()) {
                            HashMap A0t = AnonymousClass001.A0t();
                            Iterator it4 = ((List) it3.next()).iterator();
                            while (it4.hasNext()) {
                                C624134x A0T2 = C18300x5.A0T(it4);
                                A0t.put(C624134x.A0A(A0T2), A0T2);
                            }
                            C66443Ll r15 = r102.A0P;
                            Set<Object> keySet = A0t.keySet();
                            HashMap A0t2 = AnonymousClass001.A0t();
                            String[] strArr = new String[(keySet.size() + 1)];
                            int i11 = 0;
                            for (Object A052 : keySet) {
                                AnonymousClass0x2.A1S(strArr, i11, C18320x8.A05(A052));
                                i11++;
                            }
                            AnonymousClass0x2.A1S(strArr, i11, j2);
                            AnonymousClass4GK A032 = r15.A03.get();
                            AnonymousClass4GK r0 = A032;
                            try {
                                r16 = A032;
                                C56862sg r13 = ((AnonymousClass3H0) r0).A03;
                                int size = keySet.size();
                                StringBuilder A0o5 = AnonymousClass001.A0o();
                                C57212tH.A02(" WHERE parent_message_row_id IN ", A0o5, size);
                                A0o5.append(" AND ");
                                String A0X = AnonymousClass000.A0X("(message_add_on.expiry_timestamp > ? OR IFNULL(message_add_on.expiry_timestamp,0) = 0)", A0o5);
                                StringBuilder A0o6 = AnonymousClass001.A0o();
                                A0o6.append("SELECT parent_message_row_id, message_add_on_type,  COUNT(1) as 'count' FROM message_add_on");
                                A0o6.append(A0X);
                                A0E2 = r13.A0E(AnonymousClass000.A0X(" GROUP BY parent_message_row_id, message_add_on_type HAVING count>0", A0o6), "GET_MESSAGE_ADDON_TYPES_PER_PARENT_MESSAGE", strArr);
                            } catch (Throwable th6) {
                                th2 = th6;
                                r16.close();
                                throw th2;
                            }
                            try {
                                int columnIndexOrThrow = A0E2.getColumnIndexOrThrow("parent_message_row_id");
                                int columnIndexOrThrow2 = A0E2.getColumnIndexOrThrow("message_add_on_type");
                                while (A0E2.moveToNext()) {
                                    Long A0T3 = C18280x3.A0T(A0E2, columnIndexOrThrow);
                                    byte b = (byte) A0E2.getInt(columnIndexOrThrow2);
                                    C73323fJ r02 = new C73323fJ();
                                    Byte valueOf = Byte.valueOf(b);
                                    if (r02.containsKey(valueOf)) {
                                        int A053 = AnonymousClass0x7.A05(new C73323fJ().get(valueOf));
                                        if (A0t2.containsKey(A0T3)) {
                                            A053 |= AnonymousClass0x7.A05(A0t2.get(A0T3));
                                        }
                                        AnonymousClass0x2.A1I(A0T3, A0t2, A053);
                                    }
                                }
                                r16 = A032;
                                A0E2.close();
                                r16 = A032;
                                A032.close();
                                Iterator A0u = AnonymousClass001.A0u(A0t);
                                while (A0u.hasNext()) {
                                    Map.Entry A0w = AnonymousClass001.A0w(A0u);
                                    Object key = A0w.getKey();
                                    C624134x r12 = (C624134x) A0w.getValue();
                                    int i12 = r12.A08;
                                    if (A0t2.containsKey(key)) {
                                        i2 = AnonymousClass0x7.A05(A0t2.get(key));
                                    } else {
                                        i2 = 0;
                                    }
                                    int i13 = ~i2;
                                    int i14 = (~i13) & r12.A08;
                                    r12.A08 = i14;
                                    if (i12 != i14) {
                                        r102.A09.A0X(r12);
                                    }
                                }
                            } catch (Throwable th7) {
                                r16 = r162;
                                th3.addSuppressed(th7);
                            }
                        }
                    }
                    try {
                        C66443Ll r132 = this.A0E;
                        if (!A0s.isEmpty()) {
                            ArrayList A0s3 = AnonymousClass001.A0s();
                            int i15 = 0;
                            while (i15 < A0s.size()) {
                                int i16 = i15 + 100;
                                A0s3.add(A0s.subList(i15, Math.min(i16, A0s.size())));
                                i15 = i16;
                            }
                            Iterator it5 = A0s3.iterator();
                            while (it5.hasNext()) {
                                List list = (List) it5.next();
                                C85284Fq A044 = r132.A03.A04();
                                try {
                                    int i17 = 1;
                                    String[] strArr2 = new String[(list.size() + 1)];
                                    AnonymousClass0x2.A1S(strArr2, 0, j2);
                                    Iterator it6 = list.iterator();
                                    while (it6.hasNext()) {
                                        C624134x.A0Y(C18300x5.A0T(it6), strArr2, i17);
                                        i17++;
                                    }
                                    StringBuilder A0o7 = AnonymousClass001.A0o();
                                    A0o7.append("message_add_on.expiry_timestamp <= ? AND message_add_on.expiry_timestamp != 0 AND message_add_on.expiry_timestamp is not null AND parent_message_row_id IN ");
                                    ((AnonymousClass3H0) A044).A03.A07("message_add_on", AnonymousClass000.A0X(C57212tH.A00(list.size()), A0o7), "MessageAddOnStore/deleteExpiredMessageAddOn", strArr2);
                                    A044.close();
                                } catch (Throwable th8) {
                                    th2.addSuppressed(th8);
                                }
                            }
                        }
                        C66543Lv r8 = this.A05;
                        HashSet A0K = AnonymousClass002.A0K();
                        Iterator it7 = A0s.iterator();
                        while (it7.hasNext()) {
                            AnonymousClass2z0 r14 = C18300x5.A0T(it7).A1J;
                            A0K.add(r14.A00);
                            r8.A0y.A03(r14);
                        }
                        C70093Zw.A00(r8.A0q.A01, r8, A0K, 25);
                    } catch (Throwable th9) {
                        th = th9;
                        if (cursor != null) {
                            cursor.close();
                            throw th;
                        }
                        throw th;
                    }
                } else {
                    this.A05.A0m(A0s);
                }
            }
        }
        if (i6 == i4) {
            i7 = 1;
        }
        cursor.close();
        return i7;
    }
}
