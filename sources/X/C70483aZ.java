package X;

import android.content.SharedPreferences;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.util.Log;

/* renamed from: X.3aZ  reason: invalid class name and case insensitive filesystem */
public class C70483aZ implements Runnable {
    public int A00;
    public Object A01;
    public String A02;
    public String A03;
    public final int A04;

    public C70483aZ(Object obj, String str, String str2, int i, int i2) {
        this.A04 = i2;
        this.A01 = obj;
        this.A02 = str;
        this.A00 = i;
        this.A03 = str2;
    }

    public final void run() {
        if (this.A04 != 0) {
            C613130e r3 = (C613130e) this.A01;
            String str = this.A02;
            String str2 = this.A03;
            int i = this.A00;
            synchronized (r3) {
                Log.i("TwoFactorAuthManager/storeAuthSettingsAsync");
                if (str == null || str.isEmpty()) {
                    r3.A0E = "";
                    C18270x1.A0g(r3.A00().edit().remove("two_factor_auth_code").remove("two_factor_auth_using_encryption").remove("two_factor_auth_email_set").remove("two_factor_auth_nag_time").remove("two_factor_auth_nag_interval"), "two_factor_auth_last_code_correctness");
                } else {
                    r3.A0E = str;
                    C46402bZ A002 = r3.A08.A00(C58172up.A0T, str.getBytes(C58152un.A0D));
                    String str3 = null;
                    if (A002 != null) {
                        String A003 = A002.A00();
                        if (A003 == null || !str.equals(r3.A02(A003))) {
                            r3.A02.A0A("TwoFactorAuthManager/encryptCode/EncryptedCodeFailure", false, String.valueOf(AnonymousClass000.A1X(A003)));
                        } else {
                            str3 = A003;
                        }
                    }
                    boolean z = false;
                    if (str3 != null) {
                        z = true;
                        str = str3;
                    }
                    C18260x0.A1E("TwoFactorAuthManager/storeNewAuthSettings/isUsingEncryption: ", AnonymousClass001.A0o(), z);
                    SharedPreferences.Editor putBoolean = r3.A00().edit().putString("two_factor_auth_code", str).putBoolean("two_factor_auth_using_encryption", z).putLong("two_factor_auth_nag_time", System.currentTimeMillis()).putInt("two_factor_auth_nag_interval", i).putBoolean("two_factor_auth_last_code_correctness", false);
                    if (str2 != null) {
                        int i2 = 2;
                        if (str2.length() > 0) {
                            i2 = 1;
                        }
                        putBoolean.putInt("two_factor_auth_email_set", i2);
                    } else if (r3.A00().getInt("two_factor_auth_email_set", 0) == 0) {
                        r3.A04.A02(new AnonymousClass47E());
                    }
                    putBoolean.apply();
                }
                r3.A03.A0S(new C117095rN(r3, 18));
            }
            return;
        }
        String str4 = this.A02;
        int i3 = this.A00;
        String str5 = this.A03;
        ConversationsFragment conversationsFragment = ((AnonymousClass1IL) this.A01).A04;
        conversationsFragment.A0F.setProgress(i3);
        conversationsFragment.A0o.setText(str5);
        conversationsFragment.A0H.setText(str4);
    }
}
