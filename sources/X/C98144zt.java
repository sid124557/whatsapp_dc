package X;

import android.content.Context;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.4zt  reason: invalid class name and case insensitive filesystem */
public class C98144zt extends C98164zv {
    public boolean A00;

    public /* bridge */ /* synthetic */ void A07(C624134x r2, List list) {
        C30471mV r22 = (C30471mV) r2;
        super.A07(r22, list);
        this.A00.setMessage(r22);
    }

    public C98144zt(Context context, C103445Mz r2) {
        super(context, r2);
        A02();
    }

    public String getDefaultMessageText() {
        return getContext().getString(R.string.f11nameremoved);
    }

    public int getDrawableRes() {
        return R.drawable.msg_status_video;
    }
}
