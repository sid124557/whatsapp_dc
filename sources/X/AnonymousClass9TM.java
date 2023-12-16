package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.9TM  reason: invalid class name */
public class AnonymousClass9TM {
    public AnonymousClass9V8 A00;
    public final C192559Ko A01;
    public final C192899Md A02;
    public final C107185aq A03;
    public final AnonymousClass59x A04;
    public final C1001959y A05;
    public final Object A06 = AnonymousClass002.A0D();
    public final List A07 = AnonymousClass001.A0s();
    public final Map A08 = AnonymousClass001.A0t();
    public final Map A09 = AnonymousClass001.A0t();
    public final Queue A0A = new PriorityBlockingQueue(10, new C204569pZ(this, 0));

    public final List A00() {
        if (Thread.holdsLock(this.A06)) {
            List list = this.A07;
            ArrayList A0J = AnonymousClass002.A0J(list);
            list.clear();
            return A0J;
        }
        throw AnonymousClass001.A0e("Should always be called while holding lock");
    }

    public final void A01() {
        if (this.A00 == null) {
            Queue queue = this.A0A;
            if (!queue.isEmpty()) {
                AnonymousClass9V8 r3 = (AnonymousClass9V8) queue.poll();
                this.A00 = r3;
                C195349Xk r7 = r3.A04;
                Map map = this.A08;
                if (!map.containsKey(r3)) {
                    boolean A1Y = AnonymousClass000.A1Y(r3.A00, C192369Jj.PAUSED);
                    C107185aq r8 = this.A03;
                    C193909Qr r6 = new C193909Qr(r3, this);
                    boolean z = true ^ r3.A01;
                    AtomicBoolean A0l = C18280x3.A0l();
                    r8.A04.execute(new C201359jw(r6, r7, r8, A0l, z));
                    AnonymousClass9YR r1 = new AnonymousClass9YR(A0l);
                    r3.A00(C192369Jj.STARTED);
                    map.put(r3, r1);
                    this.A07.add(new C200819iw(r3, this, A1Y));
                    return;
                }
                throw new IllegalStateException();
            }
        }
    }

    public final void A02(List list) {
        if (!Thread.holdsLock(this.A06)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            return;
        }
        throw AnonymousClass001.A0e("Should never be called while holding lock");
    }

    public AnonymousClass9TM(C192559Ko r4, C177748gO r5, C107185aq r6, AnonymousClass59x r7, C1001959y r8) {
        this.A03 = r6;
        this.A05 = r8;
        this.A04 = r7;
        TimeUnit.SECONDS.toMillis(1);
        this.A02 = new C192899Md(r5);
        this.A01 = r4;
    }
}
