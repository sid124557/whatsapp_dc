package X;

import android.os.Handler;
import com.whatsapp.jid.UserJid;
import java.util.Collection;

/* renamed from: X.1PA  reason: invalid class name */
public class AnonymousClass1PA extends C56602sG {
    public final AnonymousClass2OK A00;
    public final C52972mL A01;

    public void A03(C95814uZ r4) {
        if (this.A00.A01.A0Y(C58422vE.A02, 5340)) {
            A0D();
        }
    }

    public final void A0D() {
        if (AnonymousClass2OK.A00(this.A00)) {
            for (C56262rh r1 : this.A01.A00()) {
                if (r1 instanceof AnonymousClass1f1) {
                    AnonymousClass1f1 r12 = (AnonymousClass1f1) r1;
                    Handler handler = r12.A00;
                    handler.removeCallbacksAndMessages((Object) null);
                    handler.postDelayed(C70003Zm.A00(r12, 43), 2000);
                }
            }
        }
    }

    public AnonymousClass1PA(AnonymousClass2OK r1, C52972mL r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void A06(UserJid userJid) {
        A0D();
    }

    public void A09(Collection collection) {
        A0D();
    }

    public void A0B(Collection collection) {
        A0D();
    }
}
