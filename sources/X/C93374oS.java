package X;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.components.button.ThumbnailButton;

/* renamed from: X.4oS  reason: invalid class name and case insensitive filesystem */
public final class C93374oS extends C93394oU {
    public AnonymousClass1VX A00;
    public C106685Zz A01;
    public C33141sV A02;
    public AnonymousClass5UY A03;
    public final int A04 = C18290x4.A0G(this).getDimensionPixelSize(R.dimen.f6nameremoved);
    public final RelativeLayout A05;
    public final ShimmerFrameLayout A06;
    public final WaTextView A07;
    public final WaTextView A08;
    public final WaTextView A09;
    public final ThumbnailButton A0A;

    public void A02(C30481mW r14) {
        Integer num;
        String A002;
        C30481mW r6 = r14;
        super.A02(r14);
        int i = r14.A01;
        int i2 = 0;
        StringBuilder A0o = AnonymousClass001.A0o();
        if (i == 4) {
            C18260x0.A1J(A0o, C624134x.A08(r14, "LinkCarouselItemView/fillView/showPlaceholder", A0o).A01);
            this.A05.setVisibility(8);
            ShimmerFrameLayout shimmerFrameLayout = this.A06;
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
        AnonymousClass2z0 A082 = C624134x.A08(r14, "LinkCarouselItemView/fillView/show link ", A0o);
        C18260x0.A1J(A0o, A082.A01);
        ShimmerFrameLayout shimmerFrameLayout2 = this.A06;
        shimmerFrameLayout2.A03();
        shimmerFrameLayout2.setVisibility(8);
        this.A05.setVisibility(0);
        this.A08.setText(r14.A06);
        String str = r14.A07;
        String str2 = null;
        if (!(str == null || (A002 = C57132t9.A00(getLinkifyWeb(), str)) == null)) {
            if (A002.length() > 150) {
                A002 = A002.substring(0, 150);
            }
            str2 = A002;
        }
        WaTextView waTextView = this.A09;
        if (str2 == null) {
            i2 = 8;
        }
        waTextView.setVisibility(i2);
        waTextView.setText(str2);
        if (r14.A1z() == null) {
            this.A0A.setVisibility(8);
        } else {
            getMessageThumbCache().A0C(this.A0A, r6, new C100465Ba(this, 11), A082, 2000, false, false, false);
        }
        C53532nF A0r = r14.A0r();
        if (A0r == null || (num = A0r.A02) == null || num.intValue() <= 0) {
            this.A07.setVisibility(8);
            return;
        }
        WaTextView waTextView2 = this.A07;
        waTextView2.setVisibility(0);
        waTextView2.setText(AnonymousClass001.A0j(C18290x4.A0v(num), '.'));
        waTextView2.setTextDirection(3);
    }

    public final void setAbProps(AnonymousClass1VX r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final void setLinkifyWeb(C106685Zz r2) {
        C162457s7.A0J(r2, 0);
        this.A01 = r2;
    }

    public final void setMessageThumbCache(C33141sV r2) {
        C162457s7.A0J(r2, 0);
        this.A02 = r2;
    }

    public final AnonymousClass1VX getAbProps() {
        AnonymousClass1VX r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0R();
    }

    public final C106685Zz getLinkifyWeb() {
        C106685Zz r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("linkifyWeb");
    }

    public final C33141sV getMessageThumbCache() {
        C33141sV r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("messageThumbCache");
    }

    public AnonymousClass5UY getSelectionView() {
        return this.A03;
    }

    public C93374oS(Context context, AnonymousClass677 r5) {
        super(context, r5);
        View.inflate(context, R.layout.f8nameremoved, this);
        this.A05 = (RelativeLayout) C18280x3.A0E(this, R.id.content);
        this.A09 = C86604Kt.A0O(this, R.id.url);
        this.A08 = C86604Kt.A0O(this, R.id.title);
        this.A07 = C86604Kt.A0O(this, R.id.reference_index);
        ThumbnailButton thumbnailButton = (ThumbnailButton) C18280x3.A0E(this, R.id.thumb);
        this.A0A = thumbnailButton;
        this.A06 = (ShimmerFrameLayout) C18280x3.A0E(this, R.id.shimmer_layout);
        this.A03 = C18290x4.A0X(this, R.id.selection_view);
        C107235av.A03(thumbnailButton, C86664Kz.A01(C18290x4.A0G(this), R.dimen.f6nameremoved));
    }
}
