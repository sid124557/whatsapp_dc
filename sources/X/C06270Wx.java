package X;

import androidx.lifecycle.LiveData$LifecycleBoundObserver;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0Wx  reason: invalid class name and case insensitive filesystem */
public abstract class C06270Wx {
    public static final Object A0A = AnonymousClass002.A0D();
    public int A00;
    public int A01;
    public C10610iE A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final Object A06;
    public final Runnable A07;
    public volatile Object A08;
    public volatile Object A09;

    public static void A02(C15910sA r1, C06270Wx r2, int i) {
        r2.A0B(r1, new C09920gy(r1, i));
    }

    public Object A07() {
        Object obj = this.A08;
        if (obj == A0A) {
            return null;
        }
        return obj;
    }

    public void A08() {
    }

    public void A09() {
    }

    public void A0A(C15910sA r4) {
        A06("removeObservers");
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(it);
            if (((AnonymousClass0QG) A0w.getValue()).A03(r4)) {
                A0F((C15930sC) A0w.getKey());
            }
        }
    }

    public void A0B(C15910sA r3, C15930sC r4) {
        A06("observe");
        if (((AnonymousClass08A) r3.getLifecycle()).A02 != AnonymousClass0GC.DESTROYED) {
            LiveData$LifecycleBoundObserver liveData$LifecycleBoundObserver = new LiveData$LifecycleBoundObserver(r3, this, r4);
            AnonymousClass0QG r0 = (AnonymousClass0QG) this.A02.A02(r4, liveData$LifecycleBoundObserver);
            if (r0 == null) {
                r3.getLifecycle().A00(liveData$LifecycleBoundObserver);
            } else if (!r0.A03(r3)) {
                throw AnonymousClass001.A0c("Cannot add the same observer with different lifecycles");
            }
        }
    }

    public void A0C(AnonymousClass0QG r5) {
        if (this.A05) {
            this.A04 = true;
            return;
        }
        this.A05 = true;
        do {
            this.A04 = false;
            if (r5 == null) {
                C10610iE r0 = this.A02;
                C13500nH r2 = new C13500nH(r0);
                r0.A03.put(r2, Boolean.FALSE);
                while (r2.hasNext()) {
                    A0D((AnonymousClass0QG) ((Map.Entry) r2.next()).getValue());
                    if (this.A04) {
                        break;
                    }
                }
            } else {
                A0D(r5);
                r5 = null;
            }
        } while (this.A04);
        this.A05 = false;
    }

    public final void A0D(AnonymousClass0QG r3) {
        if (!r3.A01) {
            return;
        }
        if (!r3.A02()) {
            r3.A01(false);
            return;
        }
        int i = r3.A00;
        int i2 = this.A01;
        if (i < i2) {
            r3.A00 = i2;
            r3.A02.BOf(this.A08);
        }
    }

    public void A0E(C15930sC r4) {
        A06("observeForever");
        AnonymousClass08E r2 = new AnonymousClass08E(this, r4);
        Object A022 = this.A02.A02(r4, r2);
        if (A022 instanceof LiveData$LifecycleBoundObserver) {
            throw AnonymousClass001.A0c("Cannot add the same observer with different lifecycles");
        } else if (A022 == null) {
            r2.A01(true);
        }
    }

    public void A0F(C15930sC r3) {
        A06("removeObserver");
        AnonymousClass0QG r1 = (AnonymousClass0QG) this.A02.A01(r3);
        if (r1 != null) {
            r1.A00();
            r1.A01(false);
        }
    }

    public void A0G(Object obj) {
        boolean A1Y;
        synchronized (this.A06) {
            A1Y = AnonymousClass000.A1Y(this.A09, A0A);
            this.A09 = obj;
        }
        if (A1Y) {
            C004004h.A00().A02(this.A07);
        }
    }

    public void A0H(Object obj) {
        A06("setValue");
        this.A01++;
        this.A08 = obj;
        A0C((AnonymousClass0QG) null);
    }

    public C06270Wx(Object obj) {
        this.A06 = AnonymousClass002.A0D();
        this.A02 = new C10610iE();
        this.A00 = 0;
        this.A09 = A0A;
        this.A07 = new C11000iw(this);
        this.A08 = obj;
        this.A01 = 0;
    }

    public static void A03(C06270Wx r1, int i) {
        r1.A0H(Integer.valueOf(i));
    }

    public static void A04(C06270Wx r1, int i) {
        r1.A0G(Integer.valueOf(i));
    }

    public static void A05(C06270Wx r1, boolean z) {
        r1.A0G(Boolean.valueOf(z));
    }

    public static void A06(String str) {
        if (!C004004h.A00().A03()) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Cannot invoke ");
            A0o.append(str);
            throw AnonymousClass000.A0I(" on a background thread", A0o);
        }
    }

    public C06270Wx() {
        this.A06 = AnonymousClass002.A0D();
        this.A02 = new C10610iE();
        this.A00 = 0;
        Object obj = A0A;
        this.A09 = obj;
        this.A07 = new C11000iw(this);
        this.A08 = obj;
        this.A01 = -1;
    }
}
