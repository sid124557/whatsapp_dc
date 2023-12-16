package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.5hi  reason: invalid class name and case insensitive filesystem */
public class C111205hi implements C184998st {
    public View A00;
    public final AnonymousClass4Pc A01;
    public final AnonymousClass1VX A02;
    public final C49182g7 A03;
    public final C51922kb A04;
    public final AnonymousClass33X A05;
    public final AnonymousClass4C1 A06;

    public void BFb() {
        C86604Kt.A1A(this.A00);
    }

    public boolean Bo4() {
        return AnonymousClass000.A1W(this.A05.A01());
    }

    public void BrS() {
        if (this.A00 == null) {
            AnonymousClass4Pc r2 = this.A01;
            View A0R = AnonymousClass001.A0R(C18280x3.A0D(r2), r2, R.layout.f8nameremoved);
            this.A00 = A0R;
            r2.addView(A0R);
            this.A04.A01(AnonymousClass001.A0f());
        }
        AnonymousClass33X r3 = this.A05;
        AnonymousClass1kT A012 = r3.A01();
        C626936e.A06(A012);
        C626936e.A04(this.A00);
        TextView A0G = C18300x5.A0G(this.A00, R.id.user_notice_banner_text);
        AnonymousClass4Pc r6 = this.A01;
        A0G.setText(C106225Yc.A00(r6.getContext(), (C183268pl) null, A012.A04));
        ((AnonymousClass1kS) C06560Yg.A02(this.A00, R.id.user_notice_banner_icon)).A07(A012);
        String str = A012.A01;
        String A013 = C106225Yc.A01(str);
        AnonymousClass1VX r1 = this.A02;
        C622234e A022 = r3.A05.A02();
        C626936e.A06(A022);
        boolean A014 = AnonymousClass31f.A01(r1, A022);
        Map A023 = C106225Yc.A02(str);
        if (A014 && r6.getContext() != null) {
            C18300x5.A13(r6.getContext(), A0G, R.string.f11nameremoved);
        }
        this.A00.setOnClickListener(new AnonymousClass545(this, A013, A023, A014));
        C06560Yg.A02(this.A00, R.id.cancel).setOnClickListener(new AnonymousClass542(0, this, A014));
        Log.i("UserNoticeBanner/update/banner shown");
        this.A00.setVisibility(0);
    }

    public C111205hi(AnonymousClass4Pc r1, AnonymousClass1VX r2, C49182g7 r3, C51922kb r4, AnonymousClass33X r5, AnonymousClass4C1 r6) {
        this.A02 = r2;
        this.A04 = r4;
        this.A05 = r5;
        this.A01 = r1;
        this.A03 = r3;
        this.A06 = r6;
    }
}
