package X;

import android.os.Bundle;
import com.whatsapp.expressionstray.conversation.ExpressionsKeyboardSearchBottomSheet;

/* renamed from: X.3uS  reason: invalid class name and case insensitive filesystem */
public final class C78093uS extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ ExpressionsKeyboardSearchBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78093uS(ExpressionsKeyboardSearchBottomSheet expressionsKeyboardSearchBottomSheet) {
        super(0);
        this.this$0 = expressionsKeyboardSearchBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Bundle bundle = this.this$0.A06;
        int i = 0;
        if (bundle != null) {
            i = bundle.getInt("arg_search_opener", 0);
        }
        return Integer.valueOf(i);
    }
}
