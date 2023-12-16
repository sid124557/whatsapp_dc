package X;

import com.whatsapp.payments.ui.viewmodel.IndiaUpiMandateHistoryViewModel;
import java.util.List;

/* renamed from: X.9gv  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C199649gv implements Runnable {
    public final /* synthetic */ IndiaUpiMandateHistoryViewModel A00;

    public final void run() {
        IndiaUpiMandateHistoryViewModel indiaUpiMandateHistoryViewModel = this.A00;
        AnonymousClass36F r8 = indiaUpiMandateHistoryViewModel.A04;
        Integer[] numArr = new Integer[2];
        int A1Y = C18300x5.A1Y(numArr, 20);
        numArr[1] = 401;
        Integer[] numArr2 = new Integer[1];
        numArr2[A1Y] = 40;
        List A0V = r8.A0V(numArr, numArr2, 3);
        Integer[] numArr3 = new Integer[2];
        AnonymousClass000.A1P(numArr3, 417, A1Y);
        AnonymousClass000.A1P(numArr3, 418, 1);
        Integer[] numArr4 = new Integer[1];
        numArr4[A1Y] = 40;
        indiaUpiMandateHistoryViewModel.A03.A0S(new C201049jR(indiaUpiMandateHistoryViewModel, A0V, r8.A0V(numArr3, numArr4, 3)));
    }

    public /* synthetic */ C199649gv(IndiaUpiMandateHistoryViewModel indiaUpiMandateHistoryViewModel) {
        this.A00 = indiaUpiMandateHistoryViewModel;
    }
}
