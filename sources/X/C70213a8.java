package X;

import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.extensions.phoenix.webview.FcsExtensionsWebViewFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3a8  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70213a8 implements Runnable {
    public final /* synthetic */ FcsExtensionsWebViewFragment A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ boolean A02;

    public final void run() {
        C624134x r2;
        Intent intent;
        Bundle extras;
        String string;
        FcsExtensionsWebViewFragment fcsExtensionsWebViewFragment = this.A00;
        UserJid userJid = this.A01;
        boolean z = this.A02;
        C003203q A0Q = fcsExtensionsWebViewFragment.A0Q();
        if (A0Q == null || (intent = A0Q.getIntent()) == null || (extras = intent.getExtras()) == null || (string = extras.getString("message_id")) == null) {
            r2 = null;
        } else {
            AnonymousClass2z0 A05 = AnonymousClass2z0.A05(userJid, string, false);
            C55832qz r0 = fcsExtensionsWebViewFragment.A08;
            if (r0 != null) {
                r2 = r0.A05(A05);
            } else {
                throw C18270x1.A0S("fMessageDatabase");
            }
        }
        C69263Wi r1 = fcsExtensionsWebViewFragment.A01;
        if (r1 != null) {
            r1.A0S(new C70393aQ(fcsExtensionsWebViewFragment, userJid, r2, z));
            return;
        }
        throw C18270x1.A0S("globalUI");
    }

    public /* synthetic */ C70213a8(FcsExtensionsWebViewFragment fcsExtensionsWebViewFragment, UserJid userJid, boolean z) {
        this.A00 = fcsExtensionsWebViewFragment;
        this.A01 = userJid;
        this.A02 = z;
    }
}
