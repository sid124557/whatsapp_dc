package X;

import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import com.whatsapp.R;
import com.whatsapp.appwidget.WidgetProvider;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.5fx  reason: invalid class name and case insensitive filesystem */
public class C110265fx implements RemoteViewsService.RemoteViewsFactory {
    public final Context A00;
    public final C105275Ug A01;
    public final C64773Ex A02;
    public final AnonymousClass5ZU A03;
    public final C56612sH A04;
    public final C620733j A05;
    public final C66553Lw A06;
    public final ArrayList A07 = AnonymousClass001.A0s();

    public int getCount() {
        return this.A07.size();
    }

    public RemoteViews getLoadingView() {
        return null;
    }

    public RemoteViews getViewAt(int i) {
        ArrayList arrayList = this.A07;
        if (i >= arrayList.size()) {
            return null;
        }
        RemoteViews remoteViews = new RemoteViews(this.A00.getPackageName(), R.layout.f8nameremoved);
        C102515Jd r5 = (C102515Jd) arrayList.get(i);
        remoteViews.setTextViewText(R.id.heading, r5.A02);
        remoteViews.setTextViewText(R.id.content, r5.A01);
        remoteViews.setTextViewText(R.id.date, r5.A04);
        remoteViews.setContentDescription(R.id.date, r5.A03);
        Intent A072 = C18320x8.A07();
        Bundle A08 = AnonymousClass002.A08();
        A08.putString("jid", C627336j.A07(r5.A00));
        A072.putExtras(A08);
        remoteViews.setOnClickFillInIntent(R.id.widget_row, A072);
        return remoteViews;
    }

    public int getViewTypeCount() {
        return 1;
    }

    public boolean hasStableIds() {
        return true;
    }

    public void onCreate() {
        Log.i("widgetviewsfactory/oncreate");
        onDataSetChanged();
    }

    public void onDataSetChanged() {
        Log.i("widgetviewsfactory/ondatasetchanged");
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            ArrayList arrayList = WidgetProvider.A0A;
            ArrayList arrayList2 = this.A07;
            arrayList2.clear();
            if (arrayList != null && this.A01.A08()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C624134x A0T = C18300x5.A0T(it);
                    C102515Jd r2 = new C102515Jd();
                    C64773Ex r1 = this.A02;
                    C95814uZ r0 = A0T.A1J.A00;
                    AnonymousClass3ZH A0A = r1.A0A(r0);
                    r2.A00 = r0;
                    r2.A02 = C106815aD.A02(this.A03.A0H(A0A));
                    r2.A01 = this.A06.A0G(A0A, A0T, false, false, true);
                    C56612sH r5 = this.A04;
                    C620733j r4 = this.A05;
                    r2.A04 = C107565bW.A0F(r4, r5.A0I(A0T.A0K), false);
                    r2.A03 = C107565bW.A0F(r4, r5.A0I(A0T.A0K), true);
                    arrayList2.add(r2);
                }
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public void onDestroy() {
        Log.i("widgetviewsfactory/ondestroy");
    }

    public C110265fx(Context context, C105275Ug r3, C64773Ex r4, AnonymousClass5ZU r5, C56612sH r6, C620733j r7, C66553Lw r8) {
        this.A00 = context;
        this.A04 = r6;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A05 = r7;
        this.A06 = r8;
    }

    public long getItemId(int i) {
        return (long) i;
    }
}
