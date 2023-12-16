package com.whatsapp.conversation;

import X.AnonymousClass001;
import X.AnonymousClass4GR;
import X.C57682u2;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import com.whatsapp.mentions.MentionableEntry;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.CommentsBottomSheet$setupRecyclerView$3", f = "CommentsBottomSheet.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CommentsBottomSheet$setupRecyclerView$3 extends C75003pT implements AnonymousClass4GR {
    public /* synthetic */ boolean Z$0;
    public int label;
    public final /* synthetic */ CommentsBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentsBottomSheet$setupRecyclerView$3(CommentsBottomSheet commentsBottomSheet, C84814Du r3) {
        super(r3, 2);
        this.this$0 = commentsBottomSheet;
    }

    public final Object A09(Object obj) {
        MentionableEntry mentionableEntry;
        if (this.label == 0) {
            C57682u2.A01(obj);
            if (this.Z$0 && (mentionableEntry = (MentionableEntry) this.this$0.A0W.getValue()) != null) {
                mentionableEntry.setText("");
            }
            return C59022wD.A00;
        }
        throw AnonymousClass001.A0d();
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        CommentsBottomSheet$setupRecyclerView$3 commentsBottomSheet$setupRecyclerView$3 = new CommentsBottomSheet$setupRecyclerView$3(this.this$0, r4);
        commentsBottomSheet$setupRecyclerView$3.Z$0 = AnonymousClass001.A1Z(obj);
        return commentsBottomSheet$setupRecyclerView$3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
