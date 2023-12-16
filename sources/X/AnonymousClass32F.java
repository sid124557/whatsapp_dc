package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: X.32F  reason: invalid class name */
public final class AnonymousClass32F {
    public final C56972sr A00;
    public final C40702Hk A01;
    public final C55952rB A02;
    public final AnonymousClass4FS A03;

    public static final void A00(Context context, AnonymousClass5W0 r5, C1229366k r6, Integer num, String str) {
        int i;
        C18270x1.A11(context, 0, r5);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PrivacyDisclosureLauncher: launchDisclosure: id=");
        A0o.append(num);
        C18260x0.A0q(", surface=", str, A0o);
        AnonymousClass5WQ.A00 = null;
        if (r6 != null) {
            AnonymousClass5WQ.A00 = AnonymousClass0x9.A14(r6);
        }
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.privacy.disclosure.ui.PrivacyDisclosureContainerActivity");
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        A07.putExtra("disclosure_id", i);
        if (!TextUtils.isEmpty(str)) {
            A07.putExtra("surface", str);
        }
        Integer num2 = r5.A00;
        if (num2 != null) {
            A07.putExtra("trigger", num2.intValue());
        }
        A07.addFlags(65536);
        context.startActivity(A07);
        if (context instanceof Activity) {
            ((Activity) context).overridePendingTransition(0, 0);
        }
    }

    public static final boolean A01(Uri uri) {
        if (uri.getPathSegments().size() != 2) {
            return false;
        }
        String str = uri.getPathSegments().get(0);
        C162457s7.A0D(str);
        Locale locale = Locale.ROOT;
        if (!"privacy".equals(C18320x8.A0g(locale, str))) {
            return false;
        }
        Object A0u = AnonymousClass0x9.A0u(uri.getPathSegments());
        C162457s7.A0D(A0u);
        if ("disclosure".equals(C18320x8.A0g(locale, (String) A0u))) {
            return true;
        }
        return false;
    }

    public AnonymousClass32F(C56972sr r1, C40702Hk r2, C55952rB r3, AnonymousClass4FS r4) {
        C18260x0.A0c(r4, r1, r3, r2);
        this.A03 = r4;
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }
}
