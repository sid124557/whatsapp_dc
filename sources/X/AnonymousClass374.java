package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.whatsapp.R;
import java.util.Calendar;

/* renamed from: X.374  reason: invalid class name */
public final /* synthetic */ class AnonymousClass374 implements DialogInterface.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass1QL A01;
    public final /* synthetic */ C95814uZ A02;
    public final /* synthetic */ AnonymousClass2z0 A03;

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass1QL r6 = this.A01;
        Activity activity = this.A00;
        AnonymousClass2z0 r3 = this.A03;
        C95814uZ r5 = this.A02;
        if (!C107385bE.A09() || r6.A05.A00()) {
            Calendar instance = Calendar.getInstance();
            Calendar calendar = r6.A01;
            if (calendar == null) {
                throw C18270x1.A0S("reminderDateTime");
            }
            if (!calendar.before(instance)) {
                Calendar calendar2 = r6.A01;
                if (calendar2 == null) {
                    throw C18270x1.A0S("reminderDateTime");
                }
                long timeInMillis = calendar2.getTimeInMillis();
                if (timeInMillis != 0) {
                    C624134x A05 = r6.A0E.A05(r3);
                    r6.A03.A00(A05, "cta_reminder", "cta_cancel_reminder");
                    r6.A0F.BkM(new C71513cE(A05, r5, r6, 4, timeInMillis));
                    r6.A04.A01(A05, timeInMillis);
                    return;
                }
            }
            C19340zH A002 = AnonymousClass5V0.A00(activity);
            A002.A0T(R.string.f11nameremoved);
            C19340zH.A06(A002);
            C18280x3.A0q(A002);
            return;
        }
        r6.A0C(activity);
    }

    public /* synthetic */ AnonymousClass374(Activity activity, AnonymousClass1QL r2, C95814uZ r3, AnonymousClass2z0 r4) {
        this.A01 = r2;
        this.A00 = activity;
        this.A03 = r4;
        this.A02 = r3;
    }
}
