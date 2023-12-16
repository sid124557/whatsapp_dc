package X;

import com.whatsapp.extensions.bloks.viewmodel.WaExtensionsNavBarViewModel;

/* renamed from: X.43j  reason: invalid class name and case insensitive filesystem */
public final class C823843j extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ String $businessLogoPath;
    public final /* synthetic */ WaExtensionsNavBarViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C823843j(WaExtensionsNavBarViewModel waExtensionsNavBarViewModel, String str) {
        super(1);
        this.this$0 = waExtensionsNavBarViewModel;
        this.$businessLogoPath = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (obj != null) {
            this.this$0.A02.A0G(obj);
        } else {
            String str = this.$businessLogoPath;
            if (!(str == null || str.length() == 0)) {
                WaExtensionsNavBarViewModel waExtensionsNavBarViewModel = this.this$0;
                waExtensionsNavBarViewModel.A08.A00(new AnonymousClass3E7(waExtensionsNavBarViewModel), str);
            }
        }
        return C59022wD.A00;
    }
}
