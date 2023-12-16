package X;

import android.app.Activity;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.0fI  reason: invalid class name and case insensitive filesystem */
public final class C08900fI implements C16730ts {
    public static final ReentrantLock A02 = new ReentrantLock();
    public static volatile C08900fI A03;
    public C16720tr A00;
    public final CopyOnWriteArrayList A01 = new CopyOnWriteArrayList();

    public void Bie(Activity activity, C15790rw r7, Executor executor) {
        Object obj;
        AnonymousClass0P8 r2;
        C162457s7.A0J(activity, 0);
        ReentrantLock reentrantLock = A02;
        reentrantLock.lock();
        try {
            C16720tr r22 = this.A00;
            if (r22 == null) {
                r7.AwB(new AnonymousClass0P8(AnonymousClass8UF.A0n()));
            } else {
                boolean A012 = A01(activity);
                AnonymousClass0MA r3 = new AnonymousClass0MA(activity, r7, executor);
                CopyOnWriteArrayList copyOnWriteArrayList = this.A01;
                copyOnWriteArrayList.add(r3);
                if (!A012) {
                    C08870fF r23 = (C08870fF) r22;
                    IBinder A002 = C03060Ir.A00(activity);
                    if (A002 != null) {
                        r23.A02(activity, A002);
                    } else {
                        AnonymousClass001.A0Q(activity).addOnAttachStateChangeListener(new C06980a8(activity, r23));
                    }
                } else {
                    Iterator it = copyOnWriteArrayList.iterator();
                    do {
                        obj = null;
                        if (!it.hasNext()) {
                            break;
                        }
                        obj = it.next();
                    } while (!activity.equals(((AnonymousClass0MA) obj).A01));
                    AnonymousClass0MA r1 = (AnonymousClass0MA) obj;
                    if (!(r1 == null || (r2 = r1.A00) == null)) {
                        r3.A00 = r2;
                        r3.A03.execute(new C11990kn(r3, r2));
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public void BrN(C15790rw r7) {
        C162457s7.A0J(r7, 0);
        synchronized (A02) {
            if (this.A00 != null) {
                ArrayList A0s = AnonymousClass001.A0s();
                CopyOnWriteArrayList copyOnWriteArrayList = this.A01;
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    AnonymousClass0MA r1 = (AnonymousClass0MA) it.next();
                    if (r1.A02 == r7) {
                        A0s.add(r1);
                    }
                }
                copyOnWriteArrayList.removeAll(A0s);
                Iterator it2 = A0s.iterator();
                while (it2.hasNext()) {
                    A00(((AnonymousClass0MA) it2.next()).A01);
                }
            }
        }
    }

    public final void A00(Activity activity) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A01;
        if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (C162457s7.A0P(((AnonymousClass0MA) it.next()).A01, activity)) {
                    return;
                }
            }
        }
        C16720tr r0 = this.A00;
        if (r0 != null) {
            r0.Bfp(activity);
        }
    }

    public final boolean A01(Activity activity) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A01;
        if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (C162457s7.A0P(((AnonymousClass0MA) it.next()).A01, activity)) {
                    return true;
                }
            }
        }
        return false;
    }

    public C08900fI(C16720tr r3) {
        this.A00 = r3;
        C16720tr r1 = this.A00;
        if (r1 != null) {
            r1.BmF(new C08850fD(this));
        }
    }
}
