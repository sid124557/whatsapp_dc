package X;

import android.view.View;
import com.whatsapp.wabloks.ui.BkActionBottomSheet;

/* renamed from: X.9oc  reason: invalid class name and case insensitive filesystem */
public class C203979oc extends C109665ez {
    public Object A00;
    public Object A01;
    public final int A02;

    public C203979oc(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void A07(View view) {
        if (this.A02 != 0) {
            C204719po r4 = new C204719po(this.A01, 6);
            if (r4.B3r() != null) {
                BkActionBottomSheet bkActionBottomSheet = (BkActionBottomSheet) this.A00;
                C44122Ut r3 = bkActionBottomSheet.A00;
                AnonymousClass8DJ.A0B(C1899693i.A09((C009707r) bkActionBottomSheet.A0Q(), bkActionBottomSheet.A0U(), r3, bkActionBottomSheet.A04), r4);
                return;
            }
            return;
        }
        AnonymousClass9E6 r0 = (AnonymousClass9E6) this.A01;
        r0.A01.BXu(r0.A00, r0.A02, r0.A03, r0.A04, r0.A05);
    }
}
