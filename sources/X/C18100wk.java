package X;

import androidx.car.app.model.InputCallbackDelegateImpl;
import androidx.car.app.model.SearchCallbackDelegateImpl;
import androidx.car.app.model.TabCallbackDelegateImpl;

/* renamed from: X.0wk  reason: invalid class name and case insensitive filesystem */
public class C18100wk implements C15650ri {
    public Object A00;
    public String A01;
    public final int A02;

    public C18100wk(int i, String str, Object obj) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = str;
    }

    public final Object B1v() {
        int i = this.A02;
        Object obj = this.A00;
        switch (i) {
            case 0:
                InputCallbackDelegateImpl.OnInputCallbackStub.m3$r8$lambda$fXh5ps0gWZC7E28te7xLK6HzGw((InputCallbackDelegateImpl.OnInputCallbackStub) obj, this.A01);
                throw AnonymousClass000.A0L();
            case 1:
                InputCallbackDelegateImpl.OnInputCallbackStub.$r8$lambda$eBHPiP8W8cRmVPgNJbI3aEtxKRI((InputCallbackDelegateImpl.OnInputCallbackStub) obj, this.A01);
                throw AnonymousClass000.A0L();
            case 2:
                SearchCallbackDelegateImpl.SearchCallbackStub.$r8$lambda$7_1W9_T5a2DIwVbigN8QKwBUMDg((SearchCallbackDelegateImpl.SearchCallbackStub) obj, this.A01);
                throw AnonymousClass000.A0L();
            case 3:
                SearchCallbackDelegateImpl.SearchCallbackStub.m4$r8$lambda$lWaSliOrYxg3ODag2RALLEM1OQ((SearchCallbackDelegateImpl.SearchCallbackStub) obj, this.A01);
                throw AnonymousClass000.A0L();
            default:
                TabCallbackDelegateImpl.TabCallbackStub.$r8$lambda$_zdJ9Sz7LyWrU55g8W2ta3htz5w((TabCallbackDelegateImpl.TabCallbackStub) obj, this.A01);
                throw AnonymousClass000.A0L();
        }
    }
}
