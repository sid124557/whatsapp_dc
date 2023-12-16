package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.stickers.StickerView;

/* renamed from: X.4o8  reason: invalid class name and case insensitive filesystem */
public class C93204o8 extends AnonymousClass4nU implements C183138pY {
    public C183538qC A00;
    public C183538qC A01;
    public boolean A02;
    public final View A03 = findViewById(R.id.bubble_header);
    public final C106145Xu A04;

    public C93204o8(Context context, AnonymousClass677 r15, AnonymousClass1nE r16, C55732qp r17, AnonymousClass33O r18, AnonymousClass5C5 r19) {
        super(context, r15, r16);
        AnonymousClass1VX r6 = this.A0O;
        AnonymousClass5Ul r2 = this.A0a;
        C621033m r3 = this.A0h;
        C620733j r5 = this.A0M;
        C33141sV r12 = this.A22;
        this.A04 = new C106145Xu(this, r2, r3, this.A02, r5, r6, this.A04, this.A05, r17, r18, r19, r12);
        A00(true);
    }

    public void A1H() {
        A00(false);
        A1t(false);
    }

    private void A00(boolean z) {
        boolean z2;
        AnonymousClass1nE r3 = (AnonymousClass1nE) ((C30471mV) this.A0S);
        if (z) {
            AnonymousClass677 r0 = this.A0m;
            if (r0 != null) {
                z2 = r0.BJC(r3);
                StickerView stickerView = this.A04.A0F;
                if (z2) {
                    stickerView.A01 = new C1231867l(this, 0, r3);
                } else {
                    stickerView.A01 = null;
                }
            } else {
                z2 = false;
            }
            this.A04.A02 = z2;
        }
        C106145Xu r4 = this.A04;
        View.OnLongClickListener onLongClickListener = this.A2T;
        StickerView stickerView2 = r4.A0F;
        stickerView2.setOnLongClickListener(onLongClickListener);
        stickerView2.A03 = this.A02;
        r4.A03(r3, z);
        if (C87094Nz.A0m(this)) {
            r4.A01();
        } else if (C87094Nz.A0j(this)) {
            r4.A02();
        } else {
            r4.A00();
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        ViewGroup viewGroup = this.A08;
        LinearLayout.LayoutParams A0U = AnonymousClass001.A0U(viewGroup);
        if (r3.A0w() == null && r3.A0c == null) {
            Context context = viewGroup.getContext();
            boolean z3 = this.A0S.A1J.A02;
            int i = R.drawable.balloon_incoming_normal_stkr;
            if (z3) {
                i = R.drawable.balloon_outgoing_normal_stkr;
            }
            setDateWrapperBackground(C18310x6.A0G(context, i));
        } else {
            setDateWrapperBackground((Drawable) null);
            dimensionPixelSize = -dimensionPixelSize;
        }
        A0U.topMargin = dimensionPixelSize;
        viewGroup.setLayoutParams(A0U);
        if (this.A0n.BHf(r3)) {
            View view = this.A03;
            if (view != null) {
                C86644Kx.A0y(view, -1);
            }
            View findViewById = findViewById(R.id.sticker_root);
            if (findViewById != null) {
                C86644Kx.A0y(findViewById, -1);
            }
        }
        A1L();
        A26(r3);
        if (!this.A0Z.A0Y() && this.A0O.A0X(1396) && ((AnonymousClass1nE) ((C30471mV) this.A0S)).A04 != null) {
            A1M();
        }
    }

    private void setDateWrapperBackground(Drawable drawable) {
        ViewGroup viewGroup = this.A08;
        int dimensionPixelOffset = C18290x4.A0G(viewGroup).getDimensionPixelOffset(R.dimen.f6nameremoved);
        int paddingBottom = viewGroup.getPaddingBottom();
        int paddingTop = viewGroup.getPaddingTop();
        viewGroup.setBackground(drawable);
        viewGroup.setPadding(dimensionPixelOffset, paddingTop, dimensionPixelOffset, paddingBottom);
    }

    public void A1N() {
    }

    public void A1q(C624134x r2, boolean z) {
        boolean A1W = C18300x5.A1W(r2, this.A0S);
        super.A1q(r2, z);
        if (z || A1W) {
            A00(A1W);
        }
    }

    public void BpZ() {
        this.A04.A0F.A07();
    }

    public AnonymousClass1nE getFMessage() {
        return (AnonymousClass1nE) ((C30471mV) this.A0S);
    }

    public void setFMessage(C624134x r2) {
        C626936e.A0C(r2 instanceof AnonymousClass1nE);
        super.setFMessage(r2);
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
