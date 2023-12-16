package X;

import android.content.Intent;
import java.util.Set;

/* renamed from: X.0Ai  reason: invalid class name and case insensitive filesystem */
public final class C01370Ai extends C01380Aj {
    public final Intent A00;
    public final Set A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if ((obj instanceof C01370Ai) && super.equals(obj)) {
                C01370Ai r5 = (C01370Ai) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C01370Ai(Intent intent, Set set, int i, int i2) {
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
                this.A01 = C73723fy.A0P(set);
                this.A00 = intent;
                return;
            }
            throw AnonymousClass001.A0c(String.valueOf("splitRatio must be in 0.0..1.0 range"));
        } else {
            throw AnonymousClass001.A0c("minSmallestWidth must be non-negative");
        }
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, (((AnonymousClass000.A08(this.A00, super.hashCode() * 31) + 1237) * 31) + 1) * 31);
    }
}
