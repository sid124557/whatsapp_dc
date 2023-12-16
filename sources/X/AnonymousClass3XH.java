package X;

import android.os.Handler;
import com.whatsapp.voipcalling.CallState;
import java.util.ArrayList;

/* renamed from: X.3XH  reason: invalid class name */
public class AnonymousClass3XH implements C185958uW {
    public boolean A00;
    public final Handler A01 = AnonymousClass000.A0A();
    public final AnonymousClass5TW A02;
    public final C29441ip A03;
    public final C56612sH A04;
    public final AnonymousClass1VX A05;
    public final C55572qZ A06;
    public final C620133d A07;
    public final AnonymousClass2OQ A08;
    public final AnonymousClass4FS A09;
    public final Runnable A0A;
    public final ArrayList A0B = AnonymousClass001.A0s();

    public void A01(C30471mV r3) {
        A02(r3, this.A03.A08(true), false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01b8, code lost:
        if (r14.A15 != true) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01c9, code lost:
        if (r0.A0F != null) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01d1, code lost:
        if (r14.A0F != null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0202, code lost:
        if (r1.A03(3) == false) goto L_0x0204;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0218, code lost:
        if (r1.A01.A0Y(r7, 6508) != false) goto L_0x0204;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005e, code lost:
        if (r2 >= r0) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0095, code lost:
        if (r1.A03(3) == false) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x009f, code lost:
        if (r1.A01.A0Y(r7, 6508) == false) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00f3, code lost:
        if (r0.A03() != false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0111, code lost:
        if (X.AnonymousClass36O.A09(X.AnonymousClass36O.A02(r8)) == false) goto L_0x0113;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C30471mV r21, int r22, boolean r23) {
        /*
            r20 = this;
            r15 = r20
            X.1VX r1 = r15.A05
            r0 = 1838(0x72e, float:2.576E-42)
            X.2vE r7 = X.C58422vE.A02
            boolean r0 = r1.A0Y(r7, r0)
            if (r0 == 0) goto L_0x0014
            java.lang.String r0 = "mediaautodownload/queuemessageifnetworksafe auto download disabled by ABProps"
            com.whatsapp.util.Log.d((java.lang.String) r0)
        L_0x0013:
            return
        L_0x0014:
            X.2qZ r6 = r15.A06
            r1 = 0
            r8 = r21
            X.C162457s7.A0J(r8, r1)
            X.2cb r5 = r6.A09
            X.2z0 r4 = r8.A1J
            boolean r11 = r4.A02
            if (r11 == 0) goto L_0x0115
            boolean r0 = r8.A1W
            if (r0 == 0) goto L_0x0115
        L_0x0028:
            r0 = 1
        L_0x0029:
            r12 = 0
            r11 = 1
            if (r0 == 0) goto L_0x0060
            if (r23 == 0) goto L_0x00f7
            boolean r0 = r8 instanceof X.C31971pB
            if (r0 == 0) goto L_0x00d1
            X.4uZ r0 = r4.A00
            boolean r0 = r0 instanceof X.C135166kE
            if (r0 == 0) goto L_0x00d1
            X.33C r1 = r8.A01
            if (r1 == 0) goto L_0x0060
            X.2rD r0 = r6.A07
            java.lang.String r1 = r1.A0I
            if (r1 == 0) goto L_0x00cd
            X.2qx r0 = r0.A0J
            X.5LM r0 = r0.A02(r1, r11)
            if (r0 == 0) goto L_0x00cd
            long r2 = r0.A0A
        L_0x004d:
            long r9 = r8.A00
            int r0 = r8.A0B
            long r0 = (long) r0
            r14 = 1084227584(0x40a00000, float:5.0)
            r16 = 0
            int r13 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r13 != 0) goto L_0x00c2
            r0 = 0
        L_0x005c:
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 < 0) goto L_0x00f7
        L_0x0060:
            r1 = 0
            X.33C r0 = r8.A01
            if (r0 == 0) goto L_0x0013
            int r0 = r0.A07
            if (r0 != r1) goto L_0x0013
            boolean r0 = r5.A00(r8)
            if (r0 != 0) goto L_0x00a1
            boolean r1 = r8 instanceof X.C31971pB
            if (r1 != 0) goto L_0x007f
            boolean r0 = r8 instanceof X.C31951p9
            if (r0 != 0) goto L_0x007f
            boolean r0 = r8 instanceof X.AnonymousClass1n2
            if (r0 != 0) goto L_0x007f
            boolean r0 = r8 instanceof X.AnonymousClass1nE
            if (r0 == 0) goto L_0x0013
        L_0x007f:
            X.4uZ r0 = r4.A00
            boolean r0 = r0 instanceof X.C95804uY
            if (r0 == 0) goto L_0x00b9
            if (r1 == 0) goto L_0x00b9
            X.5UP r1 = r5.A06
            r0 = 2
            boolean r0 = r1.A03(r0)
            if (r0 != 0) goto L_0x0097
            r0 = 3
            boolean r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x00b9
        L_0x0097:
            X.1VX r1 = r1.A01
            r0 = 6508(0x196c, float:9.12E-42)
            boolean r0 = r1.A0Y(r7, r0)
            if (r0 == 0) goto L_0x00b9
        L_0x00a1:
            if (r23 == 0) goto L_0x00a7
            boolean r0 = r8 instanceof X.AnonymousClass1n2
            if (r0 != 0) goto L_0x0013
        L_0x00a7:
            r0 = r22
            boolean r0 = r6.A04(r8, r0)
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = "MediaAutoDownload/queueMessageIfNetworkSafe/isAutoPrefetchEligible true"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r1 = 2
        L_0x00b5:
            r15.A00(r12, r8, r1, r11)
            return
        L_0x00b9:
            X.2ca r0 = r6.A08
            boolean r0 = r0.A00(r8)
            if (r0 == 0) goto L_0x0013
            goto L_0x00a1
        L_0x00c2:
            float r13 = (float) r9
            float r9 = (float) r0
            float r13 = r13 / r9
            float r14 = r14 * r13
            double r0 = (double) r14
            double r9 = java.lang.Math.ceil(r0)
            long r0 = (long) r9
            goto L_0x005c
        L_0x00cd:
            r2 = 0
            goto L_0x004d
        L_0x00d1:
            boolean r0 = r8 instanceof X.AnonymousClass1n2
            if (r0 == 0) goto L_0x00f7
            X.2r1 r1 = r6.A0B
            X.4uZ r0 = r4.A00
            boolean r0 = r0 instanceof X.C135166kE
            X.1VX r2 = r1.A02
            r1 = 3116(0xc2c, float:4.366E-42)
            if (r0 == 0) goto L_0x00e3
            r1 = 6269(0x187d, float:8.785E-42)
        L_0x00e3:
            X.2vE r0 = X.C58422vE.A01
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x00f7
            X.33C r0 = r8.A01
            if (r0 == 0) goto L_0x00f7
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x00f7
            goto L_0x0060
        L_0x00f7:
            boolean r0 = r6.A03(r8)
            if (r0 == 0) goto L_0x0060
            java.lang.String r0 = "MediaAutoDownload/queueMessageIfNetworkSafe/isAutoDownloadEligible true"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.4uZ r0 = r4.A00
            boolean r0 = r0 instanceof X.C135166kE
            if (r0 == 0) goto L_0x0113
            X.38t r0 = X.AnonymousClass36O.A02(r8)
            boolean r0 = X.AnonymousClass36O.A09(r0)
            r1 = 3
            if (r0 != 0) goto L_0x00b5
        L_0x0113:
            r1 = 1
            goto L_0x00b5
        L_0x0115:
            r10 = 1
            X.33C r0 = r8.A01
            if (r0 == 0) goto L_0x01ed
            int r0 = r0.A07
            if (r0 != r1) goto L_0x01ed
            X.4uZ r9 = r4.A00
            boolean r0 = r9 instanceof X.C135166kE
            if (r0 == 0) goto L_0x0144
            X.4uZ r3 = r8.A0n()
            X.33e r1 = r5.A04
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A03(r3)
            X.34r r2 = r1.A05(r0)
            if (r2 != 0) goto L_0x0153
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MediaAutoDownloadPolicy/isStatusAutoDownloadEligible/No status for "
            r1.append(r0)
            if (r3 != 0) goto L_0x0141
            java.lang.String r3 = " me"
        L_0x0141:
            X.C18260x0.A0n(r3, r1)
        L_0x0144:
            byte r1 = r8.A1I
            r0 = 2
            if (r1 == r0) goto L_0x014d
            r0 = 82
            if (r1 != r0) goto L_0x01d5
        L_0x014d:
            int r0 = r8.A09
            if (r0 != r10) goto L_0x01d5
            goto L_0x0028
        L_0x0153:
            boolean r0 = r1.A0G(r8)
            if (r0 != 0) goto L_0x0144
            boolean r0 = r3 instanceof X.C135216kJ
            if (r0 != 0) goto L_0x0028
            X.2sH r0 = r5.A02
            long r18 = r0.A0H()
            X.33p r0 = r5.A03
            X.8qC r0 = r0.A01
            r16 = r0
            android.content.SharedPreferences r12 = X.C18300x5.A0B(r16)
            java.lang.String r14 = "status_tab_last_opened_time"
            r0 = 0
            long r12 = r12.getLong(r14, r0)
            long r18 = r18 - r12
            X.1VX r13 = r5.A05
            r12 = 138(0x8a, float:1.93E-43)
            boolean r12 = r13.A0Y(r7, r12)
            if (r12 == 0) goto L_0x019d
            android.content.SharedPreferences r12 = X.C18300x5.A0B(r16)
            long r16 = r12.getLong(r14, r0)
            int r12 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r12 == 0) goto L_0x019d
            r0 = 6042(0x179a, float:8.467E-42)
            int r0 = r13.A0O(r7, r0)
            long r12 = X.AnonymousClass0x7.A0D(r0)
            int r0 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x019d
            goto L_0x0144
        L_0x019d:
            r14 = 0
            if (r3 == 0) goto L_0x01a6
            X.3Ex r0 = r5.A01
            X.3ZH r14 = r0.A0A(r3)
        L_0x01a6:
            monitor-enter(r2)
            long r12 = r8.A1M     // Catch:{ all -> 0x021c }
            long r0 = r2.A02     // Catch:{ all -> 0x021c }
            int r16 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            boolean r0 = X.AnonymousClass0x7.A1P(r16)
            monitor-exit(r2)
            if (r0 == 0) goto L_0x0144
            if (r14 == 0) goto L_0x01bb
            boolean r0 = r14.A15
            if (r0 != r10) goto L_0x01bb
            goto L_0x0144
        L_0x01bb:
            if (r11 != 0) goto L_0x01cd
            if (r3 == 0) goto L_0x0144
            X.3Ex r0 = r5.A01
            X.3ZH r0 = r0.A07(r3)
            if (r0 == 0) goto L_0x0144
            X.2k5 r0 = r0.A0F
            if (r0 != 0) goto L_0x01cd
            goto L_0x0144
        L_0x01cd:
            if (r14 == 0) goto L_0x0144
            X.2k5 r0 = r14.A0F
            if (r0 == 0) goto L_0x0144
            goto L_0x0028
        L_0x01d5:
            r0 = 20
            if (r1 == r0) goto L_0x0028
            int r1 = r8.A06
            r0 = 127(0x7f, float:1.78E-43)
            boolean r0 = X.C18280x3.A1U(r1, r0)
            if (r0 == 0) goto L_0x01f0
            X.3Mh r1 = r5.A00
            X.1Ei r0 = X.C66663Mh.A0S
            boolean r0 = r1.A08(r0)
            if (r0 == 0) goto L_0x01f0
        L_0x01ed:
            r0 = 0
            goto L_0x0029
        L_0x01f0:
            boolean r0 = r9 instanceof X.C95804uY
            if (r0 == 0) goto L_0x0204
            X.5UP r1 = r5.A06
            r0 = 2
            boolean r0 = r1.A03(r0)
            if (r0 != 0) goto L_0x020c
            r0 = 3
            boolean r0 = r1.A03(r0)
            if (r0 != 0) goto L_0x020c
        L_0x0204:
            X.2ca r0 = r6.A08
            boolean r0 = r0.A00(r8)
            goto L_0x0029
        L_0x020c:
            boolean r0 = r8 instanceof X.C31971pB
            if (r0 == 0) goto L_0x0028
            X.1VX r1 = r1.A01
            r0 = 6508(0x196c, float:9.12E-42)
            boolean r0 = r1.A0Y(r7, r0)
            if (r0 != 0) goto L_0x0204
            goto L_0x0028
        L_0x021c:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3XH.A02(X.1mV, int, boolean):void");
    }

    public void BO1(AnonymousClass3ZF r3) {
        C71533cG.A00(this.A09, this, 26);
    }

    public /* synthetic */ void BOB(AnonymousClass3ZF r1) {
    }

    public AnonymousClass3XH(AnonymousClass5TW r3, C29441ip r4, C56612sH r5, AnonymousClass1VX r6, C55572qZ r7, C620133d r8, AnonymousClass2OQ r9, AnonymousClass4FS r10) {
        this.A04 = r5;
        this.A05 = r6;
        this.A09 = r10;
        this.A02 = r3;
        this.A06 = r7;
        this.A07 = r8;
        this.A08 = r9;
        this.A03 = r4;
        this.A0A = new C71533cG((Object) this, 27);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c1, code lost:
        if (r6 != false) goto L_0x00be;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.AnonymousClass4EV r24, X.C30471mV r25, int r26, boolean r27) {
        /*
            r23 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "mediaautodownload/queue "
            r1.append(r0)
            r8 = r25
            java.lang.String r0 = r8.A07
            X.C18260x0.A1L(r1, r0)
            java.lang.String r0 = "mediaautodownload/getPriorityValue"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r10 = r23
            X.2sH r0 = r10.A04
            long r19 = r0.A0H()
            X.1VX r2 = r10.A05
            r1 = 60
            X.2vE r0 = X.C58422vE.A02
            int r1 = r2.A0O(r0, r1)
            X.2z0 r0 = r8.A1J
            X.4uZ r12 = r0.A00
            if (r12 == 0) goto L_0x0044
            if (r1 == 0) goto L_0x0044
            java.lang.String r0 = "mediaautodownload/getPriorityValue/getHeuristicDownloadPriority"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2OQ r3 = r10.A08
            boolean r0 = r12 instanceof X.C135166kE
            r17 = 345600000(0x14997000, double:1.70749087E-315)
            r11 = 1
            if (r0 == 0) goto L_0x0067
            byte r0 = r8.A1I
            if (r0 != r11) goto L_0x0063
            long r19 = r19 - r17
        L_0x0044:
            X.5TW r0 = r10.A02
            boolean r0 = r0.A01()
            r16 = r24
            r18 = r26
            r21 = r27
            if (r0 == 0) goto L_0x00da
            java.lang.String r0 = "mediaautodownload/queue waiting to download because call is active"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2RN r0 = new X.2RN
            r15 = r0
            r17 = r8
            r15.<init>(r16, r17, r18, r19, r21)
            java.util.ArrayList r1 = r10.A0B
            monitor-enter(r1)
            goto L_0x00d2
        L_0x0063:
            r0 = 518400000(0x1ee62800, double:2.56123631E-315)
            goto L_0x00be
        L_0x0067:
            boolean r0 = r8.A1C
            r9 = 20
            r7 = 42
            if (r0 == 0) goto L_0x0083
            byte r0 = r8.A1I
            if (r0 != r7) goto L_0x0079
            r0 = 40000(0x9c40, double:1.97626E-319)
        L_0x0076:
            long r19 = r19 + r0
            goto L_0x0044
        L_0x0079:
            if (r0 != r9) goto L_0x007e
            r0 = 30000(0x7530, double:1.4822E-319)
            goto L_0x0076
        L_0x007e:
            if (r0 != r11) goto L_0x0083
            r0 = 20000(0x4e20, double:9.8813E-320)
            goto L_0x0076
        L_0x0083:
            X.33p r0 = r3.A00
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "last_read_conversation_time"
            long r15 = X.AnonymousClass0x2.A0B(r1, r0)
            X.2ss r0 = r3.A01
            X.31A r0 = X.C56982ss.A01(r0, r12)
            if (r0 != 0) goto L_0x00c7
            r4 = 0
        L_0x0099:
            r13 = 86400000(0x5265c00, double:4.2687272E-316)
            long r1 = r4 + r13
            int r0 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            boolean r6 = X.AnonymousClass001.A1V(r0)
            X.1R1 r0 = r3.A02
            boolean r3 = r0.A0h(r12)
            byte r2 = r8.A1I
            r0 = 172800000(0xa4cb800, double:8.53745436E-316)
            if (r2 == r9) goto L_0x00b7
            if (r2 == r7) goto L_0x00b7
            if (r2 != r11) goto L_0x00c4
            long r19 = r19 - r0
        L_0x00b7:
            if (r3 == 0) goto L_0x00c1
            if (r6 == 0) goto L_0x00ca
            r0 = 259200000(0xf731400, double:1.280618154E-315)
        L_0x00be:
            long r19 = r19 - r0
            goto L_0x0044
        L_0x00c1:
            if (r6 == 0) goto L_0x00cc
            goto L_0x00be
        L_0x00c4:
            long r19 = r19 - r17
            goto L_0x00b7
        L_0x00c7:
            long r4 = r0.A0Y
            goto L_0x0099
        L_0x00ca:
            long r19 = r19 - r13
        L_0x00cc:
            long r19 = r19 - r15
            long r19 = r19 + r4
            goto L_0x0044
        L_0x00d2:
            r1.add(r0)     // Catch:{ all -> 0x00d7 }
            monitor-exit(r1)     // Catch:{ all -> 0x00d7 }
            return
        L_0x00d7:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00d7 }
            throw r0
        L_0x00da:
            java.lang.String r0 = "mediaautodownload/autodownload because call is not active"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.33d r0 = r10.A07
            r22 = 1
            r15 = r0
            r17 = r8
            r15.A08(r16, r17, r18, r19, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3XH.A00(X.4EV, X.1mV, int, boolean):void");
    }

    public /* synthetic */ void Bbe() {
    }

    public /* synthetic */ void BO8(AnonymousClass3ZF r1, boolean z) {
    }

    public /* synthetic */ void BOC(C95814uZ r1, CallState callState, String str) {
    }

    public /* synthetic */ void BO9(long j, boolean z, boolean z2, boolean z3, boolean z4) {
    }
}
