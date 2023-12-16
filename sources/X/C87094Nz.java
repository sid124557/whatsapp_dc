package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.conversation.conversationrow.DynamicButtonsLayout;
import com.whatsapp.conversation.conversationrow.TemplateQuickReplyButtonsLayout;
import com.whatsapp.util.Log;
import java.util.Collections;

/* renamed from: X.4Nz  reason: invalid class name and case insensitive filesystem */
public abstract class C87094Nz extends ViewGroup implements AnonymousClass4GJ {
    public C116855qy A00;

    public static SpannableString A09(C93314oJ r14, String str) {
        SpannableString valueOf = SpannableString.valueOf(C107575bX.A02(str, new Object[0]));
        for (URLSpan uRLSpan : (URLSpan[]) valueOf.getSpans(0, valueOf.length(), URLSpan.class)) {
            int spanStart = valueOf.getSpanStart(uRLSpan);
            int spanEnd = valueOf.getSpanEnd(uRLSpan);
            valueOf.removeSpan(uRLSpan);
            valueOf.setSpan(new C88944b3(r14.getContext(), r14.A0Y, r14.A0X, r14.A0L, uRLSpan.getURL()), spanStart, spanEnd, 0);
        }
        return valueOf;
    }

    public abstract void A0v();

    public static int A07(C93324oK r0, DynamicButtonsLayout dynamicButtonsLayout, int i) {
        return i + dynamicButtonsLayout.A01(r0.A0l.getMeasuredWidth());
    }

    public static Object A0E(C64333Db r0) {
        return r0.A00.A96.get();
    }

    public static String A0F(C93314oJ r4, C624134x r5) {
        return C107145am.A00(r4.A0M, r4.A1E.A0I(r5.A0K));
    }

    public static void A0G(View view, C93324oK r6) {
        View view2 = r6.A0l;
        view.layout(view2.getLeft(), view2.getBottom(), view2.getRight(), view.getMeasuredHeight() + view2.getBottom());
    }

    public static void A0I(C116985rC r1, C64333Db r2, C88864av r3, C93314oJ r4, Object obj) {
        r4.A1m = (C44562Wn) obj;
        r4.A19 = r3.A4H();
        r4.A17 = r3.A4F();
        r4.A18 = r3.A4G();
        r4.A1A = r3.A4I();
        r4.A1B = r3.A4J();
        r4.A0W = (AnonymousClass7CX) r3.A06.get();
        r4.A15 = r3.A43();
        r4.A1s = (C50222hp) r2.AIA.get();
        r4.A0S = r1;
        r4.A0U = r1;
        r4.A16 = (C106355Yq) r2.A00.A7P.get();
        r4.A1U = (AnonymousClass5U1) r2.A00.A7W.get();
        r4.A2G = C72343dZ.A00(r2.A00.A85);
        r4.A2F = C72343dZ.A00(r2.ANn);
        r4.A2C = C72343dZ.A00(r2.AJS);
        r4.A27 = C72343dZ.A00(r2.A2O);
    }

    public static void A0L(C116985rC r2, C64333Db r3, C93314oJ r4) {
        r4.A1X = (C53202mi) r3.AXV.get();
        Object obj = r3.AHR.get();
        obj.getClass();
        r4.A0P = new C88734ai(obj);
        r4.A1h = (C54702p9) r3.AP7.get();
        r4.A0R = r2;
    }

    public static void A0N(C116985rC r0, C64333Db r1, AnonymousClass1PT r2) {
        r2.A01 = r0;
        r2.A0L = (C56072rN) r1.AGN.get();
        r2.A0D = (C56762sW) r1.A4R.get();
        r2.A07 = (C56942so) r1.A5V.get();
        r2.A09 = r1.AiJ();
        r2.A0H = (AnonymousClass2R8) r1.AWC.get();
        r2.A0F = (C55422qK) r1.AUG.get();
        r2.A0E = (C56322rn) r1.AIT.get();
    }

    public static void A0O(C116985rC r1, C64333Db r2, C93194o7 r3) {
        r3.A02 = (AnonymousClass5PP) r2.A00.A1y.get();
        r3.A00 = r1;
        r3.A03 = (C56072rN) r2.AGN.get();
    }

    public static void A0P(C116985rC r2, C64333Db r3, C93244oC r4) {
        r4.A1X = (C53202mi) r3.AXV.get();
        Object obj = r3.AHR.get();
        obj.getClass();
        r4.A0P = new C88734ai(obj);
        r4.A1h = (C54702p9) r3.AP7.get();
        r4.A0R = r2;
        r4.A02 = (AnonymousClass5ZR) r3.Aag.get();
        r4.A05 = (C620133d) r3.AJf.get();
        r4.A06 = (C104295Qk) r3.A00.A7E.get();
        r4.A04 = (C56232re) r3.AUV.get();
        r4.A03 = (AnonymousClass5PP) r3.A00.A1y.get();
        r4.A00 = r2;
        r4.A07 = (C56072rN) r3.AGN.get();
    }

