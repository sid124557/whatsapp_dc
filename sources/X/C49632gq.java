package X;

import android.os.SystemClock;
import com.whatsapp.util.Log;

/* renamed from: X.2gq  reason: invalid class name and case insensitive filesystem */
public class C49632gq {
    public int A00 = 1;
    public int A01 = -1;
    public long A02;
    public final AnonymousClass4FV A03;

    public void A00() {
        if (this.A01 == 1) {
            Log.d("cameraopentracker/abort");
            this.A01 = 0;
            this.A00 = 1;
        }
    }

    public void A01(String str) {
        if (this.A01 != 1) {
            this.A01 = -1;
            return;
        }
        Log.d("cameraopentracker/stop");
        AnonymousClass1Y8 r2 = new AnonymousClass1Y8();
        r2.A01 = Long.valueOf(SystemClock.elapsedRealtime() - this.A02);
        r2.A02 = str;
        r2.A00 = Integer.valueOf(this.A00);
        this.A03.BhE(r2, 5);
        this.A01 = -1;
        this.A00 = 1;
    }

    public C49632gq(AnonymousClass4FV r2) {
        this.A03 = r2;
    }
}
