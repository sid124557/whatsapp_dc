package X;

import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.R;
import com.whatsapp.biz.cart.view.fragment.PromotionApplicationFragment;

/* renamed from: X.5zq  reason: invalid class name and case insensitive filesystem */
public final class C121205zq extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ PromotionApplicationFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121205zq(PromotionApplicationFragment promotionApplicationFragment) {
        super(1);
        this.this$0 = promotionApplicationFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Boolean bool = (Boolean) obj;
        C162457s7.A0H(bool);
        boolean booleanValue = bool.booleanValue();
        PromotionApplicationFragment promotionApplicationFragment = this.this$0;
        if (booleanValue) {
            promotionApplicationFragment.A1K();
        } else {
            TextInputLayout textInputLayout = promotionApplicationFragment.A00;
            if (textInputLayout != null) {
                textInputLayout.setError(C08310eF.A09(promotionApplicationFragment).getString(R.string.f11nameremoved));
            }
        }
        return C59022wD.A00;
    }
}
