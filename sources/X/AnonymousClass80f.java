package X;

import java.util.Collection;
import java.util.List;

/* renamed from: X.80f  reason: invalid class name */
public final class AnonymousClass80f implements C177618gA {
    public static final AnonymousClass80f A01 = new AnonymousClass80f(AnonymousClass001.A0s());
    public final C129586aY A00;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass80f.class != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((AnonymousClass80f) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass80f(List list) {
        this.A00 = C129586aY.copyOf((Collection) list);
    }
}
