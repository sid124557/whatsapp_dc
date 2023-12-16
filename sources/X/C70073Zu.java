package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer;

/* renamed from: X.3Zu  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70073Zu implements Runnable {
    public final /* synthetic */ FcsBottomSheetBaseContainer A00;
    public final /* synthetic */ String A01;

    public final void run() {
        AnonymousClass578 r1;
        FcsBottomSheetBaseContainer fcsBottomSheetBaseContainer = this.A00;
        String str = this.A01;
        Toolbar toolbar = fcsBottomSheetBaseContainer.A05;
        if (toolbar != null) {
            C620733j r3 = fcsBottomSheetBaseContainer.A0C;
            if (r3 != null) {
                Context A0G = fcsBottomSheetBaseContainer.A0G();
                boolean equals = "close".equals(str);
                int i = R.drawable.vec_ic_back_24;
                if (equals) {
                    i = R.drawable.vec_ic_close_24;
                }
                toolbar.setNavigationIcon((Drawable) AnonymousClass0x7.A0J(A0G, r3, i));
            } else {
                throw C18270x1.A0S("whatsAppLocale");
            }
        }
        Toolbar toolbar2 = fcsBottomSheetBaseContainer.A05;
        if ((toolbar2 instanceof AnonymousClass578) && (r1 = (AnonymousClass578) toolbar2) != null) {
            r1.A0M();
        }
    }

    public /* synthetic */ C70073Zu(FcsBottomSheetBaseContainer fcsBottomSheetBaseContainer, String str) {
        this.A00 = fcsBottomSheetBaseContainer;
        this.A01 = str;
    }
}
