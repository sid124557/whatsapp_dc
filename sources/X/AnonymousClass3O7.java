package X;

import android.text.TextUtils;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.jid.UserJid;
import java.math.BigDecimal;

/* renamed from: X.3O7  reason: invalid class name */
public class AnonymousClass3O7 implements AnonymousClass4AG, AnonymousClass4AJ, C85364Fy {
    public final AnonymousClass1VX A00;
    public final C59542x5 A01;
    public final C51992ki A02;

    public void AyD(C55032pg r10, C624134x r11) {
        UserJid userJid;
        if (r11 instanceof C30771mz) {
            C30771mz r112 = (C30771mz) r11;
            AnonymousClass1A4 r4 = r10.A00;
            AnonymousClass1DU r0 = ((AnonymousClass1EU) r4.A00).productMessage_;
            if (r0 == null) {
                r0 = AnonymousClass1DU.DEFAULT_INSTANCE;
            }
            AnonymousClass17L r3 = (AnonymousClass17L) r0.A0H();
            AnonymousClass1DU r02 = ((AnonymousClass1EU) r4.A00).productMessage_;
            if (r02 == null) {
                r02 = AnonymousClass1DU.DEFAULT_INSTANCE;
            }
            C21951Du r03 = r02.product_;
            if (r03 == null) {
                r03 = C21951Du.DEFAULT_INSTANCE;
            }
            C130546c9 A0H = r03.A0H();
            C51992ki r1 = this.A02;
            AnonymousClass1EE r04 = ((C21951Du) A0H.A00).productImage_;
            if (r04 == null) {
                r04 = AnonymousClass1EE.DEFAULT_INSTANCE;
            }
            C207219b A012 = r1.A01(r10, (C207219b) r04.A0H(), r112);
            if (A012 == null || (userJid = r112.A01) == null) {
                StringBuilder A0o = AnonymousClass001.A0o();
                C624134x.A0S(r112, "FMessageProduct/buildE2eMessage/unable to send encrypted media message due to missing mediaKey or businessOwnerJid; message.key=", A0o);
                C624134x.A0T(r112, "; media_wa_type=", A0o);
                A0o.append("; business_owner_jid=");
                C18270x1.A17(r112.A01, A0o);
                if (r112.A01 == null && r10.A02 && C56952sp.A0E(this.A00)) {
                    throw AnonymousClass24A.A00(0);
                }
                return;
            }
            String A0g = C18300x5.A0g(r3, userJid);
            AnonymousClass1DU r12 = (AnonymousClass1DU) r3.A00;
            A0g.getClass();
            r12.bitField0_ |= 2;
            r12.businessOwnerJid_ = A0g;
            if (!TextUtils.isEmpty(r112.A06)) {
                String str = r112.A06;
                C21951Du r13 = (C21951Du) C18320x8.A0C(A0H);
                str.getClass();
                r13.bitField0_ |= 2;
                r13.productId_ = str;
            }
            if (!TextUtils.isEmpty(r112.A04)) {
                String str2 = r112.A04;
                C21951Du r14 = (C21951Du) C18320x8.A0C(A0H);
                str2.getClass();
                r14.bitField0_ |= 8;
                r14.description_ = str2;
            }
            if (!TextUtils.isEmpty(r112.A09)) {
                String str3 = r112.A09;
                C21951Du r15 = (C21951Du) C18320x8.A0C(A0H);
                str3.getClass();
                r15.bitField0_ |= 4;
                r15.title_ = str3;
            }
            if (!TextUtils.isEmpty(r112.A02)) {
                String str4 = r112.A02;
                AnonymousClass1DU r16 = (AnonymousClass1DU) C18320x8.A0C(r3);
                str4.getClass();
                r16.bitField0_ |= 8;
                r16.body_ = str4;
            }
            if (!TextUtils.isEmpty(r112.A05)) {
                String str5 = r112.A05;
                AnonymousClass1DU r17 = (AnonymousClass1DU) C18320x8.A0C(r3);
                str5.getClass();
                r17.bitField0_ |= 16;
                r17.footer_ = str5;
            }
            if (!TextUtils.isEmpty(r112.A03) && r112.A0A != null) {
                String str6 = r112.A03;
                C21951Du r18 = (C21951Du) C18320x8.A0C(A0H);
                str6.getClass();
                r18.bitField0_ |= 16;
                r18.currencyCode_ = str6;
                BigDecimal bigDecimal = r112.A0A;
                BigDecimal bigDecimal2 = C57952uT.A00;
                long longValue = bigDecimal.multiply(bigDecimal2).longValue();
                C21951Du r6 = (C21951Du) C18320x8.A0C(A0H);
                r6.bitField0_ |= 32;
                r6.priceAmount1000_ = longValue;
                BigDecimal bigDecimal3 = r112.A0B;
                if (!(bigDecimal3 == null || BigDecimal.ZERO.compareTo(bigDecimal3) == 0)) {
                    long longValue2 = r112.A0B.multiply(bigDecimal2).longValue();
                    C21951Du r62 = (C21951Du) C18320x8.A0C(A0H);
                    r62.bitField0_ |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
                    r62.salePriceAmount1000_ = longValue2;
                }
            }
            if (!TextUtils.isEmpty(r112.A08)) {
                String str7 = r112.A08;
                C21951Du r19 = (C21951Du) C18320x8.A0C(A0H);
                str7.getClass();
                r19.bitField0_ |= 64;
                r19.retailerId_ = str7;
            }
            if (!TextUtils.isEmpty(r112.A07)) {
                String str8 = r112.A07;
                C21951Du r110 = (C21951Du) C18320x8.A0C(A0H);
                str8.getClass();
                r110.bitField0_ |= 128;
                r110.url_ = str8;
            }
            int i = r112.A00;
            C21951Du r111 = (C21951Du) C18320x8.A0C(A0H);
            r111.bitField0_ |= 256;
            r111.productImageCount_ = i;
            C21951Du r113 = (C21951Du) C18320x8.A0C(A0H);
            AnonymousClass1EE r05 = (AnonymousClass1EE) A012.A06();
            r05.getClass();
            r113.productImage_ = r05;
            r113.bitField0_ |= 1;
            AnonymousClass1DU r114 = (AnonymousClass1DU) C18320x8.A0C(r3);
            C21951Du r06 = (C21951Du) A0H.A06();
            r06.getClass();
            r114.product_ = r06;
            r114.bitField0_ |= 1;
            AnonymousClass3Z2 r2 = r10.A01;
            byte[] bArr = r10.A09;
            if (C59542x5.A01(r2, r112, bArr)) {
                AnonymousClass1EF A002 = C55032pg.A00(this.A01, r10, r2, r112, bArr);
                AnonymousClass1DU r115 = (AnonymousClass1DU) C18320x8.A0C(r3);
                A002.getClass();
                r115.contextInfo_ = A002;
                r115.bitField0_ |= 32;
            }
            AnonymousClass1EU A0T = C18290x4.A0T(r4);
            AnonymousClass1DU r07 = (AnonymousClass1DU) r3.A06();
            r07.getClass();
            A0T.productMessage_ = r07;
            A0T.bitField0_ |= EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
            return;
        }
        throw AnonymousClass001.A0c("FMessageProductProtobuf/not supported message");
    }

