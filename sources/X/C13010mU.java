package X;

import java.io.BufferedInputStream;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: X.0mU  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C13010mU implements Runnable {
    public final /* synthetic */ BufferedInputStream A00;
    public final /* synthetic */ File A01;
    public final /* synthetic */ AtomicBoolean A02;
    public final /* synthetic */ HttpsURLConnection A03;

    public final void run() {
        C06540Yd.A0G(this.A00, this.A02, this.A03);
    }

    public /* synthetic */ C13010mU(BufferedInputStream bufferedInputStream, File file, AtomicBoolean atomicBoolean, HttpsURLConnection httpsURLConnection) {
        this.A01 = file;
        this.A02 = atomicBoolean;
        this.A03 = httpsURLConnection;
        this.A00 = bufferedInputStream;
    }
}
