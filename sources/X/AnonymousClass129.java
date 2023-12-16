package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.comments.CommentListManager$loadMoreMessages$1;
import com.whatsapp.conversation.CommentsBottomSheet;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.129  reason: invalid class name */
public final class AnonymousClass129 extends AnonymousClass0O5 {
    public final /* synthetic */ LinearLayoutManager A00;
    public final /* synthetic */ CommentsBottomSheet A01;

    public void A05(RecyclerView recyclerView, int i) {
        C011709l r0;
        C162457s7.A0J(recyclerView, 0);
        if (i == 0) {
            r0 = this.A01.A0R;
        } else if (i == 1 || i == 2) {
            r0 = null;
        } else {
            return;
        }
        recyclerView.setItemAnimator(r0);
    }

    public AnonymousClass129(LinearLayoutManager linearLayoutManager, CommentsBottomSheet commentsBottomSheet) {
        this.A01 = commentsBottomSheet;
        this.A00 = linearLayoutManager;
    }

    public void A04(RecyclerView recyclerView, int i, int i2) {
        int A1I = this.A00.A1I();
        CommentsBottomSheet commentsBottomSheet = this.A01;
        AnonymousClass4W9 r0 = commentsBottomSheet.A07;
        if (r0 == null) {
            throw C18270x1.A0S("adapter");
        } else if (r0.A0G() - A1I < 100) {
            C194510y r3 = (C194510y) commentsBottomSheet.A0U.getValue();
            C60332yN r02 = r3.A00;
            if (r02 == null) {
                throw C18270x1.A0S("commentListManager");
            } else if (r02.A06.get() != AnonymousClass21B.COMPLETE) {
                C60332yN r5 = r3.A00;
                if (r5 == null) {
                    throw C18270x1.A0S("commentListManager");
                }
                AtomicReference atomicReference = r5.A06;
                Object obj = atomicReference.get();
                AnonymousClass21B r03 = AnonymousClass21B.LOADING;
                if (obj != r03) {
                    atomicReference.set(r03);
                    C616131n.A02(r5.A07, new CommentListManager$loadMoreMessages$1(r5, (C84814Du) null), r5.A08, (AnonymousClass20D) null, 2);
                }
            }
        }
    }
}
