package com.whatsapp.expressionstray.conversation;

import X.AnonymousClass001;
import X.AnonymousClass1TK;
import X.AnonymousClass1TL;
import X.AnonymousClass1TY;
import X.AnonymousClass1TZ;
import X.AnonymousClass1Ta;
import X.AnonymousClass1Tb;
import X.AnonymousClass218;
import X.AnonymousClass4GR;
import X.C162457s7;
import X.C18290x4;
import X.C24601Ya;
import X.C41552Kr;
import X.C56612sH;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import X.C85534Gq;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel$onSearchClicked$1", f = "ExpressionsKeyboardViewModel.kt", i = {}, l = {272, 275}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsKeyboardViewModel$onSearchClicked$1 extends C75003pT implements AnonymousClass4GR {
    public int label;
    public final /* synthetic */ ExpressionsKeyboardViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsKeyboardViewModel$onSearchClicked$1(ExpressionsKeyboardViewModel expressionsKeyboardViewModel, C84814Du r3) {
        super(r3, 2);
        this.this$0 = expressionsKeyboardViewModel;
    }

    public final Object A09(Object obj) {
        Integer num;
        int i;
        C85534Gq r1;
        Object obj2;
        AnonymousClass218 r4 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            C57682u2.A01(obj);
            boolean A0P = C162457s7.A0P(this.this$0.A02, AnonymousClass1TZ.A00);
            ExpressionsKeyboardViewModel expressionsKeyboardViewModel = this.this$0;
            if (A0P) {
                r1 = expressionsKeyboardViewModel.A0F;
                obj2 = AnonymousClass1TL.A00;
                this.label = 1;
            } else {
                C24601Ya r5 = new C24601Ya();
                int i3 = expressionsKeyboardViewModel.A00;
                Integer A0a = C18290x4.A0a();
                switch (i3) {
                    case 2:
                        i = 4;
                        break;
                    case 3:
                        num = A0a;
                        break;
                    case 4:
                        num = 2;
                        break;
                    case 5:
                        i = 5;
                        break;
                    default:
                        num = 1;
                        break;
                }
                num = Integer.valueOf(i);
                r5.A00 = num;
                C41552Kr r12 = expressionsKeyboardViewModel.A02;
                if (!C162457s7.A0P(r12, AnonymousClass1TY.A00)) {
                    if (C162457s7.A0P(r12, AnonymousClass1Ta.A00)) {
                        A0a = 1;
                    } else {
                        C162457s7.A0P(r12, AnonymousClass1Tb.A00);
                        A0a = 2;
                    }
                }
                r5.A01 = A0a;
                r5.A02 = C56612sH.A09(expressionsKeyboardViewModel.A05);
                expressionsKeyboardViewModel.A09.BhD(r5);
                r1 = this.this$0.A0F;
                obj2 = AnonymousClass1TK.A00;
                this.label = 2;
            }
            if (r1.B2K(obj2, this) == r4) {
                return r4;
            }
        } else if (i2 == 1 || i2 == 2) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        return new ExpressionsKeyboardViewModel$onSearchClicked$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A01(new ExpressionsKeyboardViewModel$onSearchClicked$1(this.this$0, (C84814Du) obj2));
    }
}
