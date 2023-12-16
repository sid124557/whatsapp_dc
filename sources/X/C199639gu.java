package X;

import com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9gu  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C199639gu implements Runnable {
    public final /* synthetic */ IndiaPaymentSettingsViewModel A00;

    public final void run() {
        AnonymousClass08M r1;
        Boolean bool;
        AnonymousClass9W2 r0;
        IndiaPaymentSettingsViewModel indiaPaymentSettingsViewModel = this.A00;
        AnonymousClass36F r8 = indiaPaymentSettingsViewModel.A02;
        boolean z = true;
        Integer[] numArr = new Integer[1];
        int A1Y = C18300x5.A1Y(numArr, 20);
        Integer[] numArr2 = new Integer[1];
        numArr2[A1Y] = 40;
        List A0V = r8.A0V(numArr, numArr2, -1);
        AnonymousClass1VX r4 = indiaPaymentSettingsViewModel.A04;
        C196629bS r3 = indiaPaymentSettingsViewModel.A05;
        if (!AnonymousClass9WN.A01(r4, r3.A07())) {
            Iterator it = A0V.iterator();
            while (it.hasNext()) {
                AnonymousClass99L r02 = (AnonymousClass99L) C1899693i.A0E(it).A0A;
                if (!(r02 == null || (r0 = r02.A0G) == null || !AnonymousClass9WN.A02(r0.A0E))) {
                    it.remove();
                }
            }
        }
        if (A0V.isEmpty()) {
            Integer[] numArr3 = new Integer[1];
            AnonymousClass000.A1P(numArr3, 417, A1Y);
            Integer[] numArr4 = new Integer[1];
            numArr4[A1Y] = 40;
            Iterator it2 = r8.A0V(numArr3, numArr4, -1).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z = false;
                    break;
                }
                AnonymousClass1S4 r12 = C1899693i.A0E(it2).A0A;
                if (r12 instanceof AnonymousClass99L) {
                    AnonymousClass9W2 r13 = ((AnonymousClass99L) r12).A0G;
                    if (!AnonymousClass9WN.A01(r4, r3.A07())) {
                        if (r13 == null) {
                            continue;
                        } else if (AnonymousClass9WN.A02(r13.A0E)) {
                            continue;
                        }
                    } else if (r13 == null) {
                        continue;
                    }
                    C195109Vz r2 = r13.A0C;
                    if (r2 != null && r2.A08.equals("UNKNOWN") && r2.A09.equals("INIT")) {
                        break;
                    }
                }
            }
            r1 = indiaPaymentSettingsViewModel.A00;
            bool = Boolean.valueOf(z);
        } else {
            r1 = indiaPaymentSettingsViewModel.A00;
            bool = Boolean.TRUE;
        }
        r1.A0G(bool);
    }

    public /* synthetic */ C199639gu(IndiaPaymentSettingsViewModel indiaPaymentSettingsViewModel) {
        this.A00 = indiaPaymentSettingsViewModel;
    }
}
