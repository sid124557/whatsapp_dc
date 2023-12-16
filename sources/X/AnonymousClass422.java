package X;

import android.graphics.Bitmap;
import com.whatsapp.WaImageView;
import com.whatsapp.extensions.bloks.view.ExtensionsBottomsheetBaseContainer;

/* renamed from: X.422  reason: invalid class name */
public final class AnonymousClass422 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ ExtensionsBottomsheetBaseContainer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass422(ExtensionsBottomsheetBaseContainer extensionsBottomsheetBaseContainer) {
        super(1);
        this.this$0 = extensionsBottomsheetBaseContainer;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        WaImageView waImageView = this.this$0.A06;
        if (waImageView != null) {
            waImageView.setImageBitmap(bitmap);
        }
        return C59022wD.A00;
    }
}
