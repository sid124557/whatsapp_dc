package X;

import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity;
import com.whatsapp.payments.ui.IndiaUpiBankPickerActivityOld;

/* renamed from: X.9oN  reason: invalid class name and case insensitive filesystem */
public class C203829oN extends AnonymousClass0O5 {
    public Object A00;
    public final int A01;

    public C203829oN(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A05(RecyclerView recyclerView, int i) {
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            ((IndiaUpiBankPickerActivityOld) obj).A0H = true;
        } else {
            ((IndiaUpiBankPickerActivity) obj).A0E = true;
        }
    }
}
