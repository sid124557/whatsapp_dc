package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;

/* renamed from: X.0BK  reason: invalid class name */
public final class AnonymousClass0BK extends AnonymousClass0BL {
    public final ConnectivityManager A00;

    public /* bridge */ /* synthetic */ Object A03() {
        return AnonymousClass0VK.A00(this.A00);
    }

    public IntentFilter A06() {
        return new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    }

    public AnonymousClass0BK(Context context, C16180sb r4) {
        super(context, r4);
        Object systemService = this.A01.getSystemService("connectivity");
        C162457s7.A0K(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.A00 = (ConnectivityManager) systemService;
    }

    public void A07(Intent intent) {
        if (C162457s7.A0P(intent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
            C06240Wu.A00().A04(AnonymousClass0VK.A00, "Network broadcast received");
            A02(AnonymousClass0VK.A00(this.A00));
        }
    }
}
