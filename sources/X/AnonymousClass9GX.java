package X;

import android.text.TextUtils;
import com.whatsapp.R;

/* renamed from: X.9GX  reason: invalid class name */
public class AnonymousClass9GX extends AnonymousClass5ZM {
    public final String A00;
    public final /* synthetic */ C1902094n A01;

    public AnonymousClass9GX(C1902094n r1, String str) {
        this.A01 = r1;
        this.A00 = str;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        String str = this.A00;
        if (!TextUtils.isEmpty(str)) {
            return AnonymousClass36F.A05(AnonymousClass9U4.A01(this.A01.A0G), (String) null, str);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C624034w r0;
        C624034w r6 = (C624034w) obj;
        C1902094n r4 = this.A01;
        C160757oG r2 = r4.A0L;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("onTransactionDetailData loaded: ");
        C1899593h.A1L(r2, A0o, AnonymousClass000.A1W(r6));
        if (r6 != null) {
            r4.A06 = r6;
        }
        C624034w r22 = r4.A07;
        String str = r22.A0H;
        if ((str == null || str.equals("0")) && (r0 = r4.A06) != null) {
            r22.A0H = r0.A0H;
        }
        r4.A0M.BkM(new C201059jS(r4, R.string.f11nameremoved, 11));
    }
}
