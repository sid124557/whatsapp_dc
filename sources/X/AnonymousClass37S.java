package X;

import android.net.wifi.p2p.WifiP2pManager;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: X.37S  reason: invalid class name */
public class AnonymousClass37S implements WifiP2pManager.ActionListener {
    public int A00 = -1;
    public final String A01;
    public final CountDownLatch A02;

    public boolean A00() {
        try {
            if (!this.A02.await(5000, TimeUnit.MILLISECONDS)) {
                StringBuilder A0l = AnonymousClass000.A0l("fpm/WifiDirectManager/ActionListener [");
                A0l.append(this.A01);
                A0l.append("] timed out after ");
                A0l.append(5000);
                C18260x0.A1L(A0l, "ms");
                this.A00 = 3;
                return false;
            }
        } catch (InterruptedException unused) {
            StringBuilder A0l2 = AnonymousClass000.A0l("fpm/WifiDirectManager/ActionListener [");
            A0l2.append(this.A01);
            C18260x0.A1L(A0l2, "] interrupted");
        }
        if (this.A00 == -1) {
            return true;
        }
        return false;
    }

    public AnonymousClass37S(String str) {
        this.A01 = str;
        this.A02 = C18290x4.A14();
    }

    public void onFailure(int i) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("fpm/WifiDirectManager/");
        A0o.append(this.A01);
        C18260x0.A0z(" failure_reason: ", A0o, i);
        this.A00 = i;
        this.A02.countDown();
    }

    public void onSuccess() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("fpm/WifiDirectManager/");
        A0o.append(this.A01);
        C18260x0.A1L(A0o, " success");
        this.A02.countDown();
    }
}
