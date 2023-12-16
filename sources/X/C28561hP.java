package X;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.whatsapp.util.Log;

/* renamed from: X.1hP  reason: invalid class name and case insensitive filesystem */
public final class C28561hP extends C50692ic {
    public void A02(Context context, C620633i r10, int i) {
        if (Build.VERSION.SDK_INT < 22) {
            String packageName = context.getPackageName();
            try {
                Uri parse = Uri.parse("content://com.sec.badge/apps");
                AnonymousClass5UR A02 = C620633i.A02(r10);
                ContentValues A06 = AnonymousClass0x9.A06();
                A06.put("package", packageName);
                A06.put("class", "com.whatsapp.Main");
                C18270x1.A0b(A06, "badgecount", i);
                String[] A1Z = AnonymousClass0x9.A1Z();
                AnonymousClass000.A16(packageName, "com.whatsapp.Main", A1Z);
                C162457s7.A0J(parse, 0);
                if (A02.A02().update(parse, A06, "package=? AND class=?", A1Z) == 0) {
                    A02.A02().insert(parse, A06);
                }
            } catch (Exception e) {
                Log.e("widgetprovider/updatebadge", e);
            }
        } else {
            Intent A09 = AnonymousClass0x9.A09("android.intent.action.BADGE_COUNT_UPDATE");
            A09.putExtra("badge_count", i);
            A09.putExtra("badge_count_package_name", context.getPackageName());
            A09.putExtra("badge_count_class_name", "com.whatsapp.Main");
            context.sendBroadcast(A09);
        }
    }
}
