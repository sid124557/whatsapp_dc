package X;

import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.5io  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C111865io implements C181768nI {
    public final /* synthetic */ C89654ea A00;
    public final /* synthetic */ AnonymousClass5XF A01;

    public final void BVU(AnonymousClass8EI r5) {
        AnonymousClass5XF r3 = this.A01;
        C89654ea r2 = this.A00;
        Log.w("product-details/send-product/product load failed");
        r2.BjL();
        r2.Bot(R.string.f11nameremoved);
        Log.w("product-details/send-product/product load failed");
        r3.A09.A06("send_product_message_tag", false);
    }

    public /* synthetic */ C111865io(C89654ea r1, AnonymousClass5XF r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
