package X;

import com.whatsapp.util.Log;

/* renamed from: X.2fR  reason: invalid class name and case insensitive filesystem */
public class C48772fR {
    public boolean A00;
    public final StringBuilder A01 = AnonymousClass001.A0o();

    public synchronized void A00() {
        this.A00 = true;
    }

    public void A01(String str, int i) {
        boolean z;
        if (i == 1) {
            Log.d(str);
        } else if (i == 2) {
            Log.i(str);
        } else if (i == 3) {
            Log.w(str);
        } else if (i == 4) {
            Log.e(str);
        }
        synchronized (this) {
            z = this.A00;
        }
        if (z) {
            synchronized (this) {
                StringBuilder sb = this.A01;
                sb.append("\n");
                sb.append(str);
            }
        }
    }
}
