package androidx.core.app;

import X.C04730Qk;
import X.C05740Us;
import X.C05750Ut;
import X.C07860cw;
import X.C14880qQ;
import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

public class NotificationCompat$BigPictureStyle extends C04730Qk {
    public IconCompat A00;
    public boolean A01;

    public String A04() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    public void A06(C14880qQ r9) {
        Context context;
        int i = Build.VERSION.SDK_INT;
        C07860cw r7 = (C07860cw) r9;
        Notification.BigPictureStyle A012 = C05740Us.A01(C05740Us.A02(r7.A02), (CharSequence) null);
        IconCompat iconCompat = this.A00;
        if (iconCompat != null) {
            if (i >= 31) {
                if (r9 instanceof C07860cw) {
                    context = r7.A03;
                } else {
                    context = null;
                }
                C05750Ut.A02(A012, iconCompat.A09(context));
            } else if (iconCompat.A05() == 1) {
                A012 = C05740Us.A00(A012, this.A00.A06());
            }
        }
        if (this.A01) {
            A012.bigLargeIcon((Bitmap) null);
        }
        if (this.A02) {
            A012.setSummaryText(this.A01);
        }
        if (i >= 31) {
            C05750Ut.A01(A012);
            C05750Ut.A00(A012);
        }
    }
}
