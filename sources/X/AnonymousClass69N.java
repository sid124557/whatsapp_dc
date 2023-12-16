package X;

import com.whatsapp.registration.EULA;
import com.whatsapp.settings.Settings;

/* renamed from: X.69N  reason: invalid class name */
public class AnonymousClass69N implements C182358oH {
    public Object A00;
    public final int A01;

    public AnonymousClass69N(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BVk() {
        int i = this.A01;
        Object obj = this.A00;
        switch (i) {
            case 0:
                ((C89114bZ) obj).A0A = true;
                return;
            case 1:
                ((EULA) obj).A0b = true;
                return;
            default:
                Settings settings = (Settings) obj;
                settings.A1A = true;
                C54042o5 r2 = settings.A0F;
                r2.A01 = false;
                r2.A00 = null;
                r2.A07.A1h((String) null, (String) null);
                return;
        }
    }
}
