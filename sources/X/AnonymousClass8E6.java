package X;

import com.whatsapp.util.Log;

/* renamed from: X.8E6  reason: invalid class name */
public final class AnonymousClass8E6 implements AnonymousClass66T {
    public final /* synthetic */ AnonymousClass4GW A00;

    public void BeC(String str) {
        C162457s7.A0J(str, 0);
        Log.d("GraphApiACSNetworkRequest onTokenIssuanceSuccess");
        this.A00.BkD(new C134606jJ(str));
    }

    public AnonymousClass8E6(AnonymousClass4GW r1) {
        this.A00 = r1;
    }

    public void BeB(int i) {
        Object r0;
        Log.d("GraphApiACSNetworkRequest onTokenIssuanceFailure");
        AnonymousClass4GW r3 = this.A00;
        if (i == 4) {
            r0 = new C134616jK(new AnonymousClass7T4((Integer) null, (String) null, 0), -1);
        } else {
            r0 = new C134606jJ((Object) null);
        }
        r3.BkD(r0);
    }

    public void BeD(int i) {
        Log.d("GraphApiACSNetworkRequest onTokenNotReady");
        this.A00.BkD(new C134606jJ((Object) null));
    }
}
