package androidx.core.app;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0HI;
import X.AnonymousClass0HJ;
import X.AnonymousClass0HK;
import X.AnonymousClass0HN;
import X.C04730Qk;
import X.C05480Tm;
import X.C05610Ue;
import X.C07860cw;
import X.C14880qQ;
import android.app.PendingIntent;
import android.content.res.Resources;
import android.os.Build;
import android.os.SystemClock;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.whatsapp.R;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;

public class NotificationCompat$DecoratedCustomViewStyle extends C04730Qk {
    public final RemoteViews A07(RemoteViews remoteViews, boolean z) {
        boolean z2;
        int i;
        int min;
        long j;
        long j2;
        int i2;
        int i3 = 0;
        Resources resources = this.A00.A0B.getResources();
        RemoteViews remoteViews2 = new RemoteViews(this.A00.A0B.getPackageName(), R.layout.f8nameremoved);
        C05610Ue r1 = this.A00;
        int i4 = 0;
        if (r1.A0C != null) {
            remoteViews2.setViewVisibility(R.id.icon, 0);
            remoteViews2.setImageViewBitmap(R.id.icon, this.A00.A0C);
            if (this.A00.A07.icon != 0) {
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f6nameremoved);
                int dimensionPixelSize2 = dimensionPixelSize - (resources.getDimensionPixelSize(R.dimen.f6nameremoved) * 2);
                C05610Ue r3 = this.A00;
                remoteViews2.setImageViewBitmap(R.id.right_icon, A00(r3.A07.icon, dimensionPixelSize, dimensionPixelSize2, r3.A00));
                remoteViews2.setViewVisibility(R.id.right_icon, 0);
            }
        } else if (r1.A07.icon != 0) {
            remoteViews2.setViewVisibility(R.id.icon, 0);
            int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.f6nameremoved) - resources.getDimensionPixelSize(R.dimen.f6nameremoved);
            int dimensionPixelSize4 = resources.getDimensionPixelSize(R.dimen.f6nameremoved);
            C05610Ue r32 = this.A00;
            remoteViews2.setImageViewBitmap(R.id.icon, A00(r32.A07.icon, dimensionPixelSize3, dimensionPixelSize4, r32.A00));
        }
        CharSequence charSequence = this.A00.A0H;
        if (charSequence != null) {
            remoteViews2.setTextViewText(R.id.title, charSequence);
        }
        CharSequence charSequence2 = this.A00.A0G;
        int i5 = 1;
        if (charSequence2 != null) {
            remoteViews2.setTextViewText(R.id.text, charSequence2);
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.A00.A02 > 0) {
            if (this.A00.A02 > resources.getInteger(R.integer.f7nameremoved)) {
                i2 = R.id.info;
                remoteViews2.setTextViewText(R.id.info, resources.getString(R.string.f11nameremoved));
            } else {
                NumberFormat integerInstance = NumberFormat.getIntegerInstance();
                i2 = R.id.info;
                remoteViews2.setTextViewText(R.id.info, integerInstance.format((long) this.A00.A02));
            }
            remoteViews2.setViewVisibility(i2, 0);
            z2 = true;
            i = 1;
        } else {
            remoteViews2.setViewVisibility(R.id.info, 8);
            i = 0;
        }
        C05610Ue r6 = this.A00;
        if (!r6.A0W || r6.A07.when == 0) {
            i5 = i;
        } else if (r6.A0Y) {
            remoteViews2.setViewVisibility(R.id.chronometer, 0);
            C05610Ue r12 = this.A00;
            if (r12.A0W) {
                j2 = r12.A07.when;
            } else {
                j2 = 0;
            }
            remoteViews2.setLong(R.id.chronometer, "setBase", j2 + (SystemClock.elapsedRealtime() - System.currentTimeMillis()));
            remoteViews2.setBoolean(R.id.chronometer, "setStarted", true);
        } else {
            remoteViews2.setViewVisibility(R.id.time, 0);
            C05610Ue r13 = this.A00;
            if (r13.A0W) {
                j = r13.A07.when;
            } else {
                j = 0;
            }
            remoteViews2.setLong(R.id.time, "setTime", j);
        }
        remoteViews2.setViewVisibility(R.id.right_side, AnonymousClass001.A08(i5));
        if (!z2) {
            i4 = 8;
        }
        remoteViews2.setViewVisibility(R.id.line3, i4);
        remoteViews2.removeAllViews(R.id.actions);
        ArrayList arrayList = this.A00.A0O;
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            A0s.add((C05480Tm) it.next());
        }
        if (!z || (min = Math.min(A0s.size(), 3)) <= 0) {
            i3 = 8;
        } else {
            int i6 = 0;
            do {
                C05480Tm r11 = (C05480Tm) A0s.get(i6);
                PendingIntent pendingIntent = r11.A01;
                boolean A1X = AnonymousClass000.A1X(pendingIntent);
                String packageName = this.A00.A0B.getPackageName();
                int i7 = R.layout.f8nameremoved;
                if (A1X) {
                    i7 = R.layout.f8nameremoved;
                }
                RemoteViews remoteViews3 = new RemoteViews(packageName, i7);
                IconCompat A00 = r11.A00();
                if (A00 != null) {
                    remoteViews3.setImageViewBitmap(R.id.action_image, A01(A00, R.color.f5nameremoved, 0));
                }
                CharSequence charSequence3 = r11.A03;
                remoteViews3.setTextViewText(R.id.action_text, charSequence3);
                if (!A1X) {
                    remoteViews3.setOnClickPendingIntent(R.id.action_container, pendingIntent);
                }
                AnonymousClass0HI.A00(remoteViews3, charSequence3, R.id.action_container);
                remoteViews2.addView(R.id.actions, remoteViews3);
                i6++;
            } while (i6 < min);
        }
        remoteViews2.setViewVisibility(R.id.actions, i3);
        remoteViews2.setViewVisibility(R.id.action_divider, i3);
        remoteViews2.setViewVisibility(R.id.title, 8);
        remoteViews2.setViewVisibility(R.id.text2, 8);
        remoteViews2.setViewVisibility(R.id.text, 8);
        remoteViews2.removeAllViews(R.id.notification_main_column);
        remoteViews2.addView(R.id.notification_main_column, remoteViews.clone());
        remoteViews2.setViewVisibility(R.id.notification_main_column, 0);
        Resources resources2 = this.A00.A0B.getResources();
        int dimensionPixelSize5 = resources2.getDimensionPixelSize(R.dimen.f6nameremoved);
        int dimensionPixelSize6 = resources2.getDimensionPixelSize(R.dimen.f6nameremoved);
        float f = resources2.getConfiguration().fontScale;
        if (f < 1.0f) {
            f = 1.0f;
        } else if (f > 1.3f) {
            f = 1.3f;
        }
        float f2 = (f - 1.0f) / 0.29999995f;
        AnonymousClass0HN.A00(remoteViews2, R.id.notification_main_column_container, 0, Math.round(((1.0f - f2) * ((float) dimensionPixelSize5)) + (f2 * ((float) dimensionPixelSize6))), 0, 0);
        return remoteViews2;
    }

    public RemoteViews A02(C14880qQ r4) {
        RemoteViews remoteViews;
        if (Build.VERSION.SDK_INT >= 24 || (remoteViews = this.A00.A0E) == null) {
            return null;
        }
        return A07(remoteViews, true);
    }

    public RemoteViews A03(C14880qQ r4) {
        RemoteViews remoteViews;
        if (Build.VERSION.SDK_INT >= 24 || (remoteViews = this.A00.A0E) == null) {
            return null;
        }
        return A07(remoteViews, false);
    }

    public String A04() {
        return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
    }

    public void A06(C14880qQ r3) {
        if (Build.VERSION.SDK_INT >= 24) {
            AnonymousClass0HJ.A00(((C07860cw) r3).A02, AnonymousClass0HK.A00());
        }
    }
}
