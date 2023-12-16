package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt$descendants$1;

/* renamed from: X.0Rl  reason: invalid class name and case insensitive filesystem */
public final class C04990Rl {
    public static final View A00(ViewGroup viewGroup) {
        C162457s7.A0J(viewGroup, 0);
        View childAt = viewGroup.getChildAt(0);
        if (childAt != null) {
            return childAt;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Index: ");
        A0o.append(0);
        A0o.append(", Size: ");
        throw new IndexOutOfBoundsException(AnonymousClass000.A0h(A0o, viewGroup.getChildCount()));
    }

    public static final AnonymousClass4C5 A01(ViewGroup viewGroup) {
        C162457s7.A0J(viewGroup, 0);
        return AnonymousClass2AA.A00(new ViewGroupKt$descendants$1(viewGroup, (C84814Du) null));
    }
}
