package X;

import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;

/* renamed from: X.3PO  reason: invalid class name */
public final class AnonymousClass3PO implements AnonymousClass4D2 {
    public final C56972sr A00;
    public final C57082t3 A01;
    public final C64773Ex A02;
    public final AnonymousClass32U A03;

    public final void A00(C52952mJ r9, AnonymousClass1A3 r10, C624134x r11) {
        AnonymousClass4FP r0;
        GroupJid A002;
        AnonymousClass3ZH A07;
        if (AnonymousClass000.A1U(r11.A08 & 1, 1)) {
            C95814uZ r02 = r11.A1J.A00;
            if ((r02 == null || (A002 = AnonymousClass32V.A00(r02)) == null || (A07 = this.A02.A07(A002)) == null || !A07.A0k || r9.A03) && (r0 = r11.A0L) != null) {
                for (C30331mH r1 : r0.B4S()) {
                    C162457s7.A0K(r1, "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessageReaction");
                    C30571mf r4 = (C30571mf) r1;
                    C130546c9 A0G = AnonymousClass1DP.DEFAULT_INSTANCE.A0G();
                    AnonymousClass1A1 A003 = C57082t3.A00(r1);
                    AnonymousClass1DP r12 = (AnonymousClass1DP) C18320x8.A0C(A0G);
                    r12.key_ = C18290x4.A0V(A003);
                    r12.bitField0_ |= 1;
                    String str = r4.A01;
                    if (!(str == null || str.length() == 0)) {
                        AnonymousClass1DP r13 = (AnonymousClass1DP) C18320x8.A0C(A0G);
                        r13.bitField0_ |= 2;
                        r13.text_ = str;
                    }
                    if (r4.A0D != 17) {
                        AnonymousClass1DP r14 = (AnonymousClass1DP) C18320x8.A0C(A0G);
                        r14.bitField0_ |= 16;
                        r14.unread_ = true;
                    }
                    long j = r4.A00;
                    AnonymousClass1DP r15 = (AnonymousClass1DP) C18320x8.A0C(A0G);
                    r15.bitField0_ |= 8;
                    r15.senderTimestampMs_ = j;
                    AnonymousClass1ES A0X = C18310x6.A0X(r10);
                    C130786cX A06 = A0G.A06();
                    A06.getClass();
                    C188248ya r16 = A0X.reactions_;
                    if (!((AnonymousClass8T6) r16).A00) {
                        r16 = C130786cX.A07(r16);
                        A0X.reactions_ = r16;
                    }
                    r16.add(A06);
                }
            }
        }
    }

    public void BYV(C52952mJ r2, AnonymousClass1A3 r3, C624134x r4) {
        C162457s7.A0J(r4, 0);
        C18260x0.A0Q(r3, r2);
        A00(r2, r3, r4);
    }

    public final void A01(AnonymousClass1ES r19, C624134x r20) {
        AnonymousClass1ES r4 = r19;
        if (r4.reactions_.size() > 0) {
            ArrayList A0s = AnonymousClass001.A0s();
            C624134x r2 = r20;
            C52042kn A002 = C52042kn.A00(r2);
            long j = r2.A1L;
            C188248ya<AnonymousClass1DP> r0 = r4.reactions_;
            C162457s7.A0D(r0);
            for (AnonymousClass1DP r5 : r0) {
                long A003 = AnonymousClass32U.A00(r4);
                AnonymousClass1ET r02 = r5.key_;
                if (r02 == null) {
                    r02 = AnonymousClass1ET.DEFAULT_INSTANCE;
                }
                C162457s7.A0D(r02);
                C30571mf r7 = new C30571mf(AnonymousClass32U.A01(r02), A002, (C52042kn) null, r5.text_, A003, j, r5.senderTimestampMs_);
                C106405Yw r1 = C95814uZ.A00;
                AnonymousClass1ET r03 = r5.key_;
                if (r03 == null) {
                    r03 = AnonymousClass1ET.DEFAULT_INSTANCE;
                }
                r7.A1J(r1.A05(r03.participant_));
                if (!r5.unread_) {
                    r7.A1G(17);
                }
                A0s.add(r7);
            }
            r2.A1t(new C111495iB(this.A00, A0s));
            C624134x.A0K(r2, 1);
        }
    }

    public AnonymousClass3PO(C56972sr r1, C57082t3 r2, C64773Ex r3, AnonymousClass32U r4) {
        C18260x0.A0Q(r1, r3);
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
    }

    public void BYW(C50972j4 r1, AnonymousClass1ES r2, C624134x r3) {
        C18260x0.A0O(r2, r3);
        A01(r2, r3);
    }
}
