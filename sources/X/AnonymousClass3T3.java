package X;

import android.util.Pair;
import com.whatsapp.privacy.usernotice.UserNoticeStageUpdateWorker;
import com.whatsapp.util.Log;
import java.util.TreeMap;

/* renamed from: X.3T3  reason: invalid class name */
public class AnonymousClass3T3 implements AnonymousClass4EZ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ AnonymousClass0Pc A03;
    public final /* synthetic */ UserNoticeStageUpdateWorker A04;

    public AnonymousClass3T3(AnonymousClass0Pc r1, UserNoticeStageUpdateWorker userNoticeStageUpdateWorker, int i, int i2, int i3) {
        this.A04 = userNoticeStageUpdateWorker;
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A03 = r1;
    }

    public void BQs(String str) {
        Object r0;
        Log.e("UserNoticeStageUpdateWorker/onDeliveryFailure");
        int i = this.A04.A01.A00;
        AnonymousClass0Pc r1 = this.A03;
        if (i > 4) {
            r0 = new C01400Ao();
        } else {
            r0 = new C01390An();
        }
        r1.A01(r0);
    }

    public void BdM(AnonymousClass36K r11, String str) {
        Log.i("UserNoticeStageUpdateWorker/success");
        AnonymousClass36K A0l = r11.A0l("notice");
        if (A0l != null) {
            AnonymousClass33X r2 = this.A04.A02;
            int i = this.A00;
            int i2 = this.A02;
            C18260x0.A0y("UserNoticeManager/handleStaleClientStage/notice id: ", AnonymousClass001.A0o(), i);
            r2.A05.A04(new C622234e(i, AnonymousClass36K.A02(A0l, "stage"), i2, AnonymousClass36K.A03(A0l), 0));
        }
        if (this.A01 == 5) {
            AnonymousClass33X r5 = this.A04.A02;
            int i3 = this.A00;
            C18260x0.A0y("UserNoticeManager/handleCleanup/notice id: ", AnonymousClass001.A0o(), i3);
            C18260x0.A0y("UserNoticeManager/deleteUserNotice/notice id: ", AnonymousClass001.A0o(), i3);
            r5.A04.A04(i3);
            C55772qt r3 = r5.A05;
            TreeMap treeMap = r3.A02;
            AnonymousClass0x7.A1K(treeMap, i3);
            C622234e A022 = r3.A02();
            if (A022 != null && A022.A01 == i3) {
                C18270x1.A0g(C55772qt.A00(r3), "current_user_notice_banner_dismiss_timestamp");
            }
            r3.A05(AnonymousClass002.A0J(treeMap.values()));
            r5.A06();
        }
        this.A03.A01(new C01410Ap());
    }

    public void BSN(AnonymousClass36K r4, String str) {
        Object r0;
        Pair A022 = C57492tj.A02(r4);
        C18260x0.A1Q(AnonymousClass001.A0o(), "UserNoticeStageUpdateWorker/onError ", A022);
        if (A022 != null && C18280x3.A03(A022) == 400) {
            this.A04.A01.A02(AnonymousClass001.A0f());
        }
        int i = this.A04.A01.A00;
        AnonymousClass0Pc r1 = this.A03;
        if (i > 4) {
            r0 = new C01400Ao();
        } else {
            r0 = new C01390An();
        }
        r1.A01(r0);
    }
}
