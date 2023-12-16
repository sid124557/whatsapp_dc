package X;

import java.security.Permission;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.8SU  reason: invalid class name */
public class AnonymousClass8SU extends Permission {
    public final Set actions;

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass8SU) || !this.actions.equals(((AnonymousClass8SU) obj).actions)) {
            return false;
        }
        return true;
    }

    public String getActions() {
        return this.actions.toString();
    }

    public int hashCode() {
        return this.actions.hashCode();
    }

    public boolean implies(Permission permission) {
        if (!(permission instanceof AnonymousClass8SU)) {
            return false;
        }
        AnonymousClass8SU r4 = (AnonymousClass8SU) permission;
        if (getName().equals(r4.getName()) || this.actions.containsAll(r4.actions)) {
            return true;
        }
        return false;
    }

    public AnonymousClass8SU(String str) {
        super(str);
        HashSet A0K = AnonymousClass002.A0K();
        this.actions = A0K;
        A0K.add(str);
    }
}
