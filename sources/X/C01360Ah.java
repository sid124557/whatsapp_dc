package X;

import java.util.Set;

/* renamed from: X.0Ah  reason: invalid class name and case insensitive filesystem */
public final class C01360Ah extends C01380Aj {
    public final Set A00;
    public final boolean A01;

    public C01360Ah(Set set, int i, int i2) {
        super(i, i2);
        if (i < 0) {
            throw AnonymousClass001.A0c("minWidth must be non-negative");
        } else if (i2 >= 0) {
            double d = (double) 0.4f;
            boolean z = false;
            if (0.0d <= d && d <= 1.0d) {
                z = true;
            }
            if (z) {
                this.A00 = C73723fy.A0P(set);
                this.A01 = true;
                return;
            }
            throw AnonymousClass001.A0c(String.valueOf("splitRatio must be in 0.0..1.0 range"));
        } else {
            throw AnonymousClass001.A0c("minSmallestWidth must be non-negative");
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if ((obj instanceof C01360Ah) && super.equals(obj)) {
                C01360Ah r5 = (C01360Ah) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A08 = ((AnonymousClass000.A08(this.A00, super.hashCode() * 31) * 31) + 1) * 31;
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        return A08 + i;
    }
}
