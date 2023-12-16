package X;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.Date;
import java.util.TimeZone;

/* renamed from: X.4bI  reason: invalid class name and case insensitive filesystem */
public class C88984bI extends AnonymousClass4LB {
    public final /* synthetic */ AnonymousClass5XU A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88984bI(Activity activity, AnonymousClass5XU r8, C620633i r9, C56612sH r10, C620733j r11) {
        super(activity, r9, r10, r11, R.layout.f8nameremoved);
        this.A00 = r8;
    }

    public void onCreate(Bundle bundle) {
        long time;
        super.onCreate(bundle);
        Date date = new Date();
        StringBuilder A0o = AnonymousClass001.A0o();
        C18260x0.A1M(A0o, C18300x5.A0k(date, "conversations/clock-wrong-time ", A0o));
        Date date2 = this.A00.A00;
        if (date2 != null) {
            time = date2.getTime();
        } else {
            time = date.getTime();
        }
        Activity activity = this.A01;
        Object[] A0M = AnonymousClass002.A0M();
        C620733j r2 = this.A04;
        A0M[0] = C107175ap.A04(r2, C107505bQ.A06(r2, time), C107145am.A00(r2, time));
        ((TextView) findViewById(R.id.clock_wrong_date)).setText(AnonymousClass002.A0F(activity, TimeZone.getDefault().getDisplayName(C620733j.A02(r2)), A0M, 1, R.string.f11nameremoved));
        C18280x3.A0p(findViewById(R.id.close), this, 17);
    }
}
