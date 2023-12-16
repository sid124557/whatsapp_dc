package X;

import java.time.OffsetDateTime;

/* renamed from: X.6dc  reason: invalid class name and case insensitive filesystem */
public class C131456dc extends C159187lJ {
    public final OffsetDateTime A00;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C131456dc) && !(obj instanceof C131446db)) {
            return false;
        }
        return this.A00.compareTo(((C159187lJ) obj).A04().A00) == 0;
    }

    public C131446db A05() {
        return new C131446db(this.A00.toString(), false);
    }

    public OffsetDateTime A07() {
        return this.A00;
    }

    public String toString() {
        return this.A00.toString();
    }

    public C131456dc(CharSequence charSequence) {
        this.A00 = OffsetDateTime.parse(charSequence);
    }
}
