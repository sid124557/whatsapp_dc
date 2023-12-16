package X;

import com.whatsapp.R;
import com.whatsapp.blocklist.BlockList;

/* renamed from: X.6BU  reason: invalid class name */
public class AnonymousClass6BU implements C202479m5 {
    public Object A00;
    public final int A01;

    public AnonymousClass6BU(BlockList blockList, int i) {
        this.A01 = i;
        this.A00 = blockList;
    }

    public final void BaJ(AnonymousClass34V r4) {
        C89704el r2;
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            r2 = (C89704el) obj;
            if (r4 != null) {
                return;
            }
        } else {
            C89654ea r22 = (C89654ea) obj;
            r2 = r22;
            if (r4 != null) {
                r22.Bot(R.string.f11nameremoved);
                return;
            }
        }
        C117115rP.A01(r2.A04, r2, 48);
    }
}
