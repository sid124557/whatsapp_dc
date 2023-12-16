package X;

import java.util.List;

/* renamed from: X.60v  reason: invalid class name and case insensitive filesystem */
public final class C1215160v extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AnonymousClass4Rg this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1215160v(AnonymousClass4Rg r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean z;
        List list;
        AnonymousClass5PX r0;
        int i;
        int i2;
        AnonymousClass5QZ r6 = (AnonymousClass5QZ) obj;
        AnonymousClass4X5 r4 = this.this$0.A0B;
        if (r4 == null) {
            throw C18270x1.A0S("communityMembersAdapter");
        }
        r4.A00 = r6;
        C102895Kr r2 = r4.A0D;
        if (r6 == null || !((i2 = r6.A01) == 1 || i2 == 2)) {
            z = false;
        } else {
            z = true;
        }
        r2.A00 = z;
        if (r6 == null || !((i = r6.A01) == 1 || i == 2)) {
            list = r4.A0N;
            C86644Kx.A1V(r4.A09, list);
            r0 = r4.A07;
        } else {
            list = r4.A0N;
            AnonymousClass5PX r1 = r4.A07;
            if (!list.contains(r1)) {
                list.add(0, r1);
            }
            r0 = r4.A09;
        }
        list.remove(r0);
        return C59022wD.A00;
    }
}
