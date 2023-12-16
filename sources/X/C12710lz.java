package X;

import android.content.Intent;
import java.util.concurrent.Executor;

/* renamed from: X.0lz  reason: invalid class name and case insensitive filesystem */
public class C12710lz implements Runnable {
    public final int A00;
    public final Intent A01;
    public final C09000fU A02;

    public static void A00(Intent intent, C09000fU r2, Executor executor, int i) {
        executor.execute(new C12710lz(intent, r2, i));
    }

    public void run() {
        this.A02.A02(this.A01, this.A00);
    }

    public C12710lz(Intent intent, C09000fU r2, int i) {
        this.A02 = r2;
        this.A01 = intent;
        this.A00 = i;
    }
}
