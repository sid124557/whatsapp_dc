package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.AlarmBroadcastReceiver;

/* renamed from: X.5Tx  reason: invalid class name and case insensitive filesystem */
public abstract class C105185Tx {
    public final Context A00;

    public void A02(Intent intent) {
        ((C89914fU) this).A00.A04();
        throw AnonymousClass001.A0g("clearAwayMessagesTable");
    }

    public PendingIntent A00(String str, int i) {
        Context context = this.A00;
        return C624735e.A01(context, 0, new Intent(str, (Uri) null, context, AlarmBroadcastReceiver.class), i);
    }

    public void A01() {
    }

    public boolean A03() {
        return true;
    }

    public C105185Tx(Context context) {
        this.A00 = context;
    }

    public boolean A04(Intent intent) {
        return false;
    }
}
