package X;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.7a0  reason: invalid class name and case insensitive filesystem */
public final class C152717a0 {
    public int A00 = 1;
    public RecyclerView A01;
    public ShimmerFrameLayout A02;
    public AnonymousClass7X9 A03;
    public C181848nR A04 = new C159657mF(1);
    public C125296Hg A05;
    public AnonymousClass7TW A06;
    public final C146827Bt A07;
    public final AnonymousClass7CS A08;
    public final AnonymousClass7CU A09;
    public final C620733j A0A;

    public C152717a0(C146827Bt r3, AnonymousClass7CS r4, AnonymousClass7CU r5, C620733j r6) {
        C162457s7.A0J(r6, 1);
        C18260x0.A0a(r4, r5, r3, 2);
        this.A0A = r6;
        this.A08 = r4;
        this.A09 = r5;
        this.A07 = r3;
    }

    public final void A00() {
        ShimmerFrameLayout shimmerFrameLayout = this.A02;
        if (shimmerFrameLayout == null) {
            throw C18270x1.A0S("shimmerView");
        }
        shimmerFrameLayout.setVisibility(0);
        ShimmerFrameLayout shimmerFrameLayout2 = this.A02;
        if (shimmerFrameLayout2 == null) {
            throw C18270x1.A0S("shimmerView");
        }
        shimmerFrameLayout2.A01();
        C125296Hg r3 = this.A05;
        if (r3 == null) {
            throw C18270x1.A0S("adapter");
        }
        if (!r3.A04) {
            r3.A04 = true;
            int size = r3.A03.A01.size();
            r3.A03 = C1448473e.A00();
            if (size < 5) {
                r3.A09(0, size);
                r3.A01.A02(size, 5 - size);
            } else {
                r3.A09(0, 5);
                r3.A01.A03(5, size - 5);
            }
        }
        AnonymousClass7TW r6 = this.A06;
        if (r6 == null) {
            throw C18270x1.A0S("titleController");
        }
        TextView textView = r6.A02;
        Drawable A012 = AnonymousClass0VX.A01(textView.getContext(), R.drawable.variants_carousel_title_loading_background_shape);
        int dimensionPixelSize = textView.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        TextView textView2 = r6.A02;
        textView2.setBackground(A012);
        C86654Ky.A14(textView2, dimensionPixelSize, -2);
        AnonymousClass7X9 r1 = this.A03;
        if (r1 == null) {
            throw C18270x1.A0S("dropdownController");
        }
        r1.A01((C165977xw) null, C1448473e.A00(), 0, false);
        RecyclerView recyclerView = this.A01;
        if (recyclerView == null) {
            throw C18270x1.A0S("carouselView");
        }
        recyclerView.setVisibility(0);
    }

    public final void A01(C08270df r11, C15910sA r12, ShimmerFrameLayout shimmerFrameLayout, UserJid userJid) {
        this.A02 = shimmerFrameLayout;
        TextView A0I = AnonymousClass0x2.A0I(shimmerFrameLayout, R.id.variants_label);
        this.A01 = (RecyclerView) C18280x3.A0E(shimmerFrameLayout, R.id.variants_list);
        TextView A0I2 = AnonymousClass0x2.A0I(shimmerFrameLayout, R.id.variants_dropdown);
        C146827Bt r1 = this.A07;
        C08270df r5 = r11;
        C15910sA r6 = r12;
        this.A03 = new AnonymousClass7X9(A0I2, r5, r6, new C154207cn(), new C1897192j(this, 1), C64333Db.A2t(r1.A00.A04));
        this.A06 = new AnonymousClass7TW(A0I, C64333Db.A2t(this.A09.A00.A04));
        ShimmerFrameLayout shimmerFrameLayout2 = this.A02;
        if (shimmerFrameLayout2 == null) {
            throw C18270x1.A0S("shimmerView");
        }
        shimmerFrameLayout2.A00();
        RecyclerView recyclerView = this.A01;
        if (recyclerView == null) {
            throw C18270x1.A0S("carouselView");
        }
        recyclerView.A0o(new AnonymousClass4XT(this.A0A, C18290x4.A0G(shimmerFrameLayout).getDimensionPixelSize(R.dimen.f6nameremoved)));
        C125296Hg r2 = new C125296Hg((AnonymousClass7CT) this.A08.A00.A03.A10.get(), userJid);
        this.A05 = r2;
        RecyclerView recyclerView2 = this.A01;
        if (recyclerView2 == null) {
            throw C18270x1.A0S("carouselView");
        }
        recyclerView2.setAdapter(r2);
        C125296Hg r22 = this.A05;
        if (r22 == null) {
            throw C18270x1.A0S("adapter");
        }
        r22.A02 = new C1897192j(this, 2);
    }
}
