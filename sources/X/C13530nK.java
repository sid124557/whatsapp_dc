package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* renamed from: X.0nK  reason: invalid class name and case insensitive filesystem */
public final class C13530nK implements Iterator, C834348j {
    public int A00;
    public final /* synthetic */ ViewGroup A01;

    public C13530nK(ViewGroup viewGroup) {
        this.A01 = viewGroup;
    }

    public boolean hasNext() {
        return AnonymousClass001.A1Y(this.A00, this.A01.getChildCount());
    }

    public /* bridge */ /* synthetic */ Object next() {
        ViewGroup viewGroup = this.A01;
        int i = this.A00;
        this.A00 = i + 1;
        View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    public void remove() {
        ViewGroup viewGroup = this.A01;
        int i = this.A00 - 1;
        this.A00 = i;
        viewGroup.removeViewAt(i);
    }
}
