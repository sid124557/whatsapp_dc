package com.whatsapp.mediacomposer.bottombar.recipients;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0RP;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass4GJ;
import X.AnonymousClass5JQ;
import X.AnonymousClass5Yj;
import X.AnonymousClass7CV;
import X.C06560Yg;
import X.C100905Cs;
import X.C102825Kk;
import X.C107295b4;
import X.C107555bV;
import X.C109665ez;
import X.C111685iW;
import X.C116755qo;
import X.C116775qq;
import X.C116855qy;
import X.C118045su;
import X.C182608oh;
import X.C18270x1;
import X.C18280x3;
import X.C620733j;
import X.C64333Db;
import X.C72343dZ;
import X.C86604Kt;
import X.C86654Ky;
import X.C88864av;
import X.C989653x;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.Iterator;
import java.util.List;

public class RecipientsView extends LinearLayout implements AnonymousClass4GJ {
    public int A00;
    public AnonymousClass7CV A01;
    public C620733j A02;
    public C182608oh A03;
    public C116855qy A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final HorizontalScrollView A08;
    public final ImageView A09;
    public final ChipGroup A0A;
    public final TextEmojiLabel A0B;
    public final AnonymousClass5JQ A0C;
    public final C109665ez A0D;

    public final Object generatedComponent() {
        C116855qy r0 = this.A04;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public void setRecipientsChips(List list, CharSequence charSequence) {
        ChipGroup chipGroup = this.A0A;
        if (chipGroup != null) {
            chipGroup.removeAllViews();
            if (charSequence != null) {
                Chip A002 = A00(charSequence);
                A002.setChipIcon(AnonymousClass0RP.A00(getContext(), R.drawable.ic_status_recipient));
                A002.setChipIconSizeResource(R.dimen.f6nameremoved);
                A002.setIconStartPaddingResource(R.dimen.f6nameremoved);
                A002.setTextStartPaddingResource(R.dimen.f6nameremoved);
                A002.setTag("status_chip");
                A002.setOnClickListener(this.A0D);
                chipGroup.addView(A002);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String A0m = AnonymousClass001.A0m(it);
                Chip A003 = A00(charSequence);
                A003.setText(A0m);
                A003.setOnClickListener(this.A0D);
                chipGroup.addView(A003);
            }
            if (this.A07) {
                C107555bV.A0A(this.A08, this.A02);
            }
        }
    }

    public void setRecipientsListener(C182608oh r5) {
        this.A03 = r5;
        ChipGroup chipGroup = this.A0A;
        if (chipGroup != null) {
            for (int i = 0; i < chipGroup.getChildCount(); i++) {
                chipGroup.getChildAt(i).setOnClickListener(this.A0D);
            }
        }
    }

    public void setRecipientsText(String str) {
        this.A0B.A0K((List) null, str);
    }

    public RecipientsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A06) {
            this.A06 = true;
            C88864av r1 = (C88864av) ((C111685iW) generatedComponent());
            this.A02 = C86604Kt.A0W(r1.A0K);
            this.A01 = (AnonymousClass7CV) r1.A0D.get();
        }
    }

    public final Chip A00(CharSequence charSequence) {
        Chip chip = (Chip) C86604Kt.A0F(C18280x3.A0D(this), R.layout.f8nameremoved);
        chip.setChipCornerRadiusResource(R.dimen.f6nameremoved);
        chip.setText(charSequence);
        AnonymousClass5Yj.A08(getContext(), getContext(), chip, R.attr.f3nameremoved, R.color.f5nameremoved);
        chip.setChipBackgroundColorResource(this.A00);
        chip.setMinHeight(getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
        chip.setEnabled(this.A05);
        return chip;
    }

    public void setRecipientsContentDescription(int i) {
        Resources resources = getResources();
        Object[] A0L = AnonymousClass002.A0L();
        C18270x1.A1Q(A0L, i);
        this.A08.setContentDescription(resources.getQuantityString(R.plurals.f9nameremoved, i, A0L));
    }

    public RecipientsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A06) {
            this.A06 = true;
            C88864av r1 = (C88864av) ((C111685iW) generatedComponent());
            this.A02 = C86604Kt.A0W(r1.A0K);
            this.A01 = (AnonymousClass7CV) r1.A0D.get();
        }
        this.A0D = new C989653x(this, 7);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C100905Cs.A0I);
        boolean z = obtainStyledAttributes.getBoolean(0, true);
        View.inflate(getContext(), z ? R.layout.f8nameremoved : R.layout.f8nameremoved, this);
        AnonymousClass7CV r12 = this.A01;
        C102825Kk r6 = new C102825Kk(context, this.A02, this);
        C118045su r13 = r12.A00;
        C64333Db r7 = r13.A03;
        C88864av r2 = r13.A04;
        this.A0C = new AnonymousClass5JQ(C86654Ky.A0U(r7), r6, new C116755qo(C72343dZ.A00(r2.A0K.ASV), C72343dZ.A00(r2.A02)), (C116775qq) r7.Abn.get());
        this.A0B = AnonymousClass0x7.A0K(this, R.id.recipients_text);
        ImageView A0F = AnonymousClass0x9.A0F(this, R.id.recipients_prompt_icon);
        this.A09 = A0F;
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) C06560Yg.A02(this, R.id.recipients_scroller);
        this.A08 = horizontalScrollView;
        this.A0A = z ? (ChipGroup) C06560Yg.A02(this, R.id.recipient_chips) : null;
        if (A0F != null) {
            C18270x1.A0d(context, A0F, this.A02, R.drawable.chevron);
        }
        if (z) {
            C107295b4.A03(horizontalScrollView, R.string.f11nameremoved);
        }
        obtainStyledAttributes.recycle();
        this.A05 = true;
        this.A07 = true;
        this.A00 = AnonymousClass5Yj.A02(getContext(), R.attr.f3nameremoved, R.color.f5nameremoved);
    }
}
