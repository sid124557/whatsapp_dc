package X;

import android.util.Base64;
import com.whatsapp.util.Log;

/* renamed from: X.1mp  reason: invalid class name and case insensitive filesystem */
public class C30671mp extends C54192oK {
    public final C56972sr A00;
    public final AnonymousClass3PX A01;
    public final AnonymousClass3PN A02;
    public final AnonymousClass3PO A03;
    public final AnonymousClass3PK A04;
    public final AnonymousClass3PL A05;
    public final C58902w0 A06;
    public final C64773Ex A07;
    public final C56612sH A08;
    public final C620733j A09;
    public final C617332a A0A;
    public final AnonymousClass3PQ A0B;
    public final C27721eR A0C;
    public final AnonymousClass1VX A0D;
    public final C66383Le A0E;
    public final AnonymousClass3PR A0F;
    public final AnonymousClass3PS A0G;
    public final AnonymousClass3PM A0H;
    public final AnonymousClass3PJ A0I;
    public final AnonymousClass3PY A0J;
    public final AnonymousClass3PT A0K;
    public final AnonymousClass3PU A0L;
    public final C57342tU A0M;
    public final AnonymousClass3PV A0N;
    public final AnonymousClass3PW A0O;
    public final C27701eP A0P;
    public final C196439aq A0Q;
    public final AnonymousClass9U4 A0R;
    public final AnonymousClass9SN A0S;
    public final AnonymousClass3PP A0T;
    public final C27731eS A0U;
    public final AnonymousClass3PH A0V;
    public final boolean A0W;

    public AnonymousClass1A3 A0D() {
        AnonymousClass23Q r0;
        String A17;
        C95814uZ A0n;
        C624134x r2 = this.A0J;
        C626936e.A06(r2);
        AnonymousClass1A3 r1 = (AnonymousClass1A3) AnonymousClass1ES.DEFAULT_INSTANCE.A0G();
        AnonymousClass1A1 A0Q2 = C18320x8.A0Q();
        AnonymousClass2z0 r4 = r2.A1J;
        C95814uZ r7 = r4.A00;
        A0Q2.A0C(C627336j.A07(r7));
        boolean z = r4.A02;
        A0Q2.A0D(z);
        A0Q2.A0A(r4.A01);
        r1.A0B((AnonymousClass1ET) A0Q2.A06());
        long j = r2.A0K / 1000;
        r1.A0A(j);
        if (z && r2.A0D != 0) {
            long j2 = r2.A0J / 1000;
            if (j2 > 0 && j2 != j) {
                AnonymousClass1ES A0X = C18310x6.A0X(r1);
                A0X.bitField0_ |= 32;
                A0X.messageC2STimestamp_ = j2;
            }
        }
        AnonymousClass3PQ.A00(r1, r2);
        this.A0V.A00(r1, r2);
        byte b = r2.A1I;
        if (!(b == 7 || (A0n = r2.A0n()) == null || (!C627336j.A0K(r7) && !(r7 instanceof C135166kE) && !C155477ey.A00(A0n)))) {
            r1.A0E(A0n.getRawString());
        }
        boolean z2 = r2 instanceof C30471mV;
        if (z2 && this.A0A != null) {
            AnonymousClass197 r72 = (AnonymousClass197) C21191Aw.DEFAULT_INSTANCE.A0G();
            String str = this.A0A;
            C21191Aw r3 = (C21191Aw) C18320x8.A0C(r72);
            str.getClass();
            r3.bitField0_ |= 1;
            r3.localPath_ = str;
            AnonymousClass1ES A0X2 = C18310x6.A0X(r1);
            C21191Aw r02 = (C21191Aw) r72.A06();
            r02.getClass();
            A0X2.mediaData_ = r02;
            A0X2.bitField0_ |= 67108864;
        }
        AnonymousClass23G A002 = AnonymousClass3PY.A00(r2);
        if (A002 != null) {
            AnonymousClass1ES A0X3 = C18310x6.A0X(r1);
            A0X3.status_ = A002.value;
            A0X3.bitField0_ |= 8;
        }
        if (r2.A1F) {
            AnonymousClass1ES A0X4 = C18310x6.A0X(r1);
            A0X4.bitField0_ |= 128;
            A0X4.starred_ = true;
        }
        if (r2.A1B) {
            AnonymousClass1ES A0X5 = C18310x6.A0X(r1);
            A0X5.bitField0_ |= 256;
            A0X5.broadcast_ = true;
        }
        AnonymousClass3PX.A00(r1, r2);
        if (b != 11) {
            if (b != 12) {
                if (b == 15) {
                    r1.A0C(AnonymousClass23Q.A2j);
                } else if (b != 31) {
                    if (b != 36) {
                        if (r2 instanceof C30291mD) {
                            this.A0Q.A06(r1, (C30291mD) r2);
                        } else {
                            this.A0S.A01(r1, r2);
                            if (b == 16) {
                                this.A0P.A02(r1, r2);
                            }
                        }
                    }
                    C55682qk r8 = this.A0I;
                    C66383Le r73 = this.A0E;
                    boolean z3 = this.A0W;
                    AnonymousClass1A4 A0R2 = C18300x5.A0R();
                    if (z2 && (A17 = r2.A17()) != null) {
                        try {
                            Base64.decode(A17, 0);
                        } catch (IllegalArgumentException unused) {
                            r8.A0A("webquery/invalid hash", false, (String) null);
                            r2.A1d((String) null);
                        }
                    }
                    try {
                        C47222cu A003 = C47222cu.A00(A0R2);
                        A003.A03 = true;
                        A003.A02 = z3;
                        A003.A00 = r2.A0v();
                        r73.A01(A003.A01(), r2);
                    } catch (AnonymousClass24A e) {
                        Log.e("FMessageWebQuery/setE2EMessage/invalid message", e);
                    }
                    AnonymousClass1EU A0W2 = AnonymousClass0x9.A0W(A0R2);
                    AnonymousClass1ES A0X6 = C18310x6.A0X(r1);
                    A0W2.getClass();
                    A0X6.message_ = A0W2;
                    A0X6.bitField0_ |= 2;
                }
                this.A0I.A00(r1, r2);
                this.A04.A00(r1, r2);
                this.A0T.A00(r1, r2);
                this.A0H.A01(r1, r2);
                this.A05.A00(r1, r2);
                return r1;
            }
            C624034w r03 = r2.A0P;
            if (r03 == null || r03.A08 == null) {
                r0 = AnonymousClass23Q.A1i;
            } else {
                r0 = AnonymousClass23Q.A2W;
            }
            r1.A0C(r0);
            this.A0S.A01(r1, r2);
            this.A0I.A00(r1, r2);
            this.A04.A00(r1, r2);
            this.A0T.A00(r1, r2);
            this.A0H.A01(r1, r2);
            this.A05.A00(r1, r2);
            return r1;
        }
        C624034w r04 = r2.A0P;
        if (r04 == null || r04.A08 == null) {
            r0 = AnonymousClass23Q.A1F;
        } else {
            r0 = AnonymousClass23Q.A2V;
        }
        r1.A0C(r0);
        this.A0S.A01(r1, r2);
        this.A0I.A00(r1, r2);
        this.A04.A00(r1, r2);
        this.A0T.A00(r1, r2);
        this.A0H.A01(r1, r2);
        this.A05.A00(r1, r2);
        return r1;
    }

