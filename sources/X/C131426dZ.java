package X;

/* renamed from: X.6dZ  reason: invalid class name and case insensitive filesystem */
public class C131426dZ extends C159187lJ {
    public final Boolean A00;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C131426dZ)) {
                return false;
            }
            Boolean bool = this.A00;
            Boolean bool2 = ((C131426dZ) obj).A00;
            if (bool == null) {
                return bool2 == null;
            }
            if (!bool.equals(bool2)) {
                return false;
            }
        }
    }

    public String toString() {
        return this.A00.toString();
    }

    public C131426dZ(CharSequence charSequence) {
        this.A00 = Boolean.valueOf(Boolean.parseBoolean(charSequence.toString()));
    }
}
