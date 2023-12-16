package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper$1;

/* renamed from: X.4La  reason: invalid class name and case insensitive filesystem */
public final class C86674La extends ContextWrapper {
    public LayoutInflater A00;
    public LayoutInflater A01;
    public C08310eF A02;
    public final C17280vG A03;

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        LayoutInflater layoutInflater = this.A01;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater layoutInflater2 = this.A00;
        if (layoutInflater2 == null) {
            layoutInflater2 = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
            this.A00 = layoutInflater2;
        }
        LayoutInflater cloneInContext = layoutInflater2.cloneInContext(this);
        this.A01 = cloneInContext;
        return cloneInContext;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C86674La(android.view.LayoutInflater r3, X.C08310eF r4) {
        /*
            r2 = this;
            r3.getClass()
            android.content.Context r0 = r3.getContext()
            r0.getClass()
            r2.<init>(r0)
            dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper$1 r1 = new dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper$1
            r1.<init>(r2)
            r2.A03 = r1
            r2.A00 = r3
            r2.A02 = r4
            X.08A r0 = r4.A0L
            r0.A00(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86674La.<init>(android.view.LayoutInflater, X.0eF):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86674La(Context context, C08310eF r4) {
        super(context);
        context.getClass();
        ViewComponentManager$FragmentContextWrapper$1 viewComponentManager$FragmentContextWrapper$1 = new ViewComponentManager$FragmentContextWrapper$1(this);
        this.A03 = viewComponentManager$FragmentContextWrapper$1;
        this.A00 = null;
        this.A02 = r4;
        r4.A0L.A00(viewComponentManager$FragmentContextWrapper$1);
    }
}
