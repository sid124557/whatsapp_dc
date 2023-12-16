package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.test.core.app.InstrumentationActivityInvoker$BootstrapActivity;
import androidx.test.core.app.InstrumentationActivityInvoker$EmptyActivity;
import androidx.test.core.app.InstrumentationActivityInvoker$EmptyFloatingActivity;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: X.0ve  reason: invalid class name and case insensitive filesystem */
public class C17480ve extends BroadcastReceiver {
    public Object A00;
    public final int A01;

    public static void A00(Intent intent, C17480ve r2) {
        C162457s7.A0J(intent, 1);
        ((AnonymousClass0BL) r2.A00).A07(intent);
    }

    public C17480ve(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A01(C17480ve r6) {
        Log.i("gdrive-notification-manager/user-decided-to-backup-over-data-connection");
        C10230hb r5 = (C10230hb) r6.A00;
        Context A06 = r5.A0I.A06();
        Intent intent = new Intent();
        intent.setClassName(A06.getPackageName(), "com.whatsapp.backup.google.SettingsGoogleDrive");
        if (!TextUtils.isEmpty("action_perform_backup_over_cellular")) {
            intent.setAction("action_perform_backup_over_cellular");
        }
        intent.setFlags(335544320);
        A06.startActivity(intent);
        A06.unregisterReceiver(r6);
        r5.A0F();
    }

    public static void A02(C17480ve r2) {
        Log.i("gdrive-notification-manager/user-decided-to-restore-over-low-battery");
        C10230hb r1 = (C10230hb) r2.A00;
        r1.A0F.A0B();
        r1.A0I.A06().unregisterReceiver(r2);
        r1.A0F();
    }

    public static void A03(C17480ve r5) {
        Log.i("gdrive-notification-manager/user-dismissed the notification");
        C10230hb r4 = (C10230hb) r5.A00;
        r4.A0I.A06().unregisterReceiver(r5);
        try {
            C34171uL A03 = r4.A0O;
            Iterator it = ((List) ((C06310Xb) A03.get()).A04("com.whatsapp.backup.google.google-backup-worker").get()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C04610Pv r3 = (C04610Pv) it.next();
                if (r3.A03 == AnonymousClass0GD.RUNNING) {
                    C06310Xb r2 = (C06310Xb) A03.get();
                    r2.A06.B2t(new AnonymousClass0BO(r2, r3.A05));
                    break;
                }
            }
        } catch (InterruptedException | ExecutionException e) {
            Log.e("gdrive-notification-manager/couldn't cancel worker.", e);
        }
        r4.A0F();
    }

    public static void A04(C17480ve r6) {
        Log.i("gdrive-notification-manager/user-decided-to-restore-over-data-connection");
        C10230hb r5 = (C10230hb) r6.A00;
        Context A06 = r5.A0I.A06();
        Intent intent = new Intent();
        intent.setClassName(A06.getPackageName(), "com.whatsapp.backup.google.SettingsGoogleDrive");
        if (!TextUtils.isEmpty("action_perform_media_restore_over_cellular")) {
            intent.setAction("action_perform_media_restore_over_cellular");
        }
        intent.setFlags(335544320);
        A06.startActivity(intent);
        A06.unregisterReceiver(r6);
        r5.A0F();
    }

    public static void A05(C17480ve r2) {
        Log.i("gdrive-notification-manager/user-decided-to-restore-over-low-battery");
        C10230hb r1 = (C10230hb) r2.A00;
        r1.A0F.A0D();
        r1.A0I.A06().unregisterReceiver(r2);
        r1.A0F();
    }

    public void onReceive(Context context, Intent intent) {
        switch (this.A01) {
            case 0:
                ((AnonymousClass0QQ) this.A00).A04();
                return;
            case 1:
                InstrumentationActivityInvoker$BootstrapActivity instrumentationActivityInvoker$BootstrapActivity = (InstrumentationActivityInvoker$BootstrapActivity) this.A00;
                instrumentationActivityInvoker$BootstrapActivity.finishActivity(0);
                instrumentationActivityInvoker$BootstrapActivity.finish();
                return;
            case 2:
                ((InstrumentationActivityInvoker$EmptyActivity) this.A00).finish();
                return;
            case 3:
                ((InstrumentationActivityInvoker$EmptyFloatingActivity) this.A00).finish();
                return;
            case 4:
                A00(intent, this);
                return;
            case 5:
                A01(this);
                return;
            case 6:
                A02(this);
                return;
            case 7:
                A03(this);
                return;
            case 8:
                A04(this);
                return;
            default:
                A05(this);
                return;
        }
    }
}
