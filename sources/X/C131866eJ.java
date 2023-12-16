package X;

import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;

/* renamed from: X.6eJ  reason: invalid class name and case insensitive filesystem */
public class C131866eJ extends C131876eK {
    public AccountAuthenticatorResponse A00 = null;
    public Bundle A01 = null;

    public void finish() {
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.A00;
        if (accountAuthenticatorResponse != null) {
            Bundle bundle = this.A01;
            if (bundle != null) {
                accountAuthenticatorResponse.onResult(bundle);
            } else {
                accountAuthenticatorResponse.onError(4, "canceled");
            }
            this.A00 = null;
        }
        super.finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AccountAuthenticatorResponse accountAuthenticatorResponse = (AccountAuthenticatorResponse) getIntent().getParcelableExtra("accountAuthenticatorResponse");
        this.A00 = accountAuthenticatorResponse;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onRequestContinued();
        }
    }
}
