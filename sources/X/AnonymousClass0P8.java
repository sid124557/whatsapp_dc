package X;

import java.util.List;

/* renamed from: X.0P8  reason: invalid class name */
public final class AnonymousClass0P8 {
    public final List A00;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !AnonymousClass001.A1a(obj, AnonymousClass0P8.class)) {
            return false;
        }
        return C162457s7.A0P(this.A00, ((AnonymousClass0P8) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        return C73723fy.A08(", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", this.A00, 56);
    }

    public AnonymousClass0P8(List list) {
        this.A00 = list;
    }
}
