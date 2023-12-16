package X;

import android.view.View;

/* renamed from: X.4pi  reason: invalid class name and case insensitive filesystem */
public class C94014pi extends AnonymousClass5Y3 {
    public static final AnonymousClass5NR A02 = new AnonymousClass5NR(72, 4.0f, 1.0f);
    public static final AnonymousClass5NR A03 = new AnonymousClass5NR(72, 1.0f, 1.0f);
    public static final AnonymousClass5NR A04 = new AnonymousClass5NR(65, 5.0f, 7.0f);
    public final AnonymousClass5NR A00;
    public final AnonymousClass5NR A01;

    public C94014pi(AnonymousClass5NR r1, AnonymousClass5NR r2, int i) {
        super(i);
        this.A01 = r1;
        this.A00 = r2;
    }

    public static final Float A00(float f, int i) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            f = Math.min(f, (float) View.MeasureSpec.getSize(i));
        } else if (mode != 0) {
            if (mode != 1073741824) {
                C18260x0.A0z("ConversationRowSingleImagePreviewCalculator/getSizeToSpec: Unhandled View.MeasureSpec ", AnonymousClass001.A0o(), mode);
            } else {
                f = (float) View.MeasureSpec.getSize(i);
            }
        }
        return Float.valueOf(f);
    }
}
