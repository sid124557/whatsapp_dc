package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.gallery.LinksGalleryFragment;
import com.whatsapp.webpagepreview.WebPagePreviewView;
import java.util.Set;

/* renamed from: X.4Z3  reason: invalid class name */
public class AnonymousClass4Z3 extends C05570Ua {
    public AnonymousClass4qD A00;
    public C624134x A01;
    public String A02;
    public Set A03;
    public final View A04;
    public final View A05;
    public final LinearLayout A06;
    public final TextView A07;
    public final TextView A08;
    public final WebPagePreviewView A09;
    public final /* synthetic */ LinksGalleryFragment A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4Z3(View view, LinksGalleryFragment linksGalleryFragment) {
        super(view);
        this.A0A = linksGalleryFragment;
        this.A07 = AnonymousClass002.A09(view, R.id.message_text);
        View findViewById = view.findViewById(R.id.message_text_holder);
        this.A05 = view.findViewById(R.id.starred_status);
        this.A04 = view.findViewById(R.id.kept_status);
        this.A06 = C86664Kz.A0v(view, R.id.message_badge_container);
        this.A08 = AnonymousClass002.A09(view, R.id.suspicious_link_indicator);
        this.A09 = (WebPagePreviewView) C06560Yg.A02(view, R.id.link_preview_frame);
        C635339p.A00(findViewById, this, 33);
        C635339p.A00(view, this, 34);
        AnonymousClass692.A00(view, this, 8);
    }

    public void A07(C624134x r19, int i) {
        C624134x r15 = r19;
        this.A01 = r15;
        C86604Kt.A1R(this.A00);
        WebPagePreviewView webPagePreviewView = this.A09;
        webPagePreviewView.A03();
        TextView textView = this.A07;
        C86634Kw.A1I(textView);
        webPagePreviewView.setLinkTitle((CharSequence) null);
        webPagePreviewView.A0Q.setVisibility(8);
        View view = this.A05;
        view.setVisibility(8);
        View view2 = this.A04;
        view2.setVisibility(8);
        webPagePreviewView.setLinkHostname((String) null);
        webPagePreviewView.setLinkGifSize(0);
        TextView textView2 = this.A08;
        textView2.setVisibility(8);
        LinksGalleryFragment linksGalleryFragment = this.A0A;
        boolean BIB = ((AnonymousClass677) C86654Ky.A0O(linksGalleryFragment)).BIB(r15);
        View view3 = this.A0H;
        if (BIB) {
            ((FrameLayout) view3).setForeground(new ColorDrawable(AnonymousClass0Y8.A04(linksGalleryFragment.A1D(), R.color.f5nameremoved)));
            view3.setSelected(true);
        } else {
            ((FrameLayout) view3).setForeground((Drawable) null);
            view3.setSelected(false);
        }
        textView2.setVisibility(C86644Kx.A08(this.A03));
        boolean A022 = C106215Yb.A02(r15);
        boolean z = r15.A1F;
        C86624Kv.A11(view2, A022 ? 1 : 0, 0, 8);
        C86624Kv.A11(view, z ? 1 : 0, 0, 8);
        if (A022 && z) {
            int dimensionPixelSize = C08310eF.A09(linksGalleryFragment).getDimensionPixelSize(R.dimen.f6nameremoved);
            LinearLayout linearLayout = this.A06;
            linearLayout.setPadding(dimensionPixelSize, linearLayout.getPaddingTop(), 0, 0);
        }
        C103445Mz r1 = linksGalleryFragment.A01;
        Context A0G = linksGalleryFragment.A0G();
        C106685Zz r14 = linksGalleryFragment.A06;
        AnonymousClass4qD r8 = new AnonymousClass4qD(A0G, textView, linksGalleryFragment.A05, linksGalleryFragment.A04, linksGalleryFragment.A05, r14, r15, ((AnonymousClass677) C86654Ky.A0O(linksGalleryFragment)).getSearchTerms(), i);
        this.A00 = r8;
        C103445Mz.A01(r8, r1, this, 0);
    }
}
