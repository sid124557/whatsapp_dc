package X;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.whatsapp.newsletter.NewsletterLinkLauncher;

/* renamed from: X.37C  reason: invalid class name */
public final /* synthetic */ class AnonymousClass37C implements DialogInterface.OnKeyListener {
    public final /* synthetic */ C89654ea A00;
    public final /* synthetic */ AnonymousClass2LU A01;
    public final /* synthetic */ NewsletterLinkLauncher A02;

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        NewsletterLinkLauncher newsletterLinkLauncher = this.A02;
        C89654ea r3 = this.A00;
        AnonymousClass2LU r2 = this.A01;
        if (i == 4) {
            AnonymousClass495 r0 = newsletterLinkLauncher.A00;
            if (r0 != null) {
                r0.cancel();
                newsletterLinkLauncher.A04(r3);
                try {
                    r3.BjL();
                } catch (Throwable th) {
                    AnonymousClass3Z0.A01(th);
                }
            }
            dialogInterface.dismiss();
            r2.A00 = true;
        }
        return true;
    }

    public /* synthetic */ AnonymousClass37C(C89654ea r1, AnonymousClass2LU r2, NewsletterLinkLauncher newsletterLinkLauncher) {
        this.A02 = newsletterLinkLauncher;
        this.A00 = r1;
        this.A01 = r2;
    }
}
