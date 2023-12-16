package X;

import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5L7  reason: invalid class name */
public class AnonymousClass5L7 {
    public final int A00;
    public final int A01;
    public final ImageView.ScaleType A02;
    public final C182398oL A03;
    public final C150477Qw A04;
    public final C150477Qw A05;
    public final C150477Qw A06;
    public final List A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public AnonymousClass5L7(ImageView.ScaleType scaleType, C182398oL r4, C150477Qw r5, C150477Qw r6, C150477Qw r7, List list, int i, int i2, boolean z, boolean z2, boolean z3) {
        this.A01 = i;
        this.A06 = r5;
        this.A05 = r6;
        this.A00 = i2;
        this.A04 = r7;
        this.A08 = z3;
        this.A02 = scaleType;
        ArrayList A0s = AnonymousClass001.A0s();
        this.A07 = A0s;
        if (z && !list.isEmpty()) {
            A0s.addAll(list);
            this.A09 = z;
        }
        this.A03 = r4;
        this.A0A = z2;
    }
}
