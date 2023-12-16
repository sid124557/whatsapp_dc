package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import androidx.core.app.NotificationCompat$MessagingStyle;
import androidx.core.graphics.drawable.IconCompat;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2oM  reason: invalid class name and case insensitive filesystem */
public final class C54212oM {
    public long A00;
    public long A01;
    public final Context A02;
    public final C56962sq A03;
    public final C64773Ex A04;
    public final AnonymousClass5ZU A05;
    public final AnonymousClass314 A06;
    public final C113905mB A07;
    public final C56612sH A08;
    public final C54292oU A09;
    public final AnonymousClass33T A0A;
    public final AnonymousClass33p A0B;
    public final C620733j A0C;
    public final C56982ss A0D;
    public final C66543Lv A0E;
    public final AnonymousClass3LP A0F;
    public final C66553Lw A0G;
    public final AnonymousClass1R1 A0H;
    public final C55832qz A0I;
    public final AnonymousClass4FS A0J;
    public final Map A0K = C18320x8.A0r();

    public C54212oM(Context context, C56962sq r20, C64773Ex r21, AnonymousClass5ZU r22, AnonymousClass314 r23, C113905mB r24, C56612sH r25, C54292oU r26, AnonymousClass33T r27, AnonymousClass33p r28, C620733j r29, C56982ss r30, C66543Lv r31, AnonymousClass3LP r32, C66553Lw r33, AnonymousClass1R1 r34, C55832qz r35, AnonymousClass4FS r36) {
        AnonymousClass4FS r0 = r36;
        C56612sH r15 = r25;
        C54292oU r14 = r26;
        C18260x0.A0a(r15, r14, r0, 1);
        C56982ss r7 = r30;
        C162457s7.A0J(r7, 5);
        AnonymousClass3LP r5 = r32;
        C620733j r8 = r29;
        C66543Lv r6 = r31;
        C56962sq r17 = r20;
        C64773Ex r16 = r21;
        C18260x0.A0g(r5, r16, r8, r17, r6);
        C55832qz r2 = r35;
        C162457s7.A0J(r2, 11);
        C66553Lw r4 = r33;
        AnonymousClass1R1 r3 = r34;
        C113905mB r11 = r24;
        AnonymousClass5ZU r13 = r22;
        AnonymousClass314 r12 = r23;
        C18260x0.A0h(r11, r3, r4, r13, r12);
        AnonymousClass33p r9 = r28;
        AnonymousClass33T r10 = r27;
        AnonymousClass0x2.A1C(r9, r10);
        this.A08 = r15;
        this.A02 = context;
        this.A09 = r14;
        this.A0J = r0;
        this.A0D = r7;
        this.A0F = r5;
        this.A04 = r16;
        this.A0C = r8;
        this.A03 = r17;
        this.A0E = r6;
        this.A0I = r2;
        this.A07 = r11;
        this.A0H = r3;
        this.A0G = r4;
        this.A05 = r13;
        this.A06 = r12;
        this.A0B = r9;
        this.A0A = r10;
    }

