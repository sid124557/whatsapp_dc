package X;

import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Icon;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;
import com.whatsapp.R;

/* renamed from: X.28C  reason: invalid class name */
public final class AnonymousClass28C {
    public static final Notification A00(Context context) {
        IconCompat A02;
        String str;
        int i;
        C162457s7.A0J(context, 0);
        Icon createWithResource = Icon.createWithResource(context, R.drawable.notifybar);
        createWithResource.getClass();
        int A01 = C06350Xh.A01(createWithResource);
        if (A01 != 2) {
            if (A01 == 4) {
                Uri A04 = C06350Xh.A04(createWithResource);
                A04.getClass();
                str = A04.toString();
                str.getClass();
                i = 4;
            } else if (A01 != 6) {
                A02 = new IconCompat(-1);
                A02.A06 = createWithResource;
            } else {
                Uri A042 = C06350Xh.A04(createWithResource);
                A042.getClass();
                str = A042.toString();
                str.getClass();
                i = 6;
            }
            A02 = new IconCompat(i);
            A02.A06 = str;
        } else {
            String A05 = C06350Xh.A05(createWithResource);
            try {
                A02 = IconCompat.A02(IconCompat.A00(context, A05), A05, C06350Xh.A00(createWithResource));
            } catch (Resources.NotFoundException unused) {
                throw AnonymousClass001.A0c("Icon resource cannot be found");
            }
        }
        C05610Ue r0 = new C05610Ue(context, "other_notifications@1");
        r0.A09(A02);
        return r0.A01();
    }
}
