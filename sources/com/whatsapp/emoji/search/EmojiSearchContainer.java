package com.whatsapp.emoji.search;

import X.AnonymousClass4A5;
import X.AnonymousClass4GJ;
import X.AnonymousClass4XM;
import X.AnonymousClass5Y0;
import X.C116855qy;
import X.C162457s7;
import X.C27821ej;
import X.C60152y5;
import X.C620733j;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.InterceptingEditText;

public class EmojiSearchContainer extends FrameLayout implements AnonymousClass4GJ {
    public Activity A00;
    public View A01;
    public View A02;
    public RecyclerView A03;
    public InterceptingEditText A04;
    public C620733j A05;
    public C27821ej A06;
    public AnonymousClass5Y0 A07;
    public AnonymousClass4XM A08;
    public EmojiSearchProvider A09;
    public AnonymousClass4A5 A0A;
    public C60152y5 A0B;
    public C116855qy A0C;
    public String A0D;
    public boolean A0E;
    public boolean A0F;

    public void A00() {
        if (!this.A0F) {
            this.A0F = true;
            generatedComponent();
        }
    }

    public final void A01(String str) {
        EmojiSearchProvider emojiSearchProvider = this.A09;
        if (emojiSearchProvider != null && emojiSearchProvider.A02) {
            this.A02.setVisibility(8);
            this.A01.setVisibility(0);
            AnonymousClass4XM r2 = this.A08;
            EmojiSearchProvider emojiSearchProvider2 = this.A09;
            C162457s7.A0J(str, 0);
            r2.A0K(emojiSearchProvider2.A00(str, true, true));
            this.A0D = str;
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A0C;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A0C = r0;
        }
        return r0.generatedComponent();
    }

    public EmojiSearchContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    public EmojiSearchContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public EmojiSearchContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00();
    }

    public EmojiSearchContainer(Context context) {
        super(context);
        A00();
    }

    public EmojiSearchContainer(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }
}
