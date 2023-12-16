package X;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0cw  reason: invalid class name and case insensitive filesystem */
public class C07860cw implements C14880qQ {
    public int A00;
    public RemoteViews A01;
    public final Notification.Builder A02;
    public final Context A03;
    public final Bundle A04 = AnonymousClass002.A08();
    public final C05610Ue A05;
    public final List A06 = AnonymousClass001.A0s();

    public Notification A00() {
        RemoteViews remoteViews;
        Notification A022;
        C05610Ue r3 = this.A05;
        C04730Qk r2 = r3.A0F;
        if (r2 != null) {
            r2.A06(this);
            remoteViews = r2.A03(this);
        } else {
            remoteViews = null;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            A022 = AnonymousClass0WV.A02(this.A02);
        } else {
            Notification.Builder builder = this.A02;
            if (i >= 24) {
                A022 = AnonymousClass0WV.A02(builder);
            } else {
                AnonymousClass0HS.A00(builder, this.A04);
                A022 = AnonymousClass0WV.A02(builder);
                RemoteViews remoteViews2 = this.A01;
                if (remoteViews2 != null) {
                    A022.contentView = remoteViews2;
                }
            }
            int i2 = this.A00;
            if (i2 != 0) {
                if (!(AnonymousClass0YM.A02(A022) == null || (A022.flags & 512) == 0 || i2 != 2)) {
                    A022.sound = null;
                    A022.vibrate = null;
                    A022.defaults = A022.defaults & -2 & -3;
                }
                if (AnonymousClass0YM.A02(A022) != null && (A022.flags & 512) == 0 && i2 == 1) {
                    A022.sound = null;
                    A022.vibrate = null;
                    A022.defaults = A022.defaults & -2 & -3;
                }
            }
        }
        if (!(remoteViews == null && (remoteViews = r3.A0E) == null)) {
            A022.contentView = remoteViews;
        }
        if (r2 != null) {
            RemoteViews A023 = r2.A02(this);
            if (A023 != null) {
                A022.bigContentView = A023;
            }
            Bundle bundle = A022.extras;
            if (bundle != null) {
                r2.A05(bundle);
            }
        }
        return A022;
    }

