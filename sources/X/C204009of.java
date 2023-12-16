package X;

import android.app.Activity;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.9of  reason: invalid class name and case insensitive filesystem */
public class C204009of implements C85034Er {
    public Object A00;
    public Object A01;
    public final int A02;

    public C204009of(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void BLr() {
        if (this.A02 != 0) {
            ((View) this.A01).setVisibility(8);
            C89654ea r3 = (C89654ea) this.A00;
            r3.A05.A0H(R.string.f11nameremoved, 0);
            r3.finish();
        }
    }

    public void BSD(Integer num) {
        if (this.A02 != 0) {
            ((Activity) this.A00).finish();
            return;
        }
        C197059cS r1 = (C197059cS) this.A01;
        r1.A00.A01.postDelayed(new C199559gm(r1), 2000);
    }

    public void Be9(Integer num) {
        int i = this.A02;
        Object obj = this.A01;
        if (i != 0) {
            ((View) obj).setVisibility(8);
            C89654ea r3 = (C89654ea) this.A00;
            r3.A05.A0H(R.string.f11nameremoved, 0);
            r3.finish();
            return;
        }
        C197059cS r1 = (C197059cS) obj;
        r1.A00.A01.postDelayed(new C199569gn(r1), 2000);
    }

    public void onSuccess() {
        if (this.A02 != 0) {
            ((View) this.A01).setVisibility(8);
            ((AnonymousClass9Bw) this.A00).A78();
            return;
        }
        C194589Tn r4 = (C194589Tn) this.A00;
        AnonymousClass33p r3 = r4.A0B.A01;
        C18270x1.A0h(r3.A0U(), "payment_background_backoff_attempt", 0);
        r3.A0U().remove("payment_backgrounds_backoff_timestamp").apply();
        r3.A1Y("payment_backgrounds_last_fetch_timestamp");
        r4.A0D.BkM(new C200119ho(this, (C197059cS) this.A01));
    }
}
