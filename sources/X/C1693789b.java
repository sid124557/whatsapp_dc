package X;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.api.Status;

/* renamed from: X.89b  reason: invalid class name and case insensitive filesystem */
public final class C1693789b implements C186118um {
    public final C1694389h A00;

    public final C127186Qz Bss(C127186Qz r6) {
        try {
            C1694389h r4 = this.A00;
            C127086Qo r3 = r4.A05;
            C156237gH r1 = r3.A0B;
            r1.A01.add(r6);
            r6.A0A.set(r1.A00);
            AnonymousClass72H r2 = r6.A00;
            C187688xe r12 = (C187688xe) r3.A0G.get(r2);
            C162177rO.A03(r12, "Appropriate Api was not requested.");
            if (r12.isConnected() || !r4.A0A.containsKey(r2)) {
                r6.A08(r12);
                return r6;
            }
            r6.A09(new Status(17, (String) null));
            return r6;
        } catch (DeadObjectException unused) {
            C1694389h r0 = this.A00;
            AnonymousClass6C7.A10(r0.A06, new AnonymousClass6R7(this, this), 1);
            return r6;
        }
    }

    public final void Bsx() {
    }

    public final void Bt0() {
    }

    public final void Bt3(Bundle bundle) {
    }

    public final void Bt5(int i) {
        C1694389h r1 = this.A00;
        r1.A00((C127866Tp) null);
        r1.A07.Bsw(i, false);
    }

    public final boolean Bt6() {
        this.A00.A00((C127866Tp) null);
        return true;
    }

    public C1693789b(C1694389h r1) {
        this.A00 = r1;
    }

    public final C127186Qz Bsq(C127186Qz r1) {
        Bss(r1);
        return r1;
    }

    public final void Bt4(C127866Tp r1, C148727Jm r2, boolean z) {
    }
}
