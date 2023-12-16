package com.whatsapp.notification;

import X.AnonymousClass000;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass24P;
import X.AnonymousClass2A1;
import X.AnonymousClass2RW;
import X.AnonymousClass33p;
import X.C106405Yw;
import X.C18270x1;
import X.C619933b;
import X.C70283aF;
import X.C95814uZ;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;
import java.util.Locale;

public class MessageNotificationDismissedReceiver extends BroadcastReceiver {
    public AnonymousClass33p A00;
    public C619933b A01;
    public AnonymousClass2RW A02;
    public final Object A03;
    public volatile boolean A04;

    public void onReceive(Context context, Intent intent) {
        if (!this.A04) {
            synchronized (this.A03) {
                if (!this.A04) {
                    AnonymousClass2A1.A00(context).ARQ(this);
                    this.A04 = true;
                }
            }
        }
        if (intent.hasExtra("chat_jid")) {
            long longExtra = intent.getLongExtra("last_message_time", -1);
            String stringExtra = intent.getStringExtra("chat_jid");
            Locale locale = Locale.US;
            Object[] A1X = AnonymousClass0x9.A1X();
            A1X[0] = "messagenotificationdismissedreceiver/onreceive";
            A1X[1] = stringExtra;
            AnonymousClass000.A1Q(A1X, 2, longExtra);
            Log.d(String.format(locale, "%s child notification: chatJid=%s, last_message_time=%d", A1X));
            AnonymousClass2RW r3 = this.A02;
            String stringExtra2 = intent.getStringExtra("chat_jid");
            long longExtra2 = intent.getLongExtra("last_message_time", -1);
            try {
                C95814uZ A042 = C106405Yw.A04(stringExtra2);
                AnonymousClass0x2.A1K(A042, r3.A03, longExtra2);
                r3.A02.BkM(new C70283aF(r3, A042, 13, longExtra2));
            } catch (AnonymousClass24P unused) {
                Log.e("messagenotificationdismisshelper/handleDismissIntent: Invalid Jid stored in intent");
            }
        } else {
            String stringExtra3 = intent.getStringExtra("notification_hash");
            C18270x1.A0j(C18270x1.A03(this.A00), "notification_hash", stringExtra3);
            Log.d(String.format("%s summary notification: notification_hash=%s", new Object[]{"messagenotificationdismissedreceiver/onreceive", stringExtra3}));
            this.A01.A06();
        }
    }

    public MessageNotificationDismissedReceiver(int i) {
        this.A04 = false;
        this.A03 = AnonymousClass002.A0D();
    }

    public MessageNotificationDismissedReceiver() {
        this(0);
    }
}
