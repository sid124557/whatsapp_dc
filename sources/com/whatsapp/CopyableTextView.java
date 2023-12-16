package com.whatsapp;

import X.C100905Cs;
import X.C620633i;
import X.C69263Wi;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;

public class CopyableTextView extends WaTextView implements View.OnClickListener {
    public C69263Wi A00;
    public C620633i A01;
    public String A02;
    public String A03;
    public boolean A04;

    public final void A0D(Context context, AttributeSet attributeSet) {
        setClickable(true);
        setTextIsSelectable(true);
        setOnClickListener(this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C100905Cs.A07);
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId != 0) {
                this.A03 = context.getString(resourceId);
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void onClick(View view) {
        ClipboardManager A0C;
        CharSequence charSequence;
        if (!TextUtils.isEmpty(this.A03) && (A0C = this.A01.A0C()) != null) {
            CharSequence text = getText();
            if (TextUtils.isEmpty(this.A02)) {
                charSequence = getText();
            } else {
                charSequence = this.A02;
            }
            try {
                A0C.setPrimaryClip(ClipData.newPlainText(text, charSequence));
                this.A00.A0P(this.A03, 0);
            } catch (NullPointerException | SecurityException unused) {
            }
        }
    }

    public CopyableTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A08();
        A0D(context, attributeSet);
    }

    public void setDataToCopy(String str) {
        this.A02 = str;
    }

    public void setToastString(String str) {
        this.A03 = str;
    }

    public CopyableTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A08();
        A0D(context, attributeSet);
    }

    public CopyableTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A08();
    }

    public CopyableTextView(Context context) {
        super(context);
        A08();
        A0D(context, (AttributeSet) null);
    }
}
