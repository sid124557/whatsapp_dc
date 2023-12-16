package X;

import android.os.Handler;
import java.util.concurrent.Callable;

/* renamed from: X.0lp  reason: invalid class name and case insensitive filesystem */
public class C12610lp implements Runnable {
    public Handler A00;
    public C15790rw A01;
    public Callable A02;

    public void run() {
        Object obj;
        try {
            obj = this.A02.call();
        } catch (Exception unused) {
            obj = null;
        }
        this.A00.post(new C12600lo(this, this.A01, obj));
    }

    public C12610lp(Handler handler, C15790rw r2, Callable callable) {
        this.A02 = callable;
        this.A01 = r2;
        this.A00 = handler;
    }
}
