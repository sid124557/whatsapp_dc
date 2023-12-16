package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.46G  reason: invalid class name */
public class AnonymousClass46G extends AnonymousClass47B implements AnonymousClass4GW, C183558qE, AnonymousClass4C3 {
    public static final AtomicIntegerFieldUpdater A02;
    public static final AtomicReferenceFieldUpdater A03;
    public static final AtomicReferenceFieldUpdater A04;
    public final C84814Du A00;
    public final C85494Gl A01;
    public volatile int _decisionAndIndex = 536870911;
    public volatile Object _parentHandle;
    public volatile Object _state = C72763eF.A00;

    public static final Object A00(Object obj, AnonymousClass4GQ r4, C834548l r5, int i) {
        AnonymousClass467 r52;
        Object obj2 = obj;
        if ((obj instanceof AnonymousClass333) || ((i != 1 && i != 2) || (r4 == null && !(r5 instanceof AnonymousClass467)))) {
            return obj2;
        }
        if (r5 instanceof AnonymousClass467) {
            r52 = (AnonymousClass467) r5;
        } else {
            r52 = null;
        }
        return new C53372mz(obj2, (Object) null, (Throwable) null, r4, r52);
    }

    public final AnonymousClass2XH A09(Object obj, AnonymousClass4GQ r7) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A04;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof C834548l)) {
                return null;
            }
        } while (!AnonymousClass0H6.A00(this, obj2, A00(obj, r7, (C834548l) obj2, this.A00), atomicReferenceFieldUpdater));
        if (!A0J()) {
            A0B();
        }
        return C39202Bb.A00;
    }

    static {
        Class<AnonymousClass46G> cls = AnonymousClass46G.class;
        A02 = AtomicIntegerFieldUpdater.newUpdater(cls, "_decisionAndIndex");
        Class<Object> cls2 = Object.class;
        A04 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_state");
        A03 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_parentHandle");
    }

    public static final void A02(C84814Du r5, AnonymousClass47B r6, boolean z) {
        Object obj;
        AnonymousClass476 r0;
        if (r6 instanceof AnonymousClass46F) {
            AnonymousClass46F r1 = (AnonymousClass46F) r6;
            obj = r1.A00;
            r1.A00 = C58082ug.A01;
        } else {
            obj = A04.get(r6);
        }
        Throwable A05 = r6.A05(obj);
        if (A05 != null) {
            obj = AnonymousClass3Z0.A01(A05);
        } else if ((r6 instanceof AnonymousClass46G) && (obj instanceof C53372mz)) {
            obj = ((C53372mz) obj).A01;
        }
        if (z) {
            C162457s7.A0K(r5, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            AnonymousClass46F r52 = (AnonymousClass46F) r5;
            C84814Du r12 = r52.A02;
            Object obj2 = r52.A01;
            C85494Gl B5w = r12.B5w();
            Object A002 = AnonymousClass34N.A00(obj2, B5w);
            if (A002 != AnonymousClass34N.A03) {
                r0 = AnonymousClass348.A02(A002, r12, B5w);
            } else {
                r0 = null;
            }
            try {
                r12.BkD(obj);
            } finally {
                if (r0 == null || r0.A13()) {
                    AnonymousClass34N.A01(A002, B5w);
                }
            }
        } else {
            r5.BkD(obj);
        }
    }

    public void A0A() {
        C85474Gj A0v = C18310x6.A0v(this.A01);
        if (A0v != null) {
            AnonymousClass4C7 BGw = A0v.BGw(new AnonymousClass46R(this), true, true);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A03;
            AnonymousClass0H6.A00(this, (Object) null, BGw, atomicReferenceFieldUpdater);
            if (!(A04.get(this) instanceof C834548l)) {
                BGw.dispose();
                atomicReferenceFieldUpdater.set(this, C72713eA.A00);
            }
        }
    }

    public final void A0B() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A03;
        AnonymousClass4C7 r0 = (AnonymousClass4C7) atomicReferenceFieldUpdater.get(this);
        if (r0 != null) {
            r0.dispose();
            atomicReferenceFieldUpdater.set(this, C72713eA.A00);
        }
    }

    public final void A0C() {
        AnonymousClass2XH r0;
        C84814Du r4 = this.A00;
        if (r4 instanceof AnonymousClass46F) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AnonymousClass46F.A04;
            do {
                Object obj = atomicReferenceFieldUpdater.get(r4);
                r0 = C58082ug.A00;
                if (obj != r0) {
                    if (!(obj instanceof Throwable)) {
                        throw AnonymousClass000.A0H(obj, "Inconsistent state ", AnonymousClass001.A0o());
                    } else if (AnonymousClass0H6.A00(r4, obj, (Object) null, atomicReferenceFieldUpdater)) {
                        Throwable th = (Throwable) obj;
                        if (th != null) {
                            A0B();
                            AyY(th);
                            return;
                        }
                        return;
                    } else {
                        throw AnonymousClass001.A0c("Failed requirement.");
                    }
                }
            } while (!AnonymousClass0H6.A00(r4, r0, this, atomicReferenceFieldUpdater));
        }
    }

    public final void A0D(int i) {
        int i2;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A02;
        do {
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            boolean z = true;
            if (i3 != 0) {
                if (i3 == 1) {
                    C84814Du r6 = this.A00;
                    boolean z2 = true;
                    if (i != 4) {
                        z2 = false;
                        if (r6 instanceof AnonymousClass46F) {
                            boolean z3 = true;
                            if (!(i == 1 || i == 2)) {
                                z3 = false;
                            }
                            int i4 = this.A00;
                            if (!(i4 == 1 || i4 == 2)) {
                                z = false;
                            }
                            if (z3 == z) {
                                C73853gB r2 = ((AnonymousClass46F) r6).A03;
                                C85494Gl B5w = r6.B5w();
                                if (r2.A03(B5w)) {
                                    r2.A01(this, B5w);
                                    return;
                                }
                                AnonymousClass46B A002 = C57992uX.A00();
                                long j = A002.A00;
                                if (j >= 4294967296L) {
                                    A002.A06(this);
                                    return;
                                }
                                A002.A00 = j + 4294967296L;
                                try {
                                    A02(r6, this, true);
                                    do {
                                    } while (A002.A08());
                                } catch (Throwable th) {
                                    A002.A07(true);
                                    throw th;
                                }
                                A002.A07(true);
                                return;
                            }
                        }
                    }
                    A02(r6, this, z2);
                    return;
                }
                throw AnonymousClass001.A0e("Already resumed");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    public final void A0E(Object obj) {
        boolean A002;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A04;
        do {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof C72763eF) {
                A002 = AnonymousClass0H6.A00(this, obj2, obj, atomicReferenceFieldUpdater);
                continue;
            } else if ((obj2 instanceof AnonymousClass467) || (obj2 instanceof C175778Zr)) {
                A01(obj, obj2);
                throw AnonymousClass000.A0L();
            } else if (obj2 instanceof AnonymousClass333) {
                AnonymousClass333 r1 = (AnonymousClass333) obj2;
                if (!r1.A01()) {
                    A01(obj, obj2);
                    throw AnonymousClass000.A0L();
                } else if (obj2 instanceof AnonymousClass469) {
                    Throwable th = r1.A00;
                    if (obj instanceof AnonymousClass467) {
                        A0H(th, (AnonymousClass467) obj);
                        return;
                    }
                    C162457s7.A0K(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                    A0I((C175778Zr) obj);
                    return;
                } else {
                    return;
                }
            } else if (obj2 instanceof C53372mz) {
                C53372mz r2 = (C53372mz) obj2;
                if (r2.A04 != null) {
                    A01(obj, obj2);
                    throw AnonymousClass000.A0L();
                } else if (!(obj instanceof C175778Zr)) {
                    C162457s7.A0K(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    AnonymousClass467 r7 = (AnonymousClass467) obj;
                    Throwable th2 = r2.A02;
                    if (th2 != null) {
                        A0H(th2, r7);
                        return;
                    }
                    A002 = AnonymousClass0H6.A00(this, obj2, new C53372mz(r2.A01, r2.A00, th2, r2.A03, r7), atomicReferenceFieldUpdater);
                    continue;
                } else {
                    return;
                }
            } else if (!(obj instanceof C175778Zr)) {
                C162457s7.A0K(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                A002 = AnonymousClass0H6.A00(this, obj2, new C53372mz(obj2, (Object) null, (Throwable) null, (AnonymousClass4GQ) null, (AnonymousClass467) obj), atomicReferenceFieldUpdater);
                continue;
            } else {
                return;
            }
        } while (!A002);
    }

    public final void A0F(Object obj, AnonymousClass4GQ r5, int i) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A04;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof C834548l)) {
                if (obj2 instanceof AnonymousClass469) {
                    AnonymousClass469 r1 = (AnonymousClass469) obj2;
                    if (r1.A02()) {
                        if (r5 != null) {
                            A0G(r1.A00, r5);
                            return;
                        }
                        return;
                    }
                }
                throw AnonymousClass000.A0H(obj, "Already resumed, but proposed with update ", AnonymousClass001.A0o());
            }
        } while (!AnonymousClass0H6.A00(this, obj2, A00(obj, r5, (C834548l) obj2, i), atomicReferenceFieldUpdater));
        if (!A0J()) {
            A0B();
        }
        A0D(i);
    }

    public final void A0I(C175778Zr r5) {
        int i = A02.get(this) & 536870911;
        if (i != 536870911) {
            try {
                r5.A05(i);
            } catch (Throwable th) {
                C1453575e.A00(this.A01, new C73163f2(AnonymousClass000.A0P(this, "Exception in invokeOnCancellation handler for ", AnonymousClass001.A0o()), th));
            }
        } else {
            throw AnonymousClass001.A0e("The index for Segment.onCancellation(..) is broken");
        }
    }

    public final boolean A0J() {
        if (this.A00 == 2) {
            C84814Du r1 = this.A00;
            C162457s7.A0K(r1, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (AnonymousClass46F.A04.get(r1) == null) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean AyY(Throwable th) {
        Object obj;
        boolean z;
        boolean z2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A04;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            z = false;
            if (!(obj instanceof C834548l)) {
                return false;
            }
            z2 = obj instanceof AnonymousClass467;
            if (z2 || (obj instanceof C175778Zr)) {
                z = true;
            }
        } while (!AnonymousClass0H6.A00(this, obj, new AnonymousClass469(th, this, z), atomicReferenceFieldUpdater));
        if (z2) {
            A0H(th, (AnonymousClass467) obj);
        } else if (obj instanceof C175778Zr) {
            A0I((C175778Zr) obj);
        }
        if (!A0J()) {
            A0B();
        }
        A0D(this.A00);
        return true;
    }

    public void AzI(Object obj) {
        A0D(this.A00);
    }

    public AnonymousClass4C3 B5B() {
        C84814Du r1 = this.A00;
        if (r1 instanceof AnonymousClass4C3) {
            return (AnonymousClass4C3) r1;
        }
        return null;
    }

    public void BGs(AnonymousClass4GQ r2) {
        if (!(r2 instanceof AnonymousClass467)) {
            r2 = new AnonymousClass464(r2);
        }
        A0E(r2);
    }

    public void BGt(C175778Zr r5, int i) {
        int i2;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A02;
        do {
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                throw AnonymousClass001.A0e("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        A0E(r5);
    }

    public void BkA(AnonymousClass4GQ r2, Object obj) {
        A0F(obj, r2, this.A00);
    }

    public void BkC(Object obj, C73853gB r5) {
        int i;
        AnonymousClass46F r2;
        C84814Du r22 = this.A00;
        C73853gB r0 = null;
        if ((r22 instanceof AnonymousClass46F) && (r2 = (AnonymousClass46F) r22) != null) {
            r0 = r2.A03;
        }
        if (r0 == r5) {
            i = 4;
        } else {
            i = this.A00;
        }
        A0F(obj, (AnonymousClass4GQ) null, i);
    }

    public AnonymousClass46G(C84814Du r2, int i) {
        super(i);
        this.A00 = r2;
        this.A01 = r2.B5w();
    }

    public static final void A01(Object obj, Object obj2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("It's prohibited to register multiple handlers, tried to register ");
        A0o.append(obj);
        throw AnonymousClass000.A0H(obj2, ", already has ", A0o);
    }

    public Throwable A05(Object obj) {
        Throwable A05 = super.A05(obj);
        if (A05 == null) {
            return null;
        }
        return A05;
    }

    public final Object A06() {
        int i;
        C85474Gj A0v;
        C85474Gj A0v2;
        boolean A0J = A0J();
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A02;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 2) {
                    if (A0J) {
                        A0C();
                    }
                    Object obj = A04.get(this);
                    if (!(obj instanceof AnonymousClass333)) {
                        int i3 = this.A00;
                        if ((i3 == 1 || i3 == 2) && (A0v = C18310x6.A0v(this.A01)) != null && !A0v.BGz()) {
                            CancellationException B5G = A0v.B5G();
                            A03(B5G);
                            throw B5G;
                        } else if (obj instanceof C53372mz) {
                            return ((C53372mz) obj).A01;
                        } else {
                            return obj;
                        }
                    } else {
                        throw ((AnonymousClass333) obj).A00;
                    }
                } else {
                    throw AnonymousClass001.A0e("Already suspended");
                }
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A03;
        if (atomicReferenceFieldUpdater.get(this) == null && (A0v2 = C18310x6.A0v(this.A01)) != null) {
            AnonymousClass0H6.A00(this, (Object) null, A0v2.BGw(new AnonymousClass46R(this), true, true), atomicReferenceFieldUpdater);
        }
        if (A0J) {
            A0C();
        }
        return AnonymousClass218.COROUTINE_SUSPENDED;
    }

    public String A07() {
        return "CancellableContinuation";
    }

    public Throwable A08(C85474Gj r2) {
        return r2.B5G();
    }

    public final void A0G(Throwable th, AnonymousClass4GQ r6) {
        try {
            r6.invoke(th);
        } catch (Throwable th2) {
            C1453575e.A00(this.A01, new C73163f2(AnonymousClass000.A0P(this, "Exception in resume onCancellation handler for ", AnonymousClass001.A0o()), th2));
        }
    }

    public final void A0H(Throwable th, AnonymousClass467 r6) {
        try {
            r6.A00(th);
        } catch (Throwable th2) {
            C1453575e.A00(this.A01, new C73163f2(AnonymousClass000.A0P(this, "Exception in invokeOnCancellation handler for ", AnonymousClass001.A0o()), th2));
        }
    }

    public C85494Gl B5w() {
        return this.A01;
    }

    public void BkD(Object obj) {
        Throwable A002 = AnonymousClass3Z9.A00(obj);
        if (A002 != null) {
            obj = new AnonymousClass333(A002);
        }
        A0F(obj, (AnonymousClass4GQ) null, this.A00);
    }

    public Object BrC(Object obj, Object obj2, AnonymousClass4GQ r4) {
        return A09(obj, r4);
    }

    public String toString() {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(A07());
        A0o.append('(');
        A0o.append(AnonymousClass2AG.A00(this.A00));
        A0o.append("){");
        Object obj = A04.get(this);
        if (obj instanceof C834548l) {
            str = "Active";
        } else if (obj instanceof AnonymousClass469) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        A0o.append(str);
        A0o.append("}@");
        return AnonymousClass000.A0X(Integer.toHexString(System.identityHashCode(this)), A0o);
    }
}
