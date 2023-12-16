package X;

import java.io.Serializable;

/* renamed from: X.3dt  reason: invalid class name and case insensitive filesystem */
public final class C72543dt implements C85494Gl, Serializable {
    public final C85484Gk element;
    public final C85494Gl left;

    private final Object writeReplace() {
        int i = 2;
        C72543dt r1 = this;
        while (true) {
            C85494Gl r12 = r1.left;
            if (!(r12 instanceof C72543dt) || (r1 = (C72543dt) r12) == null) {
                C85494Gl[] r3 = new C85494Gl[i];
                C69883Yw r2 = new C69883Yw();
                fold(C59022wD.A00, new AnonymousClass45S(r2, r3));
            } else {
                i++;
            }
        }
        C85494Gl[] r32 = new C85494Gl[i];
        C69883Yw r22 = new C69883Yw();
        fold(C59022wD.A00, new AnonymousClass45S(r22, r32));
        if (r22.element == i) {
            return new AnonymousClass3Z7(r32);
        }
        throw AnonymousClass001.A0e("Check failed.");
    }

    public Object fold(Object obj, AnonymousClass4GR r4) {
        C162457s7.A0J(r4, 1);
        return r4.invoke(this.left.fold(obj, r4), this.element);
    }

    public C85484Gk get(C834148h r3) {
        C162457s7.A0J(r3, 0);
        C72543dt r1 = this;
        while (true) {
            C85484Gk r0 = r1.element.get(r3);
            if (r0 != null) {
                return r0;
            }
            C85494Gl r12 = r1.left;
            if (!(r12 instanceof C72543dt)) {
                return r12.get(r3);
            }
            r1 = (C72543dt) r12;
        }
    }

    public C85494Gl minusKey(C834148h r4) {
        C162457s7.A0J(r4, 0);
        C85484Gk r1 = this.element.get(r4);
        C85494Gl r0 = this.left;
        if (r1 != null) {
            return r0;
        }
        C85494Gl minusKey = r0.minusKey(r4);
        if (minusKey == this.left) {
            return this;
        }
        if (minusKey == C72553du.A00) {
            return this.element;
        }
        return new C72543dt(this.element, minusKey);
    }

    public C85494Gl plus(C85494Gl r3) {
        C162457s7.A0J(r3, 1);
        if (r3 != C72553du.A00) {
            return (C85494Gl) r3.fold(this, AnonymousClass45Y.A00);
        }
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029 A[LOOP:2: B:16:0x0029->B:20:0x003f, LOOP_START, PHI: r1 
      PHI: (r1v4 X.3dt) = (r1v3 X.3dt), (r1v7 X.3dt) binds: [B:15:0x0027, B:20:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            if (r5 == r6) goto L_0x0058
            boolean r0 = r6 instanceof X.C72543dt
            if (r0 == 0) goto L_0x005a
            X.3dt r6 = (X.C72543dt) r6
            r4 = 2
            r1 = r6
        L_0x000a:
            X.4Gl r1 = r1.left
            boolean r0 = r1 instanceof X.C72543dt
            if (r0 == 0) goto L_0x0017
            X.3dt r1 = (X.C72543dt) r1
            if (r1 == 0) goto L_0x0017
            int r4 = r4 + 1
            goto L_0x000a
        L_0x0017:
            r1 = r5
            r3 = 2
            r2 = r5
        L_0x001a:
            X.4Gl r2 = r2.left
            boolean r0 = r2 instanceof X.C72543dt
            if (r0 == 0) goto L_0x0027
            X.3dt r2 = (X.C72543dt) r2
            if (r2 == 0) goto L_0x0027
            int r3 = r3 + 1
            goto L_0x001a
        L_0x0027:
            if (r4 != r3) goto L_0x005a
        L_0x0029:
            X.4Gk r2 = r1.element
            X.48h r0 = r2.getKey()
            X.4Gk r0 = r6.get(r0)
            boolean r0 = X.C162457s7.A0P(r0, r2)
            if (r0 == 0) goto L_0x005a
            X.4Gl r1 = r1.left
            boolean r0 = r1 instanceof X.C72543dt
            if (r0 == 0) goto L_0x0042
            X.3dt r1 = (X.C72543dt) r1
            goto L_0x0029
        L_0x0042:
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element"
            X.C162457s7.A0K(r1, r0)
            X.4Gk r1 = (X.C85484Gk) r1
            X.48h r0 = r1.getKey()
            X.4Gk r0 = r6.get(r0)
            boolean r0 = X.C162457s7.A0P(r0, r1)
            if (r0 == 0) goto L_0x005a
        L_0x0058:
            r0 = 1
            return r0
        L_0x005a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72543dt.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.element, this.left.hashCode());
    }

    public C72543dt(C85484Gk r1, C85494Gl r2) {
        C18260x0.A0Q(r2, r1);
        this.left = r2;
        this.element = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append('[');
        A0o.append((String) fold("", AnonymousClass45X.A00));
        return AnonymousClass0x2.A0f(A0o);
    }
}
