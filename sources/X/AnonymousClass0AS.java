package X;

/* renamed from: X.0AS  reason: invalid class name */
public abstract class AnonymousClass0AS extends AnonymousClass0O6 {
    public int A00;
    public int A01 = 0;
    public String A02;
    public C06160Wm[] A03 = null;

    public AnonymousClass0AS(AnonymousClass0AS r7) {
        C06160Wm[] r4;
        this.A02 = r7.A02;
        this.A00 = r7.A00;
        C06160Wm[] r5 = r7.A03;
        if (r5 == null) {
            r4 = null;
        } else {
            int length = r5.length;
            r4 = new C06160Wm[length];
            for (int i = 0; i < length; i++) {
                r4[i] = new C06160Wm(r5[i]);
            }
        }
        this.A03 = r4;
    }

    public boolean A02() {
        return false;
    }

    public C06160Wm[] getPathData() {
        return this.A03;
    }

    public String getPathName() {
        return this.A02;
    }

    public void setPathData(C06160Wm[] r7) {
        C06160Wm[] r4;
        C06160Wm[] r5 = this.A03;
        if (!AnonymousClass0WW.A01(r5, r7)) {
            if (r7 == null) {
                r4 = null;
            } else {
                int length = r7.length;
                r4 = new C06160Wm[length];
                for (int i = 0; i < length; i++) {
                    r4[i] = new C06160Wm(r7[i]);
                }
            }
            this.A03 = r4;
            return;
        }
        for (int i2 = 0; i2 < r7.length; i2++) {
            r5[i2].A00 = r7[i2].A00;
            int i3 = 0;
            while (true) {
                float[] fArr = r7[i2].A01;
                if (i3 >= fArr.length) {
                    break;
                }
                r5[i2].A01[i3] = fArr[i3];
                i3++;
            }
        }
    }

    public AnonymousClass0AS() {
    }
}
