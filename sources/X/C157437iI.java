package X;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.locks.Lock;

/* renamed from: X.7iI  reason: invalid class name and case insensitive filesystem */
public final class C157437iI {
    public static C157437iI A03;
    public GoogleSignInAccount A00;
    public GoogleSignInOptions A01;
    public final C161417pa A02;

    /* JADX INFO: finally extract failed */
    public final synchronized void A01() {
        C161417pa r0 = this.A02;
        Lock lock = r0.A01;
        lock.lock();
        try {
            C18270x1.A0m(r0.A00);
            lock.unlock();
            this.A00 = null;
            this.A01 = null;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    public static synchronized C157437iI A00(Context context) {
        C157437iI r0;
        synchronized (C157437iI.class) {
            Context applicationContext = context.getApplicationContext();
            r0 = A03;
            if (r0 == null) {
                r0 = new C157437iI(applicationContext);
                A03 = r0;
            }
        }
        return r0;
    }

    public C157437iI(Context context) {
        C161417pa A002 = C161417pa.A00(context);
        this.A02 = A002;
        this.A00 = A002.A01();
        this.A01 = A002.A02();
    }
}
