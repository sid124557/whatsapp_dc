package com.whatsapp.emoji.search;

import X.AnonymousClass0x9;
import X.AnonymousClass4A5;
import X.AnonymousClass4GJ;
import X.AnonymousClass4HR;
import X.AnonymousClass4XM;
import X.AnonymousClass54E;
import X.AnonymousClass5Y0;
import X.AnonymousClass900;
import X.AnonymousClass90U;
import X.AnonymousClass93Y;
import X.C116855qy;
import X.C154417d8;
import X.C162457s7;
import X.C182428oO;
import X.C18270x1;
import X.C18310x6;
import X.C188838zZ;
import X.C27821ej;
import X.C60152y5;
import X.C620733j;
import X.C86634Kw;
import X.C86664Kz;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.InterceptingEditText;
import com.whatsapp.R;
import java.util.Objects;

public class EmojiSearchKeyboardContainer extends FrameLayout implements AnonymousClass4GJ {
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

    public void A02() {
        setOnTouchListener((View.OnTouchListener) null);
        this.A0A = null;
        this.A09 = null;
        this.A00 = null;
    }

    public void A01() {
        if (!this.A0F) {
            this.A0F = true;
            generatedComponent();
        }
    }

    public void A03(Activity activity, C620733j r9, C27821ej r10, AnonymousClass5Y0 r11, C182428oO r12, EmojiSearchProvider emojiSearchProvider, AnonymousClass4A5 r14, C60152y5 r15) {
        this.A00 = activity;
        this.A07 = r11;
        this.A05 = r9;
        this.A06 = r10;
        this.A09 = emojiSearchProvider;
        this.A0A = r14;
        this.A0B = r15;
        if (!this.A0E) {
            this.A0E = true;
            activity.getLayoutInflater().inflate(R.layout.f8nameremoved, this, true);
            this.A02 = findViewById(R.id.no_results);
            this.A03 = C86664Kz.A0w(this, R.id.search_result);
            this.A03.A0o(new C188838zZ(this, C86634Kw.A07(this), 1));
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
            linearLayoutManager.A1X(0);
            this.A03.setLayoutManager(linearLayoutManager);
            this.A01 = findViewById(R.id.progress_container);
            InterceptingEditText interceptingEditText = (InterceptingEditText) findViewById(R.id.search_bar);
            this.A04 = interceptingEditText;
            interceptingEditText.setHint(R.string.f11nameremoved);
            View findViewById = findViewById(R.id.clear_search_btn);
            C18310x6.A18(findViewById, this, 19);
            setOnTouchListener(new C154417d8(3));
            InterceptingEditText interceptingEditText2 = this.A04;
            Objects.requireNonNull(r12);
            interceptingEditText2.A00 = new AnonymousClass90U(r12, 1);
            this.A04.addTextChangedListener(new AnonymousClass4HR(findViewById, 1, this));
            AnonymousClass54E.A00(findViewById(R.id.back), r12, this, 5);
            C18270x1.A0d(getContext(), AnonymousClass0x9.A0F(this, R.id.back), r9, R.drawable.ic_emoji_search_back);
        }
        setVisibility(0);
        this.A02.setVisibility(0);
        this.A01.setVisibility(8);
        AnonymousClass900 r1 = new AnonymousClass900(this.A00, this.A05, this.A07, new AnonymousClass93Y(this, 3), this.A0B, this, getResources().getDimensionPixelSize(R.dimen.f6nameremoved), 1);
        this.A08 = r1;
        this.A03.setAdapter(r1);
        this.A0D = "";
        A04("");
        this.A04.setText("");
        this.A04.requestFocus();
        this.A04.A07(false);
    }

    public final void A04(String str) {
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

    public EmojiSearchKeyboardContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
    }

    public void A00() {
        if (getVisibility() == 0) {
            setVisibility(8);
            this.A04.A05();
            this.A09 = null;
        }
    }

    public EmojiSearchKeyboardContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
    }

    public EmojiSearchKeyboardContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A01();
    }

    public EmojiSearchKeyboardContainer(Context context) {
        super(context);
        A01();
    }

    public EmojiSearchKeyboardContainer(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A01();
    }
}
