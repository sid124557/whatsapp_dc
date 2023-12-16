package X;

import java.util.Map;

/* renamed from: X.441  reason: invalid class name */
public final class AnonymousClass441 extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ int $botType;
    public final /* synthetic */ C41182Jg $onResultCallback;
    public final /* synthetic */ C50292hw this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass441(C41182Jg r2, C50292hw r3, int i) {
        super(1);
        this.this$0 = r3;
        this.$botType = i;
        this.$onResultCallback = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        Boolean bool = (Boolean) obj;
        boolean booleanValue = bool.booleanValue();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("acceptDisclaimerV2/onResult/");
        if (booleanValue) {
            str = "success";
        } else {
            str = "failed";
        }
        C18260x0.A1J(A0o, str);
        Map A04 = C57692u3.A04("result", C57692u3.A04("success", bool));
        if (booleanValue) {
            C50292hw r5 = this.this$0;
            r5.A06.BkM(new C117705sM((Object) r5, this.$botType, 12));
            AnonymousClass2Z2 r3 = this.this$0.A07;
            r3.A00(r3.A00, 7, this.$botType);
        }
        this.this$0.A00.BkS(new C117175rV(this.$onResultCallback, 26, A04));
        return C59022wD.A00;
    }
}
