package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", i = {0}, l = {242}, m = "invokeSuspend", n = {"$this$onFailure_u2dWpGqRn0$iv"}, s = {"L$0"})
/* renamed from: X.3oa  reason: invalid class name and case insensitive filesystem */
public final class C74903oa extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass4C9 $downstream;
    public final /* synthetic */ C69903Yy $lastValue;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74903oa(C84814Du r2, C69903Yy r3, AnonymousClass4C9 r4) {
        super(r2, 2);
        this.$lastValue = r3;
        this.$downstream = r4;
    }

    public final Object A09(Object obj) {
        C69903Yy r4;
        C831746k r0;
        AnonymousClass218 r6 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            Object obj2 = ((C60472yc) this.L$0).A00;
            r4 = this.$lastValue;
            boolean z = obj2 instanceof C44012Ui;
            if (!z) {
                r4.element = obj2;
            }
            AnonymousClass4C9 r2 = this.$downstream;
            if (z) {
                if (!(obj2 instanceof C831746k) || (r0 = (C831746k) obj2) == null || (r0 = r0.A00) == null) {
                    Object obj3 = r4.element;
                    if (obj3 != null) {
                        if (obj3 == AnonymousClass2C3.A01) {
                            obj3 = null;
                        }
                        this.L$0 = obj2;
                        this.L$1 = r4;
                        this.label = 1;
                        if (r2.B2K(obj3, this) == r6) {
                            return r6;
                        }
                    }
                }
                throw r0;
            }
            return C59022wD.A00;
        } else if (i == 1) {
            r4 = (C69903Yy) this.L$1;
            C57682u2.A01(obj);
        } else {
            Throwable th = AnonymousClass001.A0d();
            throw th;
        }
        r4.element = AnonymousClass2C3.A00;
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        C74903oa r0 = new C74903oa(r5, this.$lastValue, this.$downstream);
        r0.L$0 = obj;
        return r0;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01((AnonymousClass8P9) A0A(new C60472yc(((C60472yc) obj).A00), (C84814Du) obj2));
    }
}
