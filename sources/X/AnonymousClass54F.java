package X;

import android.content.Intent;
import android.text.Editable;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.contact.picker.ContactPickerFragment;
import java.util.Map;

/* renamed from: X.54F  reason: invalid class name */
public class AnonymousClass54F extends C109665ez {
    public Object A00;
    public final int A01;

    public AnonymousClass54F(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new AnonymousClass54F(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: X.4m6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: X.4m5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v48, resolved type: X.4mx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v59, resolved type: X.4m6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v60, resolved type: X.4m6} */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x051e, code lost:
        r2.A08(r1, true, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0522, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0539, code lost:
        r1.A0F(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x053c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        ((X.C93314oJ) r15.A00).A1N();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x06e7, code lost:
        r3.A05(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x06eb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x09af, code lost:
        com.whatsapp.util.Log.w(r0);
        r4.A0X.A0H(com.whatsapp.R.string.f11nameremoved, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x09ba, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x09d2, code lost:
        r1.putExtra("vcard_message", r3);
        r0 = r4.getContext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x09db, code lost:
        r0.startActivity(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:0x09de, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:0x0a4c, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x0a4f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0148, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x014a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(android.view.View r16) {
        /*
            r15 = this;
            int r0 = r15.A01
            r4 = r16
            switch(r0) {
                case 0: goto L_0x0554;
                case 1: goto L_0x0566;
                case 2: goto L_0x05f8;
                case 3: goto L_0x0624;
                case 4: goto L_0x062c;
                case 5: goto L_0x0642;
                case 6: goto L_0x0624;
                case 7: goto L_0x0691;
                case 8: goto L_0x001b;
                case 9: goto L_0x06a0;
                case 10: goto L_0x0624;
                case 11: goto L_0x06b7;
                case 12: goto L_0x06c8;
                case 13: goto L_0x06ec;
                case 14: goto L_0x06fa;
                case 15: goto L_0x0750;
                case 16: goto L_0x0762;
                case 17: goto L_0x077c;
                case 18: goto L_0x003a;
                case 19: goto L_0x0050;
                case 20: goto L_0x0086;
                case 21: goto L_0x00bc;
                case 22: goto L_0x0784;
                case 23: goto L_0x00e8;
                case 24: goto L_0x01b2;
                case 25: goto L_0x0204;
                case 26: goto L_0x0236;
                case 27: goto L_0x02e2;
                case 28: goto L_0x031d;
                case 29: goto L_0x0991;
                case 30: goto L_0x09bb;
                case 31: goto L_0x037c;
                case 32: goto L_0x0393;
                case 33: goto L_0x03da;
                case 34: goto L_0x07bf;
                case 35: goto L_0x07ec;
                case 36: goto L_0x07ec;
                case 37: goto L_0x07fa;
                case 38: goto L_0x000f;
                case 39: goto L_0x0407;
                case 40: goto L_0x0007;
                case 41: goto L_0x0428;
                case 42: goto L_0x0802;
                case 43: goto L_0x048d;
                case 44: goto L_0x049e;
                case 45: goto L_0x04c2;
                case 46: goto L_0x04f7;
                case 47: goto L_0x081a;
                case 48: goto L_0x0523;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r15.A00
            X.4oJ r0 = (X.C93314oJ) r0
            r0.A1N()
        L_0x000e:
            return
        L_0x000f:
            java.lang.Object r0 = r15.A00
            X.4oC r0 = (X.C93244oC) r0
            X.5Ul r2 = r0.A0a
            X.1mV r1 = r0.getFMessage()
            goto L_0x051e
        L_0x001b:
            java.lang.Object r2 = r15.A00
            com.whatsapp.contact.picker.SharedTextPreviewDialogFragment r2 = (com.whatsapp.contact.picker.SharedTextPreviewDialogFragment) r2
            X.3Ls r0 = r2.A05
            if (r0 == 0) goto L_0x000e
            X.7Kq r0 = r0.A09
            if (r0 == 0) goto L_0x000e
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "video/mp4"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x085d
            java.lang.String r0 = "image/gif"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x085d
            return
        L_0x003a:
            java.lang.Object r1 = r15.A00
            X.4oK r1 = (X.C93324oK) r1
            boolean r0 = r1 instanceof X.C93204o8
            if (r0 == 0) goto L_0x000e
            X.4o8 r1 = (X.C93204o8) r1
            X.8qC r0 = r1.A01
            java.lang.Object r0 = r0.get()
            X.4xh r0 = (X.C97144xh) r0
            r0.A08()
            return
        L_0x0050:
            java.lang.Object r3 = r15.A00
            X.4oJ r3 = (X.C93314oJ) r3
            X.34x r2 = r3.getFMessage()
            android.app.Activity r1 = X.C86614Ku.A0A(r3)
            X.03q r1 = (X.C003203q) r1
            if (r1 == 0) goto L_0x000e
            X.8qC r0 = r3.A2C
            java.lang.Object r4 = r0.get()
            X.2m2 r4 = (X.C52782m2) r4
            android.content.Context r5 = r3.getContext()
            X.0df r6 = r1.getSupportFragmentManager()
            com.whatsapp.jid.UserJid r7 = r2.A0o()
            java.lang.String r8 = "quick_action"
            r0 = 0
            X.C162457s7.A0J(r5, r0)
            if (r7 == 0) goto L_0x000e
            X.2zY r0 = r4.A01
            boolean r9 = r0.A03(r7)
            r4.A00(r5, r6, r7, r8, r9)
            return
        L_0x0086:
            java.lang.Object r5 = r15.A00
            X.4oJ r5 = (X.C93314oJ) r5
            java.lang.Runnable r0 = r5.A2I
            if (r0 == 0) goto L_0x0092
            r0.run()
            return
        L_0x0092:
            X.34x r4 = r5.getFMessage()
            android.content.Context r0 = r5.getContext()
            android.app.Activity r0 = X.C621633u.A00(r0)
            if (r0 == 0) goto L_0x000e
            X.677 r3 = r5.A0m
            if (r3 == 0) goto L_0x000e
            X.1VX r2 = r5.A0O
            X.3Mh r1 = r5.A0b
            X.2hp r0 = r5.A1s
            boolean r0 = X.C627636p.A0U(r1, r2, r4, r0)
            r2 = 1
            if (r0 == 0) goto L_0x00b5
            r3.B3X(r4)
            return
        L_0x00b5:
            X.3Wi r1 = r5.A0X
            r0 = 2131890742(0x7f121236, float:1.9416184E38)
            goto L_0x0539
        L_0x00bc:
            java.lang.Object r2 = r15.A00
            X.4oK r2 = (X.C93324oK) r2
            X.677 r1 = r2.A0m
            if (r1 == 0) goto L_0x000e
            java.lang.Class<X.657> r0 = X.AnonymousClass657.class
            java.lang.Object r1 = r1.B5x(r0)
            X.657 r1 = (X.AnonymousClass657) r1
            if (r1 == 0) goto L_0x000e
            X.34x r3 = r2.getFMessage()
            X.4pa r2 = X.C93934pa.A00
            X.5bS r1 = (X.C107525bS) r1
            int r0 = r1.A01
            int r0 = 2 - r0
            if (r0 == 0) goto L_0x0885
            java.lang.Object r1 = r1.A00
            X.4ea r1 = (X.C89654ea) r1
            com.whatsapp.conversation.conversationrow.messagerating.MessageRatingFragment r0 = com.whatsapp.conversation.conversationrow.messagerating.MessageRatingFragment.A00(r2, r3)
            r1.Boo(r0)
            return
        L_0x00e8:
            java.lang.Object r5 = r15.A00
            X.4oJ r5 = (X.C93314oJ) r5
            X.34x r8 = r5.getFMessage()
            X.30o r0 = r5.A1k
            boolean r0 = r0.A06(r8)
            if (r0 == 0) goto L_0x0110
            X.2ph r7 = r5.A1j
            r13 = 0
            X.C162457s7.A0J(r8, r13)
            X.1VX r1 = r7.A05
            r0 = 3127(0xc37, float:4.382E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0110
            r9 = 0
            r14 = 5
            r11 = r9
            r12 = r9
            r10 = r9
            r7.A02(r8, r9, r10, r11, r12, r13, r14)
        L_0x0110:
            android.app.Activity r4 = X.C86614Ku.A0A(r5)
            X.4ea r4 = (X.C89654ea) r4
            if (r4 == 0) goto L_0x000e
            X.2zV r0 = r5.A1S
            int r7 = r0.A01(r8)
            X.8qC r0 = r5.A28
            boolean r0 = X.C627636p.A0v(r8, r0)
            if (r0 == 0) goto L_0x012b
            if (r7 == 0) goto L_0x0137
            r4.A6Z(new X.AnonymousClass912(1), new X.C1234868p(r4, 0, r5), com.whatsapp.R.string.f11nameremoved, com.whatsapp.R.string.f11nameremoved, com.whatsapp.R.string.f11nameremoved)
        L_0x012b:
            boolean r0 = r5.A16()
            if (r0 == 0) goto L_0x000e
            if (r7 == 0) goto L_0x0197
            r4.A6Z(new X.AnonymousClass912(1), new X.C1234868p(r4, 0, r5), com.whatsapp.R.string.f11nameremoved, com.whatsapp.R.string.f11nameremoved, com.whatsapp.R.string.f11nameremoved)
            return
        L_0x0137:
            r0 = 4096(0x1000, float:5.74E-42)
            boolean r0 = r8.A1s(r0)
            r6 = 0
            if (r0 == 0) goto L_0x014e
            java.lang.String r1 = r5.getMoreInfoString()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x012b
        L_0x014a:
            r4.Bov(r6, r1)
            goto L_0x012b
        L_0x014e:
            r0 = 512(0x200, float:7.175E-43)
            boolean r0 = r8.A1s(r0)
            if (r0 == 0) goto L_0x012b
            int r3 = r8.A05
            if (r3 > 0) goto L_0x0162
            r0 = 2131891260(0x7f12143c, float:1.9417235E38)
            java.lang.String r1 = r4.getString(r0)
            goto L_0x014a
        L_0x0162:
            r0 = 86400(0x15180, float:1.21072E-40)
            r2 = 0
            if (r3 <= r0) goto L_0x0175
            int r3 = r3 / r0
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131755097(0x7f100059, float:1.9141064E38)
        L_0x0170:
            java.lang.String r1 = X.AnonymousClass0x2.A0Y(r1, r3, r2, r0)
            goto L_0x014a
        L_0x0175:
            r0 = 3600(0xe10, float:5.045E-42)
            if (r3 < r0) goto L_0x0182
            int r3 = r3 / r0
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131755098(0x7f10005a, float:1.9141066E38)
            goto L_0x0170
        L_0x0182:
            r0 = 60
            if (r3 < r0) goto L_0x018f
            int r3 = r3 / r0
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131755099(0x7f10005b, float:1.9141068E38)
            goto L_0x0170
        L_0x018f:
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131755100(0x7f10005c, float:1.914107E38)
            goto L_0x0170
        L_0x0197:
            X.5Ns r0 = r5.A1i
            java.lang.Integer r0 = r0.A00(r8)
            if (r0 == 0) goto L_0x000e
            int r3 = r0.intValue()
            r2 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r1 = 2131890395(0x7f1210db, float:1.941548E38)
            X.5hw r0 = new X.5hw
            r0.<init>(r4, r8, r15)
            r4.A6X(r0, r3, r2, r1)
            return
        L_0x01b2:
            java.lang.Object r4 = r15.A00
            X.4mx r4 = (X.C92604mx) r4
            X.5a1 r0 = r4.A0L
            r2 = 0
            if (r0 != 0) goto L_0x01bf
            java.lang.String r0 = "conversationrowcontact/addcontactonclicklistener/contact is null"
            goto L_0x09af
        L_0x01bf:
            byte[] r1 = r0.A0B
            if (r1 == 0) goto L_0x01ee
            int r0 = r1.length
            if (r0 <= 0) goto L_0x01ee
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeByteArray(r1, r2, r0)
        L_0x01ca:
            boolean r0 = r4.A0N
            if (r0 == 0) goto L_0x01f0
            X.3Ex r1 = r4.A0t
            X.1fH r0 = r4.A0D
            X.3ZH r3 = r1.A07(r0)
            if (r3 == 0) goto L_0x000e
            android.content.Context r0 = r4.getContext()
            android.app.Activity r0 = X.C111095hX.A00(r0)
            X.03q r0 = (X.C003203q) r0
            X.5Xw r2 = r4.A0E
            X.0df r1 = r0.getSupportFragmentManager()
            X.4uZ r0 = r3.A0H
            r2.A07(r1, r3, r0)
            return
        L_0x01ee:
            r3 = 0
            goto L_0x01ca
        L_0x01f0:
            android.app.Activity r2 = X.C86614Ku.A0A(r4)
            X.4ea r2 = (X.C89654ea) r2
            X.5a1 r1 = r4.A0L
            if (r1 == 0) goto L_0x000e
            boolean r0 = r2 instanceof X.AnonymousClass652
            if (r0 == 0) goto L_0x000e
            X.652 r2 = (X.AnonymousClass652) r2
            r2.Boh(r3, r1)
            return
        L_0x0204:
            java.lang.Object r6 = r15.A00
            X.4mx r6 = (X.C92604mx) r6
            X.5a1 r0 = r6.A0L
            boolean r0 = r6.A25(r0)
            if (r0 == 0) goto L_0x000e
            X.5a1 r0 = r6.A0L
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.List r0 = r0.A03
            if (r0 == 0) goto L_0x0893
            java.util.Iterator r4 = r0.iterator()
        L_0x021e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0893
            java.lang.Object r2 = r4.next()
            X.5KP r2 = (X.AnonymousClass5KP) r2
            java.lang.Class r1 = r2.A01
            java.lang.Class<android.provider.ContactsContract$CommonDataKinds$Email> r0 = android.provider.ContactsContract.CommonDataKinds.Email.class
            if (r1 != r0) goto L_0x021e
            java.lang.String r0 = r2.A02
            r3.add(r0)
            goto L_0x021e
        L_0x0236:
            java.lang.Object r2 = r15.A00
            X.4mx r2 = (X.C92604mx) r2
            int r1 = r2.A00
            r0 = 1
            r3 = 0
            if (r1 != r0) goto L_0x0266
            java.util.ArrayList r0 = r2.A0b
            java.util.Iterator r1 = r0.iterator()
        L_0x0246:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x000e
            com.whatsapp.jid.UserJid r5 = X.C18310x6.A0T(r1)
            if (r5 == 0) goto L_0x0246
            X.5Xd r4 = r2.A06
            android.content.Context r1 = r2.getContext()
            X.5a1 r0 = r2.A0L
            if (r0 == 0) goto L_0x0264
            X.5Ot r0 = r0.A0A
            java.lang.String r0 = r0.A08
        L_0x0260:
            r4.A01(r1, r5, r0, r3)
            return
        L_0x0264:
            r0 = r3
            goto L_0x0260
        L_0x0266:
            if (r1 != 0) goto L_0x0286
            boolean r0 = r2.A0N
            if (r0 == 0) goto L_0x0286
            X.1fH r0 = r2.A0D
            if (r0 == 0) goto L_0x0286
            X.5Xd r5 = r2.A06
            android.content.Context r4 = r2.getContext()
            X.1fH r1 = r2.A0D
            X.5a1 r0 = r2.A0L
            if (r0 == 0) goto L_0x0280
            X.5Ot r0 = r0.A0A
            java.lang.String r3 = r0.A08
        L_0x0280:
            java.lang.String r0 = r2.A0K
            r5.A01(r4, r1, r3, r0)
            return
        L_0x0286:
            X.34x r0 = r2.getFMessage()
            X.C627636p.A0E(r0)
            android.content.Context r1 = r2.getContext()
            java.lang.Class<X.07r> r0 = X.C009707r.class
            android.app.Activity r5 = X.C621633u.A01(r1, r0)
            X.03q r5 = (X.C003203q) r5
            X.5a1 r0 = r2.A0L
            if (r0 == 0) goto L_0x000e
            if (r5 == 0) goto L_0x000e
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            r1 = 0
        L_0x02a8:
            X.5a1 r0 = r2.A0L
            java.util.List r0 = r0.A06
            int r0 = r0.size()
            if (r1 >= r0) goto L_0x0955
            java.util.ArrayList r0 = r2.A0b
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L_0x02db
            X.5a1 r0 = r2.A0L
            java.util.List r0 = r0.A06
            java.lang.Object r0 = r0.get(r1)
            X.7OD r0 = (X.AnonymousClass7OD) r0
            java.lang.String r0 = r0.A02
            r7.add(r0)
            X.5a1 r0 = r2.A0L
            java.util.List r0 = r0.A06
            java.lang.Object r0 = r0.get(r1)
            X.7OD r0 = (X.AnonymousClass7OD) r0
            java.lang.String r0 = r0.A03
            r6.add(r0)
        L_0x02d8:
            int r1 = r1 + 1
            goto L_0x02a8
        L_0x02db:
            r7.add(r3)
            r6.add(r3)
            goto L_0x02d8
        L_0x02e2:
            java.lang.Object r4 = r15.A00
            X.4mx r4 = (X.C92604mx) r4
            android.content.Context r1 = r4.getContext()
            java.lang.Class<X.4eZ> r0 = X.C89644eZ.class
            android.app.Activity r3 = X.C621633u.A01(r1, r0)
            java.util.ArrayList r2 = r4.A0b
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x000e
            r1 = 0
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x000e
            if (r3 == 0) goto L_0x000e
            java.lang.Object r1 = r2.get(r1)
            X.4uZ r1 = (X.C95814uZ) r1
            X.3Ex r0 = r4.A0t
            X.3ZH r2 = r0.A0A(r1)
            X.36r r1 = X.C86664Kz.A1B()
            java.lang.Integer r0 = X.AnonymousClass001.A0f()
            android.content.Intent r0 = r1.A1M(r3, r2, r0)
            r3.startActivity(r0)
            return
        L_0x031d:
            java.lang.Object r4 = r15.A00
            r3 = r4
            X.4mx r3 = (X.C92604mx) r3
            android.content.Context r1 = r3.getContext()
            java.lang.Class<X.4eZ> r0 = X.C89644eZ.class
            android.app.Activity r6 = X.C621633u.A01(r1, r0)
            X.4eZ r6 = (X.C89644eZ) r6
            java.util.ArrayList r2 = r3.A0b
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x000e
            r1 = 0
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x000e
            if (r6 == 0) goto L_0x000e
            java.lang.Object r9 = r2.get(r1)
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9
            X.3Ex r0 = r3.A0t
            X.3ZH r2 = r0.A0A(r9)
            X.4uZ r1 = r2.A0H
            boolean r0 = r1 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x0358
            X.4oJ r4 = (X.C93314oJ) r4
            X.2sr r0 = r4.A0Z
            r0.A0a(r1)
        L_0x0358:
            boolean r0 = r2.A0R()
            if (r0 != 0) goto L_0x0981
            X.1u0 r1 = r3.A09
            if (r1 == 0) goto L_0x0369
            r0 = 1
            r1.A0D(r0)
            r0 = 0
            r3.A09 = r0
        L_0x0369:
            X.2sr r5 = r3.A0Z
            X.3Cq r8 = r3.A08
            X.1ia r7 = r3.A03
            X.1u0 r4 = new X.1u0
            r4.<init>(r5, r6, r7, r8, r9)
            r3.A09 = r4
            X.4FS r0 = r3.A25
            X.AnonymousClass0x7.A1B(r4, r0)
            return
        L_0x037c:
            java.lang.Object r2 = r15.A00
            X.4nz r2 = (X.C93154nz) r2
            X.5ez r0 = r2.A09
            r0.A07(r4)
            X.5XQ r1 = r2.A0C
            if (r1 == 0) goto L_0x000e
            X.34x r0 = r2.A0S
            X.1mV r0 = (X.C30471mV) r0
            X.2z0 r0 = r0.A1J
            r1.A01(r0)
            return
        L_0x0393:
            java.lang.Object r4 = r15.A00
            X.4o1 r4 = (X.AnonymousClass4o1) r4
            java.util.List r0 = r4.A09
            java.util.Iterator r3 = r0.iterator()
        L_0x039d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x000e
            X.1mV r2 = X.C18320x8.A0S(r3)
            boolean r0 = X.C383527f.A00(r2)
            if (r0 == 0) goto L_0x03c0
            X.5Qk r0 = r4.A07
            X.C626936e.A06(r0)
            java.util.Map r0 = r0.A07
            java.lang.Object r0 = r0.get(r2)
            X.1I8 r0 = (X.AnonymousClass1I8) r0
            if (r0 == 0) goto L_0x039d
            r0.cancel()
            goto L_0x039d
        L_0x03c0:
            X.33C r0 = X.C30471mV.A00(r2)
            boolean r0 = r0.A0c
            if (r0 == 0) goto L_0x039d
            X.2z0 r0 = r2.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x03d4
            X.2re r1 = r4.A05
            r0 = 0
            r1.A04(r2, r0)
        L_0x03d4:
            X.33d r0 = r4.A06
            r0.A0B(r2)
            goto L_0x039d
        L_0x03da:
            java.lang.Object r4 = r15.A00
            X.4o1 r4 = (X.AnonymousClass4o1) r4
            java.util.List r0 = r4.A09
            java.util.Iterator r3 = r0.iterator()
        L_0x03e4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x000e
            X.1mV r2 = X.C18320x8.A0S(r3)
            X.33C r1 = X.C30471mV.A00(r2)
            boolean r0 = r1.A0R
            if (r0 != 0) goto L_0x03e4
            boolean r0 = r1.A0c
            if (r0 != 0) goto L_0x03e4
            boolean r0 = X.C383227b.A00(r2)
            if (r0 != 0) goto L_0x03e4
            X.5Ul r1 = r4.A0a
            r0 = 1
            r1.A08(r2, r0, r0)
            goto L_0x03e4
        L_0x0407:
            java.lang.Object r1 = r15.A00
            X.4oC r1 = (X.C93244oC) r1
            X.1mV r2 = r1.getFMessage()
            boolean r0 = X.C383527f.A00(r2)
            if (r0 == 0) goto L_0x09df
            X.5Qk r0 = r1.A06
            X.C626936e.A06(r0)
            java.util.Map r0 = r0.A07
            java.lang.Object r0 = r0.get(r2)
            X.1I8 r0 = (X.AnonymousClass1I8) r0
            if (r0 == 0) goto L_0x000e
            r0.cancel()
            return
        L_0x0428:
            java.lang.Object r7 = r15.A00
            X.4nJ r7 = (X.C92814nJ) r7
            X.1mM r1 = r7.getFMessage()
            X.4uY r8 = r1.A01
            if (r8 == 0) goto L_0x000e
            java.lang.String r9 = r1.A03
            if (r9 == 0) goto L_0x000e
            X.1mM r0 = r7.getFMessage()
            X.2z0 r0 = r0.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x09f2
            X.1mM r0 = r7.getFMessage()
            X.2z0 r0 = r0.A1J
            X.4uZ r0 = r0.A00
            com.whatsapp.jid.UserJid r5 = X.AnonymousClass32Y.A05(r0)
            if (r5 == 0) goto L_0x000e
            long r0 = r1.A00
            X.8qC r2 = r7.A2B
            java.lang.Object r3 = r2.get()
            X.2eH r3 = (X.C48062eH) r3
            java.lang.Class<X.3LJ> r2 = X.AnonymousClass3LJ.class
            r3.A02(r2)
            com.whatsapp.newsletter.ui.multiadmin.NewsletterRevokeAdminInviteSheet r4 = new com.whatsapp.newsletter.ui.multiadmin.NewsletterRevokeAdminInviteSheet
            r4.<init>()
            android.os.Bundle r3 = X.AnonymousClass002.A08()
            java.lang.String r2 = "newsletter_jid"
            X.AnonymousClass0x2.A0v(r3, r8, r2)
            java.lang.String r2 = "arg_contact_jid"
            X.AnonymousClass0x2.A0v(r3, r5, r2)
            java.lang.String r2 = "newsletter_name"
            r3.putString(r2, r9)
            java.lang.String r2 = "invite_expiration_ts"
            r3.putLong(r2, r0)
            r4.A0u(r3)
            android.content.Context r0 = r7.getContext()
            X.4ea r0 = X.C89654ea.A4J(r0)
            if (r0 == 0) goto L_0x000e
            r0.Boo(r4)
            return
        L_0x048d:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 27
            if (r1 < r0) goto L_0x0007
            java.lang.Object r1 = r15.A00
            android.view.View r1 = (android.view.View) r1
            r0 = 8
            r1.performHapticFeedback(r0)
            goto L_0x0007
        L_0x049e:
            java.lang.Object r3 = r15.A00
            X.5Xu r3 = (X.C106145Xu) r3
            X.1mV r0 = r3.A00
            X.33C r0 = X.C30471mV.A00(r0)
            boolean r0 = r0.A0c
            if (r0 == 0) goto L_0x000e
            X.1mV r2 = r3.A00
            X.2z0 r0 = r2.A1J
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x04ba
            X.2re r1 = r3.A0B
            r0 = 0
            r1.A04(r2, r0)
        L_0x04ba:
            X.33d r1 = r3.A0C
            X.1mV r0 = r3.A00
            r1.A0B(r0)
            return
        L_0x04c2:
            java.lang.Object r4 = r15.A00
            X.5Xu r4 = (X.C106145Xu) r4
            X.1mV r0 = r4.A00
            X.33C r1 = X.C30471mV.A00(r0)
            boolean r0 = r1.A0R
            if (r0 == 0) goto L_0x04d4
            boolean r0 = r1.A0Z
            if (r0 == 0) goto L_0x000e
        L_0x04d4:
            boolean r0 = r1.A0c
            if (r0 != 0) goto L_0x000e
            X.1mV r0 = r4.A00
            boolean r0 = r0.A22()
            if (r0 == 0) goto L_0x000e
            int r0 = r1.A07
            r3 = 1
            if (r0 == r3) goto L_0x000e
            r4.A02 = r3
            X.33m r2 = r4.A07
            android.view.View r0 = r4.A05
            android.app.Activity r1 = X.C111095hX.A04(r0)
            X.4ea r1 = (X.C89654ea) r1
            X.1mV r0 = r4.A00
            r2.A07(r1, r0, r3)
            return
        L_0x04f7:
            java.lang.Object r3 = r15.A00
            X.5Xu r3 = (X.C106145Xu) r3
            X.5ZR r2 = r3.A08
            if (r2 == 0) goto L_0x050c
            X.1VX r1 = r3.A0A
            android.content.Context r0 = r4.getContext()
            boolean r0 = com.whatsapp.RequestPermissionActivity.A0q(r0, r2, r1)
            if (r0 != 0) goto L_0x050c
            return
        L_0x050c:
            X.1mV r0 = r3.A00
            X.33C r1 = X.C30471mV.A00(r0)
            boolean r0 = r1.A0R
            if (r0 != 0) goto L_0x000e
            boolean r0 = r1.A0c
            if (r0 != 0) goto L_0x000e
            X.5Ul r2 = r3.A06
            X.1mV r1 = r3.A00
        L_0x051e:
            r0 = 1
            r2.A08(r1, r0, r0)
            return
        L_0x0523:
            java.lang.Object r3 = r15.A00
            X.4o9 r3 = (X.C93214o9) r3
            X.1pB r1 = r3.getFMessage()
            X.33C r0 = X.C30471mV.A00(r1)
            int r0 = r0.A07
            r2 = 1
            if (r0 != r2) goto L_0x053d
            X.3Wi r1 = r3.A0X
            r0 = 2131889529(0x7f120d79, float:1.9413724E38)
        L_0x0539:
            r1.A0F(r0, r2)
            return
        L_0x053d:
            X.5ez r0 = r3.A09
            r0.A07(r4)
            boolean r0 = r1.A22()
            if (r0 == 0) goto L_0x000e
            X.1VX r0 = r3.A0O
            boolean r0 = X.AnonymousClass35Z.A01(r0, r1)
            if (r0 == 0) goto L_0x0a4a
            r3.A29()
            return
        L_0x0554:
            java.lang.Object r2 = r15.A00
            com.whatsapp.contact.picker.ContactPickerFragment r2 = (com.whatsapp.contact.picker.ContactPickerFragment) r2
            boolean r0 = r2.A3R
            if (r0 == 0) goto L_0x0562
            X.2on r1 = r2.A2L
            r0 = 7
            r1.A02(r0)
        L_0x0562:
            r2.A1g()
            return
        L_0x0566:
            java.lang.Object r5 = r15.A00
            com.whatsapp.contact.picker.ContactPickerFragment r5 = (com.whatsapp.contact.picker.ContactPickerFragment) r5
            boolean r0 = r5.A2D()
            if (r0 == 0) goto L_0x0599
            X.2X0 r0 = r5.A2N
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0599
            boolean r0 = r5.A3V
            if (r0 != 0) goto L_0x0580
            boolean r0 = r5.A3b
            if (r0 == 0) goto L_0x0599
        L_0x0580:
            boolean r1 = r5.A3b
            r0 = 3
            if (r1 == 0) goto L_0x0587
            r0 = 10
        L_0x0587:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            X.5mK r2 = r5.A2O
            int r0 = r3.intValue()
            java.lang.Integer r1 = X.C113995mK.A01(r0)
            r0 = 0
            r2.A0A(r0, r3, r1)
        L_0x0599:
            boolean r4 = r5.A2D()
            if (r4 == 0) goto L_0x05ac
            X.5de r0 = r5.A1o
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x05ac
            X.8qC r0 = r5.A2m
            if (r0 == 0) goto L_0x05ac
            r0.get()
        L_0x05ac:
            X.4uZ r0 = r5.A26
            boolean r0 = r0 instanceof X.C95804uY
            if (r0 != 0) goto L_0x05eb
            android.content.Context r2 = r5.A0G()
            X.33p r3 = r5.A1U
            X.5PD r0 = r5.A1D
            if (r0 == 0) goto L_0x05eb
            X.107 r0 = r0.A0J
            boolean r0 = X.C86604Kt.A1Z(r0)
            if (r0 == 0) goto L_0x05eb
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r3)
            java.lang.String r0 = "forward_with_captions_nux_shown"
            boolean r0 = X.C18280x3.A1W(r1, r0)
            if (r0 != 0) goto L_0x05eb
            X.0zH r2 = X.AnonymousClass5V0.A00(r2)
            r0 = 2131889441(0x7f120d21, float:1.9413546E38)
            r2.A0T(r0)
            r1 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r0 = 36
            X.C1235268t.A03(r2, r3, r0, r1)
            r2.A0S()
            java.lang.String r0 = "contactpicker/forward with captions nux shown"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x05eb:
            X.4FS r2 = r5.A2c
            r1 = 23
            X.3cX r0 = new X.3cX
            r0.<init>((int) r1, (java.lang.Object) r15, (boolean) r4)
            r2.BkM(r0)
            return
        L_0x05f8:
            java.lang.Object r2 = r15.A00
            X.4eX r2 = (X.C89634eX) r2
            java.util.List r0 = r2.A0f
            int r0 = r0.size()
            int r1 = r2.A79()
            if (r0 >= r1) goto L_0x0620
            X.3Wi r6 = r2.A05
            X.33j r5 = r2.A0N
            r4 = 2131755208(0x7f1000c8, float:1.9141289E38)
            long r2 = (long) r1
            java.lang.Object[] r0 = X.AnonymousClass002.A0L()
            boolean r1 = X.C18300x5.A1Y(r0, r1)
            java.lang.String r0 = r5.A0L(r0, r4, r2)
            r6.A0P(r0, r1)
            return
        L_0x0620:
            r2.A7I()
            return
        L_0x0624:
            java.lang.Object r0 = r15.A00
            android.app.Activity r0 = (android.app.Activity) r0
            X.C107395bF.A05(r0)
            return
        L_0x062c:
            java.lang.Object r1 = r15.A00
            X.4eX r1 = (X.C89634eX) r1
            X.1VX r3 = r1.A0D
            X.3Wi r2 = r1.A05
            X.5Tk r4 = r1.A0P
            X.36r r0 = new X.36r
            r0.<init>()
            r5 = 2
            r6 = 12
            X.C100245Ad.A00(r1, r2, r3, r4, r5, r6)
            return
        L_0x0642:
            java.lang.Object r5 = r15.A00
            com.whatsapp.contact.picker.PhoneContactsSelector r5 = (com.whatsapp.contact.picker.PhoneContactsSelector) r5
            java.util.List r12 = r5.A0h
            int r1 = r12.size()
            r0 = 1
            if (r1 >= r0) goto L_0x0666
            X.3Wi r6 = r5.A05
            X.33j r5 = r5.A0S
            r4 = 2131755208(0x7f1000c8, float:1.9141289E38)
            java.lang.Object[] r3 = new java.lang.Object[r0]
            boolean r2 = X.C18300x5.A1Y(r3, r0)
            r0 = 1
            java.lang.String r0 = r5.A0L(r3, r4, r0)
            r6.A0P(r0, r2)
            return
        L_0x0666:
            X.2Xk r0 = r5.A0C
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x0674
            java.lang.String r0 = "conversation/actresult/read_contacts permission denied"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x0674:
            X.4FS r0 = r5.A04
            X.2oU r7 = r5.A0Q
            X.3Ex r4 = r5.A0E
            X.33i r6 = r5.A08
            X.33j r8 = r5.A0S
            X.5Xx r2 = r5.A08
            X.33g r3 = r5.A0B
            X.2ML r11 = r5.A0W
            X.4uZ r10 = r5.A0U
            X.2q8 r9 = r5.A0T
            X.1tp r1 = new X.1tp
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            X.C18270x1.A0w(r1, r0)
            return
        L_0x0691:
            java.lang.Object r1 = r15.A00
            com.whatsapp.contact.picker.SharedTextPreviewDialogFragment r1 = (com.whatsapp.contact.picker.SharedTextPreviewDialogFragment) r1
            java.lang.String r0 = r1.A0P
            r1.A0O = r0
            r0 = 0
            r1.A05 = r0
            r1.A1X()
            return
        L_0x06a0:
            java.lang.Object r2 = r15.A00
            com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity r2 = (com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity) r2
            X.2fa r1 = r2.A09
            if (r1 == 0) goto L_0x06b0
            java.lang.Integer r0 = r2.A75()
            r1.A01(r2, r0)
            return
        L_0x06b0:
            java.lang.String r0 = "tellAFriend"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x06b7:
            java.lang.Object r3 = r15.A00
            X.4m5 r3 = (X.C92094m5) r3
            X.33p r0 = r3.A02
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "cag_replies_promotion_banner_closed"
            X.C18270x1.A0l(r1, r0, r2)
            goto L_0x06e7
        L_0x06c8:
            java.lang.Object r3 = r15.A00
            X.4m6 r3 = (X.C92104m6) r3
            X.33p r0 = r3.A08
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "pnh_cag_future_proof_banner_closed"
            X.C18270x1.A0f(r1, r0)
            java.lang.Integer r0 = X.C18280x3.A0S()
            X.1Wa r1 = new X.1Wa
            r1.<init>()
            r1.A00 = r0
            X.4FV r0 = r3.A0A
            r0.BhD(r1)
        L_0x06e7:
            r0 = 1
            r3.A05(r0)
            return
        L_0x06ec:
            java.lang.Object r0 = r15.A00
            com.whatsapp.conversation.ConversationAttachmentContentView r0 = (com.whatsapp.conversation.ConversationAttachmentContentView) r0
            X.4fS r2 = r0.A0G
            int r1 = r0.A06
            java.lang.String r0 = "chat"
            r2.A0A(r1, r0)
            return
        L_0x06fa:
            java.lang.Object r0 = r15.A00
            com.whatsapp.conversation.EditMessageActivity r0 = (com.whatsapp.conversation.EditMessageActivity) r0
            X.4UY r3 = r0.A0A
            java.lang.String r9 = r3.A00
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x074b
            X.34x r8 = r3.A0D
            if (r8 == 0) goto L_0x074b
            if (r9 == 0) goto L_0x074b
            int r0 = r9.length()
            if (r0 == 0) goto L_0x074b
            X.2sH r0 = r3.A0A
            X.1VX r1 = r3.A0B
            long r4 = X.C56612sH.A04(r0, r8)
            r0 = 2983(0xba7, float:4.18E-42)
            long r1 = X.C56952sp.A04(r1, r0)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0734
            boolean r0 = X.AnonymousClass2z0.A0C(r8)
            if (r0 != 0) goto L_0x0734
            X.08M r1 = r3.A03
            X.58x r0 = X.C999758x.ExitEditExpired
        L_0x072e:
            java.lang.String r0 = r0.value
            r1.A0G(r0)
            return
        L_0x0734:
            X.33m r5 = r3.A06
            X.4UA r7 = r3.A09
            X.3Ls r6 = r7.A01
            java.util.List r10 = r3.A01
            X.4FS r0 = r5.A1r
            X.3cP r4 = new X.3cP
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.BkM(r4)
            X.08M r1 = r3.A03
            X.58x r0 = X.C999758x.ExitWithChanges
            goto L_0x072e
        L_0x074b:
            X.08M r1 = r3.A03
            X.58x r0 = X.C999758x.ExitNoChanges
            goto L_0x072e
        L_0x0750:
            java.lang.Object r2 = r15.A00
            X.4m7 r2 = (X.C92114m7) r2
            X.2sA r1 = r2.A04
            X.3ZH r0 = r2.A00
            X.4uZ r0 = r0.A0H
            r1.A03(r0)
            r0 = 1
            r2.A05(r0)
            return
        L_0x0762:
            java.lang.Object r0 = r15.A00
            X.4m7 r0 = (X.C92114m7) r0
            X.67A r4 = r0.A01
            X.4eZ r3 = r4.getActivity()
            X.3ZH r0 = r0.A00
            X.4uZ r2 = r0.A0H
            r1 = 0
            r0 = 1
            android.content.Intent r1 = X.C627736r.A0g(r3, r2, r1, r0, r0)
            X.4eZ r0 = r4.getActivity()
            goto L_0x09db
        L_0x077c:
            java.lang.Object r0 = r15.A00
            X.4oJ r0 = (X.C93314oJ) r0
            r0.A1U(r4)
            return
        L_0x0784:
            java.lang.Object r4 = r15.A00
            X.4oJ r4 = (X.C93314oJ) r4
            X.2gs r0 = r4.A1p
            boolean r0 = r0.A01()
            r1 = 7
            if (r0 == 0) goto L_0x079d
            X.2r2 r0 = r4.A1r
            r0.A01(r1)
            X.4xh r1 = r4.A1w
            r0 = 0
            r1.A09(r0)
            return
        L_0x079d:
            android.app.Activity r3 = X.C86614Ku.A0A(r4)
            if (r3 == 0) goto L_0x07bb
            X.2r2 r0 = r4.A1r
            r0.A01(r1)
            X.2r2 r2 = r4.A1r
            r1 = 2
            r0 = 0
            r2.A03(r0, r1)
            X.5ZD r2 = r4.A1q
            java.lang.ref.WeakReference r1 = X.AnonymousClass0x9.A14(r3)
            java.lang.String r0 = "conversation_quick_action_button"
            r2.A04(r0, r1)
            return
        L_0x07bb:
            java.lang.String r0 = "Unable to find host Activity"
            goto L_0x0a4c
        L_0x07bf:
            java.lang.Object r6 = r15.A00
            X.4o1 r6 = (X.AnonymousClass4o1) r6
            r5 = 1
            X.2ag r4 = r6.A03
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            java.util.List r0 = r6.A09
            java.util.Iterator r2 = r0.iterator()
        L_0x07d0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x07e4
            X.1mV r1 = X.C18320x8.A0S(r2)
            boolean r0 = r6.A26(r1)
            if (r0 != 0) goto L_0x07d0
            r3.add(r1)
            goto L_0x07d0
        L_0x07e4:
            android.content.Context r0 = r6.getContext()
            r4.A00(r0, r3, r5)
            return
        L_0x07ec:
            java.lang.Object r0 = r15.A00
            X.4oJ r0 = (X.C93314oJ) r0
            X.33m r1 = r0.A0h
            X.34x r0 = r0.A0S
            X.1mK r0 = (X.C30361mK) r0
            r1.A0X(r0)
            return
        L_0x07fa:
            java.lang.Object r0 = r15.A00
            X.4oC r0 = (X.C93244oC) r0
            r0.A24()
            return
        L_0x0802:
            java.lang.Object r2 = r15.A00
            X.4nZ r2 = (X.C92914nZ) r2
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer r1 = r2.A0U
            r0 = 1
            r1.setPlayWhenReadyAndActive(r0)
            X.5HY r1 = r2.A03
            X.34x r0 = r2.A0S
            X.1mV r0 = (X.C30471mV) r0
            X.2z0 r0 = r0.A1J
            r1.A00 = r0
            r2.A24()
            return
        L_0x081a:
            java.lang.Object r5 = r15.A00
            X.5Xu r5 = (X.C106145Xu) r5
            X.1mV r2 = r5.A00
            X.1nE r2 = (X.AnonymousClass1nE) r2
            X.2qp r0 = r5.A0D
            X.39M r4 = r0.A00(r2)
            com.whatsapp.stickers.StickerView r1 = r5.A0F
            boolean r0 = r1.A03
            if (r0 != 0) goto L_0x0831
            r1.A08()
        L_0x0831:
            X.2z0 r0 = r2.A1J
            X.4uZ r0 = r0.A00
            java.lang.String r3 = X.C18290x4.A0n(r0)
            com.whatsapp.stickers.info.StickerInfoDialogFragment r2 = new com.whatsapp.stickers.info.StickerInfoDialogFragment
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass002.A08()
            java.lang.String r0 = "sticker"
            r1.putParcelable(r0, r4)
            java.lang.String r0 = "raw-chat-jid"
            r1.putString(r0, r3)
            r2.A0u(r1)
            android.view.View r0 = r5.A05
            android.content.Context r0 = r0.getContext()
            X.4ea r0 = X.C111095hX.A05(r0)
            r0.Boo(r2)
            return
        L_0x085d:
            com.whatsapp.webpagepreview.WebPagePreviewView r1 = r2.A0F
            r0 = 1
            r1.setImageProgressBarVisibility(r0)
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r2.A0F
            r6 = 0
            r0.A0L(r6, r6)
            X.4FS r5 = r2.A0M
            X.3Dh r4 = r2.A07
            X.3Ls r0 = r2.A05
            X.7Kq r0 = r0.A09
            java.lang.String r3 = r0.A02
            java.lang.String r2 = r0.A01
            X.6AX r0 = new X.6AX
            r0.<init>(r15, r6)
            X.54w r1 = new X.54w
            r1.<init>(r4, r0, r3, r2)
            java.lang.String[] r0 = new java.lang.String[r6]
            r5.BkL(r1, r0)
            return
        L_0x0885:
            java.lang.Object r0 = r1.A00
            X.5l7 r0 = (X.C113245l7) r0
            X.676 r1 = r0.A2z
            com.whatsapp.conversation.conversationrow.messagerating.MessageRatingFragment r0 = com.whatsapp.conversation.conversationrow.messagerating.MessageRatingFragment.A00(r2, r3)
            r1.Boo(r0)
            return
        L_0x0893:
            boolean r0 = r3.isEmpty()
            r7 = 1
            r5 = 0
            if (r0 == 0) goto L_0x08b9
            java.util.ArrayList r1 = r6.A0c
            int r0 = r1.size()
            if (r0 != r7) goto L_0x08b9
            java.lang.String r4 = X.C86664Kz.A1M(r1, r5)
            X.2nh r3 = r6.A07
            android.content.Context r2 = r6.getContext()
            r0 = 18
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "sms:"
            r3.A01(r2, r1, r4, r0)
            return
        L_0x08b9:
            java.util.ArrayList r2 = r6.A0c
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x08cf
            int r0 = r3.size()
            if (r0 != r7) goto L_0x08cf
            java.lang.String r0 = X.C86664Kz.A1M(r3, r5)
            r15.A09(r0)
            return
        L_0x08cf:
            int r1 = r2.size()
            int r0 = r3.size()
            int r1 = r1 + r0
            java.util.ArrayList r4 = X.AnonymousClass002.A0I(r1)
            java.util.Iterator r2 = r2.iterator()
        L_0x08e0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x08f4
            java.lang.String r1 = X.AnonymousClass001.A0m(r2)
            X.33j r0 = r6.A0M
            java.lang.String r0 = r0.A0I(r1)
            r4.add(r0)
            goto L_0x08e0
        L_0x08f4:
            java.util.Iterator r2 = r3.iterator()
        L_0x08f8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x090c
            java.lang.String r1 = X.AnonymousClass001.A0m(r2)
            X.33j r0 = r6.A0M
            java.lang.String r0 = r0.A0H(r1)
            r4.add(r0)
            goto L_0x08f8
        L_0x090c:
            X.5a1 r0 = r6.A0L
            X.5Ot r0 = r0.A0A
            java.lang.String r0 = r0.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            android.content.Context r3 = r6.getContext()
            if (r0 == 0) goto L_0x0945
            r0 = 2131890283(0x7f12106b, float:1.9415253E38)
            java.lang.String r1 = r3.getString(r0)
        L_0x0923:
            android.content.Context r0 = r6.getContext()
            X.0zH r3 = X.AnonymousClass5V0.A00(r0)
            r3.A0h(r1)
            java.lang.String[] r0 = new java.lang.String[r5]
            java.lang.Object[] r2 = r4.toArray(r0)
            java.lang.CharSequence[] r2 = (java.lang.CharSequence[]) r2
            r0 = 5
            X.69T r1 = new X.69T
            r1.<init>(r15, r0, r4)
            X.0Uj r0 = r3.A00
            r0.A0J(r1, r2)
            X.C18280x3.A0q(r3)
            return
        L_0x0945:
            r2 = 2131890298(0x7f12107a, float:1.9415284E38)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            X.5a1 r0 = r6.A0L
            X.5Ot r0 = r0.A0A
            java.lang.String r0 = r0.A01
            java.lang.String r1 = X.AnonymousClass002.A0F(r3, r0, r1, r5, r2)
            goto L_0x0923
        L_0x0955:
            java.util.ArrayList r4 = r2.A0b
            X.5a1 r0 = r2.A0L
            X.5Ot r0 = r0.A0A
            java.lang.String r3 = r0.A08
            com.whatsapp.conversation.conversationrow.ConversationRowContact$MessageSharedContactDialogFragment r2 = new com.whatsapp.conversation.conversationrow.ConversationRowContact$MessageSharedContactDialogFragment
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass002.A08()
            java.lang.String r0 = "jids"
            X.C86644Kx.A0r(r1, r0, r4)
            java.lang.String r0 = "phones"
            r1.putStringArrayList(r0, r7)
            java.lang.String r0 = "labels"
            r1.putStringArrayList(r0, r6)
            java.lang.String r0 = "business_name"
            r1.putString(r0, r3)
            r2.A0u(r1)
            X.C86644Kx.A1D(r2, r5)
            return
        L_0x0981:
            X.36r r1 = X.C86664Kz.A1B()
            java.lang.Integer r0 = X.AnonymousClass001.A0f()
            android.content.Intent r0 = r1.A1M(r6, r2, r0)
            r6.startActivity(r0)
            return
        L_0x0991:
            java.lang.Object r4 = r15.A00
            X.4mx r4 = (X.C92604mx) r4
            X.5a1 r0 = r4.A0L
            r2 = 0
            if (r0 == 0) goto L_0x09ad
            android.content.Context r1 = r4.getContext()
            X.34x r0 = r4.getFMessage()
            X.2z0 r0 = r0.A1J
            android.os.Bundle r3 = X.C627636p.A02(r0)
            android.content.Intent r1 = X.C109665ez.A06(r1, r2)
            goto L_0x09d2
        L_0x09ad:
            java.lang.String r0 = "conversationrowcontact/onclicklistener/vcard is empty"
        L_0x09af:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.3Wi r1 = r4.A0X
            r0 = 2131889109(0x7f120bd5, float:1.9412872E38)
            r1.A0H(r0, r2)
            return
        L_0x09bb:
            java.lang.Object r4 = r15.A00
            X.4oK r4 = (X.C93324oK) r4
            android.content.Context r1 = r4.getContext()
            X.34x r0 = r4.getFMessage()
            X.2z0 r0 = r0.A1J
            android.os.Bundle r3 = X.C627636p.A02(r0)
            r0 = 0
            android.content.Intent r1 = X.C109665ez.A06(r1, r0)
        L_0x09d2:
            java.lang.String r0 = "vcard_message"
            r1.putExtra(r0, r3)
            android.content.Context r0 = r4.getContext()
        L_0x09db:
            r0.startActivity(r1)
            return
        L_0x09df:
            boolean r0 = X.C87094Nz.A0k(r1)
            if (r0 != 0) goto L_0x09ec
            X.2re r1 = r1.A04
            r0 = 1
            r1.A04(r2, r0)
            return
        L_0x09ec:
            X.33d r0 = r1.A05
            r0.A0B(r2)
            return
        L_0x09f2:
            long r11 = r1.A00
            android.app.Activity r0 = X.C111095hX.A04(r7)
            java.lang.String r5 = "null cannot be cast to non-null type com.whatsapp.DialogActivity"
            X.C162457s7.A0K(r0, r5)
            java.lang.ref.WeakReference r10 = X.AnonymousClass0x9.A14(r0)
            X.8qC r0 = r7.A2F
            java.lang.Object r1 = r0.get()
            com.whatsapp.newsletter.NewsletterLinkLauncher r1 = (com.whatsapp.newsletter.NewsletterLinkLauncher) r1
            android.content.Context r4 = X.C18290x4.A0F(r7)
            X.63k r6 = new X.63k
            r6.<init>(r7, r8, r9, r10, r11)
            X.5UP r2 = r1.A06
            r0 = 3877(0xf25, float:5.433E-42)
            boolean r0 = r2.A05(r0)
            if (r0 == 0) goto L_0x0a24
            X.5Y8 r1 = r1.A09
            X.582 r0 = X.AnonymousClass582.VIEW
            r1.A04(r4, r0)
            return
        L_0x0a24:
            boolean r0 = X.C18300x5.A1S(r2)
            if (r0 != 0) goto L_0x0a34
            X.5Y8 r3 = r1.A09
            r2 = 0
            X.582 r1 = X.AnonymousClass582.VIEW
            r0 = 0
            r3.A03(r4, r2, r1, r0)
            return
        L_0x0a34:
            android.app.Activity r3 = X.C111095hX.A02(r4)
            X.C162457s7.A0K(r3, r5)
            X.4ea r3 = (X.C89654ea) r3
            X.59N r0 = X.AnonymousClass59N.ADMIN_INVITE
            int r2 = r0.A00()
            X.5Um r1 = r1.A0D
            r0 = 0
            r1.A04(r3, r0, r6, r2)
            return
        L_0x0a4a:
            java.lang.String r0 = "streamdownload/unable to open playback"
        L_0x0a4c:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass54F.A07(android.view.View):void");
    }

    public final void A08() {
        Editable text;
        ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A00;
        if (contactPickerFragment.A3d) {
            contactPickerFragment.A1t((AnonymousClass3ZH) null);
        } else if (contactPickerFragment.A3V || contactPickerFragment.A3b) {
            Intent A07 = C18320x8.A07();
            Map map = contactPickerFragment.A3n;
            C86654Ky.A0x(A07, map.keySet());
            A07.putExtra("file_path", contactPickerFragment.A1K().getString("file_path"));
            A07.putExtra("all_contacts_count", contactPickerFragment.A31.size());
            if (contactPickerFragment.A3V) {
                contactPickerFragment.A2U.A00(false, map.size());
            }
            AnonymousClass2z0 A03 = C107395bF.A03(contactPickerFragment.A1K(), "");
            if (A03 != null) {
                C107395bF.A00(A07, A03);
            }
            AnonymousClass5PD r0 = contactPickerFragment.A1D;
            if (r0 != null) {
                A07.putExtra("include_captions", C86604Kt.A1Z(r0.A0J));
                AnonymousClass5PD r4 = contactPickerFragment.A1D;
                String str = null;
                if (r4.A0L && !C86604Kt.A1Z(r4.A0J) && (text = r4.A07.getText()) != null) {
                    str = C107635bd.A0B(text.toString(), false);
                }
                A07.putExtra("appended_message", str);
            } else if ((contactPickerFragment.A26 instanceof C95804uY) && contactPickerFragment.A1x.A0X(6442)) {
                A07.putExtra("include_captions", true);
            }
            contactPickerFragment.A2M.A01(A07, contactPickerFragment.A1o);
            contactPickerFragment.A19.A03(A07);
            C111355hx.A01(contactPickerFragment);
        }
    }

    public final void A09(String str) {
        C92604mx r4 = (C92604mx) this.A00;
        C45742aV r8 = r4.A02;
        Intent putExtra = AnonymousClass0x9.A09("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.EMAIL", new String[]{str}).putExtra("android.intent.extra.SUBJECT", r4.getContext().getString(R.string.f11nameremoved));
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(AnonymousClass002.A0F(r4.getContext(), "https://www.whatsapp.com/download/", new Object[1], 0, R.string.f11nameremoved));
        r8.A00(r4.getContext(), putExtra.putExtra("android.intent.extra.TEXT", AnonymousClass000.A0X("\n\n", A0o)), (AnonymousClass4FU) null, r4.getContext().getString(R.string.f11nameremoved), true);
    }
}
