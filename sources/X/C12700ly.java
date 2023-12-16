package X;

import java.util.concurrent.ExecutionException;

/* renamed from: X.0ly  reason: invalid class name and case insensitive filesystem */
public class C12700ly implements Runnable {
    public C16140sX A00;
    public C188268yc A01;
    public final AnonymousClass0PL A02;

    public void run() {
        boolean z;
        try {
            z = AnonymousClass001.A1Z(this.A01.get());
        } catch (InterruptedException | ExecutionException unused) {
            z = true;
        }
        this.A00.BSX(this.A02, z);
    }

    public C12700ly(C16140sX r1, AnonymousClass0PL r2, C188268yc r3) {
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
    }
}
