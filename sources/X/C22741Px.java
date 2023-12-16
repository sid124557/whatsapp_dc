package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;

/* renamed from: X.1Px  reason: invalid class name and case insensitive filesystem */
public final class C22741Px extends C113155ky {
    public final C69263Wi A00;
    public final C621033m A01;
    public final C153167am A02;
    public final C57162tC A03;
    public final C55072pk A04;
    public final AnonymousClass1VX A05;
    public final C49902hH A06;
    public final C48192eV A07;
    public final AnonymousClass4FS A08;

    public boolean A00(C624134x r5) {
        C30561me r0;
        C162457s7.A0J(r5, 0);
        if (this.A07.A00.A0Y(C58422vE.A02, 3140) && this.A06.A00(C369020e.PIN, r5) && ((r0 = r5.A1T) == null || r0.A00 == 0)) {
            return true;
        }
        return false;
    }

    public Drawable B8D(Context context, C620733j r3) {
        C162457s7.A0J(context, 0);
        return AnonymousClass0RP.A00(context, R.drawable.vec_ic_action_pin_in_chat);
    }

    public String BDk(AnonymousClass66W r3) {
        C162457s7.A0J(r3, 0);
        return C18290x4.A0l(r3.getContext(), R.string.f11nameremoved);
    }

    public C22741Px(C69263Wi r1, C621033m r2, C153167am r3, C57162tC r4, C55072pk r5, AnonymousClass1VX r6, C49902hH r7, C48192eV r8, AnonymousClass4FS r9) {
        C18260x0.A0f(r6, r1, r9, r2, r7);
        AnonymousClass0x2.A1B(r5, r4);
        this.A05 = r6;
        this.A00 = r1;
        this.A08 = r9;
        this.A01 = r2;
        this.A06 = r7;
        this.A07 = r8;
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = r3;
    }

    public boolean B7f() {
        return true;
    }

    public int getId() {
        return 24;
    }
}
