package X;

import java.util.NoSuchElementException;

/* renamed from: X.33D  reason: invalid class name */
public final class AnonymousClass33D {
    public static final AnonymousClass33D A01 = new AnonymousClass33D();
    public final Object A00;

    public Object A00() {
        Object obj = this.A00;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass33D)) {
            return false;
        }
        return AnonymousClass75J.A00(this.A00, ((AnonymousClass33D) obj).A00);
    }

    public int hashCode() {
        return AnonymousClass000.A07(this.A00);
    }

    public String toString() {
        Object obj = this.A00;
        if (obj != null) {
            return String.format("Optional[%s]", AnonymousClass000.A1b(obj));
        }
        return "Optional.empty";
    }

    public AnonymousClass33D(Object obj) {
        C626936e.A06(obj);
        this.A00 = obj;
    }

    public AnonymousClass33D() {
        this.A00 = null;
    }
}
