package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.8Zs  reason: invalid class name and case insensitive filesystem */
public class C175788Zs extends C157617ib implements C184638sG {
    public static final AtomicReferenceFieldUpdater A01 = AtomicReferenceFieldUpdater.newUpdater(C175788Zs.class, Object.class, "owner");
    public final AnonymousClass4GS A00 = new AnonymousClass8ZY(this);
    public volatile Object owner = C155227eU.A00;

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ac, code lost:
        if ((r10 instanceof X.AnonymousClass4GW) == false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ae, code lost:
        r10.BkA(r11.A00, X.C59022wD.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d4, code lost:
        throw X.AnonymousClass000.A0H(r10, "unexpected: ", X.AnonymousClass001.A0o());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object BJu(java.lang.Object r23, X.C84814Du r24) {
        /*
            r22 = this;
            r13 = 0
        L_0x0001:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r12 = X.C157617ib.A01
            r11 = r22
            int r2 = r12.get(r11)
            r1 = 1
            if (r2 > r1) goto L_0x0026
            r0 = 0
            if (r2 <= 0) goto L_0x001b
            boolean r0 = r12.compareAndSet(r11, r2, r0)
            if (r0 == 0) goto L_0x0001
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = A01
            r0.set(r11, r13)
            r0 = 1
        L_0x001b:
            if (r0 != 0) goto L_0x00da
            X.4Du r0 = X.C57702u4.A01(r24)
            X.46G r21 = X.AnonymousClass2AF.A00(r0)
            goto L_0x0033
        L_0x0026:
            int r0 = r12.get(r11)
            if (r0 <= r1) goto L_0x0001
            boolean r0 = r12.compareAndSet(r11, r0, r1)
            if (r0 == 0) goto L_0x0026
            goto L_0x0001
        L_0x0033:
            X.8PO r10 = new X.8PO     // Catch:{ all -> 0x00d5 }
            r0 = r21
            r10.<init>(r0, r11)     // Catch:{ all -> 0x00d5 }
        L_0x003a:
            int r1 = r12.getAndDecrement(r11)     // Catch:{ all -> 0x00d5 }
            r0 = 1
            if (r1 > r0) goto L_0x003a
            if (r1 <= 0) goto L_0x0044
            goto L_0x00b6
        L_0x0044:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = X.C157617ib.A05     // Catch:{ all -> 0x00d5 }
            java.lang.Object r8 = r9.get(r11)     // Catch:{ all -> 0x00d5 }
            X.8Zr r8 = (X.C175778Zr) r8     // Catch:{ all -> 0x00d5 }
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = X.C157617ib.A03     // Catch:{ all -> 0x00d5 }
            long r6 = r0.getAndIncrement(r11)     // Catch:{ all -> 0x00d5 }
            X.8Uv r20 = X.C174518Uv.A00     // Catch:{ all -> 0x00d5 }
            int r0 = X.AnonymousClass79Y.A01     // Catch:{ all -> 0x00d5 }
            long r4 = (long) r0     // Catch:{ all -> 0x00d5 }
            long r18 = r6 / r4
        L_0x0059:
            r2 = r20
            r0 = r18
            java.lang.Object r17 = X.C155217eT.A00(r2, r8, r0)     // Catch:{ all -> 0x00d5 }
            X.2XH r1 = X.C155217eT.A00     // Catch:{ all -> 0x00d5 }
            r0 = r17
            if (r0 == r1) goto L_0x0088
            X.8Zr r15 = X.C1453675f.A00(r17)     // Catch:{ all -> 0x00d5 }
        L_0x006b:
            java.lang.Object r14 = r9.get(r11)     // Catch:{ all -> 0x00d5 }
            X.8Zr r14 = (X.C175778Zr) r14     // Catch:{ all -> 0x00d5 }
            long r2 = r14.A00     // Catch:{ all -> 0x00d5 }
            long r0 = r15.A00     // Catch:{ all -> 0x00d5 }
            int r16 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r16 >= 0) goto L_0x0088
            boolean r0 = r15.A06()     // Catch:{ all -> 0x00d5 }
            if (r0 == 0) goto L_0x0059
            boolean r0 = X.AnonymousClass0H6.A00(r11, r14, r15, r9)     // Catch:{ all -> 0x00d5 }
            if (r0 == 0) goto L_0x009c
            X.AnonymousClass6C7.A1R(r14)     // Catch:{ all -> 0x00d5 }
        L_0x0088:
            X.8Zr r1 = X.C1453675f.A00(r17)     // Catch:{ all -> 0x00d5 }
            X.8Zp r1 = (X.C175758Zp) r1     // Catch:{ all -> 0x00d5 }
            long r6 = r6 % r4
            int r3 = (int) r6     // Catch:{ all -> 0x00d5 }
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r1.A00     // Catch:{ all -> 0x00d5 }
            boolean r0 = X.AnonymousClass71W.A00(r13, r10, r2, r3)     // Catch:{ all -> 0x00d5 }
            if (r0 == 0) goto L_0x00a0
            r10.BGt(r1, r3)     // Catch:{ all -> 0x00d5 }
            goto L_0x00bd
        L_0x009c:
            X.AnonymousClass6C7.A1R(r15)     // Catch:{ all -> 0x00d5 }
            goto L_0x006b
        L_0x00a0:
            X.2XH r1 = X.AnonymousClass79Y.A04     // Catch:{ all -> 0x00d5 }
            X.2XH r0 = X.AnonymousClass79Y.A05     // Catch:{ all -> 0x00d5 }
            boolean r0 = X.AnonymousClass71W.A00(r1, r0, r2, r3)     // Catch:{ all -> 0x00d5 }
            if (r0 == 0) goto L_0x003a
            boolean r0 = r10 instanceof X.AnonymousClass4GW     // Catch:{ all -> 0x00d5 }
            if (r0 == 0) goto L_0x00ca
            X.2wD r1 = X.C59022wD.A00     // Catch:{ all -> 0x00d5 }
            X.4GQ r0 = r11.A00     // Catch:{ all -> 0x00d5 }
            r10.BkA(r0, r1)     // Catch:{ all -> 0x00d5 }
            goto L_0x00bd
        L_0x00b6:
            X.2wD r1 = X.C59022wD.A00     // Catch:{ all -> 0x00d5 }
            X.4GQ r0 = r11.A00     // Catch:{ all -> 0x00d5 }
            r10.BkA(r0, r1)     // Catch:{ all -> 0x00d5 }
        L_0x00bd:
            java.lang.Object r1 = r21.A06()
            X.218 r0 = X.AnonymousClass218.COROUTINE_SUSPENDED
            if (r1 == r0) goto L_0x00c7
            X.2wD r1 = X.C59022wD.A00
        L_0x00c7:
            if (r1 != r0) goto L_0x00da
            return r1
        L_0x00ca:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00d5 }
            java.lang.String r0 = "unexpected: "
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0H(r10, r0, r1)     // Catch:{ all -> 0x00d5 }
            throw r0     // Catch:{ all -> 0x00d5 }
        L_0x00d5:
            r0 = move-exception
            r21.A0C()
            throw r0
        L_0x00da:
            X.2wD r1 = X.C59022wD.A00
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175788Zs.BJu(java.lang.Object, X.4Du):java.lang.Object");
    }

    public void BrM(Object obj) {
        while (Math.max(C157617ib.A01.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A01;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            AnonymousClass2XH r0 = C155227eU.A00;
            if (obj2 != r0) {
                if (obj2 != obj && obj != null) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("This mutex is locked by ");
                    A0o.append(obj2);
                    A0o.append(", but ");
                    A0o.append(obj);
                    throw AnonymousClass000.A0I(" is expected", A0o);
                } else if (AnonymousClass0H6.A00(this, obj2, r0, atomicReferenceFieldUpdater)) {
                    A00();
                    return;
                }
            }
        }
        throw AnonymousClass001.A0e("This mutex is not locked");
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A1J(A0o, "Mutex@", this);
        A0o.append("[isLocked=");
        A0o.append(AnonymousClass000.A1T(Math.max(C157617ib.A01.get(this), 0)));
        A0o.append(",owner=");
        A0o.append(A01.get(this));
        return AnonymousClass0x2.A0f(A0o);
    }
}
