package X;

import android.os.Handler;
import com.whatsapp.R;
import java.util.Objects;

/* renamed from: X.2o5  reason: invalid class name and case insensitive filesystem */
public class C54042o5 {
    public String A00;
    public boolean A01;
    public final Handler A02 = AnonymousClass000.A0A();
    public final C55682qk A03;
    public final C56972sr A04;
    public final C29411im A05;
    public final C54292oU A06;
    public final AnonymousClass33p A07;
    public final AnonymousClass7T5 A08;
    public final C45272Zj A09;
    public final AnonymousClass31C A0A;
    public final AnonymousClass4FS A0B;
    public final C183538qC A0C;

    public String A00() {
        String str = this.A00;
        if (str != null) {
            return str;
        }
        A01((C85084Ew) null);
        String string = AnonymousClass0x2.A0F(this.A07).getString("my_current_status", (String) null);
        if (string == null) {
            return this.A06.A00.getString(R.string.f11nameremoved);
        }
        return string;
    }

    public void A01(C85084Ew r10) {
        if (!this.A01) {
            C54292oU r3 = this.A06;
            AnonymousClass4FS r8 = this.A0B;
            AnonymousClass2T9 r1 = new AnonymousClass2T9(this.A03, r3, this.A08, this.A09, this.A0A, new C68583Ts(this, r10), r8);
            r1.A06.BkM(new C70283aF(r1, C56972sr.A05(this.A04), 15, 0));
            this.A01 = true;
        }
    }

    public void A02(String str, String str2) {
        this.A00 = str;
        this.A01 = false;
        this.A07.A1h(str, str2);
        Handler handler = this.A02;
        Object obj = this.A0C.get();
        Objects.requireNonNull(obj);
        handler.post(new C70043Zq(obj, 2));
    }

    public C54042o5(C55682qk r2, C56972sr r3, C29411im r4, C54292oU r5, AnonymousClass33p r6, AnonymousClass7T5 r7, C45272Zj r8, AnonymousClass31C r9, AnonymousClass4FS r10, C183538qC r11) {
        this.A06 = r5;
        this.A0B = r10;
        this.A03 = r2;
        this.A04 = r3;
        this.A0A = r9;
        this.A05 = r4;
        this.A07 = r6;
        this.A08 = r7;
        this.A09 = r8;
        this.A0C = r11;
    }
}
