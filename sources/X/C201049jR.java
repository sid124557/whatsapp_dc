package X;

import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.payments.ui.viewmodel.IndiaUpiMandateHistoryViewModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9jR  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C201049jR implements Runnable {
    public final /* synthetic */ IndiaUpiMandateHistoryViewModel A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ List A02;

    public final void run() {
        IndiaUpiMandateHistoryViewModel indiaUpiMandateHistoryViewModel = this.A00;
        List list = this.A01;
        List list2 = this.A02;
        ArrayList A0s = AnonymousClass001.A0s();
        Context context = indiaUpiMandateHistoryViewModel.A01.A00;
        AnonymousClass9F8 r1 = new AnonymousClass9F8(context.getString(R.string.f11nameremoved));
        r1.A00 = context.getString(R.string.f11nameremoved);
        A0s.add(r1);
        AnonymousClass9FB r12 = new AnonymousClass9FB();
        r12.A01 = indiaUpiMandateHistoryViewModel;
        r12.A02 = context.getString(R.string.f11nameremoved);
        r12.A03 = context.getString(R.string.f11nameremoved);
        r12.A00 = C204249p3.A00(indiaUpiMandateHistoryViewModel, 139);
        r12.A05 = list;
        A0s.add(r12);
        AnonymousClass9FD r2 = new AnonymousClass9FD(102);
        AnonymousClass9FB r13 = new AnonymousClass9FB();
        r13.A01 = indiaUpiMandateHistoryViewModel;
        r13.A04 = context.getString(R.string.f11nameremoved);
        r13.A02 = context.getString(R.string.f11nameremoved);
        r13.A03 = context.getString(R.string.f11nameremoved);
        r13.A05 = list2;
        r13.A00 = C204249p3.A00(indiaUpiMandateHistoryViewModel, 138);
        A0s.add(r2);
        A0s.add(r13);
        A0s.add(r2);
        A0s.add(new AnonymousClass9FE(1007));
        indiaUpiMandateHistoryViewModel.A00.A0H(A0s);
    }

    public /* synthetic */ C201049jR(IndiaUpiMandateHistoryViewModel indiaUpiMandateHistoryViewModel, List list, List list2) {
        this.A00 = indiaUpiMandateHistoryViewModel;
        this.A01 = list;
        this.A02 = list2;
    }
}
