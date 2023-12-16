package X;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.whatsapp.R;
import com.whatsapp.accountsync.LoginActivity;

/* renamed from: X.54W  reason: invalid class name */
public class AnonymousClass54W extends AnonymousClass5ZM {
    public final ProgressDialog A00;
    public final /* synthetic */ LoginActivity A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass54W(Context context, LoginActivity loginActivity) {
        super(loginActivity, true);
        this.A01 = loginActivity;
        ProgressDialog show = ProgressDialog.show(context, "", loginActivity.getString(R.string.f11nameremoved), true, false);
        this.A00 = show;
        show.setCancelable(true);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        SystemClock.sleep(2000);
        LoginActivity loginActivity = this.A01;
        Account account = new Account(loginActivity.getString(R.string.f11nameremoved), "com.whatsapp");
        if (!AccountManager.get(loginActivity).addAccountExplicitly(account, (String) null, (Bundle) null)) {
            return Boolean.FALSE;
        }
        Bundle A08 = AnonymousClass002.A08();
        A08.putString("authAccount", account.name);
        A08.putString("accountType", account.type);
        loginActivity.A01 = A08;
        return Boolean.TRUE;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        this.A00.dismiss();
        if (((Boolean) obj).booleanValue()) {
            this.A01.finish();
        }
    }
}
