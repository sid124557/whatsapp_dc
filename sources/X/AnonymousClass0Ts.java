package X;

import androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
import java.util.ArrayDeque;
import java.util.Iterator;

/* renamed from: X.0Ts  reason: invalid class name */
public final class AnonymousClass0Ts {
    public final Runnable A00;
    public final ArrayDeque A01;

    public void A00() {
        Iterator descendingIterator = this.A01.descendingIterator();
        while (descendingIterator.hasNext()) {
            AnonymousClass0N7 r1 = (AnonymousClass0N7) descendingIterator.next();
            if (r1.A01) {
                r1.A00();
                return;
            }
        }
        Runnable runnable = this.A00;
        if (runnable != null) {
            runnable.run();
        }
    }

    public AnonymousClass0Ts(Runnable runnable) {
        this.A01 = new ArrayDeque();
        this.A00 = runnable;
    }

    public void A01(AnonymousClass0N7 r4, C15910sA r5) {
        AnonymousClass0O9 lifecycle = r5.getLifecycle();
        if (((AnonymousClass08A) lifecycle).A02 != AnonymousClass0GC.DESTROYED) {
            r4.A00.add(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(r4, this, lifecycle));
        }
    }

    public AnonymousClass0Ts() {
        this((Runnable) null);
    }
}
