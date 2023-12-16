package X;

import android.content.Context;
import com.whatsapp.android.di.BaseEntryPoint;

/* renamed from: X.1qT  reason: invalid class name and case insensitive filesystem */
public abstract class C32461qT extends C18380xF {
    public C1222963v A00;
    public C620733j A01;

    public void attachBaseContext(Context context) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("wabaseintent/hilt/");
        AnonymousClass000.A1A(this, A0o);
        AnonymousClass0x2.A18(A0o);
        BaseEntryPoint baseEntryPoint = (BaseEntryPoint) C389229y.A02(context, BaseEntryPoint.class);
        this.A01 = baseEntryPoint.BsW();
        C111365hy AIb = ((C64333Db) baseEntryPoint).AcK.A00.AIb();
        this.A00 = AIb;
        super.attachBaseContext(new C18550xs(context, AIb, this.A01));
    }

    public C32461qT(String str) {
        super(str);
    }
}
