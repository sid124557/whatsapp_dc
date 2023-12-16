package X;

import android.app.Person;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.0Of  reason: invalid class name and case insensitive filesystem */
public class C04440Of {
    public IconCompat A00;
    public CharSequence A01;
    public String A02;
    public String A03;
    public boolean A04;
    public boolean A05;

    public C04440Of(C03910Ma r2) {
        this.A01 = r2.A01;
        this.A00 = r2.A00;
        this.A03 = r2.A03;
        this.A02 = r2.A02;
        this.A04 = r2.A04;
        this.A05 = r2.A05;
    }

    public Person A00() {
        return AnonymousClass0HW.A00(this);
    }

    public Bundle A01() {
        Bundle bundle;
        Bundle A08 = AnonymousClass002.A08();
        A08.putCharSequence(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, this.A01);
        IconCompat iconCompat = this.A00;
        if (iconCompat != null) {
            bundle = iconCompat.A0B();
        } else {
            bundle = null;
        }
        A08.putBundle(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, bundle);
        A08.putString("uri", this.A03);
        A08.putString("key", this.A02);
        A08.putBoolean("isBot", this.A04);
        A08.putBoolean("isImportant", this.A05);
        return A08;
    }
}
