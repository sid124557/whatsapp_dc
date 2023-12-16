package X;

import java.util.Map;

/* renamed from: X.401  reason: invalid class name */
public final class AnonymousClass401 extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ Integer $entryPoint;
    public final /* synthetic */ AnonymousClass49M $tosAcceptedCallback;
    public final /* synthetic */ C996357k $tosType;
    public final /* synthetic */ C50192hm this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass401(AnonymousClass49M r2, C50192hm r3, C996357k r4, Integer num) {
        super(0);
        this.this$0 = r3;
        this.$tosType = r4;
        this.$entryPoint = num;
        this.$tosAcceptedCallback = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        boolean A01;
        String str;
        C54862pP r2 = this.this$0.A03;
        int A02 = C18320x8.A02(this.$tosType, 0);
        if (A02 == 0) {
            A01 = r2.A01();
        } else if (A02 == 1) {
            A01 = r2.A00();
        } else {
            throw C73153f1.A00();
        }
        C50192hm r0 = this.this$0;
        if (!A01) {
            AnonymousClass33R r3 = (AnonymousClass33R) r0.A07.get();
            r3.A06.BkM(new C117125rQ(r3, 7));
            C50192hm r1 = this.this$0;
            AnonymousClass2PY r5 = r1.A02;
            C996357k r7 = this.$tosType;
            Integer num = this.$entryPoint;
            AnonymousClass2NB r32 = new AnonymousClass2NB(this.$tosAcceptedCallback, r1, r7);
            C162457s7.A0J(r7, 0);
            AnonymousClass4FV r6 = r5.A02;
            AnonymousClass1ZN r12 = new AnonymousClass1ZN();
            r12.A00 = 32;
            r12.A02 = 36;
            r12.A01 = num;
            r6.BhD(r12);
            C161447pg A00 = r5.A00.A00((C51052jC) null);
            AnonymousClass3Z6[] r62 = new AnonymousClass3Z6[2];
            AnonymousClass3Z6.A09("platform", "android", r62, 0);
            if (r7 == C996357k.INVOKE) {
                str = "invoked";
            } else {
                str = "chat";
            }
            AnonymousClass3Z6.A05("nux_screen", str, r62);
            A00.A07(new AnonymousClass4KR(r32, 0), new C625935s(r32, num, r5, 0), new C52622lm("bonsai_nux", (String) null, C73813g7.A0G(r62)), "", (String) null, (Map) null);
        } else {
            r0.A00.A0D();
            this.$tosAcceptedCallback.BeE(false);
        }
        return C59022wD.A00;
    }
}
