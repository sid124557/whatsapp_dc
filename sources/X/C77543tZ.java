package X;

import com.whatsapp.conversation.CommentsBottomSheet;

/* renamed from: X.3tZ  reason: invalid class name and case insensitive filesystem */
public final class C77543tZ extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ CommentsBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77543tZ(CommentsBottomSheet commentsBottomSheet) {
        super(0);
        this.this$0 = commentsBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        CommentsBottomSheet commentsBottomSheet = this.this$0;
        C69263Wi r3 = commentsBottomSheet.A02;
        if (r3 != null) {
            C106715a2 r2 = commentsBottomSheet.A0M;
            if (r2 != null) {
                AnonymousClass33p r1 = commentsBottomSheet.A0B;
                if (r1 != null) {
                    return new AnonymousClass5OL(r3, r1, r2);
                }
                throw C18270x1.A0S("sharedPreferences");
            }
            throw C18270x1.A0S("linkifier");
        }
        throw C18270x1.A0S("globalUI");
    }
}
