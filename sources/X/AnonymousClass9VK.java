package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* renamed from: X.9VK  reason: invalid class name */
public class AnonymousClass9VK {
    public static AnonymousClass9VK A06;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public Handler A04 = new Handler(Looper.getMainLooper(), new AnonymousClass9XO(this));
    public final C194439Sw A05 = new C194439Sw();

    public static synchronized AnonymousClass9VK A00() {
        AnonymousClass9VK r0;
        synchronized (AnonymousClass9VK.class) {
            r0 = A06;
            if (r0 == null) {
                r0 = new AnonymousClass9VK();
                A06 = r0;
            }
        }
        return r0;
    }

    public void A01() {
        long j = this.A01;
        if (j == 0) {
            this.A01 = SystemClock.elapsedRealtime();
            A02(5, this.A00);
            return;
        }
        A02(3, j);
        this.A01 = SystemClock.elapsedRealtime();
    }

    public final void A02(int i, long j) {
        if (!this.A05.A00.isEmpty()) {
            Handler handler = this.A04;
            Message obtain = Message.obtain(handler, i);
            obtain.arg1 = (int) (SystemClock.elapsedRealtime() - j);
            handler.sendMessage(obtain);
        }
    }
}
