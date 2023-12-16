package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.whatsapp.pushtorecordmedia.PushToRecordIconAnimation;

/* renamed from: X.7Wt  reason: invalid class name and case insensitive filesystem */
public final class C151907Wt {
    public int A00;
    public PushToRecordIconAnimation A01;
    public C153237au A02;
    public AnonymousClass5UY A03;
    public final C620733j A04;

    public C151907Wt(C15910sA r6, AnonymousClass4VH r7, C87684Uw r8, C620733j r9, AnonymousClass5UY r10) {
        C06270Wx r2;
        C162457s7.A0J(r9, 1);
        C18270x1.A11(r6, 2, r7);
        this.A04 = r9;
        this.A03 = r10;
        C06270Wx r3 = r7.A00;
        if (r8 != null) {
            r2 = r8.A00;
        } else {
            r2 = new AnonymousClass08M(new C152107Xo(false));
        }
        C86604Kt.A1N(r6, C154467dD.A01(r3, r2, new C161537ps(0), true), new AnonymousClass746(this, 32), 322);
    }

    public final View A01() {
        C153237au r0 = this.A02;
        if ((r0 == null || !r0.A01()) && this.A03.A01 == null) {
            return null;
        }
        return this.A03.A04();
    }

    public final float A00(int i) {
        Context context;
        Resources resources;
        View A012 = A01();
        if (A012 == null || (context = A012.getContext()) == null || (resources = context.getResources()) == null) {
            return 0.0f;
        }
        return C86664Kz.A01(resources, i);
    }
}
