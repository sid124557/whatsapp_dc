package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;

/* renamed from: X.4pR  reason: invalid class name and case insensitive filesystem */
public final class C93844pR extends C113155ky {
    public final C111095hX A00;
    public final C64773Ex A01;
    public final C56892sj A02;
    public final AnonymousClass3LP A03;
    public final C52472lX A04;

    public Drawable B8D(Context context, C620733j r3) {
        C162457s7.A0J(context, 0);
        return AnonymousClass0RP.A00(context, R.drawable.vec_ic_chat_filled);
    }

    public String BDk(AnonymousClass66W r5) {
        String A0X;
        C162457s7.A0J(r5, 0);
        String B77 = r5.B77();
        Context context = r5.getContext();
        if (B77 == null) {
            A0X = context.getString(R.string.f11nameremoved);
        } else {
            A0X = AnonymousClass0x2.A0X(context, B77, 1, R.string.f11nameremoved);
        }
        C162457s7.A0D(A0X);
        return A0X;
    }

    public boolean B7f() {
        return true;
    }

    public int getId() {
        return 11;
    }

    public C93844pR(C111095hX r1, C64773Ex r2, C56892sj r3, AnonymousClass3LP r4, C52472lX r5) {
        C18260x0.A0f(r4, r1, r2, r5, r3);
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = r5;
        this.A02 = r3;
    }
}
