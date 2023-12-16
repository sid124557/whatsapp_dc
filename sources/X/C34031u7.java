package X;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.group.GroupChatInfoActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1u7  reason: invalid class name and case insensitive filesystem */
public class C34031u7 extends AnonymousClass5ZM {
    public final C69263Wi A00;
    public final C56972sr A01;
    public final C56612sH A02;
    public final C28891hw A03;
    public final AnonymousClass3ZH A04;
    public final C66503Lr A05;
    public final String A06;
    public final WeakReference A07;

    public static void A00(C69263Wi r16, C56972sr r17, C56612sH r18, C28891hw r19, AnonymousClass3ZH r20, C66503Lr r21, AnonymousClass4AR r22, String str) {
        String A022;
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            A022 = null;
        } else {
            A022 = AnonymousClass35J.A02(r17, r18);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AnonymousClass3ZH r13 = r20;
        AnonymousClass2RI r10 = new AnonymousClass2RI(r16, r19, r13, r22, str2);
        Jid A052 = AnonymousClass3ZH.A05(r13, C27991fJ.class);
        String str3 = r13.A0K.A04;
        C66503Lr r4 = r21;
        AnonymousClass31C r11 = r4.A06;
        String A032 = r11.A03();
        ArrayList A0s = AnonymousClass001.A0s();
        if (!TextUtils.isEmpty(str3)) {
            AnonymousClass39V.A03("prev", str3, A0s);
        }
        if (!TextUtils.isEmpty(A022)) {
            AnonymousClass39V.A03(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A022, A0s);
        }
        AnonymousClass36K r2 = null;
        if (TextUtils.isEmpty(str2)) {
            AnonymousClass39V.A03("delete", "true", A0s);
        } else {
            r2 = new AnonymousClass36K("body", str2, (AnonymousClass39V[]) null);
        }
        AnonymousClass36K A0F = AnonymousClass36K.A0F(r2, "description", (AnonymousClass39V[]) A0s.toArray(C66503Lr.A0H));
        AnonymousClass39V[] A1W = AnonymousClass0x9.A1W();
        AnonymousClass39V.A04(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A032, A1W);
        AnonymousClass39V.A05("xmlns", "w:g2", A1W);
        AnonymousClass39V.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", A1W);
        AnonymousClass36K A0C = AnonymousClass36K.A0C(A052, A0F, A1W);
        C130066bK r3 = new C130066bK();
        r11.A0D(new AnonymousClass4KX(r3, r4, r10, 5), A0C, A032, 134, 32000);
        try {
            r3.get(32000, TimeUnit.MILLISECONDS);
            long A0E = AnonymousClass0x7.A0E(elapsedRealtime);
            if (A0E < 500) {
                SystemClock.sleep(500 - A0E);
            }
        } catch (Exception e) {
            Log.w("groupinfo/setgroupdescription/timeout", e);
            r10.A00.A0S(new C117205rY(r10.A03, r10.A04, 0, 2));
        }
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        String str = this.A06;
        AnonymousClass3ZH r4 = this.A04;
        C57122t8 r6 = new C57122t8(this, 1);
        C56612sH r2 = this.A02;
        A00(this.A00, this.A01, r2, this.A03, r4, this.A05, r6, str);
        return null;
    }

    public void A0A() {
        GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A07.get();
        if (groupChatInfoActivity != null) {
            groupChatInfoActivity.A01.setVisibility(0);
            groupChatInfoActivity.A1z.setVisibility(8);
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A07.get();
        if (groupChatInfoActivity != null) {
            groupChatInfoActivity.A01.setVisibility(8);
            groupChatInfoActivity.A1z.setVisibility(0);
        }
    }

    public C34031u7(C69263Wi r2, C56972sr r3, C56612sH r4, C28891hw r5, AnonymousClass3ZH r6, GroupChatInfoActivity groupChatInfoActivity, C66503Lr r8, String str) {
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = r3;
        this.A05 = r8;
        this.A03 = r5;
        this.A04 = r6;
        this.A06 = str;
        this.A07 = AnonymousClass0x9.A14(groupChatInfoActivity);
    }
}
