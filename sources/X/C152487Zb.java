package X;

import android.view.View;

/* renamed from: X.7Zb  reason: invalid class name and case insensitive filesystem */
public final class C152487Zb {
    public final int A00;
    public final View.OnClickListener A01;
    public final View.OnClickListener A02;
    public final View.OnClickListener A03;
    public final boolean A04;

    public C152487Zb(View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, int i, boolean z) {
        C18270x1.A11(onClickListener, 3, onClickListener2);
        this.A04 = z;
        this.A00 = i;
        this.A01 = onClickListener;
        this.A03 = onClickListener2;
        this.A02 = onClickListener3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C152487Zb) {
                C152487Zb r5 = (C152487Zb) obj;
                if (this.A04 != r5.A04 || this.A00 != r5.A00 || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A03, r5.A03) || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A02, AnonymousClass000.A08(this.A03, AnonymousClass000.A08(this.A01, (AnonymousClass0x9.A04(this.A04) + this.A00) * 31)));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CallFailedScreenState(isVideoCall=");
        A0o.append(this.A04);
        A0o.append(", result=");
        A0o.append(this.A00);
        A0o.append(", cancelAction=");
        A0o.append(this.A01);
        A0o.append(", reRingAction=");
        A0o.append(this.A03);
        A0o.append(", messageAction=");
        return C18260x0.A04(this.A02, A0o);
    }
}
