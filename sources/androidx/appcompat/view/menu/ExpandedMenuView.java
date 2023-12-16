package androidx.appcompat.view.menu;

import X.AnonymousClass0UD;
import X.C07890cz;
import X.C07910d1;
import X.C15560rZ;
import X.C15570ra;
import X.C17050uU;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public final class ExpandedMenuView extends ListView implements C15560rZ, AdapterView.OnItemClickListener, C15570ra {
    public static final int[] A01 = {16842964, 16843049};
    public C07890cz A00;

    public boolean BGr(C07910d1 r4) {
        return this.A00.A0L(r4, (C17050uU) null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        AnonymousClass0UD A002 = AnonymousClass0UD.A00(context, attributeSet, A01, i, 0);
        TypedArray typedArray = A002.A02;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(A002.A02(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(A002.A02(1));
        }
        typedArray.recycle();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        BGr((C07910d1) getAdapter().getItem(i));
    }

    public void BGA(C07890cz r1) {
        this.A00 = r1;
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }
}
