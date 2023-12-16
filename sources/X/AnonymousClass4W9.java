package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;

/* renamed from: X.4W9  reason: invalid class name */
public final class AnonymousClass4W9 extends AnonymousClass09G {
    public RecyclerView A00;
    public final C105365Uq A01;
    public final AnonymousClass5OL A02;

    public void A0C(RecyclerView recyclerView) {
        C162457s7.A0J(recyclerView, 0);
        this.A00 = recyclerView;
    }

    public void A0D(RecyclerView recyclerView) {
        this.A00 = null;
    }

    public void BNf(C05570Ua r6, int i) {
        C162457s7.A0J(r6, 0);
        if (r6 instanceof AnonymousClass6IA) {
            Object A0K = A0K(i);
            C162457s7.A0K(A0K, "null cannot be cast to non-null type com.whatsapp.conversation.comments.CommentsAdapter.Item.CommentItem");
            C624134x r4 = ((C133376hF) A0K).A00;
            C105365Uq r3 = this.A01;
            AnonymousClass5OL r2 = this.A02;
            C18260x0.A0Q(r3, r2);
            View view = r6.A0H;
            C162457s7.A0K(view, "null cannot be cast to non-null type com.whatsapp.conversation.comments.TextCommentLayout");
            ((AnonymousClass4RV) view).A00(r3, r2, r4);
        } else if (r6 instanceof AnonymousClass6IC) {
            Object A0K2 = A0K(i);
            C162457s7.A0K(A0K2, "null cannot be cast to non-null type com.whatsapp.conversation.comments.CommentsAdapter.Item.RevokedCommentItem");
            C624134x r32 = ((C133396hH) A0K2).A00;
            C105365Uq r22 = this.A01;
            C162457s7.A0J(r22, 1);
            View view2 = r6.A0H;
            C162457s7.A0K(view2, "null cannot be cast to non-null type com.whatsapp.conversation.comments.RevokedCommentLayout");
            ((AnonymousClass4QT) view2).A00(r22, r32);
        } else if (r6 instanceof AnonymousClass6IB) {
            Object A0K3 = A0K(i);
            C162457s7.A0K(A0K3, "null cannot be cast to non-null type com.whatsapp.conversation.comments.CommentsAdapter.Item.DecryptionFailureItem");
            C624134x r33 = ((C133386hG) A0K3).A00;
            C105365Uq r23 = this.A01;
            C162457s7.A0J(r23, 1);
            View view3 = r6.A0H;
            C162457s7.A0K(view3, "null cannot be cast to non-null type com.whatsapp.conversation.comments.DecryptionFailureLayout");
            ((AnonymousClass4QS) view3).A00(r23, r33);
        }
    }

    public C05570Ua BQR(ViewGroup viewGroup, int i) {
        View view;
        C162457s7.A0J(viewGroup, 0);
        if (i == 1) {
            return new AnonymousClass6IA(C86614Ku.A0B(viewGroup));
        }
        if (i == 2) {
            return new AnonymousClass6IC(C86614Ku.A0B(viewGroup));
        }
        if (i == 3) {
            return new AnonymousClass6IB(C86614Ku.A0B(viewGroup));
        }
        if (i == 4) {
            View A0R = AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved);
            C162457s7.A0D(A0R);
            view = A0R;
        } else {
            view = viewGroup;
            if (i == 5) {
                View A0R2 = AnonymousClass001.A0R(C86604Kt.A0D(viewGroup), viewGroup, R.layout.f8nameremoved);
                A0R2.setLayoutParams(new ViewGroup.LayoutParams(-1, C86634Kw.A0J().heightPixels / 3));
                view = A0R2;
            }
        }
        return new AnonymousClass6I3(view);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4W9(C105365Uq r3, AnonymousClass5OL r4) {
        super((AnonymousClass0O4) new AnonymousClass6HG());
        boolean A1V = C18320x8.A1V(r4);
        this.A01 = r3;
        this.A02 = r4;
        A0E(A1V);
        BiZ(new C1231267f(this, 3));
    }

    public long A0B(int i) {
        C624134x r0;
        Object A0K = A0K(i);
        if (A0K instanceof C133376hF) {
            Object A0K2 = A0K(i);
            C162457s7.A0K(A0K2, "null cannot be cast to non-null type com.whatsapp.conversation.comments.CommentsAdapter.Item.CommentItem");
            r0 = ((C133376hF) A0K2).A00;
        } else if (A0K instanceof C133396hH) {
            Object A0K3 = A0K(i);
            C162457s7.A0K(A0K3, "null cannot be cast to non-null type com.whatsapp.conversation.comments.CommentsAdapter.Item.RevokedCommentItem");
            r0 = ((C133396hH) A0K3).A00;
        } else if (!(A0K instanceof C133386hG)) {
            return -1;
        } else {
            Object A0K4 = A0K(i);
            C162457s7.A0K(A0K4, "null cannot be cast to non-null type com.whatsapp.conversation.comments.CommentsAdapter.Item.DecryptionFailureItem");
            r0 = ((C133386hG) A0K4).A00;
        }
        return r0.A1L;
    }

    public int getItemViewType(int i) {
        C142126wg r0;
        C147177Dc r02 = (C147177Dc) A0K(i);
        if (r02 != null) {
            r0 = r02.A00;
        } else {
            r0 = C142126wg.NONE;
        }
        return r0.ordinal();
    }
}
