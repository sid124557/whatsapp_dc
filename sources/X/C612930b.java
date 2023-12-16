package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.30b  reason: invalid class name and case insensitive filesystem */
public class C612930b {
    public static final AtomicReferenceFieldUpdater A00;
    public static final AtomicReferenceFieldUpdater A01;
    public static final AtomicReferenceFieldUpdater A02;
    public volatile Object _next = this;
    public volatile Object _prev = this;
    public volatile Object _removedRef;

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        if (X.AnonymousClass0H6.A00(r4, r0, ((X.AnonymousClass2XG) r2).A00, r3) == false) goto L_0x0001;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C612930b A01() {
        /*
            r8 = this;
            r7 = 0
        L_0x0001:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = A01
            java.lang.Object r5 = r6.get(r8)
            X.30b r5 = (X.C612930b) r5
            r0 = r5
        L_0x000a:
            r4 = r7
        L_0x000b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = A00
            java.lang.Object r2 = r3.get(r0)
            if (r2 != r8) goto L_0x001c
            if (r5 == r0) goto L_0x004d
            boolean r1 = X.AnonymousClass0H6.A00(r8, r5, r0, r6)
            if (r1 != 0) goto L_0x004d
            goto L_0x0001
        L_0x001c:
            boolean r1 = r8.A04()
            if (r1 == 0) goto L_0x0023
            return r7
        L_0x0023:
            if (r2 == r7) goto L_0x004d
            boolean r1 = r2 instanceof X.C47802dq
            if (r1 == 0) goto L_0x002f
            X.2dq r2 = (X.C47802dq) r2
            r2.A00(r0)
            goto L_0x0001
        L_0x002f:
            boolean r1 = r2 instanceof X.AnonymousClass2XG
            if (r1 == 0) goto L_0x0048
            if (r4 == 0) goto L_0x0041
            X.2XG r2 = (X.AnonymousClass2XG) r2
            X.30b r1 = r2.A00
            boolean r0 = X.AnonymousClass0H6.A00(r4, r0, r1, r3)
            if (r0 == 0) goto L_0x0001
            r0 = r4
            goto L_0x000a
        L_0x0041:
            java.lang.Object r0 = r6.get(r0)
            X.30b r0 = (X.C612930b) r0
            goto L_0x000b
        L_0x0048:
            X.30b r2 = (X.C612930b) r2
            r4 = r0
            r0 = r2
            goto L_0x000b
        L_0x004d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C612930b.A01():X.30b");
    }

    static {
        Class<C612930b> cls = C612930b.class;
        Class<Object> cls2 = Object.class;
        A00 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_next");
        A01 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_prev");
        A02 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_removedRef");
    }

    public final Object A00() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A00;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof C47802dq)) {
                return obj;
            }
            ((C47802dq) obj).A00(this);
        }
    }

    public final void A03(C612930b r4) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A01;
        do {
            obj = atomicReferenceFieldUpdater.get(r4);
            if (A00() != r4) {
                return;
            }
        } while (!AnonymousClass0H6.A00(r4, obj, this, atomicReferenceFieldUpdater));
        if (A04()) {
            r4.A01();
        }
    }

    public boolean A04() {
        if (this instanceof AnonymousClass471) {
            return false;
        }
        return A00() instanceof AnonymousClass2XG;
    }

    public final C612930b A02() {
        AnonymousClass2XG r0;
        Object A002 = A00();
        if ((A002 instanceof AnonymousClass2XG) && (r0 = (AnonymousClass2XG) A002) != null) {
            return r0.A00;
        }
        C162457s7.A0K(A002, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (C612930b) A002;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(new AnonymousClass25K(this, 1));
        C18270x1.A18(this, A0o, '@');
        return A0o.toString();
    }
}
