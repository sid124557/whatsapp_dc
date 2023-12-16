package com.google.android.material.bottomappbar;

import X.AnonymousClass001;
import X.AnonymousClass0x9;
import X.C1891690g;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.lang.ref.WeakReference;

public class BottomAppBar$Behavior extends HideBottomViewOnScrollBehavior {
    public WeakReference A00;
    public final Rect A01 = AnonymousClass001.A0N();
    public final View.OnLayoutChangeListener A02 = new C1891690g((Object) this, 0);

    public /* bridge */ /* synthetic */ boolean A0I(View view, CoordinatorLayout coordinatorLayout, int i) {
        this.A00 = AnonymousClass0x9.A14((Object) null);
        throw AnonymousClass001.A0g("findDependentView");
    }

    public BottomAppBar$Behavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BottomAppBar$Behavior() {
    }
}
