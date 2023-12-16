package X;

import android.graphics.BitmapFactory;
import com.whatsapp.util.Log;

/* renamed from: X.5WB  reason: invalid class name */
public class AnonymousClass5WB {
    public final int A00;
    public final int A01;
    public final BitmapFactory.Options A02;
    public final Long A03;
    public final boolean A04;

    public AnonymousClass5WB(BitmapFactory.Options options, Long l, int i, int i2, boolean z) {
        if (i < 2 || i2 < 2 || ((l != null && l.longValue() <= 0) || (z && i != i2))) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("bitmaputils/bitmapspec/wrong/ ");
            A0o.append(i);
            A0o.append(",");
            A0o.append(i2);
            A0o.append(",");
            A0o.append(l);
            Log.e(AnonymousClass000.A0b(",", A0o, z));
            this.A01 = Integer.MAX_VALUE;
            this.A00 = Integer.MAX_VALUE;
            this.A03 = null;
            this.A04 = false;
        } else {
            this.A01 = i;
            this.A00 = i2;
            this.A03 = l;
            this.A04 = z;
        }
        this.A02 = options == null ? new BitmapFactory.Options() : options;
    }

    public AnonymousClass5WB(int i, int i2) {
        this((BitmapFactory.Options) null, (Long) null, i, i2, false);
    }
}
