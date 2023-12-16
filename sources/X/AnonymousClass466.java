package X;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.466  reason: invalid class name */
public class AnonymousClass466 extends AnonymousClass467 implements C183558qE {
    public static final AtomicReferenceFieldUpdater A05 = AtomicReferenceFieldUpdater.newUpdater(AnonymousClass466.class, Object.class, "state");
    public int A00 = -1;
    public Object A01;
    public Object A02 = AnonymousClass2CB.A01;
    public List A03 = AnonymousClass002.A0I(2);
    public final C85494Gl A04;
    public volatile Object state = AnonymousClass2CB.A05;

    public final int A01(Object obj, Object obj2) {
        List A0M;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A05;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof AnonymousClass4GW)) {
                if (!C162457s7.A0P(obj3, AnonymousClass2CB.A04) && !(obj3 instanceof C47162co)) {
                    if (C162457s7.A0P(obj3, AnonymousClass2CB.A03)) {
                        break;
                    }
                    if (C162457s7.A0P(obj3, AnonymousClass2CB.A05)) {
                        A0M = C18290x4.A12(obj);
                    } else if (obj3 instanceof List) {
                        A0M = C73723fy.A0M(obj, (Collection) obj3);
                    } else {
                        throw AnonymousClass000.A0H(obj3, "Unexpected state: ", AnonymousClass001.A0o());
                    }
                    if (AnonymousClass0H6.A00(this, obj3, A0M, atomicReferenceFieldUpdater)) {
                        return 1;
                    }
                } else {
                    return 3;
                }
            } else {
                C47162co A042 = A04(obj);
                if (A042 != null && AnonymousClass0H6.A00(this, obj3, A042, atomicReferenceFieldUpdater)) {
                    AnonymousClass4GW r2 = (AnonymousClass4GW) obj3;
                    this.A02 = obj2;
                    Object BrC = r2.BrC(C59022wD.A00, (Object) null, (AnonymousClass4GQ) null);
                    if (BrC == null) {
                        this.A02 = null;
                    } else {
                        r2.AzI(BrC);
                        return 0;
                    }
                }
            }
        }
        return 2;
    }

    public final Object A02(C84814Du r8) {
        AnonymousClass4C7 r1;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A05;
        Object obj = atomicReferenceFieldUpdater.get(this);
        C162457s7.A0K(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        C47162co r4 = (C47162co) obj;
        Object obj2 = this.A02;
        List<C47162co> list = this.A03;
        if (list != null) {
            for (C47162co r2 : list) {
                if (r2 != r4) {
                    Object obj3 = r2.A01;
                    if (obj3 instanceof C175778Zr) {
                        ((C175778Zr) obj3).A05(r2.A00);
                    } else if ((obj3 instanceof AnonymousClass4C7) && (r1 = (AnonymousClass4C7) obj3) != null) {
                        r1.dispose();
                    }
                }
            }
            atomicReferenceFieldUpdater.set(this, AnonymousClass2CB.A04);
            this.A02 = AnonymousClass2CB.A01;
            this.A03 = null;
        }
        AnonymousClass4GS r12 = r4.A05;
        Object obj4 = r4.A03;
        Object obj5 = r4.A04;
        Object BGj = r12.BGj(obj4, obj5, obj2);
        Object obj6 = r4.A02;
        if (obj5 == AnonymousClass2CB.A02) {
            C162457s7.A0K(obj6, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
            return ((AnonymousClass4GQ) obj6).invoke(r8);
        }
        C162457s7.A0K(obj6, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
        return ((AnonymousClass4GR) obj6).invoke(BGj, r8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(X.C84814Du r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C74363h0
            if (r0 == 0) goto L_0x0097
            r4 = r10
            X.3h0 r4 = (X.C74363h0) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0097
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r2 = r4.result
            X.218 r5 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r4.label
            r3 = 2
            r8 = 1
            if (r0 == 0) goto L_0x002c
            if (r0 == r8) goto L_0x0024
            if (r0 != r3) goto L_0x009e
            X.C57682u2.A01(r2)
        L_0x0023:
            return r2
        L_0x0024:
            java.lang.Object r1 = r4.L$0
            X.466 r1 = (X.AnonymousClass466) r1
            X.C57682u2.A01(r2)
            goto L_0x0055
        L_0x002c:
            X.C57682u2.A01(r2)
            r4.L$0 = r9
            r4.label = r8
            X.46G r6 = X.C57702u4.A04(r4)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = A05
        L_0x0039:
            java.lang.Object r2 = r7.get(r9)
            X.2XH r1 = X.AnonymousClass2CB.A05
            if (r2 != r1) goto L_0x0061
            boolean r0 = X.AnonymousClass0H6.A00(r9, r2, r6, r7)
            if (r0 == 0) goto L_0x0039
            r6.BGs(r9)
        L_0x004a:
            java.lang.Object r0 = r6.A06()
            if (r0 == r5) goto L_0x0060
            X.2wD r0 = X.C59022wD.A00
            if (r0 == r5) goto L_0x0060
            r1 = r9
        L_0x0055:
            r0 = 0
            r4.L$0 = r0
            r4.label = r3
            java.lang.Object r2 = r1.A02(r4)
            if (r2 != r5) goto L_0x0023
        L_0x0060:
            return r5
        L_0x0061:
            boolean r0 = r2 instanceof java.util.List
            if (r0 == 0) goto L_0x008c
            boolean r0 = X.AnonymousClass0H6.A00(r9, r2, r1, r7)
            if (r0 == 0) goto L_0x0039
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x0071:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0039
            java.lang.Object r0 = r2.next()
            X.2co r1 = r9.A04(r0)
            X.C162457s7.A0H(r1)
            r0 = 0
            r1.A01 = r0
            r0 = -1
            r1.A00 = r0
            r9.A05(r1, r8)
            goto L_0x0071
        L_0x008c:
            boolean r0 = r2 instanceof X.C47162co
            if (r0 == 0) goto L_0x00a3
            X.2wD r1 = X.C59022wD.A00
            r0 = 0
            r6.BkA(r0, r1)
            goto L_0x004a
        L_0x0097:
            X.3h0 r4 = new X.3h0
            r4.<init>(r10, r9)
            goto L_0x0012
        L_0x009e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        L_0x00a3:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "unexpected state: "
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0H(r2, r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass466.A03(X.4Du):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.2co} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.2co} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: X.2co} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: X.2co} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: X.2co} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C47162co A04(java.lang.Object r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.A03
            r3 = 0
            if (r0 == 0) goto L_0x0032
            java.util.Iterator r2 = r0.iterator()
        L_0x0009:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001b
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.2co r0 = (X.C47162co) r0
            java.lang.Object r0 = r0.A03
            if (r0 != r5) goto L_0x0009
            r3 = r1
        L_0x001b:
            X.2co r3 = (X.C47162co) r3
            if (r3 != 0) goto L_0x0032
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Clause with object "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " is not found"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0I(r0, r1)
            throw r0
        L_0x0032:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass466.A04(java.lang.Object):X.2co");
    }

    public final void A05(C47162co r5, boolean z) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A05;
        if (!(atomicReferenceFieldUpdater.get(this) instanceof C47162co)) {
            if (!z) {
                Object obj = r5.A03;
                List<C47162co> list = this.A03;
                C162457s7.A0H(list);
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (C47162co r0 : list) {
                        if (r0.A03 == obj) {
                            throw AnonymousClass000.A0H(obj, "Cannot use select clauses on the same object: ", AnonymousClass001.A0o());
                        }
                    }
                }
            }
            r5.A06.BGj(r5.A03, this, r5.A04);
            if (this.A02 == AnonymousClass2CB.A01) {
                if (!z) {
                    List list2 = this.A03;
                    C162457s7.A0H(list2);
                    list2.add(r5);
                }
                r5.A01 = this.A01;
                r5.A00 = this.A00;
                this.A01 = null;
                this.A00 = -1;
                return;
            }
            atomicReferenceFieldUpdater.set(this, r5);
        }
    }

    public void BGt(C175778Zr r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00((Throwable) obj);
        return C59022wD.A00;
    }

    public AnonymousClass466(C85494Gl r2) {
        this.A04 = r2;
    }
}
