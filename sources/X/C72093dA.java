package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.voipcalling.CallOfferInfo;
import java.util.concurrent.Callable;

/* renamed from: X.3dA  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C72093dA implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C54382od A01;
    public final /* synthetic */ DeviceJid A02;
    public final /* synthetic */ CallOfferInfo A03;
    public final /* synthetic */ String A04;

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c1, code lost:
        X.AnonymousClass2A8.A00(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c4, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0100, code lost:
        if ("connected".equals(r12.state) == false) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x005f, code lost:
        if (r0 != false) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r21 = this;
            r1 = r21
            X.2od r0 = r1.A01
            java.lang.String r6 = r1.A04
            com.whatsapp.voipcalling.CallOfferInfo r2 = r1.A03
            com.whatsapp.jid.DeviceJid r14 = r1.A02
            int r10 = r1.A00
            X.5b3 r3 = r0.A00
            X.2rn r1 = r3.A2j
            java.lang.String r0 = X.C627436k.A08(r6)
            X.2mt r0 = r1.A04(r0)
            r9 = 1
            r7 = 0
            boolean r5 = X.AnonymousClass000.A1W(r0)
            X.2TG r0 = r3.A07(r6)
            r0.A06 = r5
            boolean r0 = r2.isAudioChat
            if (r0 == 0) goto L_0x0033
            if (r5 == 0) goto L_0x0033
            X.33T r4 = r3.A2Z
            r1 = 27
            java.lang.String r0 = "joinable call"
            r4.A06(r1, r6, r0)
        L_0x0033:
            X.30y r13 = r3.A21
            com.whatsapp.jid.UserJid r15 = r2.fromJid
            java.lang.String r8 = r2.callId
            long r0 = r2.epochTimeMillis
            boolean r4 = r2.isVideoCall
            r16 = r8
            r17 = r10
            r18 = r0
            r20 = r4
            X.3ZF r4 = r13.A02(r14, r15, r16, r17, r18, r20)
            com.whatsapp.jid.GroupJid r8 = r2.groupJid
            java.lang.String r11 = r2.scheduledId
            boolean r0 = r2.isAudioChat
            if (r0 == 0) goto L_0x00ae
            X.1VX r10 = r3.A2o
            r1 = 3362(0xd22, float:4.711E-42)
            X.2vE r0 = X.C58422vE.A02
            int r1 = r10.A0O(r0, r1)
            r0 = 1
            if (r1 >= r9) goto L_0x005f
            r0 = 0
        L_0x005f:
            if (r0 == 0) goto L_0x00ae
        L_0x0061:
            r13.A07(r8, r4, r11, r9)
            java.lang.String r11 = r2.callLinkToken
            X.2l8 r0 = r4.A0I
            if (r0 != 0) goto L_0x0083
            if (r11 == 0) goto L_0x0083
            X.5b3 r0 = r13.A03
            r10 = 0
            X.2l7 r0 = r0.A1q
            X.2l8 r9 = r0.A02(r11)
            if (r9 != 0) goto L_0x0080
            long r0 = r0.A00(r10, r11)
            X.2l8 r9 = new X.2l8
            r9.<init>(r10, r11, r0)
        L_0x0080:
            r4.A0G(r9)
        L_0x0083:
            int r0 = r2.silenceReason
            r4.A0E(r0)
            X.2sK r1 = r3.A2P
            X.39J r0 = r4.A0E
            com.whatsapp.jid.UserJid r0 = r0.A01
            boolean r0 = r1.A0B(r0)
            if (r0 != 0) goto L_0x00c8
            X.2Fr r9 = r3.A2g
            android.content.ContentValues r12 = X.AnonymousClass0x9.A06()
            long r0 = r4.A05()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "call_log_row_id"
            r12.put(r0, r1)
            X.3dV r0 = r9.A00
            X.4Fq r11 = r0.A04()
            goto L_0x00b0
        L_0x00ae:
            r9 = 0
            goto L_0x0061
        L_0x00b0:
            r0 = r11
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x00be }
            X.2sg r10 = r0.A03     // Catch:{ all -> 0x00be }
            java.lang.String r9 = "call_unknown_caller"
            r1 = 5
            java.lang.String r0 = "CallUnknownCallerStore.markUnknown"
            r10.A0C(r9, r0, r12, r1)     // Catch:{ all -> 0x00be }
            goto L_0x00c5
        L_0x00be:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c0 }
        L_0x00c0:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r11, r1)
            throw r0
        L_0x00c5:
            r11.close()
        L_0x00c8:
            java.lang.String r0 = r2.scheduledId
            r13.A06(r8, r4, r0)
            boolean r0 = r2.isJoinableGroupCall()
            if (r0 == 0) goto L_0x0109
            com.whatsapp.voipcalling.CallGroupInfo r0 = r2.callGroupInfo
            X.C626936e.A06(r0)
            com.whatsapp.voipcalling.CallParticipant[] r11 = r0.participants
            int r10 = r11.length
        L_0x00db:
            if (r7 >= r10) goto L_0x0109
            r12 = r11[r7]
            X.2sr r1 = r3.A1e
            com.whatsapp.jid.UserJid r0 = r12.jid
            boolean r0 = r1.A0a(r0)
            if (r0 == 0) goto L_0x00ef
            boolean r0 = r3.A0t(r4)
            if (r0 == 0) goto L_0x0106
        L_0x00ef:
            com.whatsapp.jid.UserJid r9 = r12.jid
            boolean r0 = r3.A0t(r4)
            if (r0 == 0) goto L_0x0102
            java.lang.String r1 = "connected"
            java.lang.String r0 = r12.state
            boolean r1 = r1.equals(r0)
            r0 = 5
            if (r1 != 0) goto L_0x0103
        L_0x0102:
            r0 = 2
        L_0x0103:
            r4.A0I(r9, r0)
        L_0x0106:
            int r7 = r7 + 1
            goto L_0x00db
        L_0x0109:
            if (r8 != 0) goto L_0x013c
            if (r5 != 0) goto L_0x013c
            com.whatsapp.jid.UserJid r1 = r14.userJid
            com.whatsapp.jid.UserJid r0 = r2.fromJid
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x013c
            X.1VX r0 = r3.A2o
            boolean r0 = X.C627436k.A0G(r0)
            if (r0 == 0) goto L_0x013c
            X.5Xv r0 = r3.A1l
            com.whatsapp.jid.UserJid r3 = r2.fromJid
            android.content.SharedPreferences r0 = r0.A03()
            android.content.SharedPreferences$Editor r2 = r0.edit()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ad_hoc_call_invitor_"
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r6, r1)
            java.lang.String r0 = r3.getRawString()
            X.C18270x1.A0j(r2, r1, r0)
        L_0x013c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r0, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72093dA.call():java.lang.Object");
    }

    public /* synthetic */ C72093dA(C54382od r1, DeviceJid deviceJid, CallOfferInfo callOfferInfo, String str, int i) {
        this.A01 = r1;
        this.A04 = str;
        this.A03 = callOfferInfo;
        this.A02 = deviceJid;
        this.A00 = i;
    }
}
