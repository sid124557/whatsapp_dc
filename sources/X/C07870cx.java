package X;

import android.app.Notification;

/* renamed from: X.0cx  reason: invalid class name and case insensitive filesystem */
public class C07870cx implements C14890qR {
    public final int A00;
    public final Notification A01;
    public final String A02;
    public final String A03;

    public String toString() {
        StringBuilder sb = new StringBuilder("NotifyTask[");
        sb.append("packageName:");
        sb.append(this.A02);
        sb.append(", id:");
        sb.append(this.A00);
        sb.append(", tag:");
        return AnonymousClass000.A0W(this.A03, sb);
    }

    public C07870cx(Notification notification, String str, String str2, int i) {
        this.A02 = str;
        this.A00 = i;
        this.A03 = str2;
        this.A01 = notification;
    }
}
