package X;

import android.os.Handler;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.4ja  reason: invalid class name and case insensitive filesystem */
public class C91424ja extends C153457bL {
    public final C107285b3 A00;

    public C91424ja(C107285b3 r1) {
        this.A00 = r1;
    }

    public void A01(String str) {
        C18260x0.A0s("voip/service/selfManagedConnectionListener/onCreateIncomingConnection ", str, C86654Ky.A0o());
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo == null || (!str.equals(callInfo.callId) && !str.equals(callInfo.callWaitingInfo.A04))) {
            this.A00.A2A.A04().A0I(str);
            return;
        }
        C107285b3 r2 = this.A00;
        r2.A0H.removeMessages(1);
        Handler handler = r2.A0H;
        handler.sendMessageDelayed(handler.obtainMessage(28, str), 500);
    }

    public void A02(String str) {
        C18260x0.A0s("voip/service/selfManagedConnectionListener/onCreateIncomingConnectionFailed ", str, C86654Ky.A0o());
        if (str.equals(Voip.getCurrentCallId())) {
            C107285b3 r2 = this.A00;
            r2.A0H.removeMessages(1);
            r2.A0m(str, "busy", 4);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002a, code lost:
        if (r13.equals(r5.callWaitingInfo.A04) == false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(java.lang.String r18) {
        /*
            r17 = this;
            X.C626936e.A01()
            r0 = r17
            X.5b3 r10 = r0.A00
            android.os.Handler r0 = r10.A0H
            r6 = 28
            r0.removeMessages(r6)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "voip/service/selfManagedConnectionListener/onShowIncomingCallUi "
            r13 = r18
            X.C18260x0.A0s(r0, r13, r1)
            com.whatsapp.voipcalling.CallInfo r5 = com.whatsapp.voipcalling.Voip.getCallInfo()
            r14 = 0
            r4 = 1
            if (r5 == 0) goto L_0x002c
            X.7Ps r0 = r5.callWaitingInfo
            java.lang.String r0 = r0.A04
            boolean r0 = r13.equals(r0)
            r9 = 1
            if (r0 != 0) goto L_0x002d
        L_0x002c:
            r9 = 0
        L_0x002d:
            boolean r0 = X.C627436k.A0O(r5)
            if (r0 == 0) goto L_0x0075
            boolean r0 = r5.callEnding
            if (r0 != 0) goto L_0x0075
            java.lang.String r0 = r5.callId
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x0041
            if (r9 == 0) goto L_0x0075
        L_0x0041:
            long r2 = r10.A0B
            r7 = 0
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0076
            long r0 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r0 = X.C18310x6.A0f(r0, r2)
            r10.A0s = r0
        L_0x0053:
            if (r9 != 0) goto L_0x0064
            com.whatsapp.jid.UserJid r12 = X.C86644Kx.A0X(r5)
            boolean r15 = r5.videoEnabled
            boolean r0 = r5.isGroupCall
            com.whatsapp.jid.GroupJid r11 = r5.groupJid
            r16 = r0
            r10.A0W(r11, r12, r13, r14, r15, r16)
        L_0x0064:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r6) goto L_0x0073
            if (r9 == 0) goto L_0x006f
            boolean r0 = r10.A1J
            if (r0 != 0) goto L_0x006f
            r14 = 1
        L_0x006f:
            r0 = 0
            r10.A0d(r5, r4, r14, r0)
        L_0x0073:
            r10.A1C = r4
        L_0x0075:
            return
        L_0x0076:
            java.lang.String r0 = "selfManagedConnectionNewCallTs is not set"
            X.C626936e.A0D(r14, r0)
            goto L_0x0053
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91424ja.A04(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0024, code lost:
        if (r10.equals(r3.callWaitingInfo.A04) == false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(java.lang.String r10, int r11) {
        /*
            r9 = this;
            java.lang.StringBuilder r1 = X.C86654Ky.A0o()
            java.lang.String r0 = "voip/service/selfManagedConnectionListener/onConnectionStateChanged "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = ", state "
            X.C18260x0.A0y(r0, r1, r11)
            X.5b3 r2 = r9.A00
            com.whatsapp.voipcalling.CallInfo r3 = com.whatsapp.voipcalling.Voip.getCallInfo()
            r5 = 0
            r4 = 1
            if (r3 == 0) goto L_0x0026
            X.7Ps r0 = r3.callWaitingInfo
            java.lang.String r0 = r0.A04
            boolean r0 = r10.equals(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0027
        L_0x0026:
            r1 = 0
        L_0x0027:
            boolean r0 = X.C627436k.A0O(r3)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = r3.callId
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0037
            if (r1 == 0) goto L_0x004f
        L_0x0037:
            if (r11 == 0) goto L_0x00e2
            if (r11 == r4) goto L_0x00de
            r0 = 2
            if (r11 == r0) goto L_0x00cd
            r0 = 3
            if (r11 == r0) goto L_0x0050
            X.7Me r0 = r2.A1n
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x00bf
            X.5pi r0 = r2.A1m
            boolean r0 = r0.A0G(r10)
            if (r0 != 0) goto L_0x00bf
        L_0x004f:
            return
        L_0x0050:
            X.5iU r0 = r2.A2A
            int r8 = r0.A01()
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r0 = r2.A0B
            java.lang.Long r1 = X.C18310x6.A0f(r3, r0)
            r2.A0t = r1
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VoiceService/onConnectionStateChanged Time elapsed since SelfManagedConnection creation = "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = ", Android auto connected = "
            r3.append(r0)
            X.7Me r7 = r2.A1n
            boolean r0 = r7.A03
            r3.append(r0)
            java.lang.String r0 = ", isBluetoothAvailable = "
            r3.append(r0)
            X.5pi r1 = r2.A1m
            boolean r0 = r1.A0G(r10)
            X.C18260x0.A1V(r3, r0)
            java.lang.Long r0 = r2.A0t
            long r5 = r0.longValue()
            long r3 = (long) r8
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x009d
            boolean r0 = r7.A03
            if (r0 != 0) goto L_0x00c6
            boolean r0 = r1.A0G(r10)
            if (r0 != 0) goto L_0x00c6
        L_0x009d:
            android.telephony.TelephonyManager r1 = r2.A1X
            X.5ZR r0 = r2.A2a
            int r0 = X.AnonymousClass36T.A00(r1, r0)
            if (r0 != 0) goto L_0x00c6
            java.lang.String r0 = "VoiceService/onConnectionStateChanged Ignoring SelfManagedConnection.onReject"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r2.A1C
            if (r0 != 0) goto L_0x004f
            java.lang.String r0 = "VoiceService/onConnectionStateChanged SelfManagedConnection has not shown UI. Showing now"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r0 = 0
            r2.A0B = r0
            r0 = 500(0x1f4, double:2.47E-321)
            r2.A0R(r0)
            return
        L_0x00bf:
            r1 = 31
            r0 = 0
            r2.A0e(r3, r0, r1)
            return
        L_0x00c6:
            r1 = 9
            r0 = 0
            r2.A0m(r10, r0, r1)
            return
        L_0x00cd:
            r2.A15 = r4
            r2.A0a(r3)
            X.5iU r0 = r2.A2A
            boolean r1 = r0.A0B()
            r0 = 8
            r2.A0Q(r0, r10, r1)
            return
        L_0x00de:
            r2.A0f(r3, r5, r4)
            return
        L_0x00e2:
            r2.A0f(r3, r4, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91424ja.A05(java.lang.String, int):void");
    }
}