    public C30671mp(C55682qk r3, C56972sr r4, AnonymousClass3PX r5, AnonymousClass3PN r6, AnonymousClass3PO r7, AnonymousClass3PK r8, AnonymousClass3PL r9, C58902w0 r10, C64773Ex r11, C56612sH r12, C620733j r13, C617332a r14, AnonymousClass3PQ r15, C27721eR r16, AnonymousClass1VX r17, C66383Le r18, AnonymousClass3PR r19, AnonymousClass3PS r20, AnonymousClass3PM r21, AnonymousClass3PJ r22, AnonymousClass3PY r23, AnonymousClass3PT r24, AnonymousClass3PU r25, C57342tU r26, AnonymousClass3PV r27, AnonymousClass3PW r28, C27701eP r29, C196439aq r30, AnonymousClass9U4 r31, AnonymousClass9SN r32, AnonymousClass3PP r33, C27731eS r34, AnonymousClass3PH r35) {
        super(r3, (C624134x) null);
        this.A0M = r26;
        this.A02 = r6;
        this.A0U = r34;
        this.A0C = r16;
        this.A0I = r22;
        this.A0O = r28;
        this.A0K = r24;
        this.A03 = r7;
        this.A01 = r5;
        this.A0J = r23;
        this.A0N = r27;
        this.A04 = r8;
        this.A0P = r29;
        this.A0L = r25;
        this.A0T = r33;
        this.A0B = r15;
        this.A0H = r21;
        this.A0V = r35;
        this.A0F = r19;
        this.A0G = r20;
        this.A08 = r12;
        this.A0D = r17;
        this.A00 = r4;
        this.A07 = r11;
        this.A09 = r13;
        this.A0R = r31;
        this.A0S = r32;
        this.A06 = r10;
        this.A0Q = r30;
        this.A0A = r14;
        this.A0E = r18;
        this.A0W = false;
        this.A05 = r9;
    }

    public C30671mp(C55682qk r3, C56972sr r4, AnonymousClass3PX r5, AnonymousClass3PN r6, AnonymousClass3PO r7, AnonymousClass3PK r8, AnonymousClass3PL r9, C58902w0 r10, AnonymousClass3PQ r11, C27721eR r12, AnonymousClass1VX r13, C66383Le r14, AnonymousClass3PR r15, AnonymousClass3PS r16, AnonymousClass3PM r17, AnonymousClass3PJ r18, AnonymousClass3PY r19, AnonymousClass3PT r20, AnonymousClass3PU r21, C57342tU r22, AnonymousClass3PV r23, AnonymousClass3PW r24, C27701eP r25, C196439aq r26, AnonymousClass9SN r27, AnonymousClass3PP r28, C27731eS r29, AnonymousClass3PH r30, C624134x r31) {
        super(r3, r31);
        this.A0M = r22;
        this.A02 = r6;
        this.A0U = r29;
        this.A0I = r18;
        this.A0C = r12;
        this.A0O = r24;
        this.A0K = r20;
        this.A03 = r7;
        this.A01 = r5;
        this.A0J = r19;
        this.A0N = r23;
        this.A04 = r8;
        this.A0P = r25;
        this.A0L = r21;
        this.A0T = r28;
        this.A0B = r11;
        this.A0H = r17;
        this.A0V = r30;
        this.A0F = r15;
        this.A0G = r16;
        this.A0D = r13;
        this.A00 = r4;
        this.A0S = r27;
        this.A06 = r10;
        this.A0Q = r26;
        this.A0E = r14;
        this.A0W = true;
        this.A08 = null;
        this.A07 = null;
        this.A09 = null;
        this.A0R = null;
        this.A0A = null;
        this.A05 = r9;
    }
}
