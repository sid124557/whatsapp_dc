package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass5ST;
import X.AnonymousClass5UY;
import X.C102615Jp;
import X.C106365Yr;
import X.C106905aM;
import X.C107335b8;
import X.C109345eT;
import X.C109735f6;
import X.C162457s7;
import X.C179218in;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18310x6;
import X.C55662qi;
import X.C58932w3;
import X.C86634Kw;
import X.C86654Ky;
import X.C86664Kz;
import X.C93314oJ;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class TemplateButtonListBottomSheet extends Hilt_TemplateButtonListBottomSheet {
    public TextEmojiLabel A00;
    public WaImageButton A01;
    public AnonymousClass5ST A02;
    public C102615Jp A03;
    public List A04;
    public List A05;

    public void A0w(Bundle bundle, View view) {
        C109735f6 r15;
        View view2 = view;
        C162457s7.A0J(view2, 0);
        super.A0w(bundle, view2);
        WaImageButton A10 = C86664Kz.A10(view2, R.id.button_list_bottom_sheet_close_button);
        this.A01 = A10;
        if (A10 != null) {
            C109345eT.A00(A10, this, 43);
        }
        TextEmojiLabel A0K = AnonymousClass0x7.A0K(view2, R.id.template_message_bottom_sheet_title);
        this.A00 = A0K;
        C162457s7.A0H(A0K);
        AnonymousClass5ST r1 = this.A02;
        if (r1 != null) {
            AnonymousClass5ST.A00(A0G(), A0K, r1);
            Integer[] numArr = new Integer[10];
            AnonymousClass000.A1L(numArr, R.id.hidden_bottom_sheet_template_message_button_1);
            AnonymousClass000.A1M(numArr, R.id.hidden_bottom_sheet_template_message_button_2);
            AnonymousClass000.A1N(numArr, R.id.hidden_bottom_sheet_template_message_button_3);
            AnonymousClass000.A1O(numArr, R.id.hidden_bottom_sheet_template_message_button_4);
            C18280x3.A1P(numArr, R.id.hidden_bottom_sheet_template_message_button_5);
            C18310x6.A1U(numArr, R.id.hidden_bottom_sheet_template_message_button_6);
            C18290x4.A1U(numArr, R.id.hidden_bottom_sheet_template_message_button_7);
            C18310x6.A1V(numArr, R.id.hidden_bottom_sheet_template_message_button_8);
            numArr[8] = Integer.valueOf(R.id.hidden_bottom_sheet_template_message_button_9);
            List A19 = AnonymousClass0x9.A19(Integer.valueOf(R.id.hidden_bottom_sheet_template_message_button_10), numArr, 9);
            ArrayList A0s = AnonymousClass001.A0s();
            Iterator it = A19.iterator();
            while (it.hasNext()) {
                A0s.add(AnonymousClass0x2.A0M(view2, C18280x3.A05(it)));
            }
            this.A04 = AnonymousClass002.A0J(A0s);
            Integer[] numArr2 = new Integer[9];
            AnonymousClass000.A1L(numArr2, R.id.hidden_bottom_sheet_template_message_divider_1);
            AnonymousClass000.A1M(numArr2, R.id.hidden_bottom_sheet_template_message_divider_2);
            AnonymousClass000.A1N(numArr2, R.id.hidden_bottom_sheet_template_message_divider_3);
            AnonymousClass000.A1O(numArr2, R.id.hidden_bottom_sheet_template_message_divider_4);
            C18280x3.A1P(numArr2, R.id.hidden_bottom_sheet_template_message_divider_5);
            C18310x6.A1U(numArr2, R.id.hidden_bottom_sheet_template_message_divider_6);
            C18290x4.A1U(numArr2, R.id.hidden_bottom_sheet_template_message_divider_7);
            C18310x6.A1V(numArr2, R.id.hidden_bottom_sheet_template_message_divider_8);
            List A192 = AnonymousClass0x9.A19(Integer.valueOf(R.id.hidden_bottom_sheet_template_message_divider_9), numArr2, 8);
            ArrayList A0s2 = AnonymousClass001.A0s();
            Iterator it2 = A192.iterator();
            while (it2.hasNext()) {
                A0s2.add(AnonymousClass0x2.A0M(view2, C18280x3.A05(it2)));
            }
            ArrayList A0J = AnonymousClass002.A0J(A0s2);
            this.A05 = A0J;
            C102615Jp r12 = this.A03;
            if (r12 != null) {
                List<AnonymousClass5UY> list = this.A04;
                TemplateButtonListLayout templateButtonListLayout = r12.A03;
                List<C58932w3> list2 = r12.A04;
                TemplateButtonListBottomSheet templateButtonListBottomSheet = r12.A02;
                C93314oJ r24 = r12.A00;
                C179218in r11 = r12.A01;
                if (list != null) {
                    for (AnonymousClass5UY r13 : list) {
                        if (r13.A01 != null) {
                            TextView textView = (TextView) r13.A04();
                            C86634Kw.A1I(textView);
                            textView.setSelected(false);
                            textView.setVisibility(8);
                        }
                    }
                }
                Iterator it3 = A0J.iterator();
                while (it3.hasNext()) {
                    AnonymousClass5UY r14 = (AnonymousClass5UY) it3.next();
                    if (r14.A01 != null) {
                        r14.A04().setVisibility(8);
                    }
                }
                if (list != null) {
                    int A06 = C86654Ky.A06(list2, list.size());
                    for (int i = 0; i < A06; i++) {
                        AnonymousClass5UY r3 = (AnonymousClass5UY) list.get(i);
                        C106905aM.A04((TextView) r3.A04());
                        C58932w3 r2 = (C58932w3) list2.get(i);
                        if (r2 != null) {
                            TextEmojiLabel textEmojiLabel = (TextEmojiLabel) r3.A04();
                            int i2 = r2.A06;
                            if (i2 == 1) {
                                C106365Yr r142 = templateButtonListLayout.A03;
                                Context context = templateButtonListLayout.getContext();
                                C162457s7.A0J(context, 0);
                                C18270x1.A11(textEmojiLabel, 1, r11);
                                AnonymousClass5ST.A00(context, textEmojiLabel, r142.A00);
                                int i3 = R.color.f5nameremoved;
                                if (r2.A04) {
                                    i3 = R.color.f5nameremoved;
                                }
                                Drawable A032 = C107335b8.A03(context, R.drawable.ic_action_reply, i3);
                                A032.setAlpha(204);
                                C106365Yr.A00(context, A032, textEmojiLabel, r2);
                                boolean z = r2.A04;
                                textEmojiLabel.setSelected(z);
                                if (!z) {
                                    r15 = new C109735f6(r142, context, textEmojiLabel, A032, r2, r11, templateButtonListBottomSheet, 1);
                                } else {
                                    r15 = null;
                                }
                                textEmojiLabel.setOnClickListener(r15);
                            } else if (i2 == 2 || i2 == 3) {
                                C55662qi r132 = templateButtonListLayout.A02;
                                Context context2 = templateButtonListLayout.getContext();
                                boolean isEnabled = templateButtonListLayout.isEnabled();
                                AnonymousClass5ST.A00(context2, textEmojiLabel, r132.A02);
                                r132.A00(context2, textEmojiLabel, r24, templateButtonListBottomSheet, r2, isEnabled, true, false);
                            }
                        }
                        r3.A06(0);
                    }
                }
                int i4 = 0;
                boolean z2 = false;
                for (C58932w3 r0 : list2) {
                    boolean A1U = AnonymousClass000.A1U(r0.A06, 1);
                    if (i4 == 0) {
                        z2 = A1U;
                    } else if (z2 != A1U) {
                        ((AnonymousClass5UY) A0J.get(i4 - 1)).A06(0);
                        return;
                    }
                    i4++;
                }
                return;
            }
            return;
        }
        throw C18270x1.A0S("conversationFont");
    }

    public void A0c() {
        super.A0c();
        this.A01 = null;
        this.A00 = null;
        this.A04 = null;
        this.A05 = null;
    }

    public int A1S() {
        return R.layout.f8nameremoved;
    }
}
