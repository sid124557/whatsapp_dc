package com.whatsapp.contact.picker;

import X.AnonymousClass93S;
import X.C102805Ki;
import X.C105895Wv;
import X.C620733j;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import com.whatsapp.R;
import com.whatsapp.collections.observablelistview.ObservableListView;

public class BidiContactListView extends ObservableListView {
    public C620733j A00;
    public C105895Wv A01;
    public boolean A02;

    private void A00() {
        int dimensionPixelSize;
        Resources resources;
        int i;
        if (C102805Ki.A00(this.A00)) {
            setVerticalScrollbarPosition(1);
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            resources = getResources();
            i = R.dimen.f6nameremoved;
        } else {
            setVerticalScrollbarPosition(2);
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            resources = getResources();
            i = R.dimen.f6nameremoved;
        }
        setPadding(dimensionPixelSize, 0, resources.getDimensionPixelSize(i), 0);
        setFastScrollAlwaysVisible(true);
        setScrollBarStyle(33554432);
        setFastScrollEnabled(true);
        setScrollbarFadingEnabled(true);
        this.A08 = new AnonymousClass93S(this);
    }

    public BidiContactListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
        A00();
    }

    public BidiContactListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
        A00();
    }

    public BidiContactListView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A01();
    }

    public BidiContactListView(Context context) {
        super(context);
        A01();
        A00();
    }
}
