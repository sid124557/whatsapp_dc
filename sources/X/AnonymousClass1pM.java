package X;

import android.content.Context;
import android.graphics.Paint;
import com.whatsapp.R;

/* renamed from: X.1pM  reason: invalid class name */
public final class AnonymousClass1pM extends AnonymousClass315 {
    public CharSequence A04(Context context, Paint paint) {
        CharSequence A04;
        int A1Y = AnonymousClass0x2.A1Y(context, paint);
        AnonymousClass39E r0 = this.A02.A04;
        if (r0 != null) {
            long A00 = (long) r0.A00();
            C620733j r2 = this.A00;
            Object[] objArr = new Object[A1Y];
            AnonymousClass000.A1Q(objArr, 0, A00);
            A04 = r2.A0L(objArr, R.plurals.f9nameremoved, A00);
        } else {
            A04 = super.A04(context, paint);
        }
        C162457s7.A0D(A04);
        return A04;
    }

    public String A07() {
        StringBuilder A0o = AnonymousClass001.A0o();
        String A08 = A08();
        String str = A08;
        String str2 = "";
        if (A08 == null) {
            A08 = str2;
        }
        if (A08.length() > 0) {
            A0o.append(str);
        }
        AnonymousClass39W r7 = this.A02;
        AnonymousClass39E r0 = r7.A04;
        if (r0 != null) {
            int A00 = r0.A00();
            A0o.append("\n");
            Object[] objArr = new Object[1];
            AnonymousClass000.A1P(objArr, A00, 0);
            A0o.append(this.A00.A0L(objArr, R.plurals.f9nameremoved, (long) A00));
        }
        String str3 = r7.A08;
        String str4 = str3;
        if (str3 == null) {
            str4 = str2;
        }
        if (str4.length() > 0) {
            A0o.append("\n");
            A0o.append(str3);
        }
        String str5 = r7.A09;
        if (str5 != null) {
            str2 = str5;
        }
        if (str2.length() > 0) {
            A0o.append("\n");
            A0o.append(str5);
        }
        return C18290x4.A0o(A0o);
    }

    public void A0C(C55032pg r2, C624134x r3) {
        C18260x0.A0O(r2, r3);
        AnonymousClass36V.A05(this.A01, r2, r3);
    }

    public AnonymousClass1pM(AnonymousClass39W r1, C41882Ly r2) {
        super(r1, r2);
    }
}
