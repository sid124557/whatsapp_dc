package X;

import com.whatsapp.util.Log;

/* renamed from: X.61z  reason: invalid class name and case insensitive filesystem */
public final class C1218161z extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ C182808p1 $callback;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1218161z(C182808p1 r2) {
        super(1);
        this.$callback = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Log.w("NewsletterLinkPreviewChecker/link NOT allowed");
        this.$callback.BJi();
        return Boolean.TRUE;
    }
}
