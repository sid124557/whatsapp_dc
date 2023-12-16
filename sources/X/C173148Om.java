package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: X.8Om  reason: invalid class name and case insensitive filesystem */
public class C173148Om implements Executor {
    public final /* synthetic */ C159037kz A00;

    public C173148Om(C159037kz r1) {
        this.A00 = r1;
    }

    public void execute(Runnable runnable) {
        Handler A002 = C161147p5.A00();
        Object obj = this.A00.A05;
        A002.removeCallbacksAndMessages(obj);
        A002.postAtTime(runnable, obj, 0);
    }
}
