package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.math.BigDecimal;

/* renamed from: X.3PP  reason: invalid class name */
public final class AnonymousClass3PP implements AnonymousClass4D2 {
    public final AnonymousClass1VX A00;
    public final AnonymousClass9U4 A01;
    public final AnonymousClass9SN A02;

    public final void A00(AnonymousClass1A3 r11, C624134x r12) {
        C624034w r6;
        if (this.A00.A0Y(C58422vE.A02, 1954) && (r6 = r12.A0P) != null && r6.A0L != null) {
            C130546c9 A0G = AnonymousClass1E3.DEFAULT_INSTANCE.A0G();
            AnonymousClass1S4 r4 = r6.A0A;
            if (r4 != null) {
                C130546c9 A0G2 = AnonymousClass1E9.DEFAULT_INSTANCE.A0G();
                AnonymousClass1A1 A0Q = C18320x8.A0Q();
                A0Q.A0A(r6.A0L);
                A0Q.A0D(r6.A0Q);
                A0Q.A0C(C627336j.A07(r6.A0C));
                AnonymousClass1ET r0 = (AnonymousClass1ET) A0Q.A06();
                AnonymousClass1E9 r1 = (AnonymousClass1E9) C18320x8.A0C(A0G2);
                r0.getClass();
                r1.messageKey_ = r0;
                r1.bitField0_ |= 64;
                AnonymousClass1E9 r5 = (AnonymousClass1E9) C18320x8.A0C(A0G2);
                r5.bitField0_ |= 256;
                r5.previousType_ = (long) r4.A09();
                AnonymousClass1E9 r52 = (AnonymousClass1E9) C18320x8.A0C(A0G2);
                r52.bitField0_ |= 128;
                r52.previousStatus_ = (long) r4.A08();
                long A0B = r4.A0B();
                AnonymousClass1E9 r53 = (AnonymousClass1E9) C18320x8.A0C(A0G2);
                r53.bitField0_ |= 8;
                r53.expiryTimestamp_ = A0B;
                String valueOf = String.valueOf(r4.A07());
                AnonymousClass1E9 r13 = (AnonymousClass1E9) C18320x8.A0C(A0G2);
                r13.bitField0_ |= 4;
                r13.counter_ = valueOf;
                int i = r6.A04;
                AnonymousClass1E9 r14 = (AnonymousClass1E9) C18320x8.A0C(A0G2);
                r14.bitField0_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
                r14.version_ = i;
                C130546c9 A0G3 = AnonymousClass1BZ.DEFAULT_INSTANCE.A0G();
                AnonymousClass39U r54 = r4.A02;
                if (r54 != null) {
                    String str = r54.A01;
                    AnonymousClass1BZ r15 = (AnonymousClass1BZ) C18320x8.A0C(A0G3);
                    str.getClass();
                    r15.bitField0_ |= 1;
                    r15.id_ = str;
                    AnonymousClass1A1 A0Q2 = C18320x8.A0Q();
                    A0Q2.A0A(r54.A02);
                    A0Q2.A0D(false);
                    AnonymousClass1ET r02 = (AnonymousClass1ET) A0Q2.A06();
                    AnonymousClass1BZ r16 = (AnonymousClass1BZ) C18320x8.A0C(A0G3);
                    r02.getClass();
                    r16.messageKey_ = r02;
                    r16.bitField0_ |= 2;
                    AnonymousClass1BZ r03 = (AnonymousClass1BZ) A0G3.A06();
                    AnonymousClass1E9 r17 = (AnonymousClass1E9) C18320x8.A0C(A0G2);
                    r03.getClass();
                    r17.order_ = r03;
                    r17.bitField0_ |= DefaultCrypto.BUFFER_SIZE;
                }
                AnonymousClass39L r7 = r4.A01;
                if (r7 != null) {
                    C130546c9 A0G4 = AnonymousClass1CI.DEFAULT_INSTANCE.A0G();
                    AnonymousClass1CI r55 = (AnonymousClass1CI) C18320x8.A0C(A0G4);
                    r55.bitField0_ |= 1;
                    r55.value_ = (long) r7.A00();
                    int i2 = r7.A00;
                    AnonymousClass1CI r18 = (AnonymousClass1CI) C18320x8.A0C(A0G4);
                    r18.bitField0_ |= 2;
                    r18.offset_ = i2;
                    String str2 = ((AnonymousClass3H6) r7.A01).A04;
                    AnonymousClass1CI r19 = (AnonymousClass1CI) C18320x8.A0C(A0G4);
                    str2.getClass();
                    r19.bitField0_ |= 4;
                    r19.currencyCode_ = str2;
                    AnonymousClass1CI r04 = (AnonymousClass1CI) A0G4.A06();
                    AnonymousClass1E9 r110 = (AnonymousClass1E9) C18320x8.A0C(A0G2);
                    r04.getClass();
                    r110.amount_ = r04;
                    r110.bitField0_ |= 1;
                }
                C21421Bt A0I = r4.A0I();
                if (A0I != null) {
                    AnonymousClass1E9 r111 = (AnonymousClass1E9) C18320x8.A0C(A0G2);
                    r111.marketMetadata_ = A0I;
                    r111.bitField0_ |= ZipDecompressor.UNZIP_BUFFER_SIZE;
                }
                AnonymousClass1E9 r05 = (AnonymousClass1E9) A0G2.A06();
                AnonymousClass1E3 r112 = (AnonymousClass1E3) C18320x8.A0C(A0G);
                r05.getClass();
                r112.metadata_ = r05;
                r112.bitField0_ |= DefaultCrypto.BUFFER_SIZE;
            }
            if (r6.A0K != null) {
                String str3 = r12.A15;
                AnonymousClass1E3 r113 = (AnonymousClass1E3) C18320x8.A0C(A0G);
                str3.getClass();
                r113.bitField0_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
                r113.transactionId_ = str3;
            }
            String str4 = r6.A0I;
            AnonymousClass1E3 r114 = (AnonymousClass1E3) C18320x8.A0C(A0G);
            str4.getClass();
            r114.bitField0_ |= 8;
            r114.currency_ = str4;
            String str5 = r6.A0H;
            if (str5 != null) {
                AnonymousClass1E3 r115 = (AnonymousClass1E3) C18320x8.A0C(A0G);
                r115.bitField0_ |= 4;
                r115.credentialId_ = str5;
            }
            UserJid userJid = r6.A0E;
            if (userJid != null) {
                String A0g = C18300x5.A0g(A0G, userJid);
                AnonymousClass1E3 r116 = (AnonymousClass1E3) A0G.A00;
                A0g.getClass();
                r116.bitField0_ |= 256;
                r116.senderJid_ = A0g;
            }
            UserJid userJid2 = r6.A0D;
            if (userJid2 != null) {
                String A0g2 = C18300x5.A0g(A0G, userJid2);
                AnonymousClass1E3 r117 = (AnonymousClass1E3) A0G.A00;
                A0g2.getClass();
                r117.bitField0_ |= 128;
                r117.recieverJid_ = A0g2;
            }
            long j = (long) r6.A02;
            AnonymousClass1E3 r42 = (AnonymousClass1E3) C18320x8.A0C(A0G);
            r42.bitField0_ |= 512;
            r42.status_ = j;
            String str6 = r6.A0J;
            if (str6 != null) {
                AnonymousClass1E3 r118 = (AnonymousClass1E3) C18320x8.A0C(A0G);
                r118.bitField0_ |= 16;
                r118.errorCode_ = str6;
            }
            String str7 = r6.A0F;
            if (str7 != null) {
                AnonymousClass1E3 r119 = (AnonymousClass1E3) C18320x8.A0C(A0G);
                r119.bitField0_ |= 2;
                r119.bankTransactionId_ = str7;
            }
            long j2 = r6.A05;
            AnonymousClass1E3 r120 = (AnonymousClass1E3) C18320x8.A0C(A0G);
            r120.bitField0_ |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
            r120.timestamp_ = j2;
            int i3 = r6.A03;
            AnonymousClass1E3 r121 = (AnonymousClass1E3) C18320x8.A0C(A0G);
            r121.bitField0_ |= ZipDecompressor.UNZIP_BUFFER_SIZE;
            r121.type_ = i3;
            String str8 = r6.A0L;
            AnonymousClass1E3 r122 = (AnonymousClass1E3) C18320x8.A0C(A0G);
            str8.getClass();
            r122.bitField0_ |= 64;
            r122.messageStanzaId_ = str8;
            AnonymousClass1ES A0X = C18310x6.A0X(r11);
            AnonymousClass1E3 r06 = (AnonymousClass1E3) A0G.A06();
            r06.getClass();
            A0X.paymentTransactionInfo_ = r06;
            A0X.bitField1_ |= 64;
        }
    }

