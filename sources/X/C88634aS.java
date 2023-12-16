package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.Window;

/* renamed from: X.4aS  reason: invalid class name and case insensitive filesystem */
public final class C88634aS extends AnonymousClass4SE {
    public Drawable A00;
    public final boolean A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88634aS(Context context, int i) {
        super(context, i);
        C162457s7.A0J(context, 1);
        this.A01 = C106545Zk.A04(((C64333Db) AnonymousClass29x.A00(C64333Db.class, context.getApplicationContext())).Avy(), (C58422vE) null, 4496);
    }

    public AnonymousClass4SE A0T(Drawable drawable) {
        if (this.A01) {
            this.A00 = drawable;
            return this;
        }
        super.A0T(drawable);
        return this;
    }

    public /* bridge */ /* synthetic */ AnonymousClass0Uj A0O(Drawable drawable) {
        A0T(drawable);
        return this;
    }

    public AnonymousClass043 create() {
        Window window;
        View decorView;
        AnonymousClass043 create = super.create();
        if (!(!this.A01 || (window = create.getWindow()) == null || (decorView = window.getDecorView()) == null)) {
            C106895aL.A03(new C120845zG(decorView, this), decorView);
        }
        return create;
    }
}
