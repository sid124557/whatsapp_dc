package X;

/* renamed from: X.4ai  reason: invalid class name and case insensitive filesystem */
public final class C88734ai extends C116985rC {
    public static final long serialVersionUID = 0;
    public final Object reference;

    public boolean equals(Object obj) {
        if (obj instanceof C88734ai) {
            return this.reference.equals(((C88734ai) obj).reference);
        }
        return false;
    }

    public int hashCode() {
        return this.reference.hashCode() + 1502476572;
    }

    public String toString() {
        String valueOf = String.valueOf(this.reference);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        return AnonymousClass000.A0e(sb);
    }

    public C88734ai(Object obj) {
        this.reference = obj;
    }

    public static C88734ai A00(AnonymousClass4C1 r1) {
        Object obj = r1.get();
        obj.getClass();
        return new C88734ai(obj);
    }
}
