package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.conversation.comments.CommentFailedIconView;
import com.whatsapp.conversation.comments.CommentHeader;
import com.whatsapp.conversation.comments.ContactPictureView;
import com.whatsapp.conversation.comments.MessageText;

/* renamed from: X.4RV  reason: invalid class name */
public final class AnonymousClass4RV extends LinearLayout implements AnonymousClass4GJ {
    public C56972sr A00;
    public C56612sH A01;
    public AnonymousClass1VX A02;
    public C52552lf A03;
    public C116855qy A04;
    public boolean A05;
    public final LinearLayout A06;
    public final CommentHeader A07;
    public final ContactPictureView A08;
    public final MessageText A09;
    public final AnonymousClass5UY A0A;
    public final AnonymousClass5UY A0B;
    public final AnonymousClass66R A0C;

    public AnonymousClass4RV(Context context) {
        super(context, (AttributeSet) null, 0);
        if (!this.A05) {
            this.A05 = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            this.A01 = C64333Db.A2p(A002);
            this.A02 = C64333Db.A4B(A002);
            this.A00 = C64333Db.A06(A002);
            this.A03 = (C52552lf) A002.AHS.get();
        }
        this.A0C = C154517dI.A01(new C119445wz(context));
        View.inflate(context, R.layout.f8nameremoved, this);
        this.A06 = (LinearLayout) C18290x4.A0M(this, R.id.comment_container);
        this.A08 = (ContactPictureView) C18290x4.A0M(this, R.id.comment_profile_pic);
        this.A09 = (MessageText) C18290x4.A0M(this, R.id.comment_text);
        this.A07 = (CommentHeader) C18290x4.A0M(this, R.id.comment_header);
        this.A0A = C18290x4.A0X(this, R.id.comment_row_failed_icon);
        this.A0B = C18290x4.A0X(this, R.id.comment_suspicious_links);
    }

    public final void A00(C105365Uq r16, AnonymousClass5OL r17, C624134x r18) {
        C624134x r12 = r18;
        this.A08.A08(r16, r12);
        this.A09.A0L(r17, r12, this.A0B);
        this.A07.A00(r12);
        C56612sH time = getTime();
        boolean A1W = AnonymousClass001.A1W(C627636p.A0C(getMeManager(), time, getAbProps(), getInFlightMessages(), r12).A00.size());
        AnonymousClass5UY r1 = this.A0A;
        if (!A1W) {
            r1.A06(8);
        } else {
            CommentFailedIconView commentFailedIconView = (CommentFailedIconView) AnonymousClass5UY.A00(r1, 0);
            C56612sH time2 = commentFailedIconView.getTime();
            C40812Hv A0C2 = C627636p.A0C(commentFailedIconView.getMeManager(), time2, commentFailedIconView.getAbProps(), commentFailedIconView.getInFlightMessages(), r12);
            commentFailedIconView.setOnClickListener(new C33221se(commentFailedIconView.getContext(), commentFailedIconView.getGlobalUI(), commentFailedIconView.getSendMedia(), commentFailedIconView.getUserActions(), commentFailedIconView.getBlockListManager(), commentFailedIconView.getCoreMessageStore(), commentFailedIconView.getMessageAddOnManager(), r12, A0C2, commentFailedIconView.getWaWorkers()));
        }
        setupClickListener(r12);
    }

    public final void setAbProps(AnonymousClass1VX r2) {
        C162457s7.A0J(r2, 0);
        this.A02 = r2;
    }

    public final void setInFlightMessages(C52552lf r2) {
        C162457s7.A0J(r2, 0);
        this.A03 = r2;
    }

    public final void setMeManager(C56972sr r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final void setTime(C56612sH r2) {
        C162457s7.A0J(r2, 0);
        this.A01 = r2;
    }

    private final void setupClickListener(C624134x r3) {
        C1237169m.A00(this.A06, r3, this, 4);
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A04;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass1VX getAbProps() {
        AnonymousClass1VX r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0R();
    }

    public final C89654ea getActivity() {
        return (C89654ea) this.A0C.getValue();
    }

    public final C52552lf getInFlightMessages() {
        C52552lf r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("inFlightMessages");
    }

    public final C56972sr getMeManager() {
        C56972sr r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("meManager");
    }

    public final C56612sH getTime() {
        C56612sH r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("time");
    }
}
