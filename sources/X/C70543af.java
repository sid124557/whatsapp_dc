package X;

import android.content.Context;
import com.whatsapp.extensions.phoenix.viewmodel.ExtensionsFooterViewModel;

/* renamed from: X.3af  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70543af implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ AnonymousClass3ZH A03;
    public final /* synthetic */ ExtensionsFooterViewModel A04;

    public final void run() {
        ExtensionsFooterViewModel extensionsFooterViewModel = this.A04;
        Context context = this.A02;
        AnonymousClass3ZH r3 = this.A03;
        int i = this.A01;
        extensionsFooterViewModel.A01.A0G(extensionsFooterViewModel.A03.A03(context, r3, this.A00, i, false));
    }

    public /* synthetic */ C70543af(Context context, AnonymousClass3ZH r2, ExtensionsFooterViewModel extensionsFooterViewModel, float f, int i) {
        this.A04 = extensionsFooterViewModel;
        this.A02 = context;
        this.A03 = r2;
        this.A01 = i;
        this.A00 = f;
    }
}
