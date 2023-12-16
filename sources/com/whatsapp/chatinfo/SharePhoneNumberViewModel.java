package com.whatsapp.chatinfo;

import X.AnonymousClass08M;
import X.AnonymousClass5N2;
import X.C05550Ty;
import X.C162457s7;
import X.C18260x0;
import X.C18290x4;
import X.C51332je;
import X.C56972sr;
import X.C621033m;
import X.C66433Lk;
import android.net.Uri;

public final class SharePhoneNumberViewModel extends C05550Ty {
    public final AnonymousClass08M A00;
    public final C621033m A01;
    public final AnonymousClass5N2 A02;

    public SharePhoneNumberViewModel(C56972sr r5, C621033m r6, AnonymousClass5N2 r7, C66433Lk r8) {
        C18260x0.A0c(r5, r8, r6, r7);
        this.A01 = r6;
        this.A02 = r7;
        AnonymousClass08M A012 = AnonymousClass08M.A01();
        this.A00 = A012;
        String A0L = r5.A0L();
        Uri A03 = r8.A03("626403979060997");
        C162457s7.A0D(A03);
        A012.A0G(new C51332je(A0L, C18290x4.A0o(A03)));
    }
}
