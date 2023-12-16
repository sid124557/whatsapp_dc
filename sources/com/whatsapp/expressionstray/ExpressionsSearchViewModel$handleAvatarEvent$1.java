package com.whatsapp.expressionstray;

import X.AnonymousClass001;
import X.AnonymousClass1Ta;
import X.AnonymousClass1Tb;
import X.AnonymousClass218;
import X.AnonymousClass28P;
import X.AnonymousClass4GR;
import X.C162457s7;
import X.C30071lo;
import X.C41552Kr;
import X.C53152md;
import X.C57682u2;
import X.C59022wD;
import X.C616131n;
import X.C73723fy;
import X.C75003pT;
import X.C84814Du;
import com.whatsapp.expressionstray.conversation.ExpressionsKeyboardTabHandler$createTabsListByOpener$2;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.ExpressionsSearchViewModel$handleAvatarEvent$1", f = "ExpressionsSearchViewModel.kt", i = {}, l = {345}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsSearchViewModel$handleAvatarEvent$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass28P $event;
    public Object L$0;
    public int label;
    public final /* synthetic */ ExpressionsSearchViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsSearchViewModel$handleAvatarEvent$1(ExpressionsSearchViewModel expressionsSearchViewModel, AnonymousClass28P r3, C84814Du r4) {
        super(r4, 2);
        this.this$0 = expressionsSearchViewModel;
        this.$event = r3;
    }

    public final Object A09(Object obj) {
        ExpressionsSearchViewModel expressionsSearchViewModel;
        AnonymousClass218 r7 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            expressionsSearchViewModel = this.this$0;
            C53152md r5 = expressionsSearchViewModel.A09;
            int i2 = expressionsSearchViewModel.A00;
            this.L$0 = expressionsSearchViewModel;
            this.label = 1;
            obj = C616131n.A00(this, r5.A04, new ExpressionsKeyboardTabHandler$createTabsListByOpener$2(r5, (C84814Du) null, i2, false));
            if (obj == r7) {
                return r7;
            }
        } else if (i == 1) {
            expressionsSearchViewModel = (ExpressionsSearchViewModel) this.L$0;
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        expressionsSearchViewModel.A04 = (List) obj;
        if (this.$event instanceof C30071lo) {
            C41552Kr r0 = this.this$0.A03;
            Object obj2 = AnonymousClass1Ta.A00;
            boolean A0P = C162457s7.A0P(r0, obj2);
            List list = this.this$0.A04;
            if (!A0P) {
                obj2 = AnonymousClass1Tb.A00;
            }
            int indexOf = list.indexOf(obj2);
            ExpressionsSearchViewModel expressionsSearchViewModel2 = this.this$0;
            expressionsSearchViewModel2.A02 = null;
            C41552Kr r02 = (C41552Kr) C73723fy.A06(expressionsSearchViewModel2.A04, indexOf);
            if (r02 != null) {
                expressionsSearchViewModel2.A0D(r02);
            }
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new ExpressionsSearchViewModel$handleAvatarEvent$1(this.this$0, this.$event, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
