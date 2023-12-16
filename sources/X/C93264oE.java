package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.Set;

/* renamed from: X.4oE  reason: invalid class name and case insensitive filesystem */
public class C93264oE extends C92434mg {
    public C54292oU A00;
    public AnonymousClass9TC A01;
    public C1907099n A02;
    public AnonymousClass9U4 A03;
    public C195219Wq A04;
    public AnonymousClass33Q A05;
    public final FrameLayout A06;
    public final ImageView A07;
    public final TextEmojiLabel A08 = C86644Kx.A0M(this, R.id.get_started);
    public final TextEmojiLabel A09 = AnonymousClass0x7.A0K(this, R.id.invite_description);
    public final C196389al A0A;

    public void A1H() {
        A1t(false);
        A22();
    }

    public final void A22() {
        Intent A002;
        this.A09.setText(getInviteContext());
        AnonymousClass9TC r5 = this.A01;
        this.A0A.Axq(new AnonymousClass7HR(2, new C1452474t()));
        if (r5 != null) {
            Drawable A012 = r5.A01();
            ImageView imageView = this.A07;
            imageView.setVisibility(0);
            imageView.setImageDrawable(A012);
        }
        TextEmojiLabel textEmojiLabel = this.A08;
        if (textEmojiLabel == null) {
            return;
        }
        if (!this.A02.A02() || r5 == null || (A002 = r5.A00(getFMessage())) == null) {
            textEmojiLabel.setVisibility(8);
            return;
        }
        textEmojiLabel.setVisibility(0);
        C109475eg.A00(textEmojiLabel, this, A002, 18);
    }

    public int getUserNameInGroupLayoutOption() {
        return 1;
    }

    public C93264oE(Context context, AnonymousClass677 r7, C624134x r8) {
        super(context, r7, r8);
        FrameLayout A0L = C86654Ky.A0L(this, R.id.payment_container);
        this.A06 = A0L;
        this.A07 = AnonymousClass0x9.A0E(this, R.id.payment_brand_logo);
        ViewStub viewStub = (ViewStub) C06560Yg.A02(this, R.id.payment_invite_right_view_stub);
        A0L.setForeground(getInnerFrameForegroundDrawable());
        if (this.A02.A02()) {
            this.A01 = this.A03.A0G().BAy();
        }
        C196389al r0 = new C196389al(this.A00, this.A05, this.A25);
        this.A0A = r0;
        r0.BFl(viewStub);
        A22();
    }

    private CharSequence getInviteContext() {
        C624134x fMessage = getFMessage();
        C195219Wq r3 = this.A04;
        Context context = getContext();
        AnonymousClass2z0 r0 = fMessage.A1J;
        boolean z = r0.A02;
        C95814uZ r02 = r0.A00;
        C626936e.A06(r02);
        C193359Oe A0I = r3.A0I(context, r02, z);
        String str = A0I.A00;
        SpannableStringBuilder A002 = C18330xA.A00(str);
        String str2 = A0I.A01;
        int indexOf = str.indexOf(str2);
        getContext();
        A002.setSpan(new AnonymousClass4N1(), indexOf, C86664Kz.A0L(str2, indexOf), 0);
        return A002;
    }

    public void A1q(C624134x r2, boolean z) {
        boolean A1W = C18300x5.A1W(r2, getFMessage());
        super.A1q(r2, z);
        if (z || A1W) {
            A22();
        }
    }

    public Set getInnerFrameLayouts() {
        Set innerFrameLayouts = super.getInnerFrameLayouts();
        innerFrameLayouts.add(this.A06);
        return innerFrameLayouts;
    }

    public int getCenteredLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f8nameremoved;
    }

    public int getOutgoingLayoutId() {
        return R.layout.f8nameremoved;
    }
}
