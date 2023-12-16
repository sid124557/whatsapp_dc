package X;

import android.net.Uri;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: X.36Y  reason: invalid class name */
public class AnonymousClass36Y {
    public static final int A0D = AnonymousClass8GU.A05;
    public final C116985rC A00;
    public final C116985rC A01;
    public final C111095hX A02;
    public final C56972sr A03;
    public final C42182Nc A04;
    public final C49842hB A05;
    public final AnonymousClass1VX A06;
    public final C106685Zz A07;
    public final AnonymousClass5Y8 A08;
    public final C54902pT A09;
    public final AnonymousClass32F A0A;
    public final C51072jE A0B;
    public final AnonymousClass2J3 A0C;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0037, code lost:
        if (r4 != null) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A04(android.net.Uri r4, X.AnonymousClass1VX r5) {
        /*
            java.lang.String r0 = "entry_point"
            java.lang.String r4 = r4.getQueryParameter(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x0037
            java.lang.String r4 = "click_to_chat_link"
        L_0x000e:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x003a
            r1 = 533(0x215, float:7.47E-43)
            X.2vE r0 = X.C58422vE.A02
            java.lang.String r1 = r5.A0R(r0, r1)
            if (r1 == 0) goto L_0x003b
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x003b
            java.lang.String[] r3 = X.C18320x8.A1b(r1)
            int r2 = r3.length
            r1 = 0
        L_0x002a:
            if (r1 >= r2) goto L_0x003a
            r0 = r3[r1]
            boolean r0 = r4.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x003b
            int r1 = r1 + 1
            goto L_0x002a
        L_0x0037:
            if (r4 == 0) goto L_0x003a
            goto L_0x000e
        L_0x003a:
            r4 = 0
        L_0x003b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36Y.A04(android.net.Uri, X.1VX):java.lang.String");
    }

    public static String A05(Uri uri, AnonymousClass1VX r5, boolean z) {
        String A0R;
        String queryParameter = uri.getQueryParameter("app");
        if (z) {
            queryParameter = SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME;
        } else if (queryParameter == null) {
            return queryParameter;
        }
        if (TextUtils.isEmpty(queryParameter) || (A0R = r5.A0R(C58422vE.A02, 534)) == null || TextUtils.isEmpty(A0R)) {
            return queryParameter;
        }
        for (String equalsIgnoreCase : C18320x8.A1b(A0R)) {
            if (queryParameter.equalsIgnoreCase(equalsIgnoreCase)) {
                return queryParameter;
            }
        }
        return null;
    }

    public static boolean A07(Uri uri, AnonymousClass1VX r5) {
        C58422vE r1 = C58422vE.A02;
        if ((r5.A0Y(r1, 1483) || r5.A0Y(r1, 1849)) && uri.isHierarchical() && !uri.getQueryParameterNames().isEmpty() && uri.getQueryParameterNames().contains(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE) && "business_profile".equals(uri.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE))) {
            return true;
        }
        return false;
    }

    public static boolean A08(AnonymousClass1VX r5, String str) {
        Uri build;
        C58422vE r1 = C58422vE.A02;
        if (r5.A0Y(r1, 1483) || r5.A0Y(r1, 1849)) {
            String A0z = AnonymousClass0x9.A0z(str);
            if (A0z.startsWith("wa.me")) {
                A0z = A0z.replace("wa.me", "https://wa.me");
            }
            Uri parse = Uri.parse(A0z);
            String str2 = null;
            if (parse.getHost() != null) {
                str2 = AnonymousClass0x9.A0z(parse.getHost());
            }
            if ("wa.me".equals(str2) && (build = C18300x5.A0C().encodedAuthority(str2).encodedPath(parse.getEncodedPath()).encodedQuery(parse.getEncodedQuery()).encodedFragment(parse.getEncodedFragment()).build()) != null) {
                String scheme = build.getScheme();
                if (!TextUtils.isEmpty(scheme)) {
                    String host = build.getHost();
                    if (!TextUtils.isEmpty(host) && A0A(scheme, host)) {
                        List<String> pathSegments = build.getPathSegments();
                        if (pathSegments.size() != 1 || !Pattern.matches("^(?![0-9.]+$)[a-zA-Z0-9.]{5,35}$", AnonymousClass001.A0n(pathSegments, 0))) {
                            return false;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean A0A(String str, String str2) {
        if (("http".equals(str) || "https".equals(str)) && "wa.me".equals(str2)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01ab, code lost:
        if (r1.equals(r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01ad, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01b5, code lost:
        if (r1.equals("send") == false) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01bd, code lost:
        if (A07(r5, r7.A06) == false) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01bf, code lost:
        return 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01eb, code lost:
        if (r1.equals("catalog") != false) goto L_0x0200;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01ed, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x022e, code lost:
        if (r1.equals("message_yourself") != false) goto L_0x037d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0230, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0237, code lost:
        if (r1.equals("message") != false) goto L_0x0273;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0239, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0240, code lost:
        if (r1.equals("archive_settings") != false) goto L_0x02c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0242, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x024a, code lost:
        if (r1.equals("stickerpack") != false) goto L_0x0260;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x024c, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007c, code lost:
        if (android.text.TextUtils.isEmpty(r5.getQueryParameter("text")) != false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x04d0, code lost:
        if (r1.equals("pay") != false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x04d2, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x04da, code lost:
        if (r1.equals("status") != false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x04dc, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x04e3, code lost:
        if (r1.equals("biztab") == false) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x04e9, code lost:
        if (r2.size() < 1) goto L_0x04ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x04eb, code lost:
        r11 = A06(r2, r8, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x04f3, code lost:
        switch(r11.hashCode()) {
            case -1535436173: goto L_0x04f8;
            case -1110417409: goto L_0x0502;
            case -690411481: goto L_0x050c;
            case 555704345: goto L_0x0516;
            case 1078655016: goto L_0x0520;
            default: goto L_0x04f6;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x04f8, code lost:
        r0 = r11.equals("greeting-message");
        r1 = 70;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0502, code lost:
        r0 = r11.equals("labels");
        r1 = 69;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x050c, code lost:
        r0 = r11.equals("advertise");
        r1 = 45;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0516, code lost:
        r0 = r11.equals("catalog");
        r1 = 59;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0520, code lost:
        r0 = r11.equals("away-message");
        r1 = 71;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0531, code lost:
        if (r1.equals("orders") == false) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0537, code lost:
        if (r2.size() == 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x053d, code lost:
        if (A0H() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x053f, code lost:
        r0 = "orders-video".equals(A06(r2, r8, 0));
        r1 = 107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0554, code lost:
        if (r1.equals("advertise") == false) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x055a, code lost:
        if (r2.isEmpty() == false) goto L_0x055f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x055c, code lost:
        return 38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x055f, code lost:
        r1 = X.AnonymousClass001.A0n(r2, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0567, code lost:
        switch(r1.hashCode()) {
            case -934426579: goto L_0x056c;
            case -892481550: goto L_0x0577;
            case -530685006: goto L_0x0582;
            case -309425751: goto L_0x058d;
            case 555704345: goto L_0x067e;
            default: goto L_0x056a;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x056c, code lost:
        r0 = r1.equals("resume");
        r1 = 54;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0577, code lost:
        r0 = r1.equals("status");
        r1 = 72;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0582, code lost:
        r0 = r1.equals("recently-added-media");
        r1 = 103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x058d, code lost:
        r0 = r1.equals("profile");
        r1 = 68;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x065c, code lost:
        if (r1.equals("marketingmessages") != false) goto L_0x0671;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x065e, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x067e, code lost:
        r0 = r1.equals("catalog");
        r1 = 44;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x068f, code lost:
        if (r1.equals("biztools") == false) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x0695, code lost:
        if (r2.size() != 1) goto L_0x06a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x0697, code lost:
        r0 = r2.get(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x06d5, code lost:
        if (r1.equals("edit-ad") != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x06d7, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x06de, code lost:
        if (r1.equals("manage-ads") == false) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x06e4, code lost:
        if (r2.size() < 1) goto L_0x06ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x06e6, code lost:
        r11 = X.AnonymousClass001.A0n(r2, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x06ea, code lost:
        r1 = r11.toLowerCase(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x06f4, code lost:
        if ("ad-details".equals(r1) == false) goto L_0x06ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x06fa, code lost:
        if (r2.size() < 2) goto L_0x06ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x06fc, code lost:
        return 40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x0705, code lost:
        if ("edit-ad".equals(r1) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x070b, code lost:
        if (r2.size() < 2) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0719, code lost:
        if (r1.equals("biz-agents-onboarding") == false) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x071b, code lost:
        return 109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x0725, code lost:
        if (r1.equals("qr") == false) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x0727, code lost:
        return 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x072f, code lost:
        if (r1.equals("fpm") != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x0731, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0739, code lost:
        if (r1.equals("tos") == false) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x073f, code lost:
        return A0E(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x0746, code lost:
        if (r1.equals("call") != false) goto L_0x0a3c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x0748, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x074f, code lost:
        if (r1.equals("ctwa-messaging-guide") == false) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x0751, code lost:
        return 83;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x075a, code lost:
        if (r1.equals("ad-details") == false) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x075c, code lost:
        return 74;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x0765, code lost:
        if (r1.equals("calling") == false) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x076b, code lost:
        return A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x0772, code lost:
        if (r1.equals("account_switcher") == false) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x0774, code lost:
        return 75;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x077d, code lost:
        if (r1.equals("channel") != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x077f, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x0786, code lost:
        if (r1.equals("event-link") == false) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x0788, code lost:
        r4 = r7.A0C;
        r2 = X.C162197rQ.newArrayList((java.lang.Object[]) new java.lang.String[]{"event_id", "event_name"});
        r1 = X.AnonymousClass001.A0o();
        r1.append("XFamilyDeepLinkHandler/isValidEventLinkingUri, uri: ");
        r1.append(r5);
        X.C18260x0.A1P(r1, " referrer: ", r24);
        r1 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x07b1, code lost:
        if (r1.hasNext() == false) goto L_0x07be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x07bb, code lost:
        if (r5.getQueryParameter(X.AnonymousClass001.A0m(r1)) != null) goto L_0x07ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x07bd, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x07ca, code lost:
        if (r4.A00.A00.A0Y(X.C58422vE.A02, 3989) == false) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x07cc, code lost:
        return 66;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x07d6, code lost:
        if (r1.equals("settings") == false) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x07dc, code lost:
        return A0C(r5, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x07e4, code lost:
        if (r1.equals("pending_ad") == false) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x07e6, code lost:
        return 84;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x07ef, code lost:
        if (r1.equals("disappearing_messages") == false) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:0x07f5, code lost:
        if (r2.size() != 0) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x0806, code lost:
        if (r1.equals("biz-edit-profile") == false) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x080c, code lost:
        if (r2.isEmpty() == false) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x0817, code lost:
        if (r1.equals("biz-edit-catalog") == false) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:452:0x081d, code lost:
        if (r2.isEmpty() == false) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:0x0828, code lost:
        if (r1.equals("biz-hours") == false) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:0x082e, code lost:
        if (r2.isEmpty() == false) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x0839, code lost:
        if (r1.equals("biz-location") == false) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x083f, code lost:
        if (r2.isEmpty() == false) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x084a, code lost:
        if (r1.equals("biz-edit-description") == false) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x0850, code lost:
        if (r2.isEmpty() == false) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:0x085b, code lost:
        if (r1.equals("biz-price-tier") == false) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x0861, code lost:
        if (r2.isEmpty() == false) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x086c, code lost:
        if (r1.equals("biz-profile-completeness") == false) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x0872, code lost:
        if (r2.isEmpty() == false) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x087e, code lost:
        if (r1.equals("privacy-settings") == false) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x0884, code lost:
        if (r2.isEmpty() == false) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x088d, code lost:
        if (r1.equals("privacy") == false) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:480:0x0893, code lost:
        if (r2.size() < 1) goto L_0x08d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x089f, code lost:
        if (A06(r2, r8, 0).equals("checkup") == false) goto L_0x08d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x08ab, code lost:
        if (r7.A06.A0Y(X.C58422vE.A02, 3815) == false) goto L_0x08d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x08b7, code lost:
        if (r1.equals("proxy") == false) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x08bd, code lost:
        if (r2.isEmpty() == false) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x08c8, code lost:
        if (r1.equals("help") == false) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x08ce, code lost:
        if (r2.size() != 1) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x08d7, code lost:
        if (r2.size() != 1) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x08e3, code lost:
        if (A06(r2, r8, 0).equals("calls") == false) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x08ef, code lost:
        if (r7.A06.A0Y(X.C58422vE.A02, 1972) == false) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:0x08fa, code lost:
        if (r1.equals("code-linking") == false) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x0900, code lost:
        if (r2.isEmpty() == false) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:504:0x090b, code lost:
        if (r1.equals("biz-website") == false) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:506:0x0911, code lost:
        if (r2.isEmpty() == false) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:525:0x0972, code lost:
        if (r1.equals("bizsearch") == false) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:527:0x0978, code lost:
        if (r2.size() != 1) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:529:0x0985, code lost:
        if (A06(r2, r8, 0).equals("onboarding-sheet") == false) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:531:0x0991, code lost:
        if (r7.A06.A0Y(X.C58422vE.A02, 5465) == false) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:563:0x0a31, code lost:
        if (r1.equals("biz-linked-accounts") == false) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:565:0x0a37, code lost:
        if (r2.isEmpty() == false) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:573:?, code lost:
        return 30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:575:?, code lost:
        return 32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:579:?, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:580:?, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:582:?, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:583:?, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:585:?, code lost:
        return 82;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:586:?, code lost:
        return 82;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:587:?, code lost:
        return 39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:588:?, code lost:
        return 39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:589:?, code lost:
        return 46;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:591:?, code lost:
        return 48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:593:?, code lost:
        return 49;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:595:?, code lost:
        return 50;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:597:?, code lost:
        return 53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:599:?, code lost:
        return 63;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:601:?, code lost:
        return 73;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:603:?, code lost:
        return 52;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:605:?, code lost:
        return 58;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:607:?, code lost:
        return 61;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:609:?, code lost:
        return 62;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:611:?, code lost:
        return 64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:613:?, code lost:
        return 77;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:615:?, code lost:
        return 57;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:617:?, code lost:
        return 76;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:619:?, code lost:
        return 98;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:623:?, code lost:
        return 51;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:626:?, code lost:
        return 56;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0136, code lost:
        if (r16 == false) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x013e, code lost:
        if ("https".equals(r14) != false) goto L_0x0140;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0147, code lost:
        if ("www.whatsapp.com".equals(r1) == false) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x014d, code lost:
        if (r2.isEmpty() == false) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x014f, code lost:
        r1 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0154, code lost:
        if (r2.size() <= 1) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0156, code lost:
        r11 = X.AnonymousClass001.A0n(r2, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x015e, code lost:
        if ("pay".equals(r1) == false) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0164, code lost:
        return A0D(r1, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0165, code lost:
        r1 = X.AnonymousClass001.A0n(r2, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0171, code lost:
        if (com.whatsapp.SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME.equals(r14) != false) goto L_0x017c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x017a, code lost:
        if ("whatsapp-consumer".equals(r14) == false) goto L_0x0a40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0180, code lost:
        switch(r1.hashCode()) {
            case -1992233120: goto L_0x0800;
            case -1888021818: goto L_0x06cf;
            case -1854767153: goto L_0x0184;
            case -1801891768: goto L_0x06d8;
            case -1562078008: goto L_0x0877;
            case -1522518477: goto L_0x0844;
            case -1388591710: goto L_0x04dd;
            case -1127103024: goto L_0x0811;
            case -1045462584: goto L_0x08f4;
            case -1008770331: goto L_0x052a;
            case -962584979: goto L_0x018e;
            case -947241760: goto L_0x0855;
            case -892481550: goto L_0x04d3;
            case -690411481: goto L_0x054e;
            case -474713810: goto L_0x0866;
            case -436339243: goto L_0x0822;
            case -318452137: goto L_0x0191;
            case -314498168: goto L_0x0889;
            case -313324288: goto L_0x0713;
            case -309474065: goto L_0x019b;
            case -265966801: goto L_0x0833;
            case 3617: goto L_0x071e;
            case 101603: goto L_0x0729;
            case 110760: goto L_0x04cc;
            case 115032: goto L_0x0732;
            case 3045982: goto L_0x0740;
            case 3184262: goto L_0x01a5;
            case 3198785: goto L_0x08c2;
            case 3526536: goto L_0x01ae;
            case 106941038: goto L_0x08b0;
            case 377921569: goto L_0x0749;
            case 436014744: goto L_0x0754;
            case 548640964: goto L_0x075f;
            case 555704345: goto L_0x01e5;
            case 708933431: goto L_0x022a;
            case 734040243: goto L_0x076c;
            case 738950403: goto L_0x0777;
            case 937946957: goto L_0x0780;
            case 954925063: goto L_0x0231;
            case 1059243776: goto L_0x023a;
            case 1298628776: goto L_0x0689;
            case 1434631203: goto L_0x07cf;
            case 1519332396: goto L_0x07e9;
            case 1564510331: goto L_0x096c;
            case 1597539542: goto L_0x0243;
            case 1698491339: goto L_0x07dd;
            case 1708621281: goto L_0x0905;
            case 1737180530: goto L_0x0656;
            case 1850498144: goto L_0x0a2b;
            default: goto L_0x0183;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0183, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x018b, code lost:
        if (r1.equals("support") != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x018d, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x018e, code lost:
        r0 = "directory";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0198, code lost:
        if (r1.equals("premium") != false) goto L_0x0391;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x019a, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01a2, code lost:
        if (r1.equals("product") != false) goto L_0x0214;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01a4, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01a5, code lost:
        r0 = "guia";
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:570:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:584:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A0B(android.net.Uri r23, android.net.Uri r24) {
        /*
            r22 = this;
            r5 = r23
            java.lang.String r1 = r5.getScheme()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            r3 = 1
            if (r0 != 0) goto L_0x0a40
            java.util.Locale r8 = java.util.Locale.US
            java.lang.String r14 = r1.toLowerCase(r8)
            java.util.List r2 = r5.getPathSegments()
            java.lang.String r1 = r5.getHost()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0a40
            java.lang.String r1 = r1.toLowerCase(r8)
            r7 = r22
            X.5Y8 r0 = r7.A08
            boolean r0 = r0.A05(r5)
            if (r0 != 0) goto L_0x0a3d
            boolean r0 = A0A(r14, r1)
            r21 = 26
            r20 = 13
            r19 = 5
            r18 = 6
            r17 = 80
            r16 = 35
            java.lang.String r10 = "message_yourself"
            java.lang.String r11 = ""
            r12 = 3
            java.lang.String r13 = "pay"
            java.lang.String r9 = "privacy"
            r15 = 10
            r4 = 2
            r6 = 0
            if (r0 == 0) goto L_0x00af
            int r0 = r2.size()
            if (r0 != r3) goto L_0x008a
            java.lang.String r1 = A06(r2, r8, r6)
            java.lang.String r0 = "status"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008a
        L_0x0064:
            java.util.Set r2 = r5.getQueryParameterNames()
            if (r2 == 0) goto L_0x0087
            int r0 = r2.size()
            if (r0 != r3) goto L_0x007e
            java.lang.String r0 = "text"
            java.lang.String r0 = r5.getQueryParameter(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 1
            if (r0 == 0) goto L_0x007f
        L_0x007e:
            r1 = 0
        L_0x007f:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0087
            if (r1 == 0) goto L_0x06a8
        L_0x0087:
            r1 = 41
        L_0x0089:
            return r1
        L_0x008a:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x009b
            java.lang.String r0 = A06(r2, r8, r6)
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x009b
            goto L_0x00c7
        L_0x009b:
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x01ee
            java.lang.String r1 = A06(r2, r8, r6)
            java.lang.String r0 = "ph"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01ee
            return r16
        L_0x00af:
            java.lang.String r0 = "api.whatsapp.com"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00f4
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x01c0
            java.lang.String r0 = A06(r2, r8, r6)
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x01c0
        L_0x00c7:
            int r0 = r2.size()
            if (r0 < r4) goto L_0x00ef
            int r0 = r2.size()
            java.util.List r2 = r2.subList(r3, r0)
        L_0x00d5:
            boolean r0 = r2.isEmpty()
            r1 = r11
            if (r0 != 0) goto L_0x00e0
            java.lang.String r11 = X.AnonymousClass001.A0n(r2, r6)
        L_0x00e0:
            int r0 = r2.size()
            if (r0 <= r3) goto L_0x00ea
            java.lang.String r1 = X.AnonymousClass001.A0n(r2, r3)
        L_0x00ea:
            int r1 = r7.A0D(r11, r1)
            return r1
        L_0x00ef:
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            goto L_0x00d5
        L_0x00f4:
            java.lang.String r0 = "call.whatsapp.com"
            boolean r0 = r0.equals(r1)
            r12 = 33
            if (r0 != 0) goto L_0x0a3c
            java.lang.String r0 = "http"
            boolean r16 = r0.equals(r14)
            if (r16 != 0) goto L_0x010e
            java.lang.String r0 = "https"
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x0138
        L_0x010e:
            java.lang.String r0 = "whatsapp.com"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0120
            boolean r0 = X.AnonymousClass32F.A01(r5)
            if (r0 == 0) goto L_0x0120
        L_0x011d:
            r1 = 55
            return r1
        L_0x0120:
            java.lang.String r0 = "cross-link"
            java.lang.String r0 = r5.getQueryParameter(r0)
            if (r0 == 0) goto L_0x012b
            r1 = 97
            return r1
        L_0x012b:
            java.lang.String r0 = "chat.whatsapp.com"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0136
            r1 = 8
            return r1
        L_0x0136:
            if (r16 != 0) goto L_0x0140
        L_0x0138:
            java.lang.String r0 = "https"
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x016a
        L_0x0140:
            java.lang.String r0 = "www.whatsapp.com"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x016a
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0165
            r1 = r11
        L_0x0150:
            int r0 = r2.size()
            if (r0 <= r3) goto L_0x015a
            java.lang.String r11 = X.AnonymousClass001.A0n(r2, r3)
        L_0x015a:
            boolean r0 = r13.equals(r1)
            if (r0 == 0) goto L_0x0a40
            int r1 = r7.A0D(r1, r11)
            return r1
        L_0x0165:
            java.lang.String r1 = X.AnonymousClass001.A0n(r2, r6)
            goto L_0x0150
        L_0x016a:
            java.lang.String r0 = "whatsapp"
            boolean r0 = r0.equals(r14)
            if (r0 != 0) goto L_0x017c
            java.lang.String r0 = "whatsapp-consumer"
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x0a40
        L_0x017c:
            int r0 = r1.hashCode()
            switch(r0) {
                case -1992233120: goto L_0x0800;
                case -1888021818: goto L_0x06cf;
                case -1854767153: goto L_0x0184;
                case -1801891768: goto L_0x06d8;
                case -1562078008: goto L_0x0877;
                case -1522518477: goto L_0x0844;
                case -1388591710: goto L_0x04dd;
                case -1127103024: goto L_0x0811;
                case -1045462584: goto L_0x08f4;
                case -1008770331: goto L_0x052a;
                case -962584979: goto L_0x018e;
                case -947241760: goto L_0x0855;
                case -892481550: goto L_0x04d3;
                case -690411481: goto L_0x054e;
                case -474713810: goto L_0x0866;
                case -436339243: goto L_0x0822;
                case -318452137: goto L_0x0191;
                case -314498168: goto L_0x0889;
                case -313324288: goto L_0x0713;
                case -309474065: goto L_0x019b;
                case -265966801: goto L_0x0833;
                case 3617: goto L_0x071e;
                case 101603: goto L_0x0729;
                case 110760: goto L_0x04cc;
                case 115032: goto L_0x0732;
                case 3045982: goto L_0x0740;
                case 3184262: goto L_0x01a5;
                case 3198785: goto L_0x08c2;
                case 3526536: goto L_0x01ae;
                case 106941038: goto L_0x08b0;
                case 377921569: goto L_0x0749;
                case 436014744: goto L_0x0754;
                case 548640964: goto L_0x075f;
                case 555704345: goto L_0x01e5;
                case 708933431: goto L_0x022a;
                case 734040243: goto L_0x076c;
                case 738950403: goto L_0x0777;
                case 937946957: goto L_0x0780;
                case 954925063: goto L_0x0231;
                case 1059243776: goto L_0x023a;
                case 1298628776: goto L_0x0689;
                case 1434631203: goto L_0x07cf;
                case 1519332396: goto L_0x07e9;
                case 1564510331: goto L_0x096c;
                case 1597539542: goto L_0x0243;
                case 1698491339: goto L_0x07dd;
                case 1708621281: goto L_0x0905;
                case 1737180530: goto L_0x0656;
                case 1850498144: goto L_0x0a2b;
                default: goto L_0x0183;
            }
        L_0x0183:
            return r3
        L_0x0184:
            java.lang.String r0 = "support"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x030c
            return r3
        L_0x018e:
            java.lang.String r0 = "directory"
            goto L_0x01a7
        L_0x0191:
            java.lang.String r0 = "premium"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0391
            return r3
        L_0x019b:
            java.lang.String r0 = "product"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0214
            return r3
        L_0x01a5:
            java.lang.String r0 = "guia"
        L_0x01a7:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x032d
            return r3
        L_0x01ae:
            java.lang.String r0 = "send"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0a40
            X.1VX r0 = r7.A06
            boolean r0 = A07(r5, r0)
            if (r0 == 0) goto L_0x01d3
            return r15
        L_0x01c0:
            int r0 = r2.size()
            if (r0 != r3) goto L_0x01d4
            java.lang.String r12 = A06(r2, r8, r6)
            java.lang.String r0 = "send"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x01d4
        L_0x01d3:
            return r4
        L_0x01d4:
            int r0 = r2.size()
            if (r0 != r3) goto L_0x00f4
            java.lang.String r0 = A06(r2, r8, r6)
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x00f4
            return r17
        L_0x01e5:
            java.lang.String r0 = "catalog"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0200
            return r3
        L_0x01ee:
            int r0 = r2.size()
            if (r0 != r4) goto L_0x0201
            java.lang.String r1 = A06(r2, r8, r6)
            java.lang.String r0 = "c"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0201
        L_0x0200:
            return r18
        L_0x0201:
            int r0 = r2.size()
            if (r0 != r12) goto L_0x0215
            java.lang.String r1 = A06(r2, r8, r6)
            java.lang.String r0 = "p"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0215
        L_0x0214:
            return r19
        L_0x0215:
            java.lang.String r1 = r5.toString()
            java.lang.String r0 = "https://wa.me/qr/"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x024d
            int r1 = r1.length()
            r0 = 17
            if (r1 <= r0) goto L_0x024d
            return r12
        L_0x022a:
            boolean r0 = r1.equals(r10)
            if (r0 != 0) goto L_0x037d
            return r3
        L_0x0231:
            java.lang.String r0 = "message"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0273
            return r3
        L_0x023a:
            java.lang.String r0 = "archive_settings"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x02c4
            return r3
        L_0x0243:
            java.lang.String r0 = "stickerpack"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0260
            return r3
        L_0x024d:
            int r0 = r2.size()
            if (r0 != r4) goto L_0x0261
            java.lang.String r1 = A06(r2, r8, r6)
            java.lang.String r0 = "stickerpack"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0261
        L_0x0260:
            return r20
        L_0x0261:
            int r0 = r2.size()
            if (r0 != r4) goto L_0x0274
            java.lang.String r1 = A06(r2, r8, r6)
            java.lang.String r0 = "message"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0274
        L_0x0273:
            return r15
        L_0x0274:
            int r0 = r2.size()
            if (r0 < r3) goto L_0x0292
            java.lang.String r1 = A06(r2, r8, r6)
            java.lang.String r0 = "biztools"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0292
            int r0 = r2.size()
            if (r0 <= r3) goto L_0x06a1
            java.lang.Object r0 = r2.get(r3)
            goto L_0x069b
        L_0x0292:
            int r0 = r2.size()
            if (r0 < r3) goto L_0x02b2
            java.lang.String r1 = A06(r2, r8, r6)
            java.lang.String r0 = "settings"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x02b2
            int r0 = r2.size()
            java.util.List r0 = r2.subList(r3, r0)
            int r1 = r7.A0C(r5, r0)
            return r1
        L_0x02b2:
            int r0 = r2.size()
            if (r0 < r3) goto L_0x02c5
            java.lang.String r1 = A06(r2, r8, r6)
            java.lang.String r0 = "archive_settings"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x02c5
        L_0x02c4:
            return r21
        L_0x02c5:
            int r0 = r2.size()
            if (r0 != r3) goto L_0x02d9
            java.lang.String r1 = A06(r2, r8, r6)
            java.lang.String r0 = "disappearing_messages"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x02d9
            goto L_0x07f7
        L_0x02d9:
            int r0 = r2.size()
            if (r0 < r3) goto L_0x02f9
            java.lang.String r1 = A06(r2, r8, r6)
            java.lang.String r0 = "tos"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x02f9
            int r0 = r2.size()
            java.util.List r0 = r2.subList(r3, r0)
            int r1 = r7.A0E(r0)
            return r1
        L_0x02f9:
            int r0 = r2.size()
            if (r0 != r3) goto L_0x030f
            java.lang.String r1 = A06(r2, r8, r6)
            java.lang.String r0 = "support"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x030f
        L_0x030c:
            r1 = 30
            return r1
        L_0x030f:
            java.util.List r0 = r5.getPathSegments()
            int r0 = r0.size()
            if (r0 != r3) goto L_0x0330
            java.io.File r0 = X.C18310x6.A0a(r5)
            java.lang.String r0 = r0.getName()
            java.util.List r1 = X.C57882uM.A00
            java.lang.String r0 = X.AnonymousClass0x9.A0z(r0)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0330
        L_0x032d:
            r1 = 32
            return r1
        L_0x0330:
            int r0 = r2.size()
            if (r0 != r4) goto L_0x036d
            java.lang.String r1 = A06(r2, r8, r6)
            java.lang.String r0 = "community"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x036d
            X.1VX r4 = r7.A06
            r0 = 982(0x3d6, float:1.376E-42)
            X.2vE r1 = X.C58422vE.A02
            boolean r0 = r4.A0Y(r1, r0)
            if (r0 == 0) goto L_0x0a40
            r0 = 5543(0x15a7, float:7.767E-42)
            boolean r0 = r4.A0Y(r1, r0)
            if (r0 != 0) goto L_0x0a40
            X.2sr r0 = r7.A03
            boolean r0 = r0.A0Y()
            if (r0 != 0) goto L_0x0a40
            java.lang.String r1 = A06(r2, r8, r3)
            java.lang.String r0 = "create"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0a40
            r1 = 37
            return r1
        L_0x036d:
            int r0 = r2.size()
            if (r0 < r3) goto L_0x037e
            java.lang.String r0 = A06(r2, r8, r6)
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x037e
        L_0x037d:
            return r17
        L_0x037e:
            int r0 = r2.size()
            if (r0 < r3) goto L_0x039f
            java.lang.String r1 = A06(r2, r8, r6)
            java.lang.String r0 = "premium"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x039f
        L_0x0391:
            X.1VX r2 = r7.A06
            r1 = 2562(0xa02, float:3.59E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            r1 = 42
            goto L_0x0686
        L_0x039f:
            int r0 = r2.size()
            if (r0 < r3) goto L_0x03c4
            java.lang.String r1 = A06(r2, r8, r6)
            java.lang.String r0 = "meta_verified"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x03c4
            X.5rC r1 = r7.A01
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x06a8
            r1.A04()
            java.lang.String r0 = "isMetaVerifiedFeatureEnabled"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x03c4:
            r2.size()
            r2.size()
            r2.size()
            r2.size()
            r2.size()
            int r0 = r2.size()
            if (r0 != r3) goto L_0x03e7
            java.lang.String r1 = A06(r2, r8, r6)
            java.lang.String r0 = "biz-edit-profile"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x03e7
            goto L_0x080e
        L_0x03e7:
            int r0 = r2.size()
            if (r0 != r3) goto L_0x03fb
            java.lang.String r1 = A06(r2, r8, r6)
            java.lang.String r0 = "biz-edit-catalog"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x03fb
            goto L_0x081f
        L_0x03fb:
            int r0 = r2.size()
            if (r0 != r3) goto L_0x040f
            java.lang.String r1 = A06(r2, r8, r6)
            java.lang.String r0 = "biz-hours"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x040f
            goto L_0x0830
        L_0x040f:
            int r0 = r2.size()
            if (r0 != r3) goto L_0x0423
            java.lang.String r1 = A06(r2, r8, r6)
            java.lang.String r0 = "biz-location"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0423
            goto L_0x0841
        L_0x0423:
            int r0 = r2.size()
            if (r0 != r3) goto L_0x0437
            java.lang.String r1 = A06(r2, r8, r6)
            java.lang.String r0 = "biz-edit-description"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0437
            goto L_0x0852
        L_0x0437:
            int r0 = r2.size()
            if (r0 != r3) goto L_0x044b
            java.lang.String r1 = A06(r2, r8, r6)
            java.lang.String r0 = "biz-linked-accounts"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x044b
            goto L_0x0a39
        L_0x044b:
            int r0 = r2.size()
            if (r0 != r3) goto L_0x045f
            java.lang.String r1 = A06(r2, r8, r6)
            java.lang.String r0 = "biz-website"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x045f
            goto L_0x0913
        L_0x045f:
            int r0 = r2.size()
            if (r0 != r3) goto L_0x0473
            java.lang.String r1 = A06(r2, r8, r6)
            java.lang.String r0 = "biz-price-tier"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0473
            goto L_0x0863
        L_0x0473:
            int r0 = r2.size()
            if (r0 != r3) goto L_0x0487
            java.lang.String r1 = A06(r2, r8, r6)
            java.lang.String r0 = "biz-profile-completeness"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0487
            goto L_0x0874
        L_0x0487:
            int r0 = r2.size()
            if (r0 != r3) goto L_0x049c
            java.lang.String r1 = A06(r2, r8, r6)
            java.lang.String r0 = "privacy-settings"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x049c
            goto L_0x0886
        L_0x049c:
            boolean r0 = X.AnonymousClass32F.A01(r5)
            if (r0 != 0) goto L_0x011d
            int r0 = r2.size()
            if (r0 != r4) goto L_0x0598
            java.lang.String r0 = A06(r2, r8, r6)
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0598
            java.lang.String r1 = A06(r2, r8, r3)
            java.lang.String r0 = "checkup"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0598
            X.1VX r10 = r7.A06
            r1 = 3815(0xee7, float:5.346E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r10.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0598
            goto L_0x08ad
        L_0x04cc:
            boolean r0 = r1.equals(r13)
            if (r0 != 0) goto L_0x00d5
            return r3
        L_0x04d3:
            java.lang.String r0 = "status"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0064
            return r3
        L_0x04dd:
            java.lang.String r0 = "biztab"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0a40
            int r0 = r2.size()
            if (r0 < r3) goto L_0x04ef
            java.lang.String r11 = A06(r2, r8, r6)
        L_0x04ef:
            int r0 = r11.hashCode()
            switch(r0) {
                case -1535436173: goto L_0x04f8;
                case -1110417409: goto L_0x0502;
                case -690411481: goto L_0x050c;
                case 555704345: goto L_0x0516;
                case 1078655016: goto L_0x0520;
                default: goto L_0x04f6;
            }
        L_0x04f6:
            goto L_0x06a8
        L_0x04f8:
            java.lang.String r0 = "greeting-message"
            boolean r0 = r11.equals(r0)
            r1 = 70
            goto L_0x0686
        L_0x0502:
            java.lang.String r0 = "labels"
            boolean r0 = r11.equals(r0)
            r1 = 69
            goto L_0x0686
        L_0x050c:
            java.lang.String r0 = "advertise"
            boolean r0 = r11.equals(r0)
            r1 = 45
            goto L_0x0686
        L_0x0516:
            java.lang.String r0 = "catalog"
            boolean r0 = r11.equals(r0)
            r1 = 59
            goto L_0x0686
        L_0x0520:
            java.lang.String r0 = "away-message"
            boolean r0 = r11.equals(r0)
            r1 = 71
            goto L_0x0686
        L_0x052a:
            java.lang.String r0 = "orders"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0a40
            int r0 = r2.size()
            if (r0 == 0) goto L_0x06a8
            boolean r0 = r7.A0H()
            if (r0 == 0) goto L_0x06a8
            java.lang.String r1 = A06(r2, r8, r6)
            java.lang.String r0 = "orders-video"
            boolean r0 = r0.equals(r1)
            r1 = 107(0x6b, float:1.5E-43)
            goto L_0x0686
        L_0x054e:
            java.lang.String r0 = "advertise"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0a40
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x055f
            r1 = 38
            return r1
        L_0x055f:
            java.lang.String r1 = X.AnonymousClass001.A0n(r2, r6)
            int r0 = r1.hashCode()
            switch(r0) {
                case -934426579: goto L_0x056c;
                case -892481550: goto L_0x0577;
                case -530685006: goto L_0x0582;
                case -309425751: goto L_0x058d;
                case 555704345: goto L_0x067e;
                default: goto L_0x056a;
            }
        L_0x056a:
            goto L_0x06a8
        L_0x056c:
            java.lang.String r0 = "resume"
            boolean r0 = r1.equals(r0)
            r1 = 54
            goto L_0x0686
        L_0x0577:
            java.lang.String r0 = "status"
            boolean r0 = r1.equals(r0)
            r1 = 72
            goto L_0x0686
        L_0x0582:
            java.lang.String r0 = "recently-added-media"
            boolean r0 = r1.equals(r0)
            r1 = 103(0x67, float:1.44E-43)
            goto L_0x0686
        L_0x058d:
            java.lang.String r0 = "profile"
            boolean r0 = r1.equals(r0)
            r1 = 68
            goto L_0x0686
        L_0x0598:
            int r0 = r2.size()
            if (r0 != r3) goto L_0x05ad
            java.lang.String r1 = A06(r2, r8, r6)
            java.lang.String r0 = "proxy"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x05ad
            goto L_0x08bf
        L_0x05ad:
            int r0 = r2.size()
            if (r0 != r4) goto L_0x05c1
            java.lang.String r1 = A06(r2, r8, r6)
            java.lang.String r0 = "help"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x05c1
            goto L_0x08d0
        L_0x05c1:
            int r0 = r2.size()
            if (r0 != r4) goto L_0x05eb
            java.lang.String r0 = A06(r2, r8, r6)
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x05eb
            java.lang.String r1 = A06(r2, r8, r3)
            java.lang.String r0 = "calls"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x05eb
            X.1VX r10 = r7.A06
            r1 = 1972(0x7b4, float:2.763E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r10.A0Y(r0, r1)
            if (r0 == 0) goto L_0x05eb
            goto L_0x08f1
        L_0x05eb:
            int r0 = r2.size()
            if (r0 != r4) goto L_0x0616
            java.lang.String r0 = A06(r2, r8, r6)
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0616
            java.lang.String r1 = A06(r2, r8, r3)
            java.lang.String r0 = "groups"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0616
            X.1VX r10 = r7.A06
            r1 = 3995(0xf9b, float:5.598E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r10.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0616
            r1 = 91
            return r1
        L_0x0616:
            int r0 = r2.size()
            if (r0 != r4) goto L_0x0642
            java.lang.String r0 = A06(r2, r8, r6)
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0642
            java.lang.String r1 = A06(r2, r8, r3)
            java.lang.String r0 = "profile"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0642
            X.1VX r9 = r7.A06
            r1 = 3998(0xf9e, float:5.602E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r9.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0642
            r1 = 92
            return r1
        L_0x0642:
            int r0 = r2.size()
            if (r0 != r3) goto L_0x065f
            java.lang.String r1 = A06(r2, r8, r6)
            java.lang.String r0 = "code-linking"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x065f
            goto L_0x0902
        L_0x0656:
            java.lang.String r0 = "marketingmessages"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0671
            return r3
        L_0x065f:
            int r0 = r2.size()
            if (r0 < r3) goto L_0x0916
            java.lang.String r1 = A06(r2, r8, r6)
            java.lang.String r0 = "marketingmessages"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0916
        L_0x0671:
            X.1VX r2 = r7.A06
            r1 = 4674(0x1242, float:6.55E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            r1 = 78
            goto L_0x0686
        L_0x067e:
            java.lang.String r0 = "catalog"
            boolean r0 = r1.equals(r0)
            r1 = 44
        L_0x0686:
            if (r0 != 0) goto L_0x0089
            goto L_0x06a8
        L_0x0689:
            java.lang.String r0 = "biztools"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0a40
            int r0 = r2.size()
            if (r0 != r3) goto L_0x06a1
            java.lang.Object r0 = r2.get(r6)
        L_0x069b:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r11 = r0.toLowerCase(r8)
        L_0x06a1:
            int r0 = r11.hashCode()
            switch(r0) {
                case -2137146394: goto L_0x06aa;
                case -1814119737: goto L_0x06b3;
                case -962584979: goto L_0x06bd;
                case 1147181203: goto L_0x06c6;
                default: goto L_0x06a8;
            }
        L_0x06a8:
            r1 = 1
            return r1
        L_0x06aa:
            java.lang.String r0 = "accounts"
            boolean r0 = r11.equals(r0)
            r1 = 20
            goto L_0x0686
        L_0x06b3:
            java.lang.String r0 = "orders-home"
            boolean r0 = r11.equals(r0)
            r1 = 100
            goto L_0x0686
        L_0x06bd:
            java.lang.String r0 = "directory"
            boolean r0 = r11.equals(r0)
            r1 = 31
            goto L_0x0686
        L_0x06c6:
            java.lang.String r0 = "business-platforms"
            boolean r0 = r11.equals(r0)
            r1 = 60
            goto L_0x0686
        L_0x06cf:
            java.lang.String r0 = "edit-ad"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x070d
            return r3
        L_0x06d8:
            java.lang.String r0 = "manage-ads"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0a40
            int r0 = r2.size()
            if (r0 < r3) goto L_0x06ea
            java.lang.String r11 = X.AnonymousClass001.A0n(r2, r6)
        L_0x06ea:
            java.lang.String r1 = r11.toLowerCase(r8)
            java.lang.String r0 = "ad-details"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x06ff
            int r0 = r2.size()
            if (r0 < r4) goto L_0x06ff
            r1 = 40
            return r1
        L_0x06ff:
            java.lang.String r0 = "edit-ad"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0710
            int r0 = r2.size()
            if (r0 < r4) goto L_0x0710
        L_0x070d:
            r1 = 82
            return r1
        L_0x0710:
            r1 = 39
            return r1
        L_0x0713:
            java.lang.String r0 = "biz-agents-onboarding"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0a40
            r1 = 109(0x6d, float:1.53E-43)
            return r1
        L_0x071e:
            java.lang.String r0 = "qr"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0a40
            r1 = 3
            return r1
        L_0x0729:
            java.lang.String r0 = "fpm"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0928
            return r3
        L_0x0732:
            java.lang.String r0 = "tos"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0a40
            int r1 = r7.A0E(r2)
            return r1
        L_0x0740:
            java.lang.String r0 = "call"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0a3c
            return r3
        L_0x0749:
            java.lang.String r0 = "ctwa-messaging-guide"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0a40
            r1 = 83
            return r1
        L_0x0754:
            java.lang.String r0 = "ad-details"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0a40
            r1 = 74
            return r1
        L_0x075f:
            java.lang.String r0 = "calling"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0a40
            int r1 = A00(r2)
            return r1
        L_0x076c:
            java.lang.String r0 = "account_switcher"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0a40
            r1 = 75
            return r1
        L_0x0777:
            java.lang.String r0 = "channel"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0a3d
            return r3
        L_0x0780:
            java.lang.String r0 = "event-link"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0a40
            X.2J3 r4 = r7.A0C
            java.lang.String r1 = "event_id"
            java.lang.String r0 = "event_name"
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
            java.util.ArrayList r2 = X.C162197rQ.newArrayList((java.lang.Object[]) r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "XFamilyDeepLinkHandler/isValidEventLinkingUri, uri: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " referrer: "
            r6 = r24
            X.C18260x0.A1P(r1, r0, r6)
            java.util.Iterator r1 = r2.iterator()
        L_0x07ad:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x07be
            java.lang.String r0 = X.AnonymousClass001.A0m(r1)
            java.lang.String r0 = r5.getQueryParameter(r0)
            if (r0 != 0) goto L_0x07ad
            return r3
        L_0x07be:
            X.2J4 r0 = r4.A00
            X.1VX r2 = r0.A00
            r1 = 3989(0xf95, float:5.59E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0a40
            r1 = 66
            return r1
        L_0x07cf:
            java.lang.String r0 = "settings"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0a40
            int r1 = r7.A0C(r5, r2)
            return r1
        L_0x07dd:
            java.lang.String r0 = "pending_ad"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0a40
            r1 = 84
            return r1
        L_0x07e9:
            java.lang.String r0 = "disappearing_messages"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0a40
            int r0 = r2.size()
            if (r0 != 0) goto L_0x0a40
        L_0x07f7:
            boolean r0 = r7.A0H()
            if (r0 == 0) goto L_0x0a40
            r3 = 25
            return r3
        L_0x0800:
            java.lang.String r0 = "biz-edit-profile"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0a40
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0a40
        L_0x080e:
            r1 = 46
            return r1
        L_0x0811:
            java.lang.String r0 = "biz-edit-catalog"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0a40
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0a40
        L_0x081f:
            r1 = 48
            return r1
        L_0x0822:
            java.lang.String r0 = "biz-hours"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0a40
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0a40
        L_0x0830:
            r1 = 49
            return r1
        L_0x0833:
            java.lang.String r0 = "biz-location"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0a40
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0a40
        L_0x0841:
            r1 = 50
            return r1
        L_0x0844:
            java.lang.String r0 = "biz-edit-description"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0a40
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0a40
        L_0x0852:
            r1 = 53
            return r1
        L_0x0855:
            java.lang.String r0 = "biz-price-tier"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0a40
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0a40
        L_0x0863:
            r1 = 63
            return r1
        L_0x0866:
            java.lang.String r0 = "biz-profile-completeness"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0a40
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0a40
        L_0x0874:
            r1 = 73
            return r1
        L_0x0877:
            java.lang.String r0 = "privacy-settings"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0a40
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0a40
        L_0x0886:
            r1 = 52
            return r1
        L_0x0889:
            boolean r0 = r1.equals(r9)
            if (r0 == 0) goto L_0x0a40
            int r0 = r2.size()
            if (r0 < r3) goto L_0x08d3
            java.lang.String r1 = A06(r2, r8, r6)
            java.lang.String r0 = "checkup"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x08d3
            X.1VX r4 = r7.A06
            r1 = 3815(0xee7, float:5.346E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r4.A0Y(r0, r1)
            if (r0 == 0) goto L_0x08d3
        L_0x08ad:
            r1 = 58
            return r1
        L_0x08b0:
            java.lang.String r0 = "proxy"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0a40
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0a40
        L_0x08bf:
            r1 = 61
            return r1
        L_0x08c2:
            java.lang.String r0 = "help"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0a40
            int r0 = r2.size()
            if (r0 != r3) goto L_0x0a40
        L_0x08d0:
            r1 = 62
            return r1
        L_0x08d3:
            int r0 = r2.size()
            if (r0 != r3) goto L_0x0a40
            java.lang.String r1 = A06(r2, r8, r6)
            java.lang.String r0 = "calls"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0a40
            X.1VX r2 = r7.A06
            r1 = 1972(0x7b4, float:2.763E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0a40
        L_0x08f1:
            r1 = 64
            return r1
        L_0x08f4:
            java.lang.String r0 = "code-linking"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0a40
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0a40
        L_0x0902:
            r1 = 77
            return r1
        L_0x0905:
            java.lang.String r0 = "biz-website"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0a40
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0a40
        L_0x0913:
            r1 = 57
            return r1
        L_0x0916:
            int r0 = r2.size()
            if (r0 < r3) goto L_0x092b
            java.lang.String r1 = A06(r2, r8, r6)
            java.lang.String r0 = "fpm"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x092b
        L_0x0928:
            r1 = 76
            return r1
        L_0x092b:
            int r0 = r2.size()
            if (r0 < r3) goto L_0x0940
            java.lang.String r1 = A06(r2, r8, r6)
            java.lang.String r0 = "ais"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0940
            r1 = 93
            return r1
        L_0x0940:
            int r0 = r2.size()
            if (r0 != r4) goto L_0x0996
            java.lang.String r1 = A06(r2, r8, r6)
            java.lang.String r0 = "bizsearch"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0996
            java.lang.String r1 = A06(r2, r8, r3)
            java.lang.String r0 = "onboarding-sheet"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0996
            X.1VX r4 = r7.A06
            r1 = 5465(0x1559, float:7.658E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r4.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0996
            goto L_0x0993
        L_0x096c:
            java.lang.String r0 = "bizsearch"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0a40
            int r0 = r2.size()
            if (r0 != r3) goto L_0x0a40
            java.lang.String r1 = A06(r2, r8, r6)
            java.lang.String r0 = "onboarding-sheet"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0a40
            X.1VX r2 = r7.A06
            r1 = 5465(0x1559, float:7.658E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0a40
        L_0x0993:
            r1 = 98
            return r1
        L_0x0996:
            int r0 = r2.size()
            if (r0 <= r3) goto L_0x09b5
            java.lang.String r1 = A06(r2, r8, r6)
            java.lang.String r0 = "calling"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x09b5
            int r0 = r2.size()
            java.util.List r0 = r2.subList(r3, r0)
            int r1 = A00(r0)
            return r1
        L_0x09b5:
            X.1VX r1 = r7.A06
            java.lang.String r0 = r5.toString()
            boolean r0 = A08(r1, r0)
            if (r0 == 0) goto L_0x09f7
            X.2Nc r1 = r7.A04
            java.lang.String r7 = "DeepLinkHelper"
            java.lang.String r6 = "fetch_biz_info"
            java.util.Map r5 = r1.A02
            java.lang.Object r2 = r5.get(r6)
            X.316 r2 = (X.AnonymousClass316) r2
            if (r2 != 0) goto L_0x09f1
            X.2wG r4 = r1.A00
            r0 = 701183835(0x29cb375b, float:9.0246136E-14)
            X.2ck r3 = new X.2ck
            r3.<init>(r0)
            X.1VX r2 = r1.A01
            r1 = 2560(0xa00, float:3.587E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x09ea
            r0 = 1
            r3.A05 = r0
        L_0x09ea:
            X.316 r2 = r4.A01(r3, r6)
            r5.put(r6, r2)
        L_0x09f1:
            r0 = -1
            r2.A0F(r7, r0)
            return r15
        L_0x09f7:
            int r0 = r2.size()
            if (r0 != r3) goto L_0x0a0a
            java.lang.String r1 = X.AnonymousClass001.A0n(r2, r6)
            java.lang.String r0 = "biz-"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0a0a
            return r3
        L_0x0a0a:
            int r0 = r2.size()
            if (r0 != r3) goto L_0x0a1d
            java.lang.String r1 = X.AnonymousClass001.A0n(r2, r6)
            java.lang.String r0 = "event-link"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0a1d
            return r3
        L_0x0a1d:
            int r0 = r2.size()
            if (r0 == r3) goto L_0x0a29
            int r0 = r2.size()
            if (r0 != 0) goto L_0x0a40
        L_0x0a29:
            r3 = 2
            return r3
        L_0x0a2b:
            java.lang.String r0 = "biz-linked-accounts"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0a40
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0a40
        L_0x0a39:
            r1 = 51
            return r1
        L_0x0a3c:
            return r12
        L_0x0a3d:
            r1 = 56
            return r1
        L_0x0a40:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36Y.A0B(android.net.Uri, android.net.Uri):int");
    }

    public final boolean A0H() {
        if (C56972sr.A00(this.A03) == null || !this.A0B.A02()) {
            return false;
        }
        return true;
    }

    public AnonymousClass36Y(C116985rC r1, C116985rC r2, C111095hX r3, C56972sr r4, C42182Nc r5, C49842hB r6, AnonymousClass1VX r7, C106685Zz r8, AnonymousClass5Y8 r9, C54902pT r10, AnonymousClass32F r11, C51072jE r12, AnonymousClass2J3 r13) {
        this.A06 = r7;
        this.A03 = r4;
        this.A07 = r8;
        this.A04 = r5;
        this.A01 = r1;
        this.A05 = r6;
        this.A09 = r10;
        this.A08 = r9;
        this.A0B = r12;
        this.A0A = r11;
        this.A0C = r13;
        this.A00 = r2;
        this.A02 = r3;
    }

    public static final int A00(List list) {
        if (list.size() == 2) {
            Locale locale = Locale.US;
            if (!((String) C18290x4.A0k(list)).toLowerCase(locale).equals("awareness") || !A06(list, locale, 1).equals("group-call")) {
                return 1;
            }
            return 99;
        }
        return 1;
    }

    public static UserJid A01(Uri uri) {
        String queryParameter = uri.getQueryParameter("phoneNumber");
        if (AnonymousClass0x9.A1O(uri, "wa.me")) {
            C626936e.A0B(AnonymousClass000.A1U(uri.getPathSegments().size(), 2));
            queryParameter = uri.getLastPathSegment();
        }
        if (queryParameter == null) {
            return null;
        }
        try {
            return AnonymousClass32X.A00(queryParameter);
        } catch (AnonymousClass24P unused) {
            return null;
        }
    }

    public static String A02(Uri uri) {
        String queryParameter = uri.getQueryParameter("phone");
        String host = uri.getHost();
        if (!TextUtils.isEmpty(host)) {
            host = AnonymousClass0x9.A0z(host);
        }
        if ("wa.me".equals(host)) {
            return uri.getLastPathSegment();
        }
        return queryParameter;
    }

    public static String A03(Uri uri) {
        boolean equals;
        List<String> pathSegments;
        String str;
        String scheme = uri.getScheme();
        if (!TextUtils.isEmpty(scheme)) {
            Locale locale = Locale.US;
            String lowerCase = scheme.toLowerCase(locale);
            String host = uri.getHost();
            if (!TextUtils.isEmpty(host)) {
                if (A0A(lowerCase, host.toLowerCase(locale))) {
                    pathSegments = uri.getPathSegments().subList(1, uri.getPathSegments().size());
                } else {
                    if (SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME.equals(lowerCase)) {
                        equals = true;
                    } else {
                        equals = "whatsapp-consumer".equals(lowerCase);
                    }
                    if (equals) {
                        pathSegments = uri.getPathSegments();
                    }
                }
                if (pathSegments.size() < 3) {
                    str = "deeplinkhelper/parseVerifyEmailOtp/invalid uri";
                } else {
                    String A062 = A06(pathSegments, locale, 2);
                    if (A062.length() == 6) {
                        try {
                            Integer.parseInt(A062);
                            return A062;
                        } catch (NumberFormatException e) {
                            C18260x0.A1Q(AnonymousClass001.A0o(), "deeplinkhelper/parseVerifyEmailOtp/NumberFormatException: ", e);
                            return null;
                        }
                    } else {
                        str = "deeplinkhelper/parseVerifyEmailOtp/invalid length";
                    }
                }
                Log.e(str);
            }
        }
        return null;
    }

    public static String A06(List list, Locale locale, int i) {
        return ((String) list.get(i)).toLowerCase(locale);
    }

    public static boolean A09(AnonymousClass1VX r3, String str) {
        if (!A08(r3, str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(AnonymousClass0x9.A0z(str));
            if (parse == null || parse.getQueryParameterNames().isEmpty() || !"1".equals(parse.getQueryParameter("qr"))) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0C(android.net.Uri r7, java.util.List r8) {
        /*
            r6 = this;
            int r0 = r8.size()
            r2 = 1
            if (r0 == 0) goto L_0x003e
            X.1VX r4 = r6.A06
            r0 = 504(0x1f8, float:7.06E-43)
            X.2vE r3 = X.C58422vE.A02
            boolean r0 = r4.A0Y(r3, r0)
            if (r0 == 0) goto L_0x003e
            boolean r0 = r6.A0H()
            if (r0 == 0) goto L_0x003e
            java.lang.Object r0 = X.C18290x4.A0k(r8)
            java.lang.String r0 = (java.lang.String) r0
            java.util.Locale r5 = java.util.Locale.US
            java.lang.String r1 = r0.toLowerCase(r5)
            java.lang.String r0 = "account"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00e7
            int r0 = r8.size()
            if (r0 <= r2) goto L_0x00e7
            java.lang.String r1 = A06(r8, r5, r2)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1711740600: goto L_0x00a7;
                case -1335458389: goto L_0x009c;
                case 51309: goto L_0x0089;
                case 96619420: goto L_0x0076;
                case 734040243: goto L_0x006b;
                case 1147181203: goto L_0x004b;
                case 1302948958: goto L_0x003f;
                default: goto L_0x003e;
            }
        L_0x003e:
            return r2
        L_0x003f:
            java.lang.String r0 = "request_info"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003e
            r0 = 23
            return r0
        L_0x004b:
            java.lang.String r0 = "business-platforms"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003e
            java.lang.String r1 = "whatsapp-smb"
            java.lang.String r0 = r7.getScheme()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003e
            r0 = 4705(0x1261, float:6.593E-42)
            boolean r0 = r4.A0Y(r3, r0)
            if (r0 == 0) goto L_0x003e
            r2 = 87
            return r2
        L_0x006b:
            java.lang.String r0 = "account_switcher"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003e
            r0 = 75
            return r0
        L_0x0076:
            java.lang.String r0 = "email"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003e
            X.2hB r0 = r6.A05
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x003e
            r2 = 81
            return r2
        L_0x0089:
            java.lang.String r0 = "2fa"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003e
            r0 = 4228(0x1084, float:5.925E-42)
            boolean r0 = r4.A0Y(r3, r0)
            if (r0 == 0) goto L_0x003e
            r2 = 67
            return r2
        L_0x009c:
            java.lang.String r0 = "delete"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003e
            r0 = 22
            return r0
        L_0x00a7:
            java.lang.String r0 = "verify-email"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003e
            X.2hB r1 = r6.A05
            boolean r0 = r1.A00()
            if (r0 == 0) goto L_0x003e
            X.33p r3 = r1.A01
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r3)
            java.lang.String r0 = "settings_verification_email_address"
            java.lang.String r0 = X.C18280x3.A0Z(r1, r0)
            if (r0 == 0) goto L_0x003e
            int r0 = r0.length()
            if (r0 == 0) goto L_0x003e
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r3)
            java.lang.String r0 = "settings_verification_email_address_verified"
            boolean r0 = X.C18280x3.A1W(r1, r0)
            if (r0 != 0) goto L_0x003e
            java.lang.String r0 = A03(r7)
            boolean r0 = X.C159707mK.A00(r0)
            if (r0 != 0) goto L_0x003e
            r0 = 96
            return r0
        L_0x00e7:
            java.lang.String r0 = "chats"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0139
            int r0 = r8.size()
            if (r0 <= r2) goto L_0x0104
            java.lang.String r1 = A06(r8, r5, r2)
            java.lang.String r0 = "history"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0104
            r0 = 24
            return r0
        L_0x0104:
            java.lang.String r0 = "page"
            java.lang.String r1 = r7.getQueryParameter(r0)
            int r0 = r8.size()
            if (r0 != r2) goto L_0x003e
            java.util.Set r0 = r7.getQueryParameterNames()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0136
            if (r1 == 0) goto L_0x003e
            java.lang.String r0 = "theme"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0136
            java.lang.String r0 = "font"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0136
            java.lang.String r0 = "language"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x003e
        L_0x0136:
            r0 = 36
            return r0
        L_0x0139:
            java.lang.String r0 = "storage-management"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003e
            r0 = 88
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36Y.A0C(android.net.Uri, java.util.List):int");
    }

    public final int A0D(String str, String str2) {
        if (!"upi".equals(str)) {
            boolean equals = "br".equals(str);
            if (equals && "signup".equals(str2)) {
                return 19;
            }
            if ("virality".equals(str) || "virality".equals(str2)) {
                return 21;
            }
            if ("tpp".equals(str)) {
                if (this.A06.A0Y(C58422vE.A02, 848)) {
                    return 29;
                }
                return 1;
            } else if ("legal".equals(str)) {
                return 1;
            } else {
                if ("add-credential".equals(str2)) {
                    return 65;
                }
                if (equals && "merchant".equals(str2)) {
                    return 89;
                }
                if (this.A09.A02()) {
                    return 4;
                }
                return 1;
            }
        } else if (!"signup".equals(str2)) {
            return 1;
        } else {
            return 19;
        }
    }

    public final int A0E(List list) {
        if (!list.isEmpty() && A0H()) {
            Object A0k = C18290x4.A0k(list);
            if (!this.A06.A0Y(C58422vE.A02, 728) || !"20210210".equals(A0k)) {
                return 1;
            }
            return 27;
        }
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r0 != false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0F(android.net.Uri r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.getScheme()
            java.lang.String r1 = r3.getHost()
            boolean r0 = A0A(r0, r1)
            if (r0 != 0) goto L_0x0017
            java.lang.String r0 = "api.whatsapp.com"
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 == 0) goto L_0x0018
        L_0x0017:
            r1 = 1
        L_0x0018:
            java.util.List r0 = r3.getPathSegments()
            int r0 = r0.size()
            if (r0 > r1) goto L_0x0024
            r0 = 0
            return r0
        L_0x0024:
            java.util.List r0 = r3.getPathSegments()
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36Y.A0F(android.net.Uri):java.lang.String");
    }

    public void A0G(Uri uri) {
        int i;
        List<String> pathSegments = uri.getPathSegments();
        String scheme = uri.getScheme();
        if (!TextUtils.isEmpty(scheme)) {
            String host = uri.getHost();
            if (host == null || !A0A(scheme, host)) {
                if ((!SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME.equals(scheme) && !"whatsapp-consumer".equals(scheme)) || pathSegments.size() < 1) {
                    return;
                }
                if (pathSegments.size() == 1) {
                    i = 0;
                } else {
                    pathSegments.get(1);
                    return;
                }
            } else if (pathSegments.size() >= 3) {
                i = 2;
            } else {
                return;
            }
            pathSegments.get(i);
        }
    }

    public boolean A0I(String str) {
        if (TextUtils.isEmpty(str) || 33 != A0B(Uri.parse(str), (Uri) null)) {
            return false;
        }
        return true;
    }

    public boolean A0J(String str) {
        if (TextUtils.isEmpty(str) || 6 != A0B(Uri.parse(str), (Uri) null)) {
            return false;
        }
        return true;
    }

    public boolean A0K(String str) {
        if (TextUtils.isEmpty(str) || 5 != A0B(Uri.parse(str), (Uri) null)) {
            return false;
        }
        return true;
    }
}
