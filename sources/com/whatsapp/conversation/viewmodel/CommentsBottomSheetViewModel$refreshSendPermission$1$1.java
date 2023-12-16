package com.whatsapp.conversation.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass3ZH;
import X.AnonymousClass4GR;
import X.C194510y;
import X.C57682u2;
import X.C59022wD;
import X.C60932zP;
import X.C75003pT;
import X.C84814Du;
import X.C85524Gp;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.viewmodel.CommentsBottomSheetViewModel$refreshSendPermission$1$1", f = "CommentsBottomSheetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CommentsBottomSheetViewModel$refreshSendPermission$1$1 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ AnonymousClass3ZH $groupContact;
    public int label;
    public final /* synthetic */ C194510y this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentsBottomSheetViewModel$refreshSendPermission$1$1(C194510y r2, AnonymousClass3ZH r3, C84814Du r4) {
        super(r4, 2);
        this.this$0 = r2;
        this.$groupContact = r3;
    }

    public final Object A09(Object obj) {
        Object value;
        C60932zP r0;
        int A0D;
        if (this.label == 0) {
            C57682u2.A01(obj);
            C194510y r4 = this.this$0;
            C85524Gp r3 = r4.A0V;
            AnonymousClass3ZH r2 = this.$groupContact;
            do {
                value = r3.getValue();
                r0 = (C60932zP) value;
                A0D = r4.A0D(r2);
            } while (!r3.AzD(value, new C60932zP(r0.A01, r0.A02, r0.A03, r0.A04, A0D, r0.A05)));
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r5) {
        return new CommentsBottomSheetViewModel$refreshSendPermission$1$1(this.this$0, this.$groupContact, r5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
