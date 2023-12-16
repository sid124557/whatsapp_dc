package X;

/* renamed from: X.8PE  reason: invalid class name */
public final class AnonymousClass8PE implements C188528z2 {
    public final Class A00;

    public Class B8n() {
        return this.A00;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass8PE) || !C162457s7.A0P(this.A00, ((AnonymousClass8PE) obj).A00)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass8PE(Class cls) {
        this.A00 = cls;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A1B(this.A00, A0o);
        return AnonymousClass000.A0X(" (Kotlin reflection is not available)", A0o);
    }
}
