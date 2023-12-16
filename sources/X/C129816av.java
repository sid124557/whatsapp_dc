package X;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: X.6av  reason: invalid class name and case insensitive filesystem */
public final class C129816av extends AnonymousClass8NS implements Serializable {
    public static final long serialVersionUID = 0;
    public final Comparator comparator;

    public int compare(Object obj, Object obj2) {
        return this.comparator.compare(obj, obj2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C129816av) {
            return this.comparator.equals(((C129816av) obj).comparator);
        }
        return false;
    }

    public int hashCode() {
        return this.comparator.hashCode();
    }

    public String toString() {
        return this.comparator.toString();
    }

    public C129816av(Comparator comparator2) {
        this.comparator = comparator2;
    }
}
