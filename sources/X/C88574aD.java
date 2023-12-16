package X;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.appbar.MaterialToolbar;

/* renamed from: X.4aD  reason: invalid class name and case insensitive filesystem */
public abstract class C88574aD extends MaterialToolbar implements AnonymousClass4GJ {
    public C116855qy A00;
    public boolean A01;

    public final Object generatedComponent() {
        C116855qy r0 = this.A00;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C88574aD(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass578 r2 = (AnonymousClass578) this;
            r2.A09 = new C147567Eu(new AnonymousClass7LQ());
            C64333Db r1 = ((C88864av) ((C111685iW) generatedComponent())).A0K;
            r2.A02 = (AnonymousClass5GB) r1.A00.A0t.get();
            r2.A03 = C64333Db.A4B(r1);
            r2.A04 = C86614Ku.A0o(r1);
        }
    }
}
