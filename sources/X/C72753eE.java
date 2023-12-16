package X;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.3eE  reason: invalid class name and case insensitive filesystem */
public class C72753eE implements C85474Gj {
    public static final AtomicReferenceFieldUpdater A00;
    public static final AtomicReferenceFieldUpdater A01;
    public volatile Object _parentHandle;
    public volatile Object _state;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        if (r4 == null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        A0c(r4, r2.B98());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0C(java.lang.Object r7) {
        /*
            r6 = this;
            r4 = 0
            r5 = r4
        L_0x0002:
            java.lang.Object r3 = r6.A0A()
            boolean r0 = r3 instanceof X.C72743eD
            if (r0 == 0) goto L_0x003a
            monitor-enter(r3)
            r2 = r3
            X.3eD r2 = (X.C72743eD) r2     // Catch:{ all -> 0x0070 }
            boolean r0 = r2.A0A()     // Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x0019
            X.2XH r0 = X.AnonymousClass36I.A06     // Catch:{ all -> 0x0070 }
            goto L_0x006e
        L_0x0019:
            boolean r0 = r2.A08()     // Catch:{ all -> 0x0070 }
            if (r5 != 0) goto L_0x0023
            java.lang.Throwable r5 = r6.A0N(r7)     // Catch:{ all -> 0x0070 }
        L_0x0023:
            r2.A06(r5)     // Catch:{ all -> 0x0070 }
            java.lang.Throwable r1 = r2.A02()     // Catch:{ all -> 0x0070 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x002f
            r4 = r1
        L_0x002f:
            monitor-exit(r3)
            if (r4 == 0) goto L_0x0053
            X.46z r0 = r2.B98()
            r6.A0c(r4, r0)
            goto L_0x0053
        L_0x003a:
            boolean r0 = r3 instanceof X.C84834Dw
            if (r0 == 0) goto L_0x007e
            if (r5 != 0) goto L_0x0044
            java.lang.Throwable r5 = r6.A0N(r7)
        L_0x0044:
            r1 = r3
            X.4Dw r1 = (X.C84834Dw) r1
            boolean r0 = r1.BGz()
            if (r0 == 0) goto L_0x0058
            boolean r0 = r6.A0w(r5, r1)
            if (r0 == 0) goto L_0x0002
        L_0x0053:
            X.2XH r0 = X.AnonymousClass36I.A02
            return r0
        L_0x0058:
            X.333 r0 = new X.333
            r0.<init>(r5)
            java.lang.Object r1 = r6.A0E(r3, r0)
            X.2XH r0 = X.AnonymousClass36I.A02
            if (r1 == r0) goto L_0x0073
            X.2XH r0 = X.AnonymousClass36I.A03
            if (r1 == r0) goto L_0x0002
            return r1
        L_0x006e:
            monitor-exit(r3)
            return r0
        L_0x0070:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0073:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Cannot happen in "
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0H(r3, r0, r1)
            throw r0
        L_0x007e:
            X.2XH r0 = X.AnonymousClass36I.A06
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72753eE.A0C(java.lang.Object):java.lang.Object");
    }

    public final AnonymousClass4C7 BGv(AnonymousClass4GQ r3) {
        return BGw(r3, false, true);
    }

    public Object fold(Object obj, AnonymousClass4GR r3) {
        C162457s7.A0J(r3, 2);
        return r3.invoke(obj, this);
    }

    public C85484Gk get(C834148h r3) {
        if (!C18290x4.A1X(r3, this)) {
            return null;
        }
        return this;
    }

    public C85494Gl minusKey(C834148h r3) {
        if (C18290x4.A1X(r3, this)) {
            return C72553du.A00;
        }
        return this;
    }

    static {
        Class<C72753eE> cls = C72753eE.class;
        Class<Object> cls2 = Object.class;
        A01 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_state");
        A00 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_parentHandle");
    }

    public static final String A00(Object obj) {
        if (obj instanceof C72743eD) {
            C72743eD r2 = (C72743eD) obj;
            if (r2.A08()) {
                return "Cancelling";
            }
            if (r2.A09()) {
                return "Completing";
            }
            return "Active";
        } else if (obj instanceof C84834Dw) {
            if (!((C84834Dw) obj).BGz()) {
                return "New";
            }
            return "Active";
        } else if (obj instanceof AnonymousClass333) {
            return "Cancelled";
        } else {
            return "Completed";
        }
    }

    public static final Throwable A02(Object obj) {
        AnonymousClass333 r2;
        if (!(obj instanceof AnonymousClass333) || (r2 = (AnonymousClass333) obj) == null) {
            return null;
        }
        return r2.A00;
    }

    public final int A08(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2;
        if (obj instanceof C72733eC) {
            if (!((C72733eC) obj).A00) {
                atomicReferenceFieldUpdater = A01;
                obj2 = AnonymousClass36I.A00;
            }
            return 0;
        }
        if (obj instanceof C72723eB) {
            atomicReferenceFieldUpdater = A01;
            obj2 = ((C72723eB) obj).A00;
        }
        return 0;
        if (!AnonymousClass0H6.A00(this, obj, obj2, atomicReferenceFieldUpdater)) {
            return -1;
        }
        A0x();
        return 1;
    }

    public final Object A0A() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A01;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof C47802dq)) {
                return obj;
            }
            ((C47802dq) obj).A00(this);
        }
    }

    public final Object A0E(Object obj, Object obj2) {
        if (!(obj instanceof C84834Dw)) {
            return AnonymousClass36I.A02;
        }
        if ((!(obj instanceof C72733eC) && !(obj instanceof C830946c)) || (obj instanceof AnonymousClass46T) || (obj2 instanceof AnonymousClass333)) {
            return A0F(obj2, (C84834Dw) obj);
        }
        if (A0r(obj2, (C84834Dw) obj)) {
            return obj2;
        }
        return AnonymousClass36I.A03;
    }

    public final Object A0G(Object obj, C72743eD r5) {
        Throwable A0O;
        AnonymousClass333 r0;
        Throwable th = null;
        if ((obj instanceof AnonymousClass333) && (r0 = (AnonymousClass333) obj) != null) {
            th = r0.A00;
        }
        synchronized (r5) {
            r5.A08();
            List A03 = r5.A03(th);
            A0O = A0O(A03, r5);
            if (A0O != null) {
                A06(A0O, A03);
            }
        }
        if (A0O != null) {
            if (A0O != th) {
                obj = new AnonymousClass333(A0O);
            }
            if (A0v(A0O) || A0u(A0O)) {
                C162457s7.A0K(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                ((AnonymousClass333) obj).A01();
            }
        }
        A0W(obj);
        AnonymousClass0H6.A00(this, r5, AnonymousClass36I.A00(obj), A01);
        A0Y(obj, r5);
        return obj;
    }

    public final Throwable A0N(Object obj) {
        if (!(obj instanceof Throwable)) {
            return ((C72753eE) obj).A0P();
        }
        Throwable th = (Throwable) obj;
        if (th == null) {
            return new C73483fZ(A0K(), (Throwable) null, this);
        }
        return th;
    }

    public final CancellationException A0Q(String str, Throwable th) {
        CancellationException cancellationException;
        if ((th instanceof CancellationException) && (cancellationException = (CancellationException) th) != null) {
            return cancellationException;
        }
        if (str == null) {
            str = A0K();
        }
        return new C73483fZ(str, th, this);
    }

    public final C85454Gh A0R() {
        return (C85454Gh) A00.get(this);
    }

    public final AnonymousClass46T A0S(C84834Dw r3) {
        AnonymousClass46T r0;
        if ((r3 instanceof AnonymousClass46T) && (r0 = (AnonymousClass46T) r3) != null) {
            return r0;
        }
        C833246z B98 = r3.B98();
        if (B98 != null) {
            return A04(B98);
        }
        return null;
    }

    public final C830946c A0T(AnonymousClass4GQ r2, boolean z) {
        C830946c r0;
        if (z) {
            if (!(r2 instanceof AnonymousClass46V) || (r0 = (C830946c) r2) == null) {
                r0 = new AnonymousClass46S(r2);
            }
        } else if (!(r2 instanceof C830946c) || (r0 = (C830946c) r2) == null) {
            r0 = new AnonymousClass46X(r2);
        }
        r0.A00 = this;
        return r0;
    }

    public void A0V(Object obj) {
    }

    public void A0W(Object obj) {
    }

    public void A0a(Throwable th) {
        throw th;
    }

    public final void A0e(C85454Gh r2) {
        A00.set(this, r2);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.3eB] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0f(X.C72733eC r3) {
        /*
            r2 = this;
            X.46z r1 = new X.46z
            r1.<init>()
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x000f
            X.3eB r0 = new X.3eB
            r0.<init>(r1)
            r1 = r0
        L_0x000f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = A01
            X.AnonymousClass0H6.A00(r2, r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72753eE.A0f(X.3eC):void");
    }

    public final void A0g(C85474Gj r3) {
        if (r3 != null) {
            r3.BpV();
            C85454Gh AxP = r3.AxP(this);
            A0e(AxP);
            if (BHF()) {
                AxP.dispose();
            } else {
                return;
            }
        }
        A0e(C72713eA.A00);
    }

    public final void A0h(C830946c r4) {
        C833246z r2 = new C833246z();
        C612930b.A01.lazySet(r2, r4);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C612930b.A00;
        atomicReferenceFieldUpdater.lazySet(r2, r4);
        while (true) {
            if (r4.A00() == r4) {
                if (AnonymousClass0H6.A00(r4, r4, r2, atomicReferenceFieldUpdater)) {
                    r2.A03(r4);
                    break;
                }
            } else {
                break;
            }
        }
        AnonymousClass0H6.A00(this, r4, r4.A02(), A01);
    }

    public final boolean A0q(Object obj, AnonymousClass46T r6, C72743eD r7) {
        while (r6.A00.BGw(new C830746a(obj, r6, r7, this), false, false) == C72713eA.A00) {
            r6 = A04(r6);
            if (r6 == null) {
                return false;
            }
        }
        return true;
    }

    public final boolean A0r(Object obj, C84834Dw r4) {
        if (!AnonymousClass0H6.A00(this, r4, AnonymousClass36I.A00(obj), A01)) {
            return false;
        }
        A0W(obj);
        A0Y(obj, r4);
        return true;
    }

    public final boolean A0s(Object obj, C830946c r6, C833246z r7) {
        C612930b A012;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AnonymousClass470 r3 = new AnonymousClass470(obj, this, r6);
        do {
            A012 = r7.A01();
            if (A012 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C612930b.A01;
                Object obj2 = atomicReferenceFieldUpdater2.get(r7);
                while (true) {
                    A012 = (C612930b) obj2;
                    if (!A012.A04()) {
                        break;
                    }
                    obj2 = atomicReferenceFieldUpdater2.get(A012);
                }
            }
            C612930b.A01.lazySet(r6, A012);
            atomicReferenceFieldUpdater = C612930b.A00;
            atomicReferenceFieldUpdater.lazySet(r6, r7);
            r3.A00 = r7;
        } while (!AnonymousClass0H6.A00(A012, r7, r3, atomicReferenceFieldUpdater));
        return AnonymousClass000.A1X(r3.A00(A012));
    }

    public boolean A0t(Throwable th) {
        if ((th instanceof CancellationException) || (A0o(th) && A0k())) {
            return true;
        }
        return false;
    }

    public boolean A0u(Throwable th) {
        return false;
    }

    public final C85454Gh AxP(C72753eE r3) {
        AnonymousClass4C7 BGw = BGw(new AnonymousClass46T(r3), true, true);
        C162457s7.A0K(BGw, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (C85454Gh) BGw;
    }

    public void AyX(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C73483fZ(A0K(), (Throwable) null, this);
        }
        A0Z(cancellationException);
    }

    public C72753eE(boolean z) {
        C72733eC A03;
        if (z) {
            A03 = AnonymousClass36I.A00;
        } else {
            A03 = AnonymousClass36I.A01;
        }
        this._state = A03;
    }

    public static final AnonymousClass46T A04(C612930b r3) {
        while (r3.A04()) {
            C612930b A012 = r3.A01();
            if (A012 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C612930b.A01;
                Object obj = atomicReferenceFieldUpdater.get(r3);
                while (true) {
                    A012 = (C612930b) obj;
                    if (!A012.A04()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(A012);
                }
            }
            r3 = A012;
        }
        while (true) {
            r3 = r3.A02();
            if (!r3.A04()) {
                if (r3 instanceof AnonymousClass46T) {
                    return (AnonymousClass46T) r3;
                }
                if (r3 instanceof C833246z) {
                    return null;
                }
            }
        }
    }

    public static final void A06(Throwable th, List list) {
        if (list.size() > 1) {
            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Throwable th2 = (Throwable) it.next();
                if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                    C154507dH.A00(th, th2);
                }
            }
        }
    }

    public final Object A09() {
        Object A0A = A0A();
        if (!(!(A0A instanceof C84834Dw))) {
            throw AnonymousClass001.A0e("This job has not completed yet");
        } else if (!(A0A instanceof AnonymousClass333)) {
            return AnonymousClass36I.A01(A0A);
        } else {
            throw ((AnonymousClass333) A0A).A00;
        }
    }

    public final Object A0B(Object obj) {
        Object A0E;
        do {
            Object A0A = A0A();
            if (!(A0A instanceof C84834Dw) || ((A0A instanceof C72743eD) && ((C72743eD) A0A).A09())) {
                return AnonymousClass36I.A02;
            }
            A0E = A0E(A0A, new AnonymousClass333(A0N(obj)));
        } while (A0E == AnonymousClass36I.A03);
        return A0E;
    }

    public final Object A0D(Object obj) {
        Object A0E;
        do {
            A0E = A0E(A0A(), obj);
            if (A0E == AnonymousClass36I.A02) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Job ");
                A0o.append(this);
                throw new IllegalStateException(AnonymousClass000.A0P(obj, " is already complete or completing, but is being completed with ", A0o), A02(obj));
            }
        } while (A0E == AnonymousClass36I.A03);
        return A0E;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003c, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0064, code lost:
        if (r4 == null) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0066, code lost:
        A0c(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0069, code lost:
        r0 = A0S(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x006d, code lost:
        if (r0 == null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0073, code lost:
        if (A0q(r8, r0, r3) == false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0077, code lost:
        return X.AnonymousClass36I.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x007c, code lost:
        return A0G(r8, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0F(java.lang.Object r8, X.C84834Dw r9) {
        /*
            r7 = this;
            X.46z r5 = r7.A0U(r9)
            if (r5 != 0) goto L_0x000b
            X.2XH r0 = X.AnonymousClass36I.A03
            return r0
        L_0x000b:
            boolean r0 = r9 instanceof X.C72743eD
            r4 = 0
            if (r0 == 0) goto L_0x001d
            r3 = r9
            X.3eD r3 = (X.C72743eD) r3
        L_0x0013:
            r6 = 0
            if (r3 != 0) goto L_0x001b
            X.3eD r3 = new X.3eD
            r3.<init>(r4, r5)
        L_0x001b:
            monitor-enter(r3)
            goto L_0x001f
        L_0x001d:
            r3 = r4
            goto L_0x0013
        L_0x001f:
            boolean r0 = r3.A09()     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x002a
            X.2XH r0 = X.AnonymousClass36I.A02     // Catch:{ all -> 0x007d }
            goto L_0x003b
        L_0x002a:
            r3.A04()     // Catch:{ all -> 0x007d }
            if (r3 == r9) goto L_0x003d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = A01     // Catch:{ all -> 0x007d }
            boolean r0 = X.AnonymousClass0H6.A00(r7, r9, r3, r0)     // Catch:{ all -> 0x007d }
            if (r0 != 0) goto L_0x003d
            X.2XH r0 = X.AnonymousClass36I.A03     // Catch:{ all -> 0x007d }
        L_0x003b:
            monitor-exit(r3)
            return r0
        L_0x003d:
            boolean r2 = r3.A08()     // Catch:{ all -> 0x007d }
            boolean r0 = r8 instanceof X.AnonymousClass333     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x0049
            r0 = r8
            X.333 r0 = (X.AnonymousClass333) r0     // Catch:{ all -> 0x007d }
            goto L_0x004a
        L_0x0049:
            r0 = r4
        L_0x004a:
            if (r0 == 0) goto L_0x0051
            java.lang.Throwable r0 = r0.A00     // Catch:{ all -> 0x007d }
            r3.A06(r0)     // Catch:{ all -> 0x007d }
        L_0x0051:
            java.lang.Throwable r1 = r3.A02()     // Catch:{ all -> 0x007d }
            if (r2 != 0) goto L_0x0058
            r6 = 1
        L_0x0058:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x007d }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x0063
            r4 = r1
        L_0x0063:
            monitor-exit(r3)
            if (r4 == 0) goto L_0x0069
            r7.A0c(r4, r5)
        L_0x0069:
            X.46T r0 = r7.A0S(r9)
            if (r0 == 0) goto L_0x0078
            boolean r0 = r7.A0q(r8, r0, r3)
            if (r0 == 0) goto L_0x0078
            X.2XH r0 = X.AnonymousClass36I.A04
            return r0
        L_0x0078:
            java.lang.Object r0 = r7.A0G(r8, r3)
            return r0
        L_0x007d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72753eE.A0F(java.lang.Object, X.4Dw):java.lang.Object");
    }

    public final Object A0H(C84814Du r3) {
        Object A0A;
        do {
            A0A = A0A();
            if (!(A0A instanceof C84834Dw)) {
                if (!(A0A instanceof AnonymousClass333)) {
                    return AnonymousClass36I.A01(A0A);
                }
                throw ((AnonymousClass333) A0A).A00;
            }
        } while (A08(A0A) < 0);
        return A0I(r3);
    }

    public final Object A0I(C84814Du r4) {
        AnonymousClass468 r2 = new AnonymousClass468(C57702u4.A01(r4), this);
        r2.A0A();
        r2.BGs(new AnonymousClass463(BGv(new AnonymousClass46Y(r2))));
        return r2.A06();
    }

    public final Object A0J(C84814Du r4) {
        AnonymousClass46G A03 = C57702u4.A03(r4);
        A03.BGs(new AnonymousClass463(BGv(new AnonymousClass46Z(A03))));
        Object A06 = A03.A06();
        if (A06 == AnonymousClass218.COROUTINE_SUSPENDED) {
            return A06;
        }
        return C59022wD.A00;
    }

    public String A0K() {
        return "Job was cancelled";
    }

    public String A0L() {
        return C18310x6.A0n(this);
    }

    public final String A0M() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(A0L());
        A0o.append('{');
        A0o.append(A00(A0A()));
        return AnonymousClass000.A0d(A0o);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Throwable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Throwable A0O(java.util.List r6, X.C72743eD r7) {
        /*
            r5 = this;
            boolean r0 = r6.isEmpty()
            r4 = 0
            if (r0 == 0) goto L_0x0017
            boolean r0 = r7.A08()
            if (r0 == 0) goto L_0x0055
            java.lang.String r1 = r5.A0K()
            X.3fZ r0 = new X.3fZ
            r0.<init>(r1, r4, r5)
            return r0
        L_0x0017:
            java.util.Iterator r2 = r6.iterator()
        L_0x001b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0030
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof java.util.concurrent.CancellationException
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x001b
        L_0x002b:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto L_0x0032
            return r1
        L_0x0030:
            r1 = r4
            goto L_0x002b
        L_0x0032:
            java.lang.Object r3 = X.C18290x4.A0k(r6)
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            boolean r0 = r3 instanceof X.C73463fX
            if (r0 == 0) goto L_0x0056
            java.util.Iterator r2 = r6.iterator()
        L_0x0040:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0051
            java.lang.Object r1 = r2.next()
            if (r1 == r3) goto L_0x0040
            boolean r0 = r1 instanceof X.C73463fX
            if (r0 == 0) goto L_0x0040
            r4 = r1
        L_0x0051:
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r4 == 0) goto L_0x0056
        L_0x0055:
            return r4
        L_0x0056:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72753eE.A0O(java.util.List, X.3eD):java.lang.Throwable");
    }

    public CancellationException A0P() {
        CancellationException cancellationException;
        Object A0A = A0A();
        Throwable th = null;
        if (A0A instanceof C72743eD) {
            th = ((C72743eD) A0A).A02();
        } else if (A0A instanceof AnonymousClass333) {
            th = ((AnonymousClass333) A0A).A00;
        } else if (A0A instanceof C84834Dw) {
            throw AnonymousClass000.A0H(A0A, "Cannot be cancelling child in this state: ", AnonymousClass001.A0o());
        }
        if ((th instanceof CancellationException) && (cancellationException = (CancellationException) th) != null) {
            return cancellationException;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Parent job is ");
        return new C73483fZ(AnonymousClass000.A0X(A00(A0A), A0o), th, this);
    }

    public final C833246z A0U(C84834Dw r3) {
        C833246z B98 = r3.B98();
        if (B98 != null) {
            return B98;
        }
        if (r3 instanceof C72733eC) {
            return new C833246z();
        }
        if (r3 instanceof C830946c) {
            A0h((C830946c) r3);
            return null;
        }
        throw AnonymousClass000.A0H(r3, "State should have list: ", AnonymousClass001.A0o());
    }

    public final void A0X(Object obj, AnonymousClass46T r3, C72743eD r4) {
        AnonymousClass46T A04 = A04(r3);
        if (A04 == null || !A0q(obj, A04, r4)) {
            A0V(A0G(obj, r4));
        }
    }

    public final void A0Y(Object obj, C84834Dw r5) {
        AnonymousClass333 r4;
        C85454Gh A0R = A0R();
        if (A0R != null) {
            A0R.dispose();
            A0e(C72713eA.A00);
        }
        Throwable th = null;
        if ((obj instanceof AnonymousClass333) && (r4 = (AnonymousClass333) obj) != null) {
            th = r4.A00;
        }
        if (r5 instanceof C830946c) {
            try {
                ((C830946c) r5).A05(th);
            } catch (Throwable th2) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Exception in completion handler ");
                A0o.append(r5);
                A0a(new C73163f2(AnonymousClass000.A0P(this, " for ", A0o), th2));
            }
        } else {
            C833246z B98 = r5.B98();
            if (B98 != null) {
                A0d(th, B98);
            }
        }
    }

    public final void A0c(Throwable th, C833246z r7) {
        Object A002 = r7.A00();
        C162457s7.A0K(A002, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C73163f2 r1 = null;
        for (C612930b r4 = (C612930b) A002; !C162457s7.A0P(r4, r7); r4 = r4.A02()) {
            if (r4 instanceof AnonymousClass46V) {
                AnonymousClass472 r3 = (AnonymousClass472) r4;
                try {
                    r3.A05(th);
                } catch (Throwable th2) {
                    if (r1 != null) {
                        C154507dH.A00(r1, th2);
                    } else {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("Exception in completion handler ");
                        A0o.append(r3);
                        r1 = new C73163f2(AnonymousClass000.A0P(this, " for ", A0o), th2);
                    }
                }
            }
        }
        if (r1 != null) {
            A0a(r1);
        }
        A0v(th);
    }

    public final void A0d(Throwable th, C833246z r7) {
        Object A002 = r7.A00();
        C162457s7.A0K(A002, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C73163f2 r1 = null;
        for (C612930b r4 = (C612930b) A002; !C162457s7.A0P(r4, r7); r4 = r4.A02()) {
            if (r4 instanceof C830946c) {
                AnonymousClass472 r3 = (AnonymousClass472) r4;
                try {
                    r3.A05(th);
                } catch (Throwable th2) {
                    if (r1 != null) {
                        C154507dH.A00(r1, th2);
                    } else {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("Exception in completion handler ");
                        A0o.append(r3);
                        r1 = new C73163f2(AnonymousClass000.A0P(this, " for ", A0o), th2);
                    }
                }
            }
        }
        if (r1 != null) {
            A0a(r1);
        }
    }

    public final void A0i(C830946c r5) {
        Object A0A;
        Object A002;
        C612930b r2;
        Object obj;
        do {
            A0A = A0A();
            if (A0A instanceof C830946c) {
                if (A0A == r5) {
                } else {
                    return;
                }
            } else if ((A0A instanceof C84834Dw) && ((C84834Dw) A0A).B98() != null) {
                do {
                    A002 = r5.A00();
                    if (!(A002 instanceof AnonymousClass2XG) && A002 != r5) {
                        C162457s7.A0K(A002, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                        r2 = (C612930b) A002;
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C612930b.A02;
                        obj = atomicReferenceFieldUpdater.get(r2);
                        if (obj == null) {
                            obj = new AnonymousClass2XG(r2);
                            atomicReferenceFieldUpdater.lazySet(r2, obj);
                        }
                    } else {
                        return;
                    }
                } while (!AnonymousClass0H6.A00(r5, A002, obj, C612930b.A00));
                r2.A01();
                return;
            } else {
                return;
            }
        } while (!AnonymousClass0H6.A00(this, A0A, AnonymousClass36I.A00, A01));
    }

    public boolean A0k() {
        return true;
    }

    public boolean A0l() {
        return false;
    }

    public boolean A0m() {
        return false;
    }

    public final boolean A0n() {
        Object A0A;
        do {
            A0A = A0A();
            if (!(A0A instanceof C84834Dw)) {
                return false;
            }
        } while (A08(A0A) < 0);
        return true;
    }

    public final boolean A0o(Object obj) {
        Object A04 = AnonymousClass36I.A02;
        Object obj2 = A04;
        if (!A0l() || (A04 = A0B(obj)) != AnonymousClass36I.A04) {
            if (A04 == obj2) {
                A04 = A0C(obj);
            }
            if (!(A04 == obj2 || A04 == AnonymousClass36I.A04)) {
                if (A04 == AnonymousClass36I.A06) {
                    return false;
                }
                A0V(A04);
                return true;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0p(java.lang.Object r4) {
        /*
            r3 = this;
        L_0x0000:
            java.lang.Object r0 = r3.A0A()
            java.lang.Object r2 = r3.A0E(r0, r4)
            X.2XH r0 = X.AnonymousClass36I.A02
            if (r2 != r0) goto L_0x0010
            r0 = 0
            return r0
        L_0x0010:
            X.2XH r0 = X.AnonymousClass36I.A04
            r1 = 1
            if (r2 == r0) goto L_0x001e
            X.2XH r0 = X.AnonymousClass36I.A03
            if (r2 == r0) goto L_0x0000
            r3.A0V(r2)
        L_0x001e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72753eE.A0p(java.lang.Object):boolean");
    }

    public final boolean A0v(Throwable th) {
        if (A0m()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        C85454Gh A0R = A0R();
        if (A0R == null || A0R == C72713eA.A00) {
            return z;
        }
        if (A0R.Ayp(th) || z) {
            return true;
        }
        return false;
    }

    public final boolean A0w(Throwable th, C84834Dw r6) {
        C833246z A0U = A0U(r6);
        if (A0U == null || !AnonymousClass0H6.A00(this, r6, new C72743eD(th, A0U), A01)) {
            return false;
        }
        A0c(th, A0U);
        return true;
    }

    public void A0x() {
    }

    public final CancellationException B5G() {
        Object A0A = A0A();
        if (A0A instanceof C72743eD) {
            Throwable A02 = ((C72743eD) A0A).A02();
            if (A02 != null) {
                StringBuilder A0o = AnonymousClass001.A0o();
                AnonymousClass000.A1A(this, A0o);
                return A0Q(AnonymousClass000.A0X(" is cancelling", A0o), A02);
            }
            throw AnonymousClass000.A0H(this, "Job is still new or active: ", AnonymousClass001.A0o());
        } else if (A0A instanceof C84834Dw) {
            throw AnonymousClass000.A0H(this, "Job is still new or active: ", AnonymousClass001.A0o());
        } else if (A0A instanceof AnonymousClass333) {
            return A0Q((String) null, ((AnonymousClass333) A0A).A00);
        } else {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            AnonymousClass000.A1A(this, A0o2);
            return new C73483fZ(AnonymousClass000.A0X(" has completed normally", A0o2), (Throwable) null, this);
        }
    }

    public C85474Gj BAU() {
        C85454Gh A0R = A0R();
        if (A0R != null) {
            return A0R.BAU();
        }
        return null;
    }

    public final AnonymousClass4C7 BGw(AnonymousClass4GQ r8, boolean z, boolean z2) {
        AnonymousClass333 r5;
        AnonymousClass4C7 r3;
        boolean A0s;
        Throwable A02;
        C830946c A0T = A0T(r8, z);
        while (true) {
            Object A0A = A0A();
            if (A0A instanceof C72733eC) {
                C72733eC r1 = (C72733eC) A0A;
                if (r1.A00) {
                    A0s = AnonymousClass0H6.A00(this, A0A, A0T, A01);
                } else {
                    A0f(r1);
                }
            } else {
                Throwable th = null;
                if (A0A instanceof C84834Dw) {
                    C833246z B98 = ((C84834Dw) A0A).B98();
                    if (B98 != null) {
                        r3 = C72713eA.A00;
                        if (z && (A0A instanceof C72743eD)) {
                            synchronized (A0A) {
                                C72743eD r2 = (C72743eD) A0A;
                                A02 = r2.A02();
                                if (A02 != null && (!(r8 instanceof AnonymousClass46T) || r2.A09())) {
                                    break;
                                } else if (A0s(A0A, A0T, B98)) {
                                    if (A02 == null) {
                                        return A0T;
                                    }
                                    r3 = A0T;
                                }
                            }
                        } else {
                            A0s = A0s(A0A, A0T, B98);
                        }
                    } else {
                        C162457s7.A0K(A0A, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                        A0h((C830946c) A0A);
                    }
                } else {
                    if (z2) {
                        if ((A0A instanceof AnonymousClass333) && (r5 = (AnonymousClass333) A0A) != null) {
                            th = r5.A00;
                        }
                        r8.invoke(th);
                    }
                    return C72713eA.A00;
                }
            }
            if (A0s) {
                return A0T;
            }
        }
        if (z2) {
            r8.invoke(A02);
        }
        return r3;
    }

    public boolean BGz() {
        Object A0A = A0A();
        if (!(A0A instanceof C84834Dw) || !((C84834Dw) A0A).BGz()) {
            return false;
        }
        return true;
    }

    public final boolean BHF() {
        return !(A0A() instanceof C84834Dw);
    }

    public final Object BJQ(C84814Du r3) {
        if (!A0n()) {
            AnonymousClass34A.A02(r3.B5w());
        } else {
            Object A0J = A0J(r3);
            if (A0J == AnonymousClass218.COROUTINE_SUSPENDED) {
                return A0J;
            }
        }
        return C59022wD.A00;
    }

    public final boolean BpV() {
        int A08;
        do {
            A08 = A08(A0A());
            if (A08 == 0) {
                return false;
            }
        } while (A08 != 1);
        return true;
    }

    public final C834148h getKey() {
        return C85474Gj.A00;
    }

    public final boolean isCancelled() {
        Object A0A = A0A();
        if (A0A instanceof AnonymousClass333) {
            return true;
        }
        if (!(A0A instanceof C72743eD) || !((C72743eD) A0A).A08()) {
            return false;
        }
        return true;
    }

    public C85494Gl plus(C85494Gl r2) {
        return C616031m.A00(this, r2);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(A0M());
        C18270x1.A18(this, A0o, '@');
        return A0o.toString();
    }

    public void A0Z(Throwable th) {
        A0o(th);
    }

    public final void A0b(Throwable th) {
        A0o(th);
    }

    public final void A0j(C72753eE r1) {
        A0o(r1);
    }
}
