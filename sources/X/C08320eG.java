package X;

import androidx.lifecycle.CoroutineLiveData;
import androidx.lifecycle.LiveDataScopeImpl$emit$2;

/* renamed from: X.0eG  reason: invalid class name and case insensitive filesystem */
public final class C08320eG implements C15920sB {
    public CoroutineLiveData A00;
    public final C85494Gl A01;

    public C08320eG(CoroutineLiveData coroutineLiveData, C85494Gl r3) {
        C162457s7.A0J(r3, 2);
        this.A00 = coroutineLiveData;
        this.A01 = r3.plus(AnonymousClass34M.A01().A04());
    }

    public Object B2K(Object obj, C84814Du r5) {
        Object A002 = C57722u6.A00(r5, this.A01, new LiveDataScopeImpl$emit$2(this, obj, (C84814Du) null));
        if (A002 != C73883gE.A05()) {
            return C59022wD.A00;
        }
        return A002;
    }
}
