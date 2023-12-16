package X;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.conversation.conversationrow.botplugin.ReelCarouselItemView$updateProfilePhotoView$1;

/* renamed from: X.4oT  reason: invalid class name and case insensitive filesystem */
public final class C93384oT extends C93404oV {
    public C64393Dh A00;
    public C33141sV A01;
    public AnonymousClass5UY A02;
    public C73853gB A03;
    public final int A04 = C18290x4.A0G(this).getDimensionPixelSize(R.dimen.f6nameremoved);
    public final int A05 = C18290x4.A0G(this).getDimensionPixelSize(R.dimen.f6nameremoved);
    public final RelativeLayout A06;
    public final ShimmerFrameLayout A07;
    public final WaTextView A08;
    public final ThumbnailButton A09;
    public final ThumbnailButton A0A;

    public void A02(C30481mW r12) {
        C30481mW r4 = r12;
        super.A02(r12);
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass2z0 A082 = C624134x.A08(r12, "LinkCarouselItemView/fillView ", A0o);
        C18260x0.A1J(A0o, A082.A01);
        if (r12.A01 == 4) {
            this.A06.setVisibility(8);
            this.A09.setVisibility(8);
            ShimmerFrameLayout shimmerFrameLayout = this.A07;
            shimmerFrameLayout.setVisibility(0);
            AnonymousClass6NL r3 = new AnonymousClass6NL();
            AnonymousClass7QQ r2 = r3.A00;
            r2.A0G = false;
            r3.A02(0.75f);
            r3.A06(0);
            C86634Kw.A1N(r3, 1500);
            r2.A03 = 0.0f;
            shimmerFrameLayout.A05(r3.A01());
            C86604Kt.A0z(getContext(), shimmerFrameLayout, R.color.f5nameremoved);
            shimmerFrameLayout.A02();
            return;
        }
        ShimmerFrameLayout shimmerFrameLayout2 = this.A07;
        shimmerFrameLayout2.A03();
        shimmerFrameLayout2.setVisibility(8);
        this.A06.setVisibility(0);
        this.A08.setText(r12.A06);
        if (r12.A1z() == null) {
            this.A09.setVisibility(8);
        } else {
            getMessageThumbCache().A0C(this.A09, r4, new C100465Ba(this, 12), A082, 2000, false, false, false);
        }
        C616131n.A02((C85494Gl) null, new ReelCarouselItemView$updateProfilePhotoView$1(this, r12, (C84814Du) null), AnonymousClass349.A02(AnonymousClass2C4.A01), (AnonymousClass20D) null, 3);
    }

    public final void setFMessageIO(C64393Dh r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final void setMainDispatcher(C73853gB r2) {
        C162457s7.A0J(r2, 0);
        this.A03 = r2;
    }

    public final void setMessageThumbCache(C33141sV r2) {
        C162457s7.A0J(r2, 0);
        this.A01 = r2;
    }

    public static /* synthetic */ void getMainDispatcher$annotations() {
    }

    public final C64393Dh getFMessageIO() {
        C64393Dh r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("fMessageIO");
    }

    public final C73853gB getMainDispatcher() {
        C73853gB r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("mainDispatcher");
    }

    public final C33141sV getMessageThumbCache() {
        C33141sV r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("messageThumbCache");
    }

    public AnonymousClass5UY getSelectionView() {
        return this.A02;
    }

    public C93384oT(Context context, AnonymousClass677 r5) {
        super(context, r5);
        View.inflate(context, R.layout.f8nameremoved, this);
        this.A06 = (RelativeLayout) C18280x3.A0E(this, R.id.content);
        this.A08 = C86604Kt.A0O(this, R.id.title);
        this.A09 = (ThumbnailButton) C18280x3.A0E(this, R.id.thumb);
        this.A07 = (ShimmerFrameLayout) C18280x3.A0E(this, R.id.shimmer_layout);
        this.A02 = C18290x4.A0X(this, R.id.selection_view);
        ThumbnailButton thumbnailButton = (ThumbnailButton) C18280x3.A0E(this, R.id.profile_photo);
        this.A0A = thumbnailButton;
        C107235av.A03(this, C86664Kz.A01(C18290x4.A0G(this), R.dimen.f6nameremoved));
        C107235av.A01(thumbnailButton);
        getOutlineProvider();
    }
}
