package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;

/* renamed from: X.0xr  reason: invalid class name and case insensitive filesystem */
public final class C18540xr extends ContextWrapper {
    public final Resources A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18540xr(Context context, Resources resources) {
        super(context);
        C162457s7.A0J(resources, 2);
        this.A00 = resources;
    }

    public Resources getResources() {
        return this.A00;
    }
}
