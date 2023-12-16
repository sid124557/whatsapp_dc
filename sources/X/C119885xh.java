package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.5xh  reason: invalid class name and case insensitive filesystem */
public final class C119885xh extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ C102045Hg this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C119885xh(C102045Hg r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        File A0A = AnonymousClass002.A0A(this.this$0.A00.A00.getCacheDir(), "newsletter_image_cache");
        if (!A0A.mkdirs() && !A0A.isDirectory()) {
            Log.w("NewsletterBitmapCache Unable to create newsletter cache dir");
        }
        return new AnonymousClass30R(A0A, 1048576);
    }
}
