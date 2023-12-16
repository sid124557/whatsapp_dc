package X;

import android.util.SparseBooleanArray;

/* renamed from: X.7VD  reason: invalid class name */
public class AnonymousClass7VD {
    public final SparseBooleanArray A00 = new SparseBooleanArray();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass7VD)) {
            return false;
        }
        return this.A00.equals(((AnonymousClass7VD) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