    public C624134x BgW(C55962rC r7) {
        AnonymousClass1EU r2 = r7.A0B;
        if ((r2.bitField0_ & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) == 0) {
            return null;
        }
        AnonymousClass1DU r0 = r2.productMessage_;
        AnonymousClass1DU r5 = r0;
        if (r0 == null) {
            r0 = AnonymousClass1DU.DEFAULT_INSTANCE;
        }
        if ((r0.bitField0_ & 1) == 0) {
            return null;
        }
        if (r5 == null) {
            r5 = AnonymousClass1DU.DEFAULT_INSTANCE;
        }
        C626936e.A06(r5);
        C30771mz r3 = new C30771mz(r7.A0D, r7.A05);
        try {
            r3.A01 = AnonymousClass32Y.A09(r5.businessOwnerJid_);
        } catch (AnonymousClass24P unused) {
        }
        if (r3.A01 != null) {
            C21951Du r4 = r5.product_;
            if (r4 == null) {
                r4 = C21951Du.DEFAULT_INSTANCE;
            }
            r3.A06 = r4.productId_;
            r3.A09 = r4.title_;
            r3.A02 = r5.body_;
            r3.A05 = r5.footer_;
            r3.A04 = r4.description_;
            String str = r4.currencyCode_;
            r3.A03 = str;
            if (!TextUtils.isEmpty(str)) {
                try {
                    r3.A0A = C57952uT.A00(new C160617ny(r3.A03), r4.priceAmount1000_);
                    r3.A0B = C57952uT.A00(new C160617ny(r3.A03), r4.salePriceAmount1000_);
                } catch (IllegalArgumentException unused2) {
                    r3.A03 = null;
                }
            }
            r3.A08 = r4.retailerId_;
            r3.A07 = r4.url_;
            r3.A00 = r4.productImageCount_;
            AnonymousClass1EE r1 = r4.productImage_;
            if (r1 == null) {
                r1 = AnonymousClass1EE.DEFAULT_INSTANCE;
            }
            C51992ki.A00(r7, r1, r3, this.A02);
            return r3;
        }
        throw AnonymousClass24W.A00(0);
    }

    public AnonymousClass3O7(AnonymousClass1VX r1, C59542x5 r2, C51992ki r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
