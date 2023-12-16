package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;

/* renamed from: X.1QT  reason: invalid class name */
public final class AnonymousClass1QT extends AnonymousClass4pK {
    public final C56892sj A00;
    public final AnonymousClass3UK A01;
    public final C54822pL A02;

    public boolean A00(C624134x r2) {
        C162457s7.A0J(r2, 0);
        return this.A02.A02(r2);
    }

    public Drawable B8D(Context context, C620733j r3) {
        C162457s7.A0J(context, 0);
        return AnonymousClass0RP.A00(context, R.drawable.ic_action_reply);
    }

    public String BDk(AnonymousClass66W r3) {
        C162457s7.A0J(r3, 0);
        String string = r3.getContext().getResources().getString(R.string.f11nameremoved);
        C162457s7.A0D(string);
        return string;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1QT(C111095hX r1, AnonymousClass5G5 r2, C56892sj r3, AnonymousClass3UK r4, C54822pL r5) {
        super(r1, r2, r3);
        C18260x0.A0c(r5, r3, r1, r2);
        this.A02 = r5;
        this.A00 = r3;
        this.A01 = r4;
    }

    public int getId() {
        return 1;
    }
}
