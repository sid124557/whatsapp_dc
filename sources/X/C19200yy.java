package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.text.ReadMoreTextView;

/* renamed from: X.0yy  reason: invalid class name and case insensitive filesystem */
public class C19200yy extends FrameLayout implements AnonymousClass4GJ {
    public C69263Wi A00;
    public C44272Vj A01;
    public C64773Ex A02;
    public C620633i A03;
    public AnonymousClass3ZH A04;
    public AnonymousClass5Y0 A05;
    public AnonymousClass1VX A06;
    public C50932j0 A07;
    public GroupJid A08;
    public C60152y5 A09;
    public C106715a2 A0A;
    public AnonymousClass4FS A0B;
    public C116855qy A0C;
    public CharSequence A0D;
    public boolean A0E;
    public final AnonymousClass4AQ A0F;
    public final ReadMoreTextView A0G;
    public final AnonymousClass5UY A0H;
    public final AnonymousClass5UY A0I;

    private int getEnhancedDescriptionCollapsedLineLimit() {
        return this.A06.A0O(C58422vE.A02, 3259);
    }

    private void setDescription(CharSequence charSequence) {
        CharSequence A072;
        if (!charSequence.equals(this.A0D)) {
            this.A0D = charSequence;
            boolean A0Y = this.A06.A0Y(C58422vE.A02, 3154);
            C620633i r5 = this.A03;
            C60152y5 r4 = this.A09;
            Context context = getContext();
            ReadMoreTextView readMoreTextView = this.A0G;
            CharSequence A032 = C107345b9.A03(context, readMoreTextView.getPaint(), this.A05, charSequence);
            if (A0Y) {
                A072 = C107635bd.A08(r5, r4, A032, readMoreTextView.getPaint().getTextSize());
            } else {
                A072 = C107635bd.A07(r5, r4, A032);
            }
            SpannableStringBuilder A002 = C18330xA.A00(A072);
            this.A0A.A07(readMoreTextView.getContext(), A002);
            readMoreTextView.A0I(A002);
        }
    }

    public final void A00() {
        C60912zN r0;
        AnonymousClass3ZH r02 = this.A04;
        if (r02 == null || (r0 = r02.A0K) == null || TextUtils.isEmpty(r0.A03)) {
            this.A0G.setVisibility(8);
            this.A0I.A06(8);
            this.A0H.A06(8);
            return;
        }
        String str = this.A04.A0K.A03;
        this.A0G.setVisibility(0);
        if (this.A01.A00()) {
            this.A0H.A06(0);
        } else {
            this.A0I.A06(0);
            this.A0H.A06(8);
        }
        setDescription(str);
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A0C;
        if (r0 == null) {
            r0 = new C116855qy(this);
            this.A0C = r0;
        }
        return r0.generatedComponent();
    }

    public C19200yy(Context context) {
        super(context);
        if (!this.A0E) {
            this.A0E = true;
            C64333Db r1 = ((C88864av) ((C111685iW) generatedComponent())).A0K;
            this.A06 = C64333Db.A4B(r1);
            this.A00 = C64333Db.A04(r1);
            this.A0A = C18280x3.A0Q(r1.A00);
            this.A0B = C64333Db.A8y(r1);
            this.A05 = C64333Db.A3o(r1);
            this.A02 = C64333Db.A26(r1);
            this.A03 = C64333Db.A2o(r1);
            this.A01 = (C44272Vj) r1.A5U.get();
            this.A07 = (C50932j0) r1.AGP.get();
            this.A09 = C64333Db.A74(r1);
        }
        View.inflate(getContext(), R.layout.f8nameremoved, this);
        this.A0I = AnonymousClass0x2.A0M(this, R.id.community_description_top_divider);
        this.A0H = AnonymousClass0x2.A0M(this, R.id.community_description_bottom_divider);
        ReadMoreTextView readMoreTextView = (ReadMoreTextView) C06560Yg.A02(this, R.id.community_description_text);
        this.A0G = readMoreTextView;
        AnonymousClass0x2.A12(readMoreTextView, this.A03);
        if (this.A06.A0Y(C58422vE.A02, 3154)) {
            readMoreTextView.setLinesLimit(getEnhancedDescriptionCollapsedLineLimit());
        }
        this.A0F = new C85864Hx(this, 3);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A07.A00(this.A0F);
        this.A0G.requestLayout();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A07.A01(this.A0F);
    }
}
