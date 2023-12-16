package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.1A3  reason: invalid class name */
public final class AnonymousClass1A3 extends C130546c9 implements C181378mf {
    public AnonymousClass1A3() {
        super(AnonymousClass1ES.DEFAULT_INSTANCE);
    }

    public static void A00(Jid jid, AnonymousClass1A3 r1) {
        if (jid != null) {
            r1.A0E(jid.getRawString());
        } else {
            r1.A09();
        }
    }

    public static void A01(AnonymousClass1A3 r1, int i) {
        r1.A0D(String.valueOf(i));
    }

    public void A09() {
        AnonymousClass1ES A0X = C18310x6.A0X(this);
        A0X.bitField0_ &= -17;
        A0X.participant_ = AnonymousClass1ES.DEFAULT_INSTANCE.participant_;
    }

    public void A0A(long j) {
        AnonymousClass1ES A0O = C18280x3.A0O(this);
        A0O.bitField0_ |= 4;
        A0O.messageTimestamp_ = j;
    }

    public void A0B(AnonymousClass1ET r3) {
        AnonymousClass1ES A0O = C18280x3.A0O(this);
        r3.getClass();
        A0O.key_ = r3;
        A0O.bitField0_ |= 1;
    }

    public void A0C(AnonymousClass23Q r3) {
        AnonymousClass1ES A0O = C18280x3.A0O(this);
        A0O.messageStubType_ = r3.value;
        A0O.bitField0_ |= 16384;
    }

    public void A0D(String str) {
        AnonymousClass1ES A0O = C18280x3.A0O(this);
        str.getClass();
        C188248ya r1 = A0O.messageStubParameters_;
        if (!((AnonymousClass8T6) r1).A00) {
            r1 = C130786cX.A07(r1);
            A0O.messageStubParameters_ = r1;
        }
        r1.add(str);
    }

    public void A0E(String str) {
        AnonymousClass1ES A0O = C18280x3.A0O(this);
        str.getClass();
        A0O.bitField0_ |= 16;
        A0O.participant_ = str;
    }
}
