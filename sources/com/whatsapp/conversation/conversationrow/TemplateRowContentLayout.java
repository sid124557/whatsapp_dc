package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass1VX;
import X.AnonymousClass4FG;
import X.AnonymousClass4GJ;
import X.AnonymousClass5ST;
import X.AnonymousClass5UY;
import X.AnonymousClass5Yj;
import X.C08270df;
import X.C106365Yr;
import X.C106905aM;
import X.C107335b8;
import X.C109585er;
import X.C116855qy;
import X.C162457s7;
import X.C179218in;
import X.C18290x4;
import X.C47142cm;
import X.C55662qi;
import X.C58932w3;
import X.C614030o;
import X.C64333Db;
import X.C86614Ku;
import X.C86634Kw;
import X.C86644Kx;
import X.C86654Ky;
import X.C86964Mo;
import X.C88864av;
import X.C93314oJ;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TemplateRowContentLayout extends LinearLayout implements AnonymousClass4GJ {
    public View A00;
    public C08270df A01;
    public TextEmojiLabel A02;
    public TextEmojiLabel A03;
    public C55662qi A04;
    public C93314oJ A05;
    public C179218in A06;
    public AnonymousClass1VX A07;
    public C614030o A08;
    public AnonymousClass5UY A09;
    public C116855qy A0A;
    public boolean A0B;
    public final List A0C;

    public final void A01(Context context) {
        setOrientation(1);
        View.inflate(context, R.layout.f8nameremoved, this);
        this.A03 = C86644Kx.A0M(this, R.id.top_message);
        this.A02 = C86644Kx.A0M(this, R.id.bottom_message);
        this.A09 = C18290x4.A0X(this, R.id.template_button_list);
        this.A00 = findViewById(R.id.button_divider);
        List<TextView> list = this.A0C;
        list.add(findViewById(R.id.action_btn_1));
        list.add(findViewById(R.id.action_btn_2));
        list.add(findViewById(R.id.action_btn_3));
        for (TextView A042 : list) {
            C106905aM.A04(A042);
        }
    }

    public void A00() {
        if (!this.A0B) {
            this.A0B = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            this.A07 = C64333Db.A4B(A002);
            this.A04 = A002.Aiy();
            this.A08 = (C614030o) A002.AOy.get();
        }
    }

    public void A02(C08270df r27, C93314oJ r28, C179218in r29) {
        TextEmojiLabel textEmojiLabel;
        int A032;
        int i;
        C58932w3 r9;
        C109585er r0;
        C93314oJ r7 = r28;
        this.A05 = r7;
        C179218in r10 = r29;
        this.A06 = r10;
        C08270df r15 = r27;
        this.A01 = r15;
        AnonymousClass4FG r8 = (AnonymousClass4FG) r7.getFMessage();
        C47142cm BDY = r8.BDY();
        String str = BDY.A03;
        String str2 = BDY.A02;
        int i2 = 8;
        if (!TextUtils.isEmpty(str)) {
            r7.setMessageText(str2, this.A03, r7.getFMessage());
            C86964Mo.A00(this.A07, this.A03);
            this.A02.setLinkHandler((C86964Mo) null);
            this.A03.setVisibility(0);
            r7.A1d(this.A02, r7.getFMessage(), str, false, true);
            this.A02.setTextSize(r7.A0y.A03(r7.getResources(), -1));
            textEmojiLabel = this.A02;
            A032 = r7.getSecondaryTextColor();
        } else {
            r7.setMessageText(str2, this.A02, r7.getFMessage());
            C86964Mo.A00(this.A07, this.A02);
            this.A03.setVisibility(8);
            this.A02.setTextSize(r7.getTextFontSize());
            textEmojiLabel = this.A02;
            A032 = AnonymousClass5Yj.A03(r7.getContext(), r7.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved);
        }
        textEmojiLabel.setTextColor(A032);
        if (this.A07.A0X(3444)) {
            this.A00.setVisibility(8);
            Iterator it = this.A0C.iterator();
            while (it.hasNext()) {
                C86654Ky.A0H(it).setVisibility(8);
            }
            this.A09.A06(0);
            TemplateButtonListLayout templateButtonListLayout = (TemplateButtonListLayout) this.A09.A04();
            AnonymousClass4FG r2 = (AnonymousClass4FG) r7.getFMessage();
            List list = r2.BDY().A06;
            if (list != null) {
                templateButtonListLayout.A05.A04("Render Time", list);
                list = AnonymousClass002.A0J(r2.BDY().A06);
                list.removeAll(Collections.singletonList((Object) null));
            }
            List<AnonymousClass5UY> list2 = templateButtonListLayout.A09;
            for (AnonymousClass5UY r1 : list2) {
                if (r1.A01 != null) {
                    r1.A04().setVisibility(8);
                }
            }
            int i3 = 0;
            for (AnonymousClass5UY r4 : templateButtonListLayout.A08) {
                if (r4.A01 != null) {
                    TextView textView = (TextView) r4.A04();
                    C86634Kw.A1I(textView);
                    textView.setSelected(false);
                    textView.setVisibility(8);
                }
                if (!(list == null || i3 >= list.size() || list.get(i3) == null)) {
                    C58932w3 r3 = (C58932w3) list.get(i3);
                    if (!templateButtonListLayout.A04.A09(r3)) {
                        C106905aM.A04((TextView) r4.A04());
                        if (i3 != 2 || list.size() <= 3) {
                            TextEmojiLabel textEmojiLabel2 = (TextEmojiLabel) r4.A04();
                            int i4 = r3.A06;
                            if (i4 == 1) {
                                C106365Yr r14 = templateButtonListLayout.A03;
                                Context context = templateButtonListLayout.getContext();
                                C162457s7.A0J(context, 0);
                                C86614Ku.A1S(textEmojiLabel2, 1, r10);
                                AnonymousClass5ST.A00(context, textEmojiLabel2, r14.A00);
                                int A002 = C18290x4.A00(context);
                                if (r3.A04) {
                                    A002 = R.color.f5nameremoved;
                                }
                                Drawable A033 = C107335b8.A03(context, R.drawable.ic_action_reply, A002);
                                A033.setAlpha(204);
                                C106365Yr.A00(context, A033, textEmojiLabel2, r3);
                                boolean z = r3.A04;
                                textEmojiLabel2.setSelected(z);
                                if (!z) {
                                    r0 = new C109585er(r14, context, textEmojiLabel2, A033, r3, r10, 2);
                                } else {
                                    r0 = null;
                                }
                                textEmojiLabel2.setOnClickListener(r0);
                            } else if (i4 == 2 || i4 == 3) {
                                C55662qi r13 = templateButtonListLayout.A02;
                                Context context2 = templateButtonListLayout.getContext();
                                boolean isEnabled = templateButtonListLayout.isEnabled();
                                AnonymousClass5ST.A00(context2, textEmojiLabel2, r13.A02);
                                r13.A00(context2, textEmojiLabel2, r7, (TemplateButtonListBottomSheet) null, r3, isEnabled, false, false);
                            }
                        } else {
                            templateButtonListLayout.setSeeAllButton((TextEmojiLabel) r4.A04(), r15, list, r7, r10);
                        }
                        r4.A04().setVisibility(0);
                        ((AnonymousClass5UY) list2.get(i3)).A06(0);
                    }
                }
                i3++;
            }
            return;
        }
        List list3 = r8.BDY().A06;
        boolean z2 = false;
        int i5 = 0;
        for (TextEmojiLabel textEmojiLabel3 : this.A0C) {
            if (list3 == null || i5 >= list3.size() || (r9 = (C58932w3) list3.get(i5)) == null || r9.A06 == 1 || this.A08.A09(r9)) {
                i = 8;
            } else {
                this.A04.A00(getContext(), textEmojiLabel3, r7, (TemplateButtonListBottomSheet) null, r9, isEnabled(), false, true);
                z2 = true;
                i = 0;
            }
            textEmojiLabel3.setVisibility(i);
            i5++;
        }
        View view = this.A00;
        if (z2) {
            i2 = 0;
        }
        view.setVisibility(i2);
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A0A;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A0A = r0;
        }
        return r0.generatedComponent();
    }

    public TextEmojiLabel getContentTextView() {
        if (this.A03.getVisibility() == 0) {
            return this.A03;
        }
        return this.A02;
    }

    public TextEmojiLabel getFooterTextView() {
        return this.A02;
    }

    public TemplateRowContentLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
        this.A0C = AnonymousClass001.A0s();
        A01(context);
    }

    public void setEnabled(boolean z) {
        C179218in r1;
        C08270df r0;
        super.setEnabled(z);
        C93314oJ r2 = this.A05;
        if (r2 != null && (r1 = this.A06) != null && (r0 = this.A01) != null) {
            A02(r0, r2, r1);
        }
    }

    public static void setupContentView(AnonymousClass1VX r0, TextEmojiLabel textEmojiLabel) {
        C86964Mo.A00(r0, textEmojiLabel);
    }

    public TemplateRowContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        this.A0C = AnonymousClass001.A0s();
        A01(context);
    }

    public TemplateRowContentLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A00();
    }

    public TemplateRowContentLayout(Context context) {
        super(context);
        A00();
        this.A0C = AnonymousClass001.A0s();
        A01(context);
    }
}
