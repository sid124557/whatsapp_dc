package X;

import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;

/* renamed from: X.622  reason: invalid class name */
public final class AnonymousClass622 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ WeakReference $weakActivity;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass622(WeakReference weakReference) {
        super(1);
        this.$weakActivity = weakReference;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Context A0U = C86664Kz.A0U(this.$weakActivity);
        if (A0U != null) {
            Intent A07 = C18320x8.A07();
            A07.setClassName(A0U.getPackageName(), "com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity");
            A0U.startActivity(A07);
        }
        return C59022wD.A00;
    }
}
