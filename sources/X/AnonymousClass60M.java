package X;

import java.util.List;

/* renamed from: X.60M  reason: invalid class name */
public final class AnonymousClass60M extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ AnonymousClass5ZL this$0;

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Integer num = (Integer) obj;
        if (num != null) {
            AnonymousClass5ZL r2 = this.this$0;
            switch (num.intValue()) {
                case 0:
                case 1:
                case 3:
                case 5:
                case 6:
                    C111515iD r3 = r2.A0A;
                    int A05 = C86644Kx.A05(r2.A0E);
                    if (C111515iD.A00(r3)) {
                        C94924sJ r4 = new C94924sJ();
                        C94924sJ.A00(r3, r4, 50);
                        r3.A02(r4, Integer.valueOf(A05), (Integer) null, (Integer) null, (Integer) null, num, (String) null, (List) null);
                        r3.A02.BhD(r4);
                        break;
                    }
                    break;
                case 2:
                case 4:
                    r2.A09.A02.A05();
                    break;
            }
            r2.A08.A0H(r2.A0E);
        }
        return C59022wD.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass60M(AnonymousClass5ZL r2) {
        super(1);
        this.this$0 = r2;
    }
}
