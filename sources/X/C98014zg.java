package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.4zg  reason: invalid class name and case insensitive filesystem */
public class C98014zg extends C98104zp {
    public C97954za A00;
    public boolean A01;
    public final AnonymousClass5UX A02;
    public final C105365Uq A03;
    public final C66473Lo A04;
    public final C621233o A05;
    public final C28071fd A06;

    public /* bridge */ /* synthetic */ CharSequence A04(AnonymousClass3ZH r10, C624134x r11) {
        String str;
        C30361mK r112 = (C30361mK) r11;
        if (!(r112 instanceof C30801n8) || (str = ((C30801n8) r112).A03) == null) {
            str = "";
        }
        int i = R.drawable.ic_inline_live_location;
        if (r112 instanceof AnonymousClass1n9) {
            i = R.drawable.msg_status_location;
        }
        Drawable A012 = C107335b8.A01(getContext(), i);
        TextPaint paint = this.A01.getPaint();
        if (TextUtils.isEmpty(str)) {
            return super.A04(r10, r112);
        }
        CharSequence A013 = C87044Mw.A01(paint, A012, "");
        CharSequence A002 = AnonymousClass4Qv.A00(r10, r112, this);
        if (TextUtils.isEmpty(A002)) {
            return A013;
        }
        boolean A0C = C107555bV.A0C(A013);
        CharSequence[] charSequenceArr = new CharSequence[4];
        charSequenceArr[0] = A002;
        char c = 8207;
        if (A0C) {
            c = 8206;
        }
        String valueOf = String.valueOf(c);
        charSequenceArr[1] = valueOf;
        charSequenceArr[2] = A013;
        charSequenceArr[3] = valueOf;
        return TextUtils.concat(charSequenceArr);
    }

    public C98014zg(Context context, AnonymousClass5UX r2, C105365Uq r3, C103445Mz r4, C66473Lo r5, C621233o r6, C28071fd r7) {
        super(context, r4);
        A02();
        this.A06 = r7;
        this.A02 = r2;
        this.A03 = r3;
        this.A05 = r6;
        this.A04 = r5;
        A03();
    }

    /* renamed from: A09 */
    public void A07(C30361mK r2, List list) {
        super.A07(r2, list);
        this.A00.setMessage(r2, list);
    }
}
