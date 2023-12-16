package X;

import android.util.SparseArray;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.82n  reason: invalid class name and case insensitive filesystem */
public class C1677882n implements C186188ut {
    public C172258Kh A00;
    public final SparseArray A01 = AnonymousClass6CA.A0I();
    public final C149217Lm A02;
    public final boolean A03;

    public synchronized boolean Aza(int i) {
        boolean containsKey;
        C149217Lm r0 = this.A02;
        C187528xM r3 = r0.A02;
        AnonymousClass82D r2 = new AnonymousClass82D(r0.A00, i);
        C1679083g r32 = (C1679083g) r3;
        synchronized (r32) {
            C153397bF r1 = r32.A03;
            synchronized (r1) {
                containsKey = r1.A02.containsKey(r2);
            }
        }
        return containsKey;
    }

    public synchronized C172258Kh B4f(int i, int i2, int i3) {
        C183708qU r1;
        C172258Kh r0;
        AnonymousClass7NX r3;
        boolean z;
        if (!this.A03) {
            return null;
        }
        C149217Lm r5 = this.A02;
        while (true) {
            synchronized (r5) {
                try {
                    Iterator it = r5.A03.iterator();
                    if (it.hasNext()) {
                        r1 = (C183708qU) it.next();
                        it.remove();
                    } else {
                        r1 = null;
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            }
            if (r1 != null) {
                C1679083g r4 = (C1679083g) r5.A02;
                synchronized (r4) {
                    try {
                        r3 = (AnonymousClass7NX) r4.A04.A02(r1);
                        z = false;
                        if (r3 != null) {
                            AnonymousClass7NX r12 = (AnonymousClass7NX) r4.A03.A02(r1);
                            r12.getClass();
                            if (r12.A00 == 0) {
                                z = true;
                            }
                            C153877cA.A01(z);
                            r0 = r12.A02;
                            z = true;
                        } else {
                            r0 = null;
                        }
                    } catch (Throwable th2) {
                        while (true) {
                            th = th2;
                            break;
                        }
                    }
                }
                if (z) {
                    C1679083g.A00(r3);
                    continue;
                }
                if (r0 != null) {
                    break;
                }
            } else {
                r0 = null;
                break;
            }
        }
        return A00(r0);
    }

    public synchronized C172258Kh B54(int i) {
        C149217Lm r0;
        r0 = this.A02;
        return A00(r0.A02.B3z(new AnonymousClass82D(r0.A00, i)));
    }

    public synchronized C172258Kh B7Z(int i) {
        C172258Kh r0;
        C172258Kh r02 = this.A00;
        if (r02 != null) {
            r0 = r02.A02();
        } else {
            r0 = null;
        }
        return A00(r0);
    }

    public synchronized void BTq(C172258Kh r6, int i, int i2) {
        try {
            AnonymousClass6MZ r2 = new AnonymousClass6MZ(r6, C157847iz.A00);
            C172258Kh r4 = new C172258Kh(C172258Kh.A04, C172258Kh.A05, (Object) r2);
            try {
                C149217Lm r3 = this.A02;
                C172258Kh AyG = r3.A02.AyG(r4, r3.A01, new AnonymousClass82D(r3.A00, i));
                if (C172258Kh.A01(AyG)) {
                    SparseArray sparseArray = this.A01;
                    C172258Kh r0 = (C172258Kh) sparseArray.get(i);
                    if (r0 != null) {
                        r0.close();
                    }
                    sparseArray.put(i, AyG);
                    C161577py.A01(C1677882n.class, Integer.valueOf(i), sparseArray, "cachePreparedFrame(%d) cached. Pending frames: %s");
                }
                r4.close();
            } catch (Throwable th) {
                th = th;
                r4.close();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public synchronized void BTs(C172258Kh r7, int i, int i2) {
        synchronized (this) {
            try {
                SparseArray sparseArray = this.A01;
                C172258Kh r0 = (C172258Kh) sparseArray.get(i);
                if (r0 != null) {
                    sparseArray.delete(i);
                    r0.close();
                    C161577py.A01(C1677882n.class, Integer.valueOf(i), sparseArray, "removePreparedReference(%d) removed. Pending frames: %s");
                }
                AnonymousClass6MZ r2 = new AnonymousClass6MZ(r7, C157847iz.A00);
                C172258Kh r4 = new C172258Kh(C172258Kh.A04, C172258Kh.A05, (Object) r2);
                try {
                    C172258Kh r02 = this.A00;
                    if (r02 != null) {
                        r02.close();
                    }
                    C149217Lm r3 = this.A02;
                    this.A00 = r3.A02.AyG(r4, r3.A01, new AnonymousClass82D(r3.A00, i));
                    r4.close();
                } catch (Throwable th) {
                    th = th;
                    r4.close();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    public synchronized void clear() {
        C172258Kh r0 = this.A00;
        if (r0 != null) {
            r0.close();
        }
        this.A00 = null;
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.A01;
            if (i < sparseArray.size()) {
                C172258Kh r02 = (C172258Kh) sparseArray.valueAt(i);
                if (r02 != null) {
                    r02.close();
                }
                i++;
            } else {
                sparseArray.clear();
            }
        }
    }

    public boolean BH1() {
        return false;
    }

    public boolean BMR(Map map) {
        return true;
    }

    public C1677882n(C149217Lm r2, boolean z) {
        this.A02 = r2;
        this.A03 = z;
    }

    public static C172258Kh A00(C172258Kh r2) {
        AnonymousClass6Ma r1;
        C172258Kh r0;
        try {
            if (C172258Kh.A01(r2)) {
                if ((r2.A03() instanceof AnonymousClass6Ma) && (r1 = (AnonymousClass6Ma) r2.A03()) != null) {
                    synchronized (r1) {
                        C172258Kh r02 = r1.A00;
                        if (r02 != null) {
                            r0 = r02.A02();
                        } else {
                            r0 = null;
                        }
                    }
                    r2.close();
                    return r0;
                }
            } else if (r2 == null) {
                return null;
            }
            r2.close();
            return null;
        } catch (Throwable th) {
            if (r2 != null) {
                r2.close();
            }
            throw th;
        }
    }
}
