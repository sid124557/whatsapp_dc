package X;

import android.os.PersistableBundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.0RL  reason: invalid class name */
public class AnonymousClass0RL {
    public static PersistableBundle A00(C04440Of r3) {
        String str;
        PersistableBundle persistableBundle = new PersistableBundle();
        CharSequence charSequence = r3.A01;
        if (charSequence != null) {
            str = charSequence.toString();
        } else {
            str = null;
        }
        persistableBundle.putString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
        persistableBundle.putString("uri", r3.A03);
        persistableBundle.putString("key", r3.A02);
        persistableBundle.putBoolean("isBot", r3.A04);
        persistableBundle.putBoolean("isImportant", r3.A05);
        return persistableBundle;
    }

    public static C04440Of A01(PersistableBundle persistableBundle) {
        C03910Ma r1 = new C03910Ma();
        r1.A01 = persistableBundle.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        r1.A03 = persistableBundle.getString("uri");
        r1.A02 = persistableBundle.getString("key");
        r1.A04 = persistableBundle.getBoolean("isBot");
        r1.A05 = persistableBundle.getBoolean("isImportant");
        return new C04440Of(r1);
    }
}
