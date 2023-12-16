package X;

/* renamed from: X.0Q1  reason: invalid class name */
public class AnonymousClass0Q1 {
    public int A00 = 0;
    public int A01;
    public int A02;
    public int A03 = 0;
    public int A04 = 1;
    public int A05 = 0;
    public int A06 = -1;
    public long A07;
    public boolean A08 = false;
    public boolean A09 = false;
    public boolean A0A = false;
    public boolean A0B = false;
    public boolean A0C = false;
    public boolean A0D = false;

    public int A00() {
        if (this.A08) {
            return this.A05 - this.A00;
        }
        return this.A03;
    }

    public void A01(int i) {
        int i2 = this.A04;
        if ((i2 & i) == 0) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Layout state should be one of ");
            A0o.append(Integer.toBinaryString(i));
            A0o.append(" but it is ");
            throw AnonymousClass000.A0I(Integer.toBinaryString(i2), A0o);
        }
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("State{mTargetPosition=");
        A0o.append(this.A06);
        A0o.append(", mData=");
        A0o.append((Object) null);
        A0o.append(", mItemCount=");
        A0o.append(this.A03);
        A0o.append(", mIsMeasuring=");
        A0o.append(this.A09);
        A0o.append(", mPreviousLayoutItemCount=");
        A0o.append(this.A05);
        A0o.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
        A0o.append(this.A00);
        A0o.append(", mStructureChanged=");
        A0o.append(this.A0C);
        A0o.append(", mInPreLayout=");
        A0o.append(this.A08);
        A0o.append(", mRunSimpleAnimations=");
        A0o.append(this.A0B);
        A0o.append(", mRunPredictiveAnimations=");
        A0o.append(this.A0A);
        return AnonymousClass000.A0d(A0o);
    }
}