    public final void A01(AnonymousClass1ES r35, C624134x r36) {
        C85204Fi r5;
        String str;
        int i;
        C203719oC A012;
        try {
            AnonymousClass1E3 r6 = r35.paymentTransactionInfo_;
            if (r6 == null) {
                r6 = AnonymousClass1E3.DEFAULT_INSTANCE;
            }
            C162457s7.A0D(r6);
            String str2 = r6.transactionId_;
            if (str2 != null && str2.length() != 0) {
                C624134x r7 = r36;
                r7.A15 = str2;
                AnonymousClass1E9 r8 = r6.metadata_;
                if (r8 == null) {
                    r8 = AnonymousClass1E9.DEFAULT_INSTANCE;
                }
                C21421Bt r0 = r8.marketMetadata_;
                if (r0 == null) {
                    r0 = C21421Bt.DEFAULT_INSTANCE;
                }
                int i2 = r0.metadataValueCase_;
                if (i2 == 2) {
                    r5 = AnonymousClass1S3.A04;
                    C162457s7.A0F(r5);
                    str = "BR";
                    i = 2;
                } else if (i2 == 1) {
                    r5 = AnonymousClass1S3.A05;
                    C162457s7.A0F(r5);
                    str = "IN";
                    i = 1;
                } else {
                    throw AnonymousClass001.A0e("Payment Market not supported");
                }
                int i3 = r6.type_;
                UserJid A0A = AnonymousClass32Y.A0A(r6.senderJid_);
                UserJid A0A2 = AnonymousClass32Y.A0A(r6.recieverJid_);
                String str3 = r6.currency_;
                AnonymousClass1CI r02 = r8.amount_;
                if (r02 == null) {
                    r02 = AnonymousClass1CI.DEFAULT_INSTANCE;
                }
                BigDecimal bigDecimal = new BigDecimal(r02.value_);
                AnonymousClass1CI r03 = r8.amount_;
                if (r03 == null) {
                    r03 = AnonymousClass1CI.DEFAULT_INSTANCE;
                }
                AnonymousClass39Q r9 = new AnonymousClass39Q(bigDecimal, r03.offset_);
                long j = r6.timestamp_;
                String str4 = r6.transactionId_;
                int i4 = (int) r6.status_;
                long j2 = r8.lastStatusTimestamp_;
                String str5 = r6.credentialId_;
                String str6 = r6.errorCode_;
                String str7 = r6.bankTransactionId_;
                C85204Fi r14 = r5;
                AnonymousClass39Q r15 = r9;
                C624034w r13 = new C624034w(r14, r15, A0A, A0A2, str3, str4, str5, str6, str7, r8.collectRequestId_, str, i3, i4, r8.version_, i, 0, j, j2);
                AnonymousClass9SU A0F = this.A01.A0F(str);
                if (!(A0F == null || (A012 = A0F.A01(((AnonymousClass3H6) r5).A04)) == null)) {
                    r13.A0A = A012.BG4();
                }
                r13.A0L = r6.messageStanzaId_;
                r7.A0P = r13;
            }
        } catch (AnonymousClass24P unused) {
            Log.e("Invalid Jid in payment transaction");
        }
    }

    public AnonymousClass3PP(AnonymousClass1VX r1, AnonymousClass9U4 r2, AnonymousClass9SN r3) {
        C18260x0.A0V(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public void BYV(C52952mJ r2, AnonymousClass1A3 r3, C624134x r4) {
        C18260x0.A0O(r4, r3);
        this.A02.A01(r3, r4);
        A00(r3, r4);
    }

    public void BYW(C50972j4 r1, AnonymousClass1ES r2, C624134x r3) {
        C18260x0.A0O(r2, r3);
        A01(r2, r3);
    }
}
