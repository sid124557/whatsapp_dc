package X;

import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: X.0lY  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C12440lY implements Runnable {
    public final /* synthetic */ AtomicBoolean A00;
    public final /* synthetic */ HttpsURLConnection A01;

    public final void run() {
        AtomicBoolean atomicBoolean = this.A00;
        HttpsURLConnection httpsURLConnection = this.A01;
        atomicBoolean.set(true);
        httpsURLConnection.disconnect();
    }

    public /* synthetic */ C12440lY(AtomicBoolean atomicBoolean, HttpsURLConnection httpsURLConnection) {
        this.A00 = atomicBoolean;
        this.A01 = httpsURLConnection;
    }
}
