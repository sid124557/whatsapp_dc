package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Log;

/* renamed from: X.0BM  reason: invalid class name */
public final class AnonymousClass0BM extends AnonymousClass0UM {
    public final ConnectivityManager A00;
    public final AnonymousClass01O A01 = new AnonymousClass01O(this);

    public /* bridge */ /* synthetic */ Object A03() {
        return AnonymousClass0VK.A00(this.A00);
    }

    public void A04() {
        try {
            C06240Wu.A00().A04(AnonymousClass0VK.A00, "Registering network callback");
            AnonymousClass0J4.A00(this.A01, this.A00);
        } catch (IllegalArgumentException | SecurityException e) {
            C06240Wu.A00();
            Log.e(AnonymousClass0VK.A00, "Received exception while registering network callback", e);
        }
    }

    public void A05() {
        try {
            C06240Wu.A00().A04(AnonymousClass0VK.A00, "Unregistering network callback");
            AnonymousClass0V9.A01(this.A01, this.A00);
        } catch (IllegalArgumentException | SecurityException e) {
            C06240Wu.A00();
            Log.e(AnonymousClass0VK.A00, "Received exception while unregistering network callback", e);
        }
    }

    public AnonymousClass0BM(Context context, C16180sb r4) {
        super(context, r4);
        Object systemService = this.A01.getSystemService("connectivity");
        C162457s7.A0K(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.A00 = (ConnectivityManager) systemService;
    }
}
