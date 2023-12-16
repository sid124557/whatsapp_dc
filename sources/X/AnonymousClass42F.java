package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.whatsapp.extensions.phoenix.view.ExtensionsInitialLoadingView;

/* renamed from: X.42F  reason: invalid class name */
public final class AnonymousClass42F extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ ExtensionsInitialLoadingView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass42F(ExtensionsInitialLoadingView extensionsInitialLoadingView) {
        super(1);
        this.this$0 = extensionsInitialLoadingView;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        AnonymousClass5UY r2 = this.this$0.A0B;
        if (r2 == null) {
            throw C18270x1.A0S("businessLogoViewStubHolder");
        }
        int i = 8;
        if (bitmap != null) {
            i = 0;
        }
        r2.A06(i);
        if (bitmap != null) {
            AnonymousClass5UY r0 = this.this$0.A0B;
            if (r0 == null) {
                throw C18270x1.A0S("businessLogoViewStubHolder");
            }
            ((ImageView) r0.A04()).setImageBitmap(bitmap);
        }
        return C59022wD.A00;
    }
}
