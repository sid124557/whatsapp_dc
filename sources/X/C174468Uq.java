package X;

/* renamed from: X.8Uq  reason: invalid class name and case insensitive filesystem */
public abstract class C174468Uq extends AnonymousClass8PI implements C188488yy {
    public final boolean syntheticJavaProperty;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C174468Uq) {
                AnonymousClass8PI r4 = (AnonymousClass8PI) obj;
                if (!getOwner().equals(r4.getOwner()) || !this.name.equals(r4.name) || !this.signature.equals(r4.signature) || !C162457s7.A0P(this.receiver, r4.receiver)) {
                    return false;
                }
            } else if (obj instanceof C188488yy) {
                return obj.equals(compute());
            } else {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C174468Uq(Class cls, Object obj, String str, String str2, int i) {
        super(obj, cls, str, str2, AnonymousClass000.A1U(i & 1, 1));
        boolean z = false;
        this.syntheticJavaProperty = (i & 2) == 2 ? true : z;
    }

    /* renamed from: A00 */
    public C188488yy getReflected() {
        if (!this.syntheticJavaProperty) {
            return (C188488yy) super.getReflected();
        }
        throw AnonymousClass002.A0G("Kotlin reflection is not yet supported for synthetic Java properties");
    }

    public C188518z1 compute() {
        if (this.syntheticJavaProperty) {
            return this;
        }
        C188518z1 r0 = this.reflected;
        if (r0 != null) {
            return r0;
        }
        this.reflected = this;
        return this;
    }

    public int hashCode() {
        return AnonymousClass0x7.A08(this.signature, AnonymousClass0x2.A07(this.name, C18300x5.A04(getOwner())));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: X.8z1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.StringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: X.8z1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: X.8z1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r2 = this;
            X.8z1 r1 = r2.compute()
            if (r1 != r2) goto L_0x0019
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "property "
            r1.append(r0)
            java.lang.String r0 = r2.name
            r1.append(r0)
            java.lang.String r0 = " (Kotlin reflection is not available)"
            r1.append(r0)
        L_0x0019:
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C174468Uq.toString():java.lang.String");
    }

    public C174468Uq() {
        this.syntheticJavaProperty = false;
    }
}
