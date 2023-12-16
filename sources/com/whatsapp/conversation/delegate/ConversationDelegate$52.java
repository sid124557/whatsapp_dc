package com.whatsapp.conversation.delegate;

import X.AnonymousClass0GC;
import X.AnonymousClass0GH;
import X.C113245l7;
import X.C15910sA;
import X.C17280vG;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.expressions.BaseExpressionsBottomSheet;
import com.whatsapp.expressionstray.conversation.ExpressionsKeyboardSearchBottomSheet;

public class ConversationDelegate$52 implements C17280vG {
    public final /* synthetic */ C113245l7 A00;

    public ConversationDelegate$52(C113245l7 r1) {
        this.A00 = r1;
    }

    public void BcK(AnonymousClass0GH r4, C15910sA r5) {
        DialogFragment dialogFragment;
        if (r4.A01() == AnonymousClass0GC.RESUMED) {
            C113245l7 r2 = this.A00;
            r2.A2z.getLifecycle().A01(this);
            if (r2.A3y != null && (dialogFragment = (DialogFragment) C113245l7.A04(r2).A0D("expressions_search_dialog_fragment")) != null && dialogFragment.A16()) {
                dialogFragment.A1K();
                BaseExpressionsBottomSheet baseExpressionsBottomSheet = r2.A3y;
                if (baseExpressionsBottomSheet != null) {
                    ((ExpressionsKeyboardSearchBottomSheet) baseExpressionsBottomSheet).A0C = null;
                    r2.A3y = null;
                }
            }
        }
    }
}
