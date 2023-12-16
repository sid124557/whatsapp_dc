package X;

import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.app.NotificationCompat$MessagingStyle;
import androidx.core.graphics.drawable.IconCompat;
import com.whatsapp.jid.GroupJid;

/* renamed from: X.2d6  reason: invalid class name and case insensitive filesystem */
public class C47342d6 {
    public final C56972sr A00;
    public final C56942so A01;
    public final C64773Ex A02;
    public final C56612sH A03;
    public final C54292oU A04;
    public final AnonymousClass33T A05;
    public final C56542sA A06;
    public final C56982ss A07;
    public final C66553Lw A08;
    public final AnonymousClass1R1 A09;

    public final void A00(PendingIntent pendingIntent, Context context, GroupJid groupJid, CharSequence charSequence, String str, int i) {
        AnonymousClass33T r3 = this.A05;
        String A002 = AnonymousClass33T.A00(groupJid);
        if (A002 != null) {
            Bitmap A0D = this.A08.A0D(this.A02.A0A(groupJid));
            C03910Ma r1 = new C03910Ma();
            r1.A01 = str;
            r1.A00 = IconCompat.A03(A0D);
            C04440Of r7 = new C04440Of(r1);
            NotificationCompat$MessagingStyle notificationCompat$MessagingStyle = new NotificationCompat$MessagingStyle(r7);
            notificationCompat$MessagingStyle.A08(new C05440Ti(r7, charSequence, System.currentTimeMillis()));
            notificationCompat$MessagingStyle.A01 = C18320x8.A0U();
            String A0i = C18300x5.A0i(groupJid);
            C05610Ue r4 = new C05610Ue(context, (String) null);
            C18320x8.A0y(context, r4);
            r4.A0C(str);
            AnonymousClass0x7.A17(r4);
            r4.A0E(true);
            r4.A08(notificationCompat$MessagingStyle);
            r4.A0M = A0i;
            AnonymousClass33T.A01(pendingIntent, r4);
            r4.A06(A0D);
            if (Build.VERSION.SDK_INT >= 26) {
                String A0C = ((C32501qy) AnonymousClass1R1.A00(groupJid, this.A09)).A0C();
                if (A0C != null) {
                    r4.A0K = A0C;
                } else {
                    return;
                }
            }
            r3.A0A(A002, i, r4.A01());
        }
    }

    public C47342d6(C56972sr r1, C56942so r2, C64773Ex r3, C56612sH r4, C54292oU r5, AnonymousClass33T r6, C56542sA r7, C56982ss r8, C66553Lw r9, AnonymousClass1R1 r10) {
        this.A03 = r4;
        this.A00 = r1;
        this.A04 = r5;
        this.A07 = r8;
        this.A06 = r7;
        this.A02 = r3;
        this.A09 = r10;
        this.A08 = r9;
        this.A01 = r2;
        this.A05 = r6;
    }
}
