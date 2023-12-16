package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.83g  reason: invalid class name and case insensitive filesystem */
public class C1679083g implements C187528xM, C187488xI {
    public long A00;
    public AnonymousClass7OL A01;
    public final C180348kt A02;
    public final C153397bF A03;
    public final C153397bF A04;
    public final C177798gT A05;
    public final C180408kz A06;
    public final Map A07 = new WeakHashMap();

    public final synchronized C172258Kh A01(AnonymousClass7NX r6) {
        C172258Kh r0;
        synchronized (this) {
            C153877cA.A01(AnonymousClass000.A1T(r6.A01 ? 1 : 0));
            r6.A00++;
            r0 = new C172258Kh(C172258Kh.A04, (C180368kv) new AnonymousClass82O(r6, this), r6.A02.A03());
        }
        return r0;
    }

    public final synchronized C172258Kh A02(AnonymousClass7NX r2) {
        C172258Kh r0;
        r2.getClass();
        if (!r2.A01 || r2.A00 != 0) {
            r0 = null;
        } else {
            r0 = r2.A02;
        }
        return r0;
    }

    public void A03() {
        ArrayList arrayList;
        Object obj;
        synchronized (this) {
            AnonymousClass7OL r0 = this.A01;
            int i = r0.A03;
            int i2 = r0.A00;
            C153397bF r7 = this.A03;
            int A002 = r7.A00();
            C153397bF r3 = this.A04;
            int A0A = AnonymousClass6C9.A0A(i2, A002 - r3.A00(), i);
            AnonymousClass7OL r02 = this.A01;
            int A0A2 = AnonymousClass6C9.A0A(r02.A02, r7.A01() - r3.A01(), r02.A04);
            int max = Math.max(A0A, 0);
            int max2 = Math.max(A0A2, 0);
            if (r3.A00() > max || r3.A01() > max2) {
                arrayList = AnonymousClass001.A0s();
                while (true) {
                    if (r3.A00() > max || r3.A01() > max2) {
                        synchronized (r3) {
                            try {
                                LinkedHashMap linkedHashMap = r3.A02;
                                if (linkedHashMap.isEmpty()) {
                                    obj = null;
                                } else {
                                    obj = C18290x4.A11(linkedHashMap).next();
                                }
                            } catch (Throwable th) {
                                th = th;
                            }
                        }
                        if (obj == null) {
                            Object[] A0M = AnonymousClass002.A0M();
                            AnonymousClass000.A1P(A0M, r3.A00(), 0);
                            AnonymousClass000.A1M(A0M, r3.A01());
                            th = AnonymousClass001.A0e(String.format("key is null, but exclusiveEntries count: %d, size: %d", A0M));
                            break;
                        }
                        r3.A02(obj);
                        arrayList.add((AnonymousClass7NX) r7.A02(obj));
                    }
                }
                throw th;
            }
            arrayList = null;
            A06(arrayList);
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C172258Kh A022 = A02((AnonymousClass7NX) it.next());
                if (A022 != null) {
                    A022.close();
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                A00((AnonymousClass7NX) it2.next());
            }
        }
    }

    public final synchronized void A04() {
        if (this.A00 + this.A01.A05 <= SystemClock.uptimeMillis()) {
            this.A00 = SystemClock.uptimeMillis();
            AnonymousClass7OL r1 = (AnonymousClass7OL) this.A02.get();
            C153877cA.A00(r1, "mMemoryCacheParamsSupplier returned null");
            this.A01 = r1;
        }
    }

    public final synchronized void A05(AnonymousClass7NX r3) {
        r3.getClass();
        C153877cA.A01(AnonymousClass000.A1T(r3.A01 ? 1 : 0));
        r3.A01 = true;
    }

    public final synchronized void A06(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                A05((AnonymousClass7NX) it.next());
            }
        }
    }

    public C172258Kh AyG(C172258Kh r11, AnonymousClass7AQ r12, Object obj) {
        AnonymousClass7NX r4;
        C172258Kh r8;
        C172258Kh r7;
        A04();
        synchronized (this) {
            C153397bF r6 = this.A04;
            r4 = (AnonymousClass7NX) r6.A02(obj);
            C153397bF r3 = this.A03;
            AnonymousClass7NX r0 = (AnonymousClass7NX) r3.A02(obj);
            r8 = null;
            if (r0 != null) {
                A05(r0);
                r7 = A02(r0);
            } else {
                r7 = null;
            }
            int BD7 = this.A06.BD7(r11.A03());
            if (BD7 <= this.A01.A01) {
                if (r3.A00() - r6.A00() <= this.A01.A00 - 1) {
                    if (r3.A01() - r6.A01() <= this.A01.A02 - BD7) {
                        AnonymousClass7NX r02 = new AnonymousClass7NX(r11, r12, obj);
                        r3.A04(obj, r02);
                        r8 = A01(r02);
                    }
                }
            }
        }
        if (r7 != null) {
            r7.close();
        }
        A00(r4);
        A03();
        return r8;
    }

    public C172258Kh B3z(Object obj) {
        AnonymousClass7NX r2;
        Object obj2;
        C172258Kh r0;
        synchronized (this) {
            r2 = (AnonymousClass7NX) this.A04.A02(obj);
            C153397bF r1 = this.A03;
            synchronized (r1) {
                obj2 = r1.A02.get(obj);
            }
            AnonymousClass7NX r02 = (AnonymousClass7NX) obj2;
            if (r02 != null) {
                r0 = A01(r02);
            } else {
                r0 = null;
            }
        }
        A00(r2);
        A04();
        A03();
        return r0;
    }

    public static void A00(AnonymousClass7NX r2) {
        AnonymousClass7AQ r0;
        if (r2 != null && (r0 = r2.A03) != null) {
            Object obj = r2.A04;
            C149217Lm r1 = r0.A00;
            synchronized (r1) {
                r1.A03.remove(obj);
            }
        }
    }

    public C1679083g(C180348kt r3, C177798gT r4, C180408kz r5) {
        this.A06 = r5;
        this.A04 = new C153397bF(new C1679583l(this, r5));
        this.A03 = new C153397bF(new C1679583l(this, r5));
        this.A05 = r4;
        this.A02 = r3;
        Object obj = r3.get();
        C153877cA.A00(obj, "mMemoryCacheParamsSupplier returned null");
        this.A01 = (AnonymousClass7OL) obj;
        this.A00 = SystemClock.uptimeMillis();
    }
}
