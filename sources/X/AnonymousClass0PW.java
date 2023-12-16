package X;

import android.app.Notification;

/* renamed from: X.0PW  reason: invalid class name */
public final class AnonymousClass0PW {
    public final int A00;
    public final int A01;
    public final Notification A02;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AnonymousClass0PW.class == obj.getClass()) {
            AnonymousClass0PW r4 = (AnonymousClass0PW) obj;
            if (this.A01 == r4.A01 && this.A00 == r4.A00) {
                return this.A02.equals(r4.A02);
            }
        }
        return false;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A02, ((this.A01 * 31) + this.A00) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ForegroundInfo{");
        sb.append("mNotificationId=");
        sb.append(this.A01);
        sb.append(", mForegroundServiceType=");
        sb.append(this.A00);
        sb.append(", mNotification=");
        return AnonymousClass000.A0Q(this.A02, sb);
    }

    public AnonymousClass0PW(int i, Notification notification, int i2) {
        this.A01 = i;
        this.A02 = notification;
        this.A00 = i2;
    }
}
