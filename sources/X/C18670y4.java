package X;

import android.net.ConnectivityManager;
import android.net.Network;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* renamed from: X.0y4  reason: invalid class name and case insensitive filesystem */
public class C18670y4 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ AnonymousClass35O A00;
    public final /* synthetic */ ScheduledFuture A01;
    public final /* synthetic */ boolean A02;

    public static /* synthetic */ void A00(Network network, C18670y4 r3, ScheduledFuture scheduledFuture, boolean z) {
        scheduledFuture.cancel(false);
        AnonymousClass35O r1 = r3.A00;
        if (r1.A00 == null) {
            Log.i("voip/weak-wifi/onAvailable: network callback is already unregistered");
        } else if (r1.A02 != null) {
            Log.i("voip/weak-wifi/onAvailable: onAvailable() is called multiple times");
            Voip.notifyLostOfAlternativeNetwork();
        } else {
            r1.A06(network, z);
        }
    }

    public static /* synthetic */ void A01(C18670y4 r1, ScheduledFuture scheduledFuture) {
        scheduledFuture.cancel(false);
        if (r1.A00.A00 == null) {
            Log.i("voip/weak-wifi/onLost: network callback is already unregistered");
        } else {
            Voip.notifyLostOfAlternativeNetwork();
        }
    }

    public static /* synthetic */ void A02(C18670y4 r1, ScheduledFuture scheduledFuture, boolean z) {
        scheduledFuture.cancel(false);
        AnonymousClass35O r12 = r1.A00;
        if (r12.A00 == null) {
            Log.i("voip/weak-wifi/onUnavailable: network callback is already unregistered");
            return;
        }
        r12.A00 = null;
        r12.A01 = null;
        Voip.notifyFailureToCreateAlternativeSocket(z);
    }

    public C18670y4(AnonymousClass35O r1, ScheduledFuture scheduledFuture, boolean z) {
        this.A00 = r1;
        this.A01 = scheduledFuture;
        this.A02 = z;
    }

    public void onAvailable(Network network) {
        Log.i("voip/weak-wifi/onAvailable");
        ScheduledExecutorService scheduledExecutorService = this.A00.A07;
        if (scheduledExecutorService.isShutdown()) {
            Log.i("voip/weak-wifi/executor service shut down before response");
            return;
        }
        scheduledExecutorService.execute(new C71643cR(this, this.A01, network, 4, this.A02));
    }

    public void onLost(Network network) {
        Log.i("voip/weak-wifi/onLost");
        ScheduledExecutorService scheduledExecutorService = this.A00.A07;
        if (scheduledExecutorService.isShutdown()) {
            Log.i("voip/weak-wifi/executor service shut down before response");
        } else {
            scheduledExecutorService.execute(new C117175rV(this, 49, this.A01));
        }
    }

    public void onUnavailable() {
        Log.i("voip/weak-wifi/onUnavailable");
        ScheduledExecutorService scheduledExecutorService = this.A00.A07;
        if (scheduledExecutorService.isShutdown()) {
            Log.i("voip/weak-wifi/executor service shut down before response");
        } else {
            scheduledExecutorService.execute(new C117665sI(this, this.A01, 6, this.A02));
        }
    }
}
