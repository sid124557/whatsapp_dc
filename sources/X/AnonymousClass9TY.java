package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9TY  reason: invalid class name */
public class AnonymousClass9TY {
    public final C56612sH A00;
    public final AnonymousClass33p A01;
    public final C195069Vt A02;
    public final C1906999m A03;
    public final C620933l A04;
    public final C203499no A05;

    public AnonymousClass043 A00(Activity activity, C15910sA r8) {
        this.A05.BKB(C18290x4.A0Z(), (Integer) null, "merchant_upsell_prompt", "chat");
        View inflate = activity.getLayoutInflater().inflate(R.layout.f8nameremoved, (ViewGroup) null);
        C19340zH A002 = AnonymousClass5V0.A00(activity);
        A002.A0c(r8, C205049qL.A00(this, 0), R.string.f11nameremoved);
        A002.A0d(r8, new C205059qM(activity, 0, this), R.string.f11nameremoved);
        C205049qL A003 = C205049qL.A00(this, 1);
        AnonymousClass0Uj r1 = A002.A00;
        C628236w r0 = A002.A02;
        r1.A0D(r0);
        r0.A00.A0B(r8, A003);
        A002.A0i(true);
        A002.A0a(inflate);
        return A002.create();
    }

    public boolean A01() {
        boolean A2P = this.A01.A2P("payments_merchant_upsell_start_cool_off_timestamp", TimeUnit.DAYS.toMillis(30));
        if (!(!this.A03.A0C()) || !A2P || C18280x3.A02(this.A04.A03(), "payment_smb_upsell_view_count") >= 3) {
            return false;
        }
        return true;
    }

    public AnonymousClass9TY(C56612sH r1, AnonymousClass33p r2, C195069Vt r3, C1906999m r4, C620933l r5, C203499no r6) {
        this.A02 = r3;
        this.A05 = r6;
        this.A03 = r4;
        this.A00 = r1;
        this.A04 = r5;
        this.A01 = r2;
    }
}
