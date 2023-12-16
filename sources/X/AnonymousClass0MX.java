package X;

import android.os.Handler;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0MX  reason: invalid class name */
public class AnonymousClass0MX {
    public final int A00;
    public final Handler A01;
    public final C16820u1 A02;
    public final Runnable A03;
    public final List A04 = Collections.synchronizedList(new LinkedList());

    public AnonymousClass0MX(Handler handler, C16820u1 r6, int i) {
        C11290jP r3 = new C11290jP(this);
        this.A03 = r3;
        this.A02 = r6;
        this.A01 = handler;
        this.A00 = i;
        handler.postDelayed(r3, TimeUnit.SECONDS.toMillis((long) i));
    }
}
