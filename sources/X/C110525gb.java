package X;

import android.app.Activity;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import com.whatsapp.community.CommunityExitDialogFragment;

/* renamed from: X.5gb  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C110525gb implements C15930sC {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C56942so A01;
    public final /* synthetic */ AnonymousClass4VM A02;
    public final /* synthetic */ AnonymousClass65E A03;

    public final void BOf(Object obj) {
        DialogFragment A002;
        C50472iE r2;
        int i;
        int i2;
        C56942so r5 = this.A01;
        AnonymousClass65E r22 = this.A03;
        Activity activity = this.A00;
        AnonymousClass4VM r4 = this.A02;
        Number number = (Number) obj;
        if (number != null) {
            int intValue = number.intValue();
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue == 3) {
                        String string = activity.getString(R.string.f11nameremoved);
                        r2 = new C50472iE();
                        r2.A08 = string;
                        i = R.string.f11nameremoved;
                        i2 = 67;
                    } else if (intValue == 4) {
                        String string2 = activity.getString(R.string.f11nameremoved);
                        r2 = new C50472iE();
                        r2.A08 = string2;
                        i = R.string.f11nameremoved;
                        i2 = 69;
                    } else {
                        return;
                    }
                    r2.A01(C1235268t.A00(r4, i2), i);
                } else {
                    String string3 = activity.getString(R.string.f11nameremoved);
                    r2 = new C50472iE();
                    r2.A08 = string3;
                    r2.A01(C1235268t.A00(r4, 68), R.string.f11nameremoved);
                    C1235268t A003 = C1235268t.A00(r4, 70);
                    r2.A04 = R.string.f11nameremoved;
                    r2.A07 = A003;
                }
                A002 = r2.A00();
            } else {
                A002 = CommunityExitDialogFragment.A00(r22.B3v(), r5.A05(r22.B3v()));
            }
            ((C89654ea) C111095hX.A02(activity)).Bon(A002, number.toString());
        }
    }

    public /* synthetic */ C110525gb(Activity activity, C56942so r2, AnonymousClass4VM r3, AnonymousClass65E r4) {
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = activity;
        this.A02 = r3;
    }
}
