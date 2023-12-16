package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.whatsapp.R;

/* renamed from: X.1h7  reason: invalid class name */
public final class AnonymousClass1h7 extends C19180yt implements AnonymousClass4GJ {
    public AnonymousClass5Y0 A00;
    public C116855qy A01;
    public boolean A02;
    public final View A03;
    public final ImageView A04;
    public final TextView A05;
    public final TextView A06;
    public final CardView A07;
    public final AnonymousClass5YB A08;

    public final void setEmojiLoader(AnonymousClass5Y0 r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A01;
        if (r0 == null) {
            r0 = new C116855qy(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass5Y0 getEmojiLoader() {
        AnonymousClass5Y0 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("emojiLoader");
    }

    public AnonymousClass1h7(Context context) {
        super(context);
        if (!this.A02) {
            this.A02 = true;
            C64333Db r1 = ((C88864av) ((C111685iW) generatedComponent())).A0K;
            this.A04 = C64333Db.A39(r1);
            this.A01 = (AnonymousClass5UX) r1.A6K.get();
            this.A03 = C64333Db.A2o(r1);
            this.A06 = C64333Db.A74(r1);
            this.A05 = (AnonymousClass5QQ) r1.A00.A85.get();
            this.A02 = (C613330g) r1.A6S.get();
            this.A00 = (AnonymousClass64J) r1.AEN.get();
            this.A00 = C64333Db.A3o(r1);
        }
        View inflate = View.inflate(context, R.layout.f8nameremoved, this);
        this.A07 = (CardView) C18290x4.A0M(inflate, R.id.newsletter_link_card);
        this.A04 = (ImageView) C18290x4.A0M(inflate, R.id.newsletter_link_thumbnail);
        this.A08 = AnonymousClass5YB.A00(this, getTextEmojiLabelViewControllerFactory(), R.id.newsletter_link_name);
        this.A06 = C18280x3.A0F(inflate, R.id.newsletter_link_followers);
        this.A05 = C18280x3.A0F(inflate, R.id.newsletter_link_description);
        this.A03 = C18290x4.A0M(inflate, R.id.newsletter_link_button);
    }

    public final View getButtonView() {
        return this.A03;
    }

    public CardView getCardView() {
        return this.A07;
    }

    public TextView getFollowersView() {
        return this.A06;
    }

    public AnonymousClass5YB getNameViewController() {
        return this.A08;
    }

    public ImageView getThumbnailView() {
        return this.A04;
    }
}
