package com.whatsapp.mediacomposer.bottombar.filterswipe;

import X.C18300x5;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;

public class FilterSwipeView extends LinearLayout {
    public final TextView A00 = C18300x5.A0G(this, R.id.filter_swipe_text);

    public int getFilterSwipeTextViewVisibility() {
        return this.A00.getVisibility();
    }

    public void setFilterSwipeTextVisibility(int i) {
        this.A00.setVisibility(i);
    }

    public void setText(int i) {
        this.A00.setText(i);
    }

    public FilterSwipeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(getContext(), R.layout.f8nameremoved, this);
        C18300x5.A13(context, this, R.string.f11nameremoved);
    }
}
