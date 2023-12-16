package X;

import com.google.android.exoplayer2.Timeline;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.6OB  reason: invalid class name */
public final class AnonymousClass6OB extends AnonymousClass6OO {
    public final int A00;
    public final int A01;
    public final HashMap A02 = AnonymousClass001.A0t();
    public final int[] A03;
    public final int[] A04;
    public final Timeline[] A05;
    public final Object[] A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6OB(C186108ul r8, Collection collection) {
        super(r8);
        int i = 0;
        int size = collection.size();
        this.A03 = new int[size];
        this.A04 = new int[size];
        this.A05 = new Timeline[size];
        this.A06 = new Object[size];
        Iterator it = collection.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            C183848ql r2 = (C183848ql) it.next();
            Timeline[] timelineArr = this.A05;
            timelineArr[i3] = r2.BDh();
            this.A04[i3] = i;
            this.A03[i3] = i2;
            Timeline timeline = timelineArr[i3];
            i += timeline.A01();
            i2 += timeline.A00();
            Object[] objArr = this.A06;
            objArr[i3] = r2.BE0();
            AnonymousClass0x2.A1I(objArr[i3], this.A02, i3);
            i3++;
        }
        this.A01 = i;
        this.A00 = i2;
    }
}
