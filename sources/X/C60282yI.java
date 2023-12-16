package X;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2yI  reason: invalid class name and case insensitive filesystem */
public class C60282yI {
    public static final AtomicInteger A09 = new AtomicInteger(0);
    public final C70513ac A00;
    public final AnonymousClass337 A01;
    public final AnonymousClass4FX A02;
    public final C85144Fc A03;
    public final AnonymousClass2TS A04;
    public final AnonymousClass4FS A05;
    public final C183538qC A06;
    public final ArrayBlockingQueue A07;
    public final ConcurrentHashMap A08;

    public final void A00(int i) {
        ConcurrentHashMap concurrentHashMap = this.A08;
        Integer valueOf = Integer.valueOf(i);
        AtomicInteger atomicInteger = (AtomicInteger) concurrentHashMap.get(valueOf);
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
            AtomicInteger atomicInteger2 = (AtomicInteger) concurrentHashMap.putIfAbsent(valueOf, atomicInteger);
            if (atomicInteger2 != null) {
                atomicInteger = atomicInteger2;
            }
        }
        atomicInteger.incrementAndGet();
    }

    public final void A01(AnonymousClass30Y r8, int i) {
        C58542vQ r6 = r8.A05;
        if (r6 != C58542vQ.A02) {
            for (C84884Ec r1 : r6.A00) {
                if (i != 1) {
                    r1.BRu(r8);
                } else {
                    r1.Bc8(r8);
                }
            }
            for (C84884Ec r2 : r6.A01) {
                if (this.A07.offer(new C42652Oz(r2, r8, i))) {
                    A00(r8.A01);
                } else {
                    this.A02.Axd();
                }
            }
            this.A05.BkN(this.A00, "qpl_bg_listeners");
        }
    }

    public C60282yI(AnonymousClass337 r7, AnonymousClass4FX r8, C85144Fc r9, AnonymousClass2TS r10, AnonymousClass4FS r11, C183538qC r12) {
        this.A06 = r12;
        this.A05 = r11;
        this.A02 = r8;
        this.A01 = r7;
        this.A03 = r9;
        this.A04 = r10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(100);
        this.A07 = arrayBlockingQueue;
        ConcurrentHashMap A1D = AnonymousClass0x9.A1D();
        this.A08 = A1D;
        this.A00 = new C70513ac(arrayBlockingQueue, A1D, r8, r12, 14);
    }
}
