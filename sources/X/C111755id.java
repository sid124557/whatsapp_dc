package X;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.InfoCard;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.biz.BusinessProfileFieldView;
import com.whatsapp.biz.catalog.view.CatalogMediaCard;
import com.whatsapp.biz.linkedaccounts.LinkedAccountsMediaCard;
import com.whatsapp.biz.profile.TrustSignalItem;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.pnh.RequestPhoneNumberViewModel;
import java.util.Calendar;

/* renamed from: X.5id  reason: invalid class name and case insensitive filesystem */
public class C111755id implements AnonymousClass4CM {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public TextView A04;
    public InfoCard A05;
    public InfoCard A06;
    public TextEmojiLabel A07;
    public TextEmojiLabel A08;
    public AnonymousClass64J A09;
    public WaTextView A0A;
    public WaTextView A0B;
    public AnonymousClass5ZB A0C;
    public BusinessProfileFieldView A0D;
    public CatalogMediaCard A0E;
    public LinkedAccountsMediaCard A0F;
    public LinkedAccountsMediaCard A0G;
    public TrustSignalItem A0H;
    public TrustSignalItem A0I;
    public C102525Je A0J;
    public C108915dl A0K;
    public C108985dt A0L;
    public AnonymousClass3ZH A0M;
    public C53202mi A0N;
    public C111725ia A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R = true;
    public boolean A0S = true;
    public final View A0T;
    public final View A0U;
    public final C116985rC A0V;
    public final C116985rC A0W;
    public final C116985rC A0X;
    public final C111095hX A0Y;
    public final C69263Wi A0Z;
    public final C85244Fm A0a;
    public final C56972sr A0b;
    public final TextEmojiLabel A0c;
    public final TextEmojiLabel A0d;
    public final WaTextView A0e;
    public final C105035Th A0f;
    public final C620433g A0g;
    public final C48372en A0h;
    public final C105145Tt A0i;
    public final C106185Xy A0j;
    public final AnonymousClass5X1 A0k;
    public final AnonymousClass5RZ A0l;
    public final C1230066r A0m;
    public final ContactInfoActivity A0n;
    public final C91504kC A0o;
    public final C34461vC A0p;
    public final C56422rx A0q;
    public final AnonymousClass5ZU A0r;
    public final C49772h4 A0s;
    public final C620633i A0t;
    public final C56612sH A0u;
    public final C54292oU A0v;
    public final C57162tC A0w;
    public final C620733j A0x;
    public final AnonymousClass1VX A0y;
    public final AnonymousClass3LP A0z;
    public final AnonymousClass4FV A10;
    public final C28071fd A11;
    public final AnonymousClass31C A12;
    public final C105355Up A13;
    public final C153087ae A14;
    public final C194079Rm A15;
    public final C53712nX A16;
    public final RequestPhoneNumberViewModel A17;
    public final AnonymousClass7SU A18;
    public final C102945Kw A19;
    public final AnonymousClass7SX A1A;
    public final C46182bD A1B;
    public final AnonymousClass4FS A1C;
    public final AnonymousClass2Z2 A1D;
    public final C186998wH A1E;
    public final C84204Bl A1F;
    public final C1227565p A1G;
    public final C183538qC A1H;
    public final Integer A1I;
    public final boolean A1J;

    public static boolean A01(View view) {
        if (view == null || !view.isShown()) {
            return false;
        }
        Rect A0N2 = AnonymousClass001.A0N();
        view.getGlobalVisibleRect(A0N2);
        return A0N2.intersects(0, 0, C86634Kw.A0J().widthPixels, C86634Kw.A0J().heightPixels);
    }

    public UserJid A02() {
        AnonymousClass3ZH r0 = this.A0M;
        if (r0 == null) {
            return null;
        }
        return AnonymousClass3ZH.A07(r0);
    }

    public final void A03(int i) {
        if (this.A0M.A0R()) {
            this.A0j.A06((Integer) null, this.A1I, C627336j.A07(A02()), i, A0C(), A0B());
        }
    }

    public final void A04(int i) {
        if (this.A0M.A0R()) {
            this.A0j.A01(this.A0K, i);
        }
    }

    public final void A07(C91504kC r16) {
        C108775dX r0;
        Integer num;
        C108775dX r02;
        Integer num2 = null;
        if (this.A0S || this.A0R || this.A0Q) {
            C108985dt r03 = this.A0L;
            if (r03 != null) {
                C165997xy r1 = r03.A05;
                if (this.A0R && A01(this.A0H)) {
                    if (r1 == null || (r02 = r1.A00) == null) {
                        num = null;
                    } else {
                        num = Integer.valueOf(r02.A00);
                    }
                    this.A0j.A05(this.A1I, num, C627336j.A07(A02()), 16, 0, A0B());
                    this.A0R = false;
                }
                if (this.A0S && A01(this.A0I)) {
                    if (!(r1 == null || (r0 = r1.A01) == null)) {
                        num2 = Integer.valueOf(r0.A00);
                    }
                    this.A0j.A05(this.A1I, num2, C627336j.A07(A02()), 16, 1, A0B());
                    this.A0S = false;
                }
                if (this.A0Q && A01(this.A05)) {
                    this.A0j.A04(this.A0K, 14, AnonymousClass000.A1W(this.A0M.A0F));
                    this.A0Q = false;
                }
                if (this.A0R && A01(this.A0F)) {
                    this.A0j.A02(this.A0K, 19);
                    this.A0R = false;
                }
                if (this.A0S && A01(this.A0G)) {
                    this.A0j.A02(this.A0K, 22);
                    this.A0S = false;
                    return;
                }
                return;
            }
            return;
        }
        r16.A0P = null;
    }

