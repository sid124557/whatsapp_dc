package X;

import com.whatsapp.updates.viewmodels.UpdatesViewModel;
import java.util.List;

/* renamed from: X.62e  reason: invalid class name and case insensitive filesystem */
public final class C1218662e extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ UpdatesViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1218662e(UpdatesViewModel updatesViewModel) {
        super(1);
        this.this$0 = updatesViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C103685Ny r5 = (C103685Ny) obj;
        UpdatesViewModel updatesViewModel = this.this$0;
        C162457s7.A0H(r5);
        List list = r5.A03;
        C86604Kt.A1R(updatesViewModel.A03);
        AnonymousClass4q3 r2 = new AnonymousClass4q3(updatesViewModel.A0X.A00.A01.A00.APZ(), list);
        C103445Mz.A01(r2, (C103445Mz) updatesViewModel.A0q.getValue(), updatesViewModel, 6);
        updatesViewModel.A03 = r2;
        return C59022wD.A00;
    }
}
