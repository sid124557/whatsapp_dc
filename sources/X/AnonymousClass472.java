package X;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.472  reason: invalid class name */
public abstract class AnonymousClass472 extends C612930b implements AnonymousClass4GQ {
    public void A05(Throwable th) {
        AnonymousClass4GQ r0;
        Object A01;
        if (this instanceof AnonymousClass46Z) {
            ((AnonymousClass46Z) this).A00.BkD(C59022wD.A00);
        } else if (this instanceof AnonymousClass46Y) {
            AnonymousClass46Y r1 = (AnonymousClass46Y) this;
            Object A0A = r1.A06().A0A();
            boolean z = A0A instanceof AnonymousClass333;
            AnonymousClass46G r12 = r1.A00;
            if (z) {
                A01 = AnonymousClass3Z0.A01(((AnonymousClass333) A0A).A00);
            } else {
                A01 = AnonymousClass36I.A01(A0A);
            }
            r12.BkD(A01);
        } else {
            if (this instanceof AnonymousClass46X) {
                r0 = ((AnonymousClass46X) this).A00;
            } else if (this instanceof AnonymousClass46W) {
                ((AnonymousClass46W) this).A00.dispose();
                return;
            } else if (this instanceof AnonymousClass46S) {
                AnonymousClass46S r3 = (AnonymousClass46S) this;
                if (AnonymousClass46S.A01.compareAndSet(r3, 0, 1)) {
                    r0 = r3.A00;
                } else {
                    return;
                }
            } else if (this instanceof AnonymousClass46T) {
                AnonymousClass46T r02 = (AnonymousClass46T) this;
                r02.A00.A0j(r02.A06());
                return;
            } else if (this instanceof AnonymousClass46R) {
                AnonymousClass46R r03 = (AnonymousClass46R) this;
                AnonymousClass46G r6 = r03.A00;
                Throwable A08 = r6.A08(r03.A06());
                if (r6.A0J()) {
                    C84814Du r4 = r6.A00;
                    C162457s7.A0K(r4, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AnonymousClass46F.A04;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(r4);
                        AnonymousClass2XH r13 = C58082ug.A00;
                        if (C162457s7.A0P(obj, r13)) {
                            if (AnonymousClass0H6.A00(r4, r13, A08, atomicReferenceFieldUpdater)) {
                                return;
                            }
                        } else if (obj instanceof Throwable) {
                            return;
                        } else {
                            if (AnonymousClass0H6.A00(r4, obj, (Object) null, atomicReferenceFieldUpdater)) {
                                break;
                            }
                        }
                    }
                }
                r6.AyY(A08);
                if (!r6.A0J()) {
                    r6.A0B();
                    return;
                }
                return;
            } else {
                C830846b r42 = (C830846b) this;
                if (th != null) {
                    AnonymousClass4GW r32 = r42.A01;
                    AnonymousClass2XH A09 = ((AnonymousClass46G) r32).A09(new AnonymousClass333(th), (AnonymousClass4GQ) null);
                    if (A09 != null) {
                        r32.AzI(A09);
                        AnonymousClass465 r04 = (AnonymousClass465) C830846b.A03.get(r42);
                        if (r04 != null) {
                            r04.A01();
                            return;
                        }
                        return;
                    }
                    return;
                }
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C58532vP.A01;
                C58532vP r14 = r42.A02;
                if (atomicIntegerFieldUpdater.decrementAndGet(r14) == 0) {
                    AnonymousClass4GW r5 = r42.A01;
                    ArrayList A0I = AnonymousClass002.A0I(r3);
                    for (C85464Gi B5i : r14.A00) {
                        A0I.add(B5i.B5i());
                    }
                    r5.BkD(A0I);
                    return;
                }
                return;
            }
            r0.invoke(th);
        }
    }
}
