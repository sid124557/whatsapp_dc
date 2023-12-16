package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.whatsapp.jid.UserJid;

/* renamed from: X.0yV  reason: invalid class name and case insensitive filesystem */
public final class C18940yV extends Handler implements AnonymousClass4EW {
    public final /* synthetic */ C18980yZ A00;

    public boolean BFQ() {
        if (!hasMessages(4)) {
            C18950yW r1 = (C18950yW) this.A00.A05;
            if (r1.hasMessages(2) || !r1.A00.A09.isEmpty()) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18940yV(C18980yZ r2) {
        super(r2.getLooper());
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        if (r0.A00.isClosed() != false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r9) {
        /*
            r8 = this;
            int r2 = r9.what
            r5 = -1
            java.lang.String r3 = "disconnectReason"
            java.lang.String r1 = "requestTime"
            java.lang.String r0 = "ConnectionThread/MessageServiceHandler/recv/disconnect"
            switch(r2) {
                case 0: goto L_0x0061;
                case 1: goto L_0x0090;
                case 2: goto L_0x00a7;
                case 3: goto L_0x00c1;
                case 4: goto L_0x00ce;
                case 5: goto L_0x000d;
                case 6: goto L_0x00d4;
                case 7: goto L_0x00df;
                case 8: goto L_0x00ea;
                case 9: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            return
        L_0x000e:
            java.lang.String r0 = "ConnectionThread/MessageServiceHandler/recv/networkBlocked"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.0yZ r5 = r8.A00
            X.2oY r0 = r5.A01
            r4 = 1
            if (r0 == 0) goto L_0x0025
            java.net.Socket r0 = r0.A00
            boolean r0 = r0.isClosed()
            r3 = 0
            if (r0 == 0) goto L_0x0026
        L_0x0025:
            r3 = 1
        L_0x0026:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ConnectionThread/handleNetworkBlocked is socket closed: "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = " is disconnecting:"
            r2.append(r0)
            X.2fJ r1 = r5.A0k
            boolean r0 = r1.A00
            X.C18260x0.A1U(r2, r0)
            if (r3 != 0) goto L_0x00f5
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x00f5
            java.lang.String r0 = "ConnectionThread/handleNetworkBlocked/try start logout worker"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3Qu r3 = r5.A1C
            X.1VX r2 = r3.A0D
            r1 = 3206(0xc86, float:4.493E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x000d
            com.whatsapp.messaging.xmpp.XmppConnectionMetricsWorkManager r0 = r3.A0F
            r0.A03(r4)
            return
        L_0x0061:
            java.lang.String r0 = "ConnectionThread/MessageServiceHandler/recv/connect"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.os.Bundle r1 = r9.getData()
            java.lang.String r0 = "jid"
            java.lang.String r0 = r1.getString(r0)
            com.whatsapp.jid.UserJid r2 = X.AnonymousClass32Y.A08(r0)
            X.0yZ r4 = r8.A00
            java.lang.String r0 = "ipaddress"
            java.lang.String r5 = r1.getString(r0)
            java.lang.String r0 = "available"
            boolean r6 = r1.getBoolean(r0)
            java.lang.String r0 = "forcePassiveMode"
            boolean r7 = r1.getBoolean(r0)
            java.lang.Object r3 = r9.obj
            X.2OU r3 = (X.AnonymousClass2OU) r3
            r4.A0y(r2, r3, r5, r6, r7)
            return
        L_0x0090:
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.0yZ r4 = r8.A00
            android.os.Bundle r0 = r9.getData()
            long r1 = r0.getLong(r1)
            android.os.Bundle r0 = r9.getData()
            int r3 = r0.getInt(r3, r5)
            r0 = 0
            goto L_0x00bd
        L_0x00a7:
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.0yZ r4 = r8.A00
            android.os.Bundle r0 = r9.getData()
            long r1 = r0.getLong(r1)
            android.os.Bundle r0 = r9.getData()
            int r3 = r0.getInt(r3, r5)
            r0 = 1
        L_0x00bd:
            r4.A0t(r1, r3, r0)
            return
        L_0x00c1:
            java.lang.String r0 = "ConnectionThread/MessageServiceHandler/recv/quit"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.0yZ r1 = r8.A00
            int r0 = r9.arg1
            r1.A0q(r0)
            return
        L_0x00ce:
            X.0yZ r0 = r8.A00
            r0.A0x(r9)
            return
        L_0x00d4:
            java.lang.String r0 = "ConnectionThread/MessageServiceHandler/recv/WHAT_SEND_UNAVAILABLE_FOR_CHAT"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.0yZ r0 = r8.A00
            r0.A0o()
            return
        L_0x00df:
            java.lang.String r0 = "ConnectionThread/MessageServiceHandler/recv/WHAT_SEND_AVAILABLE_FOR_CHAT"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.0yZ r0 = r8.A00
            r0.A0n()
            return
        L_0x00ea:
            java.lang.String r0 = "ConnectionThread/MessageServiceHandler/recv/pingtimeout"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.0yZ r0 = r8.A00
            r0.A0m()
            return
        L_0x00f5:
            java.lang.String r0 = "ConnectionThread/handleNetworkBlocked/socket already closed or disconnecting"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.8qC r0 = r5.A1D
            java.lang.Object r0 = r0.get()
            X.2zc r0 = (X.C61042zc) r0
            r0.A02(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18940yV.handleMessage(android.os.Message):void");
    }

    public void BlI(UserJid userJid, AnonymousClass2OU r6, String str, boolean z, boolean z2) {
        String str2;
        String rawString;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ConnectionThread/sendConnect/ forcePassiveMode=");
        A0o.append(z2);
        if (z2) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append(" reg=");
            str2 = AnonymousClass000.A0h(A0o2, this.A00.A15.A00());
        } else {
            str2 = "";
        }
        C18260x0.A1L(A0o, str2);
        removeMessages(0);
        removeMessages(9);
        Message obtainMessage = obtainMessage(0);
        Bundle data = obtainMessage.getData();
        if (userJid == null) {
            rawString = null;
        } else {
            rawString = userJid.getRawString();
        }
        data.putString("jid", rawString);
        data.putString("ipaddress", str);
        data.putBoolean("available", z);
        data.putBoolean("forcePassiveMode", z2);
        obtainMessage.obj = r6;
        obtainMessage.sendToTarget();
    }

    public void BlM(boolean z, int i) {
        int A002 = C18280x3.A00(z ? 1 : 0);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ConnectionThread/MessageServiceHandler/send/disconnect force:");
        A0o.append(z);
        A0o.append(" hasConnect:");
        A0o.append(hasMessages(0));
        A0o.append(" hasDisconnect:");
        C18260x0.A1U(A0o, hasMessages(A002));
        removeMessages(A002);
        removeMessages(0);
        Message obtainMessage = obtainMessage(A002);
        Bundle data = obtainMessage.getData();
        data.putLong("requestTime", SystemClock.uptimeMillis());
        data.putInt("disconnectReason", i);
        obtainMessage.sendToTarget();
    }
}
