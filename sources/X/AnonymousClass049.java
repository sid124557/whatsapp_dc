package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* renamed from: X.049  reason: invalid class name */
public class AnonymousClass049 extends AnonymousClass011 {
    public int[][] A00;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: int[][]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04() {
        /*
            r3 = this;
            int[][] r0 = r3.A00
            int r0 = r0.length
            int[][] r2 = new int[r0][]
            int r1 = r0 + -1
        L_0x0007:
            if (r1 < 0) goto L_0x001a
            int[][] r0 = r3.A00
            r0 = r0[r1]
            if (r0 == 0) goto L_0x0018
            java.lang.Object r0 = r0.clone()
        L_0x0013:
            r2[r1] = r0
            int r1 = r1 + -1
            goto L_0x0007
        L_0x0018:
            r0 = 0
            goto L_0x0013
        L_0x001a:
            r3.A00 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass049.A04():void");
    }

    public int A08(int[] iArr) {
        int[][] iArr2 = this.A00;
        int i = this.A0A;
        for (int i2 = 0; i2 < i; i2++) {
            if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                return i2;
            }
        }
        return -1;
    }

    public Drawable newDrawable(Resources resources) {
        return new AnonymousClass04B(resources, this);
    }

    public AnonymousClass049(Resources resources, AnonymousClass049 r3, AnonymousClass04B r4) {
        super(resources, r3, r4);
        int[][] iArr;
        if (r3 != null) {
            iArr = r3.A00;
        } else {
            iArr = new int[this.A0X.length][];
        }
        this.A00 = iArr;
    }

    public void A05(int i, int i2) {
        super.A05(i, i2);
        int[][] iArr = new int[i2][];
        System.arraycopy(this.A00, 0, iArr, 0, i);
        this.A00 = iArr;
    }

    public Drawable newDrawable() {
        return new AnonymousClass04B((Resources) null, this);
    }
}
