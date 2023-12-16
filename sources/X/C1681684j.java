package X;

import android.content.Context;
import android.view.TouchDelegate;
import android.view.View;
import java.util.List;

/* renamed from: X.84j  reason: invalid class name and case insensitive filesystem */
public class C1681684j implements C185318tS {
    public final /* synthetic */ List A00;

    public C1681684j(List list) {
        this.A00 = list;
    }

    public /* bridge */ /* synthetic */ Object Axn(Context context, Object obj, Object obj2, Object obj3) {
        C124956Ep r4 = (C124956Ep) obj;
        r4.setTouchDelegate(new C124826Ea(r4, this.A00));
        return null;
    }

    public /* bridge */ /* synthetic */ void BrF(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        ((View) obj).setTouchDelegate((TouchDelegate) null);
    }

    public /* synthetic */ String B6x() {
        return C1443371d.A01(this);
    }

    public /* bridge */ /* synthetic */ boolean Bob(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }
}
