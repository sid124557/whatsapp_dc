package androidx.core.app;

import X.AnonymousClass001;
import X.AnonymousClass0XH;
import X.C04440Of;
import X.C04730Qk;
import X.C05440Ti;
import X.C15770ru;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import java.util.List;

public class NotificationCompat$MessagingStyle extends C04730Qk {
    public C04440Of A00;
    public Boolean A01;
    public CharSequence A02;
    public final List A03 = AnonymousClass001.A0s();
    public final List A04 = AnonymousClass001.A0s();

    public String A04() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d0, code lost:
        if (r3 != null) goto L_0x00d2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0105  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(X.C14880qQ r9) {
        /*
            r8 = this;
            X.0Ue r0 = r8.A00
            r2 = 0
            if (r0 == 0) goto L_0x0055
            android.content.Context r0 = r0.A0B
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r1 = r0.targetSdkVersion
            r0 = 28
            if (r1 >= r0) goto L_0x0055
            java.lang.Boolean r0 = r8.A01
            if (r0 != 0) goto L_0x0055
            java.lang.CharSequence r0 = r8.A02
            if (r0 == 0) goto L_0x001a
            r2 = 1
        L_0x001a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r8.A01 = r0
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r4 < r0) goto L_0x009e
            r3 = 28
            X.0Of r0 = r8.A00
            if (r4 < r3) goto L_0x004e
            android.app.Person r0 = r0.A00()
            android.app.Notification$MessagingStyle r2 = X.AnonymousClass0RH.A00(r0)
        L_0x0034:
            java.util.List r0 = r8.A04
            java.util.Iterator r1 = r0.iterator()
        L_0x003a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x005e
            java.lang.Object r0 = r1.next()
            X.0Ti r0 = (X.C05440Ti) r0
            android.app.Notification$MessagingStyle$Message r0 = r0.A01()
            X.C05760Uu.A01(r0, r2)
            goto L_0x003a
        L_0x004e:
            java.lang.CharSequence r0 = r0.A01
            android.app.Notification$MessagingStyle r2 = X.C05760Uu.A00(r0)
            goto L_0x0034
        L_0x0055:
            java.lang.Boolean r0 = r8.A01
            if (r0 == 0) goto L_0x001a
            boolean r2 = r0.booleanValue()
            goto L_0x001a
        L_0x005e:
            r0 = 26
            if (r4 < r0) goto L_0x007c
            java.util.List r0 = r8.A03
            java.util.Iterator r1 = r0.iterator()
        L_0x0068:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x007c
            java.lang.Object r0 = r1.next()
            X.0Ti r0 = (X.C05440Ti) r0
            android.app.Notification$MessagingStyle$Message r0 = r0.A01()
            X.AnonymousClass0HL.A00(r0, r2)
            goto L_0x0068
        L_0x007c:
            java.lang.Boolean r0 = r8.A01
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0086
            if (r4 < r3) goto L_0x0096
        L_0x0086:
            java.lang.CharSequence r0 = r8.A02
            X.C05760Uu.A02(r2, r0)
            if (r4 < r3) goto L_0x0096
            java.lang.Boolean r0 = r8.A01
            boolean r0 = r0.booleanValue()
            X.AnonymousClass0RH.A01(r2, r0)
        L_0x0096:
            X.0cw r9 = (X.C07860cw) r9
            android.app.Notification$Builder r0 = r9.A02
            X.AnonymousClass0WT.A03(r0, r2)
            return
        L_0x009e:
            java.util.List r4 = r8.A04
            int r1 = r4.size()
        L_0x00a4:
            int r1 = r1 + -1
            if (r1 < 0) goto L_0x0143
            java.lang.Object r3 = r4.get(r1)
            X.0Ti r3 = (X.C05440Ti) r3
            X.0Of r0 = r3.A04
            if (r0 == 0) goto L_0x00a4
            X.0Of r0 = r3.A04
            java.lang.CharSequence r0 = r0.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00a4
        L_0x00bc:
            java.lang.CharSequence r2 = r8.A02
            if (r2 == 0) goto L_0x012d
            java.lang.Boolean r0 = r8.A01
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x012d
            r0 = r9
            X.0cw r0 = (X.C07860cw) r0
            android.app.Notification$Builder r1 = r0.A02
            r1.setContentTitle(r2)
            if (r3 == 0) goto L_0x00dd
        L_0x00d2:
            java.lang.CharSequence r0 = r8.A02
            if (r0 == 0) goto L_0x012a
            java.lang.CharSequence r0 = r8.A07(r3)
        L_0x00da:
            r1.setContentText(r0)
        L_0x00dd:
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            r5.<init>()
            java.lang.CharSequence r0 = r8.A02
            r7 = 0
            r6 = 1
            if (r0 != 0) goto L_0x00fe
            int r2 = X.AnonymousClass002.A04(r4, r6)
        L_0x00ec:
            if (r2 < 0) goto L_0x0128
            java.lang.Object r1 = r4.get(r2)
            X.0Ti r1 = (X.C05440Ti) r1
            X.0Of r0 = r1.A04
            if (r0 == 0) goto L_0x0125
            X.0Of r0 = r1.A04
            java.lang.CharSequence r0 = r0.A01
            if (r0 != 0) goto L_0x0125
        L_0x00fe:
            r3 = 1
        L_0x00ff:
            int r2 = X.AnonymousClass002.A04(r4, r6)
        L_0x0103:
            if (r2 < 0) goto L_0x0158
            java.lang.Object r0 = r4.get(r2)
            X.0Ti r0 = (X.C05440Ti) r0
            if (r3 == 0) goto L_0x0122
            java.lang.CharSequence r1 = r8.A07(r0)
        L_0x0111:
            int r0 = X.AnonymousClass002.A04(r4, r6)
            if (r2 == r0) goto L_0x011c
            java.lang.String r0 = "\n"
            r5.insert(r7, r0)
        L_0x011c:
            r5.insert(r7, r1)
            int r2 = r2 + -1
            goto L_0x0103
        L_0x0122:
            java.lang.CharSequence r1 = r0.A05
            goto L_0x0111
        L_0x0125:
            int r2 = r2 + -1
            goto L_0x00ec
        L_0x0128:
            r3 = 0
            goto L_0x00ff
        L_0x012a:
            java.lang.CharSequence r0 = r3.A05
            goto L_0x00da
        L_0x012d:
            if (r3 == 0) goto L_0x00dd
            r0 = r9
            X.0cw r0 = (X.C07860cw) r0
            android.app.Notification$Builder r1 = r0.A02
            java.lang.String r0 = ""
            r1.setContentTitle(r0)
            X.0Of r0 = r3.A04
            if (r0 == 0) goto L_0x00d2
            java.lang.CharSequence r0 = r0.A01
            r1.setContentTitle(r0)
            goto L_0x00d2
        L_0x0143:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0155
            int r0 = X.AnonymousClass002.A03(r4)
            java.lang.Object r3 = r4.get(r0)
            X.0Ti r3 = (X.C05440Ti) r3
            goto L_0x00bc
        L_0x0155:
            r3 = 0
            goto L_0x00bc
        L_0x0158:
            X.0cw r9 = (X.C07860cw) r9
            android.app.Notification$Builder r0 = r9.A02
            android.app.Notification$BigTextStyle r1 = X.AnonymousClass0WT.A01(r0)
            r0 = 0
            android.app.Notification$BigTextStyle r0 = X.AnonymousClass0WT.A00(r1, r0)
            X.AnonymousClass0WT.A02(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.NotificationCompat$MessagingStyle.A06(X.0qQ):void");
    }

    public void A08(C05440Ti r4) {
        List list = this.A04;
        list.add(r4);
        if (list.size() > 25) {
            list.remove(0);
        }
    }

    public NotificationCompat$MessagingStyle(C04440Of r2) {
        if (!TextUtils.isEmpty(r2.A01)) {
            this.A00 = r2;
            return;
        }
        throw AnonymousClass001.A0c("User's name must not be empty.");
    }

    public void A05(Bundle bundle) {
        super.A05(bundle);
        C04440Of r2 = this.A00;
        bundle.putCharSequence("android.selfDisplayName", r2.A01);
        bundle.putBundle("android.messagingStyleUser", r2.A01());
        bundle.putCharSequence("android.hiddenConversationTitle", this.A02);
        CharSequence charSequence = this.A02;
        if (charSequence != null && this.A01.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", charSequence);
        }
        List list = this.A04;
        if (!list.isEmpty()) {
            bundle.putParcelableArray("android.messages", C05440Ti.A00(list));
        }
        List list2 = this.A03;
        if (!list2.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", C05440Ti.A00(list2));
        }
        Boolean bool = this.A01;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    public final CharSequence A07(C05440Ti r14) {
        CharSequence charSequence;
        AnonymousClass0XH A022 = AnonymousClass0XH.A02();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        C04440Of r0 = r14.A04;
        CharSequence charSequence2 = "";
        if (r0 == null) {
            charSequence = charSequence2;
        } else {
            charSequence = r0.A01;
        }
        int i = -16777216;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = this.A00.A01;
            int i2 = this.A00.A00;
            if (i2 != 0) {
                i = i2;
            }
        }
        C15770ru r2 = A022.A00;
        CharSequence A032 = A022.A03(r2, charSequence);
        spannableStringBuilder.append(A032);
        spannableStringBuilder.setSpan(new TextAppearanceSpan((String) null, 0, 0, ColorStateList.valueOf(i), (ColorStateList) null), spannableStringBuilder.length() - A032.length(), spannableStringBuilder.length(), 33);
        CharSequence charSequence3 = r14.A05;
        if (charSequence3 != null) {
            charSequence2 = charSequence3;
        }
        spannableStringBuilder.append("  ").append(A022.A03(r2, charSequence2));
        return spannableStringBuilder;
    }

    public NotificationCompat$MessagingStyle() {
    }
}
