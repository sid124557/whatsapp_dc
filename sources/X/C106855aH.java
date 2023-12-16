package X;

import android.app.Activity;
import android.content.Intent;

/* renamed from: X.5aH  reason: invalid class name and case insensitive filesystem */
public final class C106855aH {
    public static final AnonymousClass59F A00(Intent intent) {
        if (intent != null) {
            switch (intent.getIntExtra("mat_entry_point", 0)) {
                case 2:
                    return AnonymousClass59F.NOTIFICATION;
                case 3:
                    return AnonymousClass59F.UPDATES_TAB_LIST;
                case 4:
                    return AnonymousClass59F.NEWSLETTER_CHAT_LINK;
                case 5:
                    return AnonymousClass59F.EXTERNAL_DEEPLINK;
                case 6:
                    return AnonymousClass59F.NEWSLETTER_DIRECTORY;
                case 7:
                    return AnonymousClass59F.NEWSLETTER_FORWARDED_MESSAGE;
                case 8:
                    return AnonymousClass59F.RECOMMENDED_NEWSLETTERS;
                case 9:
                    return AnonymousClass59F.NEWSLETTER_DIRECTORY_SEARCH;
                case 11:
                    return AnonymousClass59F.UPDATES_TAB_SEARCH;
                case 12:
                    return AnonymousClass59F.NEWSLETTER_ADMIN_INVITE;
                case 13:
                    return AnonymousClass59F.STATUS_HEADER;
                case 14:
                    return AnonymousClass59F.STATUS_LINK_TOOLTIP;
                case 15:
                    return AnonymousClass59F.STATUS_LINK_BUTTON;
                case 16:
                    return AnonymousClass59F.STATUS_POST_TOOLTIP;
                case 17:
                    return AnonymousClass59F.MEDIA_BROWSER_LINK_TOOLTIP;
                case 18:
                    return AnonymousClass59F.MEDIA_BROWSER_LINK_BUTTON;
                case 19:
                    return AnonymousClass59F.MEDIA_BROWSER_POST_TOOLTIP;
            }
        }
        return AnonymousClass59F.UNKNOWN;
    }

    public static final boolean A04(C56982ss r2, C95804uY r3, AnonymousClass5UP r4) {
        C162457s7.A0J(r2, 0);
        C18270x1.A10(r4, 1, r3);
        AnonymousClass1RL r22 = (AnonymousClass1RL) r2.A0A(r3, false);
        if (r22 == null) {
            return true;
        }
        if (r22.A0K || r22.A0M(r4)) {
            return false;
        }
        return true;
    }

    public static String A01(Activity activity) {
        Integer valueOf;
        Intent intent = activity.getIntent();
        C162457s7.A0D(intent);
        int intExtra = intent.getIntExtra("extra_forwarded_message_thread_type", -1);
        int intExtra2 = intent.getIntExtra("mat_entry_point", 0);
        if (intExtra == -1) {
            return null;
        }
        if ((intExtra2 == 7 || intExtra2 == 4) && (valueOf = Integer.valueOf(intExtra)) != null) {
            return valueOf.toString();
        }
        return null;
    }

    public static final void A02(C56982ss r5, C95814uZ r6) {
        Long l;
        AnonymousClass31A A00 = C56982ss.A00(r5, r6);
        if (A00 == null || (l = A00.A06()) == null) {
            l = 0L;
        }
        if (l.longValue() <= 0) {
            r5.A0I(r6);
        }
    }

    public static final boolean A03(C56612sH r4, C624134x r5) {
        C18260x0.A0O(r4, r5);
        if (C627636p.A0Y(r5) || C56612sH.A04(r4, r5) >= 2592000000L) {
            return false;
        }
        return true;
    }
}
