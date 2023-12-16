package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass0x7;
import X.AnonymousClass1VX;
import X.AnonymousClass4GJ;
import X.AnonymousClass5PN;
import X.AnonymousClass8EA;
import X.AnonymousClass9Tp;
import X.C06560Yg;
import X.C108845de;
import X.C111685iW;
import X.C116855qy;
import X.C18280x3;
import X.C183538qC;
import X.C1907099n;
import X.C195219Wq;
import X.C56422rx;
import X.C56972sr;
import X.C620733j;
import X.C621033m;
import X.C624134x;
import X.C66513Ls;
import X.C88864av;
import X.C95814uZ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class InteractiveMessageButton extends FrameLayout implements AnonymousClass4GJ {
    public C56972sr A00;
    public C621033m A01;
    public C56422rx A02;
    public AnonymousClass5PN A03;
    public C620733j A04;
    public AnonymousClass8EA A05;
    public AnonymousClass1VX A06;
    public C1907099n A07;
    public AnonymousClass9Tp A08;
    public C195219Wq A09;
    public C183538qC A0A;
    public C116855qy A0B;
    public boolean A0C;
    public final TextEmojiLabel A0D;
    public final InteractiveButtonsRowContentLayout A0E;
    public final Set A0F;

    public final void A01(C624134x r11, String str) {
        C624134x r4 = r11;
        C95814uZ r0 = r11.A1J.A00;
        if (r0 != null) {
            this.A01.A0C((C66513Ls) null, (C108845de) null, r4, str, Collections.singletonList(r0), (List) null, false, false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02cd, code lost:
        if (r0 == false) goto L_0x02cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x032a, code lost:
        if (r12 > 0) goto L_0x01d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03fa, code lost:
        if (r12 == false) goto L_0x01d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x051c, code lost:
        if (r1 != 6) goto L_0x051e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x051e, code lost:
        r2.setMessageText(r6, r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0521, code lost:
        if (r7 == null) goto L_0x0562;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x058b, code lost:
        if (r7 != null) goto L_0x0513;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01a6, code lost:
        if (X.AnonymousClass39S.A00(r5.A01) == 4) goto L_0x01a8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x03ef  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0405  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0414  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0423  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x045d  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0493  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x049e  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x052e  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x055e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C08270df r24, X.C93314oJ r25, X.AnonymousClass677 r26, X.C624134x r27) {
        /*
            r23 = this;
            r4 = r27
            boolean r0 = r4 instanceof X.AnonymousClass4DV
            if (r0 == 0) goto L_0x00c1
            r3 = r23
            com.whatsapp.TextEmojiLabel r5 = r3.A0D
            r0 = 8
            r5.setVisibility(r0)
            com.whatsapp.conversation.conversationrow.InteractiveButtonsRowContentLayout r14 = r3.A0E
            r14.setVisibility(r0)
            r11 = r4
            X.4DV r11 = (X.AnonymousClass4DV) r11
            X.39W r7 = r11.B5s()
            r2 = r25
            if (r7 == 0) goto L_0x04f8
            X.39S r0 = r7.A01
            if (r0 == 0) goto L_0x00c2
            int r1 = r7.A00
            r0 = 3
            if (r1 != r0) goto L_0x00c2
            java.lang.String r1 = "review_order"
            java.lang.String r0 = r7.A01()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0166
            r8 = 0
            r14.setVisibility(r8)
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            android.content.Context r1 = r3.getContext()
            r0 = 2131892831(0x7f121a5f, float:1.9420421E38)
            java.lang.String r9 = r1.getString(r0)
            android.content.Context r1 = r3.getContext()
            r0 = 2131890728(0x7f121228, float:1.9416156E38)
            java.lang.String r6 = r1.getString(r0)
            r10 = 0
            X.2dl r1 = X.AnonymousClass2BO.A00
            X.1VX r0 = r3.A06
            boolean r5 = r1.A01(r0)
            android.content.Context r1 = r3.getContext()
            r0 = 2131887775(0x7f12069f, float:1.9410167E38)
            if (r5 == 0) goto L_0x0067
            r0 = 2131887774(0x7f12069e, float:1.9410165E38)
        L_0x0067:
            java.lang.String r12 = r1.getString(r0)
            r1 = 2
            X.90Q r0 = new X.90Q
            r0.<init>(r4, r1, r3)
            r5 = -1
            X.C86644Kx.A1M(r0, r12, r7, r5, r8)
            X.39W r0 = r11.B5s()
            if (r0 == 0) goto L_0x009b
            X.39S r1 = r0.A01
            if (r1 == 0) goto L_0x009b
            X.9Wq r0 = r3.A09
            boolean r0 = r0.A0r(r10, r1)
            if (r0 == 0) goto L_0x009b
            android.content.Context r1 = r3.getContext()
            r0 = 2131887776(0x7f1206a0, float:1.9410169E38)
            java.lang.String r10 = r1.getString(r0)
            r1 = 3
            X.90Q r0 = new X.90Q
            r0.<init>(r4, r1, r3)
            X.C86644Kx.A1M(r0, r10, r7, r5, r8)
        L_0x009b:
            X.2rx r1 = r3.A02
            X.2z0 r0 = r4.A1J
            X.4uZ r0 = r0.A00
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            boolean r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x00ba
            X.90R r0 = new X.90R
            r0.<init>(r3, r4, r9, r8)
            X.C86644Kx.A1M(r0, r9, r7, r5, r8)
            r1 = 1
            X.90R r0 = new X.90R
            r0.<init>(r3, r4, r6, r1)
            X.C86644Kx.A1M(r0, r6, r7, r5, r8)
        L_0x00ba:
            int r0 = r7.size()
            r14.A01(r2, r7, r0)
        L_0x00c1:
            return
        L_0x00c2:
            int r1 = r7.A00
            r0 = 5
            if (r1 != r0) goto L_0x04f8
            X.39P r8 = r7.A03
            if (r8 == 0) goto L_0x00c1
            java.util.List r0 = r8.A03
            java.util.Iterator r9 = r0.iterator()
        L_0x00d1:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0156
            java.lang.Object r1 = r9.next()
            X.395 r1 = (X.AnonymousClass395) r1
            X.8qC r0 = r3.A0A
            java.lang.Object r0 = r0.get()
            X.30C r0 = (X.AnonymousClass30C) r0
            X.398 r6 = r1.A01
            java.lang.String r5 = r6.A00
            java.lang.String r1 = r6.A01
            X.2Vs r0 = r0.A02
            X.2sP r1 = r0.A00(r5, r1)
            if (r1 == 0) goto L_0x00d1
            android.content.Context r0 = r3.getContext()
            java.lang.String r0 = r1.A06(r0, r6)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00d1
        L_0x0101:
            r0 = 0
            r14.setVisibility(r0)
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            r9 = 0
        L_0x010a:
            X.39P r0 = r7.A03
            java.util.List r0 = r0.A03
            int r1 = r0.size()
            X.39P r0 = r7.A03
            if (r9 >= r1) goto L_0x0425
            java.util.List r0 = r0.A03
            java.lang.Object r10 = r0.get(r9)
            X.395 r10 = (X.AnonymousClass395) r10
            X.8qC r0 = r3.A0A
            java.lang.Object r0 = r0.get()
            X.30C r0 = (X.AnonymousClass30C) r0
            X.398 r6 = r10.A01
            java.lang.String r5 = r6.A00
            java.lang.String r1 = r6.A01
            X.2Vs r0 = r0.A02
            X.2sP r1 = r0.A00(r5, r1)
            if (r1 == 0) goto L_0x0153
            if (r9 != 0) goto L_0x0139
            r0 = 1
            r14.A03 = r0
        L_0x0139:
            android.content.Context r0 = r3.getContext()
            java.lang.String r6 = r1.A06(r0, r6)
            boolean r5 = r10.A00
            if (r6 != 0) goto L_0x0147
            java.lang.String r6 = ""
        L_0x0147:
            int r1 = r1.A03()
            X.5kh r0 = new X.5kh
            r0.<init>(r3, r4, r7, r5)
            X.C86644Kx.A1M(r0, r6, r8, r1, r5)
        L_0x0153:
            int r9 = r9 + 1
            goto L_0x010a
        L_0x0156:
            int r1 = r8.A01
            r0 = 2
            if (r1 != r0) goto L_0x00c1
            java.util.List r0 = r8.A04
            if (r0 == 0) goto L_0x00c1
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x00c1
            goto L_0x0101
        L_0x0166:
            X.39S r1 = r7.A01
            r0 = 0
            r14.setVisibility(r0)
            java.util.ArrayList r8 = X.AnonymousClass001.A0s()
            X.2z0 r9 = r4.A1J
            boolean r0 = r9.A02
            if (r0 == 0) goto L_0x01df
            X.9Wq r0 = r3.A09
            boolean r0 = r0.A0l()
            if (r0 == 0) goto L_0x01df
            X.9Wq r0 = r3.A09
            boolean r0 = r0.A0n()
            if (r0 == 0) goto L_0x01df
            X.9Wq r5 = r3.A09
            X.4uZ r0 = r9.A00
            boolean r0 = r5.A0u(r0)
            if (r0 == 0) goto L_0x01df
            r0 = 1
            r14.A03 = r0
            X.39H r5 = r1.A07
            java.lang.String r0 = r5.A01
            int r1 = X.AnonymousClass39S.A00(r0)
            r0 = 3
            if (r1 == r0) goto L_0x01a8
            java.lang.String r0 = r5.A01
            int r5 = X.AnonymousClass39S.A00(r0)
            r1 = 4
            r0 = 1
            if (r5 != r1) goto L_0x01a9
        L_0x01a8:
            r0 = 0
        L_0x01a9:
            r7 = 0
            r6 = -1
            if (r0 == 0) goto L_0x01c2
            android.content.Context r1 = r3.getContext()
            r0 = 2131894653(0x7f12217d, float:1.9424117E38)
            java.lang.String r5 = r1.getString(r0)
            r1 = 11
            X.90Q r0 = new X.90Q
            r0.<init>(r4, r1, r3)
            X.C86644Kx.A1M(r0, r5, r8, r6, r7)
        L_0x01c2:
            android.content.Context r1 = r3.getContext()
            r0 = 2131895062(0x7f122316, float:1.9424946E38)
            java.lang.String r5 = r1.getString(r0)
            r1 = 12
            X.90Q r0 = new X.90Q
            r0.<init>(r4, r1, r3)
            X.C86644Kx.A1M(r0, r5, r8, r6, r7)
        L_0x01d7:
            int r0 = r8.size()
            r14.A01(r2, r8, r0)
            return
        L_0x01df:
            java.lang.String r5 = r1.A03
            java.lang.String r0 = "pending_buyer_confirmation"
            boolean r0 = r0.equals(r5)
            r11 = -1
            r7 = 0
            if (r0 == 0) goto L_0x021e
            android.content.Context r1 = r3.getContext()
            r0 = 2131887778(0x7f1206a2, float:1.9410173E38)
            java.lang.String r5 = r1.getString(r0)
            r0 = 4
            X.90Q r1 = new X.90Q
            r1.<init>(r4, r0, r3)
            X.7Mi r0 = new X.7Mi
            r0.<init>(r1, r5, r11, r7)
            r8.add(r0)
            android.content.Context r1 = r3.getContext()
            r0 = 2131887779(0x7f1206a3, float:1.9410175E38)
            java.lang.String r5 = r1.getString(r0)
            r1 = 5
        L_0x0210:
            X.90Q r0 = new X.90Q
            r0.<init>(r4, r1, r3)
            X.7Mi r1 = new X.7Mi
            r1.<init>(r0, r5, r11, r7)
        L_0x021a:
            r8.add(r1)
            goto L_0x01d7
        L_0x021e:
            java.lang.String r0 = r1.A04
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x032e
            java.lang.String r0 = r1.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x032e
            java.util.List r6 = r1.A0J
            if (r6 == 0) goto L_0x032e
            java.util.HashSet r13 = X.AnonymousClass002.A0K()
            int r0 = r6.size()
            if (r0 <= 0) goto L_0x023f
            X.C18270x1.A1K(r13, r7)
        L_0x023f:
            java.util.List r0 = r1.A0I
            if (r0 == 0) goto L_0x0262
            java.util.Iterator r10 = r0.iterator()
        L_0x0247:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0262
            java.lang.Object r0 = r10.next()
            X.399 r0 = (X.AnonymousClass399) r0
            java.lang.String r5 = "payment_instruction"
            java.lang.String r0 = r0.A01
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0247
            r0 = 2
            X.C18270x1.A1K(r13, r0)
            goto L_0x0247
        L_0x0262:
            java.util.List r5 = r1.A0K
            if (r5 == 0) goto L_0x0293
            int r0 = r5.size()
            if (r0 <= 0) goto L_0x0293
            java.util.Iterator r10 = r5.iterator()
        L_0x0270:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0293
            java.lang.Object r0 = r10.next()
            X.394 r0 = (X.AnonymousClass394) r0
            java.lang.String r5 = r0.A01
            java.lang.String r0 = "pix_static_code"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x028e
            java.lang.String r0 = "pix_dynamic_code"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0270
        L_0x028e:
            r0 = 6
            X.C18270x1.A1K(r13, r0)
            goto L_0x0270
        L_0x0293:
            X.8EA r5 = r3.A05
            X.4uZ r0 = r9.A00
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            X.6hl r12 = r5.A05(r0)
            boolean r0 = X.C86624Kv.A1a(r13, r7)
            if (r0 == 0) goto L_0x0328
            X.99n r5 = r3.A07
            java.lang.String r0 = "pay_with_card_flow_enabled"
            boolean r0 = r5.A0J(r0)
            if (r0 == 0) goto L_0x0328
            android.content.Context r5 = r3.getContext()
            r0 = 2131887770(0x7f12069a, float:1.9410156E38)
            java.lang.String r10 = r5.getString(r0)
            if (r12 == 0) goto L_0x02cf
            java.lang.String r5 = r12.A06
            if (r5 == 0) goto L_0x02cf
            java.lang.String r0 = "active"
            boolean r0 = android.text.TextUtils.equals(r5, r0)
            if (r0 != 0) goto L_0x02cf
            java.lang.String r0 = "cards"
            boolean r0 = r6.contains(r0)
            r6 = 1
            if (r0 != 0) goto L_0x02d0
        L_0x02cf:
            r6 = 0
        L_0x02d0:
            r0 = 6
            X.90Q r5 = new X.90Q
            r5.<init>(r4, r0, r3)
            X.7Mi r0 = new X.7Mi
            r0.<init>(r5, r10, r11, r6)
            r8.add(r0)
            r12 = 1
        L_0x02df:
            java.lang.Integer r0 = X.C18290x4.A0d()
            boolean r0 = r13.contains(r0)
            if (r0 == 0) goto L_0x0311
            X.99n r5 = r3.A07
            java.lang.String r0 = "pay_with_pix_flow_enabled"
            boolean r0 = r5.A0J(r0)
            if (r0 == 0) goto L_0x0311
            int r12 = r12 + 1
            android.content.Context r5 = r3.getContext()
            r0 = 2131887777(0x7f1206a1, float:1.941017E38)
            java.lang.String r10 = r5.getString(r0)
            r6 = 2131231727(0x7f0803ef, float:1.8079543E38)
            r0 = 7
            X.90Q r5 = new X.90Q
            r5.<init>(r4, r0, r3)
            X.7Mi r0 = new X.7Mi
            r0.<init>(r5, r10, r6, r7)
            r8.add(r0)
        L_0x0311:
            int r0 = r13.size()
            if (r0 <= r12) goto L_0x032a
            if (r12 <= 0) goto L_0x032e
            android.content.Context r1 = r3.getContext()
            r0 = 2131887768(0x7f120698, float:1.9410152E38)
            java.lang.String r5 = r1.getString(r0)
            r1 = 8
            goto L_0x0210
        L_0x0328:
            r12 = 0
            goto L_0x02df
        L_0x032a:
            if (r12 <= 0) goto L_0x032e
            goto L_0x01d7
        L_0x032e:
            X.9Tp r0 = r3.A08
            r0.A00()
            java.util.Set r5 = r3.A0F
            X.39H r10 = r1.A07
            java.lang.String r0 = r10.A01
            int r0 = X.AnonymousClass39S.A00(r0)
            boolean r0 = X.C18300x5.A1X(r5, r0)
            if (r0 != 0) goto L_0x0372
            android.content.Context r5 = r3.getContext()
            r0 = 2131887774(0x7f12069e, float:1.9410165E38)
            java.lang.String r13 = r5.getString(r0)
        L_0x034e:
            X.1VX r0 = r3.A06
            boolean r12 = X.C195219Wq.A0A(r0, r1)
            r7 = -1
            r6 = 0
            if (r12 != 0) goto L_0x0367
            r0 = 9
            X.90Q r5 = new X.90Q
            r5.<init>(r4, r0, r3)
            X.7Mi r0 = new X.7Mi
            r0.<init>(r5, r13, r11, r6)
            r8.add(r0)
        L_0x0367:
            X.1VX r5 = r3.A06
            r0 = 1600(0x640, float:2.242E-42)
            java.lang.String r0 = r5.A0Q(r0)
            if (r0 == 0) goto L_0x03ce
            goto L_0x03b9
        L_0x0372:
            X.9Wq r5 = r3.A09
            X.4uZ r0 = r9.A00
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A03(r0)
            boolean r0 = r5.A0v(r0)
            if (r0 == 0) goto L_0x03a8
            X.1VX r5 = r3.A06
            r0 = 5944(0x1738, float:8.33E-42)
            org.json.JSONObject r6 = r5.A0S(r0)
            java.lang.String r5 = "updated_order_cta"
            boolean r0 = r6.has(r5)
            if (r0 == 0) goto L_0x03a4
            int r6 = r6.getInt(r5)     // Catch:{ JSONException -> 0x039e }
            r0 = 1
            if (r6 == r0) goto L_0x03b1
            r0 = 2
            r5 = 2131887767(0x7f120697, float:1.941015E38)
            if (r6 == r0) goto L_0x03b4
            goto L_0x03a4
        L_0x039e:
            r5 = move-exception
            java.lang.String r0 = "failed to parse config for ab prop BR_BUYER_AWARENESS_EXPERIENCES_CODE#updated_order_cta"
            com.whatsapp.util.Log.e(r0, r5)
        L_0x03a4:
            r5 = 2131887765(0x7f120695, float:1.9410146E38)
            goto L_0x03b4
        L_0x03a8:
            r5 = 2131887775(0x7f12069f, float:1.9410167E38)
            X.9Wq r0 = r3.A09
            r0.A0j()
            goto L_0x03b4
        L_0x03b1:
            r5 = 2131887766(0x7f120696, float:1.9410148E38)
        L_0x03b4:
            java.lang.String r13 = X.C86624Kv.A0b(r3, r5)
            goto L_0x034e
        L_0x03b9:
            org.json.JSONObject r5 = X.AnonymousClass0x9.A1H(r0)     // Catch:{ JSONException -> 0x03c4 }
            java.lang.String r0 = "allowed_product_type"
            java.lang.String r11 = r5.getString(r0)     // Catch:{ JSONException -> 0x03c4 }
            goto L_0x03d0
        L_0x03c4:
            r11 = move-exception
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "OrderDetailsQuickPayConfig/init failed to parse config json: "
            X.C18260x0.A16(r0, r5, r11)
        L_0x03ce:
            java.lang.String r11 = "none"
        L_0x03d0:
            java.lang.String r5 = r1.A0G
            java.lang.String r0 = "any"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x03e2
            boolean r0 = r11.equals(r5)
            if (r0 != 0) goto L_0x03e2
            if (r12 == 0) goto L_0x01d7
        L_0x03e2:
            X.4uZ r0 = r9.A00
            r9 = 1
            if (r0 == 0) goto L_0x0423
            X.9Wq r0 = r3.A09
            boolean r0 = r0.A0m()
            if (r0 == 0) goto L_0x0423
            r5 = 1
            X.9Wq r0 = r3.A09
            X.6wO r1 = r0.A0H(r1)
            X.6wO r0 = X.C141946wO.TOS_NONE
            if (r1 == r0) goto L_0x03fc
            if (r12 == 0) goto L_0x01d7
        L_0x03fc:
            android.content.Context r1 = r3.getContext()
            r0 = 2131887772(0x7f12069c, float:1.941016E38)
            if (r5 == 0) goto L_0x0408
            r0 = 2131887769(0x7f120699, float:1.9410154E38)
        L_0x0408:
            java.lang.String r5 = r1.getString(r0)
            java.lang.String r0 = r10.A01
            int r0 = X.AnonymousClass39S.A00(r0)
            if (r0 == r9) goto L_0x0415
            r6 = 1
        L_0x0415:
            r1 = 10
            X.90Q r0 = new X.90Q
            r0.<init>(r4, r1, r3)
            X.7Mi r1 = new X.7Mi
            r1.<init>(r0, r5, r7, r6)
            goto L_0x021a
        L_0x0423:
            r5 = 0
            goto L_0x03fc
        L_0x0425:
            java.lang.String r6 = r0.A02
            if (r6 == 0) goto L_0x043e
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x043e
            org.json.JSONObject r10 = X.AnonymousClass0x9.A1H(r6)     // Catch:{ JSONException -> 0x0434 }
            goto L_0x0442
        L_0x0434:
            r5 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "InteractiveMessageButton/parseNfmMessageParamsJson/invalid json="
            X.C18260x0.A0u(r0, r6, r1, r5)
        L_0x043e:
            org.json.JSONObject r10 = X.AnonymousClass0x9.A1G()
        L_0x0442:
            java.lang.String r0 = "type"
            java.lang.String r6 = r10.optString(r0)
            X.8qC r0 = r3.A0A
            java.lang.Object r5 = r0.get()
            X.30C r5 = (X.AnonymousClass30C) r5
            X.39P r0 = r7.A03
            java.lang.String r1 = r0.A02
            X.2Vs r0 = r5.A02
            X.2sP r1 = r0.A00(r6, r1)
            r6 = 0
            if (r1 == 0) goto L_0x047d
            android.content.Context r0 = r3.getContext()
            java.lang.String r9 = r1.A06(r0, r6)
            X.39P r0 = r7.A03
            X.391 r0 = r0.A00
            if (r0 == 0) goto L_0x04f5
            boolean r5 = r0.A00
        L_0x046d:
            if (r9 != 0) goto L_0x0471
            java.lang.String r9 = ""
        L_0x0471:
            int r1 = r1.A03()
            X.5kh r0 = new X.5kh
            r0.<init>(r3, r4, r7, r5)
            X.C86644Kx.A1M(r0, r9, r8, r1, r5)
        L_0x047d:
            int r0 = r8.size()
            X.5JA r4 = new X.5JA
            r4.<init>(r10, r0)
            int r0 = r4.A00
            r7 = 1
            int r1 = java.lang.Math.max(r0, r7)
            int r0 = r8.size()
            if (r1 >= r0) goto L_0x0495
            int r1 = r1 + -1
        L_0x0495:
            r14.A01(r2, r8, r1)
            int r0 = r8.size()
            if (r1 >= r0) goto L_0x04f1
            com.whatsapp.conversation.conversationrow.NativeFlowMessageButtonBottomSheet r5 = new com.whatsapp.conversation.conversationrow.NativeFlowMessageButtonBottomSheet
            r5.<init>()
            X.5Jn r12 = new X.5Jn
            r15 = r5
            r16 = r4
            r17 = r8
            r13 = r2
            r12.<init>(r13, r14, r15, r16, r17)
            r5.A04 = r12
            java.lang.String r8 = r4.A01
            if (r8 != 0) goto L_0x04bf
            android.content.res.Resources r1 = r14.getResources()
            r0 = 2131893420(0x7f121cac, float:1.9421616E38)
            java.lang.String r8 = r1.getString(r0)
        L_0x04bf:
            r4 = 2131232241(0x7f0805f1, float:1.8080586E38)
            X.90Q r1 = new X.90Q
            r0 = r24
            r1.<init>(r0, r7, r5)
            r0 = 0
            X.7Mi r5 = new X.7Mi
            r5.<init>(r1, r8, r4, r0)
            android.widget.LinearLayout r4 = r14.A07
            r22 = 0
            android.content.Context r1 = r14.getContext()
            r0 = 2131100206(0x7f06022e, float:1.7812787E38)
            android.content.res.ColorStateList r15 = X.AnonymousClass0Y8.A07(r1, r0)
            r20 = r7
            r21 = r7
            r16 = r15
            r18 = r5
            r19 = r7
            r17 = r2
            android.view.View r0 = r14.A00(r15, r16, r17, r18, r19, r20, r21, r22)
            r4.addView(r0)
        L_0x04f1:
            r3.setOnClickListener(r6)
            return
        L_0x04f5:
            r5 = 0
            goto L_0x046d
        L_0x04f8:
            r1 = 0
            r5.setVisibility(r1)
            if (r26 == 0) goto L_0x058e
            boolean r0 = r26.Bor()
            if (r0 == 0) goto L_0x058e
            r3.setVisibility(r1)
            if (r7 == 0) goto L_0x0589
            java.lang.String r0 = r7.A07
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0589
            java.lang.String r6 = r7.A07
        L_0x0513:
            int r1 = r7.A00
            r0 = 2
            if (r1 == r0) goto L_0x057a
            r0 = 4
            if (r1 == r0) goto L_0x0573
            r0 = 6
            if (r1 == r0) goto L_0x057a
        L_0x051e:
            r2.setMessageText(r6, r5, r4)
            if (r7 == 0) goto L_0x0562
        L_0x0523:
            int r1 = r7.A00
            r0 = 2
            if (r1 == r0) goto L_0x055e
            r0 = 4
            if (r1 == r0) goto L_0x055e
            r0 = 6
            if (r1 == r0) goto L_0x055e
            r0 = 3
            if (r1 != r0) goto L_0x0562
            r5.A0E()
            android.content.res.Resources r1 = X.C18290x4.A0G(r3)
            r0 = 2131167345(0x7f070871, float:1.794896E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r3.setMinimumHeight(r0)
        L_0x0542:
            X.C107295b4.A02(r3)
            r1 = 28
            X.5eg r0 = new X.5eg
            r0.<init>(r3, r1, r4)
            r3.setOnClickListener(r0)
            r0 = 1
            r3.setLongClickable(r0)
            r1 = 8
            X.67a r0 = new X.67a
            r0.<init>(r3, r1)
            X.C06560Yg.A0O(r3, r0)
            return
        L_0x055e:
            r5.A0E()
            goto L_0x0542
        L_0x0562:
            X.33j r2 = r3.A04
            android.content.Context r1 = r3.getContext()
            r0 = 2131232241(0x7f0805f1, float:1.8080586E38)
            X.6dx r0 = X.AnonymousClass0x7.A0J(r1, r2, r0)
            r5.A0G(r0)
            goto L_0x0542
        L_0x0573:
            r0 = 2131893842(0x7f121e52, float:1.9422472E38)
            r5.setText(r0)
            goto L_0x0523
        L_0x057a:
            android.content.Context r1 = r3.getContext()
            r0 = 2131892752(0x7f121a10, float:1.9420261E38)
            java.lang.String r0 = r1.getString(r0)
            r2.setMessageText(r0, r5, r4)
            goto L_0x0523
        L_0x0589:
            java.lang.String r6 = ""
            if (r7 == 0) goto L_0x051e
            goto L_0x0513
        L_0x058e:
            r0 = 8
            r3.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.InteractiveMessageButton.A00(X.0df, X.4oJ, X.677, X.34x):void");
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A0B;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A0B = r0;
        }
        return r0.generatedComponent();
    }

    public InteractiveMessageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A0C) {
            this.A0C = true;
            ((C88864av) ((C111685iW) generatedComponent())).A4h(this);
        }
    }

    public InteractiveMessageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A0C) {
            this.A0C = true;
            ((C88864av) ((C111685iW) generatedComponent())).A4h(this);
        }
        Integer[] numArr = new Integer[2];
        AnonymousClass000.A1L(numArr, 1);
        AnonymousClass000.A1P(numArr, 7, 1);
        this.A0F = C18280x3.A0h(numArr);
        LayoutInflater.from(context).inflate(R.layout.f8nameremoved, this, true);
        this.A0D = AnonymousClass0x7.A0K(this, R.id.button_content);
        this.A0E = (InteractiveButtonsRowContentLayout) C06560Yg.A02(this, R.id.buttons_row);
    }

    public InteractiveMessageButton(Context context) {
        this(context, (AttributeSet) null);
    }
}
