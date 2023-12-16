package com.whatsapp.conversation;

import X.AnonymousClass001;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.CommentsBottomSheet$setupRecyclerView$2", f = "CommentsBottomSheet.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CommentsBottomSheet$setupRecyclerView$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ LinearLayoutManager $layoutManager;
    public /* synthetic */ boolean Z$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentsBottomSheet$setupRecyclerView$2(LinearLayoutManager linearLayoutManager, C84814Du r3) {
        super(r3, 2);
        this.$layoutManager = linearLayoutManager;
    }

    public final Object A09(Object obj) {
        if (this.label == 0) {
            C57682u2.A01(obj);
            if (this.Z$0) {
                this.$layoutManager.A0Z(0);
            }
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        CommentsBottomSheet$setupRecyclerView$2 commentsBottomSheet$setupRecyclerView$2 = new CommentsBottomSheet$setupRecyclerView$2(this.$layoutManager, r4);
        commentsBottomSheet$setupRecyclerView$2.Z$0 = AnonymousClass001.A1Z(obj);
        return commentsBottomSheet$setupRecyclerView$2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