    public C07860cw(C05610Ue r15) {
        Notification.Builder builder;
        ArrayList arrayList;
        int i;
        Notification.Action.Builder A002;
        Icon icon;
        this.A05 = r15;
        Context context = r15.A0B;
        this.A03 = context;
        if (Build.VERSION.SDK_INT >= 26) {
            builder = C06340Xg.A00(context, r15.A0K);
        } else {
            builder = new Notification.Builder(context);
        }
        this.A02 = builder;
        Notification notification = r15.A07;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, (RemoteViews) null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing(AnonymousClass000.A1S(notification.flags & 2)).setOnlyAlertOnce(AnonymousClass000.A1S(notification.flags & 8)).setAutoCancel(AnonymousClass000.A1S(notification.flags & 16)).setDefaults(notification.defaults).setContentTitle(r15.A0H).setContentText(r15.A0G).setContentInfo((CharSequence) null).setContentIntent(r15.A09).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(r15.A0A, AnonymousClass000.A1S(notification.flags & 128)).setLargeIcon(r15.A0C).setNumber(r15.A02).setProgress(r15.A05, r15.A04, r15.A0V);
        AnonymousClass0WV.A03(AnonymousClass0WV.A01(AnonymousClass0WV.A00(this.A02, (CharSequence) null), r15.A0Y), r15.A03);
        Iterator it = r15.A0O.iterator();
        while (it.hasNext()) {
            C05480Tm r5 = (C05480Tm) it.next();
            int i2 = Build.VERSION.SDK_INT;
            IconCompat A003 = r5.A00();
            if (i2 >= 23) {
                if (A003 != null) {
                    icon = A003.A08();
                } else {
                    icon = null;
                }
                A002 = AnonymousClass0RJ.A00(r5.A01, icon, r5.A03);
            } else {
                if (A003 != null) {
                    i = A003.A04();
                } else {
                    i = 0;
                }
                A002 = AnonymousClass0YM.A00(r5.A01, r5.A03, i);
            }
            C03950Me[] r12 = r5.A09;
            if (r12 != null) {
                int length = r12.length;
                RemoteInput[] remoteInputArr = new RemoteInput[length];
                for (int i3 = 0; i3 < length; i3++) {
                    remoteInputArr[i3] = AnonymousClass0RM.A00(r12[i3]);
                }
                for (int i4 = 0; i4 < length; i4++) {
                    AnonymousClass0YM.A03(A002, remoteInputArr[i4]);
                }
            }
            Bundle bundle = new Bundle(r5.A07);
            boolean z = r5.A04;
            bundle.putBoolean("android.support.allowGeneratedReplies", z);
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 24) {
                C05770Uv.A00(A002, z);
            }
            int i6 = r5.A06;
            bundle.putInt("android.support.action.semanticAction", i6);
            if (i5 >= 28) {
                AnonymousClass0RK.A00(A002, i6);
                if (i5 >= 29) {
                    C05780Uw.A00(A002, false);
                    if (i5 >= 31) {
                        AnonymousClass0HT.A00(A002, false);
                    }
                }
            }
            bundle.putBoolean("android.support.action.showsUserInterface", r5.A05);
            AnonymousClass0YM.A04(A002, bundle);
            AnonymousClass0YM.A05(AnonymousClass0YM.A01(A002), this.A02);
        }
        Bundle bundle2 = r15.A0D;
        if (bundle2 != null) {
            this.A04.putAll(bundle2);
        }
        int i7 = Build.VERSION.SDK_INT;
        this.A01 = r15.A0E;
        AnonymousClass0HR.A00(this.A02, r15.A0W);
        AnonymousClass0YM.A09(this.A02, r15.A0U);
        AnonymousClass0YM.A06(this.A02, r15.A0L);
        AnonymousClass0YM.A07(this.A02, r15.A0N);
        AnonymousClass0YM.A08(this.A02, r15.A0T);
        this.A00 = r15.A01;
        C06330Xf.A05(this.A02, r15.A0J);
        C06330Xf.A00(this.A02, r15.A00);
        C06330Xf.A01(this.A02, r15.A06);
        C06330Xf.A02(this.A02, r15.A08);
        C06330Xf.A03(this.A02, notification.sound, notification.audioAttributes);
        if (i7 < 28) {
            ArrayList arrayList2 = r15.A0R;
            ArrayList A0I = AnonymousClass002.A0I(arrayList2.size());
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                C04440Of r1 = (C04440Of) it2.next();
                String str = r1.A03;
                if (str == null) {
                    CharSequence charSequence = r1.A01;
                    if (charSequence != null) {
                        str = AnonymousClass000.A0P(charSequence, "name:", AnonymousClass001.A0o());
                    } else {
                        str = "";
                    }
                }
                A0I.add(str);
            }
            ArrayList arrayList3 = r15.A0Q;
            C13570nO r0 = new C13570nO(A0I.size() + arrayList3.size());
            r0.addAll(A0I);
            r0.addAll(arrayList3);
            arrayList = AnonymousClass002.A0J(r0);
        } else {
            arrayList = r15.A0Q;
        }
        if (!arrayList.isEmpty()) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                C06330Xf.A04(this.A02, AnonymousClass001.A0m(it3));
            }
        }
        ArrayList arrayList4 = r15.A0P;
        if (arrayList4.size() > 0) {
            Bundle bundle3 = r15.A0D;
            if (bundle3 == null) {
                bundle3 = AnonymousClass002.A08();
                r15.A0D = bundle3;
            }
            Bundle bundle4 = bundle3.getBundle("android.car.EXTENSIONS");
            bundle4 = bundle4 == null ? AnonymousClass002.A08() : bundle4;
            Bundle bundle5 = new Bundle(bundle4);
            Bundle A08 = AnonymousClass002.A08();
            for (int i8 = 0; i8 < arrayList4.size(); i8++) {
                A08.putBundle(Integer.toString(i8), AnonymousClass0HU.A00((C05480Tm) arrayList4.get(i8)));
            }
            bundle4.putBundle("invisible_actions", A08);
            bundle5.putBundle("invisible_actions", A08);
            Bundle bundle6 = r15.A0D;
            if (bundle6 == null) {
                bundle6 = AnonymousClass002.A08();
                r15.A0D = bundle6;
            }
            bundle6.putBundle("android.car.EXTENSIONS", bundle4);
            this.A04.putBundle("android.car.EXTENSIONS", bundle5);
        }
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 23) {
            Object obj = r15.A0I;
            if (obj != null) {
                AnonymousClass0RJ.A01(this.A02, obj);
            }
            if (i9 >= 24) {
                AnonymousClass0HS.A00(this.A02, r15.A0D);
                C05770Uv.A02(this.A02, (CharSequence[]) null);
                RemoteViews remoteViews = r15.A0E;
                if (remoteViews != null) {
                    C05770Uv.A01(this.A02, remoteViews);
                }
            }
        }
        if (i9 >= 26) {
            C06340Xg.A01(this.A02, 0);
            C06340Xg.A04(this.A02, (CharSequence) null);
            C06340Xg.A05(this.A02, r15.A0M);
            C06340Xg.A03(this.A02, 0);
            C06340Xg.A02(this.A02, r15.A01);
            if (!TextUtils.isEmpty(r15.A0K)) {
                this.A02.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
            if (i9 >= 28) {
                Iterator it4 = r15.A0R.iterator();
                while (it4.hasNext()) {
                    AnonymousClass0RK.A01(this.A02, ((C04440Of) it4.next()).A00());
                }
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            C05780Uw.A02(this.A02, r15.A0S);
            C05780Uw.A01((Notification.BubbleMetadata) null, this.A02);
        }
        if (r15.A0X) {
            if (this.A05.A0T) {
                this.A00 = 2;
            } else {
                this.A00 = 1;
            }
            this.A02.setVibrate((long[]) null);
            this.A02.setSound((Uri) null);
            int i11 = notification.defaults & -2 & -3;
            notification.defaults = i11;
            this.A02.setDefaults(i11);
            if (i10 >= 26) {
                if (TextUtils.isEmpty(this.A05.A0L)) {
                    AnonymousClass0YM.A06(this.A02, "silent");
                }
                C06340Xg.A02(this.A02, this.A00);
            }
        }
    }
}
