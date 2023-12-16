package X;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.7Zr  reason: invalid class name and case insensitive filesystem */
public final class C152647Zr {
    public boolean A00;
    public final C186668vk A01;
    public final C178298hJ A02;
    public final C180798le A03;
    public final C181318mZ A04;
    public final ArrayDeque A05 = AnonymousClass6CA.A0a();
    public final ArrayDeque A06 = AnonymousClass6CA.A0a();
    public final CopyOnWriteArraySet A07;

    public void A00() {
        ArrayDeque arrayDeque = this.A06;
        if (!arrayDeque.isEmpty()) {
            Handler handler = ((C1692188l) this.A02).A00;
            if (!handler.hasMessages(0)) {
                handler.obtainMessage(0).sendToTarget();
            }
            ArrayDeque arrayDeque2 = this.A05;
            boolean z = !arrayDeque2.isEmpty();
            arrayDeque2.addAll(arrayDeque);
            arrayDeque.clear();
            if (!z) {
                while (!arrayDeque2.isEmpty()) {
                    ((Runnable) arrayDeque2.peekFirst()).run();
                    arrayDeque2.removeFirst();
                }
            }
        }
    }

    public void A01() {
        CopyOnWriteArraySet copyOnWriteArraySet = this.A07;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            C151717Wa r3 = (C151717Wa) it.next();
            C180798le r2 = this.A03;
            r3.A02 = true;
            if (r3.A01) {
                r2.BGo(r3.A00, r3.A03);
            }
        }
        copyOnWriteArraySet.clear();
        this.A00 = true;
    }

    public void A02(C835148s r5, int i) {
        this.A06.add(new C71733ca((Object) r5, (Object) new CopyOnWriteArraySet(this.A07), i, 0));
    }

    public C152647Zr(Looper looper, C186668vk r4, C180798le r5, C181318mZ r6, CopyOnWriteArraySet copyOnWriteArraySet) {
        this.A01 = r4;
        this.A07 = copyOnWriteArraySet;
        this.A04 = r6;
        this.A03 = r5;
        this.A02 = new C1692188l(new Handler(looper, new AnonymousClass91L(this, 1)));
    }
}
