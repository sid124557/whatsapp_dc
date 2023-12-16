package X;

import com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.phoenix.PhoenixExtensionFlowManagerWithCoroutines;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4Jt  reason: invalid class name and case insensitive filesystem */
public class C86344Jt implements AnonymousClass4CM, C85254Fn {
    public Object A00;
    public Object A01;
    public final int A02;

    public C86344Jt(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A01 = obj;
        this.A00 = obj2;
    }

    public void BU1() {
        C60032xt r2;
        String str;
        C54052o6 r0;
        String str2;
        UserJid userJid;
        String str3;
        String str4;
        String str5;
        String str6;
        C66543Lv r4;
        C56422rx r3;
        C50312hy r5;
        int i = this.A02;
        Object obj = this.A01;
        if (i != 0) {
            PhoenixExtensionFlowManagerWithCoroutines phoenixExtensionFlowManagerWithCoroutines = (PhoenixExtensionFlowManagerWithCoroutines) obj;
            r2 = phoenixExtensionFlowManagerWithCoroutines.A08;
            str = "galaxy_message";
            r0 = (C54052o6) this.A00;
            str2 = r0.A05;
            userJid = r0.A02;
            str3 = r0.A08;
            str4 = r0.A09;
            str5 = "extensions-invalid-business-profile";
            str6 = "Invalid Business Profile";
            r4 = phoenixExtensionFlowManagerWithCoroutines.A0F;
            r3 = phoenixExtensionFlowManagerWithCoroutines.A06;
            r5 = phoenixExtensionFlowManagerWithCoroutines.A0G;
        } else {
            C613530j r1 = (C613530j) obj;
            r2 = r1.A09;
            str = "galaxy_message";
            r0 = (C54052o6) this.A00;
            str2 = r0.A05;
            userJid = r0.A02;
            str3 = r0.A08;
            str4 = r0.A09;
            str5 = "extensions-invalid-business-profile";
            str6 = "Invalid Business Profile";
            r4 = r1.A0G;
            r3 = r1.A07;
            r5 = r1.A0H;
        }
        r2.A02(r3, r4, r5, userJid, Boolean.valueOf(r0.A0C), str, str2, str3, str4, str5, str6);
    }

    public void BU3(C108985dt r15) {
        C60032xt r2;
        String str;
        C54052o6 r1;
        String str2;
        UserJid userJid;
        String str3;
        String str4;
        String str5;
        String str6;
        C66543Lv r4;
        C56422rx r3;
        C50312hy r5;
        int i = this.A02;
        C162457s7.A0J(r15, 0);
        boolean z = r15.A0Z;
        if (i != 0) {
            if (!z) {
                PhoenixExtensionFlowManagerWithCoroutines phoenixExtensionFlowManagerWithCoroutines = (PhoenixExtensionFlowManagerWithCoroutines) this.A01;
                r2 = phoenixExtensionFlowManagerWithCoroutines.A08;
                str = "galaxy_message";
                r1 = (C54052o6) this.A00;
                str2 = r1.A05;
                userJid = r1.A02;
                str3 = r1.A08;
                str4 = r1.A09;
                str5 = "extensions-invalid-business-profile";
                str6 = "Invalid Business Profile";
                r4 = phoenixExtensionFlowManagerWithCoroutines.A0F;
                r3 = phoenixExtensionFlowManagerWithCoroutines.A06;
                r5 = phoenixExtensionFlowManagerWithCoroutines.A0G;
            } else {
                return;
            }
        } else if (!z) {
            C613530j r0 = (C613530j) this.A01;
            r2 = r0.A09;
            str = "galaxy_message";
            r1 = (C54052o6) this.A00;
            str2 = r1.A05;
            userJid = r1.A02;
            str3 = r1.A08;
            str4 = r1.A09;
            str5 = "extensions-invalid-business-profile";
            str6 = "Invalid Business Profile";
            r4 = r0.A0G;
            r3 = r0.A07;
            r5 = r0.A0H;
        } else {
            return;
        }
        r2.A02(r3, r4, r5, userJid, Boolean.valueOf(r1.A0C), str, str2, str3, str4, str5, str6);
    }

    public void BU2() {
    }
}
