package com.google.android.exoplayer2.ui;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass88S;
import X.C109415ea;
import X.C166387yb;
import X.C178248hE;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.List;

public class TrackSelectionView extends LinearLayout {
    public C166387yb A00;
    public C178248hE A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final SparseArray A05;
    public final LayoutInflater A06;
    public final CheckedTextView A07;
    public final CheckedTextView A08;
    public final C109415ea A09;

    public boolean getIsDisabled() {
        return this.A04;
    }

    public List getOverrides() {
        SparseArray sparseArray = this.A05;
        ArrayList A0I = AnonymousClass002.A0I(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            A0I.add(sparseArray.valueAt(i));
        }
        return A0I;
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.A02 != z) {
            this.A02 = z;
            A00();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if (this.A03 != z) {
            this.A03 = z;
            if (!z) {
                SparseArray sparseArray = this.A05;
                if (sparseArray.size() > 1) {
                    for (int size = sparseArray.size() - 1; size > 0; size--) {
                        sparseArray.remove(size);
                    }
                }
            }
            A00();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.A08.setVisibility(AnonymousClass001.A08(z ? 1 : 0));
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        this.A05 = new SparseArray();
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16843534});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(context);
        this.A06 = from;
        C109415ea r3 = new C109415ea(this, 0);
        this.A09 = r3;
        this.A01 = new AnonymousClass88S(getResources());
        this.A00 = C166387yb.A03;
        CheckedTextView checkedTextView = (CheckedTextView) from.inflate(17367055, this, false);
        this.A08 = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(R.string.f11nameremoved);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(r3);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(R.layout.f8nameremoved, this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(17367055, this, false);
        this.A07 = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(R.string.f11nameremoved);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(r3);
        addView(checkedTextView2);
    }

    public final void A00() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        this.A08.setEnabled(false);
        this.A07.setEnabled(false);
    }

    public void setTrackNameProvider(C178248hE r1) {
        r1.getClass();
        this.A01 = r1;
        A00();
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackSelectionView(Context context) {
        this(context, (AttributeSet) null);
    }
}
