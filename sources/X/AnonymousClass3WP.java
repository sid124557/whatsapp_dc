package X;

import android.content.Context;
import com.whatsapp.push.RegistrationIntentService;
import com.whatsapp.util.Log;

/* renamed from: X.3WP  reason: invalid class name */
public class AnonymousClass3WP implements AnonymousClass66I {
    public final Context A00;
    public final C56972sr A01;
    public final AnonymousClass33p A02;

    public void BMb() {
        C183538qC r3 = this.A02.A01;
        C18300x5.A0B(r3).getInt("c2dm_app_vers", 0);
        C18300x5.A0B(r3).getString("c2dm_reg_id", (String) null);
        if (C56972sr.A00(this.A01) != null) {
            Log.i("updatedappreceiver/request-refresh");
            RegistrationIntentService.A01(this.A00.getApplicationContext());
            return;
        }
        Log.i("updateappreceiver/skip-refresh");
    }

    public AnonymousClass3WP(Context context, C56972sr r2, AnonymousClass33p r3) {
        this.A00 = context;
        this.A01 = r2;
        this.A02 = r3;
    }

    public /* synthetic */ void BMc() {
    }
}
