package X;

/* renamed from: X.6dY  reason: invalid class name and case insensitive filesystem */
public class C131416dY extends C159187lJ {
    public final Class A00;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C131416dY)) {
                return false;
            }
            Class cls = this.A00;
            Class cls2 = ((C131416dY) obj).A00;
            if (cls == null) {
                return cls2 == null;
            }
            if (!cls.equals(cls2)) {
                return false;
            }
        }
    }

    public String toString() {
        return this.A00.getName();
    }

    public C131416dY(Class cls) {
        this.A00 = cls;
    }
}
