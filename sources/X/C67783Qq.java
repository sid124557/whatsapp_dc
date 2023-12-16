package X;

import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Handler;
import com.whatsapp.util.Log;

/* renamed from: X.3Qq  reason: invalid class name and case insensitive filesystem */
public class C67783Qq implements AnonymousClass4F9 {
    public Handler A00;
    public C18650y2 A01;
    public final C620633i A02;
    public final C47912e2 A03;
    public final C66523Lt A04;
    public final C67823Qu A05;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        if (r6 != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A00(X.C67783Qq r8) {
        /*
            X.0y2 r0 = r8.A01
            X.C626936e.A06(r0)
            android.net.Network r1 = r0.A00
            if (r1 == 0) goto L_0x0045
            r7 = 1
            long r2 = r1.getNetworkHandle()
        L_0x000e:
            X.33i r0 = r8.A02
            android.net.ConnectivityManager r0 = r0.A0H()
            r6 = 0
            if (r0 == 0) goto L_0x002f
            if (r1 == 0) goto L_0x002f
            android.net.NetworkCapabilities r1 = r0.getNetworkCapabilities(r1)
            if (r1 == 0) goto L_0x002f
            r0 = 1
            boolean r0 = r1.hasTransport(r0)
            if (r0 == 0) goto L_0x002f
            r0 = 17
            boolean r0 = r1.hasCapability(r0)
            if (r0 == 0) goto L_0x002f
            r6 = 1
        L_0x002f:
            r5 = 1
            r4 = 0
            X.2e2 r0 = r8.A03
            r0.A00()
            X.3Lt r1 = r8.A04
            if (r7 == 0) goto L_0x003d
            r0 = 1
            if (r6 == 0) goto L_0x003e
        L_0x003d:
            r0 = 0
        L_0x003e:
            r1.A0A(r2, r0, r4)
            r1.A0G(r6, r5)
            return
        L_0x0045:
            r7 = 0
            r2 = -1
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67783Qq.A00(X.3Qq):void");
    }

    public long B6U() {
        Network activeNetwork;
        ConnectivityManager A0H = this.A02.A0H();
        if (A0H == null || (activeNetwork = A0H.getActiveNetwork()) == null) {
            return -1;
        }
        return activeNetwork.getNetworkHandle();
    }

    public void Bjm() {
        Handler handler = this.A00;
        C626936e.A06(handler);
        C70013Zn.A00(handler, this, 38);
    }

    public void Bpg(Handler handler) {
        C626936e.A0C(AnonymousClass000.A1X(this.A01));
        this.A00 = handler;
        this.A01 = new C18650y2(this);
        ConnectivityManager A0H = this.A02.A0H();
        if (A0H != null) {
            try {
                A0H.registerDefaultNetworkCallback(this.A01, handler);
            } catch (SecurityException unused) {
                Log.d("xmpp/handler/network/securityexception");
            }
        } else {
            Log.e("xmpp/handler/network/startNetworkCallbacks cm null");
        }
    }

    public void BqC() {
        C626936e.A0C(AnonymousClass000.A1W(this.A01));
        ConnectivityManager A0H = this.A02.A0H();
        if (A0H != null) {
            A0H.unregisterNetworkCallback(this.A01);
        }
        this.A01 = null;
        this.A00 = null;
    }

    public boolean isConnected() {
        C18650y2 r0 = this.A01;
        if (r0 == null || r0.A00 == null) {
            return false;
        }
        return true;
    }

    public C67783Qq(C620633i r1, C47912e2 r2, C66523Lt r3, C67823Qu r4) {
        this.A02 = r1;
        this.A04 = r3;
        this.A03 = r2;
        this.A05 = r4;
    }
}
