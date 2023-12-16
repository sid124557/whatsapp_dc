package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.30x  reason: invalid class name and case insensitive filesystem */
public class C614730x {
    public final C55682qk A00;
    public final C56972sr A01;
    public final AnonymousClass3LR A02;
    public final AnonymousClass2GB A03;
    public final AnonymousClass1VX A04;
    public final Object A05 = AnonymousClass002.A0D();
    public final List A06 = Collections.synchronizedList(AnonymousClass0x9.A18());
    public final ConcurrentHashMap A07 = AnonymousClass0x9.A1D();
    public final ConcurrentHashMap A08 = AnonymousClass0x9.A1D();

    public static C73523fe A01(C621133n r0, C54422oh r1) {
        C73523fe A052 = r0.A0K.A05(r1);
        A052.lock();
        return A052;
    }

    public C73523fe A03() {
        C54562ov r2;
        C135196kH A032 = C56972sr.A03(this.A01);
        if (A032 != null) {
            r2 = AnonymousClass36G.A02(A032);
        } else {
            r2 = new C54562ov("", 0, 0);
        }
        return A00(r2, this);
    }

    public final C73523fe A04(C54562ov r4) {
        ConcurrentHashMap concurrentHashMap = this.A07;
        Integer valueOf = Integer.valueOf(Math.abs(A06(r4).hashCode()) % 512);
        if (!concurrentHashMap.containsKey(valueOf)) {
            concurrentHashMap.putIfAbsent(valueOf, new C73523fe(this));
        }
        return (C73523fe) C18290x4.A0i(valueOf, concurrentHashMap);
    }

    public final C73523fe A05(C54422oh r4) {
        ConcurrentHashMap concurrentHashMap = this.A08;
        StringBuilder A0o = AnonymousClass001.A0o();
        C18290x4.A1R(A0o, r4.A01);
        Integer valueOf = Integer.valueOf(Math.abs(AnonymousClass000.A0X(A06(r4.A00), A0o).hashCode()) % 32);
        if (!concurrentHashMap.containsKey(valueOf)) {
            concurrentHashMap.putIfAbsent(valueOf, new C73523fe(this));
        }
        return (C73523fe) C18290x4.A0i(valueOf, concurrentHashMap);
    }

    public final String A06(C54562ov r4) {
        if (r4.A01 != 0) {
            try {
                PhoneUserJid A022 = this.A03.A00.A02(C383127a.A00(r4.A02));
                if (A022 != null) {
                    r4 = AnonymousClass36G.A02(DeviceJid.Companion.A01(A022, r4.A00));
                }
            } catch (AnonymousClass24P e) {
                Log.e("SignalLocks/getPhoneNumberSignalAddressIfAvailable", e);
            }
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(r4.A02);
        A0o.append(".");
        return AnonymousClass000.A0h(A0o, r4.A01);
    }

    public final boolean A0B() {
        Set<AnonymousClass37P> set;
        AnonymousClass3LR r5 = this.A02;
        if (r5 == null) {
            return false;
        }
        synchronized (r5) {
            set = r5.A00;
            if (set.size() == 0) {
                for (C838149w r2 : r5.A01) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    C18260x0.A1T(A0o, "TransactionLockManager/ensureInit:", r2);
                    AnonymousClass0x2.A18(A0o);
                    set.add(r2.BAE());
                }
            }
        }
        for (AnonymousClass37P r22 : set) {
            ThreadLocal threadLocal = r22.A01;
            if (threadLocal.get() != null) {
                Object obj = threadLocal.get();
                C626936e.A06(obj);
                if (AnonymousClass001.A1Z(obj)) {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("TransactionLockManager/inTransactionOnCurrentThread/transaction is in progress ");
                    C18260x0.A1M(A0o2, r22.A00);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A0C(Set set) {
        boolean z;
        synchronized (this.A05) {
            HashSet A0K = AnonymousClass002.A0K();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                Lock lock = (Lock) it.next();
                if (!lock.tryLock()) {
                    break;
                }
                A0K.add(lock);
            }
            z = true;
            if (A0K.size() != set.size()) {
                z = false;
                A02(A0K);
            }
        }
        return z;
    }

    public C614730x(C55682qk r2, C56972sr r3, AnonymousClass3LR r4, AnonymousClass2GB r5, AnonymousClass1VX r6) {
        this.A04 = r6;
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = r5;
        this.A02 = r4;
    }

    public static C73523fe A00(C54562ov r0, C614730x r1) {
        C73523fe A042 = r1.A04(r0);
        r1.A08(A042);
        return A042;
    }

    public static void A02(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((Lock) it.next()).unlock();
        }
    }

    public Set A07(Set set) {
        if (set.isEmpty()) {
            return AnonymousClass002.A0K();
        }
        HashSet hashSet = new HashSet(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(A04((C54562ov) it.next()));
        }
        return hashSet;
    }

    public final void A08(C73523fe r4) {
        if (A0B() || !this.A04.A0Y(C58422vE.A02, 4831)) {
            r4.lock();
        } else {
            A0A(AnonymousClass0x9.A15(Collections.singleton(r4)));
        }
    }

    public void A09(Set set) {
        if (set.size() == 1) {
            A08((C73523fe) set.iterator().next());
        } else if (A0B() || !this.A04.A0Y(C58422vE.A02, 4831)) {
            while (!A0C(set)) {
                CountDownLatch A14 = C18290x4.A14();
                List list = this.A06;
                list.add(A14);
                try {
                    A14.await(10, TimeUnit.SECONDS);
                } catch (InterruptedException unused) {
                }
                list.remove(A14);
            }
        } else {
            A0A(AnonymousClass0x9.A15(set));
        }
    }

    public final void A0A(Set set) {
        if (!A0C(set)) {
            HashMap A0t = AnonymousClass001.A0t();
            Iterator A0u = AnonymousClass001.A0u(this.A07);
            while (A0u.hasNext()) {
                ReentrantLock reentrantLock = (ReentrantLock) AnonymousClass0x2.A0W(A0u);
                if (reentrantLock.isHeldByCurrentThread()) {
                    AnonymousClass0x2.A1I(reentrantLock, A0t, reentrantLock.getHoldCount());
                }
            }
            Iterator A0u2 = AnonymousClass001.A0u(A0t);
            while (true) {
                if (!A0u2.hasNext()) {
                    break;
                }
                Map.Entry A0w = AnonymousClass001.A0w(A0u2);
                for (int i = 0; i < AnonymousClass0x2.A08(A0w); i++) {
                    ((Lock) A0w.getKey()).unlock();
                }
            }
            set.addAll(A0t.keySet());
            while (!A0C(set)) {
                CountDownLatch A14 = C18290x4.A14();
                List list = this.A06;
                list.add(A14);
                try {
                    A14.await(10, TimeUnit.SECONDS);
                } catch (InterruptedException unused) {
                }
                list.remove(A14);
            }
            Iterator A0u3 = AnonymousClass001.A0u(A0t);
            while (A0u3.hasNext()) {
                Map.Entry A0w2 = AnonymousClass001.A0w(A0u3);
                for (int i2 = 0; i2 < AnonymousClass0x2.A08(A0w2) - 1; i2++) {
                    ((Lock) A0w2.getKey()).lock();
                }
            }
        }
    }
}
