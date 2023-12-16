package X;

import android.os.Handler;
import com.whatsapp.jid.DeviceJid;

/* renamed from: X.2iB  reason: invalid class name and case insensitive filesystem */
public class C50442iB {
    public C72163dH A00;
    public final Handler A01 = AnonymousClass000.A0A();
    public final C55492qR A02;
    public final C42112Mv A03;
    public final C29231iU A04;
    public final C621133n A05;
    public final C48972fm A06;
    public final C614730x A07;
    public final AnonymousClass33Z A08;
    public final AnonymousClass4FS A09;
    public final boolean A0A;

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x000d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(java.util.List r21) {
        /*
            r20 = this;
            java.lang.String r0 = "RecvPreKeyMessageListener/processPrekeys"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.HashMap r4 = X.AnonymousClass001.A0t()
            java.util.Iterator r6 = r21.iterator()
        L_0x000d:
            boolean r0 = r6.hasNext()
            r3 = r20
            if (r0 == 0) goto L_0x0094
            java.lang.Object r0 = r6.next()
            X.2T8 r0 = (X.AnonymousClass2T8) r0
            com.whatsapp.jid.DeviceJid r15 = r0.A01
            byte[] r11 = r0.A05
            byte[] r12 = r0.A06
            byte[] r1 = r0.A04
            byte r13 = r0.A00
            X.2Ov r9 = r0.A02
            X.2Ov r10 = r0.A03
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "prekey request successful; initiating signal protocol session; jid="
            X.C18260x0.A1R(r2, r0, r15)
            X.30x r2 = r3.A07
            com.whatsapp.jid.UserJid r0 = r15.userJid
            X.2ov r0 = X.AnonymousClass36G.A03(r0)
            X.3fe r5 = X.C614730x.A00(r0, r2)
            int r0 = r15.getDevice()     // Catch:{ all -> 0x0088 }
            boolean r0 = X.AnonymousClass000.A1T(r0)     // Catch:{ all -> 0x0088 }
            if (r0 != 0) goto L_0x0063
            X.33Z r14 = r3.A08     // Catch:{ all -> 0x0088 }
            r19 = 4
            r16 = r1
            r17 = r11
            r18 = r13
            boolean r0 = r14.A0C(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0088 }
            if (r0 != 0) goto L_0x0063
            java.lang.String r0 = "recvprekeymessagelistener/onGetPreKeySuccess adv verification fails"
        L_0x005c:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0088 }
            r3.A00(r15)     // Catch:{ all -> 0x0088 }
            goto L_0x0082
        L_0x0063:
            X.2ov r8 = X.AnonymousClass36G.A02(r15)     // Catch:{ all -> 0x0088 }
            X.33n r7 = r3.A05     // Catch:{ all -> 0x0088 }
            int r2 = r7.A02(r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0088 }
            if (r2 != 0) goto L_0x0070
            goto L_0x007b
        L_0x0070:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0088 }
            java.lang.String r0 = "Error received from SignalCoordinator; status="
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r2)     // Catch:{ all -> 0x0088 }
            goto L_0x005c
        L_0x007b:
            boolean r0 = X.AnonymousClass000.A1X(r9)
            X.AnonymousClass000.A1C(r15, r4, r0)     // Catch:{ all -> 0x0088 }
        L_0x0082:
            if (r5 == 0) goto L_0x000d
            r5.close()
            goto L_0x000d
        L_0x0088:
            r1 = move-exception
            if (r5 == 0) goto L_0x0093
            r5.close()     // Catch:{ all -> 0x008f }
            throw r1
        L_0x008f:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x0093:
            throw r1
        L_0x0094:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x00a5
            android.os.Handler r2 = r3.A01
            r1 = 6
            X.3Zy r0 = new X.3Zy
            r0.<init>(r3, r1, r4)
            r2.post(r0)
        L_0x00a5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50442iB.A01(java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002a, code lost:
        if (r10.A0Y(r1, 1885) == false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C50442iB(X.C55492qR r3, X.C42112Mv r4, X.C29231iU r5, X.C621133n r6, X.C48972fm r7, X.C614730x r8, X.AnonymousClass33Z r9, X.AnonymousClass1VX r10, X.AnonymousClass4FS r11) {
        /*
            r2 = this;
            r2.<init>()
            android.os.Handler r0 = X.AnonymousClass000.A0A()
            r2.A01 = r0
            r2.A09 = r11
            r2.A07 = r8
            r2.A06 = r7
            r2.A05 = r6
            r2.A03 = r4
            r2.A08 = r9
            r2.A02 = r3
            r2.A04 = r5
            r0 = 2232(0x8b8, float:3.128E-42)
            X.2vE r1 = X.C58422vE.A02
            boolean r0 = r10.A0Y(r1, r0)
            if (r0 == 0) goto L_0x002c
            r0 = 1885(0x75d, float:2.641E-42)
            boolean r1 = r10.A0Y(r1, r0)
            r0 = 1
            if (r1 != 0) goto L_0x002d
        L_0x002c:
            r0 = 0
        L_0x002d:
            r2.A0A = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50442iB.<init>(X.2qR, X.2Mv, X.1iU, X.33n, X.2fm, X.30x, X.33Z, X.1VX, X.4FS):void");
    }

    public void A00(DeviceJid deviceJid) {
        C18260x0.A1R(AnonymousClass001.A0o(), "Prekey request returned none or signature invalid; jid=", deviceJid);
        C54562ov A022 = AnonymousClass36G.A02(deviceJid);
        C73523fe A002 = C614730x.A00(A022, this.A07);
        try {
            this.A05.A0M((C47932e4) null, A022);
            C55492qR r2 = this.A02;
            synchronized (r2) {
                C18260x0.A1R(AnonymousClass001.A0o(), "prekeysmanager/onGetPreKeyNone:", deviceJid);
                r2.A08.remove(deviceJid);
            }
            if (AnonymousClass0x9.A1P(deviceJid)) {
                this.A08.A09(deviceJid, true);
            }
            if (A002 != null) {
                A002.close();
            }
        } catch (Throwable th) {
            if (A002 != null) {
                try {
                    A002.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
            throw th;
        }
    }
}
