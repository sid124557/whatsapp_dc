package com.whatsapp.funstickers.report.bloks;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass2GV;
import X.AnonymousClass2OB;
import X.AnonymousClass4GR;
import X.C51702kF;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.funstickers.report.bloks.WaBkFunReportInterpreterExtImpl$onReportSubmitted$1", f = "WaBkFunReportInterpreterExtImpl.kt", i = {}, l = {28}, m = "invokeSuspend", n = {}, s = {})
public final class WaBkFunReportInterpreterExtImpl$onReportSubmitted$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ String $requestId;
    public final /* synthetic */ String $responseId;
    public int label;
    public final /* synthetic */ AnonymousClass2OB this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaBkFunReportInterpreterExtImpl$onReportSubmitted$1(AnonymousClass2OB r2, String str, String str2, C84814Du r5) {
        super(r5, 2);
        this.this$0 = r2;
        this.$responseId = str;
        this.$requestId = str2;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            AnonymousClass2GV r3 = this.this$0.A00;
            C51702kF r1 = new C51702kF(this.$responseId, this.$requestId);
            this.label = 1;
            if (r3.A00.B2K(r1, this) == r5 || C59022wD.A00 == r5) {
                return r5;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r6) {
        return new WaBkFunReportInterpreterExtImpl$onReportSubmitted$1(this.this$0, this.$responseId, this.$requestId, r6);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
