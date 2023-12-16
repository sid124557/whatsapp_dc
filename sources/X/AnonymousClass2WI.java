package X;

import android.os.Bundle;
import com.whatsapp.expressions.BaseExpressionsBottomSheet;
import com.whatsapp.expressionstray.conversation.ExpressionsKeyboardSearchBottomSheet;

/* renamed from: X.2WI  reason: invalid class name */
public final class AnonymousClass2WI {
    public final AnonymousClass1VX A00;

    public AnonymousClass2WI(AnonymousClass1VX r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public BaseExpressionsBottomSheet A00(String str, int i) {
        ExpressionsKeyboardSearchBottomSheet expressionsKeyboardSearchBottomSheet = new ExpressionsKeyboardSearchBottomSheet();
        Bundle A08 = AnonymousClass002.A08();
        A08.putInt("arg_search_opener", i);
        A08.putBoolean("avatar_tab_swap_enabled", this.A00.A0Y(C58422vE.A02, 6081));
        A08.putString("contextual_suggestion_query", str);
        expressionsKeyboardSearchBottomSheet.A0u(A08);
        return expressionsKeyboardSearchBottomSheet;
    }
}
