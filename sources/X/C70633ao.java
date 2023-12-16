package X;

import android.util.Pair;
import com.whatsapp.jid.DeviceJid;

/* renamed from: X.3ao  reason: invalid class name and case insensitive filesystem */
public class C70633ao implements Runnable {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r16 = this;
            r0 = r16
            java.lang.Object r8 = r0.A02
            X.1gL r8 = (X.AnonymousClass1gL) r8
            int r6 = r0.A00
            java.lang.Object r5 = r0.A03
            com.whatsapp.jid.DeviceJid r5 = (com.whatsapp.jid.DeviceJid) r5
            int r1 = r0.A01
            java.lang.Object r4 = r0.A04
            X.2z0 r4 = (X.AnonymousClass2z0) r4
            java.lang.Object r0 = r0.A05
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r3 = r0.first
            X.2pX r3 = (X.C54942pX) r3
            int r2 = X.C18290x4.A03(r0)
            java.lang.String r10 = "; targetJid="
            com.whatsapp.jid.UserJid r9 = r5.userJid
            X.2ov r13 = X.AnonymousClass36G.A02(r5)
            X.30x r0 = r8.A05
            X.3fe r15 = X.C614730x.A00(r13, r0)
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "LocationNotificationHandler/onFinalLiveLocationRetryNotification; axolotl checking sessions due to retry receipt; recipient="
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r13)     // Catch:{ all -> 0x00ba }
            X.C18260x0.A1R(r7, r10, r9)     // Catch:{ all -> 0x00ba }
            X.33n r12 = r8.A03     // Catch:{ all -> 0x00ba }
            boolean r0 = r12.A0Z(r13)     // Catch:{ all -> 0x00ba }
            r7 = 0
            if (r0 == 0) goto L_0x0088
            X.2wr r0 = r12.A0A(r13)     // Catch:{ all -> 0x00ba }
            X.2uv r0 = r0.A01     // Catch:{ all -> 0x00ba }
            X.1E1 r14 = r0.A00     // Catch:{ all -> 0x00ba }
            int r0 = r14.remoteRegistrationId_     // Catch:{ all -> 0x00ba }
            if (r0 == r1) goto L_0x0060
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "LocationNotificationHandler/onFinalLiveLocationRetryNotification; axolotl deleting session due to registration id change; stop retrying; targetJid="
            X.C18260x0.A1R(r1, r0, r9)     // Catch:{ all -> 0x00ba }
            r12.A0B(r13)     // Catch:{ all -> 0x00ba }
            r12.A0O(r13)     // Catch:{ all -> 0x00ba }
            goto L_0x00b4
        L_0x0060:
            r11 = 2
            if (r6 < r11) goto L_0x0088
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "LocationNotificationHandler/onFinalLiveLocationRetryNotification; axolotl requiring new session before resending; targetJid="
            X.C18260x0.A1R(r1, r0, r9)     // Catch:{ all -> 0x00ba }
            X.8Lq r0 = r14.aliceBaseKey_     // Catch:{ all -> 0x00ba }
            byte[] r7 = r0.A07()     // Catch:{ all -> 0x00ba }
            if (r6 <= r11) goto L_0x0080
            boolean r0 = r12.A0a(r13, r9)     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x0088
            java.lang.String r0 = "LocationNotificationHandler/onFinalLiveLocationRetryNotification; axolotl will wait to send notification until a new prekey has been fetched"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00ba }
            goto L_0x00b4
        L_0x0080:
            java.lang.String r0 = "LocationNotificationHandler/onFinalLiveLocationRetryNotification; axolotl will record the base key used to send"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00ba }
            r12.A0P(r13, r9, r7)     // Catch:{ all -> 0x00ba }
        L_0x0088:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "LocationNotificationHandler/onFinalLiveLocationRetryNotification; create new SendFinalLiveLocationRetryJob; messageKey="
            X.AnonymousClass000.A17(r4, r0, r10, r1)     // Catch:{ all -> 0x00ba }
            r1.append(r9)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "; timeOffset="
            r1.append(r0)     // Catch:{ all -> 0x00ba }
            r1.append(r2)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "; retryCount="
            X.C18260x0.A0y(r0, r1, r6)     // Catch:{ all -> 0x00ba }
            X.2gy r0 = r8.A02     // Catch:{ all -> 0x00ba }
            X.C626936e.A06(r5)     // Catch:{ all -> 0x00ba }
            com.whatsapp.jobqueue.job.SendFinalLiveLocationRetryJob r8 = new com.whatsapp.jobqueue.job.SendFinalLiveLocationRetryJob     // Catch:{ all -> 0x00ba }
            r14 = r6
            r13 = r2
            r12 = r7
            r11 = r3
            r10 = r4
            r9 = r5
            r8.<init>(r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x00ba }
            r0.A02(r8)     // Catch:{ all -> 0x00ba }
        L_0x00b4:
            if (r15 == 0) goto L_0x00b9
            r15.close()
        L_0x00b9:
            return
        L_0x00ba:
            r1 = move-exception
            if (r15 == 0) goto L_0x00c5
            r15.close()     // Catch:{ all -> 0x00c1 }
            throw r1
        L_0x00c1:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x00c5:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70633ao.run():void");
    }

    public C70633ao(Pair pair, DeviceJid deviceJid, AnonymousClass1gL r3, AnonymousClass2z0 r4, int i, int i2) {
        this.A02 = r3;
        this.A00 = i;
        this.A03 = deviceJid;
        this.A01 = i2;
        this.A04 = r4;
        this.A05 = pair;
    }
}
