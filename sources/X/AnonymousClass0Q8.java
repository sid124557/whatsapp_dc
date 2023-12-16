package X;

import android.graphics.Rect;

/* renamed from: X.0Q8  reason: invalid class name */
public final class AnonymousClass0Q8 {
    public final AnonymousClass0Pg A00;

    public AnonymousClass0Q8(Rect rect) {
        this.A00 = new AnonymousClass0Pg(rect);
    }

    public final Rect A00() {
        AnonymousClass0Pg r0 = this.A00;
        return new Rect(r0.A01, r0.A03, r0.A02, r0.A00);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !AnonymousClass001.A1a(obj, AnonymousClass0Q8.class)) {
            return false;
        }
        return C162457s7.A0P(this.A00, ((AnonymousClass0Q8) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WindowMetrics { bounds: ");
        AnonymousClass0Pg r0 = this.A00;
        A0o.append(new Rect(r0.A01, r0.A03, r0.A02, r0.A00));
        return AnonymousClass000.A0X(" }", A0o);
    }
}
