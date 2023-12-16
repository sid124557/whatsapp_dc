package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.4p1  reason: invalid class name and case insensitive filesystem */
public final class C93694p1 extends C113175l0 {
    public final C621033m A00;
    public final C65203Gp A01;
    public final C44372Vu A02;
    public final C106065Xm A03;
    public final AnonymousClass36Y A04;
    public final AnonymousClass4FV A05;
    public final C50222hp A06;
    public final C45042Yl A07;
    public final AnonymousClass4FS A08;

    public Drawable B8D(Context context, C620733j r3) {
        C162457s7.A0J(context, 0);
        return AnonymousClass0RP.A00(context, R.drawable.ic_action_star);
    }

    public boolean BoM(Collection collection) {
        C162457s7.A0J(collection, 0);
        if (collection.size() == 1) {
            C624134x A0b = C86654Ky.A0b(collection);
            C106065Xm r1 = this.A03;
            if (r1.A02(A0b) || r1.A03(A0b)) {
                return false;
            }
        }
        if (collection.isEmpty()) {
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!C18300x5.A0T(it).A1F) {
                if (!A00(collection)) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public int getId() {
        return 2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C93694p1(C621033m r1, C65203Gp r2, C44372Vu r3, C106065Xm r4, AnonymousClass36Y r5, AnonymousClass1VX r6, AnonymousClass4FV r7, AnonymousClass5U1 r8, C50222hp r9, C45042Yl r10, AnonymousClass4FS r11) {
        super(r6, r8);
        C18260x0.A0f(r6, r8, r11, r7, r2);
        C18260x0.A0g(r1, r5, r4, r3, r9);
        this.A08 = r11;
        this.A05 = r7;
        this.A01 = r2;
        this.A00 = r1;
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = r3;
        this.A06 = r9;
        this.A07 = r10;
    }

    public String BDk(AnonymousClass66W r3) {
        return C18290x4.A0l(C86604Kt.A07(r3), R.string.f11nameremoved);
    }
}
