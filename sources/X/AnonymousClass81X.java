package X;

import java.io.IOException;

/* renamed from: X.81X  reason: invalid class name */
public class AnonymousClass81X implements AnonymousClass4FL {
    public C152777a6 A00;
    public final C162987t5 A01;
    public final AnonymousClass8LG A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public void BVM(AnonymousClass7Z2 r1, AnonymousClass7A4 r2, C150007Ot r3, Object obj, Object obj2, int i) {
    }

    public void BVQ(AnonymousClass7Z2 r7, AnonymousClass7A4 r8, C150007Ot r9, IOException iOException, int i, boolean z) {
        int i2 = r9.A00;
        if (this.A04 && r9.A02 == 3 && i2 == 1 && (iOException instanceof AnonymousClass6KQ) && ((AnonymousClass6KQ) iOException).responseCode == 404) {
            this.A01.A07();
        }
        if (this.A06 && r9.A02 == 3 && i2 == 1 && (iOException instanceof AnonymousClass6KQ) && ((AnonymousClass6KQ) iOException).responseCode >= 500) {
            this.A01.A07();
        }
        if (this.A03 && r9.A02 == 3 && i2 == 2 && (iOException instanceof AnonymousClass6KQ) && ((AnonymousClass6KQ) iOException).responseCode == 404) {
            this.A01.A07();
        }
        if (this.A05 && r9.A02 == 3 && i2 == 2 && (iOException instanceof AnonymousClass6KQ) && ((AnonymousClass6KQ) iOException).responseCode >= 500) {
            this.A01.A07();
        }
    }

    public AnonymousClass81X(C162987t5 r1, AnonymousClass8LG r2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A01 = r1;
        this.A04 = z;
        this.A03 = z2;
        this.A05 = z4;
        this.A06 = z3;
        this.A02 = r2;
    }

    public void BW8(AnonymousClass7Z2 r1, int i) {
    }

    public void BW9(AnonymousClass7Z2 r1, int i) {
    }

    public void BZR(AnonymousClass7Z2 r1, int i) {
    }

    public void BRb(AnonymousClass7Z2 r1, C150007Ot r2, int i) {
    }

    public void BVI(AnonymousClass7Z2 r1, AnonymousClass7A4 r2, C150007Ot r3, int i) {
    }

    public void BVZ(AnonymousClass7Z2 r1, AnonymousClass7A4 r2, C150007Ot r3, int i) {
    }
}
