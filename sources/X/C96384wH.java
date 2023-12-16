package X;

import java.util.List;

/* renamed from: X.4wH  reason: invalid class name and case insensitive filesystem */
public final class C96384wH extends C136186lz {
    public final C108965dr A00;
    public final AnonymousClass5ZO A01;
    public final List A02;
    public final AnonymousClass4GP A03;
    public final AnonymousClass4GS A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (C96384wH.class.equals(C86644Kx.A0e(obj)) && super.equals(obj)) {
                C162457s7.A0K(obj, "null cannot be cast to non-null type com.whatsapp.businessdirectory.view.viewdata.SERPMapEntryPointViewItem");
                C96384wH r5 = (C96384wH) obj;
                if (!AnonymousClass75J.A00(this.A00, r5.A00) || !AnonymousClass75J.A00(this.A01, r5.A01) || !AnonymousClass75J.A00(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C96384wH(C108965dr r2, AnonymousClass5ZO r3, List list, AnonymousClass4GP r5, AnonymousClass4GS r6) {
        super(73);
        C18260x0.A0V(r5, r2, r3);
        this.A03 = r5;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = list;
        this.A04 = r6;
    }

    public int hashCode() {
        Object[] A1X = AnonymousClass0x9.A1X();
        A1X[0] = this.A00;
        A1X[1] = this.A02;
        return C18310x6.A08(this.A01, A1X, 2);
    }
}
