package X;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.Queue;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;

@Deprecated
/* renamed from: X.7l6  reason: invalid class name and case insensitive filesystem */
public abstract class C159087l6 {
    public static final Set A00 = Collections.newSetFromMap(new WeakHashMap());

    public void A02() {
        boolean z;
        C127086Qo r6 = (C127086Qo) this;
        Lock lock = r6.A0J;
        lock.lock();
        try {
            Set set = r6.A0B.A01;
            for (BasePendingResult basePendingResult : (BasePendingResult[]) set.toArray(new BasePendingResult[0])) {
                basePendingResult.A0A.set((Object) null);
                synchronized (basePendingResult.A06) {
                    if (((C159087l6) basePendingResult.A07.get()) == null || !basePendingResult.A04) {
                        basePendingResult.A03();
                    }
                    z = basePendingResult.A02;
                }
                if (z) {
                    set.remove(basePendingResult);
                }
            }
            C186128un r0 = r6.A01;
            if (r0 != null) {
                r0.Bt8();
            }
            Set<C148737Jn> set2 = r6.A09.A00;
            for (C148737Jn r1 : set2) {
                r1.A02 = null;
                r1.A01 = null;
            }
            set2.clear();
            Queue<C127186Qz> queue = r6.A0I;
            for (C127186Qz r2 : queue) {
                r2.A0A.set((Object) null);
                r2.A03();
            }
            queue.clear();
            if (r6.A01 != null) {
                r6.A08();
                C162977t4 r12 = r6.A0E;
                r12.A08 = false;
                r12.A07.incrementAndGet();
            }
        } finally {
            lock.unlock();
        }
    }

    public boolean A04() {
        C186128un r0 = ((C127086Qo) this).A01;
        if (r0 == null || !r0.BtB()) {
            return false;
        }
        return true;
    }

    public abstract void A05();

    public C127186Qz A01(C127186Qz r7) {
        if (this instanceof C127076Qn) {
            ((C127076Qn) this).A00.A03(r7, 1);
            return r7;
        }
        C127086Qo r5 = (C127086Qo) this;
        C148727Jm r2 = r7.A01;
        boolean containsKey = r5.A0G.containsKey(r7.A00);
        String str = r2.A02;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("GoogleApiClient is not configured to use ");
        A0o.append(str);
        String A0X = AnonymousClass000.A0X(" required for this call.", A0o);
        if (containsKey) {
            Lock lock = r5.A0J;
            lock.lock();
            try {
                C186128un r1 = r5.A01;
                if (r1 != null) {
                    if (r5.A0K) {
                        Queue queue = r5.A0I;
                        queue.add(r7);
                        while (!queue.isEmpty()) {
                            C127186Qz r22 = (C127186Qz) queue.remove();
                            C156237gH r12 = r5.A0B;
                            r12.A01.add(r22);
                            r22.A0A.set(r12.A00);
                            r22.A09(Status.A07);
                        }
                    } else {
                        r7 = r1.Bt2(r7);
                    }
                    return r7;
                }
                throw AnonymousClass001.A0e("GoogleApiClient is not connected yet.");
            } finally {
                lock.unlock();
            }
        } else {
            throw AnonymousClass6C7.A0U(A0X);
        }
    }

    public void A03(C127186Qz r6) {
        if (this instanceof C127076Qn) {
            ((C127076Qn) this).A00.A03(r6, 0);
            return;
        }
        C127086Qo r4 = (C127086Qo) this;
        C148727Jm r2 = r6.A01;
        boolean containsKey = r4.A0G.containsKey(r6.A00);
        String str = r2.A02;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("GoogleApiClient is not configured to use ");
        A0o.append(str);
        String A0X = AnonymousClass000.A0X(" required for this call.", A0o);
        if (containsKey) {
            Lock lock = r4.A0J;
            lock.lock();
            try {
                C186128un r0 = r4.A01;
                if (r0 == null) {
                    r4.A0I.add(r6);
                } else {
                    r0.Bsz(r6);
                }
            } finally {
                lock.unlock();
            }
        } else {
            throw AnonymousClass6C7.A0U(A0X);
        }
    }
}
