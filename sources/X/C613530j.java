package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Base64;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.30j  reason: invalid class name and case insensitive filesystem */
public final class C613530j {
    public int A00;
    public C161447pg A01;
    public final AnonymousClass2VM A02;
    public final C69263Wi A03;
    public final C620433g A04;
    public final C29441ip A05;
    public final C64773Ex A06;
    public final C56422rx A07;
    public final C613330g A08;
    public final C60032xt A09;
    public final C40292Fg A0A;
    public final C56612sH A0B;
    public final C54292oU A0C;
    public final C54402of A0D;
    public final C620733j A0E;
    public final C53412n3 A0F;
    public final C66543Lv A0G;
    public final C50312hy A0H;
    public final C56162rW A0I;
    public final C59102wM A0J;
    public final C48622fC A0K;
    public final C23401Sx A0L;
    public final AnonymousClass1Uc A0M;
    public final C23651Ud A0N;
    public final C23641Ub A0O;
    public final C23631Ua A0P;
    public final AnonymousClass1VX A0Q;
    public final C48182eU A0R;
    public final C60482yd A0S;
    public final AnonymousClass4FS A0T;
    public final C183538qC A0U;
    public final AtomicBoolean A0V = C18280x3.A0l();

    public static final boolean A00(String str, String str2) {
        try {
            if (Long.parseLong(str) >= 3) {
                if (str2 == null || str2.length() == 0 || "navigate".equals(str2)) {
                    return true;
                }
                return false;
            }
        } catch (NumberFormatException e) {
            C18260x0.A17("SExtensionsLogger/PhoenixExtensionsFlowManager/isExtensionInitWithoutDataChannel()/Error - ", AnonymousClass001.A0o(), e);
        }
        return false;
    }

    public final void A03(C54052o6 r15, C53832nk r16, AnonymousClass4DQ r17) {
        C23641Ub r1 = this.A0O;
        C54052o6 r12 = r15;
        String str = r15.A05;
        int hashCode = str.hashCode();
        C372521n r2 = C372521n.USER_INTERACTION;
        String str2 = r15.A08;
        String str3 = r15.A09;
        r1.A0D(r2, r15.A02, Boolean.valueOf(r15.A0B), str, str2, str3, hashCode);
        C53832nk r9 = r16;
        AnonymousClass4DQ r11 = r17;
        if (!C162457s7.A0P(r9.A00, "DRAFT")) {
            this.A0K.A00(str, hashCode).A04(new C86214Jg(r9, this, r11, r12, 2), this.A03.A08);
            return;
        }
        this.A0M.A05(hashCode, "psl_cache_hit", false);
        A02(r15, r9, r11);
    }

    public C613530j(AnonymousClass2VM r22, C69263Wi r23, C620433g r24, C29441ip r25, C64773Ex r26, C56422rx r27, C613330g r28, C60032xt r29, C40292Fg r30, C56612sH r31, C54292oU r32, C54402of r33, C620733j r34, C53412n3 r35, C66543Lv r36, C50312hy r37, C56162rW r38, C59102wM r39, C48622fC r40, C23401Sx r41, AnonymousClass1Uc r42, C23651Ud r43, C23641Ub r44, C23631Ua r45, AnonymousClass1VX r46, C48182eU r47, C60482yd r48, AnonymousClass4FS r49, C183538qC r50) {
        AnonymousClass1VX r0 = r46;
        AnonymousClass4FS r3 = r49;
        C56612sH r15 = r31;
        C54292oU r14 = r32;
        C69263Wi r19 = r23;
        C18260x0.A0f(r15, r0, r19, r14, r3);
        C183538qC r2 = r50;
        C66543Lv r12 = r36;
        AnonymousClass2VM r20 = r22;
        C18260x0.A0W(r20, r2, r12);
        C60482yd r4 = r48;
        C162457s7.A0J(r4, 10);
        C620433g r18 = r24;
        C56422rx r13 = r27;
        C18270x1.A13(r13, r18);
        C29441ip r17 = r25;
        C162457s7.A0J(r17, 14);
        C40292Fg r10 = r30;
        C162457s7.A0J(r10, 16);
        C50312hy r6 = r37;
        C54402of r9 = r33;
        C620733j r8 = r34;
        C18290x4.A1N(r9, r6, r8);
        C48182eU r5 = r47;
        C162457s7.A0J(r5, 22);
        C613330g r11 = r28;
        C162457s7.A0J(r11, 25);
        C64773Ex r16 = r26;
        C162457s7.A0J(r16, 26);
        C53412n3 r7 = r35;
        C162457s7.A0J(r7, 29);
        this.A0B = r15;
        this.A0Q = r0;
        this.A03 = r19;
        this.A0C = r14;
        this.A0T = r3;
        this.A02 = r20;
        this.A0U = r2;
        this.A0G = r12;
        this.A09 = r29;
        this.A0S = r4;
        this.A07 = r13;
        this.A04 = r18;
        this.A0I = r38;
        this.A05 = r17;
        this.A0K = r40;
        this.A0A = r10;
        this.A0P = r45;
        this.A0L = r41;
        this.A0D = r9;
        this.A0H = r6;
        this.A0E = r8;
        this.A0R = r5;
        this.A0N = r43;
        this.A0M = r42;
        this.A08 = r11;
        this.A06 = r16;
        this.A0O = r44;
        this.A0J = r39;
        this.A0F = r7;
    }

