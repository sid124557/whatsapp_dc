package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.conversation.conversationrow.components.contextcard.CommunityPhotoHeader;
import com.whatsapp.conversation.conversationrow.components.contextcard.GroupPhotoHeader;

/* renamed from: X.0z6  reason: invalid class name and case insensitive filesystem */
public final class C19260z6 extends LinearLayout implements C182228o4, AnonymousClass4GJ {
    public WaImageView A00;
    public CommunityPhotoHeader A01;
    public GroupPhotoHeader A02;
    public C620733j A03;
    public C59862xc A04;
    public C116855qy A05;
    public boolean A06;

    public C19260z6(Context context) {
        super(context, (AttributeSet) null, 0);
        if (!this.A06) {
            this.A06 = true;
            C64333Db r1 = ((C88864av) ((C111685iW) generatedComponent())).A0K;
            this.A03 = C64333Db.A2t(r1);
            this.A04 = (C59862xc) r1.APF.get();
        }
        View.inflate(context, R.layout.f8nameremoved, this);
        this.A02 = (GroupPhotoHeader) findViewById(R.id.groupPhoto);
        this.A00 = (WaImageView) findViewById(R.id.arrow);
        this.A01 = (CommunityPhotoHeader) findViewById(R.id.communityPhoto);
    }

    public final void setPathDrawableHelper(C59862xc r2) {
        C162457s7.A0J(r2, 0);
        this.A04 = r2;
    }

    public final void setWhatsAppLocale(C620733j r2) {
        C162457s7.A0J(r2, 0);
        this.A03 = r2;
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A05;
        if (r0 == null) {
            r0 = new C116855qy(this);
            this.A05 = r0;
        }
        return r0.generatedComponent();
    }

    public final C59862xc getPathDrawableHelper() {
        C59862xc r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("pathDrawableHelper");
    }

    public final C620733j getWhatsAppLocale() {
        C620733j r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("whatsAppLocale");
    }

    public LinearLayout.LayoutParams getHeaderLayoutParams() {
        return C18310x6.A0K(this);
    }

    public View getHeaderView() {
        return this;
    }
}
