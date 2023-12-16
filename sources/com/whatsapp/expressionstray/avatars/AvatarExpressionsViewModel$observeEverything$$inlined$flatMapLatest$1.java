package com.whatsapp.expressionstray.avatars;

import X.AnonymousClass001;
import X.AnonymousClass1TW;
import X.AnonymousClass218;
import X.AnonymousClass4C8;
import X.AnonymousClass4C9;
import X.AnonymousClass4GR;
import X.AnonymousClass4GS;
import X.AnonymousClass4J5;
import X.AnonymousClass4J6;
import X.C57682u2;
import X.C57752u9;
import X.C59022wD;
import X.C72923eW;
import X.C75003pT;
import X.C84814Du;
import X.C85474Gj;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel$observeEverything$$inlined$flatMapLatest$1", f = "AvatarExpressionsViewModel.kt", i = {}, l = {193}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarExpressionsViewModel$observeEverything$$inlined$flatMapLatest$1 extends C75003pT implements AnonymousClass4GS {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ AvatarExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarExpressionsViewModel$observeEverything$$inlined$flatMapLatest$1(AvatarExpressionsViewModel avatarExpressionsViewModel, C84814Du r3) {
        super(r3, 3);
        this.this$0 = avatarExpressionsViewModel;
    }

    public final Object A09(Object obj) {
        AnonymousClass4C8 r3;
        AnonymousClass218 r5 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj);
            AnonymousClass4C9 r6 = (AnonymousClass4C9) this.L$0;
            if (!AnonymousClass001.A1Z(this.L$1)) {
                r3 = new AnonymousClass4J5(AnonymousClass1TW.A00, 1);
            } else {
                AvatarExpressionsViewModel avatarExpressionsViewModel = this.this$0;
                r3 = new AnonymousClass4J6((AnonymousClass4GR) new AvatarExpressionsViewModel$observeAvatarStickers$2(avatarExpressionsViewModel, (C84814Du) null), C57752u9.A00(new AvatarExpressionsViewModel$observeAvatarStickers$$inlined$flatMapLatest$1(avatarExpressionsViewModel, (C84814Du) null), new C72923eW((C85474Gj) null, avatarExpressionsViewModel.A04.A01)), 10);
            }
            this.label = 1;
            if (r3.Az8(this, r6) == r5 || C59022wD.A00 == r5) {
                return r5;
            }
        } else if (i == 1) {
            C57682u2.A01(obj);
        } else {
            throw AnonymousClass001.A0d();
        }
        return C59022wD.A00;
    }

    public /* bridge */ /* synthetic */ Object BGj(Object obj, Object obj2, Object obj3) {
        AvatarExpressionsViewModel$observeEverything$$inlined$flatMapLatest$1 avatarExpressionsViewModel$observeEverything$$inlined$flatMapLatest$1 = new AvatarExpressionsViewModel$observeEverything$$inlined$flatMapLatest$1(this.this$0, (C84814Du) obj3);
        avatarExpressionsViewModel$observeEverything$$inlined$flatMapLatest$1.L$0 = obj;
        avatarExpressionsViewModel$observeEverything$$inlined$flatMapLatest$1.L$1 = obj2;
        return C59022wD.A01(avatarExpressionsViewModel$observeEverything$$inlined$flatMapLatest$1);
    }
}
