package X;

import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: X.3vY  reason: invalid class name and case insensitive filesystem */
public final class C78773vY extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ AnonymousClass1g8 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78773vY(AnonymousClass1g8 r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String str;
        Iterable iterable = (Iterable) C18300x5.A0b(this.this$0.A00);
        LinkedHashMap A0C = C18330xA.A0C(C57692u3.A01(iterable));
        for (Object next : iterable) {
            C50682ib r1 = (C50682ib) next;
            if (r1 instanceof C27961ey) {
                str = "TextStatusUpdateNotification";
            } else if (r1 instanceof C27941ev) {
                str = "TextStatusUpdateNotificationSideSub";
            } else if (r1 instanceof AnonymousClass1ex) {
                str = "NotificationNewsletterStateChange";
            } else if (r1 instanceof C27921et) {
                str = "NotificationNewsletterMuteChange";
            } else if (r1 instanceof C27951ew) {
                str = "NotificationNewsletterUpdate";
            } else if (r1 instanceof C27911es) {
                str = "NotificationNewsletterLeave";
            } else if (r1 instanceof C27901er) {
                str = "NotificationNewsletterJoin";
            } else if (r1 instanceof C27891eq) {
                str = "NotificationNewsletterAdminPromote";
            } else if (r1 instanceof C27881ep) {
                str = "NotificationNewsletterAdminDemote";
            } else if (r1 instanceof C27931eu) {
                str = "NewsletterMetadataNotification";
            } else {
                str = "NotificationNewsletterAdminMetadataUpdate";
            }
            Locale locale = Locale.US;
            C162457s7.A0F(locale);
            A0C.put(C18320x8.A0g(locale, str), next);
        }
        return A0C;
    }
}
