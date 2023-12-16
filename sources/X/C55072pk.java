package X;

import android.content.ContentValues;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2pk  reason: invalid class name and case insensitive filesystem */
public class C55072pk {
    public final C56972sr A00;
    public final C56922sm A01;
    public final C66543Lv A02;
    public final C50012hU A03;
    public final C72303dV A04;
    public final C381625y A05;
    public final C66443Ll A06;
    public final C49902hH A07;
    public final C48192eV A08;
    public final C56832sd A09;
    public final C55832qz A0A;

    public Map A00(C95814uZ r6) {
        C624134x A012;
        List<C30331mH> A072 = this.A06.A07(this.A08.A00(), this.A01.A07(r6));
        C18260x0.A1C("MessageAddOnPinInChatManager/getPinnedMessagesParentsInLimit/pinnedAddOns size:", AnonymousClass001.A0o(), A072);
        LinkedHashMap A0C = C18330xA.A0C(A072.size());
        for (C30331mH r2 : A072) {
            C55832qz r1 = this.A0A;
            AnonymousClass2z0 A1v = r2.A1v();
            if (A1v != null) {
                A012 = r1.A05(A1v);
            } else {
                A012 = C30331mH.A01(r2, r1);
            }
            if (A012 != null) {
                C18320x8.A1G(A012.A1J, A012, A0C);
            }
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        C18260x0.A1G(A0o, AnonymousClass0x7.A0A("MessageAddOnPinInChatManager/getPinnedMessagesParentsInLimit/pinnedParentMessages size:", A0o, A0C));
        return A0C;
    }

    public void A01(C69833Yo r24, C85284Fq r25, long j) {
        Integer num;
        C624134x A012;
        int A002 = this.A08.A00();
        C66443Ll r10 = this.A06;
        List A072 = r10.A07(-1, j);
        C18260x0.A1C("MessageAddOnPinInChatManager/unpinOldPinsIfExceedLimit/pinnedAddOns size:", AnonymousClass001.A0o(), A072);
        while (A002 < A072.size()) {
            C30561me r2 = (C30561me) A072.get(A002);
            r2.A00 = 0;
            long j2 = r2.A1L;
            C85284Fq A042 = r10.A03.A04();
            try {
                ContentValues A073 = AnonymousClass0x9.A07(6);
                A073.put("key_id", r2.A1J.A01);
                C18270x1.A0c(A073, "timestamp", r2.A0K);
                C18270x1.A0b(A073, "status", r2.A0D);
                int i = r2.A00;
                Long l = null;
                if (i <= 0) {
                    num = null;
                } else {
                    num = Integer.valueOf(i);
                }
                A073.put("expiry_duration_in_secs", num);
                long j3 = r2.A01;
                if (j3 > 0) {
                    l = Long.valueOf(j3);
                }
                A073.put("expiry_timestamp", l);
                C18270x1.A0c(A073, "server_timestamp", r2.A03);
                C56862sg r1 = ((AnonymousClass3H0) A042).A03;
                String[] A1Y = AnonymousClass0x9.A1Y();
                AnonymousClass0x2.A1S(A1Y, 0, j2);
                r1.A05(A073, "message_add_on", "_id = ?", "MessageAddOnStore/updateMessageAddOn", A1Y);
                A042.close();
                long j4 = r2.A1L;
                C56862sg r11 = ((AnonymousClass3H0) r25).A03;
                ContentValues A062 = AnonymousClass0x9.A06();
                C18270x1.A0c(A062, "message_add_on_row_id", j4);
                A062.put("pin_in_chat_state", Integer.valueOf(r2.A00));
                A062.put("sender_timestamp", Long.valueOf(r2.A01));
                String[] A1Y2 = AnonymousClass0x9.A1Y();
                AnonymousClass0x2.A1S(A1Y2, 0, j4);
                r11.A05(A062, "message_add_on_pin_in_chat", "message_add_on_row_id = ?", "MessageAddOnPinInChatStore/updateMessageAddOnPinInChat", A1Y2);
                C55832qz r12 = this.A0A;
                AnonymousClass2z0 A1v = r2.A1v();
                if (A1v != null) {
                    A012 = r12.A05(A1v);
                } else {
                    A012 = C30331mH.A01(r2, r12);
                }
                if (A012 != null) {
                    C30331mH.A04(A012, r2);
                    A02(r24, A012, r2);
                    C18300x5.A16(this.A03.A02, A012, 2, 34);
                }
                A002++;
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        }
    }

    public void A03(C30561me r8) {
        C95814uZ A0o;
        AnonymousClass2z0 r0 = r8.A1J;
        C95814uZ r6 = r0.A00;
        if (r6 != null) {
            if (r0.A02) {
                A0o = C56972sr.A04(this.A00);
            } else {
                A0o = r8.A0o();
            }
            if (r8.A00 == 1) {
                C66543Lv r4 = this.A02;
                C56832sd r02 = this.A09;
                C31131nn r03 = new C31131nn(C56832sd.A00(r6, r02), r8.A0K);
                r03.A1J(A0o);
                r4.A0V(r03);
            }
        }
    }

    public C55072pk(C56972sr r1, C56922sm r2, C66543Lv r3, C50012hU r4, C72303dV r5, C381625y r6, C66443Ll r7, C49902hH r8, C48192eV r9, C56832sd r10, C55832qz r11) {
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r4;
        this.A0A = r11;
        this.A02 = r3;
        this.A06 = r7;
        this.A07 = r8;
        this.A04 = r5;
        this.A09 = r10;
        this.A08 = r9;
        this.A05 = r6;
    }

    public void A02(C69833Yo r3, C624134x r4, C30561me r5) {
        C626936e.A0D(r3.A01(), "CoreMessageStore methods must be called within a live DB transaction");
        r4.A1T = r5;
        if (!AnonymousClass000.A1U(r4.A08 & 8, 8)) {
            C624134x.A0K(r4, 8);
            this.A02.A0X(r4);
        }
        this.A02.A0y.A02(r4);
    }
}