    public final void A08(AnonymousClass3ZH r5) {
        if (r5 != null) {
            C95814uZ r3 = r5.A0H;
            if (r3 instanceof C27981fH) {
                AnonymousClass6C6.A02(this.A0n, this.A17.A0D((C27981fH) r3), this, 4);
                C109705f3.A00(this.A0U, this, r3, 15);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0074, code lost:
        if (r3.A02(r11.A0L) != false) goto L_0x0076;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09(com.whatsapp.jid.UserJid r12, boolean r13) {
        /*
            r11 = this;
            X.5dt r0 = r11.A0L
            r2 = 8
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.A0c
            if (r0 == 0) goto L_0x0024
            X.1VX r1 = r11.A0y
            r0 = 957(0x3bd, float:1.341E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0024
        L_0x0014:
            com.whatsapp.biz.catalog.view.CatalogMediaCard r0 = r11.A0E
            r0.setVisibility(r2)
            android.view.View r5 = r11.A03
        L_0x001b:
            r5.setVisibility(r2)
            com.whatsapp.InfoCard r0 = r11.A06
            r0.setVisibility(r2)
        L_0x0023:
            return
        L_0x0024:
            com.whatsapp.biz.catalog.view.CatalogMediaCard r5 = r11.A0E
            X.8Ei r0 = new X.8Ei
            r0.<init>(r11)
            r5.A04 = r0
            X.5Th r3 = r11.A0f
            X.5dt r4 = r11.A0L
            X.1VX r1 = r3.A05
            r0 = 355(0x163, float:4.97E-43)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0088
            r0 = 636(0x27c, float:8.91E-43)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0088
        L_0x0043:
            android.view.View r1 = r11.A03
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x004e
            r1.setVisibility(r2)
        L_0x004e:
            X.5dt r0 = r11.A0L
            java.lang.String r1 = r3.A00(r0)
            java.lang.String r0 = "PERMANENT"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x001b
            X.5dt r1 = r11.A0L
            if (r1 == 0) goto L_0x006e
            boolean r0 = r1.A0Y
            if (r0 == 0) goto L_0x006e
            boolean r0 = r1.A0X
            if (r0 == 0) goto L_0x0076
            boolean r0 = r3.A03(r1)
            if (r0 != 0) goto L_0x0076
        L_0x006e:
            X.5dt r0 = r11.A0L
            boolean r0 = r3.A02(r0)
            if (r0 == 0) goto L_0x001b
        L_0x0076:
            r10 = 0
            r5.setVisibility(r10)
            com.whatsapp.InfoCard r0 = r11.A06
            r0.setVisibility(r10)
            r8 = 0
            X.5dt r6 = r11.A0L
            r7 = r12
            r9 = r13
            r5.A02(r6, r7, r8, r9, r10)
            return
        L_0x0088:
            boolean r0 = r3.A01(r4)
            if (r0 == 0) goto L_0x0043
            int r0 = r5.getVisibility()
            if (r0 != 0) goto L_0x0097
            r5.setVisibility(r2)
        L_0x0097:
            X.5dt r2 = r11.A0L
            android.view.View r0 = r11.A03
            r1 = 0
            r0.setVisibility(r1)
            com.whatsapp.InfoCard r0 = r11.A06
            r0.setVisibility(r1)
            com.whatsapp.chatinfo.ContactInfoActivity r0 = r11.A0n
            X.0df r4 = r0.getSupportFragmentManager()
            java.lang.String r3 = "shops_product_frag"
            X.0eF r0 = r4.A0D(r3)
            if (r0 != 0) goto L_0x0023
            X.4Bl r1 = r11.A1F
            java.lang.String r0 = r2.A0J
            X.C626936e.A06(r0)
            X.0eF r2 = r1.B14(r0)
            X.0dc r1 = new X.0dc
            r1.<init>(r4)
            r0 = 2131433737(0x7f0b1909, float:1.8489268E38)
            r1.A0D(r2, r3, r0)
            r1.A02()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111755id.A09(com.whatsapp.jid.UserJid, boolean):void");
    }

    public final void A0A(String str) {
        if (str == null || str.isEmpty()) {
            TextEmojiLabel textEmojiLabel = this.A0d;
            C86634Kw.A1I(textEmojiLabel);
            textEmojiLabel.setVisibility(8);
        } else if (str.charAt(0) == '@') {
            TextEmojiLabel textEmojiLabel2 = this.A0d;
            textEmojiLabel2.setText(str);
            textEmojiLabel2.setVisibility(0);
        }
    }

    public boolean A0B() {
        C166137yC r0;
        C108985dt r02 = this.A0L;
        if (r02 == null || (r0 = r02.A04) == null || TextUtils.isEmpty(r0.A00)) {
            return false;
        }
        return true;
    }

    public boolean A0C() {
        C165997xy r1;
        C108985dt r0 = this.A0L;
        if (r0 == null || (r1 = r0.A05) == null) {
            return false;
        }
        if (r1.A00 == null && r1.A01 == null) {
            return false;
        }
        return true;
    }

    public final boolean A0D() {
        C116985rC r1 = this.A0V;
        if (!r1.A07() || !C116985rC.A03(r1).BH2(A02())) {
            return false;
        }
        return true;
    }

    public final boolean A0E() {
        if (!this.A0M.A0T() || !AnonymousClass75P.A00(this.A0y)) {
            return false;
        }
        return true;
    }

    public void BU1() {
        ContactInfoActivity contactInfoActivity = this.A0n;
        contactInfoActivity.BjL();
        contactInfoActivity.A1e.A06("profile_view_tag", false);
    }

    public void BU2() {
        ContactInfoActivity contactInfoActivity = this.A0n;
        contactInfoActivity.BjL();
        contactInfoActivity.A1e.A06("profile_view_tag", true);
    }

    public static Calendar A00(Calendar calendar, int i, int i2) {
        Calendar calendar2 = (Calendar) calendar.clone();
        calendar2.set(7, i);
        calendar2.set(11, i2 / 60);
        calendar2.set(12, i2 % 60);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        return calendar2;
    }

    public final void A05(View view, int i) {
        if (A0D() || A0E()) {
            i = 8;
        }
        view.setVisibility(i);
    }

    public C111755id(View view, C116985rC r15, C116985rC r16, C116985rC r17, C111095hX r18, C69263Wi r19, C85244Fm r20, C56972sr r21, AnonymousClass64J r22, C105035Th r23, C620433g r24, C48372en r25, C105145Tt r26, C106185Xy r27, AnonymousClass5X1 r28, C108915dl r29, AnonymousClass5RZ r30, C1230066r r31, ContactInfoActivity contactInfoActivity, C91504kC r33, C34461vC r34, C56422rx r35, AnonymousClass5ZU r36, AnonymousClass7T1 r37, C49772h4 r38, C620633i r39, C56612sH r40, C54292oU r41, C57162tC r42, C620733j r43, AnonymousClass3ZH r44, AnonymousClass1VX r45, AnonymousClass3LP r46, AnonymousClass4FV r47, C53202mi r48, C28071fd r49, AnonymousClass31C r50, C105355Up r51, C153087ae r52, C194079Rm r53, C53712nX r54, RequestPhoneNumberViewModel requestPhoneNumberViewModel, AnonymousClass7SU r56, C102945Kw r57, AnonymousClass7SX r58, C46182bD r59, AnonymousClass4FS r60, AnonymousClass2Z2 r61, C186998wH r62, C84204Bl r63, C1227565p r64, C183538qC r65, Integer num) {
        this.A0u = r40;
        AnonymousClass1VX r1 = r45;
        this.A0y = r1;
        this.A1F = r63;
        this.A0Z = r19;
        this.A0b = r21;
        this.A0v = r41;
        this.A1C = r60;
        this.A0X = r15;
        this.A10 = r47;
        this.A1D = r61;
        this.A0m = r31;
        this.A0z = r46;
        this.A0a = r20;
        this.A0Y = r18;
        this.A11 = r49;
        this.A1E = r62;
        this.A12 = r50;
        this.A0r = r36;
        this.A0t = r39;
        this.A0x = r43;
        this.A0o = r33;
        this.A1G = r64;
        this.A19 = r57;
        this.A0W = r16;
        this.A0q = r35;
        this.A0V = r17;
        this.A0h = r25;
        this.A0f = r23;
        this.A0g = r24;
        this.A0i = r26;
        this.A0p = r34;
        this.A14 = r52;
        this.A13 = r51;
        this.A1B = r59;
        this.A16 = r54;
        this.A0s = r38;
        this.A17 = requestPhoneNumberViewModel;
        this.A1H = r65;
        this.A1A = r58;
        this.A0w = r42;
        this.A0j = r27;
        this.A15 = r53;
        this.A0l = r30;
        this.A09 = r22;
        this.A0K = r29;
        this.A0k = r28;
        this.A0N = r48;
        C626936e.A04(view);
        this.A01 = view.findViewById(R.id.business_verification_status);
        this.A08 = AnonymousClass0x7.A0K(view, R.id.business_verification_status_text);
        this.A0D = (BusinessProfileFieldView) C06560Yg.A02(view, R.id.business_description);
        this.A0E = (CatalogMediaCard) C06560Yg.A02(view, R.id.business_catalog_media_card);
        this.A0F = (LinkedAccountsMediaCard) C06560Yg.A02(view, R.id.business_fb_media_card);
        this.A0G = (LinkedAccountsMediaCard) C06560Yg.A02(view, R.id.business_ig_media_card);
        this.A06 = (InfoCard) C06560Yg.A02(view, R.id.business_catalog_shop_info_card);
        this.A03 = C06560Yg.A02(view, R.id.shops_container);
        this.A04 = C18300x5.A0G(view, R.id.blank_business_details_text);
        this.A00 = C06560Yg.A02(view, R.id.add_business_to_contact);
        this.A05 = (InfoCard) C06560Yg.A02(view, R.id.business_chaining_container);
        this.A0U = C06560Yg.A02(view, R.id.action_request_phone_number);
        ContactInfoActivity contactInfoActivity2 = contactInfoActivity;
        C89364cO.A01(contactInfoActivity2, (C89364cO) C06560Yg.A02(view, R.id.business_chaining_layout), R.string.f11nameremoved);
        this.A07 = AnonymousClass0x7.A0K(view, R.id.business_title);
        this.A0c = AnonymousClass0x7.A0K(view, R.id.business_subtitle);
        this.A0d = AnonymousClass0x7.A0K(view, R.id.business_username);
        this.A0e = AnonymousClass0x7.A0L(view, R.id.business_categories);
        this.A0A = AnonymousClass0x7.A0L(view, R.id.custom_url);
        this.A0B = AnonymousClass0x7.A0L(view, R.id.responsiveness_signal);
        this.A0P = C106545Zk.A01(r1);
        this.A1I = num;
        this.A0n = contactInfoActivity2;
        this.A0T = view;
        AnonymousClass3ZH r2 = r44;
        this.A0M = r2;
        this.A18 = r56;
        this.A1J = r37.A00(r2);
        AnonymousClass1VX r12 = this.A0y;
        if (r12.A0X(2582) || (!r12.A0X(1483) && !r12.A0X(1849))) {
            this.A0A.setVisibility(8);
        } else {
            UserJid A022 = A02();
            C626936e.A06(A022);
            WaTextView waTextView = this.A0A;
            waTextView.setVisibility(0);
            waTextView.setText(R.string.f11nameremoved);
            AnonymousClass31C r4 = this.A12;
            C115305oS r7 = new C115305oS(new C148017Gp(this, A022), this.A0w, r4);
            AnonymousClass31C r6 = r7.A02;
            String A032 = r6.A03();
            C56052rL r410 = new C56052rL(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
            r410.A0G(new AnonymousClass39V((Jid) A022, "jid"));
            AnonymousClass36K A0F2 = r410.A0F();
            AnonymousClass39V[] r411 = new AnonymousClass39V[5];
            r411[0] = AnonymousClass39V.A00();
            AnonymousClass39V.A05(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A032, r411);
            AnonymousClass39V.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r411);
            AnonymousClass39V.A07("xmlns", "fb:thrift_iq", r411);
            AnonymousClass39V.A08("smax_id", "78", r411);
            r6.A0E(r7, AnonymousClass36K.A0G(A0F2, r411), A032, 316, 32000);
            C18260x0.A1R(AnonymousClass001.A0o(), "GetCustomUrlsByJidProtocol/sendRequest/jid=", A022);
        }
        A08(r2);
        C1229766o r13 = (C1229766o) this.A0V.A05();
        C48902ff r412 = (C48902ff) ((C116985rC) this.A1H.get()).A05();
        UserJid A023 = A02();
        if (r13 != null && r412 != null && A023 != null && r13.BH2(A023)) {
            View A0F3 = C86614Ku.A0F(this.A0T, R.id.business_bot_description_card);
            TextView A0G2 = C18300x5.A0G(A0F3, R.id.business_bot_description_text);
            C54002o1 A002 = r412.A00(A023);
            if (A002 != null) {
                A0G2.setText(A002.A06);
                A0F3.setVisibility(0);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v231, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v320, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v321, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x050d, code lost:
        if (r7.A0X(3465) == false) goto L_0x050f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0537, code lost:
        if (r7.A0X(3464) != false) goto L_0x053b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0740, code lost:
        if (r0.A0N.A02(A02()) != false) goto L_0x0742;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0107, code lost:
        if (r0.A0q.A03(r7) == false) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x084a, code lost:
        if (r0.A0I.getVisibility() != 0) goto L_0x084c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x04e0  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x04fb  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0577  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x06cc  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x0843  */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x08fb  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:483:0x0b5d  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0232  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(X.C108915dl r44, X.AnonymousClass3ZH r45, X.C109665ez r46, boolean r47, boolean r48, boolean r49) {
        /*
            r43 = this;
            r0 = r43
            r6 = r45
            r0.A0M = r6
            r0.A08(r6)
            android.view.View r3 = r0.A0T
            X.C626936e.A04(r3)
            r9 = 0
            r3.setVisibility(r9)
            int r7 = r6.A08
            java.lang.String r5 = r6.A0J()
            X.3LP r1 = r0.A0z
            r42 = r1
            com.whatsapp.jid.UserJid r2 = r0.A02()
            boolean r1 = X.C57362tW.A00(r1, r2)
            r8 = 1
            r2 = 8
            if (r1 != 0) goto L_0x04c6
            X.1VX r4 = r0.A0y
            com.whatsapp.jid.UserJid r1 = r0.A02()
            boolean r1 = X.C616831v.A00(r4, r1)
            if (r1 != 0) goto L_0x04c6
            X.2mi r4 = r0.A0N
            com.whatsapp.jid.UserJid r1 = r0.A02()
            boolean r1 = r4.A02(r1)
            if (r1 != 0) goto L_0x04c6
            android.view.View r1 = r0.A01
            r21 = r1
            X.53z r4 = new X.53z
            r4.<init>(r0, r5, r7)
            r1.setOnClickListener(r4)
            X.3ZH r4 = r0.A0M
            X.2k5 r1 = r4.A0F
            if (r1 != 0) goto L_0x0064
            X.3ZH r1 = r4.A0G
            if (r1 != 0) goto L_0x0064
            X.2sr r4 = r0.A0b
            com.whatsapp.jid.UserJid r1 = r0.A02()
            boolean r1 = r4.A0a(r1)
            if (r1 != 0) goto L_0x0064
            r8 = 0
        L_0x0064:
            android.view.View r1 = r0.A00
            r41 = r1
            X.C626936e.A04(r41)
            r4 = r46
            r1.setOnClickListener(r4)
            if (r8 != 0) goto L_0x04cd
            X.2sr r1 = r0.A0b
            boolean r1 = X.C86664Kz.A1W(r1)
            if (r1 == 0) goto L_0x04cd
            r1 = r41
            r0.A05(r1, r9)
        L_0x007f:
            X.5dt r1 = r0.A0L
            if (r1 != 0) goto L_0x04c0
            r24 = 0
        L_0x0085:
            r1 = 2131428301(0x7f0b03cd, float:1.8478243E38)
            android.view.View r4 = X.C06560Yg.A02(r3, r1)
            X.5dt r2 = r0.A0L
            if (r2 == 0) goto L_0x00a2
            boolean r1 = r2.A00()
            if (r1 == 0) goto L_0x02c5
            java.lang.String r1 = r2.A0M
            if (r1 != 0) goto L_0x02c5
            java.util.List r1 = r2.A0O
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x02c5
        L_0x00a2:
            r2 = 8
            r4.setVisibility(r2)
        L_0x00a7:
            com.whatsapp.jid.UserJid r4 = r0.A02()
            X.C626936e.A06(r4)
            r1 = 0
            r0.A09(r4, r9)
            r4 = 2131427503(0x7f0b00af, float:1.8476624E38)
            android.view.View r8 = X.C06560Yg.A02(r3, r4)
            r4 = 2131427480(0x7f0b0098, float:1.8476577E38)
            android.view.View r13 = X.C06560Yg.A02(r3, r4)
            r4 = 2131427517(0x7f0b00bd, float:1.8476652E38)
            android.view.View r12 = X.C06560Yg.A02(r3, r4)
            r4 = 2131427507(0x7f0b00b3, float:1.8476632E38)
            android.view.View r11 = X.C06560Yg.A02(r3, r4)
            r4 = 2131427490(0x7f0b00a2, float:1.8476598E38)
            android.view.View r10 = X.C06560Yg.A02(r3, r4)
            r4 = 2131427510(0x7f0b00b6, float:1.8476638E38)
            android.view.View r9 = X.C06560Yg.A02(r3, r4)
            com.whatsapp.jid.UserJid r7 = r0.A02()
            X.C626936e.A06(r7)
            com.whatsapp.jid.UserJid r5 = r0.A02()
            r4 = r42
            boolean r15 = X.C57362tW.A00(r4, r5)
            int r4 = X.AnonymousClass001.A08(r49)
            r8.setVisibility(r4)
            X.C18320x8.A16(r8, r7, r0, r2)
            X.3ZH r4 = r0.A0M
            boolean r4 = r4.A0R()
            r8 = 1
            if (r4 == 0) goto L_0x0109
            X.2rx r4 = r0.A0q
            boolean r4 = r4.A03(r7)
            r5 = 1
            if (r4 != 0) goto L_0x010a
        L_0x0109:
            r5 = 0
        L_0x010a:
            if (r15 != 0) goto L_0x012c
            X.2h4 r4 = r0.A0s
            com.whatsapp.jid.UserJid r4 = r4.A00(r7)
            if (r4 != 0) goto L_0x012c
            r4 = 9
            X.C989453v.A00(r13, r0, r4)
            X.1VX r14 = r0.A0y
            r4 = 4067(0xfe3, float:5.699E-42)
            int r4 = r14.A0N(r4)
            if (r5 == 0) goto L_0x029f
            if (r4 < r8) goto L_0x012c
            X.4FS r5 = r0.A1C
            r4 = 31
            X.C117165rU.A00(r5, r0, r13, r4)
        L_0x012c:
            boolean r4 = r0.A0D()
            if (r4 != 0) goto L_0x0144
            X.5dt r4 = r0.A0L
            if (r4 == 0) goto L_0x0237
            boolean r4 = r4.A0c
            if (r4 == 0) goto L_0x0237
            X.1VX r5 = r0.A0y
            r4 = 957(0x3bd, float:1.341E-42)
            boolean r4 = r5.A0X(r4)
            if (r4 == 0) goto L_0x0237
        L_0x0144:
            r12.setVisibility(r2)
        L_0x0147:
            X.1VX r7 = r0.A0y
            r4 = 5415(0x1527, float:7.588E-42)
            boolean r4 = r7.A0X(r4)
            if (r4 == 0) goto L_0x016a
            X.7pU r5 = X.C161357pU.A0F
            X.7ae r4 = r0.A14
            X.7pU r4 = r4.A02()
            if (r5 != r4) goto L_0x016a
            X.68K r4 = new X.68K
            r4.<init>(r0, r1)
            r11.setOnClickListener(r4)
            X.4FS r5 = r0.A1C
            r4 = 32
            X.C117165rU.A00(r5, r0, r11, r4)
        L_0x016a:
            if (r15 != 0) goto L_0x0232
            com.whatsapp.jid.UserJid r4 = r0.A02()
            boolean r4 = X.C616831v.A00(r7, r4)
            if (r4 != 0) goto L_0x0232
            X.2mi r5 = r0.A0N
            com.whatsapp.jid.UserJid r4 = r0.A02()
            boolean r4 = r5.A02(r4)
            if (r4 != 0) goto L_0x0232
            r4 = 6
            X.C989453v.A00(r10, r0, r4)
        L_0x0186:
            X.3ZH r4 = r0.A0M
            int r4 = r4.A07
            if (r4 != r8) goto L_0x0197
            r4 = 5868(0x16ec, float:8.223E-42)
            boolean r4 = r7.A0X(r4)
            if (r4 == 0) goto L_0x0197
            r10.setVisibility(r2)
        L_0x0197:
            if (r15 != 0) goto L_0x01bd
            X.5rC r8 = r0.A0V
            boolean r4 = r8.A07()
            if (r4 == 0) goto L_0x0228
            X.66o r5 = X.C116985rC.A03(r8)
            com.whatsapp.jid.UserJid r4 = r0.A02()
            boolean r4 = r5.BH2(r4)
            if (r4 == 0) goto L_0x0228
            X.66o r5 = X.C116985rC.A03(r8)
            com.whatsapp.jid.UserJid r4 = r0.A02()
            boolean r4 = r5.BH4(r4)
            if (r4 != 0) goto L_0x0228
        L_0x01bd:
            r4 = 25
            X.C18320x8.A15(r9, r0, r4)
            r9.setVisibility(r1)
        L_0x01c5:
            X.5dt r4 = r0.A0L
            if (r4 == 0) goto L_0x04f0
            java.util.List r4 = r4.A0O
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x04f0
            X.2en r4 = r0.A0h
            int r4 = r4.A00()
            r4 = r4 & 4
            if (r4 <= 0) goto L_0x04f0
            com.whatsapp.jid.UserJid r4 = r0.A02()
            boolean r4 = X.C616831v.A00(r7, r4)
            if (r4 != 0) goto L_0x04f0
            X.2mi r5 = r0.A0N
            com.whatsapp.jid.UserJid r4 = r0.A02()
            boolean r4 = r5.A02(r4)
            if (r4 != 0) goto L_0x04f0
            com.whatsapp.WaTextView r8 = r0.A0e
            X.5dt r4 = r0.A0L
            java.util.List r4 = r4.A0O
            java.lang.String r5 = " • "
            java.lang.StringBuilder r9 = X.AnonymousClass001.A0o()
            java.util.Iterator r11 = r4.iterator()
        L_0x0201:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L_0x04d6
            java.lang.Object r4 = r11.next()
            X.7yh r4 = (X.C166447yh) r4
            if (r4 == 0) goto L_0x021e
            java.lang.String r10 = r4.A01
            boolean r4 = android.text.TextUtils.isEmpty(r10)
            if (r4 != 0) goto L_0x021e
            r9.append(r10)
            r9.append(r5)
            goto L_0x0201
        L_0x021e:
            java.lang.String r4 = "Category is null"
            java.lang.NullPointerException r4 = X.AnonymousClass001.A0g(r4)
            com.whatsapp.util.Log.e((java.lang.Throwable) r4)
            goto L_0x0201
        L_0x0228:
            boolean r4 = r0.A0E()
            if (r4 != 0) goto L_0x01bd
            r9.setVisibility(r2)
            goto L_0x01c5
        L_0x0232:
            r10.setVisibility(r2)
            goto L_0x0186
        L_0x0237:
            X.5dt r13 = r0.A0L
            if (r13 == 0) goto L_0x0268
            X.5Th r5 = r0.A0f
            boolean r4 = r13.A0Y
            if (r4 == 0) goto L_0x0268
            boolean r4 = r13.A0X
            if (r4 == 0) goto L_0x024b
            boolean r4 = r5.A03(r13)
            if (r4 == 0) goto L_0x0268
        L_0x024b:
            X.5dt r4 = r0.A0L
            java.lang.String r5 = r5.A00(r4)
            java.lang.String r4 = "PERMANENT"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0268
            r4 = 9
            X.543 r5 = new X.543
            r5.<init>(r7, r4, r0)
        L_0x0260:
            r12.setOnClickListener(r5)
            r12.setVisibility(r1)
            goto L_0x0147
        L_0x0268:
            X.5Th r5 = r0.A0f
            X.5dt r4 = r0.A0L
            boolean r4 = r5.A01(r4)
            if (r4 == 0) goto L_0x0144
            boolean r4 = r0.A0P
            if (r4 == 0) goto L_0x028d
            r7 = r12
            com.whatsapp.wds.components.actiontile.WDSActionTile r7 = (com.whatsapp.wds.components.actiontile.WDSActionTile) r7
            r5 = 2131231807(0x7f08043f, float:1.8079705E38)
            r4 = 2131888120(0x7f1207f8, float:1.9410866E38)
            r7.setIcon((int) r5)
            r7.setText((int) r4)
        L_0x0285:
            r4 = 10
            X.53v r5 = new X.53v
            r5.<init>(r0, r4)
            goto L_0x0260
        L_0x028d:
            r13 = r12
            com.whatsapp.contact.view.custom.ContactDetailsActionIcon r13 = (com.whatsapp.contact.view.custom.ContactDetailsActionIcon) r13
            r7 = 2131231807(0x7f08043f, float:1.8079705E38)
            r5 = 2131888120(0x7f1207f8, float:1.9410866E38)
            android.widget.ImageView r4 = r13.A02
            r4.setImageResource(r7)
            r13.setTitle(r5)
            goto L_0x0285
        L_0x029f:
            X.2sr r5 = r0.A0b
            X.3ZH r4 = r0.A0M
            boolean r4 = X.C56972sr.A08(r5, r4)
            if (r4 == 0) goto L_0x02af
            boolean r4 = X.C86644Kx.A1Z(r14)
            if (r4 != 0) goto L_0x02c0
        L_0x02af:
            boolean r4 = r0.A0D()
            if (r4 != 0) goto L_0x02c0
            boolean r4 = r0.A0E()
            if (r4 != 0) goto L_0x02c0
            r13.setVisibility(r1)
            goto L_0x012c
        L_0x02c0:
            r13.setVisibility(r2)
            goto L_0x012c
        L_0x02c5:
            X.5dt r1 = r0.A0L
            boolean r1 = r1.A00()
            if (r1 == 0) goto L_0x02d9
            X.2mi r2 = r0.A0N
            com.whatsapp.jid.UserJid r1 = r0.A02()
            boolean r1 = r2.A02(r1)
            if (r1 == 0) goto L_0x00a2
        L_0x02d9:
            X.1VX r11 = r0.A0y
            X.C162457s7.A0J(r11, r9)
            boolean r1 = r6.A0T()
            if (r1 == 0) goto L_0x02ec
            boolean r1 = X.AnonymousClass75P.A00(r11)
            if (r1 == 0) goto L_0x02ec
            goto L_0x00a2
        L_0x02ec:
            r4.setVisibility(r9)
            X.5dt r4 = r0.A0L
            X.2mi r2 = r0.A0N
            com.whatsapp.jid.UserJid r1 = r0.A02()
            boolean r1 = r2.A02(r1)
            if (r1 == 0) goto L_0x04bc
            com.whatsapp.chatinfo.ContactInfoActivity r2 = r0.A0n
            r1 = 2131895579(0x7f12251b, float:1.9425995E38)
            java.lang.String r5 = r2.getString(r1)
        L_0x0306:
            com.whatsapp.biz.BusinessProfileFieldView r4 = r0.A0D
            r2 = 27
            X.5f1 r1 = new X.5f1
            r1.<init>((java.lang.Object) r0, (int) r2)
            r4.setText(r5, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 != 0) goto L_0x032c
            r1 = 37
            boolean r1 = r11.A0X(r1)
            if (r1 == 0) goto L_0x04b4
            com.whatsapp.chatinfo.ContactInfoActivity r2 = r0.A0n
            r1 = 2131101328(0x7f060690, float:1.7815063E38)
            int r1 = X.AnonymousClass0Y8.A04(r2, r1)
            r4.setTextColor(r1)
        L_0x032c:
            r1 = 37
            boolean r1 = r11.A0X(r1)
            if (r1 != 0) goto L_0x03cd
            X.5ZB r10 = r0.A0C
            if (r10 != 0) goto L_0x0383
            r1 = 2131428302(0x7f0b03ce, float:1.8478245E38)
            android.view.View r2 = X.C06560Yg.A02(r3, r1)
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            r1 = 2131626064(0x7f0e0850, float:1.8879354E38)
            android.view.View r26 = X.C86634Kw.A0M(r2, r1)
            X.2sr r15 = r0.A0b
            X.5hX r14 = r0.A0Y
            X.1fd r13 = r0.A11
            X.5ZU r12 = r0.A0r
            X.33j r8 = r0.A0x
            X.2en r7 = r0.A0h
            X.5Up r5 = r0.A13
            X.5Xy r4 = r0.A0j
            java.lang.Integer r2 = r0.A1I
            com.whatsapp.chatinfo.ContactInfoActivity r1 = r0.A0n
            boolean r40 = r0.A0C()
            X.5ZB r10 = new X.5ZB
            r32 = r44
            r30 = r7
            r31 = r4
            r33 = r12
            r34 = r8
            r35 = r6
            r36 = r13
            r37 = r5
            r38 = r2
            r39 = r9
            r25 = r10
            r27 = r14
            r28 = r1
            r29 = r15
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r0.A0C = r10
        L_0x0383:
            X.5dt r1 = r0.A0L
            r10.A03(r1)
        L_0x0388:
            com.whatsapp.chatinfo.ContactInfoActivity r4 = r0.A0n
            r4.populatePhoneNumber(r3)
            X.5Th r2 = r0.A0f
            X.5dt r1 = r0.A0L
            boolean r1 = r2.A01(r1)
            if (r1 == 0) goto L_0x03b5
            r1 = 2131434249(0x7f0b1b09, float:1.8490307E38)
            android.widget.ImageView r2 = X.C86654Ky.A0M(r4, r1)
            if (r2 == 0) goto L_0x03b5
            X.5dt r1 = r0.A0L
            if (r1 == 0) goto L_0x03b9
            boolean r1 = r1.A0c
            if (r1 == 0) goto L_0x03b9
            r1 = 957(0x3bd, float:1.341E-42)
            boolean r1 = r11.A0X(r1)
            if (r1 == 0) goto L_0x03b9
            r1 = 8
            r2.setVisibility(r1)
        L_0x03b5:
            r2 = 8
            goto L_0x00a7
        L_0x03b9:
            r2.setVisibility(r9)
            r1 = 2131231807(0x7f08043f, float:1.8079705E38)
            r2.setImageResource(r1)
            r1 = 2131888120(0x7f1207f8, float:1.9410866E38)
            X.C18300x5.A13(r4, r2, r1)
            r1 = 7
            X.C989453v.A00(r2, r0, r1)
            goto L_0x03b5
        L_0x03cd:
            X.5dt r4 = r0.A0L
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            X.5dQ r1 = r4.A03
            if (r1 == 0) goto L_0x03df
            com.whatsapp.chatinfo.ContactInfoActivity r2 = r0.A0n
            r1 = 2131887133(0x7f12041d, float:1.9408864E38)
            X.C86654Ky.A0w(r2, r5, r1)
        L_0x03df:
            X.5da r2 = r4.A07
            X.5da r1 = X.C108805da.A04
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x03f1
            com.whatsapp.chatinfo.ContactInfoActivity r2 = r0.A0n
            r1 = 2131887130(0x7f12041a, float:1.9408858E38)
            X.C86654Ky.A0w(r2, r5, r1)
        L_0x03f1:
            java.lang.String r1 = r4.A0M
            if (r1 == 0) goto L_0x03fd
            com.whatsapp.chatinfo.ContactInfoActivity r2 = r0.A0n
            r1 = 2131887131(0x7f12041b, float:1.940886E38)
            X.C86654Ky.A0w(r2, r5, r1)
        L_0x03fd:
            java.lang.String r1 = r4.A0H
            if (r1 == 0) goto L_0x0409
            com.whatsapp.chatinfo.ContactInfoActivity r2 = r0.A0n
            r1 = 2131887132(0x7f12041c, float:1.9408862E38)
            X.C86654Ky.A0w(r2, r5, r1)
        L_0x0409:
            java.util.List r2 = r4.A0U
            boolean r1 = r2.isEmpty()
            r4 = 1
            if (r1 != 0) goto L_0x047e
            java.util.Iterator r12 = r2.iterator()
            r7 = 0
            r10 = 0
        L_0x0418:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x0465
            java.lang.String r2 = X.AnonymousClass001.A0m(r12)
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L_0x0418
            java.lang.String r1 = X.C1448073a.A00(r2)
            android.net.Uri r8 = android.net.Uri.parse(r1)
            java.lang.String r2 = r8.getHost()
            java.lang.String r1 = "www.instagram.com"
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 != 0) goto L_0x0463
            java.lang.String r2 = r8.getHost()
            java.lang.String r1 = "instagram.com"
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 != 0) goto L_0x0463
            java.lang.String r2 = r8.getHost()
            java.lang.String r1 = "instagr.am"
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 != 0) goto L_0x0463
            java.lang.String r2 = r8.getHost()
            java.lang.String r1 = "www.instagr.am"
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 != 0) goto L_0x0463
            int r7 = r7 + 1
            goto L_0x0418
        L_0x0463:
            r10 = 1
            goto L_0x0418
        L_0x0465:
            if (r7 <= 0) goto L_0x0474
            com.whatsapp.chatinfo.ContactInfoActivity r2 = r0.A0n
            r1 = 2131887135(0x7f12041f, float:1.9408869E38)
            if (r7 <= r4) goto L_0x0471
            r1 = 2131887136(0x7f120420, float:1.940887E38)
        L_0x0471:
            X.C86654Ky.A0w(r2, r5, r1)
        L_0x0474:
            if (r10 == 0) goto L_0x047e
            com.whatsapp.chatinfo.ContactInfoActivity r2 = r0.A0n
            r1 = 2131887134(0x7f12041e, float:1.9408867E38)
            X.C86654Ky.A0w(r2, r5, r1)
        L_0x047e:
            X.33j r1 = r0.A0x
            java.lang.String r4 = X.AnonymousClass5VS.A00(r1, r5, r4)
            android.view.View r1 = r0.A02
            if (r1 != 0) goto L_0x0388
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L_0x0388
            r1 = 2131431989(0x7f0b1235, float:1.8485723E38)
            android.view.View r2 = X.C06560Yg.A02(r3, r1)
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            r1 = 2131626069(0x7f0e0855, float:1.8879364E38)
            android.view.View r2 = X.C86634Kw.A0M(r2, r1)
            r0.A02 = r2
            r1 = 2131431987(0x7f0b1233, float:1.8485719E38)
            X.C86624Kv.A17(r2, r4, r1)
            r1 = 2131431988(0x7f0b1234, float:1.848572E38)
            X.C86604Kt.A1F(r3, r1, r9)
            android.view.View r2 = r0.A02
            r1 = 6
            X.C18320x8.A16(r2, r6, r0, r1)
            goto L_0x0388
        L_0x04b4:
            r1 = 2131232002(0x7f080502, float:1.80801E38)
            r4.setIcon((int) r1)
            goto L_0x032c
        L_0x04bc:
            java.lang.String r5 = r4.A0G
            goto L_0x0306
        L_0x04c0:
            java.lang.String r1 = r1.A0L
            r24 = r1
            goto L_0x0085
        L_0x04c6:
            android.view.View r1 = r0.A01
            r21 = r1
            r1.setVisibility(r2)
        L_0x04cd:
            android.view.View r1 = r0.A00
            r41 = r1
            r0.A05(r1, r2)
            goto L_0x007f
        L_0x04d6:
            int r4 = r9.length()
            int r5 = r5.length()
            if (r4 <= r5) goto L_0x0b5d
            int r4 = r9.length()
            int r4 = r4 - r5
            java.lang.String r5 = r9.substring(r1, r4)
        L_0x04e9:
            r4 = 0
            r8.setText(r5, r4)
            r0.A05(r8, r1)
        L_0x04f0:
            r4 = 2131428286(0x7f0b03be, float:1.8478212E38)
            android.widget.TextView r23 = X.C18300x5.A0G(r3, r4)
            X.5dt r8 = r0.A0L
            if (r8 == 0) goto L_0x0515
            X.5dQ r4 = r8.A03
            boolean r5 = X.AnonymousClass000.A1W(r4)
            X.7y6 r4 = r8.A06
            if (r4 == 0) goto L_0x050f
            r4 = 3465(0xd89, float:4.855E-42)
            boolean r4 = r7.A0X(r4)
            r22 = 1
            if (r4 != 0) goto L_0x0511
        L_0x050f:
            r22 = 0
        L_0x0511:
            if (r5 != 0) goto L_0x099f
            if (r22 != 0) goto L_0x099f
        L_0x0515:
            r4 = r23
            r4.setVisibility(r2)
        L_0x051a:
            com.whatsapp.WaTextView r8 = r0.A0B
            X.5dt r4 = r0.A0L
            if (r4 == 0) goto L_0x0539
            boolean r4 = r4.A0b
            if (r4 == 0) goto L_0x0539
            X.5dl r4 = r0.A0K
            if (r4 == 0) goto L_0x0539
            java.lang.Integer r4 = r4.A04
            int r4 = r4.intValue()
            if (r4 != 0) goto L_0x0539
            r4 = 3464(0xd88, float:4.854E-42)
            boolean r5 = r7.A0X(r4)
            r4 = 0
            if (r5 != 0) goto L_0x053b
        L_0x0539:
            r4 = 8
        L_0x053b:
            r8.setVisibility(r4)
            com.whatsapp.TextEmojiLabel r10 = r0.A07
            if (r10 == 0) goto L_0x05b3
            com.whatsapp.TextEmojiLabel r8 = r0.A0c
            if (r8 == 0) goto L_0x05b3
            X.5ZU r5 = r0.A0r
            X.7HU r4 = r5.A0E(r6, r1)
            java.lang.String r4 = r4.A01
            if (r4 != 0) goto L_0x0554
            java.lang.String r4 = r6.A0L()
        L_0x0554:
            android.text.Spannable r4 = X.C107635bd.A01(r4)
            X.C86664Kz.A1T(r10, r4)
            boolean r4 = r6.A0V()
            if (r4 != 0) goto L_0x0967
            boolean r4 = r6.A0W()
            if (r4 != 0) goto L_0x0967
            r10.A0E()
            r4 = 0
        L_0x056b:
            r10.setOnClickListener(r4)
            r8.setOnClickListener(r4)
        L_0x0571:
            boolean r4 = r0.A0E()
            if (r4 == 0) goto L_0x08fb
            r8.setVisibility(r1)
            r5 = 2131886979(0x7f120383, float:1.9408552E38)
            java.lang.String r11 = r6.A0L()
            int r9 = X.AnonymousClass29N.A00(r7)
            boolean r4 = r6.A0Q()
            if (r4 == 0) goto L_0x08ea
            java.lang.String r4 = r6.A0J()
            if (r4 == 0) goto L_0x08ea
            java.lang.String r4 = r6.A0J()
            r10.setText(r4)
            if (r11 == 0) goto L_0x05aa
            r8.setText(r5)
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r4 = " · "
            java.lang.String r4 = X.AnonymousClass000.A0V(r4, r11, r5)
            r8.append(r4)
        L_0x05aa:
            boolean r4 = r6.A0V()
            if (r4 == 0) goto L_0x05b3
            r8.setCompoundDrawablesWithIntrinsicBounds(r1, r1, r9, r1)
        L_0x05b3:
            android.widget.TextView r4 = r0.A04
            r4.setVisibility(r2)
            r12 = 1
            if (r48 != 0) goto L_0x05d4
            X.5Tt r8 = r0.A0i
            java.lang.Integer r4 = r0.A1I
            if (r4 == 0) goto L_0x08e6
            int r5 = r4.intValue()
            r4 = 19
            if (r5 == r4) goto L_0x08e2
            r4 = 20
            if (r5 != r4) goto L_0x08e6
            java.lang.String r5 = "custom_qr_code_link"
        L_0x05cf:
            java.lang.String r4 = "whatsapp"
            r8.A02(r12, r5, r4)
        L_0x05d4:
            if (r47 == 0) goto L_0x061d
            X.5dt r4 = r0.A0L
            if (r4 != 0) goto L_0x05e2
            com.whatsapp.chatinfo.ContactInfoActivity r5 = r0.A0n
            r4 = 2131887137(0x7f120421, float:1.9408873E38)
            r5.Bp9(r4)
        L_0x05e2:
            com.whatsapp.jid.UserJid r8 = r0.A02()
            if (r8 == 0) goto L_0x05ef
            X.33g r5 = r0.A0g
            r4 = r24
            r5.A08(r0, r8, r4)
        L_0x05ef:
            boolean r4 = r6.A0R()
            if (r4 == 0) goto L_0x061d
            X.5Xy r8 = r0.A0j
            com.whatsapp.jid.UserJid r4 = r0.A02()
            java.lang.String r11 = X.C627336j.A07(r4)
            r9 = 0
            java.lang.Integer r10 = r0.A1I
            boolean r13 = r0.A0C()
            boolean r14 = r0.A0B()
            r8.A06(r9, r10, r11, r12, r13, r14)
            X.5dt r4 = r0.A0L
            if (r4 == 0) goto L_0x061a
            X.7yC r4 = r4.A04
            if (r4 == 0) goto L_0x061a
            r4 = 19
            r0.A03(r4)
        L_0x061a:
            r0.A04(r1)
        L_0x061d:
            X.4kC r13 = r0.A0o
            android.view.ViewTreeObserver r5 = r13.getViewTreeObserver()
            r4 = 3
            X.AnonymousClass6BG.A00(r5, r0, r4)
            r4 = 2582(0xa16, float:3.618E-42)
            boolean r4 = r7.A0X(r4)
            if (r4 == 0) goto L_0x0666
            X.5dt r4 = r0.A0L
            if (r4 == 0) goto L_0x08db
            java.lang.String r8 = r4.A0F
            boolean r4 = X.C107575bX.A0F(r8)
            if (r4 != 0) goto L_0x08db
            java.lang.Object[] r5 = X.AnonymousClass002.A0M()
            java.lang.String r4 = "wa.me"
            r5[r1] = r4
            r5[r12] = r8
            java.lang.String r4 = "%s/%s"
            java.lang.String r9 = java.lang.String.format(r4, r5)
            com.whatsapp.jid.UserJid r8 = r0.A02()
            X.C626936e.A06(r8)
            com.whatsapp.WaTextView r5 = r0.A0A
            r5.setText(r9)
            r5.setVisibility(r1)
            r4 = 7
            X.C18320x8.A16(r5, r8, r0, r4)
            X.5fF r4 = new X.5fF
            r4.<init>(r0, r9)
            r5.setOnLongClickListener(r4)
        L_0x0666:
            X.5dt r12 = r0.A0L
            if (r12 == 0) goto L_0x070e
            X.7xy r10 = r12.A05
            if (r10 == 0) goto L_0x070e
            r4 = 2131428949(0x7f0b0655, float:1.8479557E38)
            android.view.View r14 = X.C06560Yg.A02(r3, r4)
            r8 = 8
            X.5dX r5 = r10.A00
            if (r5 != 0) goto L_0x07d8
            X.5dX r4 = r10.A01
            if (r4 != 0) goto L_0x07d8
        L_0x067f:
            r14.setVisibility(r8)
            com.whatsapp.jid.UserJid r23 = r0.A02()
            if (r5 == 0) goto L_0x07d1
            X.5Up r8 = r0.A13
            boolean r5 = r5.A03
            if (r5 == 0) goto L_0x07d1
            X.1VX r11 = r8.A03
            r5 = 3487(0xd9f, float:4.886E-42)
            boolean r5 = r11.A0X(r5)
            if (r5 != 0) goto L_0x06a0
            r5 = 2781(0xadd, float:3.897E-42)
            boolean r5 = r11.A0X(r5)
            if (r5 == 0) goto L_0x07d1
        L_0x06a0:
            com.whatsapp.biz.linkedaccounts.LinkedAccountsMediaCard r10 = r0.A0F
            r10.setVisibility(r1)
            java.lang.Integer r9 = r0.A1I
            X.5dl r8 = r0.A0K
            boolean r29 = r0.A0B()
            r5 = 3487(0xd9f, float:4.886E-42)
            boolean r5 = r11.A0X(r5)
            boolean r30 = X.AnonymousClass000.A1S(r5)
            X.5Xy r5 = r0.A0j
            r26 = r1
            r22 = r10
            r24 = r1
            r25 = r12
            r27 = r9
            r28 = r8
            r31 = r5
            r22.setup(r23, r24, r25, r26, r27, r28, r29, r30, r31)
        L_0x06ca:
            if (r4 == 0) goto L_0x07ca
            X.5Up r5 = r0.A13
            boolean r4 = r4.A03
            if (r4 == 0) goto L_0x07ca
            X.1VX r10 = r5.A03
            r4 = 3486(0xd9e, float:4.885E-42)
            boolean r4 = r10.A0X(r4)
            if (r4 != 0) goto L_0x06e4
            r4 = 2780(0xadc, float:3.896E-42)
            boolean r4 = r10.A0X(r4)
            if (r4 == 0) goto L_0x07ca
        L_0x06e4:
            com.whatsapp.biz.linkedaccounts.LinkedAccountsMediaCard r9 = r0.A0G
            r9.setVisibility(r1)
            r26 = 1
            java.lang.Integer r8 = r0.A1I
            X.5dl r5 = r0.A0K
            boolean r29 = r0.A0B()
            r4 = 3486(0xd9e, float:4.885E-42)
            boolean r4 = r10.A0X(r4)
            boolean r30 = X.AnonymousClass000.A1S(r4)
            X.5Xy r4 = r0.A0j
            r22 = r9
            r24 = r1
            r25 = r12
            r27 = r8
            r28 = r5
            r31 = r4
            r22.setup(r23, r24, r25, r26, r27, r28, r29, r30, r31)
        L_0x070e:
            X.5dt r4 = r0.A0L
            if (r4 == 0) goto L_0x07c4
            X.7xy r5 = r4.A05
            if (r5 == 0) goto L_0x07c4
            X.5dX r4 = r5.A00
            if (r4 != 0) goto L_0x071c
            r0.A0R = r1
        L_0x071c:
            X.5dX r4 = r5.A01
            if (r4 != 0) goto L_0x0722
            r0.A0S = r1
        L_0x0722:
            r5 = 1
            X.93d r4 = new X.93d
            r4.<init>(r0, r5)
            r13.A0P = r4
        L_0x072a:
            X.5RZ r5 = r0.A0l
            X.3ZH r4 = r0.A0M
            boolean r4 = r5.A01(r4)
            r9 = 0
            if (r4 == 0) goto L_0x0742
            X.2mi r5 = r0.A0N
            com.whatsapp.jid.UserJid r4 = r0.A02()
            boolean r5 = r5.A02(r4)
            r4 = 1
            if (r5 == 0) goto L_0x0743
        L_0x0742:
            r4 = 0
        L_0x0743:
            com.whatsapp.InfoCard r8 = r0.A05
            if (r4 != 0) goto L_0x0749
            r9 = 8
        L_0x0749:
            r0.A05(r8, r9)
            r0.A0Q = r4
            X.C989453v.A00(r8, r0, r2)
            if (r4 == 0) goto L_0x075a
            X.93d r4 = new X.93d
            r4.<init>(r0, r1)
            r13.A0P = r4
        L_0x075a:
            r4 = 2852(0xb24, float:3.997E-42)
            boolean r4 = r7.A0X(r4)
            if (r4 == 0) goto L_0x0786
            X.5dt r4 = r0.A0L
            if (r4 == 0) goto L_0x0786
            java.lang.String r4 = r4.A0I
            boolean r4 = X.C107575bX.A0F(r4)
            if (r4 != 0) goto L_0x0786
            r4 = 2131431345(0x7f0b0fb1, float:1.8484417E38)
            android.view.View r5 = X.C06560Yg.A02(r3, r4)
            r5.setVisibility(r1)
            r4 = 2131431346(0x7f0b0fb2, float:1.8484419E38)
            android.widget.TextView r5 = X.C18300x5.A0G(r5, r4)
            X.5dt r4 = r0.A0L
            java.lang.String r4 = r4.A0I
            r5.setText(r4)
        L_0x0786:
            X.5dt r4 = r0.A0L
            if (r4 == 0) goto L_0x0bd8
            java.util.List r4 = r4.A0N
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0bd8
            r4 = 3286(0xcd6, float:4.605E-42)
            boolean r4 = r7.A0X(r4)
            if (r4 == 0) goto L_0x0bd8
            r4 = 2131433570(0x7f0b1862, float:1.848893E38)
            android.view.View r7 = X.C06560Yg.A02(r3, r4)
            r7.setVisibility(r1)
            X.5Je r12 = r0.A0J
            if (r12 != 0) goto L_0x07b5
            X.33j r5 = r0.A0x
            android.content.Context r4 = r7.getContext()
            X.5Je r12 = new X.5Je
            r12.<init>(r4, r7, r5)
            r0.A0J = r12
        L_0x07b5:
            X.5dt r4 = r0.A0L
            java.util.List r4 = r4.A0N
            X.4WI r7 = r12.A00
            if (r7 != 0) goto L_0x0b61
            java.lang.String r0 = "serviceOfferingsGridAdapter"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x07c4:
            r0.A0R = r1
            r0.A0S = r1
            goto L_0x072a
        L_0x07ca:
            com.whatsapp.biz.linkedaccounts.LinkedAccountsMediaCard r4 = r0.A0G
            r4.setVisibility(r2)
            goto L_0x070e
        L_0x07d1:
            com.whatsapp.biz.linkedaccounts.LinkedAccountsMediaCard r5 = r0.A0F
            r5.setVisibility(r2)
            goto L_0x06ca
        L_0x07d8:
            r4 = 2131434450(0x7f0b1bd2, float:1.8490714E38)
            android.view.View r4 = X.C06560Yg.A02(r3, r4)
            com.whatsapp.biz.profile.TrustSignalItem r4 = (com.whatsapp.biz.profile.TrustSignalItem) r4
            r0.A0H = r4
            r4 = 2131434451(0x7f0b1bd3, float:1.8490716E38)
            android.view.View r4 = X.C06560Yg.A02(r3, r4)
            com.whatsapp.biz.profile.TrustSignalItem r4 = (com.whatsapp.biz.profile.TrustSignalItem) r4
            r0.A0I = r4
            com.whatsapp.jid.UserJid r4 = r0.A02()
            java.lang.String r30 = X.C627336j.A07(r4)
            X.5Up r9 = r0.A13
            if (r5 == 0) goto L_0x089e
            boolean r4 = r5.A03
            if (r4 == 0) goto L_0x089e
            X.1VX r11 = r9.A03
            r4 = 3487(0xd9f, float:4.886E-42)
            boolean r4 = r11.A0X(r4)
            if (r4 != 0) goto L_0x0810
            r4 = 2781(0xadd, float:3.897E-42)
            boolean r4 = r11.A0X(r4)
            if (r4 == 0) goto L_0x089e
        L_0x0810:
            com.whatsapp.biz.profile.TrustSignalItem r4 = r0.A0H
            r4.setVisibility(r2)
        L_0x0815:
            X.5dX r4 = r10.A01
            if (r4 == 0) goto L_0x0864
            boolean r10 = r4.A03
            if (r10 == 0) goto L_0x0864
            X.1VX r10 = r9.A03
            r9 = 3486(0xd9e, float:4.885E-42)
            boolean r9 = r10.A0X(r9)
            if (r9 != 0) goto L_0x082f
            r9 = 2780(0xadc, float:3.896E-42)
            boolean r9 = r10.A0X(r9)
            if (r9 == 0) goto L_0x0864
        L_0x082f:
            com.whatsapp.biz.profile.TrustSignalItem r9 = r0.A0I
            r9.setVisibility(r2)
        L_0x0834:
            r9 = 2131434453(0x7f0b1bd5, float:1.849072E38)
            android.view.View r11 = X.C06560Yg.A02(r3, r9)
            com.whatsapp.biz.profile.TrustSignalItem r9 = r0.A0H
            int r9 = r9.getVisibility()
            if (r9 != 0) goto L_0x084c
            com.whatsapp.biz.profile.TrustSignalItem r9 = r0.A0I
            int r10 = r9.getVisibility()
            r9 = 0
            if (r10 == 0) goto L_0x084e
        L_0x084c:
            r9 = 8
        L_0x084e:
            r11.setVisibility(r9)
            com.whatsapp.biz.profile.TrustSignalItem r9 = r0.A0H
            int r9 = r9.getVisibility()
            if (r9 == 0) goto L_0x0861
            com.whatsapp.biz.profile.TrustSignalItem r9 = r0.A0I
            int r9 = r9.getVisibility()
            if (r9 != 0) goto L_0x067f
        L_0x0861:
            r8 = 0
            goto L_0x067f
        L_0x0864:
            X.5hX r9 = r0.A0Y
            r17 = r9
            com.whatsapp.biz.profile.TrustSignalItem r10 = r0.A0I
            X.5Xy r9 = r0.A0j
            r16 = r9
            java.lang.Integer r15 = r0.A1I
            X.3ZH r9 = r0.A0M
            boolean r32 = r9.A0R()
            X.5dl r11 = r0.A0K
            boolean r31 = r0.A0B()
            r10.setUpFromAccount(r4)
            if (r4 == 0) goto L_0x0834
            int r9 = r10.A00
            android.net.Uri r23 = X.AnonymousClass73Z.A00(r4, r9)
            X.5ew r9 = new X.5ew
            r25 = r10
            r26 = r16
            r27 = r11
            r28 = r4
            r29 = r15
            r22 = r9
            r24 = r17
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r10.setOnClickListener(r9)
            goto L_0x0834
        L_0x089e:
            X.5hX r4 = r0.A0Y
            r18 = r4
            com.whatsapp.biz.profile.TrustSignalItem r11 = r0.A0H
            X.5Xy r4 = r0.A0j
            r17 = r4
            java.lang.Integer r4 = r0.A1I
            r16 = r4
            X.3ZH r4 = r0.A0M
            boolean r32 = r4.A0R()
            X.5dl r15 = r0.A0K
            boolean r31 = r0.A0B()
            r11.setUpFromAccount(r5)
            if (r5 == 0) goto L_0x0815
            int r4 = r11.A00
            android.net.Uri r23 = X.AnonymousClass73Z.A00(r5, r4)
            X.5ew r4 = new X.5ew
            r25 = r11
            r26 = r17
            r27 = r15
            r28 = r5
            r29 = r16
            r22 = r4
            r24 = r18
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r11.setOnClickListener(r4)
            goto L_0x0815
        L_0x08db:
            com.whatsapp.WaTextView r4 = r0.A0A
            r4.setVisibility(r2)
            goto L_0x0666
        L_0x08e2:
            java.lang.String r5 = "custom_link"
            goto L_0x05cf
        L_0x08e6:
            java.lang.String r5 = "biz_profile"
            goto L_0x05cf
        L_0x08ea:
            r10.setText(r11)
            r8.setText(r5)
            boolean r4 = r6.A0V()
            if (r4 == 0) goto L_0x05b3
            r10.setCompoundDrawablesWithIntrinsicBounds(r1, r1, r9, r1)
            goto L_0x05b3
        L_0x08fb:
            X.2mi r9 = r0.A0N
            X.4uZ r4 = r6.A0H
            boolean r4 = r9.A02(r4)
            if (r4 == 0) goto L_0x0910
            r4 = 2131895578(0x7f12251a, float:1.9425993E38)
            r8.setText(r4)
        L_0x090b:
            r8.setVisibility(r1)
            goto L_0x05b3
        L_0x0910:
            r4 = r42
            boolean r4 = X.C86624Kv.A1X(r6, r4)
            if (r4 != 0) goto L_0x093a
            X.4uZ r4 = r6.A0H
            boolean r4 = X.C616831v.A00(r7, r4)
            if (r4 != 0) goto L_0x093a
            boolean r4 = r0.A1J
            if (r4 != 0) goto L_0x0962
            boolean r4 = X.C86654Ky.A1Y(r6)
            if (r4 != 0) goto L_0x0946
            boolean r4 = r6.A0Q()
            if (r4 != 0) goto L_0x0946
            X.33j r4 = r0.A0x
            java.lang.String r4 = X.C86654Ky.A0m(r4, r6)
        L_0x0936:
            r8.setText(r4)
            goto L_0x090b
        L_0x093a:
            X.2oU r4 = r0.A0v
            android.content.Context r5 = r4.A00
            r4 = 2131895455(0x7f12249f, float:1.9425743E38)
            java.lang.String r4 = X.AnonymousClass1RT.A00(r5, r4)
            goto L_0x0936
        L_0x0946:
            boolean r4 = r5.A0d(r6)
            if (r4 != 0) goto L_0x0962
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r4 = "~"
            r5.append(r4)
            java.lang.String r4 = r6.A0L()
            java.lang.String r5 = X.AnonymousClass000.A0X(r4, r5)
            r4 = 0
            r8.A0K(r4, r5)
            goto L_0x090b
        L_0x0962:
            r8.setVisibility(r2)
            goto L_0x05b3
        L_0x0967:
            int r9 = X.AnonymousClass29N.A00(r7)
            X.2k5 r4 = r6.A0F
            if (r4 == 0) goto L_0x0995
            boolean r4 = r5.A0d(r6)
            if (r4 != 0) goto L_0x0995
            r10.A0E()
            r4 = 2131168532(0x7f070d14, float:1.7951368E38)
            r8.A0F(r9, r4)
        L_0x097e:
            X.4uZ r4 = r6.A0H
            boolean r4 = r4 instanceof X.C135216kJ
            if (r4 != 0) goto L_0x0571
            r4 = 5295(0x14af, float:7.42E-42)
            boolean r4 = r7.A0X(r4)
            if (r4 == 0) goto L_0x0571
            r9 = 14
            X.5f3 r4 = new X.5f3
            r4.<init>((java.lang.Object) r0, (int) r9, (java.lang.Object) r6)
            goto L_0x056b
        L_0x0995:
            r8.A0E()
            r4 = 2131168532(0x7f070d14, float:1.7951368E38)
            r10.A0F(r9, r4)
            goto L_0x097e
        L_0x099f:
            android.text.SpannableStringBuilder r11 = new android.text.SpannableStringBuilder
            r11.<init>()
            if (r5 == 0) goto L_0x0a6a
            X.33j r4 = r0.A0x
            r25 = r4
            com.whatsapp.chatinfo.ContactInfoActivity r10 = r0.A0n
            X.2sH r4 = r0.A0u
            long r4 = r4.A0H()
            X.5dt r8 = r0.A0L
            X.5dQ r8 = r8.A03
            java.lang.String r15 = r8.A01
            boolean r9 = X.C107575bX.A0F(r15)
            if (r9 == 0) goto L_0x09ec
            java.util.TimeZone r9 = java.util.TimeZone.getDefault()
        L_0x09c2:
            java.util.Calendar r9 = java.util.Calendar.getInstance(r9)
            r9.setTimeInMillis(r4)
            r12 = 7
            int r13 = r9.get(r12)
            java.util.ArrayList r14 = X.AnonymousClass001.A0s()
            java.util.List r8 = r8.A02
            java.util.Iterator r16 = r8.iterator()
        L_0x09d8:
            boolean r8 = r16.hasNext()
            if (r8 == 0) goto L_0x09f1
            java.lang.Object r12 = r16.next()
            X.7yB r12 = (X.C166127yB) r12
            int r8 = r12.A00
            if (r8 != r13) goto L_0x09d8
            r14.add(r12)
            goto L_0x09d8
        L_0x09ec:
            java.util.TimeZone r9 = java.util.TimeZone.getTimeZone(r15)
            goto L_0x09c2
        L_0x09f1:
            r8 = 2131099942(0x7f060126, float:1.7812251E38)
            r12 = 2131887148(0x7f12042c, float:1.9408895E38)
            java.lang.String r20 = r10.getString(r12)
            if (r15 == 0) goto L_0x0b59
            java.util.TimeZone r12 = java.util.TimeZone.getDefault()
            int r13 = r12.getOffset(r4)
            java.util.TimeZone r12 = java.util.TimeZone.getTimeZone(r15)
            int r4 = r12.getOffset(r4)
            if (r13 == r4) goto L_0x0b59
            r4 = 2131887141(0x7f120425, float:1.940888E38)
            java.lang.String r19 = r10.getString(r4)
        L_0x0a16:
            boolean r4 = r14.isEmpty()
            if (r4 != 0) goto L_0x0b55
            java.lang.Object r4 = r14.get(r1)
            X.7yB r4 = (X.C166127yB) r4
            int r13 = r4.A00
            int r4 = r4.A01
            r18 = 2
            r12 = 1
            if (r4 == 0) goto L_0x0a9c
            if (r4 == r12) goto L_0x0a8e
            r5 = r18
            if (r4 != r5) goto L_0x0b55
            r8 = 2131099943(0x7f060127, float:1.7812253E38)
            r4 = 2131887144(0x7f120428, float:1.9408887E38)
            java.lang.String r13 = r10.getString(r4)
            r9 = 2131887143(0x7f120427, float:1.9408885E38)
        L_0x0a3e:
            java.lang.Object[] r5 = new java.lang.Object[r12]
            r5[r1] = r13
        L_0x0a42:
            java.lang.String r20 = r10.getString(r9, r5)
        L_0x0a46:
            android.text.style.ForegroundColorSpan r12 = X.C86634Kw.A0I(r10, r8)
            java.lang.String r4 = r20.trim()
            int r10 = r4.indexOf(r13)
            int r9 = X.C86664Kz.A0L(r13, r10)
            android.text.SpannableString r8 = X.AnonymousClass4L0.A0A(r4)
            r5 = 33
            r8.setSpan(r12, r10, r9, r5)
            X.4N1 r4 = new X.4N1
            r4.<init>()
            r8.setSpan(r4, r10, r9, r5)
            r11.append(r8)
        L_0x0a6a:
            if (r22 == 0) goto L_0x0a84
            int r4 = r11.length()
            if (r4 <= 0) goto L_0x0a7b
            java.lang.String r4 = " • "
            android.text.SpannableString r4 = X.AnonymousClass4L0.A0A(r4)
            r11.append(r4)
        L_0x0a7b:
            X.5dt r4 = r0.A0L
            X.7y6 r4 = r4.A06
            java.lang.String r4 = r4.A02
            r11.append(r4)
        L_0x0a84:
            r4 = r23
            X.C86664Kz.A1T(r4, r11)
            r4.setVisibility(r1)
            goto L_0x051a
        L_0x0a8e:
            r8 = 2131099943(0x7f060127, float:1.7812253E38)
            r4 = 2131887151(0x7f12042f, float:1.94089E38)
            java.lang.String r13 = r10.getString(r4)
            r9 = 2131887150(0x7f12042e, float:1.9408899E38)
            goto L_0x0a3e
        L_0x0a9c:
            r4 = 11
            int r4 = r9.get(r4)
            int r5 = r4 * 60
            r4 = 12
            int r4 = r9.get(r4)
            int r5 = r5 + r4
            java.util.Iterator r17 = r14.iterator()
            r16 = 1
        L_0x0ab1:
            boolean r4 = r17.hasNext()
            if (r4 == 0) goto L_0x0b55
            java.lang.Object r4 = r17.next()
            X.7yB r4 = (X.C166127yB) r4
            java.lang.Integer r15 = r4.A03
            int r15 = X.C86664Kz.A0K(r15)
            java.lang.Integer r4 = r4.A02
            int r4 = X.C86664Kz.A0K(r4)
            if (r5 >= r15) goto L_0x0aeb
            java.util.Calendar r14 = A00(r9, r13, r15)
            r4 = 2131887147(0x7f12042b, float:1.9408893E38)
            java.lang.String r13 = r10.getString(r4)
            r9 = 2131887146(0x7f12042a, float:1.940889E38)
            java.lang.Object[] r5 = X.AnonymousClass0x9.A1X()
            r5[r1] = r13
            r4 = r25
            java.lang.String r4 = X.C107145am.A03(r4, r14)
        L_0x0ae5:
            r5[r12] = r4
            r5[r18] = r19
            goto L_0x0a42
        L_0x0aeb:
            if (r5 <= r4) goto L_0x0af7
            r4 = 2131887145(0x7f120429, float:1.9408889E38)
            java.lang.String r20 = r10.getString(r4)
            r16 = 0
            goto L_0x0ab1
        L_0x0af7:
            java.util.Calendar r8 = A00(r9, r13, r4)
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            r5 = r25
            java.lang.String r5 = X.C107145am.A03(r5, r8)
            r4.append(r5)
            int r5 = r14.size()
            if (r5 <= r12) goto L_0x0b41
            if (r16 == 0) goto L_0x0b41
            r15 = 2131887142(0x7f120426, float:1.9408883E38)
            java.lang.Object[] r8 = new java.lang.Object[r12]
            java.lang.String r5 = " "
            java.lang.String r5 = X.AnonymousClass002.A0F(r10, r5, r8, r1, r15)
            r4.append(r5)
            java.lang.Object r5 = r14.get(r12)
            X.7yB r5 = (X.C166127yB) r5
            java.lang.Integer r8 = r5.A03
            int r8 = X.C86664Kz.A0K(r8)
            java.util.Calendar r8 = A00(r9, r13, r8)
            java.lang.Integer r5 = r5.A02
            int r5 = X.C86664Kz.A0K(r5)
            java.util.Calendar r9 = A00(r9, r13, r5)
            r5 = r25
            java.lang.String r5 = X.C107145am.A04(r5, r8, r9)
            r4.append(r5)
        L_0x0b41:
            r8 = 2131099943(0x7f060127, float:1.7812253E38)
            r5 = 2131887154(0x7f120432, float:1.9408907E38)
            java.lang.String r13 = r10.getString(r5)
            r9 = 2131887153(0x7f120431, float:1.9408905E38)
            java.lang.Object[] r5 = X.AnonymousClass0x9.A1X()
            r5[r1] = r13
            goto L_0x0ae5
        L_0x0b55:
            r13 = r20
            goto L_0x0a46
        L_0x0b59:
            java.lang.String r19 = ""
            goto L_0x0a16
        L_0x0b5d:
            java.lang.String r5 = ""
            goto L_0x04e9
        L_0x0b61:
            java.util.ArrayList r9 = X.AnonymousClass001.A0s()
            java.util.LinkedHashMap r11 = X.C18320x8.A0r()
            java.util.Iterator r10 = r4.iterator()
        L_0x0b6d:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L_0x0b86
            java.lang.Object r5 = r10.next()
            r4 = r5
            X.5dd r4 = (X.C108835dd) r4
            java.lang.String r4 = r4.A02
            java.lang.Object r4 = X.C18310x6.A0h(r4, r11)
            java.util.List r4 = (java.util.List) r4
            r4.add(r5)
            goto L_0x0b6d
        L_0x0b86:
            java.util.Iterator r13 = X.AnonymousClass000.A0q(r11)
        L_0x0b8a:
            boolean r4 = r13.hasNext()
            if (r4 == 0) goto L_0x0bb9
            java.lang.Object r11 = X.AnonymousClass0x2.A0W(r13)
            java.util.List r11 = (java.util.List) r11
            java.util.Iterator r10 = r11.iterator()
        L_0x0b9a:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L_0x0bb1
            java.lang.Object r5 = r10.next()
            r4 = r5
            X.5dd r4 = (X.C108835dd) r4
            boolean r4 = r4.A04
            if (r4 == 0) goto L_0x0b9a
            if (r5 == 0) goto L_0x0bb1
            r9.add(r5)
            goto L_0x0b8a
        L_0x0bb1:
            java.lang.Object r4 = r11.get(r1)
            r9.add(r4)
            goto L_0x0b8a
        L_0x0bb9:
            X.33j r4 = r12.A04
            java.text.Collator r4 = X.C86614Ku.A0w(r4)
            r4.setStrength(r1)
            X.63l r5 = new X.63l
            r5.<init>(r4)
            X.91R r4 = new X.91R
            r4.<init>(r5, r2)
            java.util.List r5 = X.C73723fy.A0L(r9, r4)
            X.C162457s7.A0J(r5, r1)
            java.util.List r4 = r7.A00
            X.C86644Kx.A1F(r7, r5, r4)
        L_0x0bd8:
            X.5rC r4 = r0.A0V
            java.lang.Object r7 = r4.A05()
            X.66o r7 = (X.C1229766o) r7
            X.8qC r4 = r0.A1H
            java.lang.Object r4 = r4.get()
            X.5rC r4 = (X.C116985rC) r4
            java.lang.Object r5 = r4.A05()
            com.whatsapp.jid.UserJid r4 = r0.A02()
            if (r7 == 0) goto L_0x0c1f
            if (r5 == 0) goto L_0x0c1f
            if (r4 == 0) goto L_0x0c1f
            boolean r4 = r7.BH2(r4)
            if (r4 == 0) goto L_0x0c1f
            com.whatsapp.TextEmojiLabel r5 = r0.A0c
            r4 = 2131886931(0x7f120353, float:1.9408455E38)
            r5.setText(r4)
            r4 = 2131100162(0x7f060202, float:1.7812698E38)
            r7.AxS(r5, r4, r1)
            com.whatsapp.WaTextView r4 = r0.A0e
            r0.A05(r4, r2)
            r4 = r41
            r0.A05(r4, r2)
            r0.A05(r8, r2)
            com.whatsapp.TextEmojiLabel r5 = r0.A08
            r4 = 2131886924(0x7f12034c, float:1.940844E38)
            r5.setText(r4)
        L_0x0c1f:
            java.lang.String r7 = r6.A0J()
            if (r7 == 0) goto L_0x0ce7
            boolean r4 = r7.isEmpty()
            if (r4 != 0) goto L_0x0ce7
            char r5 = r7.charAt(r1)
            r4 = 64
            if (r5 != r4) goto L_0x0ce7
            r0.A0A(r7)
        L_0x0c36:
            boolean r4 = r0.A1J
            if (r4 == 0) goto L_0x0c3f
            r4 = r41
            r0.A05(r4, r2)
        L_0x0c3f:
            boolean r4 = r0.A0E()
            if (r4 == 0) goto L_0x0c82
            if (r21 == 0) goto L_0x0c4c
            r4 = r21
            r4.setVisibility(r2)
        L_0x0c4c:
            r2 = 2131428237(0x7f0b038d, float:1.8478113E38)
            android.view.ViewStub r2 = X.C86664Kz.A0n(r3, r2)
            if (r2 == 0) goto L_0x0c5e
            android.view.View r4 = r2.inflate()
            r2 = 26
            X.C18320x8.A15(r4, r0, r2)
        L_0x0c5e:
            X.5dt r2 = r0.A0L
            if (r2 == 0) goto L_0x0c82
            java.lang.String r5 = r2.A0G
            boolean r2 = X.C107575bX.A0F(r5)
            if (r2 != 0) goto L_0x0c82
            r2 = 2131428316(0x7f0b03dc, float:1.8478273E38)
            android.view.ViewStub r2 = X.C86664Kz.A0n(r3, r2)
            if (r2 != 0) goto L_0x0cdb
            r2 = 2131428241(0x7f0b0391, float:1.847812E38)
            android.view.View r2 = r3.findViewById(r2)
        L_0x0c7a:
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2.setText(r5)
            r2.setVisibility(r1)
        L_0x0c82:
            X.5dt r0 = r0.A0L
            if (r0 == 0) goto L_0x0cf9
            java.util.List r4 = r0.A0P
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0cf9
            r0 = 2131428239(0x7f0b038f, float:1.8478117E38)
            android.view.ViewStub r0 = X.C86664Kz.A0n(r3, r0)
            if (r0 == 0) goto L_0x0cf9
            android.view.View r2 = r0.inflate()
            r0 = 2131428238(0x7f0b038e, float:1.8478115E38)
            android.view.ViewGroup r8 = X.C86644Kx.A0J(r2, r0)
            if (r8 == 0) goto L_0x0cf9
            java.util.Iterator r7 = r4.iterator()
        L_0x0ca8:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0cf9
            java.lang.Object r6 = r7.next()
            X.3ZL r6 = (X.AnonymousClass3ZL) r6
            android.view.LayoutInflater r2 = X.C18280x3.A0D(r3)
            r0 = 2131626186(0x7f0e08ca, float:1.8879601E38)
            android.view.View r5 = r2.inflate(r0, r8, r1)
            boolean r0 = r5 instanceof com.google.android.material.chip.Chip
            if (r0 == 0) goto L_0x0cd7
            r4 = r5
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.Object[] r2 = X.AnonymousClass002.A0L()
            java.lang.String r0 = r6.A01
            r2[r1] = r0
            java.lang.String r0 = "/%s"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r4.setText(r0)
        L_0x0cd7:
            r8.addView(r5)
            goto L_0x0ca8
        L_0x0cdb:
            android.view.View r4 = r2.inflate()
            r2 = 2131428241(0x7f0b0391, float:1.847812E38)
            android.view.View r2 = X.C06560Yg.A02(r4, r2)
            goto L_0x0c7a
        L_0x0ce7:
            X.4uZ r5 = r6.A0H
            if (r5 == 0) goto L_0x0c36
            X.2bD r4 = r0.A1B
            X.0Wx r6 = r4.A00(r5)
            com.whatsapp.chatinfo.ContactInfoActivity r5 = r0.A0n
            r4 = 6
            X.C86604Kt.A1N(r5, r6, r0, r4)
            goto L_0x0c36
        L_0x0cf9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111755id.A06(X.5dl, X.3ZH, X.5ez, boolean, boolean, boolean):void");
    }
}
