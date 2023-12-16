package X;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;

/* renamed from: X.041  reason: invalid class name */
public class AnonymousClass041 extends AnonymousClass0QQ {
    public final PowerManager A00;
    public final /* synthetic */ AnonymousClass040 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass041(Context context, AnonymousClass040 r4) {
        super(r4);
        this.A01 = r4;
        this.A00 = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    public int A00() {
        if (this.A00.isPowerSaveMode()) {
            return 2;
        }
        return 1;
    }

    public IntentFilter A01() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        return intentFilter;
    }

    public void A04() {
        this.A01.A0W(true);
    }
}
