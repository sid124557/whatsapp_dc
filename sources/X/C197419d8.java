package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.payments.ui.PaymentCheckoutOrderDetailsPresenter$$ExternalSyntheticLambda0;
import com.whatsapp.payments.ui.orderdetails.PaymentCheckoutOrderDetailsViewV2;
import java.util.Objects;

/* renamed from: X.9d8  reason: invalid class name and case insensitive filesystem */
public class C197419d8 implements C203159nD {
    public long A00;
    public C89644eZ A01;
    public C194519Tf A02;
    public C203469nk A03;
    public C194049Rj A04;
    public PaymentCheckoutOrderDetailsViewV2 A05;
    public AnonymousClass11I A06;
    public C203479nl A07;
    public AnonymousClass9U0 A08;
    public AnonymousClass2z0 A09;
    public String A0A = "WhatsappPay";
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public final C69263Wi A0F;
    public final C64773Ex A0G;
    public final C56422rx A0H;
    public final C56612sH A0I;
    public final C620733j A0J;
    public final C66473Lo A0K;
    public final C66543Lv A0L;
    public final C29431io A0M;
    public final AnonymousClass36F A0N;
    public final AnonymousClass1VX A0O;
    public final C29271iY A0P;
    public final C1907099n A0Q;
    public final AnonymousClass9U4 A0R;
    public final AnonymousClass9b0 A0S;
    public final C46782cC A0T;
    public final C194229Sb A0U;
    public final C195219Wq A0V;
    public final C55942rA A0W;
    public final C106715a2 A0X;
    public final AnonymousClass4FS A0Y;

    public void Boy(C624034w r10, C95814uZ r11, long j) {
        C89644eZ r1;
        int i;
        C19340zH A002 = AnonymousClass5V0.A00(this.A01);
        A002.A0i(false);
        C204219p0.A01(A002, this, 81, R.string.f11nameremoved);
        AnonymousClass1S4 r0 = r10.A0A;
        if (r0 == null || !r0.A0c()) {
            A002.setTitle(this.A01.getString(R.string.f11nameremoved));
            r1 = this.A01;
            i = R.string.f11nameremoved;
        } else {
            A002.setTitle(this.A01.getString(R.string.f11nameremoved));
            r1 = this.A01;
            i = R.string.f11nameremoved;
        }
        A002.A0Q(r1.getString(i));
        C95814uZ r4 = r11;
        if (this.A0V.A0s(r11)) {
            A002.setNegativeButton(R.string.f11nameremoved, new C204159ou(r4, this, 1, j));
        }
        C18280x3.A0q(A002);
    }

    public void A00(C89644eZ r5, C203469nk r6, AnonymousClass11I r7) {
        this.A01 = r5;
        this.A03 = r6;
        this.A0D = r5.getIntent().getStringExtra("extra_order_id");
        this.A0B = r5.getIntent().getStringExtra("extra_order_discount_program_name");
        this.A00 = r5.getIntent().getLongExtra("extra_order_expiry_ts_in_sec", 0);
        this.A0E = r5.getIntent().getStringExtra("extra_payment_config_id");
        AnonymousClass2z0 A022 = C107395bF.A02(r5.getIntent());
        Objects.requireNonNull(A022);
        this.A09 = A022;
        if (r5.getIntent().getBooleanExtra("extra_checkout_lite_enabled", false)) {
            this.A0A = "checkout_lite";
        }
        AnonymousClass9dP r1 = new AnonymousClass9dP(r5, r6, this);
        this.A07 = r1;
        this.A08.A00 = r1;
        C194049Rj r2 = new C194049Rj(this.A0N, this, this.A0Y);
        this.A04 = r2;
        r5.A06.A00(new PaymentCheckoutOrderDetailsPresenter$$ExternalSyntheticLambda0(r2));
        this.A06 = r7;
        r7.A0I(false);
        C205049qL.A03(r5, r7.A02, this, 58);
        this.A05 = (PaymentCheckoutOrderDetailsViewV2) LayoutInflater.from(r5).inflate(R.layout.f8nameremoved, (ViewGroup) null, false);
    }

    public void A01(AnonymousClass213 r9, AnonymousClass9QL r10) {
        if (this.A03.BIW()) {
            this.A0W.A03(r10.A0B, this.A0A, 12);
        }
        AnonymousClass4FS r7 = this.A0Y;
        C66543Lv r2 = this.A0L;
        AnonymousClass9b0 r4 = this.A0S;
        AnonymousClass35F.A02(this.A0F, r2, this.A0N, r4, new C204069ol(this, r9, r10, 1), r10.A0B, r7);
    }

    public boolean BoU(int i) {
        return AnonymousClass000.A1U(i, 405);
    }

    public C197419d8(C69263Wi r2, C64773Ex r3, C56422rx r4, C56612sH r5, C620733j r6, C66473Lo r7, C66543Lv r8, C29431io r9, AnonymousClass36F r10, AnonymousClass1VX r11, C29271iY r12, C1907099n r13, AnonymousClass9U4 r14, AnonymousClass9b0 r15, C46782cC r16, AnonymousClass9U0 r17, C194229Sb r18, C195219Wq r19, C55942rA r20, C106715a2 r21, AnonymousClass4FS r22) {
        this.A0I = r5;
        this.A0O = r11;
        this.A0F = r2;
        this.A0X = r21;
        this.A0Y = r22;
        this.A0V = r19;
        this.A0J = r6;
        this.A0U = r18;
        this.A0G = r3;
        this.A0R = r14;
        this.A0L = r8;
        this.A0M = r9;
        this.A0H = r4;
        this.A0Q = r13;
        this.A0N = r10;
        this.A0S = r15;
        this.A0K = r7;
        this.A0W = r20;
        this.A0P = r12;
        this.A0T = r16;
        this.A08 = r17;
    }
}
