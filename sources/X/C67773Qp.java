package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.os.Handler;
import com.whatsapp.util.Log;

/* renamed from: X.3Qp  reason: invalid class name and case insensitive filesystem */
public class C67773Qp implements AnonymousClass4F9 {
    public BroadcastReceiver A00;
    public Handler A01;
    public final C29441ip A02;
    public final C54392oe A03;
    public final C47912e2 A04;
    public final C54292oU A05;
    public final C66523Lt A06;

    public void Bpg(Handler handler) {
        this.A01 = handler;
        Context context = this.A05.A00;
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        C85604Gx r1 = new C85604Gx(this, 4);
        this.A00 = r1;
        if (C154317cy.A00(r1, context, intentFilter, handler, (String) null, true) == null) {
            C626936e.A06(handler);
            if (!handler.post(new C70013Zn(this, 40))) {
                Log.w("failed to post checkNetworkState isRetry: false");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0031, code lost:
        if (X.C29441ip.A01() == false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(boolean r8) {
        /*
            r7 = this;
            X.2oe r0 = r7.A03
            android.net.NetworkInfo r2 = r0.A01()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "xmpp/handler/network/active "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " isRetry="
            X.C18260x0.A1E(r0, r1, r8)
            r6 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0049
            boolean r4 = r2.isConnected()
            int r1 = r2.getType()
            boolean r0 = X.AnonymousClass000.A1U(r1, r6)
            if (r4 == 0) goto L_0x0033
            if (r0 == 0) goto L_0x0033
            boolean r0 = X.C29441ip.A01()
            r3 = 1
            if (r0 != 0) goto L_0x0034
        L_0x0033:
            r3 = 0
        L_0x0034:
            X.2e2 r0 = r7.A04
            r0.A00()
            X.3Lt r2 = r7.A06
            if (r4 == 0) goto L_0x0047
            if (r3 != 0) goto L_0x0047
        L_0x003f:
            long r0 = (long) r1
            r2.A0A(r0, r6, r5)
            r2.A0G(r3, r8)
            return
        L_0x0047:
            r6 = 0
            goto L_0x003f
        L_0x0049:
            r1 = -1
            r4 = 0
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67773Qp.A00(boolean):void");
    }

    public long B6U() {
        NetworkInfo A012 = this.A03.A01();
        if (A012 != null) {
            return (long) A012.getType();
        }
        return -1;
    }

    public void Bjm() {
        Handler handler = this.A01;
        C626936e.A06(handler);
        C70013Zn.A00(handler, this, 39);
    }

    public void BqC() {
        this.A05.A00.unregisterReceiver(this.A00);
        this.A00 = null;
        this.A01 = null;
    }

    public boolean isConnected() {
        NetworkInfo A012 = this.A03.A01();
        if (A012 == null || !A012.isConnected()) {
            return false;
        }
        return true;
    }

    public C67773Qp(C29441ip r1, C54392oe r2, C47912e2 r3, C54292oU r4, C66523Lt r5) {
        this.A05 = r4;
        this.A06 = r5;
        this.A04 = r3;
        this.A03 = r2;
        this.A02 = r1;
    }
}
