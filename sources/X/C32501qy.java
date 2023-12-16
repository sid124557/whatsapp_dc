package X;

import android.app.NotificationChannel;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;

/* renamed from: X.1qy  reason: invalid class name and case insensitive filesystem */
public class C32501qy extends C56802sa {
    public final AnonymousClass35T A00;

    public long A00() {
        NotificationChannel A03;
        if (!this.A0K || (A03 = this.A00.A03(this.A0E)) == null || A03.getImportance() >= 3) {
            return A01();
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("chat-settings-store/getMuteEndTime notification channel muted for:");
        C18260x0.A1L(A0o, C627336j.A08(this.A0E));
        return -1;
    }

    public boolean A09() {
        NotificationChannel A03;
        if (Build.VERSION.SDK_INT < 26 || (A03 = this.A00.A03(this.A0E)) == null || A03.getImportance() != 0) {
            return super.A09();
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("chat-settings-store/getShowNotifications notification channel disabled for:");
        C18260x0.A1L(A0o, C627336j.A08(this.A0E));
        return false;
    }

    public String A0B() {
        String A002 = AnonymousClass35T.A0L.A00("channel_notification");
        if (A002 != null) {
            return A002;
        }
        AnonymousClass35T r0 = this.A00;
        return r0.A07(Settings.System.DEFAULT_NOTIFICATION_URI, r0.A06("channel_notification"), "channel_notification", "FFFFFF", "1", (String) null, 4);
    }

    public String A0C() {
        String str;
        Uri parse;
        C55222q0 r1 = AnonymousClass35T.A0L;
        String A002 = r1.A00(this.A0E);
        if (!TextUtils.isEmpty(A002)) {
            return A002;
        }
        if (this.A0K) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("chat-settings-store/getNotificationChannelId missing channel for chat with custom notifications:");
            C18260x0.A1L(A0o, C627336j.A08(this.A0E));
            AnonymousClass35T r4 = this.A00;
            String str2 = this.A0E;
            CharSequence A06 = r4.A06(str2);
            int i = 4;
            if (A0A()) {
                i = 3;
            }
            String str3 = this.A0A;
            String str4 = this.A0D;
            String str5 = this.A0C;
            if (str5 == null) {
                parse = Uri.EMPTY;
            } else {
                parse = Uri.parse(str5);
            }
            if (!TextUtils.isEmpty(str5) && !C627536m.A0K(parse, r4.A08, r4.A0B, true)) {
                parse = Settings.System.DEFAULT_NOTIFICATION_URI;
            }
            r4.A07(parse, A06, str2, str3, str4, "channel_group_chats", i);
            str = this.A0E;
        } else if (C627336j.A0K(C18310x6.A0S(this.A0E))) {
            str = "group_chat_defaults";
        } else {
            str = "individual_chat_defaults";
        }
        return r1.A00(str);
    }

    public String A0D() {
        return this.A00.A08(AnonymousClass35T.A0L.A00("silent_notifications"));
    }

    public boolean A0E() {
        return this.A00.A0K(AnonymousClass35T.A0L.A00("voip_notification"));
    }

    public C32501qy(C620633i r1, C56612sH r2, AnonymousClass5ZR r3, AnonymousClass1R1 r4, AnonymousClass35T r5) {
        super(r1, r2, r3, r4);
        this.A00 = r5;
    }
}
