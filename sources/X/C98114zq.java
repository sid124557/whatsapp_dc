package X;

import android.content.Context;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.4zq  reason: invalid class name and case insensitive filesystem */
public class C98114zq extends C98174zw {
    public AnonymousClass4RT A00;

    public /* bridge */ /* synthetic */ CharSequence A04(AnonymousClass3ZH r5, C624134x r6) {
        CharSequence A002 = AnonymousClass4Qv.A00(r5, r6, this);
        boolean A1Y = C86614Ku.A1Y(this.A08);
        int i = R.drawable.msg_status_poll;
        if (A1Y) {
            i = R.drawable.msg_status_poll_v2;
        }
        return C106795aB.A02(A002, C87044Mw.A01(this.A01.getPaint(), C107335b8.A01(getContext(), i), getContext().getString(R.string.f11nameremoved)));
    }

    /* renamed from: A09 */
    public void A07(C30451mT r2, List list) {
        super.A07(r2, list);
        this.A00.setMessage(r2, list);
    }

    public C98114zq(Context context, C103445Mz r2) {
        super(context, r2);
    }
}
