package X;

import android.graphics.Bitmap;
import com.whatsapp.extensions.bloks.viewmodel.WaExtensionsNavBarViewModel;

/* renamed from: X.3E7  reason: invalid class name */
public final class AnonymousClass3E7 implements AnonymousClass4CQ {
    public final /* synthetic */ WaExtensionsNavBarViewModel A00;

    public AnonymousClass3E7(WaExtensionsNavBarViewModel waExtensionsNavBarViewModel) {
        this.A00 = waExtensionsNavBarViewModel;
    }

    public void Bcz(Bitmap bitmap) {
        this.A00.A02.A0G(bitmap);
    }

    public void BRy() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ExtensionsLogger/WaGalaxyImageViewModel/setupTopNavBar/Error while loading image");
        C18260x0.A1K(A0o, "");
    }
}
