package X;

/* renamed from: X.682  reason: invalid class name */
public class AnonymousClass682 extends C91844lE {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass682(AnonymousClass5ZU r1, C620733j r2, Object obj, int i) {
        super(r1, r2);
        this.A01 = i;
        this.A00 = obj;
    }

    public int A00(AnonymousClass3ZH r5, AnonymousClass3ZH r6) {
        int A05;
        if (this.A01 != 0) {
            C18260x0.A0O(r5, r6);
            A05 = ((C92074m3) this.A00).A00.A05(r5.A0H, r6.A0H);
        } else {
            C41822Ls r1 = r5.A0J;
            C41822Ls r0 = r6.A0J;
            if (r1 == null) {
                if (r0 != null) {
                    return -1;
                }
            } else if (r0 == null) {
                return 1;
            } else {
                C27991fJ r12 = r1.A01;
                C27991fJ r02 = r0.A01;
                if (r12 != null) {
                    if (r02 == null) {
                        return 1;
                    }
                } else if (r02 != null) {
                    return -1;
                }
            }
            C92084m4 r3 = (C92084m4) this.A00;
            AnonymousClass1VX r13 = r3.A03;
            if (AnonymousClass5YT.A00(r5, r13) && !AnonymousClass5YT.A00(r6, r13)) {
                return 1;
            }
            if (!AnonymousClass5YT.A00(r5, r13) && AnonymousClass5YT.A00(r6, r13)) {
                return -1;
            }
            A05 = r3.A01.A05(r5.A0H, r6.A0H);
        }
        if (A05 == 0) {
            return super.A00(r5, r6);
        }
        return A05;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return compare((AnonymousClass3ZH) obj, (AnonymousClass3ZH) obj2);
    }
}
