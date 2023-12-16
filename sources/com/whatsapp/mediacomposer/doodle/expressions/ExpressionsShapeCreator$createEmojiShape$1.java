package com.whatsapp.mediacomposer.doodle.expressions;

import X.AnonymousClass001;
import X.AnonymousClass218;
import X.AnonymousClass2RP;
import X.AnonymousClass3QU;
import X.AnonymousClass4GQ;
import X.AnonymousClass4GR;
import X.C105425Uw;
import X.C106655Zv;
import X.C162457s7;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C73853gB;
import X.C75003pT;
import X.C84814Du;
import android.content.Context;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.mediacomposer.doodle.expressions.ExpressionsShapeCreator$createEmojiShape$1", f = "ExpressionsShapeCreator.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsShapeCreator$createEmojiShape$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ int[] $emoji;
    public final /* synthetic */ AnonymousClass4GQ $onShapeReady;
    public int label;
    public final /* synthetic */ AnonymousClass2RP this$0;

    @DebugMetadata(c = "com.whatsapp.mediacomposer.doodle.expressions.ExpressionsShapeCreator$createEmojiShape$1$1", f = "ExpressionsShapeCreator.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.mediacomposer.doodle.expressions.ExpressionsShapeCreator$createEmojiShape$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C75003pT implements AnonymousClass4GR {
        public int label;

        public final Object A09(Object obj) {
            if (this.label == 0) {
                C57682u2.A01(obj);
                AnonymousClass4GQ r1 = r22;
                C105425Uw r0 = B13;
                C162457s7.A0C(r0);
                r1.invoke(r0);
                return C59022wD.A00;
            }
            throw AnonymousClass001.A0d();
        }

        public final C84814Du A0A(Object obj, C84814Du r5) {
            return new AnonymousClass1(B13, r5, r22);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return C59022wD.A00(obj2, obj, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsShapeCreator$createEmojiShape$1(Context context, AnonymousClass2RP r3, C84814Du r4, AnonymousClass4GQ r5, int[] iArr) {
        super(r4, 2);
        this.$emoji = iArr;
        this.this$0 = r3;
        this.$context = context;
        this.$onShapeReady = r5;
    }

    public final Object A09(Object obj) {
        AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            C106655Zv r2 = new C106655Zv(this.$emoji);
            AnonymousClass2RP r1 = this.this$0;
            final C105425Uw B13 = new AnonymousClass3QU(r2, r1.A01).B13(this.$context, r1.A00, false);
            C73853gB r3 = this.this$0.A04;
            final AnonymousClass4GQ r22 = this.$onShapeReady;
            AnonymousClass1 r0 = new AnonymousClass1((C84814Du) null);
            this.label = 1;
            if (C616131n.A00(this, r3, r0) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r8) {
        int[] iArr = this.$emoji;
        return new ExpressionsShapeCreator$createEmojiShape$1(this.$context, this.this$0, r8, this.$onShapeReady, iArr);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
