package X;

/* renamed from: X.6V1  reason: invalid class name */
public final class AnonymousClass6V1 extends AnonymousClass8L7 {
    public final Object zza;

    public final boolean equals(Object obj) {
        if (obj instanceof AnonymousClass6V1) {
            return this.zza.equals(((AnonymousClass6V1) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public AnonymousClass6V1(Object obj) {
        this.zza = obj;
    }

    public final String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Optional.of(");
        A0o.append(this.zza);
        return AnonymousClass000.A0e(A0o);
    }
}
