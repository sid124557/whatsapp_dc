package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.1se  reason: invalid class name and case insensitive filesystem */
public class C33221se extends C109665ez {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C69263Wi A01;
    public final /* synthetic */ AnonymousClass5Ul A02;
    public final /* synthetic */ C621033m A03;
    public final /* synthetic */ C56962sq A04;
    public final /* synthetic */ C66543Lv A05;
    public final /* synthetic */ C620333f A06;
    public final /* synthetic */ C624134x A07;
    public final /* synthetic */ C40812Hv A08;
    public final /* synthetic */ AnonymousClass4FS A09;

    public C33221se(Context context, C69263Wi r2, AnonymousClass5Ul r3, C621033m r4, C56962sq r5, C66543Lv r6, C620333f r7, C624134x r8, C40812Hv r9, AnonymousClass4FS r10) {
        this.A04 = r5;
        this.A07 = r8;
        this.A00 = context;
        this.A08 = r9;
        this.A09 = r10;
        this.A05 = r6;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A06 = r7;
    }

    public void A07(View view) {
        int i;
        String string;
        C56962sq r1 = this.A04;
        C624134x r6 = this.A07;
        C95814uZ r5 = r6.A1J.A00;
        boolean A0P = r1.A0P(AnonymousClass32Y.A03(r5));
        Context context = this.A00;
        if (A0P) {
            C621433s.A01(C111095hX.A02(context), 106);
            return;
        }
        C19340zH A002 = AnonymousClass5V0.A00(context);
        C40812Hv r10 = this.A08;
        Resources resources = context.getResources();
        List list = r10.A00;
        if (list.size() == 0) {
            string = "";
        } else {
            C624134x A0R = C18320x8.A0R(list, 0);
            if (list.size() != 1) {
                boolean z = A0R instanceof C30331mH;
                i = R.string.f11nameremoved;
                if (!z) {
                    i = R.string.f11nameremoved;
                }
            } else if (A0R != null && C624134x.A0d(A0R)) {
                i = R.string.f11nameremoved;
            } else if (A0R instanceof C30591mh) {
                boolean isEmpty = ((C30591mh) A0R).A06.isEmpty();
                i = R.string.f11nameremoved;
                if (isEmpty) {
                    i = R.string.f11nameremoved;
                }
            } else if (A0R instanceof C30571mf) {
                string = C18320x8.A0b(resources, ((C30571mf) A0R).A01, new Object[1], 0, R.string.f11nameremoved);
            } else if (A0R instanceof C30551md) {
                int i2 = ((C30551md) A0R).A01;
                i = R.string.f11nameremoved;
                if (i2 == 1) {
                    i = R.string.f11nameremoved;
                }
            } else if (A0R instanceof C30561me) {
                int i3 = ((C30561me) A0R).A00;
                i = R.string.f11nameremoved;
                if (i3 == 1) {
                    i = R.string.f11nameremoved;
                }
            } else {
                boolean z2 = A0R instanceof C30601mi;
                i = R.string.f11nameremoved;
                if (z2) {
                    i = R.string.f11nameremoved;
                }
            }
            string = resources.getString(i);
        }
        A002.A0g(string);
        if (r6.A0D == 21) {
            A002.A0Y(new AnonymousClass4I1(15), R.string.f11nameremoved);
            if (r5 instanceof C95804uY) {
                A002.A0X(new C85834Hu(r6, this.A05, this.A09, 5), R.string.f11nameremoved);
            }
        } else {
            A002.A0Y(new AnonymousClass379(this.A01, this.A02, this.A03, this.A05, this.A06, r10, this.A09), R.string.f11nameremoved);
            A002.A0W(new AnonymousClass4I1(16), R.string.f11nameremoved);
        }
        C18280x3.A0q(A002);
    }
}
