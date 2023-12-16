package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.whatsapp.util.Log;

/* renamed from: X.376  reason: invalid class name */
public final /* synthetic */ class AnonymousClass376 implements DialogInterface.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass33p A01;
    public final /* synthetic */ C54412og A02;
    public final /* synthetic */ Runnable A03;
    public final /* synthetic */ String A04;

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass33p r7 = this.A01;
        Activity activity = this.A00;
        String str = this.A04;
        C54412og r4 = this.A02;
        Runnable runnable = this.A03;
        Log.i("RegistrationUtils/showLoginFailedDialog/exit login");
        C18270x1.A0j(C18270x1.A03(r7), "account_switching_logged_out_phone_number", (String) null);
        activity.startActivity(C627736r.A11(activity, str, r4.A02(), r7.A0C()));
        if (runnable != null) {
            runnable.run();
        }
    }

    public /* synthetic */ AnonymousClass376(Activity activity, AnonymousClass33p r2, C54412og r3, Runnable runnable, String str) {
        this.A01 = r2;
        this.A00 = activity;
        this.A04 = str;
        this.A02 = r3;
        this.A03 = runnable;
    }
}
