package X;

import android.content.res.Resources;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.5in  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C111855in implements C181758nH {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C89654ea A01;
    public final /* synthetic */ List A02;

    public final void BMg(AnonymousClass8EI r9) {
        C89654ea r7 = this.A01;
        List list = this.A02;
        int i = this.A00;
        Resources resources = r7.getResources();
        int size = list.size();
        Object[] A0M = AnonymousClass002.A0M();
        AnonymousClass000.A1L(A0M, i + 1);
        AnonymousClass000.A1P(A0M, list.size(), 1);
        String quantityString = resources.getQuantityString(R.plurals.f9nameremoved, size, A0M);
        if (AnonymousClass5X0.A02) {
            r7.Bru(quantityString);
        } else {
            r7.A6f(quantityString);
        }
        Log.i("product-details/send-product/async load begin");
    }

    public /* synthetic */ C111855in(C89654ea r1, List list, int i) {
        this.A01 = r1;
        this.A02 = list;
        this.A00 = i;
    }
}
