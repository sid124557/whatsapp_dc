package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: X.0BL  reason: invalid class name */
public abstract class AnonymousClass0BL extends AnonymousClass0UM {
    public final BroadcastReceiver A00 = new C17480ve(this, 4);

    public abstract IntentFilter A06();

    public abstract void A07(Intent intent);

    public AnonymousClass0BL(Context context, C16180sb r4) {
        super(context, r4);
    }

    public void A04() {
        C06240Wu A002 = C06240Wu.A00();
        String str = C03220Jh.A00;
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A1A(this, A0o);
        C06240Wu.A03(A002, ": registering receiver", str, A0o);
        this.A01.registerReceiver(this.A00, A06());
    }

    public void A05() {
        C06240Wu A002 = C06240Wu.A00();
        String str = C03220Jh.A00;
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A1A(this, A0o);
        C06240Wu.A03(A002, ": unregistering receiver", str, A0o);
        this.A01.unregisterReceiver(this.A00);
    }
}
