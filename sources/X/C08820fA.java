package X;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.0fA  reason: invalid class name and case insensitive filesystem */
public final class C08820fA implements C16100sT {
    public static final ReentrantLock A04 = new ReentrantLock();
    public static volatile C08820fA A05;
    public C16710tq A00;
    public final C08830fB A01;
    public final CopyOnWriteArrayList A02 = new CopyOnWriteArrayList();
    public final CopyOnWriteArraySet A03;

    public void Bii(C03020In r3) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.A03;
        if (!copyOnWriteArraySet.contains(r3)) {
            copyOnWriteArraySet.add(r3);
            C16710tq r0 = this.A00;
            if (r0 != null) {
                r0.BnP(copyOnWriteArraySet);
            }
        }
    }

    public C08820fA(C16710tq r3) {
        this.A00 = r3;
        C08830fB r1 = new C08830fB(this);
        this.A01 = r1;
        C16710tq r0 = this.A00;
        if (r0 != null) {
            r0.BmD(r1);
        }
        this.A03 = new CopyOnWriteArraySet();
    }
}
