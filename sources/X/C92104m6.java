package X;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableString;
import android.text.style.URLSpan;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.text.ReadMoreTextView;
import com.whatsapp.wds.components.banners.WDSBannerCompact;
import java.util.Arrays;

/* renamed from: X.4m6  reason: invalid class name and case insensitive filesystem */
public class C92104m6 extends C92174mD {
    public ImageView A00;
    public ReadMoreTextView A01;
    public WDSBannerCompact A02;
    public final C69263Wi A03;
    public final C85244Fm A04;
    public final C50382i5 A05;
    public final C53602nM A06;
    public final C620633i A07;
    public final AnonymousClass33p A08;
    public final AnonymousClass1VX A09;
    public final AnonymousClass4FV A0A;

    public C92104m6(ViewGroup viewGroup, C69263Wi r3, C85244Fm r4, C50382i5 r5, C53602nM r6, AnonymousClass67A r7, C620633i r8, AnonymousClass33p r9, AnonymousClass1VX r10, AnonymousClass4FV r11) {
        super(viewGroup, r7, 10);
        this.A09 = r10;
        this.A05 = r5;
        this.A03 = r3;
        this.A0A = r11;
        this.A04 = r4;
        this.A07 = r8;
        this.A08 = r9;
        this.A06 = r6;
    }

    public final void A09() {
        Uri A002 = this.A05.A00();
        WDSBannerCompact wDSBannerCompact = this.A02;
        if (wDSBannerCompact != null) {
            Context context = wDSBannerCompact.getContext();
            C162457s7.A0J(context, 0);
            String string = context.getString(R.string.f11nameremoved, Arrays.copyOf(new Object[0], 0));
            C162457s7.A0H(string);
            wDSBannerCompact.setText((CharSequence) AnonymousClass5VU.A01(context, string, C18290x4.A0l(context, R.string.f11nameremoved)));
            C18290x4.A1I(this.A02, this, A002, 43);
            return;
        }
        AnonymousClass67A r7 = this.A01;
        C89644eZ activity = r7.getActivity();
        Object[] A0L = AnonymousClass002.A0L();
        AnonymousClass0x7.A1E(A002, A0L, 0);
        SpannableString valueOf = SpannableString.valueOf(AnonymousClass0x9.A0B(activity.getString(R.string.f11nameremoved, A0L)));
        for (URLSpan uRLSpan : (URLSpan[]) valueOf.getSpans(0, valueOf.length(), URLSpan.class)) {
            int spanStart = valueOf.getSpanStart(uRLSpan);
            int spanEnd = valueOf.getSpanEnd(uRLSpan);
            valueOf.removeSpan(uRLSpan);
            C88944b3 r11 = new C88944b3(r7.getActivity(), this.A04, this.A03, this.A07, uRLSpan.getURL());
            C18320x8.A16(this.A01, r11, this, 39);
            valueOf.setSpan(r11, spanStart, spanEnd, 0);
        }
        ReadMoreTextView readMoreTextView = this.A01;
        if (readMoreTextView != null) {
            readMoreTextView.setText(valueOf);
        }
    }
}
