package X;

import android.content.DialogInterface;
import com.whatsapp.R;

/* renamed from: X.2iq  reason: invalid class name and case insensitive filesystem */
public final class C50832iq {
    public final DialogInterface.OnClickListener A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C50832iq) && C162457s7.A0P(this.A00, ((C50832iq) obj).A00));
    }

    public C50832iq(DialogInterface.OnClickListener onClickListener) {
        this.A00 = onClickListener;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A00, 1664225113);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ButtonAction(textId=");
        A0o.append(R.string.f11nameremoved);
        A0o.append(", clickListener=");
        return C18260x0.A04(this.A00, A0o);
    }
}
