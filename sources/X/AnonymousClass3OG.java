package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3OG  reason: invalid class name */
public class AnonymousClass3OG implements AnonymousClass4AG, AnonymousClass4AJ, C85364Fy {
    public final C56422rx A00;
    public final C617332a A01;
    public final AnonymousClass1VX A02;
    public final AnonymousClass33Y A03;
    public final C50222hp A04;
    public final C183538qC A05;

    public C624134x A00(C66543Lv r7, AnonymousClass1EU r8, AnonymousClass2z0 r9, C30791n7 r10, long j, boolean z) {
        AnonymousClass4DV A002;
        AnonymousClass39W B5s;
        AnonymousClass1EU r3 = r8;
        if (z || (A002 = AnonymousClass35F.A00(r7, AnonymousClass2z0.A01(r9), this.A03, r3, r10, false)) == null) {
            String A012 = C624935g.A01(r8);
            if (A012 != null) {
                return C30481mW.A00(r9, A012, j);
            }
            throw AnonymousClass24W.A00(0);
        }
        AnonymousClass39W r1 = r10.A00;
        if (!(r1 == null || (B5s = A002.B5s()) == null)) {
            r1.A01 = B5s.A01;
            r10.Blz(r1);
        }
        return r10;
    }

    public AnonymousClass1n4 A01(C55962rC r14) {
        AnonymousClass1EE r2;
        AnonymousClass39P r10;
        AnonymousClass2z0 r6 = r14.A0D;
        long j = r14.A05;
        C21801Df r5 = r14.A0B.buttonsMessage_;
        if (r5 == null) {
            r5 = C21801Df.DEFAULT_INSTANCE;
        }
        C626936e.A06(r5);
        C617332a r8 = this.A01;
        if (C18310x6.A0U(r5, 0).paramsJson_ == null) {
            Log.e("FMessageCheckoutButtonsProtobuf/parseE2ECheckoutInfo/invalid native flow message does not have parameters json");
        } else {
            C21591Ck r7 = (C21591Ck) r5.buttons_.get(0);
            if (r5.headerCase_ == 3) {
                r2 = (AnonymousClass1EE) r5.header_;
            } else {
                r2 = AnonymousClass1EE.DEFAULT_INSTANCE;
            }
            byte[] A07 = r2.jpegThumbnail_.A07();
            AnonymousClass1BB r22 = r7.nativeFlowInfo_;
            if (r22 == null) {
                r22 = AnonymousClass1BB.DEFAULT_INSTANCE;
            }
            AnonymousClass39S A022 = C626535y.A02(r8, r22.paramsJson_, A07, false);
            if (A022 != null) {
                AnonymousClass1n4 r3 = new AnonymousClass1n4(r6, j);
                String str = r5.contentText_;
                String str2 = r5.footerText_;
                if (r5.buttons_.size() > 0) {
                    ArrayList A0s = AnonymousClass001.A0s();
                    for (int i = 0; i < r5.buttons_.size(); i++) {
                        AnonymousClass1BB A0U = C18310x6.A0U(r5, i);
                        A0s.add(new AnonymousClass395(new AnonymousClass398(A0U.name_, A0U.paramsJson_), false));
                    }
                    r10 = new AnonymousClass39P((List) A0s);
                } else {
                    r10 = null;
                }
                r3.Blz(new AnonymousClass39W(A022, (AnonymousClass39A) null, r10, str, str2));
                return r3;
            }
        }
        C18260x0.A1Q(AnonymousClass001.A0o(), "FMessageCheckoutButtonsProtobuf/parseE2EMessage/invalid message; message.key=", r6);
        throw AnonymousClass24W.A00(26);
    }

    public void AyD(C55032pg r4, C624134x r5) {
        C18260x0.A0l(r5, "FMessageCheckoutButtonsProtobuf: message type is not supported ", AnonymousClass001.A0o(), r5 instanceof C30791n7);
        AnonymousClass39W r1 = ((C30791n7) r5).A00;
        if (r1 != null) {
            this.A04.A00(r1).A0C(r4, r5);
        }
    }

    public C624134x BgW(C55962rC r24) {
        C172548Lq r2;
        AnonymousClass39P r3;
        C55962rC r11 = r24;
        AnonymousClass1EU r10 = r11.A0B;
        if (!C625235k.A03(r10)) {
            return null;
        }
        AnonymousClass1ER r22 = r10.interactiveMessage_;
        if (r22 == null) {
            r22 = AnonymousClass1ER.DEFAULT_INSTANCE;
        }
        C162457s7.A0J(r22, 0);
        if (!AnonymousClass34T.A00.A02(r22, "review_order")) {
            return null;
        }
        C56422rx r1 = this.A00;
        AnonymousClass2z0 r9 = r11.A0D;
        if (!r1.A03((UserJid) r9.A00) || !this.A02.A0Y(C58422vE.A02, 2688)) {
            return null;
        }
        long j = r11.A05;
        AnonymousClass1ER r4 = r10.interactiveMessage_;
        if (r4 == null) {
            r4 = AnonymousClass1ER.DEFAULT_INSTANCE;
        }
        C626936e.A06(r4);
        if (r4.A0N().buttons_.size() > 0) {
            String A0j = C18300x5.A0j(r4.A0N());
            AnonymousClass1DR r5 = r4.header_;
            if (r5 == null) {
                r5 = AnonymousClass1DR.DEFAULT_INSTANCE;
            }
            if (r5.mediaCase_ == 6) {
                r2 = (C172548Lq) r5.media_;
            } else {
                r2 = C172548Lq.A01;
            }
            AnonymousClass39S A022 = C626535y.A02(this.A01, A0j, r2.A07(), true);
            if (A022 != null) {
                AnonymousClass1n4 r8 = new AnonymousClass1n4(r9, j);
                AnonymousClass1AN r23 = r4.body_;
                if (r23 == null) {
                    r23 = AnonymousClass1AN.DEFAULT_INSTANCE;
                }
                String str = r23.text_;
                AnonymousClass1AO r25 = r4.footer_;
                if (r25 == null) {
                    r25 = AnonymousClass1AO.DEFAULT_INSTANCE;
                }
                String str2 = r25.text_;
                AnonymousClass1C7 A0N = r4.A0N();
                if (A0N.buttons_.size() > 0) {
                    ArrayList A0s = AnonymousClass001.A0s();
                    for (int i = 0; i < A0N.buttons_.size(); i++) {
                        AnonymousClass1BH r26 = (AnonymousClass1BH) A0N.buttons_.get(i);
                        A0s.add(new AnonymousClass395(new AnonymousClass398(r26.name_, r26.buttonParamsJson_), false));
                    }
                    r3 = new AnonymousClass39P((List) A0s);
                } else {
                    r3 = null;
                }
                r8.Blz(new AnonymousClass39W(A022, (AnonymousClass39A) null, r3, str, str2));
                return A00(AnonymousClass0x9.A0M(this.A05), r10, r9, r8, j, r11.A0O);
            }
        }
        C18260x0.A1Q(AnonymousClass001.A0o(), "FMessageCheckoutButtonsProtobuf/parseE2EMessage/invalid message; message.key=", r9);
        throw AnonymousClass24W.A00(26);
    }

    public AnonymousClass3OG(C56422rx r1, C617332a r2, AnonymousClass1VX r3, AnonymousClass33Y r4, C50222hp r5, C183538qC r6) {
        this.A02 = r3;
        this.A03 = r4;
        this.A05 = r6;
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = r5;
    }
}
