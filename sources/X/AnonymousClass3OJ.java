package X;

import android.text.TextUtils;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.TextData;
import java.util.ArrayList;

/* renamed from: X.3OJ  reason: invalid class name */
public class AnonymousClass3OJ implements AnonymousClass4AG, AnonymousClass4AJ, C85364Fy {
    public final C58902w0 A00;
    public final AnonymousClass3NX A01;
    public final C59542x5 A02;
    public final C106685Zz A03;
    public final AnonymousClass9TU A04;
    public final C183538qC A05;

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00a8, code lost:
        if ((r4 & 128) == 0) goto L_0x00d2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x014b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C106685Zz r6, X.AnonymousClass1EC r7, X.C30481mW r8) {
        /*
            java.lang.String r1 = r7.text_
            r3 = 65536(0x10000, float:9.18355E-41)
            java.lang.String r0 = X.C107575bX.A0C(r1, r3)
            r8.A1Z(r0)
            java.lang.String r5 = r7.matchedText_
            r4 = 0
            java.util.ArrayList r1 = r6.A05(r1, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r2 = 2
            if (r0 != 0) goto L_0x0031
            if (r1 == 0) goto L_0x009a
            if (r5 == 0) goto L_0x009a
            java.util.Iterator r1 = r1.iterator()
        L_0x0021:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x009a
            java.lang.String r0 = X.AnonymousClass001.A0m(r1)
            boolean r0 = android.text.TextUtils.equals(r0, r5)
            if (r0 == 0) goto L_0x0021
        L_0x0031:
            int r0 = r7.bitField0_
            r0 = r0 & 16
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = r7.title_
            java.lang.String r0 = X.C107575bX.A0C(r0, r3)
            r8.A06 = r0
        L_0x003f:
            int r0 = r7.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x004d
            java.lang.String r0 = r7.description_
            java.lang.String r0 = X.C107575bX.A0C(r0, r3)
            r8.A04 = r0
        L_0x004d:
            int r6 = r7.bitField0_
            r0 = r6 & 4
            if (r0 == 0) goto L_0x0057
            java.lang.String r0 = r7.canonicalUrl_
            r8.A07 = r0
        L_0x0057:
            r0 = r6 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0071
            int r1 = r7.previewType_
            if (r1 == 0) goto L_0x0162
            r0 = 1
            if (r1 == r0) goto L_0x015e
            r0 = 4
            if (r1 == r0) goto L_0x015a
            r0 = 5
            if (r1 != r0) goto L_0x0162
            X.22y r5 = X.C375222y.IMAGE
        L_0x006a:
            X.22y r0 = X.C375222y.VIDEO
            if (r5 != r0) goto L_0x014b
            r1 = 1
        L_0x006f:
            r8.A01 = r1
        L_0x0071:
            r0 = r6 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x007e
            X.8Lq r0 = r7.jpegThumbnail_
            byte[] r0 = r0.A07()
            r8.A1y(r0)
        L_0x007e:
            int r1 = r7.bitField0_
            r0 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x009a
            int r1 = r7.inviteLinkGroupTypeV2_
            if (r1 == 0) goto L_0x0147
            r0 = 1
            if (r1 == r0) goto L_0x0143
            if (r1 == r2) goto L_0x013f
            r0 = 3
            if (r1 != r0) goto L_0x0147
            X.22x r1 = X.C375122x.DEFAULT_SUB
        L_0x0093:
            X.22x r0 = X.C375122x.PARENT
            if (r1 != r0) goto L_0x012c
            r0 = 1
        L_0x0098:
            r8.A00 = r0
        L_0x009a:
            int r4 = r7.bitField0_
            r0 = r4 & 64
            r5 = 1
            if (r0 != 0) goto L_0x00aa
            r5 = 0
            r0 = r4 & 32
            if (r0 != 0) goto L_0x00aa
            r0 = r4 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00d2
        L_0x00aa:
            com.whatsapp.TextData r1 = new com.whatsapp.TextData
            r1.<init>()
            if (r5 == 0) goto L_0x00b5
            int r0 = r7.backgroundArgb_
            r1.backgroundColor = r0
        L_0x00b5:
            r0 = r4 & 32
            if (r0 == 0) goto L_0x00bd
            int r0 = r7.textArgb_
            r1.textColor = r0
        L_0x00bd:
            r0 = r4 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00cf
            int r0 = r7.font_
            X.23L r0 = X.AnonymousClass23L.A00(r0)
            if (r0 != 0) goto L_0x00cb
            X.23L r0 = X.AnonymousClass23L.SANS_SERIF
        L_0x00cb:
            int r0 = r0.value
            r1.fontStyle = r0
        L_0x00cf:
            r8.A1x(r1)
        L_0x00d2:
            r0 = r4 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x012b
            r0 = r4 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x012b
            X.2qb r5 = new X.2qb
            r5.<init>()
            java.lang.String r0 = r7.thumbnailDirectPath_
            r5.A04 = r0
            X.8Lq r0 = r7.thumbnailSha256_
            java.lang.String r0 = X.C18320x8.A0d(r0, r2)
            r5.A08 = r0
            int r0 = r7.bitField0_
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x00f9
            X.8Lq r0 = r7.thumbnailEncSha256_
            java.lang.String r0 = X.C18320x8.A0d(r0, r2)
            r5.A05 = r0
        L_0x00f9:
            int r1 = r7.bitField0_
            r0 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0109
            X.8Lq r0 = r7.mediaKey_
            byte[] r0 = r0.A07()
            r5.A0A = r0
        L_0x0109:
            int r4 = r7.bitField0_
            r0 = r4 & r3
            if (r0 == 0) goto L_0x0116
            long r2 = r7.mediaKeyTimestamp_
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            r5.A02 = r2
        L_0x0116:
            r0 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r4
            if (r0 == 0) goto L_0x011f
            int r0 = r7.thumbnailWidth_
            r5.A01 = r0
        L_0x011f:
            r0 = 131072(0x20000, float:1.83671E-40)
            r4 = r4 & r0
            if (r4 == 0) goto L_0x0128
            int r0 = r7.thumbnailHeight_
            r5.A00 = r0
        L_0x0128:
            r8.A1W(r5)
        L_0x012b:
            return
        L_0x012c:
            X.22x r0 = X.C375122x.SUB
            if (r1 != r0) goto L_0x0134
            r8.A00 = r2
            goto L_0x009a
        L_0x0134:
            X.22x r0 = X.C375122x.DEFAULT_SUB
            if (r1 != r0) goto L_0x013b
            r0 = 3
            goto L_0x0098
        L_0x013b:
            r8.A00 = r4
            goto L_0x009a
        L_0x013f:
            X.22x r1 = X.C375122x.SUB
            goto L_0x0093
        L_0x0143:
            X.22x r1 = X.C375122x.PARENT
            goto L_0x0093
        L_0x0147:
            X.22x r1 = X.C375122x.DEFAULT
            goto L_0x0093
        L_0x014b:
            X.22y r0 = X.C375222y.IMAGE
            if (r5 != r0) goto L_0x0152
            r1 = 5
            goto L_0x006f
        L_0x0152:
            X.22y r0 = X.C375222y.PLACEHOLDER
            r1 = 0
            if (r5 != r0) goto L_0x006f
            r1 = 4
            goto L_0x006f
        L_0x015a:
            X.22y r5 = X.C375222y.PLACEHOLDER
            goto L_0x006a
        L_0x015e:
            X.22y r5 = X.C375222y.VIDEO
            goto L_0x006a
        L_0x0162:
            X.22y r5 = X.C375222y.NONE
            goto L_0x006a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3OJ.A00(X.5Zz, X.1EC, X.1mW):void");
    }

    public void AyD(C55032pg r9, C624134x r10) {
        if (r10 instanceof C30481mW) {
            C30481mW r102 = (C30481mW) r10;
            boolean A0d = C624134x.A0d(r102);
            C624034w r3 = r102.A0P;
            if (A0d) {
                if (r3 != null || AnonymousClass353.A04(r102)) {
                    C626936e.A0D(false, "FMessageTextSerializer/buildE2eMessage cant edit payment or buttons message");
                }
                AnonymousClass3NX.A00(new C85674He(this, 4), r9, r102);
            } else if (r3 != null) {
                this.A04.A03(r3, r9, new AnonymousClass4JW(this, 0), r102);
            } else if (AnonymousClass353.A04(r102)) {
                AnonymousClass1A4 r32 = r9.A00;
                AnonymousClass3Z2 r6 = r9.A01;
                byte[] bArr = r9.A09;
                boolean z = r9.A03;
                C21801Df r0 = ((AnonymousClass1EU) r32.A00).buttonsMessage_;
                if (r0 == null) {
                    r0 = C21801Df.DEFAULT_INSTANCE;
                }
                C208319m r4 = (C208319m) r0.A0H();
                if (!C624134x.A0a(r102)) {
                    r4.A09(AnonymousClass23H.TEXT);
                    String A13 = r102.A13();
                    C21801Df A0T = AnonymousClass0x7.A0T(r4);
                    A13.getClass();
                    A0T.headerCase_ = 1;
                    A0T.header_ = A13;
                } else {
                    r4.A09(AnonymousClass23H.EMPTY);
                }
                AnonymousClass353.A03(r4, C40802Hu.A01(r102));
                if (C59542x5.A01(r6, r102, bArr)) {
                    AnonymousClass1EF A022 = this.A02.A02(r6, r102, bArr, z);
                    C21801Df A0T2 = AnonymousClass0x7.A0T(r4);
                    A022.getClass();
                    A0T2.contextInfo_ = A022;
                    A0T2.bitField0_ |= 128;
                }
                r32.A09((C21801Df) r4.A06());
            } else if (!TextUtils.isEmpty(r102.A06) || !TextUtils.isEmpty(r102.A04) || r102.A02 != null || AnonymousClass000.A1U(r102.A0A & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) || C59542x5.A01(r9.A01, r102, r9.A09)) {
                AnonymousClass1A4 r42 = r9.A00;
                AnonymousClass1EC r02 = ((AnonymousClass1EU) r42.A00).extendedTextMessage_;
                if (r02 == null) {
                    r02 = AnonymousClass1EC.DEFAULT_INSTANCE;
                }
                C207119a r1 = (C207119a) r02.A0H();
                A01(r1, r102);
                C55032pg.A01(r9, this, r1, r102);
                if (!C18320x8.A0I(this.A05).A01.A00() || !r102.A1k()) {
                    r42.A0B(r1);
                    return;
                }
                AnonymousClass1AL r03 = ((AnonymousClass1EU) r42.A00).botInvokeMessage_;
                if (r03 == null) {
                    r03 = AnonymousClass1AL.DEFAULT_INSTANCE;
                }
                C209119u r33 = (C209119u) r03.A0H();
                C130546c9 A0H = r33.A09().A0H();
                AnonymousClass1EC r04 = (AnonymousClass1EC) r1.A06();
                AnonymousClass1EU A0L = AnonymousClass0x2.A0L(A0H, r04);
                A0L.extendedTextMessage_ = r04;
                A0L.bitField0_ |= 32;
                AnonymousClass1AL A002 = C209119u.A00(A0H, r33);
                AnonymousClass1EU A0L2 = AnonymousClass0x2.A0L(r42, A002);
                A0L2.botInvokeMessage_ = A002;
                A0L2.bitField1_ |= 4194304;
            } else {
                AnonymousClass1A4 r05 = r9.A00;
                String A132 = r102.A13();
                AnonymousClass1EU A0T3 = C18290x4.A0T(r05);
                A132.getClass();
                A0T3.bitField0_ |= 1;
                A0T3.conversation_ = A132;
            }
        } else {
            throw AnonymousClass001.A0c("FMessageTextProtobuf/buildE2EMessage wrong message passed");
        }
    }

    public C624134x BgW(C55962rC r8) {
        AnonymousClass1EU r4 = r8.A0B;
        int i = r4.bitField0_;
        if ((i & 1) != 0) {
            AnonymousClass2z0 r0 = r8.A0D;
            long j = r8.A05;
            String str = r4.conversation_;
            C30481mW r3 = new C30481mW(r0, j);
            r3.A1Z(C107575bX.A0C(str, 65536));
            return r3;
        }
        if (AnonymousClass000.A1S(i & 32)) {
            AnonymousClass1EC r2 = r4.extendedTextMessage_;
            if (r2 == null) {
                r2 = AnonymousClass1EC.DEFAULT_INSTANCE;
            }
            if ((r2.bitField0_ & 8388608) == 0 || !r2.viewOnce_) {
                C30481mW r32 = new C30481mW(r8.A0D, r8.A05);
                C106685Zz r1 = this.A03;
                AnonymousClass1EC r02 = r4.extendedTextMessage_;
                if (r02 == null) {
                    r02 = AnonymousClass1EC.DEFAULT_INSTANCE;
                }
                A00(r1, r02, r32);
                r32.A1i(AnonymousClass000.A1S(r8.A0C.bitField1_ & 4194304));
                r32.A03 = r8.A0G;
                return r32;
            }
        } else if ((32768 & i) != 0) {
            return this.A04.A01(r8);
        } else {
            if ((i & AnonymousClass35S.A0F) != 0) {
                return this.A04.A00(r8);
            }
        }
        return null;
    }

    public AnonymousClass3OJ(C58902w0 r1, AnonymousClass3NX r2, C59542x5 r3, C106685Zz r4, AnonymousClass9TU r5, C183538qC r6) {
        this.A03 = r4;
        this.A05 = r6;
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A04 = r5;
    }

    public final void A01(C207119a r10, C30481mW r11) {
        String str;
        C375122x r0;
        C375222y r02;
        String str2;
        String A13 = r11.A13();
        AnonymousClass1EC A0U = AnonymousClass0x7.A0U(r10);
        A13.getClass();
        A0U.bitField0_ |= 1;
        A0U.text_ = A13;
        ArrayList A052 = this.A03.A05(r11.A13(), true);
        if (A052 != null) {
            str = (String) AnonymousClass0x9.A0t(A052);
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            AnonymousClass1EC A0U2 = AnonymousClass0x7.A0U(r10);
            str.getClass();
            A0U2.bitField0_ |= 2;
            A0U2.matchedText_ = str;
        }
        if (!TextUtils.isEmpty(r11.A06)) {
            String str3 = r11.A06;
            AnonymousClass1EC A0U3 = AnonymousClass0x7.A0U(r10);
            str3.getClass();
            A0U3.bitField0_ |= 16;
            A0U3.title_ = str3;
        }
        if (!TextUtils.isEmpty(r11.A04)) {
            String str4 = r11.A04;
            AnonymousClass1EC A0U4 = AnonymousClass0x7.A0U(r10);
            str4.getClass();
            A0U4.bitField0_ |= 8;
            A0U4.description_ = str4;
        }
        if (!TextUtils.isEmpty(r11.A07)) {
            String str5 = r11.A07;
            AnonymousClass1EC A0U5 = AnonymousClass0x7.A0U(r10);
            str5.getClass();
            A0U5.bitField0_ |= 4;
            A0U5.canonicalUrl_ = str5;
        }
        int i = r11.A00;
        if (i == 1) {
            r0 = C375122x.PARENT;
        } else if (i == 2) {
            r0 = C375122x.SUB;
        } else if (i == 3) {
            r0 = C375122x.DEFAULT_SUB;
        } else {
            r0 = C375122x.DEFAULT;
        }
        AnonymousClass1EC A0U6 = AnonymousClass0x7.A0U(r10);
        A0U6.inviteLinkGroupTypeV2_ = r0.value;
        A0U6.bitField0_ |= 4194304;
        C55592qb r6 = r11.A0l;
        if (!(r6 == null || (str2 = r6.A04) == null || r6.A08 == null)) {
            AnonymousClass1EC A0U7 = AnonymousClass0x7.A0U(r10);
            A0U7.bitField0_ |= ZipDecompressor.UNZIP_BUFFER_SIZE;
            A0U7.thumbnailDirectPath_ = str2;
            C172548Lq A08 = C18270x1.A08(r10, r6.A08);
            AnonymousClass1EC r1 = (AnonymousClass1EC) r10.A00;
            r1.bitField0_ |= DefaultCrypto.BUFFER_SIZE;
            r1.thumbnailSha256_ = A08;
            byte[] bArr = r6.A0A;
            if (bArr != null) {
                C172548Lq A0H = C18280x3.A0H(r10, bArr);
                AnonymousClass1EC r2 = (AnonymousClass1EC) r10.A00;
                r2.bitField0_ |= 32768;
                r2.mediaKey_ = A0H;
            }
            String str6 = r6.A05;
            if (str6 != null) {
                C172548Lq A082 = C18270x1.A08(r10, str6);
                AnonymousClass1EC r12 = (AnonymousClass1EC) r10.A00;
                r12.bitField0_ |= 16384;
                r12.thumbnailEncSha256_ = A082;
            }
            long j = r6.A02;
            if (j > 0) {
                long A0B = C18290x4.A0B(j);
                AnonymousClass1EC A0U8 = AnonymousClass0x7.A0U(r10);
                A0U8.bitField0_ |= 65536;
                A0U8.mediaKeyTimestamp_ = A0B;
            }
            int i2 = r6.A00;
            if (i2 > 0) {
                AnonymousClass1EC A0U9 = AnonymousClass0x7.A0U(r10);
                A0U9.bitField0_ |= AnonymousClass35S.A0F;
                A0U9.thumbnailHeight_ = i2;
            }
            int i3 = r6.A01;
            if (i3 > 0) {
                AnonymousClass1EC A0U10 = AnonymousClass0x7.A0U(r10);
                A0U10.bitField0_ |= 262144;
                A0U10.thumbnailWidth_ = i3;
            }
        }
        if (r11.A01 == 1) {
            r02 = C375222y.VIDEO;
        } else {
            r02 = C375222y.NONE;
        }
        AnonymousClass1EC A0U11 = AnonymousClass0x7.A0U(r10);
        A0U11.previewType_ = r02.value;
        A0U11.bitField0_ |= 256;
        byte[] bArr2 = r11.A08;
        TextData textData = r11.A02;
        if (textData != null) {
            int i4 = textData.backgroundColor;
            AnonymousClass1EC A0U12 = AnonymousClass0x7.A0U(r10);
            A0U12.bitField0_ |= 64;
            A0U12.backgroundArgb_ = i4;
            int i5 = textData.textColor;
            AnonymousClass1EC A0U13 = AnonymousClass0x7.A0U(r10);
            A0U13.bitField0_ |= 32;
            A0U13.textArgb_ = i5;
            AnonymousClass23L A002 = AnonymousClass23L.A00(textData.fontStyle);
            AnonymousClass1EC A0U14 = AnonymousClass0x7.A0U(r10);
            A0U14.font_ = A002.value;
            A0U14.bitField0_ |= 128;
            bArr2 = textData.thumbnail;
        }
        if (bArr2 != null) {
            C172548Lq A09 = C18270x1.A09(r10, bArr2);
            AnonymousClass1EC r13 = (AnonymousClass1EC) r10.A00;
            r13.bitField0_ |= 512;
            r13.jpegThumbnail_ = A09;
        }
    }
}
