package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5NN  reason: invalid class name */
public final /* synthetic */ class AnonymousClass5NN {
    public final /* synthetic */ C109015dw A00;
    public final /* synthetic */ C90524hb A01;
    public final /* synthetic */ UserJid A02;

    public final void A00() {
        Bundle A022;
        C90524hb r0 = this.A01;
        UserJid userJid = this.A02;
        C109015dw r1 = this.A00;
        View view = r0.A0H;
        Context context = view.getContext();
        String str = r1.A0F;
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.biz.product.view.activity.ProductBottomSheetTransparentActivity");
        A07.putExtra("extra_product_id", str);
        A07.putExtra("extra_product_owner_id", userJid);
        Activity A012 = C621633u.A01(view.getContext(), C009707r.class);
        if (A012 != null) {
            A07.putExtra("view_product_origin", 3);
            if (!C105465Va.A00) {
                A022 = null;
            } else {
                A022 = C05880Vi.A01(A012, new AnonymousClass0PJ[0]).A02();
            }
            C05680Um.A02(A012, A07, A022, 1);
        }
    }

    public /* synthetic */ AnonymousClass5NN(C109015dw r1, C90524hb r2, UserJid userJid) {
        this.A01 = r2;
        this.A02 = userJid;
        this.A00 = r1;
    }
}
