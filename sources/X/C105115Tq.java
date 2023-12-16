package X;

import android.app.Activity;
import com.whatsapp.util.Log;

/* renamed from: X.5Tq  reason: invalid class name and case insensitive filesystem */
public class C105115Tq {
    public AnonymousClass66X A00;
    public Boolean A01;
    public String A02;
    public final AnonymousClass5WR A03;
    public final AnonymousClass1VX A04;
    public final AnonymousClass4FV A05;
    public final AnonymousClass5BW A06;
    public final C186568vZ A07;
    public final C183538qC A08;

    public void A01(int i) {
        if (this.A00 != null) {
            C186568vZ r3 = this.A07;
            r3.markerStart(689639794);
            if (this.A04.A0X(6084)) {
                r3.BKd(new C115385oa(this), 689639794);
            }
            this.A00.Bau(i, A03(), r3.BI5(689639794));
        }
    }

    public final boolean A03() {
        Boolean bool = this.A01;
        if (bool == null) {
            bool = Boolean.valueOf(AnonymousClass0x9.A0U(1, false).A00());
            this.A01 = bool;
        }
        return bool.booleanValue();
    }

    public C105115Tq(AnonymousClass5WR r1, AnonymousClass1VX r2, AnonymousClass4FV r3, AnonymousClass5BW r4, C186568vZ r5, C183538qC r6) {
        this.A07 = r5;
        this.A04 = r2;
        this.A05 = r3;
        this.A03 = r1;
        this.A08 = r6;
        this.A06 = r4;
    }

    public void A00() {
        AnonymousClass66X r0;
        if ((A03() || this.A07.BI5(689639794)) && (r0 = this.A00) != null) {
            r0.Bav();
        }
    }

    public void A02(Activity activity) {
        String str;
        if ((A03() || this.A07.BKi(689639794)) && this.A00 == null) {
            boolean A0Y = this.A04.A0Y(C58422vE.A01, 5025);
            AnonymousClass4FV r3 = this.A05;
            C186568vZ r2 = this.A07;
            AnonymousClass5WR r1 = this.A03;
            if (A0Y) {
                this.A00 = new AnonymousClass8J2(activity, r1, r3, r2);
                str = "ScrollPerfLoggerManager/createScrollPerfExperiment: ScrollPerfLoggerV2";
            } else {
                this.A00 = new AnonymousClass8J1(activity, r1, r3, r2);
                str = "ScrollPerfLoggerManager/createScrollPerfExperiment: ScrollPerfLoggerV1";
            }
            Log.d(str);
        }
    }
}
