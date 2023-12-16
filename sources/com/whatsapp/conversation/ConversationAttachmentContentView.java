package com.whatsapp.conversation;

import X.AnonymousClass001;
import X.AnonymousClass0RP;
import X.AnonymousClass0x2;
import X.AnonymousClass1VX;
import X.AnonymousClass32Y;
import X.AnonymousClass33p;
import X.AnonymousClass34R;
import X.AnonymousClass4GJ;
import X.AnonymousClass4L0;
import X.AnonymousClass5HX;
import X.AnonymousClass5LJ;
import X.AnonymousClass5U6;
import X.AnonymousClass5YI;
import X.AnonymousClass68K;
import X.AnonymousClass9Tp;
import X.C106675Zy;
import X.C111685iW;
import X.C116855qy;
import X.C116985rC;
import X.C133366hE;
import X.C153087ae;
import X.C161357pU;
import X.C162457s7;
import X.C182178nz;
import X.C18280x3;
import X.C18290x4;
import X.C18320x8;
import X.C187958y5;
import X.C1907099n;
import X.C195219Wq;
import X.C56952sp;
import X.C56972sr;
import X.C56982ss;
import X.C620633i;
import X.C620733j;
import X.C627336j;
import X.C64333Db;
import X.C64773Ex;
import X.C69263Wi;
import X.C86604Kt;
import X.C86614Ku;
import X.C86624Kv;
import X.C86634Kw;
import X.C86644Kx;
import X.C86654Ky;
import X.C86664Kz;
import X.C88744aj;
import X.C88864av;
import X.C89894fS;
import X.C94824ry;
import X.C95804uY;
import X.C95814uZ;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnimationSet;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.whatsapp.R;
import com.whatsapp.community.ConversationCommunityViewModel;
import com.whatsapp.text.CondensedTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public class ConversationAttachmentContentView extends ScrollView implements AnonymousClass4GJ {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public LinearLayout A09;
    public C116985rC A0A;
    public C69263Wi A0B;
    public C56972sr A0C;
    public AnonymousClass5LJ A0D;
    public ConversationCommunityViewModel A0E;
    public C64773Ex A0F;
    public C89894fS A0G;
    public AnonymousClass5U6 A0H;
    public AnonymousClass5HX A0I;
    public C620633i A0J;
    public AnonymousClass33p A0K;
    public C620733j A0L;
    public C56982ss A0M;
    public AnonymousClass1VX A0N;
    public C95814uZ A0O;
    public C153087ae A0P;
    public C1907099n A0Q;
    public AnonymousClass9Tp A0R;
    public C195219Wq A0S;
    public C106675Zy A0T;
    public C187958y5 A0U;
    public C116855qy A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public final LinkedHashMap A0b;

    private View.OnClickListener getListenerToHandleOrderDisableState() {
        return new AnonymousClass68K(this, 3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: android.graphics.drawable.GradientDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: android.graphics.drawable.GradientDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: android.graphics.drawable.LayerDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v34, resolved type: android.graphics.drawable.GradientDrawable} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02eb, code lost:
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02f4, code lost:
        if (r2.equals("quick reply") == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0303, code lost:
        r8.A0A.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x030e, code lost:
        throw X.AnonymousClass001.A0g("getAttachShopIconId");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x030f, code lost:
        r8.A0A.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x031a, code lost:
        throw X.AnonymousClass001.A0g("getAttachQuickReplyIconId");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0080, code lost:
        if (r2.equals("contact") == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0083, code lost:
        r1 = com.whatsapp.R.drawable.ic_attachment_contact;
        r13 = com.whatsapp.R.color.f5nameremoved;
        r2 = com.whatsapp.R.color.f5nameremoved;
        r12 = com.whatsapp.R.color.f5nameremoved;
        r6 = com.whatsapp.R.string.f11nameremoved;
        r5 = com.whatsapp.R.id.pickfiletype_contact_holder;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009d, code lost:
        if (r2.equals("document") == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a3, code lost:
        if (r8.A0Y != false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a5, code lost:
        r0 = r8.A0a;
        r1 = com.whatsapp.R.drawable.ic_attachment_document;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00aa, code lost:
        if (r0 == false) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ac, code lost:
        r1 = com.whatsapp.R.drawable.ic_attachment_document_v2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00af, code lost:
        r13 = com.whatsapp.R.color.f5nameremoved;
        r2 = com.whatsapp.R.color.f5nameremoved;
        r12 = com.whatsapp.R.color.f5nameremoved;
        r6 = com.whatsapp.R.string.f11nameremoved;
        r5 = com.whatsapp.R.id.pickfiletype_document_holder;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d1, code lost:
        if (r2.equals("event") == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d5, code lost:
        r1 = com.whatsapp.R.drawable.ic_attachment_event;
        r13 = com.whatsapp.R.color.f5nameremoved;
        r2 = com.whatsapp.R.color.f5nameremoved;
        r12 = com.whatsapp.R.color.f5nameremoved;
        r6 = com.whatsapp.R.string.f11nameremoved;
        r5 = com.whatsapp.R.id.pickfiletype_event_holder;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ee, code lost:
        if (r2.equals("audio") == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f2, code lost:
        r1 = com.whatsapp.R.drawable.ic_attachment_audio;
        r13 = com.whatsapp.R.color.f5nameremoved;
        r2 = com.whatsapp.R.color.f5nameremoved;
        r12 = com.whatsapp.R.color.f5nameremoved;
        r6 = com.whatsapp.R.string.f11nameremoved;
        r5 = com.whatsapp.R.id.pickfiletype_audio_holder;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x010b, code lost:
        if (r2.equals("shop") == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0115, code lost:
        if (r2.equals("poll") == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0119, code lost:
        r0 = r8.A0Y;
        r1 = com.whatsapp.R.drawable.ic_attachment_poll;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x011e, code lost:
        if (r0 == false) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0120, code lost:
        r1 = com.whatsapp.R.drawable.ic_attachment_poll_v2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0123, code lost:
        r13 = com.whatsapp.R.color.f5nameremoved;
        r2 = com.whatsapp.R.color.f5nameremoved;
        r12 = com.whatsapp.R.color.f5nameremoved;
        r6 = com.whatsapp.R.string.f11nameremoved;
        r5 = com.whatsapp.R.id.pickfiletype_poll_holder;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0132, code lost:
        r18 = false;
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x013c, code lost:
        if (r2.equals("gallery") == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0142, code lost:
        if (r8.A0Y != false) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0144, code lost:
        r0 = r8.A0a;
        r1 = com.whatsapp.R.drawable.ic_attachment_gallery;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0149, code lost:
        if (r0 == false) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x014b, code lost:
        r1 = com.whatsapp.R.drawable.ic_attachment_gallery_v2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x014e, code lost:
        r13 = com.whatsapp.R.color.f5nameremoved;
        r2 = com.whatsapp.R.color.f5nameremoved;
        r12 = com.whatsapp.R.color.f5nameremoved;
        r6 = com.whatsapp.R.string.f11nameremoved;
        r5 = com.whatsapp.R.id.pickfiletype_gallery_holder;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x015d, code lost:
        r18 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x015f, code lost:
        r4 = X.C18290x4.A0G(r8).getDrawable(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002b, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0179, code lost:
        if (r2.equals("payment") == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x017d, code lost:
        r3 = getContext();
        r2 = r8.A0P.A01();
        X.C626936e.A06(r2);
        r4 = new X.AnonymousClass4Lm(X.C06400Xn.A02(r3, com.whatsapp.R.font.payment_icons_regular), ((X.AnonymousClass1S3) r2).B6J(r3, 0), getResources().getColor(com.whatsapp.R.color.f5nameremoved), getResources().getDimensionPixelSize(com.whatsapp.R.dimen.f6nameremoved));
        r0 = r8.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01b5, code lost:
        if (r0 == 2) goto L_0x01bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01b7, code lost:
        r13 = com.whatsapp.R.color.f5nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01ba, code lost:
        if (r0 != 4) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01bc, code lost:
        r13 = com.whatsapp.R.color.f5nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01bf, code lost:
        if (r0 == 2) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01c1, code lost:
        r2 = com.whatsapp.R.color.f5nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01c4, code lost:
        if (r0 != 4) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01c6, code lost:
        r2 = com.whatsapp.R.color.f5nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01c9, code lost:
        if (r0 == 2) goto L_0x01d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01cb, code lost:
        r12 = com.whatsapp.R.color.f5nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01ce, code lost:
        if (r0 != 4) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01d0, code lost:
        r12 = com.whatsapp.R.color.f5nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01d3, code lost:
        r9 = new X.AnonymousClass54F(r8, 13);
        r7 = null;
        r6 = com.whatsapp.R.string.f11nameremoved;
        r5 = com.whatsapp.R.id.pickfiletype_payment_holder;
        r18 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01e3, code lost:
        r3 = X.C18280x3.A0D(r8);
        r1 = r8.A0Y;
        r0 = com.whatsapp.R.layout.f8nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01ec, code lost:
        if (r1 == false) goto L_0x01f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01ee, code lost:
        r0 = com.whatsapp.R.layout.f8nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01f1, code lost:
        r11 = X.AnonymousClass001.A0R(r3, r20, r0);
        r3 = X.AnonymousClass0x9.A0E(r11, com.whatsapp.R.id.icon);
        r17 = X.C18300x5.A0G(r11, com.whatsapp.R.id.text);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0205, code lost:
        if (r18 == false) goto L_0x02eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0207, code lost:
        r14 = getResources().getDimensionPixelSize(com.whatsapp.R.dimen.f6nameremoved);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0214, code lost:
        if (r8.A0Y != false) goto L_0x02a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0216, code lost:
        r1 = X.C86624Kv.A02(r8, r13);
        r15 = X.C86624Kv.A02(r8, r2);
        r1 = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[]{r1, r15});
        r1.setShape(1);
        r1.setGradientType(2);
        r1.setGradientCenter(-1.0f, 0.5f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x023b, code lost:
        if (r14 <= 0) goto L_0x0240;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x023d, code lost:
        r1.setSize(r14, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0240, code lost:
        if (r18 == false) goto L_0x026e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0246, code lost:
        if (android.os.Build.VERSION.SDK_INT < 23) goto L_0x026e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0248, code lost:
        r13 = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.RectShape());
        r13.getPaint().setColor(r15);
        r1 = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{r1, r13});
        r0 = r14 / 4;
        r1.setLayerSize(1, r0, r0);
        r1.setLayerGravity(1, 17);
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x026e, code lost:
        r0 = X.C107335b8.A06(getContext(), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0276, code lost:
        r3.setBackground(r0);
        r3.setImageDrawable(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x027e, code lost:
        if (r8.A0Y == false) goto L_0x0287;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0280, code lost:
        r3.setColorFilter(X.C86624Kv.A02(r8, r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0287, code lost:
        X.AnonymousClass0YY.A06(r3, 2);
        r17.setText(r6);
        r11.setId(r5);
        r3.setOnClickListener(r9);
        r11.setOnClickListener(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0298, code lost:
        if (r7 == null) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x029a, code lost:
        r3.setOnLongClickListener(r7);
        r11.setOnLongClickListener(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02a0, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02a1, code lost:
        r14 = X.AnonymousClass0Y8.A04(getContext(), com.whatsapp.R.color.f5nameremoved);
        r13 = X.AnonymousClass0Y8.A04(getContext(), com.whatsapp.R.color.f5nameremoved);
        r2 = new android.graphics.drawable.GradientDrawable();
        r2.setColor(r14);
        r2.setShape(0);
        r2.setGradientType(2);
        r2.setGradientCenter(-1.0f, 0.5f);
        r2.setCornerRadius(X.C86664Kz.A01(getResources(), com.whatsapp.R.dimen.f6nameremoved) / 4.0f);
        r2.setStroke(1, r13);
        r0 = X.C107335b8.A06(getContext(), r2);
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View A02(android.widget.LinearLayout r20, java.lang.String r21) {
        /*
            r19 = this;
            r10 = 2
            X.54G r9 = new X.54G
            r8 = r19
            r2 = r21
            r9.<init>(r10, r2, r8)
            X.7zR r7 = new X.7zR
            r7.<init>(r8, r2)
            int r0 = r2.hashCode()
            r1 = 4
            r3 = -1
            switch(r0) {
                case -1367751899: goto L_0x02f8;
                case -1275762953: goto L_0x02ee;
                case -786681338: goto L_0x0173;
                case -309474065: goto L_0x0168;
                case -196315310: goto L_0x0136;
                case 3446719: goto L_0x010f;
                case 3529462: goto L_0x0105;
                case 93166550: goto L_0x00e8;
                case 96891546: goto L_0x00cb;
                case 106006350: goto L_0x00bf;
                case 861720859: goto L_0x0097;
                case 951526432: goto L_0x007a;
                case 1901043637: goto L_0x006f;
                default: goto L_0x0018;
            }
        L_0x0018:
            r11 = 0
            switch(r3) {
                case 0: goto L_0x0053;
                case 1: goto L_0x030f;
                case 2: goto L_0x017d;
                case 3: goto L_0x002b;
                case 4: goto L_0x0140;
                case 5: goto L_0x0119;
                case 6: goto L_0x0303;
                case 7: goto L_0x00f2;
                case 8: goto L_0x00d5;
                case 9: goto L_0x002b;
                case 10: goto L_0x00a1;
                case 11: goto L_0x0083;
                case 12: goto L_0x002c;
                default: goto L_0x001c;
            }
        L_0x001c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ConversationAttachmentContentHelper Icon not mapped properly "
            r1.append(r0)
            r1.append(r2)
            X.C18270x1.A0z(r1)
        L_0x002b:
            return r11
        L_0x002c:
            X.8y5 r0 = r8.A0U
            X.8Jm r0 = (X.C172068Jm) r0
            X.66R r0 = r0.A03
            boolean r0 = X.C18270x1.A1V(r0)
            if (r0 == 0) goto L_0x002b
            boolean r0 = r8.A0a
            r1 = 2131231862(0x7f080476, float:1.8079817E38)
            if (r0 == 0) goto L_0x0042
            r1 = 2131231863(0x7f080477, float:1.807982E38)
        L_0x0042:
            r13 = 2131099732(0x7f060054, float:1.7811826E38)
            r2 = 2131099733(0x7f060055, float:1.7811828E38)
            r12 = 2131099734(0x7f060056, float:1.781183E38)
            r6 = 2131892299(0x7f12184b, float:1.9419342E38)
            r5 = 2131432428(0x7f0b13ec, float:1.8486613E38)
            goto L_0x0132
        L_0x0053:
            X.8y5 r0 = r8.A0U
            boolean r0 = r0.BFD()
            if (r0 == 0) goto L_0x002b
            r1 = 2131231848(0x7f080468, float:1.8079789E38)
            r13 = 2131099720(0x7f060048, float:1.7811801E38)
            r2 = 2131099721(0x7f060049, float:1.7811803E38)
            r12 = 2131099722(0x7f06004a, float:1.7811805E38)
            r6 = 2131886471(0x7f120187, float:1.9407522E38)
            r5 = 2131432423(0x7f0b13e7, float:1.8486603E38)
            goto L_0x015d
        L_0x006f:
            java.lang.String r0 = "location"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0018
            r3 = 12
            goto L_0x0018
        L_0x007a:
            java.lang.String r0 = "contact"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0083
            goto L_0x0018
        L_0x0083:
            r1 = 2131231850(0x7f08046a, float:1.8079793E38)
            r13 = 2131099723(0x7f06004b, float:1.7811807E38)
            r2 = 2131099724(0x7f06004c, float:1.781181E38)
            r12 = 2131099725(0x7f06004d, float:1.7811811E38)
            r6 = 2131886472(0x7f120188, float:1.9407524E38)
            r5 = 2131432424(0x7f0b13e8, float:1.8486605E38)
            goto L_0x0132
        L_0x0097:
            java.lang.String r0 = "document"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00a1
            goto L_0x0018
        L_0x00a1:
            boolean r0 = r8.A0Y
            if (r0 != 0) goto L_0x00ac
            boolean r0 = r8.A0a
            r1 = 2131231852(0x7f08046c, float:1.8079797E38)
            if (r0 == 0) goto L_0x00af
        L_0x00ac:
            r1 = 2131231853(0x7f08046d, float:1.8079799E38)
        L_0x00af:
            r13 = 2131099726(0x7f06004e, float:1.7811813E38)
            r2 = 2131099727(0x7f06004f, float:1.7811815E38)
            r12 = 2131099728(0x7f060050, float:1.7811817E38)
            r6 = 2131886473(0x7f120189, float:1.9407526E38)
            r5 = 2131432425(0x7f0b13e9, float:1.8486607E38)
            goto L_0x0132
        L_0x00bf:
            java.lang.String r0 = "order"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0018
            r3 = 9
            goto L_0x0018
        L_0x00cb:
            java.lang.String r0 = "event"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00d5
            goto L_0x0018
        L_0x00d5:
            r1 = 2131231856(0x7f080470, float:1.8079805E38)
            r13 = 2131099720(0x7f060048, float:1.7811801E38)
            r2 = 2131099721(0x7f060049, float:1.7811803E38)
            r12 = 2131103089(0x7f060d71, float:1.7818634E38)
            r6 = 2131886474(0x7f12018a, float:1.9407528E38)
            r5 = 2131432426(0x7f0b13ea, float:1.848661E38)
            goto L_0x0132
        L_0x00e8:
            java.lang.String r0 = "audio"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00f2
            goto L_0x0018
        L_0x00f2:
            r1 = 2131231846(0x7f080466, float:1.8079785E38)
            r13 = 2131099716(0x7f060044, float:1.7811793E38)
            r2 = 2131099717(0x7f060045, float:1.7811795E38)
            r12 = 2131099718(0x7f060046, float:1.7811797E38)
            r6 = 2131886470(0x7f120186, float:1.940752E38)
            r5 = 2131432422(0x7f0b13e6, float:1.84866E38)
            goto L_0x0132
        L_0x0105:
            java.lang.String r0 = "shop"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0303
            goto L_0x0018
        L_0x010f:
            java.lang.String r0 = "poll"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0119
            goto L_0x0018
        L_0x0119:
            boolean r0 = r8.A0Y
            r1 = 2131231869(0x7f08047d, float:1.8079831E38)
            if (r0 == 0) goto L_0x0123
            r1 = 2131231870(0x7f08047e, float:1.8079833E38)
        L_0x0123:
            r13 = 2131099747(0x7f060063, float:1.7811856E38)
            r2 = 2131099748(0x7f060064, float:1.7811858E38)
            r12 = 2131099749(0x7f060065, float:1.781186E38)
            r6 = 2131886477(0x7f12018d, float:1.9407534E38)
            r5 = 2131432431(0x7f0b13ef, float:1.848662E38)
        L_0x0132:
            r18 = 0
            r7 = 0
            goto L_0x015f
        L_0x0136:
            java.lang.String r0 = "gallery"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0140
            goto L_0x0018
        L_0x0140:
            boolean r0 = r8.A0Y
            if (r0 != 0) goto L_0x014b
            boolean r0 = r8.A0a
            r1 = 2131231858(0x7f080472, float:1.8079809E38)
            if (r0 == 0) goto L_0x014e
        L_0x014b:
            r1 = 2131231859(0x7f080473, float:1.807981E38)
        L_0x014e:
            r13 = 2131099729(0x7f060051, float:1.781182E38)
            r2 = 2131099730(0x7f060052, float:1.7811821E38)
            r12 = 2131099731(0x7f060053, float:1.7811823E38)
            r6 = 2131886476(0x7f12018c, float:1.9407532E38)
            r5 = 2131432427(0x7f0b13eb, float:1.8486611E38)
        L_0x015d:
            r18 = 1
        L_0x015f:
            android.content.res.Resources r0 = X.C18290x4.A0G(r8)
            android.graphics.drawable.Drawable r4 = r0.getDrawable(r1)
            goto L_0x01e3
        L_0x0168:
            java.lang.String r0 = "product"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0018
            r3 = 3
            goto L_0x0018
        L_0x0173:
            java.lang.String r0 = "payment"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x017d
            goto L_0x0018
        L_0x017d:
            android.content.Context r3 = r8.getContext()
            X.7ae r0 = r8.A0P
            X.4Fi r2 = r0.A01()
            X.C626936e.A06(r2)
            X.1S3 r2 = (X.AnonymousClass1S3) r2
            r0 = 0
            java.lang.CharSequence r6 = r2.B6J(r3, r0)
            r0 = 2131296259(0x7f090003, float:1.821043E38)
            android.graphics.Typeface r5 = X.C06400Xn.A02(r3, r0)
            android.content.res.Resources r2 = r8.getResources()
            r0 = 2131103185(0x7f060dd1, float:1.781883E38)
            int r3 = r2.getColor(r0)
            android.content.res.Resources r2 = r8.getResources()
            r0 = 2131165327(0x7f07008f, float:1.7944868E38)
            int r0 = r2.getDimensionPixelSize(r0)
            X.4Lm r4 = new X.4Lm
            r4.<init>(r5, r6, r3, r0)
            int r0 = r8.A06
            if (r0 == r10) goto L_0x01bc
            r13 = 2131099741(0x7f06005d, float:1.7811844E38)
            if (r0 != r1) goto L_0x01bf
        L_0x01bc:
            r13 = 2131099739(0x7f06005b, float:1.781184E38)
        L_0x01bf:
            if (r0 == r10) goto L_0x01c6
            r2 = 2131099742(0x7f06005e, float:1.7811846E38)
            if (r0 != r1) goto L_0x01c9
        L_0x01c6:
            r2 = 2131099740(0x7f06005c, float:1.7811842E38)
        L_0x01c9:
            if (r0 == r10) goto L_0x01d0
            r12 = 2131099742(0x7f06005e, float:1.7811846E38)
            if (r0 != r1) goto L_0x01d3
        L_0x01d0:
            r12 = 2131099738(0x7f06005a, float:1.7811838E38)
        L_0x01d3:
            r0 = 13
            X.54F r9 = new X.54F
            r9.<init>(r8, r0)
            r7 = 0
            r6 = 2131891688(0x7f1215e8, float:1.9418103E38)
            r5 = 2131432430(0x7f0b13ee, float:1.8486617E38)
            r18 = 0
        L_0x01e3:
            android.view.LayoutInflater r3 = X.C18280x3.A0D(r8)
            boolean r1 = r8.A0Y
            r0 = 2131624474(0x7f0e021a, float:1.8876129E38)
            if (r1 == 0) goto L_0x01f1
            r0 = 2131624476(0x7f0e021c, float:1.8876133E38)
        L_0x01f1:
            r1 = r20
            android.view.View r11 = X.AnonymousClass001.A0R(r3, r1, r0)
            r0 = 2131430651(0x7f0b0cfb, float:1.848301E38)
            android.widget.ImageView r3 = X.AnonymousClass0x9.A0E(r11, r0)
            r0 = 2131434200(0x7f0b1ad8, float:1.8490207E38)
            android.widget.TextView r17 = X.C18300x5.A0G(r11, r0)
            if (r18 == 0) goto L_0x02eb
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131165319(0x7f070087, float:1.7944852E38)
            int r14 = r1.getDimensionPixelSize(r0)
        L_0x0212:
            boolean r0 = r8.A0Y
            if (r0 != 0) goto L_0x02a1
            int r1 = X.C86624Kv.A02(r8, r13)
            int r15 = X.C86624Kv.A02(r8, r2)
            android.graphics.drawable.GradientDrawable$Orientation r13 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            int[] r0 = new int[r10]
            r16 = 0
            r0[r16] = r1
            r2 = 1
            r0[r2] = r15
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            r1.<init>(r13, r0)
            r1.setShape(r2)
            r1.setGradientType(r10)
            r13 = 1056964608(0x3f000000, float:0.5)
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.setGradientCenter(r0, r13)
            if (r14 <= 0) goto L_0x0240
            r1.setSize(r14, r14)
        L_0x0240:
            if (r18 == 0) goto L_0x026e
            int r13 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r13 < r0) goto L_0x026e
            android.graphics.drawable.shapes.RectShape r0 = new android.graphics.drawable.shapes.RectShape
            r0.<init>()
            android.graphics.drawable.ShapeDrawable r13 = new android.graphics.drawable.ShapeDrawable
            r13.<init>(r0)
            android.graphics.Paint r0 = r13.getPaint()
            r0.setColor(r15)
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[r10]
            r0[r16] = r1
            r0[r2] = r13
            android.graphics.drawable.LayerDrawable r1 = new android.graphics.drawable.LayerDrawable
            r1.<init>(r0)
            int r0 = r14 / 4
            r1.setLayerSize(r2, r0, r0)
            r0 = 17
            r1.setLayerGravity(r2, r0)
        L_0x026e:
            android.content.Context r0 = r8.getContext()
            android.graphics.drawable.Drawable r0 = X.C107335b8.A06(r0, r1)
        L_0x0276:
            r3.setBackground(r0)
            r3.setImageDrawable(r4)
            boolean r0 = r8.A0Y
            if (r0 == 0) goto L_0x0287
            int r0 = X.C86624Kv.A02(r8, r12)
            r3.setColorFilter(r0)
        L_0x0287:
            X.AnonymousClass0YY.A06(r3, r10)
            r0 = r17
            r0.setText(r6)
            r11.setId(r5)
            r3.setOnClickListener(r9)
            r11.setOnClickListener(r9)
            if (r7 == 0) goto L_0x002b
            r3.setOnLongClickListener(r7)
            r11.setOnLongClickListener(r7)
            return r11
        L_0x02a1:
            android.content.Context r1 = r8.getContext()
            r0 = 2131099719(0x7f060047, float:1.78118E38)
            int r14 = X.AnonymousClass0Y8.A04(r1, r0)
            android.content.Context r1 = r8.getContext()
            r0 = 2131099756(0x7f06006c, float:1.7811874E38)
            int r13 = X.AnonymousClass0Y8.A04(r1, r0)
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            r2.setColor(r14)
            r0 = 0
            r2.setShape(r0)
            r2.setGradientType(r10)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1056964608(0x3f000000, float:0.5)
            r2.setGradientCenter(r1, r0)
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131165319(0x7f070087, float:1.7944852E38)
            float r1 = X.C86664Kz.A01(r1, r0)
            r0 = 1082130432(0x40800000, float:4.0)
            float r1 = r1 / r0
            r2.setCornerRadius(r1)
            r0 = 1
            r2.setStroke(r0, r13)
            android.content.Context r0 = r8.getContext()
            android.graphics.drawable.Drawable r0 = X.C107335b8.A06(r0, r2)
            goto L_0x0276
        L_0x02eb:
            r14 = 0
            goto L_0x0212
        L_0x02ee:
            java.lang.String r0 = "quick reply"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x030f
            goto L_0x0018
        L_0x02f8:
            java.lang.String r0 = "camera"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0018
            r3 = 0
            goto L_0x0018
        L_0x0303:
            X.5rC r0 = r8.A0A
            r0.A04()
            java.lang.String r0 = "getAttachShopIconId"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x030f:
            X.5rC r0 = r8.A0A
            r0.A04()
            java.lang.String r0 = "getAttachQuickReplyIconId"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.ConversationAttachmentContentView.A02(android.widget.LinearLayout, java.lang.String):android.view.View");
    }

    public void A08(int i, boolean z) {
        int[] iArr;
        long j;
        int[][] iArr2 = new int[3][];
        int[] iArr3 = {6, 0, 0, 0};
        if (z) {
            // fill-array-data instruction
            iArr3[0] = 2;
            iArr3[1] = 3;
            iArr3[2] = 6;
            iArr3[3] = 8;
            iArr2[0] = iArr3;
            iArr2[1] = new int[]{3, 6, 0, 0};
            iArr = new int[]{6, 0, 0, 0};
        } else {
            iArr2[0] = iArr3;
            iArr2[1] = new int[]{3, 6, 0, 0};
            iArr = new int[]{2, 3, 6, 8};
        }
        iArr2[2] = iArr;
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator A0u = AnonymousClass001.A0u(this.A0b);
        while (A0u.hasNext()) {
            A0s.add(AnonymousClass0x2.A0W(A0u));
        }
        int i2 = 0;
        int i3 = 0;
        do {
            int[] iArr4 = iArr2[i2];
            for (int i4 = 0; i4 < iArr4.length; i4++) {
                if (i4 < getNumberOfColumns() && i3 < A0s.size()) {
                    View view = (View) A0s.get(i3);
                    int i5 = iArr4[i4];
                    AnimationSet animationSet = new AnimationSet(true);
                    animationSet.addAnimation(new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, C86634Kw.A00(z ? 1 : 0)));
                    C86644Kx.A19(animationSet, new OvershootInterpolator(1.0f));
                    if (i5 == 0) {
                        j = 0;
                    } else {
                        j = (long) (i / i5);
                    }
                    animationSet.setStartOffset(j);
                    view.startAnimation(animationSet);
                    i3++;
                }
            }
            i2++;
        } while (i2 < 3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0069, code lost:
        if (r0.intValue() < r1) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0D() {
        /*
            r4 = this;
            r3 = 0
            X.1VX r1 = r4.A0N
            r0 = 1394(0x572, float:1.953E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x006c
            X.4uZ r0 = r4.A0O
            boolean r0 = r0 instanceof X.C95804uY
            if (r0 == 0) goto L_0x0031
            X.5HX r2 = r4.A0I
            X.5UP r0 = r2.A00
            X.1VX r1 = r0.A01
            r0 = 5533(0x159d, float:7.753E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x006c
            X.4rH r1 = r2.A01
            r0 = 66
            boolean r0 = r1.A06(r0)
            if (r0 == 0) goto L_0x006c
            r0 = 67
            boolean r0 = r1.A06(r0)
            if (r0 == 0) goto L_0x006c
        L_0x0031:
            X.4uZ r1 = r4.A0O
            boolean r0 = X.C627336j.A0K(r1)
            if (r0 == 0) goto L_0x0072
            X.2ss r0 = r4.A0M
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            int r1 = r0.A06(r1)
            r0 = 3
            if (r1 != r0) goto L_0x006b
            X.1VX r1 = r4.A0N
            r0 = 2738(0xab2, float:3.837E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0072
            X.1VX r1 = r4.A0N
            r0 = 5056(0x13c0, float:7.085E-42)
            int r1 = r1.A0N(r0)
            r0 = -1
            if (r1 == r0) goto L_0x006b
            com.whatsapp.community.ConversationCommunityViewModel r0 = r4.A0E
            android.util.Pair r0 = r0.A00
            if (r0 == 0) goto L_0x006d
            java.lang.Object r0 = r0.second
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0072
            int r0 = r0.intValue()
            if (r0 >= r1) goto L_0x0072
        L_0x006b:
            r3 = 1
        L_0x006c:
            return r3
        L_0x006d:
            java.lang.String r0 = "conversationCommunityViewModel/missing-cag-participant-count"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0072:
            X.4uZ r1 = r4.A0O
            boolean r0 = X.C627336j.A0K(r1)
            if (r0 != 0) goto L_0x006c
            boolean r0 = r1 instanceof X.AnonymousClass1fS
            if (r0 != 0) goto L_0x006c
            boolean r0 = r4.A0X
            if (r0 == 0) goto L_0x008c
            X.1VX r1 = r4.A0N
            r0 = 2663(0xa67, float:3.732E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x006c
        L_0x008c:
            X.1VX r1 = r4.A0N
            r0 = 2194(0x892, float:3.074E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x006c
            goto L_0x006b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.ConversationAttachmentContentView.A0D():boolean");
    }

    private String getCommerceAttachmentType() {
        return "product";
    }

    private Drawable getCurrencyDrawable() {
        C161357pU A022 = this.A0P.A02();
        Context context = getContext();
        int A002 = C195219Wq.A00(A022);
        if (A002 != 0) {
            return AnonymousClass0RP.A00(context, A002);
        }
        return null;
    }

    private int getIconSize() {
        boolean z = this.A0Y;
        Resources resources = getResources();
        int i = R.dimen.f6nameremoved;
        if (z) {
            i = R.dimen.f6nameremoved;
        }
        return resources.getDimensionPixelSize(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        if (r1 != false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a8, code lost:
        if (r2 != false) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A03() {
        /*
            r6 = this;
            boolean r0 = r6.A0Y
            if (r0 == 0) goto L_0x0058
            boolean r0 = r6.A0Z
            if (r0 != 0) goto L_0x0058
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            boolean r4 = r6.A0C()
            boolean r2 = r6.A0D()
            boolean r1 = r6.A0B()
            java.lang.String r0 = "gallery"
            r3.add(r0)
            java.lang.String r0 = "camera"
            r3.add(r0)
            X.4uZ r0 = r6.A0O
            boolean r0 = r0 instanceof X.C95804uY
            if (r0 != 0) goto L_0x0037
            java.lang.String r0 = "location"
            r3.add(r0)
            java.lang.String r0 = "contact"
            r3.add(r0)
            java.lang.String r0 = "document"
            r3.add(r0)
        L_0x0037:
            boolean r0 = r6.A0A()
            if (r0 == 0) goto L_0x0042
            java.lang.String r0 = "audio"
            r3.add(r0)
        L_0x0042:
            if (r2 == 0) goto L_0x0049
            java.lang.String r0 = "poll"
            r3.add(r0)
        L_0x0049:
            if (r4 == 0) goto L_0x0050
            java.lang.String r0 = "payment"
            r3.add(r0)
        L_0x0050:
            if (r1 == 0) goto L_0x0057
        L_0x0052:
            java.lang.String r0 = "event"
            r3.add(r0)
        L_0x0057:
            return r3
        L_0x0058:
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            boolean r5 = r6.A0C()
            boolean r4 = r6.A0D()
            boolean r2 = r6.A0B()
            X.4uZ r0 = r6.A0O
            boolean r0 = r0 instanceof X.C95804uY
            if (r0 != 0) goto L_0x0073
            java.lang.String r0 = "document"
            r3.add(r0)
        L_0x0073:
            java.lang.String r0 = "camera"
            r3.add(r0)
            java.lang.String r0 = "gallery"
            r3.add(r0)
            boolean r0 = r6.A0A()
            if (r0 == 0) goto L_0x0088
            java.lang.String r0 = "audio"
            r3.add(r0)
        L_0x0088:
            X.4uZ r0 = r6.A0O
            boolean r1 = r0 instanceof X.C95804uY
            if (r1 != 0) goto L_0x0093
            java.lang.String r0 = "location"
            r3.add(r0)
        L_0x0093:
            if (r5 == 0) goto L_0x009a
            java.lang.String r0 = "payment"
            r3.add(r0)
        L_0x009a:
            if (r1 != 0) goto L_0x00a1
            java.lang.String r0 = "contact"
            r3.add(r0)
        L_0x00a1:
            if (r4 == 0) goto L_0x00a8
            java.lang.String r0 = "poll"
            r3.add(r0)
        L_0x00a8:
            if (r2 == 0) goto L_0x0057
            goto L_0x0052
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.ConversationAttachmentContentView.A03():java.util.List");
    }

    public void A04() {
        int numberOfColumns;
        this.A09.removeAllViews();
        LinkedHashMap linkedHashMap = this.A0b;
        linkedHashMap.clear();
        List A032 = A03();
        if (this.A0Y) {
            numberOfColumns = getColumnsCountV2();
        } else {
            numberOfColumns = getNumberOfColumns();
        }
        Iterator it = A032.iterator();
        LinearLayout linearLayout = null;
        int i = 0;
        while (it.hasNext()) {
            String A0m = AnonymousClass001.A0m(it);
            if (i % numberOfColumns == 0) {
                linearLayout = (LinearLayout) C18280x3.A0D(this).inflate(R.layout.f8nameremoved, this.A09, false);
                C86614Ku.A1I(this.A09, this, 0, this.A03);
                this.A09.addView(linearLayout);
            }
            View A022 = A02(linearLayout, A0m);
            if (A022 != null) {
                linkedHashMap.put(A0m, A022);
                linearLayout.addView(A022);
                i++;
            }
        }
        C86614Ku.A1I(this.A09, this, 0, this.A00);
        this.A0H.A04(this.A0O);
    }

    public void A05() {
        C94824ry r2;
        Integer num;
        AnonymousClass5U6 r3 = this.A0H;
        if (r3.A04.A0X(2914) && (r2 = r3.A01) != null && (num = r2.A02) != null && num.intValue() == 1) {
            r2.A01 = C18290x4.A0a();
            r3.A01();
            r3.A00();
        }
    }

    public void A06() {
        if (!this.A0W) {
            this.A0W = true;
            C88864av r2 = (C88864av) ((C111685iW) generatedComponent());
            C64333Db r1 = r2.A0K;
            this.A0N = C86604Kt.A0Y(r1);
            this.A0B = C86614Ku.A0K(r1);
            this.A0C = C86614Ku.A0L(r1);
            this.A0M = C86614Ku.A0X(r1);
            this.A0A = C88744aj.A00;
            this.A0T = C86624Kv.A0W(r1);
            this.A0S = C86644Kx.A0Z(r1);
            this.A0J = (C620633i) r1.AYG.get();
            this.A0U = C86614Ku.A0n(r1);
            this.A0F = C86604Kt.A0P(r1);
            this.A0L = C86604Kt.A0W(r1);
            this.A0K = C86614Ku.A0W(r1);
            this.A0Q = C86614Ku.A0e(r1);
            this.A0P = (C153087ae) r1.AQ7.get();
            this.A0R = r2.A0I.ACq();
            this.A0D = (AnonymousClass5LJ) r1.A00.A2i.get();
            this.A0H = (AnonymousClass5U6) r1.A00.A2h.get();
            this.A0I = (AnonymousClass5HX) r1.A00.A7z.get();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0032, code lost:
        if (r1.A0X(3223) == false) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09(com.whatsapp.community.ConversationCommunityViewModel r15, X.C89894fS r16, X.C95814uZ r17, boolean r18) {
        /*
            r14 = this;
            r0 = r17
            r14.A0O = r0
            r0 = r16
            r14.A0G = r0
            r14.A0E = r15
            r0 = r18
            r14.A0X = r0
            X.1VX r0 = r14.A0N
            r3 = 0
            X.C162457s7.A0J(r0, r3)
            r2 = 3223(0xc97, float:4.516E-42)
            boolean r0 = r0.A0X(r2)
            r14.A0Y = r0
            boolean r0 = X.C1001059l.A04
            r14.A0a = r0
            X.1VX r1 = r14.A0N
            X.C162457s7.A0J(r1, r3)
            r0 = 5896(0x1708, float:8.262E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0034
            boolean r1 = r1.A0X(r2)
            r0 = 1
            if (r1 != 0) goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            r14.A0Z = r0
            boolean r0 = r14.A0Y
            if (r0 == 0) goto L_0x00f4
            android.widget.LinearLayout r0 = r14.A09
            r0.removeAllViews()
            java.util.LinkedHashMap r8 = r14.A0b
            r8.clear()
            android.content.Context r0 = r14.getContext()
            X.6hE r6 = new X.6hE
            r6.<init>(r0, r14)
            r6.A01 = r3
            r6.A00 = r3
            android.widget.LinearLayout r0 = r14.A09
            r0.addView(r6)
            java.util.List r12 = r14.A03()
            int r7 = r14.getColumnsCountV2()
            int r0 = r12.size()
            double r4 = (double) r0
            double r0 = (double) r7
            double r4 = r4 / r0
            double r0 = java.lang.Math.ceil(r4)
            int r4 = (int) r0
            android.content.res.Resources r2 = r14.getResources()
            r1 = 2
            r0 = 2131165322(0x7f07008a, float:1.7944858E38)
            if (r4 <= r1) goto L_0x0078
            r0 = 2131165325(0x7f07008d, float:1.7944864E38)
        L_0x0078:
            int r11 = r2.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r14.getResources()
            r9 = 3
            r0 = 2131165321(0x7f070089, float:1.7944856E38)
            if (r7 <= r9) goto L_0x0089
            r0 = 2131165323(0x7f07008b, float:1.794486E38)
        L_0x0089:
            int r10 = r1.getDimensionPixelSize(r0)
            java.util.Iterator r13 = r12.iterator()
            r1 = 0
            r12 = 0
        L_0x0093:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00cf
            java.lang.String r5 = X.AnonymousClass001.A0m(r13)
            int r0 = r12 % r7
            if (r0 != 0) goto L_0x00cb
            if (r12 == 0) goto L_0x00a8
            android.widget.LinearLayout r0 = r14.A09
            X.C86614Ku.A1I(r0, r14, r3, r11)
        L_0x00a8:
            android.view.LayoutInflater r2 = X.C18280x3.A0D(r14)
            r1 = 2131624473(0x7f0e0219, float:1.8876127E38)
            android.widget.LinearLayout r0 = r14.A09
            android.view.View r1 = r2.inflate(r1, r0, r3)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            android.widget.LinearLayout r0 = r14.A09
            r0.addView(r1)
        L_0x00bc:
            android.view.View r0 = r14.A02(r1, r5)
            if (r0 == 0) goto L_0x0093
            r8.put(r5, r0)
            r1.addView(r0)
            int r12 = r12 + 1
            goto L_0x0093
        L_0x00cb:
            X.C86614Ku.A1I(r1, r14, r10, r3)
            goto L_0x00bc
        L_0x00cf:
            r0 = 2131165330(0x7f070092, float:1.7944874E38)
            r2 = 2131165324(0x7f07008c, float:1.7944862E38)
            if (r4 < r9) goto L_0x00dd
            r0 = 2131165331(0x7f070093, float:1.7944876E38)
            r2 = 2131165331(0x7f070093, float:1.7944876E38)
        L_0x00dd:
            int r0 = X.C86614Ku.A05(r14, r0)
            r6.A00 = r0
            android.widget.LinearLayout r1 = r14.A09
            int r0 = X.C86614Ku.A05(r14, r2)
            X.C86614Ku.A1I(r1, r14, r3, r0)
            X.5U6 r1 = r14.A0H
            X.4uZ r0 = r14.A0O
            r1.A04(r0)
            return
        L_0x00f4:
            r14.A04()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.ConversationAttachmentContentView.A09(com.whatsapp.community.ConversationCommunityViewModel, X.4fS, X.4uZ, boolean):void");
    }

    public final boolean A0A() {
        if (!(this.A0O instanceof C95804uY)) {
            return true;
        }
        AnonymousClass5HX r2 = this.A0I;
        if (!r2.A00.A01.A0X(6505) || !r2.A01.A06((byte) 2)) {
            return false;
        }
        return true;
    }

    public final boolean A0B() {
        C95814uZ r3 = this.A0O;
        if (!C627336j.A0K(r3)) {
            return false;
        }
        int A062 = this.A0M.A06(AnonymousClass34R.A01(r3));
        if ((A062 == 2 || A062 == 6) && this.A0N.A0X(982)) {
            return C56952sp.A0K(this.A0N, 5562, false);
        }
        return false;
    }

    public final boolean A0C() {
        this.A06 = this.A0S.A0C(this.A0O);
        if (!this.A0S.A0o(getContext(), AnonymousClass32Y.A03(this.A0O), this.A06) || this.A0C.A0Y()) {
            return false;
        }
        AnonymousClass1VX r1 = this.A0N;
        C162457s7.A0J(r1, 0);
        r1.A0X(4925);
        return true;
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A0V;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A0V = r0;
        }
        return r0.generatedComponent();
    }

    public int getMinHeightView() {
        return this.A09.getMeasuredHeight();
    }

    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4 = i;
        int i5 = i2;
        super.onMeasure(i4, i5);
        if (this.A08 != getMeasuredHeight()) {
            int measuredHeight = getMeasuredHeight();
            int childCount = this.A09.getChildCount();
            int i6 = this.A02;
            int i7 = i6 / 4;
            int i8 = i6 / 2;
            int i9 = (i6 * 4) / 5;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                if (i11 >= childCount) {
                    break;
                }
                View childAt = this.A09.getChildAt(i11);
                int measuredHeight2 = childAt.getMeasuredHeight();
                if (childAt instanceof C133366hE) {
                    i12++;
                    measuredHeight2 = ((C133366hE) childAt).A00;
                    z = true;
                } else {
                    z = false;
                }
                i13 += measuredHeight2;
                if (i13 <= measuredHeight) {
                    i11++;
                    i14 = measuredHeight2;
                } else if (i11 <= 2) {
                    int i15 = i7 / 2;
                    ((C133366hE) this.A09.getChildAt(0)).A00 = this.A00 / 2;
                    int i16 = childCount - 1;
                    ((C133366hE) this.A09.getChildAt(i16)).A00 = this.A00 / 2;
                    for (int i17 = 1; i17 < i16; i17++) {
                        if (this.A09.getChildAt(i17) instanceof C133366hE) {
                            ((C133366hE) this.A09.getChildAt(i17)).A00 = this.A03 / 2;
                        }
                    }
                    i10 = i15;
                } else {
                    if (!z) {
                        int i18 = (measuredHeight - ((i7 + i13) - measuredHeight2)) / i12;
                        int i19 = (measuredHeight - ((i8 + i13) - measuredHeight2)) / i12;
                        i10 = (measuredHeight - ((i9 + i13) - measuredHeight2)) / i12;
                        if (Math.abs(i19) < Math.abs(i18)) {
                            i18 = i19;
                        }
                        if (Math.abs(i10) >= Math.abs(i18)) {
                            i10 = i18;
                        }
                        if (i11 == childCount - 2) {
                            i3 = ((measuredHeight - (i13 + ((C133366hE) this.A09.getChildAt(i11 + 1)).A00)) - i12) / (i12 + 1);
                        }
                    } else if (i11 == childCount - 1) {
                        i10 = (measuredHeight - i13) / i12;
                    } else {
                        int i20 = ((i11 + 1) - i12) * this.A02;
                        i10 = (measuredHeight - ((i7 + i13) / i12)) - i20;
                        i3 = (measuredHeight - (((i13 - i14) - measuredHeight2) + i9)) - i20;
                    }
                    if (Math.abs(i3) < Math.abs(i10)) {
                        i10 = i3;
                    }
                }
            }
            this.A05 = i10;
            this.A08 = getMeasuredHeight();
            super.onMeasure(i4, i5);
        }
    }

    public ConversationAttachmentContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A06();
        this.A0b = C18320x8.A0r();
        A07();
    }

    private int getColumnsCountV2() {
        Point currentConversationViewSize = getCurrentConversationViewSize();
        int minMarginSize = (currentConversationViewSize.x - getMinMarginSize()) / getIconSize();
        int i = 4;
        if (this.A0Z) {
            i = 3;
        }
        return Math.min(minMarginSize, i);
    }

    private Point getCurrentConversationViewSize() {
        Point B5y;
        Context context = getContext();
        if (!(context instanceof C182178nz) || (B5y = ((C182178nz) context).B5y()) == null) {
            return AnonymousClass5YI.A05(C620633i.A01(context));
        }
        return B5y;
    }

    private int getIconTextViewHeight() {
        CondensedTextView condensedTextView = new CondensedTextView(getContext(), (AttributeSet) null, R.style.f12nameremoved);
        C86614Ku.A1F(condensedTextView, C86614Ku.A0E(this).widthPixels, 1073741824);
        return condensedTextView.getMeasuredHeight();
    }

    private int getMaxMarginSize() {
        return (getResources().getDimensionPixelSize(R.dimen.f6nameremoved) * 2) + getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
    }

    private int getMinMarginSize() {
        int dimensionPixelSize;
        Resources resources = getResources();
        boolean z = this.A0Y;
        int i = R.dimen.f6nameremoved;
        if (z) {
            i = R.dimen.f6nameremoved;
        }
        int dimensionPixelSize2 = resources.getDimensionPixelSize(i);
        if (this.A0Y) {
            dimensionPixelSize = 0;
        } else {
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        }
        return (dimensionPixelSize2 * 2) + dimensionPixelSize;
    }

    private int getNumberOfColumns() {
        Point currentConversationViewSize = getCurrentConversationViewSize();
        int minMarginSize = (currentConversationViewSize.x - getMinMarginSize()) / getIconSize();
        int i = 2;
        if (minMarginSize >= 2) {
            i = Math.max(3, minMarginSize);
        }
        return Math.min(4, i);
    }

    public int A00(View view) {
        Point A052 = AnonymousClass5YI.A05(C620633i.A01(getContext()));
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return Math.max(getMaxMarginSize() + (getIconSize() * getNumberOfColumns()), ((iArr[0] + C86664Kz.A0E(view, 2)) - (A052.x / 2)) * 2);
    }

    public int A01(View view) {
        int ceil = (int) Math.ceil(((double) A03().size()) / ((double) getNumberOfColumns()));
        int A042 = ((this.A02 + this.A01 + this.A04 + this.A05) * ceil) + ((ceil - 1) * this.A03) + (this.A00 * 2) + AnonymousClass5YI.A04(getContext(), 1.0f);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int A092 = C86664Kz.A09(getResources(), R.dimen.f6nameremoved, AnonymousClass4L0.A05(view, iArr[1])) - AnonymousClass5YI.A03(getContext());
        if (A092 >= A042 || A042 - (this.A02 / 2) <= A092) {
            return A042;
        }
        return A092;
    }

    public final void A07() {
        this.A02 = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A01 = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A04 = getIconTextViewHeight();
        this.A00 = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A03 = getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        View.inflate(getContext(), R.layout.f8nameremoved, this);
        this.A09 = C86654Ky.A0N(this, R.id.row_content);
    }

    public int computeVerticalScrollOffset() {
        int computeVerticalScrollOffset = super.computeVerticalScrollOffset();
        int A0D2 = C86664Kz.A0D(this, computeVerticalScrollRange());
        int i = this.A07;
        int i2 = A0D2 - (i * 2);
        if (i <= 0 || i2 <= 0) {
            return computeVerticalScrollOffset;
        }
        return i + ((computeVerticalScrollOffset * i2) / A0D2);
    }

    public void setVerticalScrollbarInset(int i) {
        this.A07 = i;
    }

    public ConversationAttachmentContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A06();
        this.A0b = C18320x8.A0r();
        A07();
    }

    public ConversationAttachmentContentView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A06();
        this.A0b = C18320x8.A0r();
        A07();
    }

    public ConversationAttachmentContentView(Context context) {
        super(context);
        A06();
        this.A0b = C18320x8.A0r();
        A07();
    }

    public ConversationAttachmentContentView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A06();
    }
}
