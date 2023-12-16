package com.whatsapp.chatinfo.view.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public class BusinessChatInfoLayout extends ChatInfoLayoutV2 {
    public boolean A00;

    public int A04(int i) {
        ImageView imageView = this.A03;
        if (imageView == null || imageView.getDrawable() == null) {
            return super.A04(i);
        }
        return (int) (((float) i) * 0.5625f);
    }

    public BusinessChatInfoLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
    }

    public BusinessChatInfoLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
    }

    public BusinessChatInfoLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A01();
    }

    public BusinessChatInfoLayout(Context context) {
        super(context);
        A01();
    }
}
