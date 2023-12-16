package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.UserJid;
import java.util.Objects;

/* renamed from: X.2oL  reason: invalid class name and case insensitive filesystem */
public class C54202oL {
    public final C104205Qb A00;
    public final C56612sH A01;
    public final C54292oU A02;
    public final C66543Lv A03;
    public final AnonymousClass2Y3 A04;
    public final C48032eE A05;
    public final AnonymousClass1VX A06;
    public final C53202mi A07;
    public final C47532dP A08;
    public final AnonymousClass33Y A09;
    public final AnonymousClass33S A0A;
    public final C49162g5 A0B;
    public final C55312q9 A0C;
    public final C60292yJ A0D;
    public final C53262mo A0E;
    public final C625235k A0F;
    public final C53322mu A0G;
    public final C183538qC A0H;
    public final C183538qC A0I;
    public final C183538qC A0J;
    public final C183538qC A0K;

    public final void A00(C50882iv r4, C95814uZ r5, C624134x r6) {
        C624134x A002 = this.A0G.A00(r4, r5, r6);
        if (A002 != null && !this.A07.A02(r6.A1J.A00)) {
            this.A03.A08(A002);
        }
    }

    public final void A01(C624134x r4) {
        if (this.A06.A0Y(C58422vE.A02, 3869) && r4 != null) {
            r4.A0I = this.A01.A0H();
        }
    }

    public final void A02(C624134x r17, AnonymousClass3ST r18) {
        if (this.A06.A0Y(C58422vE.A02, 5869)) {
            UserJid A0o = r17.A0o();
            boolean equals = Objects.equals(r18.A0p, "MARKETING");
            C51062jD A0u = r17.A0u();
            if (A0o != null && A0u != null && equals) {
                C55502qS A002 = ((C56422rx) this.A0K.get()).A00(AnonymousClass32Y.A03(A0o));
                if (A0u.A00 && A002 != null && A002.A01 == 2) {
                    this.A0C.A04(A0o, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 0);
                    C183538qC r3 = this.A0H;
                    C61242zw r6 = (C61242zw) r3.get();
                    C44982Yf r0 = r6.A07;
                    C56612sH r4 = r6.A00;
                    long A0H2 = r4.A0H();
                    SharedPreferences.Editor A042 = C18270x1.A04(r0.A01);
                    C162457s7.A0D(A042);
                    A042.putBoolean(A0o.getRawString(), true);
                    A042.putLong(C18260x0.A03(A0o, "pref_disclosure_eligibility_ts_", AnonymousClass001.A0o()), A0H2);
                    A042.apply();
                    if (!C18310x6.A0F(r6.A08.A01).getBoolean("pref_disclosure_tos_state", false)) {
                        C41772Ln r5 = new C41772Ln(r4, r6.A04);
                        C41762Lm r42 = new C41762Lm(A0o, r6);
                        AnonymousClass31C r9 = r5.A01;
                        String A032 = r9.A03();
                        C35711xJ r1 = new C35711xJ(new C35371wl(A032, 21), C18290x4.A12(new C35261wa((Long) 20231028L, Long.valueOf(C56612sH.A00(r5.A00)))));
                        r9.A0D(new AnonymousClass4KX(r1, r42, r5, 14), C41032Ir.A05(r1), A032, 433, 32000);
                    }
                    ((C61242zw) r3.get()).A02(A0o);
                }
            }
        }
    }

    public C54202oL(C104205Qb r2, C56612sH r3, C54292oU r4, C66543Lv r5, AnonymousClass2Y3 r6, C48032eE r7, AnonymousClass1VX r8, C53202mi r9, C47532dP r10, AnonymousClass33Y r11, AnonymousClass33S r12, C49162g5 r13, C55312q9 r14, C60292yJ r15, C53262mo r16, C625235k r17, C53322mu r18, C183538qC r19, C183538qC r20, C183538qC r21, C183538qC r22) {
        this.A02 = r4;
        this.A01 = r3;
        this.A06 = r8;
        this.A0A = r12;
        this.A09 = r11;
        this.A03 = r5;
        this.A0G = r18;
        this.A00 = r2;
        this.A08 = r10;
        this.A0E = r16;
        this.A0F = r17;
        this.A0J = r19;
        this.A0K = r20;
        this.A0D = r15;
        this.A0B = r13;
        this.A0I = r21;
        this.A05 = r7;
        this.A04 = r6;
        this.A0C = r14;
        this.A0H = r22;
        this.A07 = r9;
    }
}
