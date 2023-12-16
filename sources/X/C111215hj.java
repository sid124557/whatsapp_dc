package X;

import android.view.LayoutInflater;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.wds.components.banners.WDSBanner;

/* renamed from: X.5hj  reason: invalid class name and case insensitive filesystem */
public class C111215hj implements C184998st {
    public View A00;
    public String A01;
    public final C111095hX A02;
    public final AnonymousClass4Pc A03;
    public final AnonymousClass33p A04;
    public final AnonymousClass1VX A05;
    public final AnonymousClass4FV A06;
    public final AnonymousClass4C1 A07;

    public void BFb() {
        C86604Kt.A1A(this.A00);
    }

    public boolean Bo4() {
        long j;
        AnonymousClass5K6 r0 = (AnonymousClass5K6) this.A07.get();
        if (r0 == null) {
            return false;
        }
        long j2 = r0.A04;
        long j3 = r0.A03;
        AnonymousClass33p r8 = this.A04;
        if (j2 > 5000000000L) {
            j = 500000000;
        } else {
            j = (long) (((float) (j2 * ((long) ((int) ((((float) 500000000) * 100.0f) / 5.0E9f))))) / 100.0f);
        }
        boolean A1P = AnonymousClass0x7.A1P((j3 > j ? 1 : (j3 == j ? 0 : -1)));
        C183538qC r3 = r8.A01;
        if (C18300x5.A0B(r3).getBoolean("storage_usage_banner_dismissed", false)) {
            if (!A1P) {
                C18270x1.A0v(r8, "storage_usage_banner_dismissed", false);
                return false;
            }
        } else if (!A1P) {
            return false;
        }
        if (!C18300x5.A0B(r3).getBoolean("storage_usage_banner_dismissed", false)) {
            return true;
        }
        return false;
    }

    public void BrS() {
        if (this.A01 == null) {
            this.A01 = AnonymousClass297.A00(this.A06, 3);
        }
        if (this.A00 == null) {
            boolean A022 = C106545Zk.A02(this.A05);
            AnonymousClass4Pc r4 = this.A03;
            LayoutInflater A0D = C18280x3.A0D(r4);
            if (A022) {
                WDSBanner wDSBanner = (WDSBanner) A0D.inflate(R.layout.f8nameremoved, r4, false);
                C18320x8.A15(wDSBanner, this, 20);
                wDSBanner.setOnDismissListener((AnonymousClass4GP) new AnonymousClass6C0(this, 1));
                if (!C1001059l.A03) {
                    wDSBanner.A06();
                }
                this.A00 = wDSBanner;
            } else {
                View inflate = A0D.inflate(R.layout.f8nameremoved, r4, false);
                this.A00 = inflate;
                C18320x8.A15(inflate, this, 21);
                C18320x8.A15(C06560Yg.A02(this.A00, R.id.storage_usage_full_close_container), this, 22);
                View view = this.A00;
                AnonymousClass5Yj.A0A(view.getContext(), view, R.attr.f3nameremoved, R.color.f5nameremoved);
            }
            r4.addView(this.A00);
        }
        C626936e.A04(this.A00);
        this.A00.setVisibility(0);
    }

    public C111215hj(C111095hX r1, AnonymousClass4Pc r2, AnonymousClass33p r3, AnonymousClass1VX r4, AnonymousClass4FV r5, AnonymousClass4C1 r6) {
        this.A05 = r4;
        this.A06 = r5;
        this.A02 = r1;
        this.A03 = r2;
        this.A04 = r3;
        this.A07 = r6;
    }
}
