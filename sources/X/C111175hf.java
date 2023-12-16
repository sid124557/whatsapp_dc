package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.5hf  reason: invalid class name and case insensitive filesystem */
public class C111175hf implements C1228466b {
    public final AnonymousClass0XP A00;

    public boolean AyQ() {
        AnonymousClass0XP r1 = this.A00;
        if (!r1.A06() || !r1.A05()) {
            return false;
        }
        return true;
    }

    public boolean BFF() {
        return this.A00.A05();
    }

    public boolean BHg() {
        return this.A00.A06();
    }

    public C111175hf(Context context) {
        this.A00 = new AnonymousClass0XP(context);
    }

    public void AxV(AnonymousClass0QU r5, C1229066h r6) {
        WeakReference A14 = AnonymousClass0x9.A14(r6);
        try {
            this.A00.A04(new AnonymousClass4T7(this, A14), (C05860Vg) null, r5);
        } catch (NullPointerException e) {
            Log.d(AnonymousClass000.A0a("AppAuthManager/authenticate: authentication exception=", AnonymousClass001.A0o(), e));
            C1229066h r0 = (C1229066h) A14.get();
            if (r0 != null) {
                r0.BMy();
            }
        }
    }
}
