package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.conversation.conversationrow.carousel.CarouselItemSelectionView;
import com.whatsapp.util.Log;

/* renamed from: X.4oW  reason: invalid class name and case insensitive filesystem */
public abstract class C93414oW extends AnonymousClass4PR {
    public C85244Fm A00;
    public final AnonymousClass677 A01;

    public void A02(C30481mW r9) {
        C30481mW r5 = r9;
        if (r9.A01 == 4 || r9.A07 == null) {
            getSelectionView().A06(8);
            setOnClickListener((View.OnClickListener) null);
            setOnLongClickListener((View.OnLongClickListener) null);
            return;
        }
        AnonymousClass677 r4 = this.A01;
        if (r4 != null) {
            setOnLongClickListener(new C1237169m(r9, 6, this));
            if (r4.BFW()) {
                AnonymousClass5UY selectionView = getSelectionView();
                Log.d("ConversationRowLinkCarousel/ReelItemView/setSelectionMode create new selection view");
                AnonymousClass5UY.A00(selectionView, 0).setClickable(true);
                selectionView.A04().bringToFront();
                selectionView.A07(new C109565ep(this, r4, r5, selectionView, 4));
                ((CarouselItemSelectionView) selectionView.A04()).setRowSelected(r4.BIB(r9));
                setOnClickListener(new C109475eg(this, 32, r9));
            }
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BaseLinkCarouselItemView/hide selectionView isInflated=");
        AnonymousClass5UY selectionView2 = getSelectionView();
        C18260x0.A1U(A0o, AnonymousClass000.A1W(selectionView2.A01));
        selectionView2.A06(8);
        setOnClickListener(new C109475eg(this, 32, r9));
    }

    public abstract AnonymousClass5UY getSelectionView();

    public final void setLinkLauncher(C85244Fm r2) {
        C162457s7.A0J(r2, 0);
        this.A00 = r2;
    }

    public final C85244Fm getLinkLauncher() {
        C85244Fm r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("linkLauncher");
    }

    public C93414oW(Context context, AnonymousClass677 r2) {
        super(context);
        this.A01 = r2;
    }

    public static final void A00(AnonymousClass677 r1, C30481mW r2, AnonymousClass5UY r3) {
        if (r1.BFW()) {
            Log.d("BaseLinkCarouselItemView/toggleSelection/has selection");
            ((CarouselItemSelectionView) r3.A04()).setRowSelected(r1.Bqw(r2));
            return;
        }
        Log.d("BaseLinkCarouselItemView/toggleSelection/start selection");
        r1.Bpx(r2);
    }
}
