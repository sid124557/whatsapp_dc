package X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import com.whatsapp.R;

/* renamed from: X.5Ad  reason: invalid class name and case insensitive filesystem */
public class C100245Ad {
    public static void A00(Activity activity, C69263Wi r4, AnonymousClass1VX r5, C105055Tk r6, int i, int i2) {
        if (r5.A0X(913)) {
            Intent A07 = C18320x8.A07();
            A07.setClassName(activity.getPackageName(), "com.whatsapp.contact.contactform.ContactFormActivity");
            activity.startActivityForResult(A07, i);
            r6.A03(true, i2);
            return;
        }
        Intent A09 = AnonymousClass0x9.A09("android.intent.action.INSERT");
        A09.setType("vnd.android.cursor.dir/contact");
        try {
            activity.startActivityForResult(A09, i);
            r6.A03(true, i2);
        } catch (ActivityNotFoundException unused) {
            r4.A0H(R.string.f11nameremoved, 0);
        }
    }
}
