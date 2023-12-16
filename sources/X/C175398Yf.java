package X;

import android.view.View;
import com.whatsapp.biz.catalog.view.variants.VariantsCarouselFragment;

/* renamed from: X.8Yf  reason: invalid class name and case insensitive filesystem */
public final class C175398Yf extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ View $view;
    public final /* synthetic */ VariantsCarouselFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175398Yf(View view, VariantsCarouselFragment variantsCarouselFragment) {
        super(1);
        this.this$0 = variantsCarouselFragment;
        this.$view = view;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C88694ab r1;
        Number number = (Number) obj;
        if (number != null) {
            VariantsCarouselFragment variantsCarouselFragment = this.this$0;
            View view = this.$view;
            AnonymousClass7RX r12 = variantsCarouselFragment.A02;
            if (r12 != null) {
                r12.A00(view, number.intValue());
                return C59022wD.A00;
            }
        }
        AnonymousClass7RX r0 = this.this$0.A02;
        if (!(r0 == null || (r1 = r0.A00) == null)) {
            r1.A08(3);
        }
        return C59022wD.A00;
    }
}
