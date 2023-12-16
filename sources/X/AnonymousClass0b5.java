package X;

/* renamed from: X.0b5  reason: invalid class name */
public class AnonymousClass0b5 implements C16470tS {
    public final /* synthetic */ C07530bB A00;

    public AnonymousClass0b5(C07530bB r1) {
        this.A00 = r1;
    }

    public void BPH(C07890cz r3, boolean z) {
        if (r3 instanceof AnonymousClass04J) {
            r3.A02().A0G(false);
        }
        C16470tS r0 = this.A00.A0B;
        if (r0 != null) {
            r0.BPH(r3, z);
        }
    }

    public boolean BXO(C07890cz r4) {
        C07530bB r2 = this.A00;
        if (r4 == r2.A0A) {
            return false;
        }
        r2.A03 = ((AnonymousClass04J) r4).getItem().getItemId();
        C16470tS r0 = r2.A0B;
        if (r0 != null) {
            return r0.BXO(r4);
        }
        return false;
    }
}