    public static void A0Q(C88834as r0, C64333Db r1, C93314oJ r2) {
        r2.A1q = (AnonymousClass5ZD) r0.A04.get();
        r2.A1H = (C66473Lo) r1.A6p.get();
        r2.A1K = (C47972e8) r1.A9p.get();
    }

    public static void A0S(C64333Db r1, C88864av r2, C93314oJ r3) {
        r3.A1q = (AnonymousClass5ZD) r2.A0I.A04.get();
        r3.A1H = (C66473Lo) r1.A6p.get();
        r3.A1K = (C47972e8) r1.A9p.get();
    }

    public static void A0T(C64333Db r4, C88864av r5, C93114nv r6) {
        C148877Kb r3 = new C148877Kb();
        C64333Db r1 = r5.A0K;
        r6.A00 = new C148887Kc(r3, new AnonymousClass5WW((C54292oU) r1.AaB.get(), (C620733j) r1.AbU.get()));
        r6.A01 = (C48042eF) r4.AVm.get();
    }

    public static void A0U(C64333Db r4, C88864av r5, C93214o9 r6) {
        r6.A00 = (C64393Dh) r4.AS1.get();
        r6.A04 = (C48132eP) r4.AJd.get();
        r6.A03 = (C60132y3) r4.A21.get();
        C148877Kb r3 = new C148877Kb();
        C64333Db r1 = r5.A0K;
        r6.A01 = new C148887Kc(r3, new AnonymousClass5WW((C54292oU) r1.AaB.get(), (C620733j) r1.AbU.get()));
        r6.A05 = (AnonymousClass5RW) r4.A00.A47.get();
    }

    public static void A0V(C64333Db r1, C88864av r2, C93234oB r3) {
        r3.A02 = (C182938pE) r2.A0B.get();
        r3.A04 = (C95884uo) r1.A00.A9s.get();
        r3.A01 = (C54602oz) r1.ABK.get();
    }

    public static void A0W(C64333Db r1, C93324oK r2) {
        r2.A0O = (AnonymousClass1VX) r1.A07.get();
        r2.A0T = (C105025Tg) r1.AK5.get();
        r2.A0F = (C55682qk) r1.A75.get();
        r2.A0N = (C56982ss) r1.A5B.get();
        r2.A0Q = (C28071fd) r1.AJC.get();
        r2.A0L = (C620633i) r1.AYG.get();
        r2.A0M = (C620733j) r1.AbU.get();
        r2.A0U = r1.ArS();
    }

    public static void A0X(C64333Db r1, C93314oJ r2) {
        r2.A0P = r1.A00.ALw();
        r2.A0R = r1.ApS();
        r2.A0K = (AnonymousClass5R7) r1.A00.A2p.get();
        r2.A0I = (C104525Rh) r1.A00.A7Q.get();
        r2.A0G = (AnonymousClass64J) r1.AEN.get();
        r2.A1E = (C56612sH) r1.ASO.get();
        r2.A0X = (C69263Wi) r1.AG7.get();
        r2.A1c = (C106195Xz) r1.AKJ.get();
        r2.A20 = (C106715a2) r1.A00.A72.get();
        r2.A25 = (AnonymousClass4FS) r1.AbX.get();
        r2.A0Z = (C56972sr) r1.AJW.get();
    }

    public static void A0a(C64333Db r1, C93314oJ r2, C55042ph r3) {
        r2.A1j = r3;
        r2.A1t = (C54822pL) r1.A00.AAD.get();
        r2.A0o = (AnonymousClass2PX) r1.AVp.get();
        r2.A23 = (C187958y5) r1.ASM.get();
        r2.A0v = (AnonymousClass5ZU) r1.AaA.get();
        r2.A2A = C72343dZ.A00(r1.A3J);
        r2.A1u = (C45082Yp) r1.A90.get();
        r2.A1M = (C114635nM) r1.AQW.get();
        r2.A29 = C72343dZ.A00(r1.A3B);
        r2.A0q = (C56962sq) r1.A2b.get();
        r2.A0w = (C66413Li) r1.A6U.get();
        r2.A0y = (AnonymousClass5ST) r1.A6r.get();
    }

