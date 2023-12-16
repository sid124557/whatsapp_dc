package X;

import android.net.Uri;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.2XF  reason: invalid class name */
public final class AnonymousClass2XF {
    public final C389129u A00;

    public AnonymousClass2XF(C389129u r1) {
        this.A00 = r1;
    }

    public final Uri A00(String str) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("https://");
        String format = String.format(Locale.ENGLISH, "m.%sfacebook.com", Arrays.copyOf(new Object[]{""}, 1));
        C162457s7.A0D(format);
        A0o.append(format);
        String A0X = AnonymousClass000.A0X("/wa-xf-login/?app_id=%s&etoken=%s", A0o);
        Object[] objArr = new Object[2];
        C18280x3.A19("3402315746664947", str, objArr);
        String format2 = String.format(A0X, Arrays.copyOf(objArr, 2));
        C162457s7.A0D(format2);
        return Uri.parse(format2);
    }
}
