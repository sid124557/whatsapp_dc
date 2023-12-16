package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.util.Random;
import java.util.concurrent.ExecutionException;

/* renamed from: X.1I1  reason: invalid class name */
public class AnonymousClass1I1 extends C105185Tx {
    public final C56972sr A00;
    public final AnonymousClass36E A01;
    public final C49712gy A02;
    public final C64773Ex A03;
    public final C50862it A04;
    public final C620633i A05;
    public final C56612sH A06;
    public final AnonymousClass33p A07;
    public final C621133n A08;
    public final C48972fm A09;
    public final C614730x A0A;
    public final C56892sj A0B;
    public final AnonymousClass4FS A0C;
    public final Random A0D;

    public boolean A04(Intent intent) {
        return C18280x3.A1V(intent, "com.whatsapp.action.ROTATE_SIGNED_PREKEY");
    }

    /* JADX WARNING: Removed duplicated region for block: B:148:0x03b8  */
    /* JADX WARNING: Removed duplicated region for block: B:196:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05() {
        /*
            r34 = this;
            r2 = r34
            X.30x r0 = r2.A0A
            X.3fe r22 = r0.A03()
            X.2sH r0 = r2.A06     // Catch:{ all -> 0x03f0 }
            long r0 = r0.A0H()     // Catch:{ all -> 0x03f0 }
            X.33p r8 = r2.A07     // Catch:{ all -> 0x03f0 }
            android.content.SharedPreferences r5 = X.AnonymousClass0x2.A0F(r8)     // Catch:{ all -> 0x03f0 }
            java.lang.String r7 = "dithered_last_signed_prekey_rotation"
            r3 = -9223372036854775808
            long r5 = r5.getLong(r7, r3)     // Catch:{ all -> 0x03f0 }
            r9 = 0
            r16 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            int r3 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r3 < 0) goto L_0x0040
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 > 0) goto L_0x0040
            long r3 = r5 + r16
            int r9 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r9 < 0) goto L_0x0040
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x03f0 }
            java.lang.String r0 = "RotateKeysAction/rotateSignedPrekeyAndSenderKeys/rotate keys alarm fired before ready to rotate signed prekey; rotation skipped until "
            java.lang.String r0 = X.AnonymousClass0x9.A11(r0, r1, r3)     // Catch:{ all -> 0x03f0 }
            X.C18260x0.A1K(r1, r0)     // Catch:{ all -> 0x03f0 }
            goto L_0x03b6
        L_0x0040:
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x03f0 }
            java.lang.String r3 = "RotateKeysAction/rotateSignedPrekeyAndSenderKeys/rotating signed prekey now; now="
            java.lang.String r3 = X.AnonymousClass0x9.A11(r3, r4, r0)     // Catch:{ all -> 0x03f0 }
            r4.append(r3)     // Catch:{ all -> 0x03f0 }
            java.lang.String r3 = "; lastSignedPrekeyRotation="
            java.lang.String r3 = X.AnonymousClass0x9.A11(r3, r4, r5)     // Catch:{ all -> 0x03f0 }
            X.C18260x0.A1L(r4, r3)     // Catch:{ all -> 0x03f0 }
            X.33n r6 = r2.A08     // Catch:{ all -> 0x03f0 }
            X.30x r3 = r6.A0K     // Catch:{ all -> 0x03f0 }
            r33 = r3
            X.3fe r19 = r33.A03()     // Catch:{ all -> 0x03f0 }
            X.35n r14 = r6.A00     // Catch:{ all -> 0x03e4 }
            X.2KK r11 = r14.A04()     // Catch:{ all -> 0x03e4 }
            X.2qP r3 = r14.A02     // Catch:{ all -> 0x03e4 }
            X.2EX r3 = r3.A06     // Catch:{ all -> 0x03e4 }
            X.2jN r9 = r3.A00     // Catch:{ all -> 0x03e4 }
            java.lang.String r13 = "prekey_id"
            X.1RJ r3 = r9.A01     // Catch:{ all -> 0x03e4 }
            X.4GK r18 = r3.get()     // Catch:{ all -> 0x03e4 }
            r3 = r18
            X.3H0 r3 = (X.AnonymousClass3H0) r3     // Catch:{ all -> 0x03d4 }
            X.2sg r12 = r3.A03     // Catch:{ all -> 0x03d4 }
            java.lang.String r4 = "SELECT prekey_id, record FROM signed_prekeys ORDER BY prekey_id DESC LIMIT 1"
            java.lang.String r3 = "SignalSignedPreKeyStore/getNextSignedPreKeyIdForRotation"
            android.database.Cursor r5 = X.C56862sg.A01(r12, r4, r3)     // Catch:{ all -> 0x03d4 }
            boolean r3 = r5.moveToNext()     // Catch:{ all -> 0x03c8 }
            r10 = 0
            if (r3 == 0) goto L_0x00b6
            int r15 = X.AnonymousClass0x2.A04(r5, r13)     // Catch:{ all -> 0x03c8 }
            r4 = 16777215(0xffffff, float:2.3509886E-38)
            r3 = 1
            if (r15 == r4) goto L_0x0097
            int r10 = r15 + 1
            goto L_0x00b6
        L_0x0097:
            r5.close()     // Catch:{ all -> 0x03d4 }
            java.lang.String r5 = "SELECT prekey_id, record FROM signed_prekeys WHERE prekey_id < ? ORDER BY prekey_id DESC LIMIT 1"
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ all -> 0x03d4 }
            r3 = 8388607(0x7fffff, float:1.1754942E-38)
            X.C18280x3.A1Q(r4, r3, r10)     // Catch:{ all -> 0x03d4 }
            java.lang.String r3 = "SignalSignedPreKeyStore/getNextSignedPreKeyIdForRotation2"
            android.database.Cursor r5 = r12.A0E(r5, r3, r4)     // Catch:{ all -> 0x03d4 }
            boolean r3 = r5.moveToNext()     // Catch:{ all -> 0x03c8 }
            if (r3 == 0) goto L_0x00b6
            int r3 = X.AnonymousClass0x2.A04(r5, r13)     // Catch:{ all -> 0x03c8 }
            int r10 = r3 + 1
        L_0x00b6:
            r5.close()     // Catch:{ all -> 0x03d4 }
            r18.close()     // Catch:{ all -> 0x03e4 }
            X.2sH r3 = r14.A03     // Catch:{ all -> 0x03e4 }
            long r4 = r3.A0H()     // Catch:{ all -> 0x03e4 }
            X.2KI r14 = X.AnonymousClass36G.A00()     // Catch:{ all -> 0x03e4 }
            X.2ew r12 = r11.A00     // Catch:{ all -> 0x03e4 }
            X.2jv r3 = r14.A01     // Catch:{ all -> 0x03e4 }
            byte[] r11 = r3.A00()     // Catch:{ all -> 0x03e4 }
            byte[] r13 = X.AnonymousClass36G.A09(r12, r11)     // Catch:{ all -> 0x03e4 }
            X.1DQ r11 = X.AnonymousClass1DQ.DEFAULT_INSTANCE     // Catch:{ all -> 0x03e4 }
            X.6c9 r12 = r11.A0G()     // Catch:{ all -> 0x03e4 }
            X.1A2 r12 = (X.AnonymousClass1A2) r12     // Catch:{ all -> 0x03e4 }
            r12.A09(r10)     // Catch:{ all -> 0x03e4 }
            byte[] r11 = r3.A00()     // Catch:{ all -> 0x03e4 }
            int r10 = r11.length     // Catch:{ all -> 0x03e4 }
            r3 = 0
            X.8Lq r10 = X.C172548Lq.A02(r11, r3, r10)     // Catch:{ all -> 0x03e4 }
            r12.A0C(r10)     // Catch:{ all -> 0x03e4 }
            X.2ew r10 = r14.A00     // Catch:{ all -> 0x03e4 }
            byte[] r11 = r10.A01     // Catch:{ all -> 0x03e4 }
            int r10 = r11.length     // Catch:{ all -> 0x03e4 }
            X.8Lq r10 = X.C172548Lq.A02(r11, r3, r10)     // Catch:{ all -> 0x03e4 }
            r12.A0B(r10)     // Catch:{ all -> 0x03e4 }
            int r10 = r13.length     // Catch:{ all -> 0x03e4 }
            X.8Lq r10 = X.C172548Lq.A02(r13, r3, r10)     // Catch:{ all -> 0x03e4 }
            r12.A0D(r10)     // Catch:{ all -> 0x03e4 }
            r12.A0A(r4)     // Catch:{ all -> 0x03e4 }
            X.6cX r4 = r12.A06()     // Catch:{ all -> 0x03e4 }
            X.1DQ r4 = (X.AnonymousClass1DQ) r4     // Catch:{ all -> 0x03e4 }
            int r5 = r4.id_     // Catch:{ all -> 0x03e4 }
            X.8Lq r10 = r4.publicKey_     // Catch:{ 23X -> 0x03c2 }
            byte[] r10 = r10.A07()     // Catch:{ 23X -> 0x03c2 }
            X.2jv r12 = X.AnonymousClass36G.A01(r10)     // Catch:{ 23X -> 0x03c2 }
            X.8Lq r10 = r4.privateKey_     // Catch:{ 23X -> 0x03c2 }
            byte[] r10 = r10.A07()     // Catch:{ 23X -> 0x03c2 }
            r14 = 5
            X.2ew r11 = new X.2ew     // Catch:{ 23X -> 0x03c2 }
            r11.<init>(r10, r14)     // Catch:{ 23X -> 0x03c2 }
            X.2KI r10 = new X.2KI     // Catch:{ 23X -> 0x03c2 }
            r10.<init>(r11, r12)     // Catch:{ 23X -> 0x03c2 }
            X.2jv r10 = r10.A01     // Catch:{ all -> 0x03e4 }
            byte[] r10 = r10.A01     // Catch:{ all -> 0x03e4 }
            X.3ZK r12 = new X.3ZK     // Catch:{ all -> 0x03e4 }
            r12.<init>(r10)     // Catch:{ all -> 0x03e4 }
            X.8Lq r10 = r4.publicKey_     // Catch:{ 23X -> 0x03de }
            byte[] r10 = r10.A07()     // Catch:{ 23X -> 0x03de }
            X.2jv r13 = X.AnonymousClass36G.A01(r10)     // Catch:{ 23X -> 0x03de }
            X.8Lq r10 = r4.privateKey_     // Catch:{ 23X -> 0x03de }
            byte[] r10 = r10.A07()     // Catch:{ 23X -> 0x03de }
            X.2ew r11 = new X.2ew     // Catch:{ 23X -> 0x03de }
            r11.<init>(r10, r14)     // Catch:{ 23X -> 0x03de }
            X.2KI r10 = new X.2KI     // Catch:{ 23X -> 0x03de }
            r10.<init>(r11, r13)     // Catch:{ 23X -> 0x03de }
            X.2ew r10 = r10.A00     // Catch:{ all -> 0x03e4 }
            byte[] r11 = r10.A01     // Catch:{ all -> 0x03e4 }
            X.2JA r10 = new X.2JA     // Catch:{ all -> 0x03e4 }
            r10.<init>(r11)     // Catch:{ all -> 0x03e4 }
            X.2Ml r11 = new X.2Ml     // Catch:{ all -> 0x03e4 }
            r11.<init>(r10, r12)     // Catch:{ all -> 0x03e4 }
            int r13 = r4.id_     // Catch:{ all -> 0x03e4 }
            long r14 = r4.timestamp_     // Catch:{ all -> 0x03e4 }
            X.8Lq r10 = r4.signature_     // Catch:{ all -> 0x03e4 }
            byte[] r12 = r10.A07()     // Catch:{ all -> 0x03e4 }
            X.2v8 r10 = new X.2v8     // Catch:{ all -> 0x03e4 }
            r10.<init>(r11, r12, r13, r14)     // Catch:{ all -> 0x03e4 }
            X.1DQ r10 = r10.A00     // Catch:{ all -> 0x03e4 }
            byte[] r10 = r10.A0F()     // Catch:{ all -> 0x03e4 }
            r9.A00(r5, r10)     // Catch:{ all -> 0x03e4 }
            int r5 = r4.id_     // Catch:{ all -> 0x03e4 }
            byte[] r10 = X.AnonymousClass36A.A02(r5)     // Catch:{ all -> 0x03e4 }
            X.8Lq r5 = r4.publicKey_     // Catch:{ 23X -> 0x03bc }
            byte[] r5 = r5.A07()     // Catch:{ 23X -> 0x03bc }
            X.2jv r12 = X.AnonymousClass36G.A01(r5)     // Catch:{ 23X -> 0x03bc }
            X.8Lq r5 = r4.privateKey_     // Catch:{ 23X -> 0x03bc }
            byte[] r11 = r5.A07()     // Catch:{ 23X -> 0x03bc }
            r5 = 5
            X.2ew r9 = new X.2ew     // Catch:{ 23X -> 0x03bc }
            r9.<init>(r11, r5)     // Catch:{ 23X -> 0x03bc }
            X.2KI r5 = new X.2KI     // Catch:{ 23X -> 0x03bc }
            r5.<init>(r9, r12)     // Catch:{ 23X -> 0x03bc }
            X.2jv r5 = r5.A01     // Catch:{ all -> 0x03e4 }
            byte[] r9 = r5.A01     // Catch:{ all -> 0x03e4 }
            X.8Lq r4 = r4.signature_     // Catch:{ all -> 0x03e4 }
            byte[] r5 = r4.A07()     // Catch:{ all -> 0x03e4 }
            X.2Ov r4 = new X.2Ov     // Catch:{ all -> 0x03e4 }
            r4.<init>(r10, r9, r5)     // Catch:{ all -> 0x03e4 }
            if (r19 == 0) goto L_0x01a2
            r19.close()     // Catch:{ all -> 0x03f0 }
        L_0x01a2:
            X.2gy r11 = r2.A02     // Catch:{ all -> 0x03f0 }
            byte[] r10 = r4.A01     // Catch:{ all -> 0x03f0 }
            byte[] r9 = r4.A00     // Catch:{ all -> 0x03f0 }
            byte[] r5 = r4.A02     // Catch:{ all -> 0x03f0 }
            com.whatsapp.jobqueue.job.RotateSignedPreKeyJob r4 = new com.whatsapp.jobqueue.job.RotateSignedPreKeyJob     // Catch:{ all -> 0x03f0 }
            r4.<init>(r10, r9, r5)     // Catch:{ all -> 0x03f0 }
            r11.A02(r4)     // Catch:{ all -> 0x03f0 }
            X.C18260x0.A0M(r8, r7, r0)     // Catch:{ all -> 0x03f0 }
            X.2sr r12 = r2.A00     // Catch:{ all -> 0x03f0 }
            com.whatsapp.jid.PhoneUserJid r4 = X.C56972sr.A04(r12)     // Catch:{ all -> 0x03f0 }
            if (r4 == 0) goto L_0x03b6
            long r4 = r0 - r16
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x03f0 }
            X.3Ex r7 = r2.A03     // Catch:{ all -> 0x03f0 }
            r7.A0b(r8)     // Catch:{ all -> 0x03f0 }
            int r7 = r8.size()     // Catch:{ all -> 0x03f0 }
            long r7 = (long) r7     // Catch:{ all -> 0x03f0 }
            r10 = 4000(0xfa0, double:1.9763E-320)
            int r9 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x01da
            r7 = 7776000000(0x1cf7c5800, double:3.841854462E-314)
            long r0 = r0 - r7
            goto L_0x01db
        L_0x01da:
            r0 = r4
        L_0x01db:
            X.6kH r7 = X.C56972sr.A03(r12)     // Catch:{ all -> 0x03f0 }
            X.2ov r8 = X.AnonymousClass36G.A02(r7)     // Catch:{ all -> 0x03f0 }
            X.2wp r11 = r6.A0A     // Catch:{ all -> 0x03f0 }
            java.lang.String r21 = "group_id"
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x03f0 }
            java.lang.String r6 = "SenderKeyStore get keys older than:"
            r7.append(r6)     // Catch:{ all -> 0x03f0 }
            r7.append(r4)     // Catch:{ all -> 0x03f0 }
            java.lang.String r20 = " for sender:"
            r6 = r20
            r7.append(r6)     // Catch:{ all -> 0x03f0 }
            r7.append(r8)     // Catch:{ all -> 0x03f0 }
            java.lang.String r19 = " statusKeyExpirationTimeMs:"
            r6 = r19
            X.C18260x0.A12(r6, r7, r0)     // Catch:{ all -> 0x03f0 }
            long r15 = X.C18290x4.A0B(r0)     // Catch:{ all -> 0x03f0 }
            java.util.ArrayList r14 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x03f0 }
            r6 = 4
            java.lang.String[] r7 = new java.lang.String[r6]     // Catch:{ all -> 0x03f0 }
            java.lang.String r13 = r8.A02     // Catch:{ all -> 0x03f0 }
            r7[r3] = r13     // Catch:{ all -> 0x03f0 }
            int r6 = r8.A01     // Catch:{ all -> 0x03f0 }
            java.lang.String r18 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x03f0 }
            r10 = 1
            r7[r10] = r18     // Catch:{ all -> 0x03f0 }
            int r6 = r8.A00     // Catch:{ all -> 0x03f0 }
            java.lang.String r12 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x03f0 }
            r6 = 2
            r7[r6] = r12     // Catch:{ all -> 0x03f0 }
            r6 = 3
            java.lang.String r9 = java.lang.String.valueOf(r15)     // Catch:{ all -> 0x03f0 }
            r7[r6] = r9     // Catch:{ all -> 0x03f0 }
            X.1RJ r6 = r11.A02     // Catch:{ all -> 0x03f0 }
            r32 = r6
            X.4Fq r17 = r32.A0C()     // Catch:{ all -> 0x03f0 }
            r6 = r17
            X.3H0 r6 = (X.AnonymousClass3H0) r6     // Catch:{ all -> 0x03b1 }
            X.2sg r6 = r6.A03     // Catch:{ all -> 0x03b1 }
            r23 = r6
            java.lang.String r6 = "sender_keys"
            java.lang.String[] r25 = new java.lang.String[]{r21}     // Catch:{ all -> 0x03b1 }
            X.6kE r16 = X.C135166kE.A00     // Catch:{ all -> 0x03b1 }
            java.lang.String r11 = r16.getRawString()     // Catch:{ all -> 0x03b1 }
            java.lang.String r26 = X.C59382wp.A00(r11, r3)     // Catch:{ all -> 0x03b1 }
            r28 = 0
            java.lang.String r31 = "SignalSenderKeyStore/getOldSenderKeys"
            r30 = r28
            r24 = r6
            r27 = r7
            r29 = r28
            android.database.Cursor r11 = r23.A0F(r24, r25, r26, r27, r28, r29, r30, r31)     // Catch:{ all -> 0x03b1 }
            java.lang.String[] r25 = new java.lang.String[]{r21}     // Catch:{ all -> 0x03a5 }
            java.lang.String r15 = r16.getRawString()     // Catch:{ all -> 0x03a5 }
            java.lang.String r26 = X.C59382wp.A00(r15, r10)     // Catch:{ all -> 0x03a5 }
            java.lang.String r31 = "SignalSenderKeyStore/getOldSenderKeys1"
            android.database.Cursor r10 = r23.A0F(r24, r25, r26, r27, r28, r29, r30, r31)     // Catch:{ all -> 0x03a5 }
            if (r11 == 0) goto L_0x0285
            r7 = r21
            int r15 = r11.getColumnIndexOrThrow(r7)     // Catch:{ all -> 0x029f }
        L_0x0277:
            boolean r7 = r11.moveToNext()     // Catch:{ all -> 0x029f }
            if (r7 == 0) goto L_0x0285
            java.lang.String r7 = r11.getString(r15)     // Catch:{ all -> 0x029f }
            r14.add(r7)     // Catch:{ all -> 0x029f }
            goto L_0x0277
        L_0x0285:
            if (r10 == 0) goto L_0x02ab
            r7 = r21
            int r15 = r10.getColumnIndexOrThrow(r7)     // Catch:{ all -> 0x029f }
        L_0x028d:
            boolean r7 = r10.moveToNext()     // Catch:{ all -> 0x029f }
            if (r7 == 0) goto L_0x029b
            java.lang.String r7 = r10.getString(r15)     // Catch:{ all -> 0x029f }
            r14.add(r7)     // Catch:{ all -> 0x029f }
            goto L_0x028d
        L_0x029b:
            r10.close()     // Catch:{ all -> 0x03a5 }
            goto L_0x02ab
        L_0x029f:
            r1 = move-exception
            if (r10 == 0) goto L_0x02aa
            r10.close()     // Catch:{ all -> 0x02a6 }
            goto L_0x02aa
        L_0x02a6:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x03a5 }
        L_0x02aa:
            throw r1     // Catch:{ all -> 0x03a5 }
        L_0x02ab:
            if (r11 == 0) goto L_0x02b0
            r11.close()     // Catch:{ all -> 0x03b1 }
        L_0x02b0:
            r17.close()     // Catch:{ all -> 0x03f0 }
            java.util.HashSet r11 = X.C18310x6.A0r(r14)     // Catch:{ all -> 0x03f0 }
            java.util.Iterator r15 = r14.iterator()     // Catch:{ all -> 0x03f0 }
        L_0x02bb:
            boolean r7 = r15.hasNext()     // Catch:{ all -> 0x03f0 }
            if (r7 == 0) goto L_0x02ce
            java.lang.String r10 = X.AnonymousClass001.A0m(r15)     // Catch:{ all -> 0x03f0 }
            X.2oh r7 = new X.2oh     // Catch:{ all -> 0x03f0 }
            r7.<init>(r8, r10)     // Catch:{ all -> 0x03f0 }
            r11.add(r7)     // Catch:{ all -> 0x03f0 }
            goto L_0x02bb
        L_0x02ce:
            boolean r7 = r11.isEmpty()     // Catch:{ all -> 0x03f0 }
            if (r7 == 0) goto L_0x02d9
            java.util.HashSet r10 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x03f0 }
            goto L_0x02f7
        L_0x02d9:
            java.util.HashSet r10 = X.C18310x6.A0r(r11)     // Catch:{ all -> 0x03f0 }
            java.util.Iterator r15 = r11.iterator()     // Catch:{ all -> 0x03f0 }
        L_0x02e1:
            boolean r7 = r15.hasNext()     // Catch:{ all -> 0x03f0 }
            if (r7 == 0) goto L_0x02f7
            java.lang.Object r11 = r15.next()     // Catch:{ all -> 0x03f0 }
            X.2oh r11 = (X.C54422oh) r11     // Catch:{ all -> 0x03f0 }
            r7 = r33
            X.3fe r7 = r7.A05(r11)     // Catch:{ all -> 0x03f0 }
            r10.add(r7)     // Catch:{ all -> 0x03f0 }
            goto L_0x02e1
        L_0x02f7:
            r7 = r33
            r7.A09(r10)     // Catch:{ all -> 0x03a0 }
            java.lang.StringBuilder r11 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x03a0 }
            java.lang.String r15 = "SenderKeyStore deleting keys older than:"
            r7 = r20
            X.C18310x6.A1N(r15, r7, r11, r4)     // Catch:{ all -> 0x03a0 }
            r11.append(r8)     // Catch:{ all -> 0x03a0 }
            r4 = r19
            X.C18260x0.A12(r4, r11, r0)     // Catch:{ all -> 0x03a0 }
            r0 = 4
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ all -> 0x03a0 }
            r5[r3] = r13     // Catch:{ all -> 0x03a0 }
            r8 = 1
            r5[r8] = r18     // Catch:{ all -> 0x03a0 }
            X.AnonymousClass001.A1H(r12, r9, r5)     // Catch:{ all -> 0x03a0 }
            X.4Fq r9 = r32.A0C()     // Catch:{ all -> 0x03a0 }
            X.3Yo r7 = r9.Axl()     // Catch:{ all -> 0x0396 }
            r0 = r9
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x038c }
            X.2sg r4 = r0.A03     // Catch:{ all -> 0x038c }
            java.lang.String r0 = r16.getRawString()     // Catch:{ all -> 0x038c }
            java.lang.String r1 = X.C59382wp.A00(r0, r3)     // Catch:{ all -> 0x038c }
            java.lang.String r0 = "SignalSenderKeyStore/removeOldSenderKeys2"
            r4.A07(r6, r1, r0, r5)     // Catch:{ all -> 0x038c }
            java.lang.String r0 = r16.getRawString()     // Catch:{ all -> 0x038c }
            java.lang.String r1 = X.C59382wp.A00(r0, r8)     // Catch:{ all -> 0x038c }
            java.lang.String r0 = "SignalSenderKeyStore/removeOldSenderKeys3"
            r4.A07(r6, r1, r0, r5)     // Catch:{ all -> 0x038c }
            r7.A00()     // Catch:{ all -> 0x038c }
            r7.close()     // Catch:{ all -> 0x0396 }
            r9.close()     // Catch:{ all -> 0x03a0 }
            X.C614730x.A02(r10)     // Catch:{ all -> 0x03f0 }
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x03f0 }
            java.util.Iterator r1 = r14.iterator()     // Catch:{ all -> 0x03f0 }
        L_0x0355:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x03f0 }
            if (r0 == 0) goto L_0x0369
            java.lang.String r0 = X.AnonymousClass001.A0m(r1)     // Catch:{ all -> 0x03f0 }
            X.1fL r0 = X.C28011fL.A01(r0)     // Catch:{ all -> 0x03f0 }
            if (r0 == 0) goto L_0x0355
            r3.add(r0)     // Catch:{ all -> 0x03f0 }
            goto L_0x0355
        L_0x0369:
            java.util.Iterator r4 = r3.iterator()     // Catch:{ all -> 0x03f0 }
        L_0x036d:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x03f0 }
            if (r0 == 0) goto L_0x03b6
            java.lang.Object r3 = r4.next()     // Catch:{ all -> 0x03f0 }
            X.1fL r3 = (X.C28011fL) r3     // Catch:{ all -> 0x03f0 }
            X.36E r1 = r2.A01     // Catch:{ all -> 0x03f0 }
            java.lang.Integer r0 = X.C18290x4.A0c()     // Catch:{ all -> 0x03f0 }
            r1.A0I(r3, r0)     // Catch:{ all -> 0x03f0 }
            X.2sj r1 = r2.A0B     // Catch:{ all -> 0x03f0 }
            X.33k r0 = X.C56892sj.A01(r1, r3)     // Catch:{ all -> 0x03f0 }
            r1.A05(r0)     // Catch:{ all -> 0x03f0 }
            goto L_0x036d
        L_0x038c:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x0391 }
            goto L_0x0395
        L_0x0391:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0396 }
        L_0x0395:
            throw r1     // Catch:{ all -> 0x0396 }
        L_0x0396:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x039b }
            goto L_0x039f
        L_0x039b:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x03a0 }
        L_0x039f:
            throw r1     // Catch:{ all -> 0x03a0 }
        L_0x03a0:
            r0 = move-exception
            X.C614730x.A02(r10)     // Catch:{ all -> 0x03f0 }
            throw r0     // Catch:{ all -> 0x03f0 }
        L_0x03a5:
            r1 = move-exception
            if (r11 == 0) goto L_0x03b0
            r11.close()     // Catch:{ all -> 0x03ac }
            goto L_0x03b0
        L_0x03ac:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x03b1 }
        L_0x03b0:
            throw r1     // Catch:{ all -> 0x03b1 }
        L_0x03b1:
            r1 = move-exception
            r17.close()     // Catch:{ all -> 0x03eb }
            goto L_0x03ef
        L_0x03b6:
            if (r22 == 0) goto L_0x03bb
            r22.close()
        L_0x03bb:
            return
        L_0x03bc:
            r0 = move-exception
            java.lang.AssertionError r1 = X.AnonymousClass0x9.A0i(r0)     // Catch:{ all -> 0x03e4 }
            goto L_0x03e3
        L_0x03c2:
            r0 = move-exception
            java.lang.AssertionError r1 = X.AnonymousClass0x9.A0i(r0)     // Catch:{ all -> 0x03e4 }
            goto L_0x03e3
        L_0x03c8:
            r1 = move-exception
            if (r5 == 0) goto L_0x03d3
            r5.close()     // Catch:{ all -> 0x03cf }
            goto L_0x03d3
        L_0x03cf:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x03d4 }
        L_0x03d3:
            throw r1     // Catch:{ all -> 0x03d4 }
        L_0x03d4:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x03d9 }
            goto L_0x03e3
        L_0x03d9:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x03e4 }
            goto L_0x03e3
        L_0x03de:
            r0 = move-exception
            java.lang.AssertionError r1 = X.AnonymousClass0x9.A0i(r0)     // Catch:{ all -> 0x03e4 }
        L_0x03e3:
            throw r1     // Catch:{ all -> 0x03e4 }
        L_0x03e4:
            r1 = move-exception
            if (r19 == 0) goto L_0x03ef
            r19.close()     // Catch:{ all -> 0x03eb }
            goto L_0x03ef
        L_0x03eb:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x03f0 }
        L_0x03ef:
            throw r1     // Catch:{ all -> 0x03f0 }
        L_0x03f0:
            r1 = move-exception
            if (r22 == 0) goto L_0x03fb
            r22.close()     // Catch:{ all -> 0x03f7 }
            throw r1
        L_0x03f7:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x03fb:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1I1.A05():void");
    }

    public final void A06() {
        long A0H = this.A06.A0H();
        AnonymousClass33p r9 = this.A07;
        C183538qC r8 = r9.A01;
        if (!C18300x5.A0B(r8).contains("dithered_last_signed_prekey_rotation")) {
            long A0A2 = A0H - C18290x4.A0A(this.A0D.nextInt(2592000));
            StringBuilder A0o = AnonymousClass001.A0o();
            C18260x0.A1L(A0o, AnonymousClass0x9.A11("no signed prekey rotation schedule established; setting last rotation time to ", A0o, A0A2));
            C18260x0.A0M(r9, "dithered_last_signed_prekey_rotation", A0A2);
        }
        long j = C18300x5.A0B(r8).getLong("dithered_last_signed_prekey_rotation", Long.MIN_VALUE);
        if (j >= 0 && j <= A0H) {
            long j2 = 2592000000L + j;
            if (j2 >= A0H) {
                long j3 = j2 - A0H;
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append(AnonymousClass0x9.A11("scheduling alarm to trigger signed prekey rotation; now=", A0o2, A0H));
                A0o2.append(AnonymousClass0x9.A11("; lastSignedPrekeyRotation=", A0o2, j));
                C18260x0.A12("; deltaToAlarm=", A0o2, j3);
                PendingIntent A002 = A00("com.whatsapp.action.ROTATE_SIGNED_PREKEY", 134217728);
                if (!this.A04.A02(A002, 2, j3 + SystemClock.elapsedRealtime())) {
                    Log.w("RotateKeysAction/setupRotateKeysAlarm AlarmManager is null");
                    return;
                }
                return;
            }
        }
        StringBuilder A0o3 = AnonymousClass001.A0o();
        A0o3.append(AnonymousClass0x9.A11("scheduling immediate signed prekey rotation; now=", A0o3, A0H));
        C18260x0.A1L(A0o3, AnonymousClass0x9.A11("; lastSignedPrekeyRotation=", A0o3, j));
        this.A0C.BkM(new C70043Zq(this, 38));
    }

    public AnonymousClass1I1(Context context, C56972sr r2, AnonymousClass36E r3, C49712gy r4, C64773Ex r5, C50862it r6, C620633i r7, C56612sH r8, AnonymousClass33p r9, C621133n r10, C48972fm r11, C614730x r12, C56892sj r13, AnonymousClass4FS r14, Random random) {
        super(context);
        this.A06 = r8;
        this.A0D = random;
        this.A04 = r6;
        this.A00 = r2;
        this.A0C = r14;
        this.A0A = r12;
        this.A02 = r4;
        this.A03 = r5;
        this.A01 = r3;
        this.A09 = r11;
        this.A05 = r7;
        this.A08 = r10;
        this.A07 = r9;
        this.A0B = r13;
    }

    public void A01() {
        A06();
    }

    public final void A07(Intent intent) {
        PowerManager.WakeLock wakeLock;
        AssertionError assertionError;
        C18260x0.A1R(AnonymousClass001.A0o(), "RotateKeysAction/rotateSignedPrekeyAndSenderKeys; intent=", intent);
        PowerManager A0J = this.A05.A0J();
        if (A0J == null) {
            Log.w("RotateKeysAction/rotateSignedPrekeyAndSenderKeys pm=null");
            wakeLock = null;
        } else {
            wakeLock = AnonymousClass75K.A00(A0J, "RotateKeysAction#rotateSignedPrekeyAndSenderKeys", 1);
            wakeLock.setReferenceCounted(false);
            wakeLock.acquire(300000);
        }
        try {
            if (this.A08.A0X()) {
                A05();
            } else {
                C48972fm r2 = this.A09;
                r2.A00.submit(new C70043Zq(this, 39)).get();
            }
            A06();
            if (wakeLock != null) {
                wakeLock.release();
                return;
            }
            return;
        } catch (InterruptedException e) {
            e = e;
            assertionError = AnonymousClass0x9.A0i("interrupted during rotate keys alarm");
        } catch (ExecutionException e2) {
            e = e2;
            assertionError = AnonymousClass0x9.A0i("exception during rotate keys alarm");
        } catch (Throwable th) {
            if (wakeLock != null) {
                wakeLock.release();
            }
            throw th;
        }
        assertionError.initCause(e);
        throw assertionError;
    }

    public void A02(Intent intent) {
        A07(intent);
    }
}
