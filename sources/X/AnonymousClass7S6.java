package X;

import android.os.Looper;

/* renamed from: X.7S6  reason: invalid class name */
public class AnonymousClass7S6 {
    public Looper A00;
    public C178388hS A01;

    public C156227gG A00() {
        if (this.A01 == null) {
            this.A01 = new C1693689a();
        }
        Looper looper = this.A00;
        if (looper == null) {
            looper = Looper.getMainLooper();
            this.A00 = looper;
        }
        return new C156227gG(looper, this.A01);
    }
}
