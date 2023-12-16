package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.4Wo  reason: invalid class name and case insensitive filesystem */
public class C87904Wo extends AnonymousClass0R6 {
    public final List A00;
    public final boolean A01;
    public final /* synthetic */ C111445i6 A02;

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        int i2;
        if (i == 0) {
            i2 = R.layout.f8nameremoved;
        } else if (i == 1) {
            i2 = R.layout.f8nameremoved;
        } else if (i != 3) {
            i2 = R.layout.f8nameremoved;
            if (i != 4) {
                i2 = R.layout.f8nameremoved;
            }
        } else {
            i2 = R.layout.f8nameremoved;
        }
        C111445i6 r2 = this.A02;
        View A0R = AnonymousClass001.A0R(r2.A0E.getLayoutInflater(), viewGroup, i2);
        if (i == 2) {
            return new C95854ue(A0R, r2);
        }
        if (i == 3) {
            return new C135236kL(A0R, r2);
        }
        if (i != 4) {
            return new C95864uf(A0R, r2);
        }
        return new C95844ud(A0R, r2);
    }

    public C87904Wo(C111445i6 r1, List list, boolean z) {
        this.A02 = r1;
        this.A00 = list;
        this.A01 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r3.A01 != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A0G() {
        /*
            r3 = this;
            java.util.List r0 = r3.A00
            int r2 = r0.size()
            X.5i6 r1 = r3.A02
            X.2pX r0 = r1.A0n
            if (r0 != 0) goto L_0x0015
            X.2pX r0 = r1.A0m
            if (r0 != 0) goto L_0x0015
            boolean r1 = r3.A01
            r0 = 1
            if (r1 == 0) goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            int r2 = r2 + r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87904Wo.A0G():int");
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r4, int i) {
        List list;
        AnonymousClass6J3 r42 = (AnonymousClass6J3) r4;
        C111445i6 r1 = this.A02;
        if (r1.A0n != null || r1.A0m != null || this.A01) {
            list = this.A00;
        } else if (i != 0) {
            list = this.A00;
            i--;
        } else {
            return;
        }
        C54942pX r2 = (C54942pX) list.get(i);
        AnonymousClass3ZH A07 = r1.A14.A07(r2.A06);
        if (A07 != null) {
            r42.A07(A07, r2);
        }
    }

    public int getItemViewType(int i) {
        if (this.A01) {
            return 2;
        }
        C111445i6 r3 = this.A02;
        if (r3.A0n == null && r3.A0m == null) {
            if (i == 0) {
                return 3;
            }
            i--;
        }
        List list = this.A00;
        if (list.get(i) == r3.A0m) {
            return 4;
        }
        if (list.get(i) == r3.A0n) {
            return 0;
        }
        return 1;
    }
}
