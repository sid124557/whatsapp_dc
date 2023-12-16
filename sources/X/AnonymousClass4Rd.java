package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;

/* renamed from: X.4Rd  reason: invalid class name */
public class AnonymousClass4Rd extends LinearLayout implements AnonymousClass4GJ {
    public C111095hX A00;
    public C69263Wi A01;
    public C44272Vj A02;
    public C56942so A03;
    public C64653Ej A04;
    public C64773Ex A05;
    public AnonymousClass5ZU A06;
    public C56892sj A07;
    public AnonymousClass1VX A08;
    public C52472lX A09;
    public C27991fJ A0A;
    public AnonymousClass4FS A0B;
    public C116855qy A0C;
    public boolean A0D;
    public final View A0E;
    public final View A0F;
    public final View A0G;
    public final View A0H;
    public final View A0I;
    public final View A0J;
    public final AnonymousClass4VM A0K;
    public final AnonymousClass5UY A0L;

    public final Object generatedComponent() {
        C116855qy r0 = this.A0C;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A0C = r0;
        }
        return r0.generatedComponent();
    }

    public AnonymousClass4Rd(Context context) {
        super(context);
        if (!this.A0D) {
            this.A0D = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            this.A08 = C64333Db.A4B(A002);
            this.A01 = C64333Db.A04(A002);
            this.A0B = C64333Db.A8y(A002);
            this.A00 = C64333Db.A00(A002);
            this.A05 = C64333Db.A26(A002);
            this.A06 = C64333Db.A28(A002);
            this.A09 = C86644Kx.A0W(A002);
            this.A04 = C86654Ky.A0X(A002);
            this.A03 = C64333Db.A1k(A002);
            this.A02 = (C44272Vj) A002.A5U.get();
            this.A07 = C64333Db.A3G(A002);
        }
        C004805c r4 = (C004805c) C111095hX.A00(context);
        AnonymousClass4VM r5 = (AnonymousClass4VM) AnonymousClass0x9.A0H(r4).A01(AnonymousClass4VM.class);
        this.A0K = r5;
        View inflate = View.inflate(getContext(), R.layout.f8nameremoved, this);
        this.A0I = inflate;
        this.A0G = C06560Yg.A02(inflate, R.id.community_no_longer_description);
        View A022 = C06560Yg.A02(inflate, R.id.report_community_button);
        this.A0J = A022;
        View A023 = C06560Yg.A02(inflate, R.id.deactivate_community_btn);
        this.A0E = A023;
        View A024 = C06560Yg.A02(inflate, R.id.delete_community_btn);
        this.A0F = A024;
        View A025 = C06560Yg.A02(inflate, R.id.exit_community_btn);
        this.A0H = A025;
        AnonymousClass5UY A0X = C18290x4.A0X(this, R.id.community_settings_button);
        this.A0L = A0X;
        C18290x4.A1I(A022, this, context, 23);
        C18290x4.A1I(A024, this, context, 24);
        C18290x4.A1I(A023, this, context, 25);
        AnonymousClass0x2.A0z(A025, this, 48);
        A0X.A07(new C109465ef(this, 26, context));
        AnonymousClass6C6.A02(r4, r5.A05, context, 145);
        r5.A00.A0B(r4, new C110525gb(r4, this.A03, r5, new AnonymousClass6BB(this, 0)));
        C100385As.A01(r4, r5.A04, context, this, 10);
    }
}
