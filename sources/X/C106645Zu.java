package X;

import android.os.Bundle;
import android.os.Message;

/* renamed from: X.5Zu  reason: invalid class name and case insensitive filesystem */
public class C106645Zu {
    public final Bundle A00;
    public final Message A01;
    public final Object A02;
    public final String A03;

    public C106645Zu(String str) {
        C626936e.A0B(true);
        this.A03 = str;
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
    }

    public static void A00(C112515jr r1, String str) {
        r1.A00(new C106645Zu(str));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("action=");
        A0o.append(this.A03);
        A0o.append(", args=");
        A0o.append(this.A00);
        A0o.append(", message=");
        return AnonymousClass000.A0R(this.A01, A0o);
    }

    public C106645Zu(Message message, String str) {
        C626936e.A0B(true);
        this.A03 = str;
        this.A00 = null;
        this.A01 = message;
        this.A02 = null;
    }

    public C106645Zu(String str, Bundle bundle) {
        C626936e.A0B(true);
        this.A03 = str;
        this.A00 = bundle;
        this.A01 = null;
        this.A02 = null;
    }

    public C106645Zu(String str, Object obj) {
        C626936e.A0B(true);
        this.A03 = str;
        this.A00 = null;
        this.A01 = null;
        this.A02 = obj;
    }
}
