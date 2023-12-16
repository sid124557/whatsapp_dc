package X;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.whatsapp.appwidget.WidgetProvider;
import com.whatsapp.util.Log;

/* renamed from: X.2i9  reason: invalid class name and case insensitive filesystem */
public class C50422i9 {
    public Handler A00;
    public AnonymousClass3XI A01;
    public Runnable A02;
    public final C56972sr A03;
    public final AnonymousClass314 A04;
    public final C620633i A05;
    public final C54292oU A06;
    public final C56982ss A07;
    public final C56152rV A08;
    public final C46082b3 A09;
    public final AnonymousClass1R1 A0A;

    public synchronized Handler A00() {
        Handler handler;
        handler = this.A00;
        if (handler == null) {
            handler = C18290x4.A0I("update_widget");
            this.A00 = handler;
        }
        return handler;
    }

    public synchronized void A01() {
        C54292oU r5 = this.A06;
        Context context = r5.A00;
        Class<WidgetProvider> cls = WidgetProvider.class;
        try {
            int[] appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, cls));
            if (appWidgetIds != null) {
                if (appWidgetIds.length > 0) {
                    Intent A082 = AnonymousClass0x9.A08(context, cls);
                    A082.setAction("android.appwidget.action.APPWIDGET_UPDATE");
                    A082.putExtra("appWidgetIds", appWidgetIds);
                    context.sendBroadcast(A082);
                }
            }
        } catch (RuntimeException e) {
            Log.e("widgetprovider/getAppWidgetIds failed", e);
        }
        C46082b3 r0 = this.A09;
        C50692ic A002 = r0.A00(context);
        if (!(A002 == null || A002 == r0.A02)) {
            if (this.A02 == null) {
                C56972sr r2 = this.A03;
                C56982ss r6 = this.A07;
                C620633i r4 = this.A05;
                C56152rV r7 = this.A08;
                AnonymousClass1R1 r10 = this.A0A;
                AnonymousClass314 r3 = this.A04;
                AnonymousClass3XI r8 = this.A01;
                if (r8 == null) {
                    r8 = (AnonymousClass3XI) C389229y.A01(context).AcK.A00.A7g.get();
                    this.A01 = r8;
                }
                this.A02 = new C71003bP(r2, r3, r4, r5, r6, r7, r8, A002, r10);
            }
            A00().removeCallbacks(this.A02);
            A00().post(this.A02);
        }
    }

    public C50422i9(C56972sr r1, AnonymousClass314 r2, C620633i r3, C54292oU r4, C56982ss r5, C56152rV r6, C46082b3 r7, AnonymousClass1R1 r8) {
        this.A06 = r4;
        this.A03 = r1;
        this.A07 = r5;
        this.A05 = r3;
        this.A09 = r7;
        this.A08 = r6;
        this.A0A = r8;
        this.A04 = r2;
    }
}
