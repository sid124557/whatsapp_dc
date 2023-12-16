package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

/* renamed from: X.0z4  reason: invalid class name and case insensitive filesystem */
public final class C19240z4 extends LinearLayout {
    public TextView A00;
    public TextView A01;
    public WaImageView A02;
    public final int A03;
    public final C43182Rc A04;
    public final C46102b5 A05;
    public final C49182g7 A06;
    public final AnonymousClass66R A07 = C154517dI.A01(new C120045xx(this));
    public final AnonymousClass66R A08 = C154517dI.A01(new C120055xy(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19240z4(Context context, C43182Rc r6, C46102b5 r7, C49182g7 r8, int i) {
        super(context, (AttributeSet) null, 0);
        C162457s7.A0J(r7, 5);
        C18260x0.A0U(r6, r8);
        View inflate = C18280x3.A0D(this).inflate(R.layout.f8nameremoved, this, true);
        this.A02 = (WaImageView) C18290x4.A0M(inflate, R.id.privacy_disclosure_bullet_icon);
        this.A01 = C18280x3.A0F(inflate, R.id.privacy_disclosure_bullet_text);
        this.A00 = C18280x3.A0F(inflate, R.id.privacy_disclosure_bullet_text_secondary);
        C107295b4.A06(this.A01, true);
        this.A03 = i;
        this.A05 = r7;
        this.A04 = r6;
        this.A06 = r8;
    }

    private final int getPaddingVerticalDivider() {
        return AnonymousClass0x2.A09(this.A07);
    }

    private final int getPaddingVerticalFixed() {
        return AnonymousClass0x2.A09(this.A08);
    }

    public final void setItemPaddingIfNeeded(boolean z) {
        int i;
        AnonymousClass66R r3 = this.A08;
        int A09 = AnonymousClass0x2.A09(r3);
        if (z) {
            i = AnonymousClass0x2.A09(this.A07);
        } else {
            i = 0;
        }
        setPadding(0, AnonymousClass0x2.A09(r3), 0, A09 + i);
    }

    public final void setSecondaryText(String str) {
        this.A05.A00(C18290x4.A0F(this), this.A00, this.A06, str);
    }

    public final void setText(String str) {
        this.A05.A00(C18290x4.A0F(this), this.A01, this.A06, str);
    }
}
