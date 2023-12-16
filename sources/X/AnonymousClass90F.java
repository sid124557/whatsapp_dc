package X;

import android.app.Application;
import com.whatsapp.R;
import com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperLinkViewModel;

/* renamed from: X.90F  reason: invalid class name */
public class AnonymousClass90F implements C202619mJ {
    public Object A00;
    public final int A01;

    public AnonymousClass90F(IndiaUpiMapperLinkViewModel indiaUpiMapperLinkViewModel, int i) {
        this.A01 = i;
        this.A00 = indiaUpiMapperLinkViewModel;
    }

    public final void BZg(C166157yE r6, AnonymousClass34V r7) {
        AnonymousClass4UC r1;
        Object obj;
        C137176oG r2;
        AnonymousClass4UC r3;
        Object obj2;
        int i = this.A01;
        IndiaUpiMapperLinkViewModel indiaUpiMapperLinkViewModel = (IndiaUpiMapperLinkViewModel) this.A00;
        if (i != 0) {
            if (r7 != null) {
                r3 = indiaUpiMapperLinkViewModel.A05;
                obj2 = new C137176oG(r7.A00, "", "");
            } else {
                C153527bU r0 = indiaUpiMapperLinkViewModel.A04;
                C162457s7.A0H(r6);
                r0.A03(r6);
                String str = r6.A02;
                if (str.equalsIgnoreCase("active_pending")) {
                    r3 = indiaUpiMapperLinkViewModel.A05;
                    obj2 = C137206oJ.A00;
                } else if (str.equalsIgnoreCase("active")) {
                    r3 = indiaUpiMapperLinkViewModel.A05;
                    obj2 = C137196oI.A00;
                } else {
                    return;
                }
            }
            r3.A0G(obj2);
            return;
        }
        if (r7 != null) {
            int i2 = r7.A00;
            if (i2 == 21176) {
                r1 = indiaUpiMapperLinkViewModel.A05;
                obj = C137186oH.A00;
            } else {
                AnonymousClass4UC r32 = indiaUpiMapperLinkViewModel.A05;
                if (i2 == 21138) {
                    Application application = indiaUpiMapperLinkViewModel.A02;
                    r2 = new C137176oG(i2, application.getString(R.string.f11nameremoved), application.getString(R.string.f11nameremoved));
                } else {
                    r2 = new C137176oG(i2, "", indiaUpiMapperLinkViewModel.A02.getString(R.string.f11nameremoved));
                }
                r32.A0G(r2);
                return;
            }
        } else {
            C153527bU r02 = indiaUpiMapperLinkViewModel.A04;
            C162457s7.A0H(r6);
            r02.A03(r6);
            String str2 = r6.A02;
            if (str2.equalsIgnoreCase("active_pending")) {
                r1 = indiaUpiMapperLinkViewModel.A05;
                obj = C137206oJ.A00;
            } else if (str2.equalsIgnoreCase("active")) {
                r1 = indiaUpiMapperLinkViewModel.A05;
                obj = C137196oI.A00;
            } else {
                return;
            }
        }
        r1.A0G(obj);
    }
}
