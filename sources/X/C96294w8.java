package X;

import android.view.View;

/* renamed from: X.4w8  reason: invalid class name and case insensitive filesystem */
public class C96294w8 extends C136186lz {
    public final View.OnClickListener A00;

    public C96294w8(View.OnClickListener onClickListener) {
        super(8);
        this.A00 = onClickListener;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return this.A00.equals(((C96294w8) obj).A00);
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass002.A0M();
        AnonymousClass000.A1L(A0M, super.hashCode());
        return C18310x6.A08(this.A00, A0M, 1);
    }
}
