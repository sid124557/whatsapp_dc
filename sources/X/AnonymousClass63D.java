package X;

import java.util.List;

/* renamed from: X.63D  reason: invalid class name */
public final class AnonymousClass63D extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AnonymousClass5T8 $businessProfile;
    public final /* synthetic */ String $useCase;
    public final /* synthetic */ AnonymousClass5ZL this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass63D(AnonymousClass5ZL r2, AnonymousClass5T8 r3, String str) {
        super(1);
        this.$useCase = str;
        this.this$0 = r2;
        this.$businessProfile = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C95814uZ r13 = (C95814uZ) obj;
        C162457s7.A0J(r13, 0);
        String str = this.$useCase;
        if (C162457s7.A0P(str, "business_search")) {
            this.this$0.A06(r13, this.$businessProfile.A03, false);
        } else if (C162457s7.A0P(str, "global_search")) {
            AnonymousClass5ZL r1 = this.this$0;
            String str2 = this.$businessProfile.A03;
            AnonymousClass1VX r2 = r1.A0D;
            if ((r2.A0X(5257) || r2.A0X(6743)) && r2.A0X(6165)) {
                r1.A0A.A03((Boolean) null, C18290x4.A0c(), r1.A0E.A02(), str2, (String) null, 1, 0);
            }
            C111515iD r3 = r1.A0A;
            int A05 = C86644Kx.A05(r1.A0E);
            String A02 = r1.A02();
            AnonymousClass1VX r12 = r3.A01;
            C162457s7.A0J(r12, 0);
            if (r12.A0X(5957)) {
                C94924sJ r4 = new C94924sJ();
                Integer A0c = C18290x4.A0c();
                r4.A00 = A0c;
                r4.A01 = 0;
                r4.A02 = A0c;
                r3.A01(r4);
                r3.A02(r4, Integer.valueOf(A05), (Integer) null, (Integer) null, (Integer) null, (Integer) null, A02, (List) null);
                r3.A02.BhD(r4);
            }
        }
        this.this$0.A0J.invoke(r13);
        return C59022wD.A00;
    }
}
