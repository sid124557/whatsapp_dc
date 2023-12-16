package X;

import android.text.TextUtils;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3OB  reason: invalid class name */
public class AnonymousClass3OB implements AnonymousClass4AG, AnonymousClass4AJ, C85364Fy {
    public final C55682qk A00;
    public final AnonymousClass1VX A01;
    public final C59542x5 A02;
    public final C51992ki A03;

    public void AyD(C55032pg r8, C624134x r9) {
        UserJid userJid;
        if (r9 instanceof C30761my) {
            C30761my r92 = (C30761my) r9;
            AnonymousClass1A4 r4 = r8.A00;
            AnonymousClass1DU r0 = ((AnonymousClass1EU) r4.A00).productMessage_;
            if (r0 == null) {
                r0 = AnonymousClass1DU.DEFAULT_INSTANCE;
            }
            AnonymousClass17L r3 = (AnonymousClass17L) r0.A0H();
            AnonymousClass1DU r02 = ((AnonymousClass1EU) r4.A00).productMessage_;
            if (r02 == null) {
                r02 = AnonymousClass1DU.DEFAULT_INSTANCE;
            }
            AnonymousClass1CF r03 = r02.catalog_;
            if (r03 == null) {
                r03 = AnonymousClass1CF.DEFAULT_INSTANCE;
            }
            C130546c9 A0H = r03.A0H();
            C51992ki r1 = this.A03;
            AnonymousClass1EE r04 = ((AnonymousClass1CF) A0H.A00).catalogImage_;
            if (r04 == null) {
                r04 = AnonymousClass1EE.DEFAULT_INSTANCE;
            }
            C207219b A012 = r1.A01(r8, (C207219b) r04.A0H(), r92);
            if (A012 == null || (userJid = r92.A00) == null) {
                StringBuilder A0o = AnonymousClass001.A0o();
                C624134x.A0S(r92, "FMessageCatalog/buildE2eMessage/unable to send encrypted media message due to missing mediaKey or businessOwnerJid; message.key=", A0o);
                C624134x.A0T(r92, "; media_wa_type=", A0o);
                A0o.append("; business_owner_jid=");
                C18270x1.A17(r92.A00, A0o);
                if (r92.A00 == null && r8.A02 && C56952sp.A0E(this.A01)) {
                    throw AnonymousClass24A.A00(0);
                }
                return;
            }
            String A0g = C18300x5.A0g(r3, userJid);
            AnonymousClass1DU r12 = (AnonymousClass1DU) r3.A00;
            A0g.getClass();
            r12.bitField0_ |= 2;
            r12.businessOwnerJid_ = A0g;
            if (!TextUtils.isEmpty(r92.A01)) {
                String str = r92.A01;
                AnonymousClass1CF r13 = (AnonymousClass1CF) C18320x8.A0C(A0H);
                str.getClass();
                r13.bitField0_ |= 4;
                r13.description_ = str;
            }
            if (!TextUtils.isEmpty(r92.A02)) {
                String str2 = r92.A02;
                AnonymousClass1CF r14 = (AnonymousClass1CF) C18320x8.A0C(A0H);
                str2.getClass();
                r14.bitField0_ |= 2;
                r14.title_ = str2;
            }
            AnonymousClass1CF r15 = (AnonymousClass1CF) C18320x8.A0C(A0H);
            AnonymousClass1EE r05 = (AnonymousClass1EE) A012.A06();
            r05.getClass();
            r15.catalogImage_ = r05;
            r15.bitField0_ |= 1;
            AnonymousClass1DU r16 = (AnonymousClass1DU) C18320x8.A0C(r3);
            AnonymousClass1CF r06 = (AnonymousClass1CF) A0H.A06();
            r06.getClass();
            r16.catalog_ = r06;
            r16.bitField0_ |= 4;
            AnonymousClass3Z2 r2 = r8.A01;
            byte[] bArr = r8.A09;
            if (C59542x5.A01(r2, r92, bArr)) {
                AnonymousClass1EF A002 = C55032pg.A00(this.A02, r8, r2, r92, bArr);
                AnonymousClass1DU r17 = (AnonymousClass1DU) C18320x8.A0C(r3);
                A002.getClass();
                r17.contextInfo_ = A002;
                r17.bitField0_ |= 32;
            }
            AnonymousClass1EU A0T = C18290x4.A0T(r4);
            AnonymousClass1DU r07 = (AnonymousClass1DU) r3.A06();
            r07.getClass();
            A0T.productMessage_ = r07;
            A0T.bitField0_ |= EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
            return;
        }
        throw AnonymousClass001.A0c("FMessageCatalogProtobuf/not supported message");
    }

    public C624134x BgW(C55962rC r6) {
        AnonymousClass1EU r4 = r6.A0B;
        if ((r4.bitField0_ & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) == 0) {
            return null;
        }
        AnonymousClass1DU r0 = r4.productMessage_;
        if (r0 == null) {
            r0 = AnonymousClass1DU.DEFAULT_INSTANCE;
        }
        if ((r0.bitField0_ & 4) == 0) {
            return null;
        }
        this.A00.A0A("fmessage-protobuf-catalog-deprecation", true, "");
        AnonymousClass1DU r42 = r4.productMessage_;
        if (r42 == null) {
            r42 = AnonymousClass1DU.DEFAULT_INSTANCE;
        }
        C626936e.A06(r42);
        C30761my r2 = new C30761my(r6.A0D, r6.A05);
        try {
            r2.A00 = AnonymousClass32Y.A09(r42.businessOwnerJid_);
        } catch (AnonymousClass24P unused) {
        }
        if (r2.A00 != null) {
            AnonymousClass1CF r1 = r42.catalog_;
            if (r1 == null) {
                r1 = AnonymousClass1CF.DEFAULT_INSTANCE;
            }
            r2.A02 = r1.title_;
            r2.A01 = r1.description_;
            AnonymousClass1EE r12 = r1.catalogImage_;
            if (r12 == null) {
                r12 = AnonymousClass1EE.DEFAULT_INSTANCE;
            }
            C51992ki.A00(r6, r12, r2, this.A03);
            return r2;
        }
        throw AnonymousClass24W.A00(0);
    }

    public AnonymousClass3OB(C55682qk r1, AnonymousClass1VX r2, C59542x5 r3, C51992ki r4) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
    }
}
