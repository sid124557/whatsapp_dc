package X;

import com.whatsapp.R;

/* renamed from: X.5W2  reason: invalid class name */
public class AnonymousClass5W2 {
    public final int A00;
    public final int A01;
    public final int A02;

    public static AnonymousClass5W2 A00(C624134x r3, boolean z) {
        int i;
        int i2;
        int i3;
        if (C627636p.A0I(r3.A1I)) {
            i2 = R.string.f11nameremoved;
            if (z) {
                i2 = R.string.f11nameremoved;
            }
            i = R.drawable.msg_status_ephemeral_ring;
            i3 = R.color.f5nameremoved;
        } else {
            boolean z2 = r3 instanceof C31951p9;
            int i4 = R.string.f11nameremoved;
            if (z2) {
                if (z) {
                    i4 = R.string.f11nameremoved;
                }
                i = R.drawable.msg_status_video;
            } else {
                if (z) {
                    i4 = R.string.f11nameremoved;
                }
                i = R.drawable.msg_status_mic;
            }
            i3 = R.color.f5nameremoved;
        }
        return new AnonymousClass5W2(i2, i, i3);
    }

    public AnonymousClass5W2(int i, int i2, int i3) {
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
    }
}
