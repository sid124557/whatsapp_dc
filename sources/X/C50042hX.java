package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;

/* renamed from: X.2hX  reason: invalid class name and case insensitive filesystem */
public final class C50042hX {
    public String A00;
    public String A01;
    public String A02 = "BACK";
    public final C69263Wi A03;
    public final C54292oU A04;
    public final C620733j A05;

    public final void A01(Context context, Toolbar toolbar, C84214Bm r10, String str, String str2, String str3) {
        this.A00 = str;
        this.A01 = str2;
        if (str3 == null) {
            str3 = "BACK";
        }
        this.A02 = str3;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WA Flows :  setFdsBackState - Thread name ");
        C18260x0.A1K(A0o, Thread.currentThread().getName());
        this.A03.A0S(new C70513ac(this, toolbar, context, r10, 20));
    }

    public final Drawable A00() {
        if (C162457s7.A0P(this.A02, "NONE")) {
            return null;
        }
        C620733j r3 = this.A05;
        Context context = this.A04.A00;
        boolean A0P = C162457s7.A0P(this.A02, "CLOSE");
        int i = R.drawable.vec_ic_back_24;
        if (A0P) {
            i = R.drawable.vec_ic_close_24;
        }
        return AnonymousClass0x7.A0J(context, r3, i);
    }

    public C50042hX(C69263Wi r2, C54292oU r3, C620733j r4) {
        C18260x0.A0V(r2, r3, r4);
        this.A03 = r2;
        this.A04 = r3;
        this.A05 = r4;
    }
}
