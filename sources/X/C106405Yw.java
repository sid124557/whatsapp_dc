package X;

import android.app.Activity;
import android.content.Intent;
import android.os.BaseBundle;
import com.whatsapp.jid.Jid;

/* renamed from: X.5Yw  reason: invalid class name and case insensitive filesystem */
public final class C106405Yw {
    public static final C95814uZ A03(Jid jid) {
        if (jid instanceof C95814uZ) {
            return (C95814uZ) jid;
        }
        return null;
    }

    public static C95814uZ A00(Activity activity) {
        return C95814uZ.A00.A05(activity.getIntent().getStringExtra("jid"));
    }

    public static C95814uZ A01(Intent intent, String str) {
        return C95814uZ.A00.A05(intent.getStringExtra(str));
    }

    public static C95814uZ A02(BaseBundle baseBundle, String str) {
        return C95814uZ.A00.A05(baseBundle.getString(str));
    }

    public static final C95814uZ A04(String str) {
        C95814uZ r1;
        Jid A01 = AnonymousClass32W.A01(str);
        if ((A01 instanceof C95814uZ) && (r1 = (C95814uZ) A01) != null) {
            return r1;
        }
        throw new AnonymousClass24P(str);
    }

    public final C95814uZ A05(String str) {
        Object obj;
        try {
            obj = A04(str);
        } catch (Throwable th) {
            obj = new AnonymousClass3Z0(th);
        }
        if (obj instanceof AnonymousClass3Z0) {
            obj = null;
        }
        return (C95814uZ) obj;
    }
}
