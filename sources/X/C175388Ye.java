package X;

import android.view.View;
import com.whatsapp.biz.catalog.view.variants.TextVariantsBottomSheet;

/* renamed from: X.8Ye  reason: invalid class name and case insensitive filesystem */
public final class C175388Ye extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ View $view;
    public final /* synthetic */ TextVariantsBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175388Ye(View view, TextVariantsBottomSheet textVariantsBottomSheet) {
        super(1);
        this.this$0 = textVariantsBottomSheet;
        this.$view = view;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C88694ab r1;
        Boolean bool = (Boolean) obj;
        C162457s7.A0H(bool);
        boolean booleanValue = bool.booleanValue();
        AnonymousClass7RX r2 = this.this$0.A02;
        if (booleanValue) {
            if (r2 != null) {
                r2.A00(this.$view, 1);
            }
        } else if (!(r2 == null || (r1 = r2.A00) == null)) {
            r1.A08(3);
        }
        return C59022wD.A00;
    }
}
