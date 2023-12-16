package X;

import android.view.View;

/* renamed from: X.5SU  reason: invalid class name */
public final class AnonymousClass5SU {
    public final View.OnClickListener A00;
    public final View.OnLongClickListener A01;
    public final AnonymousClass58V A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5SU) {
                AnonymousClass5SU r5 = (AnonymousClass5SU) obj;
                if (this.A02 != r5.A02 || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01) || this.A03 != r5.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x7.A00(AnonymousClass000.A08(this.A01, AnonymousClass000.A08(this.A00, C18300x5.A04(this.A02))), this.A03);
    }

    public AnonymousClass5SU(View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, AnonymousClass58V r3, boolean z) {
        C18260x0.A0R(r3, onLongClickListener);
        this.A02 = r3;
        this.A00 = onClickListener;
        this.A01 = onLongClickListener;
        this.A03 = z;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ActionButton(actionButtonType=");
        A0o.append(this.A02);
        A0o.append(", onClickListener=");
        A0o.append(this.A00);
        A0o.append(", onLongClickListener=");
        A0o.append(this.A01);
        A0o.append(", isMarketingOptOut=");
        return C18260x0.A0A(A0o, this.A03);
    }
}
