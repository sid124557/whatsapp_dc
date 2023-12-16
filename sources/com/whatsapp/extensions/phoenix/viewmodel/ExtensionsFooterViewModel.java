package com.whatsapp.extensions.phoenix.viewmodel;

import X.AnonymousClass08M;
import X.AnonymousClass1VX;
import X.AnonymousClass4FS;
import X.C05550Ty;
import X.C162457s7;
import X.C18260x0;
import X.C18290x4;
import X.C18320x8;
import X.C382526i;
import X.C55502qS;
import X.C56422rx;
import X.C58422vE;
import X.C613330g;
import X.C64773Ex;
import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

public final class ExtensionsFooterViewModel extends C05550Ty {
    public C64773Ex A00;
    public final AnonymousClass08M A01 = AnonymousClass08M.A01();
    public final C56422rx A02;
    public final C613330g A03;
    public final AnonymousClass1VX A04;
    public final AnonymousClass4FS A05;

    public final String A0D(Context context, UserJid userJid) {
        String str;
        C55502qS A002 = this.A02.A00(userJid);
        if (!(A002 == null || (str = A002.A08) == null)) {
            String A0b = C18320x8.A0b(context.getResources(), str, new Object[1], 0, R.string.f11nameremoved);
            C162457s7.A0D(A0b);
            AnonymousClass1VX r3 = this.A04;
            C58422vE r2 = C58422vE.A02;
            int A0O = r3.A0O(r2, 5275);
            if (r3.A0Y(r2, 5936) || !A0E(userJid) || A0b.length() <= A0O) {
                return A0b;
            }
            String valueOf = String.valueOf(C382526i.A00(A0b, A0O));
            if (valueOf != null) {
                return valueOf;
            }
        }
        return C18290x4.A0l(context, R.string.f11nameremoved);
    }

    public final boolean A0E(UserJid userJid) {
        String str;
        C55502qS A002 = this.A02.A00(userJid);
        if (A002 != null) {
            str = A002.A08;
        } else {
            str = null;
        }
        if (!this.A04.A0Y(C58422vE.A02, 4078) || str == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    public ExtensionsFooterViewModel(C64773Ex r2, C56422rx r3, C613330g r4, AnonymousClass1VX r5, AnonymousClass4FS r6) {
        C18260x0.A0f(r5, r3, r6, r4, r2);
        this.A04 = r5;
        this.A02 = r3;
        this.A05 = r6;
        this.A03 = r4;
        this.A00 = r2;
    }
}
