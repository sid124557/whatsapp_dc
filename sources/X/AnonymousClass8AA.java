package X;

import java.io.Serializable;

/* renamed from: X.8AA  reason: invalid class name */
public final class AnonymousClass8AA implements C180948lt, Serializable {
    public final Object zza;

    public final Object BtG() {
        return this.zza;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (!(obj instanceof AnonymousClass8AA) || ((obj2 = this.zza) != (obj3 = ((AnonymousClass8AA) obj).zza) && !obj2.equals(obj3))) {
            return false;
        }
        return true;
    }

    public AnonymousClass8AA(Object obj) {
        this.zza = obj;
    }

    public final int hashCode() {
        return C18310x6.A08(this.zza, AnonymousClass002.A0L(), 0);
    }

    public final String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Suppliers.ofInstance(");
        A0o.append(this.zza);
        return AnonymousClass000.A0e(A0o);
    }
}
