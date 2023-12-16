package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.47B  reason: invalid class name */
public abstract class AnonymousClass47B extends C71253bo {
    public int A00;

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0087, code lost:
        if (r8.A13() != false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x009b, code lost:
        if (r8.A13() != false) goto L_0x009d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            r9 = r10
            boolean r6 = r10 instanceof X.AnonymousClass46F     // Catch:{ all -> 0x00a1 }
            if (r6 == 0) goto L_0x0026
            r1 = r9
            X.46F r1 = (X.AnonymousClass46F) r1     // Catch:{ all -> 0x00a1 }
        L_0x0008:
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>"
            X.C162457s7.A0K(r1, r0)     // Catch:{ all -> 0x00a1 }
            X.46F r1 = (X.AnonymousClass46F) r1     // Catch:{ all -> 0x00a1 }
            X.4Du r5 = r1.A02     // Catch:{ all -> 0x00a1 }
            java.lang.Object r0 = r1.A01     // Catch:{ all -> 0x00a1 }
            X.4Gl r3 = r5.B5w()     // Catch:{ all -> 0x00a1 }
            java.lang.Object r2 = X.AnonymousClass34N.A00(r0, r3)     // Catch:{ all -> 0x00a1 }
            X.2XH r0 = X.AnonymousClass34N.A03     // Catch:{ all -> 0x00a1 }
            r4 = 0
            if (r2 == r0) goto L_0x002c
            X.476 r8 = X.AnonymousClass348.A02(r2, r5, r3)     // Catch:{ all -> 0x00a1 }
            goto L_0x002d
        L_0x0026:
            r0 = r9
            X.46G r0 = (X.AnonymousClass46G) r0     // Catch:{ all -> 0x00a1 }
            X.4Du r1 = r0.A00     // Catch:{ all -> 0x00a1 }
            goto L_0x0008
        L_0x002c:
            r8 = r4
        L_0x002d:
            X.4Gl r7 = r5.B5w()     // Catch:{ all -> 0x0094 }
            if (r6 == 0) goto L_0x0047
            X.46F r9 = (X.AnonymousClass46F) r9     // Catch:{ all -> 0x0094 }
            java.lang.Object r6 = r9.A00     // Catch:{ all -> 0x0094 }
            X.2XH r0 = X.C58082ug.A01     // Catch:{ all -> 0x0094 }
            r9.A00 = r0     // Catch:{ all -> 0x0094 }
        L_0x003b:
            java.lang.Throwable r0 = r10.A05(r6)     // Catch:{ all -> 0x0094 }
            if (r0 != 0) goto L_0x007c
            int r1 = r10.A00     // Catch:{ all -> 0x0094 }
            r0 = 1
            if (r1 == r0) goto L_0x0051
            goto L_0x004e
        L_0x0047:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.AnonymousClass46G.A04     // Catch:{ all -> 0x0094 }
            java.lang.Object r6 = r0.get(r10)     // Catch:{ all -> 0x0094 }
            goto L_0x003b
        L_0x004e:
            r0 = 2
            if (r1 != r0) goto L_0x006c
        L_0x0051:
            X.4Gj r1 = X.C18310x6.A0v(r7)     // Catch:{ all -> 0x0094 }
            if (r1 == 0) goto L_0x006c
            boolean r0 = r1.BGz()     // Catch:{ all -> 0x0094 }
            if (r0 != 0) goto L_0x006c
            java.util.concurrent.CancellationException r0 = r1.B5G()     // Catch:{ all -> 0x0094 }
            r10.A03(r0)     // Catch:{ all -> 0x0094 }
            X.3Z0 r0 = X.AnonymousClass3Z0.A01(r0)     // Catch:{ all -> 0x0094 }
            r5.BkD(r0)     // Catch:{ all -> 0x0094 }
            goto L_0x007f
        L_0x006c:
            boolean r0 = r10 instanceof X.AnonymousClass46G     // Catch:{ all -> 0x0094 }
            if (r0 == 0) goto L_0x0078
            boolean r0 = r6 instanceof X.C53372mz     // Catch:{ all -> 0x0094 }
            if (r0 == 0) goto L_0x0078
            X.2mz r6 = (X.C53372mz) r6     // Catch:{ all -> 0x0094 }
            java.lang.Object r6 = r6.A01     // Catch:{ all -> 0x0094 }
        L_0x0078:
            r5.BkD(r6)     // Catch:{ all -> 0x0094 }
            goto L_0x007f
        L_0x007c:
            X.AnonymousClass3Z0.A02(r0, r5)     // Catch:{ all -> 0x0094 }
        L_0x007f:
            X.2wD r1 = X.C59022wD.A00     // Catch:{ all -> 0x0094 }
            if (r8 == 0) goto L_0x0089
            boolean r0 = r8.A13()     // Catch:{ all -> 0x00a1 }
            if (r0 == 0) goto L_0x008c
        L_0x0089:
            X.AnonymousClass34N.A01(r2, r3)     // Catch:{ all -> 0x00a1 }
        L_0x008c:
            java.lang.Throwable r0 = X.AnonymousClass3Z9.A00(r1)
            r10.A04(r4, r0)
            return
        L_0x0094:
            r1 = move-exception
            if (r8 == 0) goto L_0x009d
            boolean r0 = r8.A13()     // Catch:{ all -> 0x00a1 }
            if (r0 == 0) goto L_0x00a0
        L_0x009d:
            X.AnonymousClass34N.A01(r2, r3)     // Catch:{ all -> 0x00a1 }
        L_0x00a0:
            throw r1     // Catch:{ all -> 0x00a1 }
        L_0x00a1:
            r1 = move-exception
            X.2wD r0 = X.C59022wD.A00     // Catch:{ all -> 0x00a5 }
            goto L_0x00aa
        L_0x00a5:
            r0 = move-exception
            X.3Z0 r0 = X.AnonymousClass3Z0.A01(r0)
        L_0x00aa:
            java.lang.Throwable r0 = X.AnonymousClass3Z9.A00(r0)
            r10.A04(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass47B.run():void");
    }

    public void A03(Throwable th) {
        if (!(this instanceof AnonymousClass46F)) {
            AnonymousClass46G r3 = (AnonymousClass46G) this;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AnonymousClass46G.A04;
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(r3);
                if (obj instanceof C834548l) {
                    throw AnonymousClass001.A0e("Not completed");
                } else if (!(obj instanceof AnonymousClass333)) {
                    Throwable th2 = th;
                    if (obj instanceof C53372mz) {
                        C53372mz r1 = (C53372mz) obj;
                        if (r1.A02 != null) {
                            throw AnonymousClass001.A0e("Must be called at most once");
                        }
                        Object obj2 = r1.A01;
                        AnonymousClass467 r9 = r1.A04;
                        AnonymousClass4GQ r8 = r1.A03;
                        if (AnonymousClass0H6.A00(r3, obj, new C53372mz(obj2, r1.A00, th2, r8, r9), atomicReferenceFieldUpdater)) {
                            if (r9 != null) {
                                r3.A0H(th2, r9);
                            }
                            if (r8 != null) {
                                r3.A0G(th2, r8);
                                return;
                            }
                            return;
                        }
                    } else if (AnonymousClass0H6.A00(r3, obj, new C53372mz(obj, (Object) null, th2, (AnonymousClass4GQ) null, (AnonymousClass467) null), atomicReferenceFieldUpdater)) {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void A04(Throwable th, Throwable th2) {
        C84814Du r1;
        if (th == null) {
            if (th2 != null) {
                th = th2;
            } else {
                return;
            }
        } else if (th2 != null) {
            C154507dH.A00(th, th2);
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Fatal exception in coroutines machinery for ");
        A0o.append(this);
        AnonymousClass23R r2 = new AnonymousClass23R(AnonymousClass000.A0X(". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", A0o), th);
        if (this instanceof AnonymousClass46F) {
            r1 = (AnonymousClass46F) this;
        } else {
            r1 = ((AnonymousClass46G) this).A00;
        }
        C1453575e.A00(r1.B5w(), r2);
    }

    public Throwable A05(Object obj) {
        AnonymousClass333 r3;
        if (!(obj instanceof AnonymousClass333) || (r3 = (AnonymousClass333) obj) == null) {
            return null;
        }
        return r3.A00;
    }

    public AnonymousClass47B(int i) {
        this.A00 = i;
    }
}
