package X;

import android.content.Context;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.4zu  reason: invalid class name and case insensitive filesystem */
public class C98154zu extends C98164zv {
    public boolean A00;

    public /* bridge */ /* synthetic */ void A07(C624134x r2, List list) {
        C30471mV r22 = (C30471mV) r2;
        super.A07(r22, list);
        this.A00.setMessage(r22);
    }

    public C98154zu(Context context, C103445Mz r3) {
        super(context, r3);
        A02();
        setId(R.id.gif_row);
    }

    public String getDefaultMessageText() {
        return getContext().getString(R.string.f11nameremoved);
    }

    public int getIconSizeIncrease() {
        return C18290x4.A0G(this).getDimensionPixelSize(R.dimen.f6nameremoved);
    }

    public int getDrawableRes() {
        return R.drawable.msg_status_gif;
    }
}