    public static void A0b(C64333Db r1, C93314oJ r2, Object obj) {
        r2.A11 = (AnonymousClass5G6) obj;
        r2.A1w = (C97144xh) r1.AXA.get();
        r2.A1f = (C47052cd) r1.A00.A7Z.get();
        r2.A1S = (C60992zV) r1.A9C.get();
        r2.A2H = C72343dZ.A00(r1.A00.A8C);
        r2.A10 = (C44852Xs) r1.A00.A95.get();
        r2.A1F = (C57162tC) r1.AaV.get();
        r2.A2D = C72343dZ.A00(r1.ASD);
        r2.A0l = (AnonymousClass5T7) r1.A4a.get();
        r2.A0p = (AnonymousClass5X1) r1.A3p.get();
        r2.A21 = (C106625Zs) r1.A00.A73.get();
    }

    public static void A0c(C64333Db r1, C93074nr r2) {
        r2.A00 = C72343dZ.A00(r1.A00.A8T);
        r2.A01 = C72343dZ.A00(r1.A00.A9k);
    }

    public static void A0f(C93314oJ r2, C624134x r3) {
        AnonymousClass0YZ.A0F(r2.A0K, C107315b6.A04(r3));
        ImageView imageView = r2.A0G;
        if (imageView != null) {
            AnonymousClass0YZ.A0F(imageView, C93244oC.A02(r3));
        }
    }

    public static boolean A0h(C93324oK r2) {
        return r2.A0n.BHf(r2.A0S);
    }

    public static boolean A0i(C93314oJ r2) {
        return C627636p.A0v(r2.A0S, r2.A28);
    }

