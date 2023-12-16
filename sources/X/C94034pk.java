package X;

import android.content.Context;
import com.whatsapp.R;

/* renamed from: X.4pk  reason: invalid class name and case insensitive filesystem */
public final class C94034pk extends C94064pn {
    public C620733j A00;
    public C614530v A01;
    public C46192bE A02;
    public boolean A03;

    public void setup(C614530v r1, C46192bE r2) {
        this.A01 = r1;
        this.A02 = r2;
    }

    public C94034pk(Context context) {
        super(context);
        A00();
    }

    public int getNegativeButtonTextResId() {
        return R.string.f11nameremoved;
    }

    public int getPositiveButtonIconResId() {
        return R.drawable.ic_settings_contacts;
    }

    public int getPositiveButtonTextResId() {
        return R.string.f11nameremoved;
    }
}
