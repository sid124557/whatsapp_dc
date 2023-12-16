package X;

/* renamed from: X.7Vr  reason: invalid class name */
public class AnonymousClass7Vr {
    public final C112315jX A00;
    public final C91824lC A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return this.A01.equals(((AnonymousClass7Vr) obj).A01);
    }

    public int hashCode() {
        return this.A01.hashCode();
    }

    public AnonymousClass7Vr(C112315jX r1, C91824lC r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
