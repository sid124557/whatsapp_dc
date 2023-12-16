package X;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.ConditionVariable;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;

/* renamed from: X.0hV  reason: invalid class name and case insensitive filesystem */
public class C10170hV implements C17380vR {
    public final C56972sr A00;
    public final C10240hc A01;
    public final C06260Ww A02;
    public final AnonymousClass0QJ A03;
    public final AnonymousClass310 A04;
    public final C56612sH A05;
    public final C54292oU A06;
    public final AnonymousClass33p A07;
    public final AnonymousClass3DW A08;
    public final C625835r A09;
    public final AnonymousClass4FS A0A;

    /* access modifiers changed from: private */
    public /* synthetic */ C59852xb A02(C15500rR r2) {
        return this.A09.A0I(r2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A07(ServiceConnection serviceConnection, ConditionVariable conditionVariable, String str) {
        String user;
        Log.i("registrationmanager/success/waiting-for-gdrive-service-object");
        conditionVariable.block();
        Log.i("registrationmanager/success/cancel-pending-gdrive-backup-and-restore-if-any");
        this.A02.A09();
        Log.i("registrationmanager/success/gdrive-start-change-number");
        Context A062 = this.A06.A06();
        Intent A0t = C627736r.A0t(A062, "action_change_number");
        A0t.putExtra("old_phone_number", str);
        PhoneUserJid A0J = this.A00.A0J();
        if (A0J == null) {
            user = null;
        } else {
            user = A0J.getUser();
        }
        A0t.putExtra("new_phone_number", user);
        AnonymousClass29R.A00(A062, A0t);
        A062.unbindService(serviceConnection);
        this.A08.A00();
    }

    public C10170hV(C56972sr r1, C10240hc r2, C06260Ww r3, AnonymousClass0QJ r4, AnonymousClass310 r5, C56612sH r6, C54292oU r7, AnonymousClass33p r8, AnonymousClass3DW r9, C625835r r10, AnonymousClass4FS r11) {
        this.A05 = r6;
        this.A06 = r7;
        this.A00 = r1;
        this.A0A = r11;
        this.A04 = r5;
        this.A08 = r9;
        this.A09 = r10;
        this.A02 = r3;
        this.A07 = r8;
        this.A01 = r2;
        this.A03 = r4;
    }

    public static /* synthetic */ void A05(Context context, Intent intent, ConditionVariable conditionVariable) {
        conditionVariable.block();
        AnonymousClass29R.A00(context, intent);
    }
}
