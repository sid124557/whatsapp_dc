package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.4za  reason: invalid class name and case insensitive filesystem */
public class C97954za extends C98064zl {
    public AnonymousClass4R7 A00;
    public AnonymousClass4Pb A01;
    public boolean A02;
    public final C56972sr A03;
    public final AnonymousClass5UX A04;
    public final C105365Uq A05;
    public final C56612sH A06;
    public final C620733j A07;
    public final C66473Lo A08;
    public final C621233o A09;
    public final C28071fd A0A;

    public void A00() {
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public void setMessage(C30361mK r12, List list) {
        String string;
        long A052;
        String A012;
        String str = "";
        if (r12 instanceof AnonymousClass1n9) {
            AnonymousClass1n9 r0 = (AnonymousClass1n9) r12;
            string = r0.A01;
            if (string == null) {
                string = str;
            }
            A012 = r0.A00;
            String A1x = r0.A1x();
            if (A1x != null) {
                Uri parse = Uri.parse(A1x);
                if (parse.getHost() != null) {
                    str = parse.getHost();
                }
            }
            if (TextUtils.isEmpty(string) && TextUtils.isEmpty(A012)) {
                string = getContext().getString(R.string.f11nameremoved);
            }
        } else {
            C30801n8 r9 = (C30801n8) r12;
            string = getContext().getString(R.string.f11nameremoved);
            C621233o r8 = this.A09;
            if (r9.A1J.A02) {
                A052 = r8.A06(r9);
            } else {
                A052 = r8.A05(r9);
            }
            C56612sH r6 = this.A06;
            A012 = C106475Zd.A01(getContext(), this.A03, r6, this.A07, r8, r9, C106475Zd.A02(r6, r9, A052));
        }
        this.A00.setTitleAndDescription(string, A012, list);
        if (str != null) {
            this.A00.setSubText(str, (List) null);
        }
        this.A01.setMessage(r12);
    }

    public C97954za(Context context, C56972sr r2, AnonymousClass5UX r3, C105365Uq r4, C56612sH r5, C620733j r6, C66473Lo r7, C621233o r8, C28071fd r9) {
        super(context);
        A00();
        this.A06 = r5;
        this.A03 = r2;
        this.A0A = r9;
        this.A04 = r3;
        this.A07 = r6;
        this.A05 = r4;
        this.A09 = r8;
        this.A08 = r7;
        A03();
    }

    public View A01() {
        this.A00 = new AnonymousClass4R7(getContext());
        FrameLayout.LayoutParams A0q = C86664Kz.A0q();
        int A062 = C86634Kw.A06(this);
        C107555bV.A07(this.A00, this.A07, A062, 0, A062, 0);
        this.A00.setLayoutParams(A0q);
        return this.A00;
    }

    public View A02() {
        Context context = getContext();
        C56612sH r5 = this.A06;
        C56972sr r2 = this.A03;
        C28071fd r8 = this.A0A;
        this.A01 = new AnonymousClass4Pb(context, r2, this.A04, this.A05, r5, this.A08, this.A09, r8);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A01.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        return this.A01;
    }
}
