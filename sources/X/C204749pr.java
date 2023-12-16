package X;

import com.whatsapp.payments.ui.IndiaUpiNumberSettingsActivity;
import com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity;
import com.whatsapp.payments.ui.viewmodel.IndiaUpiNumberSettingsViewModel;

/* renamed from: X.9pr  reason: invalid class name and case insensitive filesystem */
public class C204749pr implements C17190ui {
    public Object A00;
    public final int A01;

    public C204749pr(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public C05550Ty Azr(Class cls) {
        C153527bU r0;
        int i = this.A01;
        Object obj = this.A00;
        switch (i) {
            case 0:
                r0 = ((IndiaUpiNumberSettingsActivity) obj).A0E;
                break;
            case 1:
                r0 = ((IndiaUpiProfileDetailsActivity) obj).A0G;
                break;
            default:
                AnonymousClass9QK r02 = (AnonymousClass9QK) obj;
                return new C1901894k(r02.A0F, r02.A0J);
        }
        return new IndiaUpiNumberSettingsViewModel(r0);
    }

    public /* synthetic */ C05550Ty B09(AnonymousClass0N3 r2, Class cls) {
        return AnonymousClass0IW.A00(this, cls);
    }
}
