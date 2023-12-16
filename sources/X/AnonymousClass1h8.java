package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.settings.chat.wallpaper.WallPaperView;

/* renamed from: X.1h8  reason: invalid class name */
public final class AnonymousClass1h8 extends C19180yt implements AnonymousClass4GJ {
    public AnonymousClass1VX A00;
    public C106685Zz A01;
    public C106715a2 A02;
    public C33141sV A03;
    public C116855qy A04;
    public boolean A05;
    public final View A06;
    public final View A07;
    public final ViewGroup A08;
    public final ImageView A09;
    public final LinearLayout A0A;
    public final TextView A0B;
    public final TextView A0C;
    public final TextView A0D;
    public final TextView A0E;
    public final TextView A0F;
    public final TextView A0G;
    public final CardView A0H;
    public final ConstraintLayout A0I;
    public final AnonymousClass5YB A0J;
    public final ThumbnailButton A0K;
    public final WallPaperView A0L;

    public AnonymousClass1h8(Context context) {
        super(context);
        if (!this.A05) {
            this.A05 = true;
            C64333Db r2 = ((C88864av) ((C111685iW) generatedComponent())).A0K;
            this.A04 = C64333Db.A39(r2);
            this.A01 = (AnonymousClass5UX) r2.A6K.get();
            this.A03 = C64333Db.A2o(r2);
            this.A06 = C64333Db.A74(r2);
            C107695bk r1 = r2.A00;
            this.A05 = (AnonymousClass5QQ) r1.A85.get();
            this.A02 = (C613330g) r2.A6S.get();
            this.A00 = (AnonymousClass64J) r2.AEN.get();
            this.A00 = C64333Db.A4B(r2);
            this.A02 = C18280x3.A0Q(r1);
            this.A01 = (C106685Zz) r2.AJ4.get();
            this.A03 = (C33141sV) r2.AMe.get();
        }
        View inflate = View.inflate(context, R.layout.f8nameremoved, this);
        this.A0H = (CardView) C18290x4.A0M(inflate, R.id.newsletter_status_card);
        this.A0I = (ConstraintLayout) C18290x4.A0M(inflate, R.id.newsletter_status_constraint_layout);
        this.A09 = (ImageView) C18290x4.A0M(inflate, R.id.newsletter_status_thumbnail);
        this.A0J = AnonymousClass5YB.A00(this, getTextEmojiLabelViewControllerFactory(), R.id.newsletter_status_name);
        this.A0B = C18280x3.A0F(inflate, R.id.newsletter_status_followers);
        WallPaperView wallPaperView = (WallPaperView) C18290x4.A0M(inflate, R.id.newsletter_status_wall_paper);
        this.A0L = wallPaperView;
        View A0M = C18290x4.A0M(this, R.id.newsletter_status_conversation_row);
        this.A06 = A0M;
        this.A08 = (ViewGroup) C18290x4.A0M(A0M, R.id.newsletter_status_conversation_message);
        this.A0K = (ThumbnailButton) C18290x4.A0M(this, R.id.newsletter_status_conversation_media);
        this.A07 = C18290x4.A0M(this, R.id.newsletter_status_conversation_media_url_info);
        this.A0G = C18280x3.A0F(this, R.id.newsletter_status_conversation_media_url_title);
        this.A0E = C18280x3.A0F(this, R.id.newsletter_status_conversation_media_url_description);
        this.A0F = C18280x3.A0F(this, R.id.newsletter_status_conversation_media_url_host);
        this.A0D = C18280x3.A0F(this, R.id.newsletter_status_conversation_text);
        this.A0A = (LinearLayout) C18290x4.A0M(A0M, R.id.newsletter_status_conversation_reactions);
        this.A0C = C18280x3.A0F(A0M, R.id.newsletter_status_conversation_reactions_count);
        float radius = this.A0H.getRadius();
        Bitmap A002 = AnonymousClass366.A00(context, getResources(), R.drawable.default_wallpaper);
        wallPaperView.A05 = new float[]{0.0f, 0.0f, 0.0f, 0.0f, radius, radius, radius, radius};
        wallPaperView.setImageBitmap(A002);
    }

    public final void setAbProps(AnonymousClass1VX r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final void setLinkifier(C106715a2 r2) {
        C162457s7.A0J(r2, 0);
        this.A02 = r2;
    }

    public final void setLinkifyWeb(C106685Zz r2) {
        C162457s7.A0J(r2, 0);
        this.A01 = r2;
    }

    public final void setMessageThumbCache(C33141sV r2) {
        C162457s7.A0J(r2, 0);
        this.A03 = r2;
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A04;
        if (r0 == null) {
            r0 = new C116855qy(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass1VX getAbProps() {
        AnonymousClass1VX r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0R();
    }

    public final C106715a2 getLinkifier() {
        C106715a2 r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("linkifier");
    }

    public final C106685Zz getLinkifyWeb() {
        C106685Zz r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("linkifyWeb");
    }

    public final C33141sV getMessageThumbCache() {
        C33141sV r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("messageThumbCache");
    }

    public CardView getCardView() {
        return this.A0H;
    }

    public TextView getFollowersView() {
        return this.A0B;
    }

    public AnonymousClass5YB getNameViewController() {
        return this.A0J;
    }

    public ImageView getThumbnailView() {
        return this.A09;
    }
}
