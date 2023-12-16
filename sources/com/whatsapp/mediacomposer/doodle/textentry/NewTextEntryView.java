package com.whatsapp.mediacomposer.doodle.textentry;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass4WT;
import X.C06560Yg;
import X.C114835ng;
import X.C135746lB;
import X.C148317Hx;
import X.C149797Nx;
import X.C171458Hd;
import X.C18270x1;
import X.C18310x6;
import X.C620733j;
import X.C86654Ky;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import java.util.ArrayList;

public class NewTextEntryView extends C135746lB {
    public RecyclerView A00;
    public WaImageView A01;
    public WaImageView A02;
    public WaTextView A03;
    public C620733j A04;
    public C114835ng A05;
    public TextToolColorPicker A06;

    private void setUpFontPicker(int i) {
        ArrayList A0s = AnonymousClass001.A0s();
        int[] iArr = {0, 3, 2, 4, 5, 6, 7, 1};
        int i2 = 0;
        int i3 = 0;
        do {
            int i4 = iArr[i2];
            A0s.add(new C148317Hx(i4, AnonymousClass000.A1U(i4, i)));
            if (i4 == i) {
                i3 = AnonymousClass0x9.A03(A0s, 1);
            }
            i2++;
        } while (i2 < 8);
        this.A00.setAdapter(new AnonymousClass4WT(this.A05, A0s));
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0);
        this.A00.setLayoutManager(linearLayoutManager);
        linearLayoutManager.A0Z(i3);
    }

    public float A01(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return this.A01.getTextSize();
        }
        this.A03.setText(charSequence);
        float textSize = this.A03.getTextSize();
        this.A01.setTextSize(0, textSize);
        return textSize;
    }

    public void A02(C114835ng r5, C149797Nx r6, int[] iArr) {
        super.A02(r5, r6, iArr);
        this.A05 = r5;
        this.A00 = C86654Ky.A0P(this, R.id.text_recycler_view);
        setUpFontPicker(r6.A02);
        WaImageView A0L = AnonymousClass0x9.A0L(this, R.id.align_button);
        this.A01 = A0L;
        C18310x6.A19(A0L, this, r5, 28);
        A03(r6.A01);
        WaImageView A0L2 = AnonymousClass0x9.A0L(this, R.id.change_bg_button);
        this.A02 = A0L2;
        C18310x6.A19(A0L2, this, r5, 29);
        int i = r6.A03.A02;
        int i2 = R.drawable.text_change_bg;
        if (i == 1) {
            i2 = R.drawable.text_change_bg_non_active;
        }
        C18270x1.A0d(getContext(), this.A02, this.A04, i2);
        TextToolColorPicker textToolColorPicker = (TextToolColorPicker) C06560Yg.A02(this, R.id.text_tool_color_picker);
        this.A06 = textToolColorPicker;
        textToolColorPicker.A04 = new C171458Hd(this, r6);
        this.A03 = AnonymousClass0x7.A0L(this, R.id.text_holder);
    }

    public final void A03(int i) {
        int i2 = R.drawable.text_align_center;
        if (i == 1) {
            i2 = R.drawable.text_align_left;
        } else if (i == 2) {
            i2 = R.drawable.text_align_right;
        }
        C18270x1.A0d(getContext(), this.A01, this.A04, i2);
    }

    public NewTextEntryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public NewTextEntryView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NewTextEntryView(Context context) {
        this(context, (AttributeSet) null);
    }
}
