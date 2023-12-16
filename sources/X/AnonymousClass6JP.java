package X;

import android.util.SparseIntArray;
import com.facebook.android.exoplayer2.Timeline;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.6JP  reason: invalid class name */
public final class AnonymousClass6JP extends C125696Ja {
    public final int A00;
    public final int A01;
    public final SparseIntArray A02 = new SparseIntArray();
    public final int[] A03;
    public final int[] A04;
    public final int[] A05;
    public final Timeline[] A06;

    public AnonymousClass6JP(C186088uj r6, Collection collection, int i, int i2) {
        super(r6);
        this.A01 = i;
        this.A00 = i2;
        int size = collection.size();
        this.A03 = new int[size];
        this.A04 = new int[size];
        this.A06 = new Timeline[size];
        this.A05 = new int[size];
        Iterator it = collection.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            AnonymousClass8LX r2 = (AnonymousClass8LX) it.next();
            this.A06[i3] = r2.A03;
            this.A03[i3] = r2.A01;
            this.A04[i3] = r2.A02;
            int[] iArr = this.A05;
            int i4 = r2.A07;
            iArr[i3] = i4;
            this.A02.put(i4, i3);
            i3++;
        }
    }
}
