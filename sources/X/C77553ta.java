package X;

import com.whatsapp.conversation.CommentsBottomSheet;

/* renamed from: X.3ta  reason: invalid class name and case insensitive filesystem */
public final class C77553ta extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ CommentsBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77553ta(CommentsBottomSheet commentsBottomSheet) {
        super(0);
        this.this$0 = commentsBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        CommentsBottomSheet commentsBottomSheet = this.this$0;
        C39622Cr r4 = commentsBottomSheet.A01;
        if (r4 != null) {
            Object value = commentsBottomSheet.A0T.getValue();
            Object A0d = C18300x5.A0d(this.this$0.A0X);
            C162457s7.A0J(value, 1);
            return new C86124Ix(A0d, r4, value, 1);
        }
        throw C18270x1.A0S("commentsBottomSheetViewModelFactory");
    }
}
