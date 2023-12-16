package X;

import android.os.SystemClock;
import android.widget.CompoundButton;
import com.whatsapp.conversationslist.LeaveGroupsDialogFragment;
import java.util.List;

/* renamed from: X.5sJ  reason: invalid class name and case insensitive filesystem */
public class C117675sJ implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public final int A05;

    public C117675sJ(Object obj, Object obj2, Object obj3, String str, int i, int i2) {
        this.A05 = i2;
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A04 = str;
        this.A03 = obj3;
    }

    public final void run() {
        switch (this.A05) {
            case 0:
                C103755Oh r3 = (C103755Oh) this.A01;
                C89654ea r5 = (C89654ea) this.A02;
                AnonymousClass3ZH r7 = (AnonymousClass3ZH) this.A03;
                String str = this.A04;
                int i = this.A00;
                r3.A04.A01(r5, new C112915ka(r5, r3, i), r7, r7, str, (List) null, C56952sp.A0J(r3.A06, 6187));
                return;
            case 1:
                int i2 = this.A00;
                AnonymousClass4CV r4 = (AnonymousClass4CV) this.A01;
                C51242jV r32 = (C51242jV) this.A02;
                String str2 = this.A04;
                C18260x0.A0V(r4, r32, str2);
                C617031x.A01(new AnonymousClass402((AnonymousClass0PJ) this.A03, r4, r32, str2), i2);
                return;
            case 2:
                LeaveGroupsDialogFragment leaveGroupsDialogFragment = (LeaveGroupsDialogFragment) this.A01;
                int i3 = this.A00;
                CompoundButton compoundButton = (CompoundButton) this.A02;
                C27991fJ r10 = (C27991fJ) this.A03;
                String str3 = this.A04;
                if (i3 == 1) {
                    SystemClock.sleep(300);
                }
                if (compoundButton == null || !compoundButton.isChecked()) {
                    leaveGroupsDialogFragment.A0D.A09(new AnonymousClass4u7(leaveGroupsDialogFragment, leaveGroupsDialogFragment.A08, leaveGroupsDialogFragment.A0C, r10, r10, i3));
                    return;
                }
                AnonymousClass3ZH A0A = leaveGroupsDialogFragment.A02.A0A(r10);
                AnonymousClass30W r42 = leaveGroupsDialogFragment.A04;
                C112905kZ r2 = new C112905kZ(leaveGroupsDialogFragment.A00, i3);
                r42.A04(A0A, str3, (List) null);
                r42.A03(r2, A0A, true, false);
                return;
            case 3:
                int i4 = this.A00;
                ((C160827oN) this.A01).A0B((C160627o1) this.A02, (C54832pM) this.A03, this.A04, i4);
                return;
            default:
                C103595Np r72 = (C103595Np) this.A01;
                int i5 = this.A00;
                AnonymousClass4GQ r52 = (AnonymousClass4GQ) this.A02;
                AnonymousClass4GQ r43 = (AnonymousClass4GQ) this.A03;
                String A002 = r72.A00(i5);
                StringBuilder A0o = AnonymousClass001.A0o();
                if (A002 != null) {
                    C86604Kt.A1U("MLModelManager/fetchModel/found ml model file in cache for ", "wa_bwe_pl_classifier_mobile", A0o);
                    C18260x0.A1G(A0o, i5);
                    r52.invoke(A002);
                    return;
                }
                C86604Kt.A1U("MLModelManager/fetchModel/start to fetch ml model file for ", "wa_bwe_pl_classifier_mobile", A0o);
                C18260x0.A1G(A0o, i5);
                AnonymousClass5GY r33 = r72.A02;
                AnonymousClass63V r22 = new AnonymousClass63V(r72, r52, r43, i5);
                StringBuilder A0o2 = AnonymousClass001.A0o();
                C86604Kt.A1U("MLModelMetadataGraphqlFetcher/fetch/start to fetch ml model metadata for ", "wa_bwe_pl_classifier_mobile", A0o2);
                C18260x0.A1G(A0o2, i5);
                C64333Db r1 = r33.A00.A00.A01;
                AnonymousClass1VX A4B = C64333Db.A4B(r1);
                C56492s4 A07 = C64333Db.A07(r1);
                AnonymousClass33p A2s = C64333Db.A2s(r1);
                C183538qC A003 = C72343dZ.A00(r1.AaW);
                C107695bk r0 = r1.A00;
                new C95574tu(A07, A2s, A4B, A003, r0.A78, r0.A77, i5).Bh4(new C114475n6(r22, i5));
                return;
        }
    }

    public C117675sJ(C103595Np r2, AnonymousClass4GQ r3, AnonymousClass4GQ r4, int i) {
        this.A05 = 4;
        this.A01 = r2;
        this.A04 = "wa_bwe_pl_classifier_mobile";
        this.A00 = i;
        this.A02 = r3;
        this.A03 = r4;
    }
}
