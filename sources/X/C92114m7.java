package X;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.text.ReadMoreTextView;
import com.whatsapp.wds.components.banners.WDSBannerCompact;
import java.util.List;
import java.util.Objects;

/* renamed from: X.4m7  reason: invalid class name and case insensitive filesystem */
public class C92114m7 extends C92174mD {
    public AnonymousClass3ZH A00;
    public WDSBannerCompact A01 = null;
    public final C66663Mh A02;
    public final C620633i A03;
    public final C56542sA A04;
    public final C56982ss A05;
    public final AnonymousClass5Y0 A06;
    public final AnonymousClass1VX A07;
    public final C60152y5 A08;
    public final C106715a2 A09;
    public final boolean A0A;

    public C92114m7(ViewGroup viewGroup, C66663Mh r3, AnonymousClass67A r4, C620633i r5, C56542sA r6, C56982ss r7, AnonymousClass3ZH r8, AnonymousClass5Y0 r9, AnonymousClass1VX r10, C60152y5 r11, C106715a2 r12, boolean z) {
        super(viewGroup, r4, 40);
        this.A07 = r10;
        this.A09 = r12;
        this.A05 = r7;
        this.A04 = r6;
        this.A06 = r9;
        this.A02 = r3;
        this.A03 = r5;
        this.A08 = r11;
        this.A00 = r8;
        this.A0A = z;
    }

    public final SpannableStringBuilder A09(TextPaint textPaint) {
        CharSequence A072;
        C60912zN r0 = this.A00.A0K;
        Objects.requireNonNull(r0);
        CharSequence A032 = C107345b9.A03(this.A01.getActivity(), textPaint, this.A06, r0.A03);
        if (this.A07.A0X(3154)) {
            A072 = C107635bd.A08(this.A03, this.A08, A032, textPaint.getTextSize());
        } else {
            A072 = C107635bd.A07(this.A03, this.A08, A032);
        }
        return C18330xA.A00(A072);
    }

    public final void A0A() {
        AnonymousClass54F r2 = new AnonymousClass54F(this, 16);
        WDSBannerCompact wDSBannerCompact = this.A01;
        if (wDSBannerCompact != null) {
            wDSBannerCompact.setOnClickListener(r2);
            TextPaint textPaint = this.A01.getTextPaint();
            Objects.requireNonNull(textPaint);
            SpannableStringBuilder A092 = A09(textPaint);
            ReadMoreTextView readMoreTextView = this.A01.A02;
            if (readMoreTextView != null) {
                readMoreTextView.A0K((List) null, A092);
                return;
            }
            return;
        }
        ViewGroup viewGroup = this.A01;
        viewGroup.setOnClickListener(r2);
        ReadMoreTextView readMoreTextView2 = (ReadMoreTextView) viewGroup.findViewById(R.id.group_description_text);
        readMoreTextView2.A02 = new C1236769i(this, 0);
        SpannableStringBuilder A093 = A09(readMoreTextView2.getPaint());
        this.A09.A07(readMoreTextView2.getContext(), A093);
        readMoreTextView2.A0K((List) null, A093);
    }
}
