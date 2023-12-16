package X;

import com.whatsapp.extensions.bloks.viewmodel.WaFlowsViewModel;

/* renamed from: X.3Ds  reason: invalid class name and case insensitive filesystem */
public final class C64493Ds implements C85254Fn {
    public final /* synthetic */ WaFlowsViewModel A00;
    public final /* synthetic */ String A01;

    public void BU3(C108985dt r3) {
        AnonymousClass08M r1;
        String str;
        C162457s7.A0J(r3, 0);
        boolean z = r3.A0Z;
        WaFlowsViewModel waFlowsViewModel = this.A00;
        if (z) {
            r1 = waFlowsViewModel.A01;
            str = this.A01;
        } else {
            r1 = waFlowsViewModel.A05;
            str = "extensions-invalid-business-profile";
        }
        r1.A0G(str);
    }

    public C64493Ds(WaFlowsViewModel waFlowsViewModel, String str) {
        this.A00 = waFlowsViewModel;
        this.A01 = str;
    }

    public void BU1() {
        this.A00.A05.A0G("extensions-invalid-business-profile");
    }

    public void BU2() {
    }
}
