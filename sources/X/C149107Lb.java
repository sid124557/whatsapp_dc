package X;

import android.content.Context;
import android.os.PowerManager;

/* renamed from: X.7Lb  reason: invalid class name and case insensitive filesystem */
public final class C149107Lb {
    public PowerManager.WakeLock A00;
    public boolean A01;
    public boolean A02;
    public final PowerManager A03;

    public C149107Lb(Context context) {
        this.A03 = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
