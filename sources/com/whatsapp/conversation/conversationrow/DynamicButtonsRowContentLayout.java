package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass0x2;
import X.AnonymousClass1VX;
import X.AnonymousClass353;
import X.AnonymousClass4GJ;
import X.AnonymousClass5Yj;
import X.C116855qy;
import X.C18330xA;
import X.C40802Hu;
import X.C42592Ot;
import X.C624134x;
import X.C64333Db;
import X.C86614Ku;
import X.C86644Kx;
import X.C88864av;
import X.C93314oJ;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

public class DynamicButtonsRowContentLayout extends LinearLayout implements AnonymousClass4GJ {
    public AnonymousClass1VX A00;
    public C116855qy A01;
    public boolean A02;
    public final TextEmojiLabel A03;
    public final TextEmojiLabel A04;

    private void setupContentView(TextEmojiLabel textEmojiLabel) {
        AnonymousClass0x2.A14(this.A00, textEmojiLabel);
        textEmojiLabel.setAutoLinkMask(0);
        textEmojiLabel.setLinksClickable(false);
        textEmojiLabel.setClickable(false);
        textEmojiLabel.setLongClickable(false);
    }

    public void A00(C93314oJ r16) {
        int i;
        TextEmojiLabel textEmojiLabel;
        int A032;
        C93314oJ r9 = r16;
        C624134x fMessage = r9.getFMessage();
        C42592Ot A012 = C40802Hu.A01(fMessage);
        if (A012 != null) {
            String str = A012.A00;
            String str2 = A012.A01;
            if (!TextUtils.isEmpty(str)) {
                Context context = getContext();
                Object[] objArr = new Object[1];
                Context context2 = getContext();
                byte b = fMessage.A1I;
                if (b != 0) {
                    i = R.string.f11nameremoved;
                    if (b != 1) {
                        i = R.string.f11nameremoved;
                        if (b != 3) {
                            i = R.string.f11nameremoved;
                            if (b != 5) {
                                i = R.string.f11nameremoved;
                                if (b != 9) {
                                    i = 0;
                                }
                            }
                        }
                    }
                } else {
                    i = R.string.f11nameremoved;
                }
                StringBuilder A0A = C18330xA.A0A(C86614Ku.A0s(context, context2.getString(i), objArr, R.string.f11nameremoved));
                String A13 = fMessage.A13();
                if (!TextUtils.isEmpty(A13) && b == 0) {
                    A0A.append(A13);
                }
                r9.setContentDescription(AnonymousClass000.A0X(AnonymousClass353.A00(fMessage), A0A));
                if (!TextUtils.isEmpty(str2)) {
                    TextEmojiLabel textEmojiLabel2 = this.A04;
                    r9.setMessageText(str, textEmojiLabel2, fMessage);
                    textEmojiLabel2.setVisibility(0);
                    textEmojiLabel = this.A03;
                    r9.A1d(textEmojiLabel, fMessage, str2, true, false);
                    textEmojiLabel.setTextSize(r9.A0y.A03(r9.getResources(), -1));
                    A032 = r9.getSecondaryTextColor();
                } else {
                    textEmojiLabel = this.A03;
                    r9.A1d(textEmojiLabel, fMessage, str, true, true);
                    this.A04.setVisibility(8);
                    A032 = AnonymousClass5Yj.A03(r9.getContext(), r9.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved);
                }
                textEmojiLabel.setTextColor(A032);
            }
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A01;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public DynamicButtonsRowContentLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = C64333Db.A4B(C88864av.A00(generatedComponent()));
        }
        setOrientation(1);
        View.inflate(context, R.layout.f8nameremoved, this);
        TextEmojiLabel A0M = C86644Kx.A0M(this, R.id.top_message);
        this.A04 = A0M;
        TextEmojiLabel A0M2 = C86644Kx.A0M(this, R.id.bottom_message);
        this.A03 = A0M2;
        setupContentView(A0M);
        setupContentView(A0M2);
    }

    public DynamicButtonsRowContentLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DynamicButtonsRowContentLayout(Context context) {
        this(context, (AttributeSet) null);
    }
}