    public final void A01(C54052o6 r18, int i, boolean z) {
        int i2;
        String str;
        C54052o6 r7 = r18;
        UserJid userJid = r7.A02;
        String str2 = r7.A08;
        int i3 = 0;
        C624134x A002 = C55832qz.A00(this.A0G, AnonymousClass2z0.A05(userJid, str2, false));
        JSONObject A1G = AnonymousClass0x9.A1G();
        String A003 = C57142tA.A00(str2);
        String A004 = C57142tA.A00(r7.A09);
        try {
            A1G.put("cta", "galaxy_message");
            A1G.put("flow_id", r7.A05);
            A1G.put("extensions_message_id", A003);
            A1G.put("session_id", A004);
            A1G.put("data_channel_navigation", z);
            if (r7.A0C) {
                i3 = 1;
            }
            A1G.put("extension_restored_from_cache", i3);
        } catch (JSONException e) {
            C18260x0.A17("SExtensionsLogger/PhoenixExtensionsFlowMessage/reportWamEvent()/Error - ", AnonymousClass001.A0o(), e);
        }
        int A005 = AnonymousClass30C.A00(this.A07.A00(userJid));
        C55012pe A012 = this.A0F.A01.A01(userJid);
        if (A002 != null) {
            i2 = C624134x.A05(A002);
        } else {
            i2 = 1;
        }
        C50312hy r8 = this.A0H;
        String A0o = C18290x4.A0o(A1G);
        Integer valueOf = Integer.valueOf(A005);
        String str3 = null;
        if (A012 != null) {
            str3 = A012.A06;
            str = A012.A05;
        } else {
            str = null;
        }
        r8.A01(userJid, A002, valueOf, A0o, str3, str, str2, i);
        HashMap A0t = AnonymousClass001.A0t();
        A0t.put("business_jid", userJid.user);
        A0t.put("ext_session_id", A004);
        A0t.put("ext_message_id", A003);
        A0t.put("biz_platform", valueOf);
        A0t.put("message_media_type", Integer.valueOf(i2));
        C161447pg r0 = this.A01;
        if (r0 == null) {
            throw C18270x1.A0S("fdsManager");
        }
        r0.A0E(A0t);
    }

    public final void A02(C54052o6 r10, C53832nk r11, AnonymousClass4DQ r12) {
        C23401Sx r2 = this.A0L;
        String str = r10.A05;
        String str2 = r11.A05;
        if (str2 != null) {
            r2.A0F(new C66583Lz(this, r10, r11, r12), str, str2, r11.A06, C162457s7.A0P(r11.A00, "DRAFT"), false);
            return;
        }
        throw C18300x5.A0X();
    }

    public final void A04(C54052o6 r14, AnonymousClass4B3 r15, AnonymousClass4DQ r16, C51052jC r17, String str, Map map, boolean z) {
        Bitmap bitmap;
        String str2;
        this.A01 = this.A02.A00(r17);
        UserJid userJid = r14.A02;
        HashMap A0t = AnonymousClass001.A0t();
        C55502qS A002 = this.A07.A00(userJid);
        if (!(A002 == null || (str2 = A002.A08) == null)) {
            A0t.put("business_name", str2);
        }
        if (this.A0Q.A0Y(C58422vE.A02, 4078)) {
            AnonymousClass3ZH A072 = this.A06.A07(userJid);
            Context context = this.A0C.A00;
            float A012 = C18310x6.A01(context);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
            if (A072 != null) {
                bitmap = this.A08.A01(context, A072, A012, dimensionPixelSize);
            } else {
                bitmap = null;
            }
            ByteArrayOutputStream A0e = AnonymousClass0x9.A0e();
            if (bitmap != null) {
                C18310x6.A12(bitmap, A0e);
            }
            String encodeToString = Base64.encodeToString(A0e.toByteArray(), 0);
            if (encodeToString != null) {
                A0t.put("business_profile_logo", encodeToString);
            }
        }
        C161447pg r0 = this.A01;
        if (r0 == null) {
            throw C18270x1.A0S("fdsManager");
        }
        r0.A0E(A0t);
        A01(r14, 0, !A00(r14.A06, r14.A04));
        this.A0P.A09(Integer.valueOf(this.A00), "startFlow");
        AnonymousClass39C r7 = null;
        boolean z2 = z;
        if (z) {
            r7 = new AnonymousClass39C(1000, "PHOENIX", false);
        }
        C161447pg r4 = this.A01;
        if (r4 == null) {
            throw C18270x1.A0S("fdsManager");
        }
        r4.A0A(new AnonymousClass4KM(this, 0, r15), new C625935s(r14, r16, this, 2), r7, r14.A05, str, r14.A03, map, z2);
    }

