package X;

import android.content.Context;
import java.util.List;
import java.util.Map;

/* renamed from: X.2lr  reason: invalid class name and case insensitive filesystem */
public final class C52672lr {
    public List A00;
    public Map A01;
    public final Context A02;

    public C52672lr(Context context) {
        C162457s7.A0J(context, 1);
        this.A02 = context;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C52672lr) && C162457s7.A0P(this.A02, ((C52672lr) obj).A02));
    }

    public int hashCode() {
        return this.A02.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PushPsaNotificationInfo(applicationContext=");
        return C18260x0.A04(this.A02, A0o);
    }
}
