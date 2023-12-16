package com.whatsapp.appwidget;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass2A1;
import X.AnonymousClass314;
import X.C105275Ug;
import X.C117505s2;
import X.C18260x0;
import X.C50422i9;
import X.C56152rV;
import X.C56982ss;
import X.C620733j;
import X.C64333Db;
import X.C69263Wi;
import X.C86604Kt;
import X.C86614Ku;
import X.C86634Kw;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import java.util.ArrayList;

public class WidgetProvider extends AppWidgetProvider {
    public static ArrayList A0A;
    public C69263Wi A00;
    public C117505s2 A01;
    public C50422i9 A02;
    public C105275Ug A03;
    public AnonymousClass314 A04;
    public C620733j A05;
    public C56982ss A06;
    public C56152rV A07;
    public final Object A08;
    public volatile boolean A09;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0021, code lost:
        if (r5 != 0) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAppWidgetOptionsChanged(android.content.Context r7, android.appwidget.AppWidgetManager r8, int r9, android.os.Bundle r10) {
        /*
            r6 = this;
            if (r10 == 0) goto L_0x0023
            java.lang.String r0 = "appWidgetMinWidth"
            int r4 = r10.getInt(r0)
            java.lang.String r0 = "appWidgetMinHeight"
            int r5 = r10.getInt(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "widgetprovider/onappwidgetoptionschanged "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "x"
            X.C18260x0.A0y(r0, r1, r5)
            if (r4 == 0) goto L_0x0023
            if (r5 != 0) goto L_0x0029
        L_0x0023:
            r4 = 2147483647(0x7fffffff, float:NaN)
            r5 = 2147483647(0x7fffffff, float:NaN)
        L_0x0029:
            X.5Ug r1 = r6.A03
            X.33j r2 = r6.A05
            r0 = r7
            r3 = r9
            android.widget.RemoteViews r0 = A00(r0, r1, r2, r3, r4, r5)
            r8.updateAppWidget(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.appwidget.WidgetProvider.onAppWidgetOptionsChanged(android.content.Context, android.appwidget.AppWidgetManager, int, android.os.Bundle):void");
    }

    public void onReceive(Context context, Intent intent) {
        try {
            if (!this.A09) {
                synchronized (this.A08) {
                    if (!this.A09) {
                        C64333Db r2 = AnonymousClass2A1.A00(context).ACP;
                        this.A00 = C86614Ku.A0K(r2);
                        this.A06 = C86614Ku.A0X(r2);
                        this.A02 = (C50422i9) r2.AbY.get();
                        this.A03 = (C105275Ug) r2.A0q.get();
                        this.A05 = C86604Kt.A0W(r2);
                        this.A07 = (C56152rV) r2.AIn.get();
                        this.A04 = C86634Kw.A0c(r2);
                        this.A09 = true;
                    }
                }
            }
            super.onReceive(context, intent);
        } catch (BadParcelableException unused) {
        }
    }

    public WidgetProvider(int i) {
        this.A09 = false;
        this.A08 = AnonymousClass002.A0D();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x010e, code lost:
        if (r3 <= 9) goto L_0x0110;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.widget.RemoteViews A00(android.content.Context r9, X.C105275Ug r10, X.C620733j r11, int r12, int r13, int r14) {
        /*
            boolean r8 = r10.A05()
            r5 = 100
            if (r13 <= r5) goto L_0x00c6
            if (r14 <= r5) goto L_0x00c6
            java.lang.String r1 = r9.getPackageName()
            r0 = 2131626389(0x7f0e0995, float:1.8880013E38)
            android.widget.RemoteViews r4 = new android.widget.RemoteViews
            r4.<init>(r1, r0)
            java.util.ArrayList r2 = A0A
            r3 = 1
            if (r2 == 0) goto L_0x00c2
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x00b1
            r7 = 2131755378(0x7f100172, float:1.9141634E38)
            int r0 = r2.size()
            long r0 = (long) r0
            java.lang.Object[] r6 = new java.lang.Object[r3]
            int r2 = r2.size()
            boolean r5 = X.C18300x5.A1Y(r6, r2)
            java.lang.String r2 = r11.A0L(r6, r7, r0)
            r0 = 2131434082(0x7f0b1a62, float:1.8489968E38)
            r4.setViewVisibility(r0, r5)
        L_0x003d:
            r0 = 2131434082(0x7f0b1a62, float:1.8489968E38)
            r4.setTextViewText(r0, r2)
            java.lang.Class<com.whatsapp.appwidget.WidgetService> r0 = com.whatsapp.appwidget.WidgetService.class
            android.content.Intent r1 = X.AnonymousClass0x9.A08(r9, r0)
            java.lang.String r0 = "appWidgetId"
            r1.putExtra(r0, r12)
            java.lang.String r0 = r1.toUri(r3)
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r1.setData(r0)
            r5 = 2131431055(0x7f0b0e8f, float:1.8483828E38)
            r4.setRemoteAdapter(r12, r5, r1)
            java.lang.String r1 = "android.intent.action.VIEW"
            r0 = 0
            android.content.Intent r2 = X.C627736r.A08(r9, r0)
            r2.setAction(r1)
            java.lang.String r0 = "WidgetProvider"
            X.AnonymousClass5VI.A01(r2, r0)
            r1 = 134217728(0x8000000, float:3.85186E-34)
            X.C624735e.A06(r2, r1)
            boolean r0 = X.C624735e.A01
            if (r0 == 0) goto L_0x0079
            r1 = 167772160(0xa000000, float:6.162976E-33)
        L_0x0079:
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r9, r3, r2, r1)
            r4.setPendingIntentTemplate(r5, r0)
            if (r8 == 0) goto L_0x00ac
            android.content.Intent r2 = X.C627736r.A03(r9)
        L_0x0086:
            r1 = 2131430544(0x7f0b0c90, float:1.8482792E38)
            r0 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r0 = X.C624735e.A00(r9, r3, r2, r0)
            r4.setOnClickPendingIntent(r1, r0)
            r2 = 2131429766(0x7f0b0986, float:1.8481214E38)
            r4.setEmptyView(r5, r2)
            boolean r1 = r10.A08()
            r0 = 2131896184(0x7f122778, float:1.9427222E38)
            if (r1 != 0) goto L_0x00a4
            r0 = 2131895580(0x7f12251c, float:1.9425997E38)
        L_0x00a4:
            java.lang.String r0 = r9.getString(r0)
            r4.setTextViewText(r2, r0)
            return r4
        L_0x00ac:
            android.content.Intent r2 = X.C627736r.A02(r9)
            goto L_0x0086
        L_0x00b1:
            r0 = 2131896184(0x7f122778, float:1.9427222E38)
            java.lang.String r2 = r9.getString(r0)
            r1 = 2131434082(0x7f0b1a62, float:1.8489968E38)
            r0 = 8
            r4.setViewVisibility(r1, r0)
            goto L_0x003d
        L_0x00c2:
            java.lang.String r2 = ""
            goto L_0x003d
        L_0x00c6:
            java.lang.String r1 = r9.getPackageName()
            r0 = 2131626391(0x7f0e0997, float:1.8880017E38)
            android.widget.RemoteViews r4 = new android.widget.RemoteViews
            r4.<init>(r1, r0)
            java.util.ArrayList r0 = A0A
            if (r0 == 0) goto L_0x00f1
            int r3 = r0.size()
            r2 = 2131429185(0x7f0b0741, float:1.8480036E38)
            java.lang.String r0 = java.lang.Integer.toString(r3)
            r4.setTextViewText(r2, r0)
            if (r13 >= r5) goto L_0x0110
            r0 = 99
            if (r3 <= r0) goto L_0x010a
            r1 = 1096810496(0x41600000, float:14.0)
        L_0x00ec:
            java.lang.String r0 = "setTextSize"
            r4.setFloat(r2, r0, r1)
        L_0x00f1:
            if (r8 == 0) goto L_0x0105
            android.content.Intent r3 = X.C627736r.A03(r9)
        L_0x00f7:
            r2 = 2131430544(0x7f0b0c90, float:1.8482792E38)
            r1 = 1
            r0 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r0 = X.C624735e.A00(r9, r1, r3, r0)
            r4.setOnClickPendingIntent(r2, r0)
            return r4
        L_0x0105:
            android.content.Intent r3 = X.C627736r.A02(r9)
            goto L_0x00f7
        L_0x010a:
            r0 = 9
            r1 = 1101004800(0x41a00000, float:20.0)
            if (r3 > r0) goto L_0x00ec
        L_0x0110:
            r1 = 1106247680(0x41f00000, float:30.0)
            goto L_0x00ec
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.appwidget.WidgetProvider.A00(android.content.Context, X.5Ug, X.33j, int, int, int):android.widget.RemoteViews");
    }

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("widgetprovider/update ");
        int[] iArr2 = iArr;
        C18260x0.A1G(A0o, iArr.length);
        C117505s2 r0 = this.A01;
        if (r0 != null) {
            r0.A08.set(true);
            this.A02.A00().removeCallbacks(this.A01);
        }
        C69263Wi r4 = this.A00;
        C56982ss r8 = this.A06;
        Context context2 = context;
        AppWidgetManager appWidgetManager2 = appWidgetManager;
        this.A01 = new C117505s2(appWidgetManager2, context2, r4, this.A03, this.A04, this.A05, r8, this.A07, iArr2);
        this.A02.A00().post(this.A01);
        super.onUpdate(context, appWidgetManager, iArr);
    }

    public WidgetProvider() {
        this(0);
    }
}
