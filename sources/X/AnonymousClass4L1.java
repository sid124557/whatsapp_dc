package X;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.accountsync.LoginActivity;
import com.whatsapp.util.Log;
import java.util.Arrays;

/* renamed from: X.4L1  reason: invalid class name */
public class AnonymousClass4L1 extends AbstractAccountAuthenticator {
    public final Context A00;

    public Bundle addAccount(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, String str2, String[] strArr, Bundle bundle) {
        Log.i("account/sync/addAccount");
        Bundle A08 = AnonymousClass002.A08();
        Intent A082 = AnonymousClass0x9.A08(this.A00, LoginActivity.class);
        A082.putExtra("accountAuthenticatorResponse", accountAuthenticatorResponse);
        A08.putParcelable("intent", A082);
        return A08;
    }

    public Bundle confirmCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, Bundle bundle) {
        Log.i("account/sync/confirmCredentials");
        return null;
    }

    public Bundle editProperties(AccountAuthenticatorResponse accountAuthenticatorResponse, String str) {
        Log.i("account/sync/editProperties");
        return null;
    }

    public Bundle getAuthToken(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
        Log.i("account/sync/getAuthToken");
        return null;
    }

    public String getAuthTokenLabel(String str) {
        Log.i("account/sync/getAuthTokenLabel");
        return null;
    }

    public Bundle updateCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
        Log.i("account/sync/updateCredentials");
        return null;
    }

    public AnonymousClass4L1(Context context) {
        super(context);
        this.A00 = context;
    }

    public Bundle hasFeatures(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String[] strArr) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("account/sync/hasFeatures: ");
        C18260x0.A1L(A0o, Arrays.toString(strArr));
        return null;
    }
}
