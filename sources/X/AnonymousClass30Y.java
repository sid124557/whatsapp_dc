package X;

import android.util.Pair;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.30Y  reason: invalid class name */
public class AnonymousClass30Y {
    public static final AtomicInteger A0I = new AtomicInteger(0);
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final AnonymousClass4FX A04;
    public final C58542vQ A05;
    public final C60282yI A06;
    public final Integer A07;
    public final ConcurrentHashMap A08 = AnonymousClass0x9.A1D();
    public final ConcurrentHashMap A09 = AnonymousClass0x9.A1D();
    public final ConcurrentHashMap A0A = AnonymousClass0x9.A1D();
    public final ConcurrentHashMap A0B = AnonymousClass0x9.A1D();
    public final AtomicInteger A0C = new AtomicInteger(0);
    public final AtomicInteger A0D = new AtomicInteger(-1);
    public final AtomicInteger A0E = new AtomicInteger(0);
    public final AtomicLong A0F = new AtomicLong(-1);
    public final boolean A0G;
    public final boolean A0H;

    public void A01(long j, String str, String str2) {
        AtomicInteger atomicInteger = this.A0E;
        if (atomicInteger.get() >= 1000) {
            this.A04.BKv(this.A00);
        } else if (str.length() > 50) {
            this.A04.Bgw(this.A00, str);
        } else if (str2 == null || str2.length() <= 1000) {
            AnonymousClass0x2.A1H(new AnonymousClass3ZI(j, str, str2), this.A0B, atomicInteger.getAndIncrement());
        } else {
            this.A04.Bgv(this.A00, str2);
        }
    }

    public void A02(long j, short s) {
        if (this.A0F.compareAndSet(-1, j)) {
            this.A0D.set(s);
            this.A06.A01(this, 2);
        }
    }

    public boolean A04(String str) {
        AtomicInteger atomicInteger = this.A0E;
        int i = atomicInteger.get() - 1;
        while (i >= 0) {
            ConcurrentHashMap concurrentHashMap = this.A0B;
            AnonymousClass3ZI r1 = (AnonymousClass3ZI) C18290x4.A0j(concurrentHashMap, i);
            if (r1 == null || !r1.A02.equals(str)) {
                i--;
            } else {
                long j = r1.A00;
                this.A0F.set(j);
                for (int i2 = atomicInteger.get() - 1; i2 >= 0; i2--) {
                    AnonymousClass3ZI r0 = (AnonymousClass3ZI) C18290x4.A0j(concurrentHashMap, i2);
                    if (r0 != null && r0.A00 > j) {
                        AnonymousClass0x7.A1K(concurrentHashMap, i2);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public AnonymousClass30Y(AnonymousClass4FX r4, C58542vQ r5, C60282yI r6, Integer num, int i, long j, long j2, boolean z, boolean z2) {
        this.A04 = r4;
        this.A06 = r6;
        this.A00 = i;
        this.A05 = r5;
        this.A07 = num;
        this.A03 = j2;
        this.A02 = j;
        this.A0H = z;
        this.A01 = A0I.incrementAndGet();
        this.A0G = z2;
    }

    public void A00(int i, String str, Object obj) {
        if (str.length() > 50) {
            this.A04.Ax2(this.A00, str);
            return;
        }
        AtomicInteger atomicInteger = this.A0C;
        if (atomicInteger.get() + i >= 1000) {
            this.A04.Ax4(this.A00, str, i);
            return;
        }
        atomicInteger.addAndGet(i);
        if (this.A08.putIfAbsent(str, obj) != null) {
            atomicInteger.addAndGet(-i);
        }
    }

    public void A03(Serializable serializable, String str, String str2) {
        Pair A0C2 = AnonymousClass0x9.A0C(str, str2);
        ConcurrentHashMap concurrentHashMap = this.A0A;
        if (serializable == null) {
            concurrentHashMap.remove(A0C2);
        } else {
            concurrentHashMap.put(A0C2, serializable);
        }
    }
}
