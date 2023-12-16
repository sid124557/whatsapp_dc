package X;

import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.HandlerThread;
import com.whatsapp.util.Log;

/* renamed from: X.2yE  reason: invalid class name and case insensitive filesystem */
public abstract class C60242yE {
    public static final IntentFilter A07 = new C18560xt();
    public WifiP2pManager.Channel A00;
    public WifiP2pManager A01;
    public C18460xS A02;
    public C85054Et A03;
    public String A04;
    public final HandlerThread A05;
    public final C54292oU A06;

    public void A00() {
        WifiP2pManager.Channel channel;
        Log.i("fpm/WifiDirectManager/shutting down WiFi Direct");
        this.A03 = null;
        WifiP2pManager wifiP2pManager = this.A01;
        if (!(wifiP2pManager == null || (channel = this.A00) == null)) {
            wifiP2pManager.clearServiceRequests(channel, (WifiP2pManager.ActionListener) null);
            wifiP2pManager.stopPeerDiscovery(channel, (WifiP2pManager.ActionListener) null);
            wifiP2pManager.clearLocalServices(channel, (WifiP2pManager.ActionListener) null);
            wifiP2pManager.removeGroup(channel, (WifiP2pManager.ActionListener) null);
            this.A01 = null;
        }
        WifiP2pManager.Channel channel2 = this.A00;
        if (channel2 != null) {
            if (C107385bE.A05()) {
                channel2.close();
            }
            this.A00 = null;
        }
        C18460xS r1 = this.A02;
        if (r1 != null) {
            r1.A00 = null;
            try {
                this.A06.A00.unregisterReceiver(r1);
            } catch (IllegalArgumentException e) {
                Log.e("fpm/WifiDirectManager/Receiver not registered", e);
            }
            this.A02 = null;
        }
        HandlerThread handlerThread = this.A05;
        handlerThread.quit();
        handlerThread.interrupt();
    }

    public void A01(C85054Et r5, String str) {
        String str2;
        this.A03 = r5;
        if (this.A01 == null || this.A00 == null) {
            Context context = this.A06.A00;
            WifiP2pManager wifiP2pManager = (WifiP2pManager) AnonymousClass0Y8.A08(context, WifiP2pManager.class);
            this.A01 = wifiP2pManager;
            if (wifiP2pManager == null) {
                str2 = "fpm/WifiDirectManager/Unable to get WifiP2pManager";
            } else {
                this.A02 = new C18460xS(r5);
                WifiP2pManager.Channel initialize = this.A01.initialize(context, this.A05.getLooper(), new AnonymousClass37T(this));
                this.A00 = initialize;
                if (initialize == null) {
                    str2 = "fpm/WifiDirectManager/Unable to initialize channel";
                } else {
                    WifiP2pManager wifiP2pManager2 = this.A01;
                    wifiP2pManager2.clearServiceRequests(initialize, (WifiP2pManager.ActionListener) null);
                    wifiP2pManager2.stopPeerDiscovery(initialize, (WifiP2pManager.ActionListener) null);
                    wifiP2pManager2.clearLocalServices(initialize, (WifiP2pManager.ActionListener) null);
                    wifiP2pManager2.removeGroup(initialize, (WifiP2pManager.ActionListener) null);
                    C154317cy.A01(this.A02, context, A07, true);
                    this.A04 = AnonymousClass000.A0X("_chattransfer._whatsapp.com", AnonymousClass000.A0l(str));
                    Log.i("fpm/WifiDirectManager/initialize/success");
                    return;
                }
            }
            Log.i(str2);
            A00();
            return;
        }
        Log.w("fpm/WifiDirectManager/Already initialized, do not need to initialize twice");
    }

    public C60242yE(C54292oU r3) {
        this.A06 = r3;
        HandlerThread handlerThread = new HandlerThread("WifiDirectCallbackHandler");
        this.A05 = handlerThread;
        handlerThread.start();
    }
}
