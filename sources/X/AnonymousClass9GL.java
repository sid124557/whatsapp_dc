package X;

import com.whatsapp.payments.ui.IndiaUpiChangePinActivity;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9GL  reason: invalid class name */
public class AnonymousClass9GL extends AnonymousClass5ZM {
    public final /* synthetic */ IndiaUpiChangePinActivity A00;

    public AnonymousClass9GL(IndiaUpiChangePinActivity indiaUpiChangePinActivity) {
        this.A00 = indiaUpiChangePinActivity;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return AnonymousClass9U4.A08(this.A00.A0P);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C166587yw r1;
        List list = (List) obj;
        if (list != null && list.size() == 1) {
            IndiaUpiChangePinActivity indiaUpiChangePinActivity = this.A00;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    r1 = null;
                    break;
                }
                r1 = C1899693i.A0C(it);
                if (r1.A08() == 2) {
                    break;
                }
            }
            indiaUpiChangePinActivity.A02 = (C133686hm) r1;
        }
        IndiaUpiChangePinActivity indiaUpiChangePinActivity2 = this.A00;
        indiaUpiChangePinActivity2.A05.A01("pin-entry-ui");
        if (indiaUpiChangePinActivity2.A02 != null) {
            AnonymousClass97T.A10(indiaUpiChangePinActivity2);
            return;
        }
        indiaUpiChangePinActivity2.A05.A06("could not find bank account; showErrorAndFinish");
        indiaUpiChangePinActivity2.A7b();
    }
}