    public final void A02(C95814uZ r31, C95814uZ r32, String str) {
        Intent intent;
        String str2;
        C04440Of r1;
        IconCompat iconCompat;
        C95814uZ r14 = r32;
        C162457s7.A0J(r14, 1);
        C627736r r12 = new C627736r();
        Context context = this.A02;
        String A0l = C18290x4.A0l(context, R.string.f11nameremoved);
        C95814uZ r5 = r31;
        if (r31 == null || (intent = r12.A1O(context, r5, 2).putExtra("fromMessageReminderNotification", true)) == null) {
            intent = C627736r.A02(context).putExtra("fromMessageReminderNotificationChatJid", r14.getRawString());
        }
        C162457s7.A0H(intent);
        String str3 = str;
        if (r31 == null || (str != null && str3.length() > 0)) {
            str2 = A0l;
        } else {
            AnonymousClass3ZH A092 = this.A04.A09(r5);
            if (A092 != null) {
                str2 = this.A05.A0H(A092);
            } else {
                str2 = null;
            }
        }
        PendingIntent A002 = C624735e.A00(context, 0, intent, 0);
        if (r31 == null || (str != null && str3.length() > 0)) {
            C162457s7.A0H(A002);
            A01(A002, (C04440Of) null, A0l, str2, str3);
        } else {
            ArrayList A0s = AnonymousClass001.A0s();
            long A082 = this.A0D.A08(r5);
            C66543Lv r0 = this.A0E;
            C56612sH r15 = this.A08;
            C42242Ni A0B2 = r0.A0B(r5, 1, A082, r15.A0H(), true);
            try {
                Cursor cursor = A0B2.A00;
                if (cursor != null) {
                    if (cursor.moveToFirst()) {
                        while (true) {
                            C624134x A042 = this.A0I.A04(cursor, r5);
                            if (!(A042 == null || A042.A1L == A082 || A042.A1J.A02)) {
                                long j = A042.A0I;
                                long A0H2 = r15.A0H();
                                TimeUnit timeUnit = TimeUnit.MINUTES;
                                if (j >= A0H2 - timeUnit.toMillis(this.A00) && A042.A0I <= r15.A0H() - timeUnit.toMillis(this.A01)) {
                                    A0s.add(A042);
                                    break;
                                }
                            }
                            if (!cursor.moveToNext()) {
                                break;
                            }
                        }
                    }
                    cursor.close();
                }
                Iterator it = A0s.iterator();
                while (it.hasNext()) {
                    C624134x A0T = C18300x5.A0T(it);
                    int A003 = C107175ap.A00(System.currentTimeMillis(), A0T.A0K);
                    Resources A004 = C54292oU.A00(this.A09);
                    Object[] objArr = new Object[2];
                    objArr[0] = str2;
                    AnonymousClass000.A1P(objArr, A003, 1);
                    String string = A004.getString(R.string.f11nameremoved, objArr);
                    C162457s7.A0D(string);
                    AnonymousClass3ZH A093 = this.A04.A09(r5);
                    if (A093 != null) {
                        C03910Ma r3 = new C03910Ma();
                        r3.A01 = string;
                        Bitmap A0D2 = this.A0G.A0D(A093);
                        if (A0D2 != null) {
                            iconCompat = IconCompat.A03(A0D2);
                        } else {
                            iconCompat = null;
                        }
                        r3.A00 = iconCompat;
                        r1 = new C04440Of(r3);
                    } else {
                        r1 = null;
                    }
                    String str4 = A0T.A0y;
                    C162457s7.A0H(A002);
                    A01(A002, r1, A0l, string, str4);
                }
            } catch (Throwable th) {
                Cursor cursor2 = A0B2.A00;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        }
        this.A07.A06(r14, 9);
    }

    public final void A01(PendingIntent pendingIntent, C04440Of r8, String str, String str2, String str3) {
        C56612sH r5 = this.A08;
        long A0H2 = r5.A0H();
        C05610Ue A002 = C66553Lw.A00(this.A02);
        A002.A03 = 1;
        A002.A0C(str);
        A002.A05(A0H2);
        A002.A02(2);
        C18320x8.A17(A002, str2, str3, true);
        AnonymousClass33T.A01(pendingIntent, A002);
        if (r8 != null) {
            NotificationCompat$MessagingStyle notificationCompat$MessagingStyle = new NotificationCompat$MessagingStyle(this.A0G.A0E());
            notificationCompat$MessagingStyle.A08(new C05440Ti(r8, str3, A0H2));
            A002.A08(notificationCompat$MessagingStyle);
        } else {
            C18270x1.A0r(A002, str3);
        }
        AnonymousClass33p r0 = this.A0B;
        C18270x1.A0i(C18270x1.A03(r0), "inorganic_notification_last_timestamp", r5.A0H());
        this.A0A.A0A(str2, 74, A002.A01());
    }

    public final List A00(boolean z) {
        C56802sa A0I2;
        AnonymousClass31A A012;
        AnonymousClass3Z2 r0;
        long j;
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = this.A06.A05().iterator();
        while (it.hasNext()) {
            C95814uZ A0P = C18300x5.A0P(it);
            AnonymousClass3ZH A0A2 = this.A04.A0A(A0P);
            boolean z2 = true;
            boolean A0U = A0A2.A0U();
            if (z) {
                if (!A0U) {
                }
            } else if (A0A2.A0F != null) {
                if (!(A0A2.A0H instanceof AnonymousClass1fS)) {
                    if (A0P instanceof UserJid) {
                        if (this.A03.A0P((UserJid) A0P)) {
                        }
                    }
                }
            }
            boolean A0U2 = A0A2.A0U();
            AnonymousClass1R1 r5 = this.A0H;
            if (A0U2) {
                A0I2 = r5.A0H();
            } else {
                A0I2 = r5.A0I();
            }
            boolean A092 = A0I2.A09();
            if (!A0A2.A0U() ? !(A0P instanceof UserJid) || !((A012 = C56982ss.A01(this.A0D, (UserJid) A0P)) == null || (r0 = A012.A0b) == null || r0.expiration != 0) : A0A2.A02 == 0) {
                z2 = false;
            }
            if (A092 && !z2 && AnonymousClass1R1.A00(A0P, r5).A09() && !this.A0G.A0M(A0P)) {
                C56982ss r52 = this.A0D;
                if (!r52.A0M(A0P) && !C57362tW.A00(this.A0F, A0P) && !r52.A0P(A0P) && r52.A03(A0P) != 0) {
                    AnonymousClass31A A013 = C56982ss.A01(r52, A0P);
                    if (A013 == null) {
                        j = 0;
                    } else {
                        j = A013.A0Y;
                    }
                    if (Long.valueOf(j) != null) {
                        long A032 = C56612sH.A03(this.A08, j);
                        TimeUnit timeUnit = TimeUnit.MINUTES;
                        long millis = timeUnit.toMillis(this.A01) + 1;
                        if (A032 < timeUnit.toMillis(this.A00) && millis <= A032) {
                            C162457s7.A0H(A0P);
                            A0s.add(A0P);
                            C18280x3.A1D(A0P, this.A0K, r52.A03(A0P));
                        }
                    }
                }
            }
        }
        return A0s;
    }
}
