package X;

import java.io.BufferedInputStream;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: X.0he  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C10260he implements AnonymousClass49Y {
    public final /* synthetic */ AnonymousClass4FS A00;
    public final /* synthetic */ BufferedInputStream A01;
    public final /* synthetic */ File A02;
    public final /* synthetic */ AtomicBoolean A03;
    public final /* synthetic */ HttpsURLConnection A04;

    public final void BPq(C59622xD r6) {
        this.A00.BkM(new C13010mU(this.A01, this.A02, this.A03, this.A04));
    }

    public /* synthetic */ C10260he(AnonymousClass4FS r1, BufferedInputStream bufferedInputStream, File file, AtomicBoolean atomicBoolean, HttpsURLConnection httpsURLConnection) {
        this.A00 = r1;
        this.A02 = file;
        this.A03 = atomicBoolean;
        this.A04 = httpsURLConnection;
        this.A01 = bufferedInputStream;
    }
}
