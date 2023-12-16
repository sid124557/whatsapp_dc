package X;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: X.0Zp  reason: invalid class name and case insensitive filesystem */
public class C06860Zp implements InputFilter {
    public final /* synthetic */ C153427bI A00;
    public final /* synthetic */ AnonymousClass84O A01;
    public final /* synthetic */ C835248t A02;

    public C06860Zp(C153427bI r1, AnonymousClass84O r2, C835248t r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        String obj = spanned.toString();
        StringBuffer stringBuffer = new StringBuffer(obj);
        stringBuffer.replace(i3, i4, charSequence.toString());
        C152057Xj r2 = new C152057Xj();
        r2.A05(obj, 0);
        r2.A05(stringBuffer.toString(), 1);
        C157967jD A03 = r2.A03();
        if (C159427lo.A02(C159377lj.A01(this.A00, this.A01, A03, this.A02))) {
            return null;
        }
        return spanned.subSequence(i3, i4);
    }
}
