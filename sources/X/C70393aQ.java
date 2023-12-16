package X;

import androidx.fragment.app.DialogFragment;
import com.whatsapp.extensions.phoenix.webview.FcsExtensionsWebViewFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3aQ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70393aQ implements Runnable {
    public final /* synthetic */ FcsExtensionsWebViewFragment A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ C624134x A02;
    public final /* synthetic */ boolean A03;

    public final void run() {
        AnonymousClass2z0 r0;
        FcsExtensionsWebViewFragment fcsExtensionsWebViewFragment = this.A00;
        UserJid userJid = this.A01;
        boolean z = this.A03;
        C624134x r3 = this.A02;
        AnonymousClass1VX r2 = fcsExtensionsWebViewFragment.A02;
        if (r2 != null) {
            AnonymousClass5XI r1 = new AnonymousClass5XI(r2, userJid, "extension_menu_report", z);
            r1.A01 = userJid;
            if (r3 != null) {
                r0 = r3.A1J;
            } else {
                r0 = null;
            }
            r1.A02 = r0;
            DialogFragment A002 = r1.A00();
            C003203q A0Q = fcsExtensionsWebViewFragment.A0Q();
            C162457s7.A0K(A0Q, "null cannot be cast to non-null type com.whatsapp.DialogInterface");
            ((AnonymousClass4FU) A0Q).Boo(A002);
            return;
        }
        throw C18270x1.A0R();
    }

    public /* synthetic */ C70393aQ(FcsExtensionsWebViewFragment fcsExtensionsWebViewFragment, UserJid userJid, C624134x r3, boolean z) {
        this.A00 = fcsExtensionsWebViewFragment;
        this.A01 = userJid;
        this.A03 = z;
        this.A02 = r3;
    }
}