    public final void A05(C54052o6 r8, boolean z) {
        AnonymousClass4DV r0;
        AnonymousClass39W B5s;
        AnonymousClass39P r02;
        AnonymousClass2z0 A032 = AnonymousClass2z0.A03(r8.A02, r8.A08);
        C66543Lv r6 = this.A0G;
        C624134x A002 = C55832qz.A00(r6, A032);
        Object obj = null;
        if ((A002 instanceof AnonymousClass4DV) && (r0 = (AnonymousClass4DV) A002) != null && (B5s = r0.B5s()) != null && B5s.A00 == 5 && (r02 = B5s.A03) != null) {
            List list = r02.A03;
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (AnonymousClass395.A00(next, "galaxy_message")) {
                        obj = next;
                        break;
                    }
                }
                AnonymousClass395 r3 = (AnonymousClass395) obj;
                if (r3 != null) {
                    r3.A00 = z;
                }
            }
            r6.A0Y(A002);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(X.AnonymousClass4DQ r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            java.lang.String r3 = "extensions-features-disabled"
            boolean r0 = X.C162457s7.A0P(r8, r3)
            X.1Ua r4 = r6.A0P
            if (r0 == 0) goto L_0x0068
            int r0 = r6.A00
            X.C56672sN.A00(r4, r0)
            X.1Uc r4 = r6.A0M
            int r0 = r9.hashCode()
            X.C56672sN.A00(r4, r0)
        L_0x0018:
            X.2oU r1 = r6.A0C
            r0 = 2131889283(0x7f120c83, float:1.9413225E38)
            java.lang.String r5 = X.C54292oU.A04(r1, r0)
            X.1ip r0 = r6.A05
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x004e
            r0 = 2131889282(0x7f120c82, float:1.9413223E38)
        L_0x002c:
            java.lang.String r5 = X.C54292oU.A04(r1, r0)
        L_0x0030:
            if (r7 == 0) goto L_0x0048
            X.21V r0 = X.AnonymousClass21V.A02
            java.lang.String r0 = r0.key
            java.util.Map r3 = X.C52632ln.A00(r0, r5)
            java.lang.Integer r2 = X.AnonymousClass0x7.A0f()
            java.lang.String r1 = "ExtensionError"
            X.2z6 r0 = new X.2z6
            r0.<init>(r2, r1, r5)
            r7.BSv(r0, r3)
        L_0x0048:
            X.8vZ r0 = r4.A05
            r0.Bko()
            return
        L_0x004e:
            java.lang.String r0 = "extensions-banned-id-error"
            boolean r0 = X.C162457s7.A0P(r8, r0)
            if (r0 != 0) goto L_0x0064
            boolean r0 = X.C162457s7.A0P(r8, r3)
            if (r0 != 0) goto L_0x0064
            java.lang.String r0 = "extensions-integrity-check-failed"
            boolean r0 = X.C162457s7.A0P(r8, r0)
            if (r0 == 0) goto L_0x0030
        L_0x0064:
            r0 = 2131889286(0x7f120c86, float:1.9413231E38)
            goto L_0x002c
        L_0x0068:
            int r1 = r6.A00
            java.lang.String r0 = "error_message"
            r4.A04(r1, r0, r8)
            int r0 = r6.A00
            r2 = 3
            r4.A06(r0, r2)
            X.1Uc r4 = r6.A0M
            int r1 = r9.hashCode()
            r0 = 0
            r4.A0C(r1, r8, r0)
            r4.A0D(r1, r2)
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C613530j.A06(X.4DQ, java.lang.String, java.lang.String):void");
    }

    public final boolean A07(C54052o6 r15, C53832nk r16, C41572Kt r17, AnonymousClass4DQ r18) {
        String str;
        C370820w A012 = this.A0J.A01(r17.A00, r16, r15.A06);
        if (A012.ordinal() == 0) {
            return false;
        }
        if (A012 == C370820w.UNKNOWN_VERSION) {
            str = "extensions-metadata-unknown-version";
        } else {
            str = "extensions-metadata-not-compatible";
        }
        String str2 = r15.A05;
        A06(r18, str, str2);
        C60032xt r2 = this.A09;
        UserJid userJid = r15.A02;
        String str3 = r15.A08;
        String str4 = r15.A09;
        r2.A02(this.A07, this.A0G, this.A0H, userJid, Boolean.valueOf(r15.A0C), "galaxy_message", str2, str3, str4, str, (String) null);
        return true;
    }
}