    public static boolean A0l(C93244oC r3) {
        return RequestPermissionActivity.A0q(r3.getContext(), r3.A02, r3.A0O);
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A00;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C87094Nz(Context context) {
        super(context);
        A0v();
    }

    public static int A05(View view) {
        return view.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
    }

    public static int A06(View view) {
        return view.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
    }

    public static int A08(C93324oK r2, TemplateQuickReplyButtonsLayout templateQuickReplyButtonsLayout) {
        return r2.getMeasuredHeight() + templateQuickReplyButtonsLayout.A00(r2.A0l.getMeasuredWidth());
    }

    public static C116985rC A0A(C64333Db r2, C93314oJ r3) {
        r3.A1I = (C66543Lv) r2.A71.get();
        r3.A1x = (C55832qz) r2.AAY.get();
        r3.A1V = (C66493Lq) r2.AGL.get();
        r3.A1d = (C52552lf) r2.AHS.get();
        r3.A1k = (C614030o) r2.AOy.get();
        r3.A1W = (C52472lX) r2.AXh.get();
        r3.A0x = (C53602nM) r2.A00.A2g.get();
        C88744aj r1 = C88744aj.A00;
        r3.A0T = r1;
        r3.A22 = (C33141sV) r2.AMe.get();
        r3.A1i = (C103625Ns) r2.A00.A8R.get();
        return r1;
    }

    public static C111685iW A0B(C87094Nz r0) {
        return (C111685iW) r0.generatedComponent();
    }

    public static C88864av A0C(C87094Nz r0) {
        return (C88864av) ((C111685iW) r0.generatedComponent());
    }

    public static C55042ph A0D(C64333Db r0) {
        return (C55042ph) r0.AOx.get();
    }

    public static void A0H(TextView textView, C93314oJ r7, C30471mV r8) {
        C93314oJ r0 = r7;
        r0.A1c(textView, (Integer) null, Collections.singletonList(r8), r8.A00);
    }

    public static void A0J(C116985rC r1, C64333Db r2, C88864av r3, AnonymousClass1PT r4) {
        r4.A0J = (C196439aq) r2.APy.get();
        r4.A0K = r3.A4L();
        r4.A0A = (AnonymousClass33U) r2.A5h.get();
        r4.A06 = (C44272Vj) r2.A5U.get();
        r4.A08 = r2.AiI();
        r4.A0I = (C49522gf) r2.A8L.get();
        r4.A02 = (C625735q) r2.AYF.get();
        r4.A0B = (C613330g) r2.A6S.get();
        r4.A0G = (AnonymousClass2W8) r2.AQv.get();
        r4.A00 = r1;
        r4.A0M = C72343dZ.A00(r2.A6G);
        r4.A04 = (C1230066r) r2.A4Q.get();
        r4.A05 = (AnonymousClass5IP) r2.A00.A6l.get();
    }

    public static void A0K(C116985rC r1, C64333Db r2, C88864av r3, C93304oI r4) {
        r4.A0G = (C66503Lr) r2.AGs.get();
        r4.A0E = (C28891hw) r2.A6s.get();
        r4.A0D = (AnonymousClass5PP) r2.A00.A1y.get();
        r4.A0B = (C100285Ah) r2.A00.A2s.get();
        r4.A04 = (AnonymousClass7CY) r3.A07.get();
        r4.A0A = r3.A42();
        r4.A03 = r1;
        r4.A0F = (AnonymousClass36Y) r2.A7u.get();
        r4.A0H = (C56072rN) r2.AGN.get();
    }

    public static void A0M(C116985rC r1, C64333Db r2, C93314oJ r3, AnonymousClass4C1 r4) {
        r3.A0n = (C105145Tt) r4.get();
        r3.A1v = (AnonymousClass33O) r2.AX1.get();
        r3.A1l = (C195909Zz) r2.A00.A8b.get();
        r3.A1Y = (AnonymousClass2RM) r2.AIF.get();
        r3.A2B = C72343dZ.A00(r2.A82);
        r3.A1L = (C56892sj) r2.AGm.get();
        r3.A0Q = r1;
        r3.A0z = (C49772h4) r2.A8e.get();
        r3.A1N = (C55282q6) r2.ARU.get();
        r3.A1o = (C60152y5) r2.AVn.get();
        r3.A0r = (AnonymousClass4F4) r2.AL1.get();
        r3.A0s = (C29441ip) r2.A68.get();
    }

    public static void A0R(C64333Db r1, C107695bk r2, C93314oJ r3) {
        r3.A0j = r2.AIr();
        r3.A0k = (AnonymousClass3N0) r1.A9z.get();
        r3.A28 = C72343dZ.A00(r1.A3A);
        r3.A1Q = (C59862xc) r1.APF.get();
        r3.A2E = C72343dZ.A00(r1.ANe);
        r3.A0m = (C105405Uu) r1.A4W.get();
        r3.A1P = (C620333f) r1.AKQ.get();
        r3.A1z = (C69183Wa) r1.AYu.get();
        r3.A0u = (C56422rx) r1.AZn.get();
        r3.A1G = (AnonymousClass33p) r1.Aaj.get();
        r3.A1J = (C55672qj) r1.A8i.get();
        r3.A1p = (C49652gs) r1.A1G.get();
    }

    public static void A0Y(C64333Db r1, C93314oJ r2) {
        r2.A1C = (C114005mL) r1.AMg.get();
        r2.A0a = (AnonymousClass5Ul) r1.AUW.get();
        r2.A1Z = (C106685Zz) r1.AJ4.get();
        r2.A0c = (C56492s4) r1.AWW.get();
        r2.A1R = (AnonymousClass5Y0) r1.A8o.get();
        r2.A1g = (AnonymousClass33S) r1.AUY.get();
        r2.A0b = (C66663Mh) r1.AUd.get();
        r2.A1y = (C56572sD) r1.AWF.get();
        r2.A1O = (C620233e) r1.AWq.get();
        r2.A0h = (C621033m) r1.AZL.get();
        r2.A1b = (C52532ld) r1.AZr.get();
    }

    public static void A0Z(C64333Db r1, C93314oJ r2) {
        r2.A1T = r1.Akp();
        r2.A0Y = (C85244Fm) r1.AJ2.get();
        r2.A1r = (C55862r2) r1.A1T.get();
        r2.A1a = (C55972rD) r1.AJk.get();
        r2.A26 = (C186998wH) r1.Aau.get();
        r2.A0V = (C111095hX) r1.A0a.get();
        r2.A1e = (AnonymousClass31C) r1.AKw.get();
        r2.A0t = (C64773Ex) r1.A6O.get();
    }

    public static void A0d(C64333Db r0, AnonymousClass4o3 r1) {
        r1.A0A = (C55852r1) r0.AHM.get();
    }

    public static void A0e(AnonymousClass33C r2, C30471mV r3, StringBuilder sb, boolean z) {
        sb.append(z);
        sb.append(" type:");
        sb.append(r3.A1I);
        sb.append(" url:");
        sb.append(C57392tZ.A00(r3.A07));
        sb.append(" file:");
        sb.append(r2.A0F);
        sb.append(" progress:");
        sb.append(r2.A0C);
        sb.append(" transferred:");
        sb.append(r2.A0R);
        sb.append(" transferring:");
        sb.append(r2.A0c);
        sb.append(" fileSize:");
        sb.append(r2.A0A);
        sb.append(" media_size:");
        sb.append(r3.A00);
        sb.append(" timestamp:");
        sb.append(r3.A0K);
        Log.i(sb.toString());
    }

    public static boolean A0g(C93324oK r0) {
        return r0.getFMessage().A1J.A02;
    }

    public static boolean A0j(C93244oC r0) {
        return C627636p.A10(r0.getFMessage());
    }

    public static boolean A0k(C93244oC r0) {
        return C383227b.A00(r0.getFMessage());
    }

    public static boolean A0m(C93244oC r0) {
        return C627636p.A0z(r0.getFMessage());
    }
}
