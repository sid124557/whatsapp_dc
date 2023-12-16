package X;

import com.whatsapp.group.newgroup.NewGroup;
import com.whatsapp.util.Log;

/* renamed from: X.1eB  reason: invalid class name and case insensitive filesystem */
public class C27601eB extends AnonymousClass3P2 {
    public final /* synthetic */ NewGroup A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27601eB(C56612sH r8, C28891hw r9, C66543Lv r10, C66493Lq r11, AnonymousClass2U1 r12, NewGroup newGroup, C56832sd r14) {
        super(r8, r9, r10, r11, r12, r14);
        this.A00 = newGroup;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008e, code lost:
        if (r2.A02.size() != r9.size()) goto L_0x0090;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BdP(X.AnonymousClass2RJ r18, X.C27991fJ r19) {
        /*
            r17 = this;
            r4 = r17
            com.whatsapp.group.newgroup.NewGroup r10 = r4.A00
            java.util.concurrent.atomic.AtomicReference r0 = r10.A0q
            r3 = r19
            r0.set(r3)
            java.io.File r0 = r10.A74()
            if (r0 == 0) goto L_0x0018
            X.3Wi r1 = r10.A05
            r0 = 37
            X.C69263Wi.A04(r1, r4, r3, r0)
        L_0x0018:
            r2 = r18
            super.BdP(r2, r3)
            java.util.Map r8 = r2.A03
            int r0 = r8.size()
            r4 = 0
            if (r0 <= 0) goto L_0x005a
            java.util.ArrayList r13 = X.AnonymousClass001.A0s()
            java.util.ArrayList r14 = X.AnonymousClass001.A0s()
            java.util.Iterator r7 = X.C18280x3.A0i(r8)
            r12 = 0
        L_0x0033:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x009c
            com.whatsapp.jid.Jid r6 = X.AnonymousClass0x7.A0S(r7)
            java.lang.Object r5 = r8.get(r6)
            X.2L3 r5 = (X.AnonymousClass2L3) r5
            if (r5 == 0) goto L_0x0033
            if (r12 != 0) goto L_0x004d
            long r0 = r5.A00
            java.lang.Long r12 = java.lang.Long.valueOf(r0)
        L_0x004d:
            java.lang.String r0 = r6.getRawString()
            r13.add(r0)
            java.lang.String r0 = r5.A01
            r14.add(r0)
            goto L_0x0033
        L_0x005a:
            java.util.ArrayList r9 = r2.A01
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x00b0
            X.1VX r5 = r10.A0D
            r1 = 4136(0x1028, float:5.796E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r5.A0Y(r0, r1)
            if (r0 == 0) goto L_0x00b0
            android.os.Bundle r8 = r10.A03
            if (r8 != 0) goto L_0x0078
            android.os.Bundle r8 = X.AnonymousClass002.A08()
            r10.A03 = r8
        L_0x0078:
            X.1fJ r7 = r2.A00
            java.util.Map r0 = r2.A04
            int r0 = r0.size()
            r6 = 1
            if (r0 != r6) goto L_0x0090
            java.util.Map r0 = r2.A02
            int r5 = r0.size()
            int r1 = r9.size()
            r0 = 1
            if (r5 == r1) goto L_0x0091
        L_0x0090:
            r0 = 0
        L_0x0091:
            android.content.Intent r1 = X.C627736r.A0X(r10, r7, r9, r6, r0)
            java.lang.String r0 = "sms_invite_intent"
            r8.putParcelable(r0, r1)
            goto L_0x00b0
        L_0x009c:
            java.util.Set r1 = r8.keySet()
            java.util.ArrayList r15 = r2.A01
            X.1fJ r11 = r2.A00
            r16 = 1
            android.content.Intent r0 = X.C627736r.A0W(r10, r11, r12, r13, r14, r15, r16)
            android.os.Bundle r0 = com.whatsapp.invites.PromptSendGroupInviteDialogFragment.A00(r0, r1, r4)
            r10.A03 = r0
        L_0x00b0:
            java.lang.String r2 = X.AnonymousClass27F.A00(r10, r2)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x00c9
            android.os.Bundle r1 = r10.A03
            if (r1 != 0) goto L_0x00c4
            android.os.Bundle r1 = X.AnonymousClass002.A08()
            r10.A03 = r1
        L_0x00c4:
            java.lang.String r0 = "error_message"
            r1.putString(r0, r2)
        L_0x00c9:
            android.os.Bundle r0 = r10.A02
            if (r0 == 0) goto L_0x00f9
            android.os.Bundle r2 = r10.A03
            if (r2 != 0) goto L_0x00d7
            android.os.Bundle r2 = X.AnonymousClass002.A08()
            r10.A03 = r2
        L_0x00d7:
            android.os.Bundle r1 = r10.A02
            java.lang.String r0 = "messages_to_forward_bundle"
            r2.putBundle(r0, r1)
            android.os.Bundle r2 = r10.A03
            android.content.Intent r0 = r10.getIntent()
            java.lang.String r1 = "include_captions"
            boolean r0 = r0.getBooleanExtra(r1, r4)
            r2.putBoolean(r1, r0)
            android.os.Bundle r2 = r10.A03
            android.content.Intent r1 = r10.getIntent()
            java.lang.String r0 = "appended_message"
            X.C18310x6.A0z(r1, r2, r0)
        L_0x00f9:
            X.3Wi r1 = r10.A05
            r0 = 35
            X.C69263Wi.A04(r1, r10, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27601eB.BdP(X.2RJ, X.1fJ):void");
    }

    public void Be8() {
        Log.i("newgroup/CreateGroupResponseHandler/onTimeout");
        super.Be8();
        this.A00.A05.A0S(C70003Zm.A00(this, 21));
    }
}
