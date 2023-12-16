package X;

import android.net.Uri;
import com.whatsapp.contact.picker.ContactPickerFragment;
import java.lang.ref.WeakReference;

/* renamed from: X.55f  reason: invalid class name and case insensitive filesystem */
public class C993055f extends AnonymousClass5ZM {
    public final Uri A00;
    public final C66413Li A01;
    public final C105845Wq A02;
    public final AnonymousClass31C A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final WeakReference A07;
    public final boolean A08;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        try {
            this.A03.A08(32000);
            return this.A01.A00(AnonymousClass227.A0D, this.A06);
        } catch (C376223j unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x012d, code lost:
        if (r6.getQueryParameter("src") != null) goto L_0x012f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0C(java.lang.Object r20) {
        /*
            r19 = this;
            r12 = r20
            android.util.Pair r12 = (android.util.Pair) r12
            r2 = r19
            java.lang.ref.WeakReference r0 = r2.A07
            java.lang.Object r1 = r0.get()
            com.whatsapp.contact.picker.ContactPickerFragment r1 = (com.whatsapp.contact.picker.ContactPickerFragment) r1
            if (r1 == 0) goto L_0x0043
            boolean r0 = r1.A16()
            if (r0 == 0) goto L_0x0043
            java.lang.String r5 = r2.A06
            boolean r7 = r2.A08
            X.5Wq r10 = r2.A02
            java.lang.String r11 = r2.A05
            java.lang.String r9 = r2.A04
            android.net.Uri r6 = r2.A00
            r3 = 0
            r1.A1C = r3
            r4 = 1
            r2 = 0
            if (r12 != 0) goto L_0x0044
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "handledeeplink/message-handler/disconnected/"
        L_0x002f:
            X.C18260x0.A0t(r0, r5, r3)
            X.5hx r7 = r1.A19
            r6 = 2131888650(0x7f120a0a, float:1.9411941E38)
        L_0x0037:
            java.lang.Object[] r3 = new java.lang.Object[r4]
            r3[r2] = r5
        L_0x003b:
            r7.Box(r3, r2, r6)
        L_0x003e:
            X.5hx r0 = r1.A19
            r0.BjL()
        L_0x0043:
            return
        L_0x0044:
            java.lang.Object r0 = r12.first
            X.304 r0 = (X.AnonymousClass304) r0
            int r8 = r0.A00
            r0 = 3
            if (r8 == r0) goto L_0x0081
            r0 = 2
            if (r8 == r0) goto L_0x0081
            if (r8 != 0) goto L_0x0061
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "handledeeplink/existencesync/network-unavailable/"
            X.C18260x0.A0t(r0, r5, r3)
            X.5hx r7 = r1.A19
            r6 = 2131888648(0x7f120a08, float:1.9411937E38)
            goto L_0x0037
        L_0x0061:
            r0 = 4
            if (r8 != r0) goto L_0x006b
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "handledeeplink/existencesync/failed/try-again-later/"
            goto L_0x002f
        L_0x006b:
            if (r8 != r4) goto L_0x0077
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "handledeeplink/existencesync/exisitng request ongoing/"
        L_0x0073:
            X.C18260x0.A0t(r0, r5, r2)
            goto L_0x003e
        L_0x0077:
            r0 = 6
            if (r8 != r0) goto L_0x003e
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "handledeeplink/existencesync/exception-occurred/"
            goto L_0x0073
        L_0x0081:
            java.lang.Object r5 = r12.second
            X.2UJ r5 = (X.AnonymousClass2UJ) r5
            boolean r8 = X.AnonymousClass000.A1W(r5)
            java.lang.String r0 = "deeplink: user is null"
            X.C626936e.A0D(r8, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 != 0) goto L_0x01a6
            r1.A2t = r11
            r1.A2s = r9
        L_0x0098:
            java.lang.String r0 = "messenger"
            boolean r8 = r0.equals(r9)
            java.lang.String r0 = "source"
            if (r8 == 0) goto L_0x00aa
            android.os.Bundle r11 = r1.A1K()
            r9 = 6
            r11.putInt(r0, r9)
        L_0x00aa:
            int r9 = r5.A04
            if (r9 != r4) goto L_0x01fd
            r1.A1b = r10
            com.whatsapp.jid.UserJid r12 = r5.A0D
            X.1Qq r9 = r1.A1Y
            X.2aj r11 = r1.A1a
            java.lang.String r13 = r10.A08
            java.lang.String r14 = r10.A04
            java.lang.String r15 = r1.A2t
            java.util.List r8 = r10.A0A
            r17 = r2
            r18 = r2
            r16 = r8
            X.2e5 r8 = r11.A00(r12, r13, r14, r15, r16, r17, r18)
            r9.A03(r8)
            com.whatsapp.jid.UserJid r11 = r5.A0D
            X.5Wq r8 = r1.A1b
            org.json.JSONObject r10 = r8.A0B
            if (r10 == 0) goto L_0x00df
            if (r11 == 0) goto L_0x00df
            X.1k8 r9 = r1.A1e
            X.2jw r8 = new X.2jw
            r8.<init>(r11, r10)
            r9.A05(r8)
        L_0x00df:
            X.2eG r10 = r1.A1u
            com.whatsapp.jid.UserJid r8 = r5.A0D
            if (r8 == 0) goto L_0x00ef
            X.3Ex r3 = r1.A0w
            boolean r3 = r3.A0l(r8)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
        L_0x00ef:
            java.lang.String r9 = r1.A2r
            r14 = 2
            android.os.Bundle r8 = r1.A1K()
            int r15 = r8.getInt(r0, r4)
            X.2rx r8 = r1.A11
            com.whatsapp.jid.UserJid r4 = r5.A0D
            X.2qS r4 = r8.A01(r4)
            java.lang.Integer r12 = X.AnonymousClass35W.A01(r4)
            r11 = r3
            r13 = r9
            r10.A00(r11, r12, r13, r14, r15)
            com.whatsapp.jid.UserJid r8 = r5.A0D
            android.os.Bundle r3 = r1.A1K()
            int r3 = r3.getInt(r0)
            r0 = 1
            if (r0 != r3) goto L_0x0141
            java.lang.String r11 = "type"
            java.lang.String r0 = r6.getQueryParameter(r11)
            java.lang.String r4 = "custom_url"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x012f
            java.lang.String r0 = "src"
            java.lang.String r3 = r6.getQueryParameter(r0)
            r0 = 1
            if (r3 == 0) goto L_0x0130
        L_0x012f:
            r0 = 0
        L_0x0130:
            r10 = 5
            r9 = 4
            if (r0 == 0) goto L_0x0180
            X.2hA r4 = r1.A1t
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r4.A00(r8, r3, r0)
        L_0x0141:
            com.whatsapp.jid.UserJid r0 = r5.A0D
            X.3ZH r4 = new X.3ZH
            r4.<init>(r0)
            X.4FS r3 = r1.A2c
            r0 = 25
            X.C70203a7.A00(r3, r1, r5, r0)
            com.whatsapp.jid.UserJid r0 = r5.A0D
            boolean r0 = X.C155477ey.A00(r0)
            if (r0 == 0) goto L_0x01ac
            X.8qC r0 = r1.A2k
            java.lang.Object r0 = r0.get()
            X.2m4 r0 = (X.C52802m4) r0
            boolean r0 = r0.A01()
            X.5hx r4 = r1.A19
            android.content.Context r2 = r1.A0G()
            if (r0 == 0) goto L_0x017b
            java.lang.Integer r0 = X.C18290x4.A0a()
            android.content.Intent r3 = X.C627736r.A0p(r2, r0)
        L_0x0173:
            r2 = 1
            X.1FB r0 = r4.A00
            r0.A6T(r3, r2)
            goto L_0x003e
        L_0x017b:
            android.content.Intent r3 = X.C627736r.A03(r2)
            goto L_0x0173
        L_0x0180:
            java.lang.String r0 = r6.getQueryParameter(r11)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0141
            java.lang.String r0 = "src"
            java.lang.String r3 = r6.getQueryParameter(r0)
            java.lang.String r0 = "qr"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0141
            X.2hA r4 = r1.A1t
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r4.A01(r8, r3, r0)
            goto L_0x0141
        L_0x01a6:
            r1.A2t = r3
            r1.A2s = r3
            goto L_0x0098
        L_0x01ac:
            if (r7 != 0) goto L_0x01f8
            com.whatsapp.jid.UserJid r0 = r5.A0D
            boolean r0 = r1.A2H(r0)
            if (r0 != 0) goto L_0x01f8
            android.content.Context r0 = r1.A1D()
            android.content.Intent r4 = X.C627736r.A08(r0, r2)
            com.whatsapp.jid.UserJid r0 = r5.A0D
            java.lang.String r3 = r0.getRawString()
            java.lang.String r0 = "jid"
            r4.putExtra(r0, r3)
            java.lang.String r0 = "skip_preview"
            r4.putExtra(r0, r2)
            java.lang.String r0 = "number_from_url"
            r3 = 1
            r4.putExtra(r0, r3)
            java.lang.String r0 = "text_from_url"
            r4.putExtra(r0, r2)
            java.lang.String r2 = "extra_deep_link_session_id"
            java.lang.String r0 = r1.A2r
            r4.putExtra(r2, r0)
            r1.A1k(r4)
            r0 = 335544320(0x14000000, float:6.4623485E-27)
            r4.addFlags(r0)
            java.lang.String r0 = X.C18310x6.A0n(r1)
            X.AnonymousClass5VI.A00(r4, r0)
            X.5hx r0 = r1.A19
            X.1FB r0 = r0.A00
            r0.A6T(r4, r3)
            goto L_0x003e
        L_0x01f8:
            r1.A1t(r4)
            goto L_0x003e
        L_0x01fd:
            r0 = 2
            if (r9 != r0) goto L_0x024e
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "handledeeplink/existencesync/user/not-wa/"
            r3.append(r0)
            com.whatsapp.jid.UserJid r0 = r5.A0D
            X.C18260x0.A0n(r0, r3)
            com.whatsapp.jid.UserJid r0 = r5.A0D
            X.C626936e.A06(r0)
            java.lang.String r7 = r0.user
            X.1VX r3 = r1.A1x
            r0 = 4691(0x1253, float:6.573E-42)
            boolean r3 = r3.A0X(r0)
            java.lang.String r0 = ""
            if (r3 == 0) goto L_0x023c
            X.5hx r9 = r1.A19
            r13 = 2131888649(0x7f120a09, float:1.941194E38)
            r14 = 2131888170(0x7f12082a, float:1.9410968E38)
            X.5hv r10 = new X.5hv
            r10.<init>(r1, r7, r8)
            java.lang.Object[] r11 = new java.lang.Object[r4]
            java.lang.String r0 = X.AnonymousClass36l.A0C(r0, r7)
            r11[r2] = r0
            r12 = r2
            r9.Bow(r10, r11, r12, r13, r14)
            goto L_0x003e
        L_0x023c:
            X.5hx r6 = r1.A19
            r5 = 2131888649(0x7f120a09, float:1.941194E38)
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r0 = X.AnonymousClass36l.A0C(r0, r7)
            r3[r2] = r0
            r6.Box(r3, r2, r5)
            goto L_0x003e
        L_0x024e:
            r0 = 3
            if (r9 != r0) goto L_0x003e
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "handledeeplink/existencesync/user/invalid/"
            r3.append(r0)
            java.util.List r0 = r5.A0K
            java.lang.String r0 = X.AnonymousClass001.A0n(r0, r2)
            X.C18260x0.A1K(r3, r0)
            X.5hx r7 = r1.A19
            r6 = 2131888644(0x7f120a04, float:1.941193E38)
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.util.List r0 = r5.A0K
            java.lang.Object r0 = r0.get(r2)
            r3[r2] = r0
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C993055f.A0C(java.lang.Object):void");
    }

    public C993055f(Uri uri, ContactPickerFragment contactPickerFragment, C66413Li r4, C105845Wq r5, AnonymousClass31C r6, String str, String str2, String str3, boolean z) {
        this.A07 = AnonymousClass0x9.A14(contactPickerFragment);
        this.A06 = str;
        this.A08 = z;
        this.A02 = r5;
        this.A03 = r6;
        this.A01 = r4;
        this.A05 = str2;
        this.A04 = str3;
        this.A00 = uri;
    }
}
