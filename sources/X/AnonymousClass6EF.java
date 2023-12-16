package X;

import android.text.style.LeadingMarginSpan;
import android.text.style.UpdateLayout;

/* renamed from: X.6EF  reason: invalid class name */
public final class AnonymousClass6EF extends LeadingMarginSpan.Standard implements UpdateLayout {
    public final int A00;
    public final int A01;

    public AnonymousClass6EF(int i, int i2) {
        super(0);
        this.A00 = i;
        this.A01 = i2;
    }

    public int getLeadingMargin(boolean z) {
        if (z) {
            return this.A00;
        }
        return this.A01;
    }

    public AnonymousClass6EF() {
        this(2, 2);
    }
}
