package X;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.34S  reason: invalid class name */
public final class AnonymousClass34S {
    public static final List A00;

    public static final boolean A01(Context context, String str) {
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(C18300x5.A08("upi://pay"), 65536);
        C162457s7.A0D(queryIntentActivities);
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            if (C162457s7.A0P(resolveInfo.activityInfo.packageName, str)) {
                return true;
            }
        }
        return false;
    }

    public final C133696hn A02(Resources resources, String str) {
        int i;
        if (!C162457s7.A0P(str, "WhatsappPay")) {
            if (!C162457s7.A0P(str, "other")) {
                AnonymousClass224[] values = AnonymousClass224.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        i = 0;
                        break;
                    }
                    AnonymousClass224 r1 = values[i2];
                    if (C162457s7.A0P(r1.packageName, str)) {
                        i = r1.appIcon;
                        break;
                    }
                    i2++;
                }
            } else {
                i = R.drawable.ic_send_to_upi;
            }
        } else {
            i = R.drawable.ic_wa_app_logo;
        }
        return new C133696hn(BitmapFactory.decodeResource(resources, i), str, A00(resources, str));
    }

    static {
        ArrayList A0I = AnonymousClass002.A0I(r3);
        for (AnonymousClass224 r0 : AnonymousClass224.values()) {
            A0I.add(r0.packageName);
        }
        A00 = A0I;
    }

    public static final String A00(Resources resources, String str) {
        int i;
        C18260x0.A0O(str, resources);
        if (str.equals("WhatsappPay")) {
            i = R.string.f11nameremoved;
        } else if (str.equals(AnonymousClass224.GOOGLE_PAY.packageName)) {
            i = R.string.f11nameremoved;
        } else if (str.equals(AnonymousClass224.PHONE_PE.packageName)) {
            i = R.string.f11nameremoved;
        } else if (str.equals(AnonymousClass224.PAY_TM.packageName)) {
            i = R.string.f11nameremoved;
        } else if (!str.equals("other")) {
            return "";
        } else {
            i = R.string.f11nameremoved;
        }
        String string = resources.getString(i);
        C162457s7.A0D(string);
        return string;
    }
}
