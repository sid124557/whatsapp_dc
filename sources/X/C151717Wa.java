package X;

/* renamed from: X.7Wa  reason: invalid class name and case insensitive filesystem */
public final class C151717Wa {
    public AnonymousClass7VD A00;
    public boolean A01;
    public boolean A02;
    public final Object A03;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C151717Wa.class != obj.getClass()) {
            return false;
        }
        return this.A03.equals(((C151717Wa) obj).A03);
    }

    public int hashCode() {
        return this.A03.hashCode();
    }

    public C151717Wa(C181318mZ r2, Object obj) {
        this.A03 = obj;
        this.A00 = (AnonymousClass7VD) r2.get();
    }
}
