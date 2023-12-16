package X;

import java.io.Serializable;
import java.util.List;

/* renamed from: X.8CK  reason: invalid class name */
public class AnonymousClass8CK implements C181308mY, Serializable {
    public static final long serialVersionUID = 0;
    public final List components;

    public boolean AxD(Object obj) {
        for (int i = 0; i < this.components.size(); i++) {
            if (!((C181308mY) this.components.get(i)).AxD(obj)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AnonymousClass8CK) {
            return this.components.equals(((AnonymousClass8CK) obj).components);
        }
        return false;
    }

    public int hashCode() {
        return this.components.hashCode() + 306654252;
    }

    public String toString() {
        List list = this.components;
        StringBuilder A0A = C18330xA.A0A("Predicates.");
        A0A.append("and");
        A0A.append('(');
        boolean z = true;
        for (Object next : list) {
            if (!z) {
                A0A.append(',');
            }
            A0A.append(next);
            z = false;
        }
        return AnonymousClass000.A0c(A0A);
    }

    public AnonymousClass8CK(List list) {
        this.components = list;
    }
}
