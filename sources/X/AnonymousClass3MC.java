package X;

import com.whatsapp.extensions.webview.bridge.FlowsWebViewDataRepository;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3MC  reason: invalid class name */
public final class AnonymousClass3MC implements AnonymousClass4EG {
    public final /* synthetic */ FlowsWebViewDataRepository A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ C84814Du A02;

    public AnonymousClass3MC(FlowsWebViewDataRepository flowsWebViewDataRepository, UserJid userJid, C84814Du r3) {
        this.A02 = r3;
        this.A00 = flowsWebViewDataRepository;
        this.A01 = userJid;
    }

    public void BQb(String str) {
    }

    public void BUw(boolean z, String str) {
        Object r0;
        C84814Du r2 = this.A02;
        if (z) {
            r0 = new C23671Uf(this.A00.A09.A01(this.A01.user));
        } else {
            r0 = new C23661Ue(str);
        }
        r2.BkD(r0);
    }

    public void BQc(UserJid userJid, String str, int i, boolean z, boolean z2) {
    }
}
