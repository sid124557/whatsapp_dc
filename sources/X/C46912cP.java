package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat$MessagingStyle;
import androidx.core.graphics.drawable.IconCompat;
import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.2cP  reason: invalid class name and case insensitive filesystem */
public class C46912cP {
    public final Context A00;
    public final AnonymousClass5UX A01;
    public final C64773Ex A02;
    public final C114015mM A03;
    public final AnonymousClass33T A04;
    public final C620733j A05;
    public final AnonymousClass1R1 A06;

    public void A00(C50392i6 r10, boolean z) {
        String string;
        String A0C;
        C27991fJ A012 = AnonymousClass34R.A01(r10.A04);
        if (A012 == null) {
            Log.w("ScheduledCallStartNotificationImpl group jid is null");
            return;
        }
        AnonymousClass3ZH A0A = this.A02.A0A(A012);
        Context context = this.A00;
        long j = r10.A02;
        Intent A07 = C18320x8.A07();
        A07.setClassName(context.getPackageName(), "com.whatsapp.voipcalling.VoipActivityV2");
        A07.setAction("com.whatsapp.intent.action.OPEN_PRECALL_LOBBY");
        A07.putExtra("scheduled_call_row_id", j);
        AnonymousClass0x2.A0u(A07, A012, "group_jid");
        PendingIntent A042 = C624735e.A04(context, A07, 7);
        C05610Ue r5 = new C05610Ue(context, "critical_app_alerts@1");
        r5.A03 = 1;
        r5.A07.icon = R.drawable.notifybar;
        C18320x8.A0y(context, r5);
        r5.A09 = A042;
        r5.A0E(true);
        if (Build.VERSION.SDK_INT >= 26) {
            C56802sa A002 = AnonymousClass1R1.A00(A012, this.A06);
            C32501qy r8 = (C32501qy) A002;
            if (AnonymousClass000.A1S((A002.A00() > 0 ? 1 : (A002.A00() == 0 ? 0 : -1)))) {
                A0C = r8.A0D();
            } else {
                A0C = r8.A0C();
            }
            if (!TextUtils.isEmpty(A0C)) {
                r5.A0K = A0C;
            }
        }
        Bitmap A013 = C107305b5.A01(context, this.A01, this.A03, A0A);
        C03910Ma r1 = new C03910Ma();
        r1.A01 = r10.A06;
        r1.A00 = IconCompat.A03(A013);
        C04440Of r6 = new C04440Of(r1);
        NotificationCompat$MessagingStyle notificationCompat$MessagingStyle = new NotificationCompat$MessagingStyle(r6);
        boolean A1U = AnonymousClass000.A1U(r10.A00, 2);
        if (z) {
            string = context.getResources().getString(R.string.f11nameremoved);
        } else {
            int i = R.string.f11nameremoved;
            if (A1U) {
                i = R.string.f11nameremoved;
            }
            string = context.getString(i);
        }
        notificationCompat$MessagingStyle.A08(new C05440Ti(r6, string, r10.A03));
        notificationCompat$MessagingStyle.A01 = C18320x8.A0U();
        r5.A08(notificationCompat$MessagingStyle);
        this.A04.A04(55, r5.A01());
    }

    public C46912cP(AnonymousClass5UX r2, C64773Ex r3, C114015mM r4, C54292oU r5, AnonymousClass33T r6, C620733j r7, AnonymousClass1R1 r8) {
        this.A00 = r5.A00;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A05 = r7;
        this.A06 = r8;
        this.A04 = r6;
    }
}
