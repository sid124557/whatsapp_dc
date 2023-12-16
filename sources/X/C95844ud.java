package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.Calendar;

/* renamed from: X.4ud  reason: invalid class name and case insensitive filesystem */
public class C95844ud extends AnonymousClass6J3 {
    public final TextView A00;
    public final /* synthetic */ C111445i6 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95844ud(View view, C111445i6 r3) {
        super(view, r3);
        this.A01 = r3;
        this.A00 = AnonymousClass002.A09(view, R.id.live_location_end_text);
    }

    public void A07(AnonymousClass3ZH r12, C54942pX r13) {
        String A0F;
        int i;
        TextView textView = this.A00;
        C111445i6 r10 = this.A01;
        C56612sH r2 = r10.A1A;
        long A0I = r2.A0I(r13.A05);
        int A002 = C107175ap.A00(r2.A0H(), A0I);
        if (A002 <= 6) {
            if (A002 != 0) {
                if (A002 != 1) {
                    Calendar instance = Calendar.getInstance();
                    instance.setTimeInMillis(A0I);
                    switch (instance.get(7)) {
                        case 1:
                            i = R.string.f11nameremoved;
                            break;
                        case 2:
                            i = R.string.f11nameremoved;
                            break;
                        case 3:
                            i = R.string.f11nameremoved;
                            break;
                        case 4:
                            i = R.string.f11nameremoved;
                            break;
                        case 5:
                            i = R.string.f11nameremoved;
                            break;
                        case 6:
                            i = R.string.f11nameremoved;
                            break;
                        case 7:
                            i = R.string.f11nameremoved;
                            break;
                        default:
                            i = 0;
                            break;
                    }
                } else {
                    i = R.string.f11nameremoved;
                }
            } else {
                i = R.string.f11nameremoved;
            }
            C620733j r5 = r10.A1C;
            A0F = C107145am.A01(r5, AnonymousClass002.A0F(r10.A0E, C107145am.A00(r5, A0I), new Object[1], 0, i), A0I);
        } else {
            A0F = AnonymousClass002.A0F(r10.A0E, C107565bW.A07(r10.A1C, A002, A0I), new Object[1], 0, R.string.f11nameremoved);
        }
        textView.setText(A0F);
    }
}
