package X;

import com.whatsapp.R;
import java.util.List;

/* renamed from: X.5X5  reason: invalid class name */
public class AnonymousClass5X5 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final AnonymousClass4C1 A04;

    public int A00() {
        if (this instanceof C88974bH) {
            return ((C88974bH) this).A00.A01();
        }
        AnonymousClass4C1 r0 = this.A04;
        if (r0 == null) {
            return 0;
        }
        return ((List) r0.get()).size();
    }

    public int[] A01(C60152y5 r3, int i) {
        if (this instanceof C88974bH) {
            return (int[]) ((C88974bH) this).A00.A02(i);
        }
        AnonymousClass4C1 r0 = this.A04;
        if (r0 == null) {
            return new int[0];
        }
        int[] iArr = ((C106655Zv) ((List) r0.get()).get(i)).A00;
        if (C107425bI.A02(iArr)) {
            return C107005aX.A04(r3, iArr);
        }
        if (C107425bI.A03(iArr)) {
            return C107005aX.A05(r3, iArr);
        }
        return iArr;
    }

    public AnonymousClass5X5(C149467Mo r2, int i) {
        this.A02 = i;
        this.A04 = r2.A03;
        this.A00 = r2.A00;
        this.A01 = r2.A01;
        this.A03 = r2.A02;
    }

    public AnonymousClass5X5() {
        this.A02 = 0;
        this.A04 = null;
        this.A00 = R.id.emoji_recent_btn;
        this.A01 = R.id.emoji_recent_marker;
        this.A03 = R.string.f11nameremoved;
    }
}
