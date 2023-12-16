package androidx.core.view;

import X.AnonymousClass001;
import X.AnonymousClass4C5;
import X.AnonymousClass4GR;
import X.AnonymousClass8P9;
import X.C04990Rl;
import X.C162457s7;
import X.C57682u2;
import X.C59022wD;
import X.C71943cv;
import X.C73883gE;
import X.C74743hc;
import X.C84814Du;
import android.view.View;
import android.view.ViewGroup;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.core.view.ViewGroupKt$descendants$1", f = "ViewGroup.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {119, 121}, m = "invokeSuspend", n = {"$this$sequence", "$this$forEach$iv", "child", "index$iv", "$this$sequence", "$this$forEach$iv", "index$iv"}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "I$0"})
public final class ViewGroupKt$descendants$1 extends C74743hc implements AnonymousClass4GR {
    public final /* synthetic */ ViewGroup $this_descendants;
    public int I$0;
    public int I$1;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewGroupKt$descendants$1(ViewGroup viewGroup, C84814Du r2) {
        super(r2);
        this.$this_descendants = viewGroup;
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        ViewGroupKt$descendants$1 viewGroupKt$descendants$1 = new ViewGroupKt$descendants$1(this.$this_descendants, r4);
        viewGroupKt$descendants$1.L$0 = obj;
        return viewGroupKt$descendants$1;
    }

    public final Object A09(Object obj) {
        C71943cv r2;
        ViewGroup viewGroup;
        int childCount;
        int i;
        int i2;
        Object A05 = C73883gE.A05();
        int i3 = this.label;
        if (i3 != 0) {
            if (i3 == 1) {
                childCount = this.I$1;
                i2 = this.I$0;
                View view = (View) this.L$2;
                viewGroup = (ViewGroup) this.L$1;
                r2 = (C71943cv) this.L$0;
                C57682u2.A01(obj);
                if (view instanceof ViewGroup) {
                    AnonymousClass4C5 A01 = C04990Rl.A01((ViewGroup) view);
                    this.L$0 = r2;
                    this.L$1 = viewGroup;
                    this.L$2 = null;
                    this.I$0 = i2;
                    this.I$1 = childCount;
                    this.label = 2;
                    if (r2.A00(this, A01) == A05) {
                        return A05;
                    }
                }
            } else if (i3 == 2) {
                childCount = this.I$1;
                i2 = this.I$0;
                viewGroup = (ViewGroup) this.L$1;
                r2 = (C71943cv) this.L$0;
                C57682u2.A01(obj);
            } else {
                throw AnonymousClass001.A0d();
            }
            i = i2 + 1;
        } else {
            C57682u2.A01(obj);
            r2 = (C71943cv) this.L$0;
            viewGroup = this.$this_descendants;
            childCount = viewGroup.getChildCount();
            i = 0;
        }
        if (i >= childCount) {
            return C59022wD.A00;
        }
        View childAt = viewGroup.getChildAt(i);
        C162457s7.A0D(childAt);
        this.L$0 = r2;
        this.L$1 = viewGroup;
        this.L$2 = childAt;
        this.I$0 = i;
        this.I$1 = childCount;
        this.label = 1;
        r2.A02(childAt, this);
        return A05;
    }

    /* renamed from: A0B */
    public final Object invoke(C84814Du r3, C71943cv r4) {
        return ((AnonymousClass8P9) A0A(r4, r3)).A09(C59022wD.A00);
    }
}
