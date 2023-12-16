package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass001;
import X.AnonymousClass4GJ;
import X.AnonymousClass5ST;
import X.AnonymousClass5UY;
import X.C08270df;
import X.C102615Jp;
import X.C106365Yr;
import X.C107335b8;
import X.C109475eg;
import X.C116855qy;
import X.C179218in;
import X.C18290x4;
import X.C55662qi;
import X.C55682qk;
import X.C614030o;
import X.C625235k;
import X.C64333Db;
import X.C86624Kv;
import X.C87044Mw;
import X.C88864av;
import X.C93314oJ;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

public class TemplateButtonListLayout extends LinearLayout implements AnonymousClass4GJ {
    public C55682qk A00;
    public AnonymousClass5ST A01;
    public C55662qi A02;
    public C106365Yr A03;
    public C614030o A04;
    public C625235k A05;
    public C116855qy A06;
    public boolean A07;
    public final List A08;
    public final List A09;

    public void A01(Context context) {
        setOrientation(1);
        View.inflate(context, R.layout.f8nameremoved, this);
        AnonymousClass5UY A0X = C18290x4.A0X(this, R.id.hidden_template_message_button_1);
        AnonymousClass5UY A0X2 = C18290x4.A0X(this, R.id.hidden_template_message_button_2);
        AnonymousClass5UY A0X3 = C18290x4.A0X(this, R.id.hidden_template_message_button_3);
        List list = this.A08;
        list.add(A0X);
        list.add(A0X2);
        list.add(A0X3);
        AnonymousClass5UY A0X4 = C18290x4.A0X(this, R.id.hidden_template_message_divider_1);
        AnonymousClass5UY A0X5 = C18290x4.A0X(this, R.id.hidden_template_message_divider_2);
        AnonymousClass5UY A0X6 = C18290x4.A0X(this, R.id.hidden_template_message_divider_3);
        List list2 = this.A09;
        list2.add(A0X4);
        list2.add(A0X5);
        list2.add(A0X6);
    }

    public final void setSeeAllButton(TextEmojiLabel textEmojiLabel, C08270df r8, List list, C93314oJ r10, C179218in r11) {
        setButtonIconAndText(textEmojiLabel);
        TemplateButtonListBottomSheet templateButtonListBottomSheet = new TemplateButtonListBottomSheet();
        templateButtonListBottomSheet.A03 = new C102615Jp(r10, r11, templateButtonListBottomSheet, this, list);
        C109475eg.A00(textEmojiLabel, templateButtonListBottomSheet, r8, 31);
    }

    public void A00() {
        if (!this.A07) {
            this.A07 = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            this.A02 = A002.Aiy();
            this.A03 = new C106365Yr(C86624Kv.A0Q(A002));
            this.A01 = C86624Kv.A0Q(A002);
            this.A00 = C64333Db.A01(A002);
            this.A05 = A002.ArP();
            this.A04 = (C614030o) A002.AOy.get();
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A06;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A06 = r0;
        }
        return r0.generatedComponent();
    }

    public TemplateButtonListLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A00();
    }

    private void setButtonIconAndText(TextEmojiLabel textEmojiLabel) {
        Drawable A042 = C107335b8.A04(getContext(), R.drawable.ic_format_list_bulleted, C18290x4.A00(getContext()));
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        textEmojiLabel.setText(C87044Mw.A02(textEmojiLabel.getPaint(), A042, getResources().getString(R.string.f11nameremoved), dimensionPixelSize, getResources().getInteger(R.integer.f7nameremoved)));
        AnonymousClass5ST r2 = this.A01;
        textEmojiLabel.setTextSize(r2.A03(getResources(), r2.A02));
    }

    public TemplateButtonListLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        this.A08 = AnonymousClass001.A0s();
        this.A09 = AnonymousClass001.A0s();
        A01(context);
    }

    public TemplateButtonListLayout(Context context) {
        super(context);
        A00();
        this.A08 = AnonymousClass001.A0s();
        this.A09 = AnonymousClass001.A0s();
        A01(context);
    }
}
