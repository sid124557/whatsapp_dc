package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: X.2j3  reason: invalid class name and case insensitive filesystem */
public final class C50962j3 {
    public final AnonymousClass66R A00;

    public C50962j3(C183538qC r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = C154517dI.A01(new C78713vS(r2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C56822sc A00(java.lang.String r3) {
        /*
            r2 = this;
            r0 = 0
            X.C162457s7.A0J(r3, r0)
            monitor-enter(r2)
            X.66R r0 = r2.A00     // Catch:{ all -> 0x001a }
            java.lang.Object r1 = X.C18280x3.A0V(r3, r0)     // Catch:{ all -> 0x001a }
            X.2sc r1 = (X.C56822sc) r1     // Catch:{ all -> 0x001a }
            if (r1 == 0) goto L_0x0017
            boolean r0 = r1.A0C()     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x0017
            monitor-exit(r2)
            return r1
        L_0x0017:
            monitor-exit(r2)
            r1 = 0
            return r1
        L_0x001a:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50962j3.A00(java.lang.String):X.2sc");
    }

    public final List A01() {
        ArrayList A0s;
        synchronized (this) {
            Collection A0w = C18300x5.A0w(this.A00);
            A0s = AnonymousClass001.A0s();
            for (Object next : A0w) {
                if (((C56822sc) next).A0C()) {
                    A0s.add(next);
                }
            }
        }
        return A0s;
    }

    public final Set A02() {
        List<C56822sc> A01 = A01();
        ArrayList A0c = C73783g4.A0c(A01);
        for (C56822sc A04 : A01) {
            A0c.add(A04.A04());
        }
        return C73723fy.A0P(A0c);
    }
}
