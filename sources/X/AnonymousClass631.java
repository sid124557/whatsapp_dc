package X;

import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;

/* renamed from: X.631  reason: invalid class name */
public final class AnonymousClass631 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ WeakReference $weakActivity;
    public final /* synthetic */ C105325Um this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass631(C105325Um r2, WeakReference weakReference) {
        super(1);
        this.$weakActivity = weakReference;
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Context A0U = C86664Kz.A0U(this.$weakActivity);
        if (A0U != null) {
            this.this$0.A05.A05(2, true);
            Intent A07 = C18320x8.A07();
            A07.setClassName(A0U.getPackageName(), "com.whatsapp.newsletter.ui.NewsletterCreationActivity");
            A0U.startActivity(A07);
        }
        return C59022wD.A00;
    }
}
