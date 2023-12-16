package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.5hg  reason: invalid class name and case insensitive filesystem */
public class C111185hg implements C184998st {
    public View A00;
    public final AnonymousClass4Pc A01;
    public final C147047Cp A02;
    public final AnonymousClass1VX A03;
    public final AnonymousClass4C1 A04;

    public void BFb() {
        C86604Kt.A1A(this.A00);
    }

    public boolean Bo4() {
        AnonymousClass4C1 r1 = this.A04;
        if (r1.get() == null) {
            return false;
        }
        r1.get();
        return false;
    }

    public C111185hg(AnonymousClass4Pc r1, C147047Cp r2, AnonymousClass1VX r3, AnonymousClass4C1 r4) {
        this.A03 = r3;
        this.A01 = r1;
        this.A04 = r4;
        this.A02 = r2;
    }

    public void BrS() {
        if (Bo4() && this.A00 == null) {
            AnonymousClass4Pc r2 = this.A01;
            View A0R = AnonymousClass001.A0R(C18280x3.A0D(r2), r2, R.layout.f8nameremoved);
            this.A00 = A0R;
            r2.addView(A0R);
        }
        View view = this.A00;
        if (view == null) {
            AnonymousClass4Pc r22 = this.A01;
            view = AnonymousClass001.A0R(C18280x3.A0D(r22), r22, R.layout.f8nameremoved);
            this.A00 = view;
        }
        AnonymousClass4Pc r6 = this.A01;
        Context context = r6.getContext();
        SpannableStringBuilder A002 = C18330xA.A00(context.getString(R.string.f11nameremoved));
        SpannableString A0A = AnonymousClass4L0.A0A(context.getString(R.string.f11nameremoved));
        A0A.setSpan(C86634Kw.A0I(context, C18290x4.A00(context)), 0, A0A.length(), 33);
        A002.append(" ").append(A0A);
        AnonymousClass0x7.A0K(view, R.id.banner_description).A0K((List) null, A002);
        AnonymousClass5Yj.A0A(r6.getContext(), r6, R.attr.f3nameremoved, R.color.f5nameremoved);
        C109705f3.A00(r6, this, context, 13);
        C18320x8.A15(C06560Yg.A02(view, R.id.close), this, 10);
        view.setVisibility(0);
    }
}
