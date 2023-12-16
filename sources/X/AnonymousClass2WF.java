package X;

import android.content.SharedPreferences;

/* renamed from: X.2WF  reason: invalid class name */
public class AnonymousClass2WF {
    public final C59982xo A00;

    public synchronized void A00(String str) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("KeepInChatDailyEventManager/addLong ");
        A0o.append("KeepInChatNotif");
        A0o.append(".");
        A0o.append(str);
        A0o.append(" by ");
        C18260x0.A1F(A0o, 1);
        C59982xo r4 = this.A00;
        SharedPreferences.Editor edit = r4.A01().edit();
        StringBuilder A0l = AnonymousClass000.A0l("KeepInChatNotif");
        A0l.append("::");
        C18270x1.A0k(edit, str, A0l, r4.A00(str) + 1);
    }

    public AnonymousClass2WF(C59982xo r1) {
        this.A00 = r1;
    }
}
