package X;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;

/* renamed from: X.3XK  reason: invalid class name */
public final class AnonymousClass3XK implements C186998wH {
    public final C54292oU A00;

    public AnonymousClass3XK(C54292oU r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public void BgG(boolean z) {
        Intent A0L;
        String A0d = C18280x3.A0d(C57692u3.A04("is_bottom_sheet", Boolean.valueOf(z)));
        C162457s7.A0D(A0d);
        Context context = this.A00.A00;
        if (z) {
            A0L = C18320x8.A07();
            A0L.setClassName(context, "com.whatsapp.wabloks.ui.WaBloksBottomSheetActivity");
            C18310x6.A11(A0L, "com.bloks.www.whatsapp.ai.biz.learn_more", A0d);
            A0L.putExtra("is_async_component", false);
        } else {
            A0L = C627736r.A0L(context, (Parcelable) null, "com.bloks.www.whatsapp.ai.biz.learn_more", A0d);
        }
        C18280x3.A0n(context, A0L);
    }
}
