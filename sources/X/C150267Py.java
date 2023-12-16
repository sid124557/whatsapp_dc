package X;

import android.os.Handler;
import android.os.MessageQueue;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.7Py  reason: invalid class name and case insensitive filesystem */
public class C150267Py {
    public MessageQueue.IdleHandler A00;
    public final Handler A01;
    public final Handler A02;
    public final AnonymousClass8LG A03;
    public final C156817hG A04;
    public final Map A05 = AnonymousClass0x7.A0y();
    public final ConcurrentLinkedQueue A06 = new ConcurrentLinkedQueue();
    public final AtomicReference A07 = new AtomicReference();
    public volatile boolean A08 = false;
    public volatile boolean A09;
    public volatile boolean A0A = true;

    public C150267Py(Handler handler, Handler handler2, AnonymousClass8LG r5, C156817hG r6) {
        this.A03 = r5;
        this.A04 = r6;
        this.A01 = handler;
        this.A02 = handler2;
        if (r5.enableStopWarmupSchedulerEmpty) {
            this.A00 = new AnonymousClass92A(this, 1);
        }
    }
}
