package X;

/* renamed from: X.9Sf  reason: invalid class name and case insensitive filesystem */
public class C194269Sf {
    public int A00 = -1;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public C193409Oj[] A05;

    public void A00() {
        if (this.A05 != null) {
            int i = 0;
            while (true) {
                C193409Oj[] r1 = this.A05;
                if (i >= r1.length) {
                    break;
                }
                if (r1[i].A02 != null) {
                    r1[i].A02.clear();
                }
                i++;
            }
        }
        this.A05 = null;
    }
}
